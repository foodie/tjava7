package com.beck.coin;

/**
 * @Author: bikang@staff.weibo.com
 * @Description:
 * @Date: Created in 下午1:59 2018/5/2
 * @Modified By:
 */
public class SwitcherAndException {


    public static void main(String agrs[]){
        tswitch();
    }

    public static void tswitch(){
        String ret = "girl";
        switch (ret){
            case "girl":
                System.out.println("g");
                break;
            default:
                System.out.println("b");
                break;
        }
    }
}

