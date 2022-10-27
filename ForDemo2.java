package com.nanci.loop;

public class ForDemo2 {
    public static void main(String[] args) {
        //需求：在控制台输出1-5
        int sum = 0;
        for (int i = 0; i <= 5; i++) {
            sum += i;//等价sum=sum+i
        }
        System.out.println("一到五的和是："+sum);
    }
}