# Java Basic Syntax Flow Control
Java基础语法 流程控制语句
在一个程序执行的过程中，各条语句的执行顺序对程序的结果是有直接影响的。所以，我们必须清楚每条语句的执行流程。而且，很多时候要通过控制语句的执行顺序来实现我们想要的功能。

### 流程控制语句分类

​	顺序结构

​	分支结构(if, switch)

​	循环结构(for, while, do…while)

### 1.顺序结构

顺序结构是程序中最简单最基本的流程控制，没有特定的语法结构，按照代码的先后顺序，依次执行，程序中大多数的代码都是这样执行的。

## 2.分支结构

### 2. 1分支结构：if语句

#### if语句格式1

~~~java
格式：
if (关系表达式) {
    语句体;	
}
~~~

#### if语句格式2

~~~java
格式：
if (关系表达式) {
    语句体1;	
} else {
    语句体2;	
}
~~~

####  if语句格式3

~~~java
格式：
if (关系表达式1) {
    语句体1;	
} else if (关系表达式2) {
    语句体2;	
} 
…
else {
    语句体n+1;
}
~~~

~~~java
package com.itheima.branch;

public class ifDemo {
    public static void main(String[] args) {
      //学会if语句 if (条件表达式) {语句体;}
        //格式1心跳不正常，提醒检查
        int hearBeat = 30;
        if(hearBeat < 60 || hearBeat > 100){
            System.out.println("您的心跳是：" + hearBeat +",您可能需要进一步检查！ ");
        }
        System.out.println("检查结束");
        //格式2 if (条件表达式) {语句体1;} else {语句体2;}
        //发红包
        double money = 1;
        if(money >= 1314){
            System.out.println("您当前发送红包成功");}
            else {
            System.out.println("您当前发送红包失败");}
        //格式3
        //绩效系统
        int score =99;
            if(score >=0 &&score <60) {
                System.out.println("您本月绩效是：C");
            }else    if(score >=60 &&score <80) {
                System.out.println("您本月绩效是：B");
            }else    if(score >=80 &&score <90) {
                System.out.println("您本月绩效是：A");
            }else    if(score >=90 &&score <=100) {
                System.out.println("您本月绩效是：A+");
            } else{
                        System.out.println("您输入的数不对");
                }
            }
        }


~~~

### 2.2 分支结构：switch语句

##### switch语句结构

* 格式

  ```java
  switch (表达式) {
  	case 1:
  		语句体1;
  		break;
  	case 2:
  		语句体2;
  		break;
  	...
  	default:
  		语句体n+1;
  		break;
  }
  ```

* 执行流程：

  * 首先计算出表达式的值 

  * 其次，和case依次比较，一旦有对应的值，就会执行相应的语句，在执行的过程中，遇到break就会结 束。 

  * 最后，如果所有的case都和表达式的值不匹配，就会执行default语句体部分，然后程序结束掉。

    ```
    package com.itheima.branch;
    
    public class switchDemo2 {
        public static void main(String[] args) {
             // 周一：埋头苦干，解决bug     周五：今晚吃鸡
             // 周二：请求大牛程序员帮忙    周六：与王婆介绍的小芳相亲
             //周三：今晚啤酒、龙虾、小烧烤  周日：郁郁寡欢、准备上班。
             // 周四： 主动帮助新来的女程序解决bug
            String weekday = "周三";
            switch (weekday){
                case "周一":
                System.out.println("埋头苦干，解决bug");
                break;
                case "周二":
                    System.out.println("请求大牛程序员帮忙");
                    break;
                case "周三":
                    System.out.println("今晚啤酒、龙虾、小烧烤");
                    break;
                case "周四":
                    System.out.println(" 主动帮助新来的女程序解决bug");
                    break;
                case "周五":
                    System.out.println("今晚吃鸡");
                    break;
                case "周六":
                    System.out.println("与王婆介绍的小芳相亲");
                    break;
                case "周日":
                System.out.println("郁郁寡欢、准备上班");
                    break;
                default:
                    System.out.println("数据有误！");
    
            }
        }
    }
    ```

    if、switch分支各自适合做什么业务场景？

     ⚫ if其实在功能上远远强大于switch。 

    ⚫ if适合做区间匹配。

     ⚫ switch适合做：值匹配的分支选择、代码优雅。

    switch分支注意事项： 

    ① 表达式类型只能是byte、short、int、char，JDK5开始支持枚举，JDK7开始支持String、 不支持double、float、long。 

    ② case给出的值不允许重复，且只能是字面量，不能是变量。

     ③ 不要忘记写break，否则会出现穿透现象。

    ```
    package com.itheima.branch;
    
    public class switchDemo3 {
        //清楚switch注意点
        public static void main(String[] args) {
            double a = 0.1+0.2;
            System.out.println(a);//不支持，因为在java中计算不精确，不支持double、float、long。
    //0.30000000000000004
        }
    }
    
    ```

    switch穿透性案例(月份天数查看器)

```java
package com.itheima.branch;

public class switcDemo4 {
    public static void main(String[] args) {
        //  需求：用户输入月份可以展示该月份的天数。
        // 1、3 、5、 7 、 8、 10、 12月份是 31天
        //2月份是闰年为29天、非闰年为28天。
        // 4 、6 、9、 11月份 是30天
        int month = 7;
        
        switch(month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                System.out.println(month+"是31天");
                break;
                case 2:
                System.out.println(month+"闰年29天，非闰年28天");
                break;
                case 4:
                case 6:
                case 9:
                case 11:
                System.out.println(month+"是31天");
                break;
                
            
        }
    }
}

```

* 注意：如果switch中得case，没有对应break的话，则会出现case穿透的现象。

### 3 循环结构：for循环

#### 3.1 for循环结构（掌握） 

* for循环格式：

```java
for (初始化语句;条件判断语句;条件控制语句) {
	循环体语句;
}
```

* 格式解释：

  * 初始化语句：  用于表示循环开启时的起始状态，简单说就是循环开始的时候什么样
  * 条件判断语句：用于表示循环反复执行的条件，简单说就是判断循环是否能一直执行下去
  * 循环体语句：  用于表示循环反复执行的内容，简单说就是循环反复执行的事情
  * 条件控制语句：用于表示循环执行中每次变化的内容，简单说就是控制循环是否能执行下去

* 执行流程：

  ①执行初始化语句

  ②执行条件判断语句，看其结果是true还是false

  ​             如果是false，循环结束

  ​             如果是true，继续执行

  ③执行循环体语句

  ④执行条件控制语句

  ⑤回到②继续

  ```
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
  ```

  

#### 3.2 for循环练习-输出数据

* 需求：在控制台输出1-5
* 示例代码：

```java
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
```

#### 3.3 for循环练习-求奇数和

* 需求：求1-10之间的奇数和，并把求和结果在控制台输出 }：

```java
package com.nanci.loop;

public class ForDemo3 {
    public static void main(String[] args) {
        //方法一
                //求和的最终结果必须保存起来，需要定义一个变量，用于保存求和的结果，初始值为0
                int sum = 0;
                //对1-100的数据求和与1-5的数据求和几乎完全一样，仅仅是结束条件不同
                for(int i=1; i<=10; i++) {
                    //对1-100的偶数求和，需要对求和操作添加限制条件，判断是否是偶数
                    if(i%2 == 1) {
                        sum += i;
                    }
                }
                //当循环执行完毕时，将最终数据打印出来
                System.out.println("1-10之间的奇数和是：" + sum);//1-10之间的奇数和是：25
        //方法二
        int sum1 = 0;
        for (int i = 1; i <= 10; i+=2) {
            sum1 +=i;
        }
        System.out.println("1-10之间的奇数和是：" + sum1);//1-10之间的奇数和是：25
            }
        }

```

方式一：在for循环中，通过if筛选出奇数 for (int i = 1; i <= 10; i++) { if (i % 2 == 1) { // i = 1 3 5 7…}}

 方式二：直接使用for循环找出奇数。 for (int i = 1; i <= 10; i+=2) { }

#### 3.4 for循环练习-水仙花 统计水仙花数个数

* 需求：在控制台输出所有的“水仙花数” 统计“水仙花数”一共有多少个，并在控制台输出个数
* 解释：什么是水仙花数？
  * 水仙花数，指的是一个三位数，个位、十位、百位的数字立方和等于原数
    * 例如`153  3*3*3 + 5*5*5 + 1*1*1 = 153`
* 思路：
  1. 获取所有的三位数，准备进行筛选，最小的三位数为100，最大的三位数为999，使用for循环获取
  2. 获取每一个三位数的个位，十位，百位，做if语句判断是否是水仙花数
* 示例代码

```java
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
```

* 今后如果需求带有统计xxx，请先想到计数器变量

* 计数器变量定义的位置，必须在循环外部

* 如何计算出水仙花的个数? 

  ⚫ 在循环外定义一个变量count用于记录水仙花数。

   ⚫ 每输出水仙花数时，让count++

### 4 循环结构： while循环

#### 4.1 while结构

* while循环完整格式：

  ```java
  初始化语句;
  while (条件判断语句) {
  	循环体语句;
      条件控制语句;
  }
  ```

* while循环执行流程：

  ①执行初始化语句

  ②执行条件判断语句，看其结果是true还是false

  ​             如果是false，循环结束

  ​             如果是true，继续执行

  ③执行循环体语句

  ④执行条件控制语句

  ⑤回到②继续：

```java
ackage com.nanci.loop;

public class whileDemo1 {
    public static void main(String[] args) {
        int i =0;
        while(i<3){
            System.out.println("nanci sir");
            i++;
        }
        System.out.println("------------");
        int j =0;
        while(j<3){
            System.out.println("nanci sir");//死循环
        }
    }
}
```

什么时候用for循环，什么时候用while循环？

 ⚫ 功能上是完全一样的，for能解决的while也能解决，反之亦然。 

⚫ 使用规范是：知道循环几次：使用for；不知道循环几次建议使用：while。

####  4.2 while循环练习-珠穆朗玛峰

* 需求：世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，假如我有一张足够大的纸，它的厚度是0.1毫米。请问，我折叠多少次，可以折成珠穆朗玛峰的高度?

```java
public class WhileTest {
    public static void main(String[] args) {
		//定义一个计数器，初始值为0
		int count = 0;
		//定义纸张厚度
		double paper = 0.1;
		//定义珠穆朗玛峰的高度
		int zf = 8844430;
		//因为要反复折叠，所以要使用循环，但是不知道折叠多少次，这种情况下更适合使用while循环
		//折叠的过程中当纸张厚度大于珠峰就停止了，因此继续执行的要求是纸张厚度小于珠峰高度
		while(paper <= zf) {
			//循环的执行过程中每次纸张折叠，纸张的厚度要加倍
			paper *= 2;
			//在循环中执行累加，对应折叠了多少次
			count++;
		}
		//打印计数器的值
		System.out.println("需要折叠：" + count + "次");
    }
}
```

### 5 循环结构：do-while循环

####  5.1 do...while循环结构

* 完整格式：

  ```java
  初始化语句;
  do {
  	循环体语句;
  	条件控制语句;
  }while(条件判断语句);
  ```

```java
package com.nanci.loop;

public class DowhileDemo1 {
    public static void main(String[] args) {
        //学会do while
        int i  = 0;
        do{
            System.out.println("nanci");
            i++;
        }while(i<3);
    }
}

```

### 6 三种循环的区别（理解）

#### 6.1 三种循环的区别

* for循环和while循环先判断条件是否成立，然后决定是否执行循环体（先判断后执行）
* do...while循环先执行一次循环体，然后判断条件是否成立，是否继续执行循环体（先执行后判断）

#### 6.2 for循环和while的区别

* 条件控制语句所控制的自增变量，因为归属for循环的语法结构中，在for循环结束后，就不能再次被访问到了
* 条件控制语句所控制的自增变量，对于while循环来说不归属其语法结构中，在while循环结束后，该变量还可以继续使用

#### 6.3 死循环（无限循环）的三种格式

1. for(;;){}
2. while(true){}
3. do {} while(true);
