package com.nanci.loop;

public class ForDemo4 {
    public static void main(String[] args) {
        //需求：在控制台输出所有的“水仙花数”
        int count=0;
        for (int i = 100; i <999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;
            if(ge*ge*ge+shi*shi*shi+bai*bai*bai == i){
                System.out.print(i+"\t");//153	370	371	407
                //print横行打印   \t加空格
                count++;
            }
        }
        System.out.println();//换行
        System.out.println("水仙花个数是： "+count);//水仙花个数是： 4
    }
}
