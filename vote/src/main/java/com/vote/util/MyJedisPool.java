package com.vote.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.*;

/**
 * Created by MonkeyHu on 2017/7/24.
 */
public class MyJedisPool {

    private static JedisPool pool = null ;
    private static String addr = "182.61.35.109";
    private static int port = 6379 ;
    private static String auth = "123456";

    /**
     * 构建redis连接池
     * @return JedisPool
     */
    public static JedisPool getPool(){
        if (pool == null){
            JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
            //连接耗尽时是否阻塞，false报异常，true阻塞直到超时，默认true
            jedisPoolConfig.setBlockWhenExhausted(true);
            //控制一个pool可分配多少个jedis实例，通过pool.getResource()来获取；
            //如果赋值为-1，则表示不限制；如果pool已经分配了maxActive个Jedis实例，则此时pool的状态为exhausted（耗尽）
            jedisPoolConfig.setMaxTotal(500);

            //控制一个pool最多有多少个状态为idle（空闲的）的jedis实例
            jedisPoolConfig.setMaxIdle(5);

            //表示当borrow（引入）一个jedis实例时，最大的等待时间，如果超过等待时间，则直接抛出JedisConnectionException；
            jedisPoolConfig.setMaxWaitMillis(1000*10);

            //再borrow一个Jedis实例时，是否提前进行validate操作；如果为true，则得到的jedis实例均是可用的；
            jedisPoolConfig.setTestOnBorrow(true);
            pool = new JedisPool(jedisPoolConfig,addr,port);
        }
        return pool;
    }

    /**
     *      *

     * @param jedis
     */
    public static void returnResource(Jedis jedis){
        if (jedis != null){
            //返回连接池
            jedis.close();
        }
    }


    /**
     * 删除此数据库所有数据
     * @return
     */
    public static boolean flushdbDaily(){
        boolean bool = false;

        JedisPool pool = null;
        Jedis jedis = null;
        try{
            //从jedispool中获取jedis实例
            pool = getPool();
            jedis = pool.getResource();

            jedis.flushDB();
            bool = true;
        }catch (Exception e ){
            //有exception，也要将jedis返回给jedispool
            //释放redis对象
            pool.close();
            e.printStackTrace();
        }finally {
            //用完jedis返还到连接池
            returnResource(jedis);
        }

        return bool;
    }

    /**
     * 删除key
     * @param key
     * @return
     */
    public static boolean deleteKet(String key){
        boolean bool ;

        List<String> list = new ArrayList<String>();
        list.add(key);
        bool = deleteKeys(list);

        return bool;
    }


    /**
     * 批量删除key
     * @param list
     * @return
     */
    public static boolean deleteKeys(List<String> list){
        boolean bool = false;

        String[] keys = list.toArray(new String[list.size()]);
        JedisPool pool = null;
        Jedis jedis = null;
        try{
            //从jedispool中获取jedis实例
            pool = getPool();
            jedis = pool.getResource();

            jedis.del(keys);
            bool = true;
        }catch (Exception e ){
            //有exception，也要将jedis返回给jedispool
            //释放redis对象
            pool.close();
            e.printStackTrace();
        }finally {
            //用完jedis返还到连接池
            returnResource(jedis);
        }
        return bool;
    }

    /**
     * 获取数据(String)
     * @param key
     * @return
     */
    public static String get(String key){
        String value = null;

        JedisPool pool = null;
        Jedis jedis = null;
        try{
            //从jedispool中获取jedis实例
            pool = getPool();
            jedis = pool.getResource();

            value = jedis.get(key);
        }catch (Exception e ){
            //有exception，也要将jedis返回给jedispool
            //释放redis对象
            pool.close();
            e.printStackTrace();
        }finally {
            //用完jedis返还到连接池
            returnResource(jedis);
        }

        return value;
    }

    /**
     * 写入数据(String)
     * @param key
     * @param value
     * @return
     */
    public static boolean set(String key, String value){

        boolean bool = false;
        JedisPool pool = null;
        Jedis jedis = null;
        try{
            //从jedispool中获取jedis实例
            pool = getPool();
            jedis = pool.getResource();

            value = jedis.set(key,value);
            bool=true;
        }catch (Exception e ){
            //有exception，也要将jedis返回给jedispool
            //释放redis对象
            pool.close();
            e.printStackTrace();
        }finally {
            //用完jedis返还到连接池
            returnResource(jedis);
        }
        return bool;
    }





    /**
     * 获取数据(List<String>)
     * @param key
     * @return
     */
    public static List<String> getList(String key){
        List<String> value = null;

        JedisPool pool = null;
        Jedis jedis = null;
        try{
            //从jedispool中获取jedis实例
            pool = getPool();
            jedis = pool.getResource();

            value = jedis.lrange(key,0,-1);
        }catch (Exception e ){
            //有exception，也要将jedis返回给jedispool
            //释放redis对象
            pool.close();
            e.printStackTrace();
        }finally {
            //用完jedis返还到连接池
            returnResource(jedis);
        }

        return value;
    }

    /**
     * 写入数据(List<String>)
     * @param key
     * @param value
     * @return
     */
    public static boolean setList(String key,List<String> value){

        boolean bool = false;
        JedisPool pool = null;
        Jedis jedis = null;
        String[] strings = value.toArray(new String[value.size()]);
        try{
            //从jedispool中获取jedis实例
            pool = getPool();
            jedis = pool.getResource();

            jedis.lpush(key,strings);
            bool=true;
        }catch (Exception e ){
            //有exception，也要将jedis返回给jedispool
            //释放redis对象
            pool.close();
            e.printStackTrace();
        }finally {
            //用完jedis返还到连接池
            returnResource(jedis);
        }
        return bool;
    }
    public static boolean setList(String key,String value){
        boolean bool;
        List<String> list = new ArrayList<String>();
        list.add(value);
        bool = setList(key,list);
        return bool;
    }



    /**
     * 获取数据(Set<String>)
     * @param key
     * @return
     */
    public static Set<String> getSet(String key){
        Set<String> value = null;

        JedisPool pool = null;
        Jedis jedis = null;
        try{
            //从jedispool中获取jedis实例
            pool = getPool();
            jedis = pool.getResource();

            value = jedis.smembers(key);
        }catch (Exception e ){
            //有exception，也要将jedis返回给jedispool
            //释放redis对象
            pool.close();
            e.printStackTrace();
        }finally {
            //用完jedis返还到连接池
            returnResource(jedis);
        }

        return value;
    }

    /**
     * 写入数据(Set<String>)
     * @param key
     * @param value
     * @return
     */
    public static boolean setSet(String key,List<String> value){

        boolean bool = false;
        JedisPool pool = null;
        Jedis jedis = null;
        String[] strings = value.toArray(new String[value.size()]);
        try{
            //从jedispool中获取jedis实例
            pool = getPool();
            jedis = pool.getResource();

            jedis.sadd(key,strings);
            bool=true;
        }catch (Exception e ){
            //有exception，也要将jedis返回给jedispool
            //释放redis对象
            pool.close();
            e.printStackTrace();
        }finally {
            //用完jedis返还到连接池
            returnResource(jedis);
        }
        return bool;
    }

    public static boolean setSet(String key,Set<String> value){
        boolean bool ;
        List<String> list = new ArrayList<String>(value);
        bool = setSet(key,list);
        return bool;

    }
    public static boolean setSet(String key,String value){
        boolean bool ;
        List<String> list = new ArrayList<String>();
        list.add(value);
        bool = setSet(key,list);
        return bool;
    }


    /**
     * 获取数据(Map<String,String>)
     * @param key
     * @return
     */
    public static Map<String,String> getMap(String key){
        Map<String,String> value = new HashMap<String, String>();

        Set<String> keys;
        JedisPool pool = null;
        Jedis jedis = null;
        try{
            //从jedispool中获取jedis实例
            pool = getPool();
            jedis = pool.getResource();

            keys = jedis.hkeys(key);
            String[] strings1 = keys.toArray(new String[keys.size()]);
            List<String> values = jedis.hmget(key,strings1);
            String[] strings2 = values.toArray(new String[keys.size()]);
            for (int i =0 ;i< keys.size();i++){
                value.put(strings1[i],strings2[i]);
            }

        }catch (Exception e ){
            //有exception，也要将jedis返回给jedispool
            //释放redis对象
            pool.close();
            e.printStackTrace();
        }finally {
            //用完jedis返还到连接池
            returnResource(jedis);
        }
        return value;
    }

    /**
     * 写入数据(Map<String,String)
     * @param key
     * @param value
     * @return
     */
    public static boolean setMap(String key,Map<String,String> value){

        boolean bool = false;
        JedisPool pool = null;
        Jedis jedis = null;
        try{
            //从jedispool中获取jedis实例
            pool = getPool();
            jedis = pool.getResource();
            String flog = jedis.hmset(key,value);
            bool=true;
        }catch (Exception e ){
            //有exception，也要将jedis返回给jedispool
            //释放redis对象
            pool.close();
            e.printStackTrace();
        }finally {
            //用完jedis返还到连接池
            returnResource(jedis);
        }
        return bool;
    }

}
