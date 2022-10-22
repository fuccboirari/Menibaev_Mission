package zad_1;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        System.out.println("Задание 4:");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int n = in.nextInt();
        if (n == 0) {
            n = 10;
        } else {
            if (n > 0) {
                n += 1;
            } else {
                n -= 2;
            }
        }
        System.out.println(n);
    }
}
