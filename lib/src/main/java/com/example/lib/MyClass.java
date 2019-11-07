package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args)
    {
        double h1,m1,s1,t1
                ,h2,m2,s2,t2
                , time;
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.println("請輸入第一組時間\n");
            System.out.println("請輸入小時:");
            h1 = scanner.nextDouble();
            System.out.println("請輸入分鐘:");
            m1 = scanner.nextDouble();
            System.out.println("請輸入秒:");
            s1 = scanner.nextDouble();
            t1 = 3600 * h1 + 60 * m1 + s1;

            System.out.println("請輸入第二組時間\n");
            System.out.println("請輸入小時:");
            h2 = scanner.nextDouble();
            System.out.println("請輸入分鐘:");
            m2 = scanner.nextDouble();
            System.out.println("請輸入秒:");
            s2 = scanner.nextDouble();
            t2 = 3600 * h2 + 60 * m2 + s2;


            time = Math.abs(t1 - t2);

            System.out.println("以下是2組時間的時間差\n" + time+"\n");
        }
    }
}
