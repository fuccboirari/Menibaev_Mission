package zad_1;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        System.out.println("Задание 5:");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите три целых числа:");
        int min = in.nextInt(); //2147483647;
        int n;
        for (int i = 0; i < 2; i++) {
            n = in.nextInt();
            if (n < min) {
                min = n;
            }
        }
        System.out.println(min);
    }
}
