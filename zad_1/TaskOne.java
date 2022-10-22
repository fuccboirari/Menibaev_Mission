package zad_1;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        Scanner num = new Scanner(System.in);
        int i_1;
        System.out.println("Введите целое число:");
        i_1 = num.nextInt();
        int i_2;
        i_2 = i_1 % 10;
        System.out.println("Последняя цифра числа" + " " + i_1);
        System.out.println(i_2);
    }
}
