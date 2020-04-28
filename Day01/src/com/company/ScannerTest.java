package com.company;
/*
求和键盘录入两个数据并求和
Scanner类使用
1.先导包（java.lang下的不用导包（如：Math类））。
2.new出一个对象。
3.nextXXX()方法使用。
 */
import  java.util.Scanner;
public class ScannerTest {

    public static void main(String[] args) {
        int a,b;
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入第一个数：");
        a=sc.nextInt();
        System.out.println("请输入第二个数：");
        b=sc.nextInt();
        System.out.println("sum = "+(a+b));
    }
}
