package School;

import java.util.Scanner;

public class 递归法进制转换 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int data = sc.nextInt();
        System.out.println("请输入要转换的进制：[2,4,8,16,32]");
        int base = sc.nextInt() - 1;
        int standard;
        for (int i = 0; ; i++) {
            if (Math.pow(2, i) == base + 1) {
                standard = i;
                break;
            }
        }
        char[] array = "0123456789ABCDEFGHIJKLMNOPQRSTUV".toCharArray();
        System.out.print("转换后的数是:");
        change(data, base, standard, array);
        System.out.println();
    }

    public static void change(int data, int base, int standard, char[] array) {
        if (data > 0) {
            int temp = (data & base);
            change(data >>> standard, base, standard, array);
            System.out.print(array[temp]);
        }
    }

}
