package com.vote.util;

import java.util.Random;

/**
 * Created by MonkeyHu on 2017/8/6.
 */

/**
 * 获取随机数
 */
public class FlowUtil {

    private static int sn = 1008601;
    private static int id;



    /**
     * 测试
     * @param args
     */
    public static void main(String[] args){
        int number = getRandomNumber();
        System.out.println(number);
    }

    /**
     * 获得1`1000的随机数
     * @return
     */
    public static int getRandomNumber(){
        Random random = new Random();
        int numberRandom = (int) (random.nextDouble()*1000);
        return numberRandom;
    }

    public static int getId(){
        int number = getRandomNumber();

        if (number>100){
            //test
            id=10003;
        }else {
            if (number>995){
                id=10004;
            }else {
                if (number>985){
                    id=10005;
                }else{
                    if (number>970){
                        id=10006;
                    }else{
                        if(number > 500){
                            id = 10010;
                        }else{
                            id = 10009;
                        }
                    }
                }
            }
        }
        return id;
    }

}
