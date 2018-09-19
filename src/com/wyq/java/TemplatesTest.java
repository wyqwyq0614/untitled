package com.wyq.java;

import java.util.ArrayList;

/**
 * @author R.wyq
 * @date 2018/9/19 - 14:33
 */
public class TemplatesTest {
    //prsf
    //private static final

    //psf
    public static final int NUM = 1;
    //psfi
    public static final int NUM1 = 2;
    //psfs
    public static final String name = "wyq";

    public static void main(String[] args) {
        System.out.println("helloworld");
        //soutp
        System.out.println("args = [" + args + "]");
        //soutm
        System.out.println("TemplatesTest.main");
        //soutv
        int num1 = 10;
        System.out.println("num1 = " + num1);
        //xxx.sout
        System.out.println(num1);


        //fori
        String[] arr = new String[]{"Tom", "Jerry", "HanMeimei", "LiLe" };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //iter
        for (String s : arr) {
            System.out.println(s);
        }
        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }


        //list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(124);
        list.add(125);
        for (Object o : list) {

        }

        //list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }
        
        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }

    }

    public void method() {
        System.out.println("TemplatesTest.method");
        //list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(124);
        list.add(125);

        //ifn
        if (list == null) {

        }

        //inn
        if (list != null) {

        }

        //xxx.nn xxx.null
        if (list != null) {

        }
        if (list == null) {
        }
    }
}


