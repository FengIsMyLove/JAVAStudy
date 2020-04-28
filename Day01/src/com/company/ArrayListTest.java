package com.company;
/*
1.Add basic type to List.
2.Add Object to List.
3.Print List method.
4.Get(return) Object method.
 */
/*
Often use method:
public boolean add(int index);
public E remove(E e);
public E get(int index);
public int size();
 */

import java.util.Random;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        Exercise01();
        Exercise02();
    }

    /*
     * tips: Basic type isn't used ArrayList.
     * Must use package class
     * Basic type:              package class:
     * int                      Intager
     * char                     Character
     * other                 first letter of other become UP
     * */
    public static void Exercise01() {
        Random rd = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int r = rd.nextInt(1000) + 1;
            list.add(r);
        }
        print(list);
    }

    public static void Exercise02() {
        Person r1 = new Person("Bob", 18);
        Person r2 = new Person("Joe", 25);
        Person r3 = new Person("Lingling", 78);
        ArrayList<Person> list = new ArrayList<>();
        list.add(r1);
        list.add(r2);
        list.add(r3);
        for (int i = 0; i < list.size(); i++) {
            Person temp =list.get(i);
            System.out.println("name: "+temp.getName()+" and This age is: "+temp.getAge());
        }
    }

    //print ArrayList
    public static void print(ArrayList List) {
        for (int i = 0; i < List.size(); i++) {
            System.out.print(List.get(i));
            if (i != List.size()) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

}
