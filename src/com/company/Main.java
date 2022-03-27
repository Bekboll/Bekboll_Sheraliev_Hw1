package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String pen;

        final int NUM = 17;

        String word = " Bekboll";

        pen = NUM + word;

        System.out.println(pen);

        if (NUM > 0){
            System.out.println("Вы сохранили отрицательное число");
        }else{
            System.out.println("Вы сохранили ноль");
        }
        if (NUM < 0){
            System.out.println("Вы сохранили положительное число");
        }else{
            System.out.println("Вы сохранили ноль");
        }
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name + " Привет ");
    }
}
