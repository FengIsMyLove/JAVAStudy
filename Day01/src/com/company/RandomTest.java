package com.company;
/*
猜数游戏
Random类生成伪随机数
 */
import  java.util.Scanner;
import  java.util.Random;
public class RandomTest {

    public static void main(String[] args) {
        Random rd = new Random();
        int data = rd.nextInt(1000)+1;//nextInt(int index) only [0,index],So we add one.
        while (true)
        {
            int temp = (new Scanner(System.in)).nextInt();//Mysterious class only one is used.
            if(temp>data)
            {
                System.out.println(temp+" is too large.");
            }
            else if(temp<data)
            {
                System.out.println(temp+" is too small.");
            }
            else
            {
                System.out.println("Very good!");
                break;
            }
        }
    }
}
