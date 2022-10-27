package com.nanci.loop;

public class ForDemo1 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello World");//Hello World//Hello World//Hello World
            // 循环一开始，执行int i = 0 一次。
// 然后判断循环条件：0 < 3 返回true ,进入到循环体中执行输出 ：helloWorld ，然后执行迭代语句i++ , 此时i=1了。
//然后判断循环条件：1 < 3 返回true ,进入到循环体中执行输出 ：helloWorld ，然后执行迭代语句i++ , 此时i=2了。
// 然后判断循环条件：2 < 3 返回true ,进入到循环体中执行输出 ：helloWorld， 然后执行迭代语句i++ , 此时i=3了。
//然后判断循环条件：3 < 3 返回false, 循环立即结束！
        }
        for (int i = 0; i <= 5; i += 2) {
            System.out.println("Hello World");//三次
        }
    }
}

