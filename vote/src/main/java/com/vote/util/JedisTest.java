package com.vote.util;

/**
 * Created by MonkeyHu on 2017/7/23.
 */
public class JedisTest {


    public static void main(String[] args){
//        Jedis jedis = new Jedis("182.61.35.109");
//        jedis.set("123456","123");
//        System.out.println(jedis.get("123456"));

//        boolean str = MyJedisPool.set("123","123456789");
//        String str2 = MyJedisPool.get("123");

//list测试
//        List<String> list = new ArrayList<String>();
//        list.add("hupengfei" );
//        list.add("胡鹏飞");
//        MyJedisPool.setList("list",list);
//
//        List<String> str2 = MyJedisPool.getList("list");
//        System.out.println(str2);
        //map测试
//        Map<String,String> map = new HashMap<String,String>();
//        map.put("name","胡鹏飞");
//        map.put("sex","男");
//        map.put("age","22");
//        map.put("height","171");
//        map.put("phone","123456789456");
//
//        MyJedisPool.setMap("hupengfei",map);
//
//
//        Map<String,String> map2 = new HashMap<String,String>();
//        map2=MyJedisPool.getMap("hupengfei");
//        System.out.println(map2);

        //清空redis所有数据
//        MyJedisPool.flushdbDaily();

//        MyJedisPool.set("1","1");
//        MyJedisPool.set("2","2");
//        MyJedisPool.set("3","3");
//        MyJedisPool.set("4","4");
//        System.out.println(MyJedisPool.get("3"));
//        List<String> list = new ArrayList<String>();
//        list.add("3");
//        list.add("4");
//        MyJedisPool.deleteKeys(list);


//        System.out.println(MyJedisPool.get("3"));
//        System.out.println(MyJedisPool.getList("3"));
//        System.out.println(MyJedisPool.getMap("3"));
//        System.out.println(MyJedisPool.getSet("3"));


    }

    public void getStringByKey(){
        boolean bool = false;
        String str = null;

//        bool = MyJedisPool.set("123456","123456");
        if (bool){
            str = MyJedisPool.get("123456");
        }

        System.out.println(str);
    }


}
