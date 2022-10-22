package zad_1;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        System.out.println("Задание 3:");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int n = in.nextInt();
        if (n > 0) {
            System.out.println(n + 1);
        } else {
            System.out.println(n);
        }
    }
}
