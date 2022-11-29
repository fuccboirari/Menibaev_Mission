/*
Задачи:
1. Написать программу, которая проверяет, является ли строка палиндромом
2. Реализовать удаление повторяющихся символов в строке
3. Реализовать проверку, являются ли две строки анаграммами
4. Напишите Java-программу для лексикографического сравнения двух строк.
5. Напишите Java-программу для лексикографического сравнения двух строк, игнорируя различия в регистре.
6. Напишите программу на Java для объединения данной строки в конец другой строки.
7. Напишите Java-программу для сравнения заданной строки с указанной последовательностью символов.
8. Напишите программу на Java, чтобы проверить, заканчивается ли данная строка содержимым другой строки.
9. Напишите программу на Java, чтобы проверить, содержат ли два объекта String одинаковые данные.
10. Напишите Java-программу, чтобы получить длину заданной строки.
11. Напишите программу на Java, чтобы преобразовать все символы строки в нижний регистр.
12. Напишите программу на Java, чтобы преобразовать все символы в строке в верхний регистр.
13. Напишите программу на Java, чтобы найти второй по частоте символ в данной строке.
14. Напишите программу на Java для печати после удаления дубликатов из заданной строки.
15. Напишите программу на Java, чтобы найти первый неповторяющийся символ в строке.
16. Напишите программу на Java, которая возвращает true из заданной строки,
если первые два символа в строке также появляются в конце.
17. Напишите программу на Java, которая возвращает количество символов, появляющихся три раза подряд в строке.
18. Напишите программу на Java, которая возвращает сумму цифр, присутствующих в строке.
Если цифр нет, возвращаемая сумма равна 0.
 */

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num = 1;
        while (num != 0) {
            System.out.print("Введите номер задачи: ");
            if (!in.hasNextInt()) {
                System.out.print("Выход из программы. ");
                num = 0;
            }
            else num = in.nextInt();

            in.nextLine();

            switch(num) {
                case(1) -> isPalindrome(in);
                case(2), (14) -> deleteRepeatSymbols(in);
                case(3) -> isAnagram(in);
                case(4) -> stringCompare(in);
                case(5) -> stringCompareIgnoreCase(in);
                case(6) -> stringConcatenate(in);
                case(7) -> stringContentEquals(in);
                case(8) -> stringEndWith(in);
                case(9) -> stringEquals(in);
                case(10) -> stringLength(in);
                case(11) -> stringLowerCase(in);
                case(12) -> stringUpperCase(in);
                case(13) -> secondMostFreqSymbol(in);
                case(15) -> firstUniqueSymbol(in);
                case(16) -> firstInLast(in);
                case(17) -> threeRepeatSymbols(in);
                case(18) -> numberSumInString(in);
                default -> System.out.println("Задача не найдена");
            }
        }

    }

    public static void isPalindrome(Scanner sc) {
        System.out.print("Задача №1, введите строку: ");
        if (!sc.hasNextLine()) {
            System.out.println("Строка не введена.");
            return;
        }
        //удаляем пробелы и знаки препинания
        String text = sc.nextLine().replaceAll("\\W","");
        StringBuilder strBuilder = new StringBuilder(text);
        //переворачиваем строку
        strBuilder.reverse();
        //присваиваем перевернутую строку
        String invertedText = strBuilder.toString();
        if (text.equalsIgnoreCase(invertedText))
            System.out.println("Строка является палиндромом.");
        else System.out.println("Строка не является палиндромом.");
    }

    public static void deleteRepeatSymbols(Scanner sc) {
        System.out.print("Задача №2 (14), введите строку: ");
        if (!sc.hasNextLine()) {
            System.out.println("Строка не введена.");
            return;
        }
        String text = sc.nextLine();
        //Создание списочного массива со значениями char
        ArrayList<Character> arrText = new ArrayList<>();
        //Добавление уникальных значений char из строки text
        for (char x : text.toCharArray()) {
            if (!arrText.contains(x))
                arrText.add(x);
        }
        String newText = Arrays.toString(arrText.toArray());
        System.out.println("Строка без повторяющихся символов: " + newText);
    }

    public static void isAnagram(Scanner sc) {
        System.out.print("Задача №3, введите первую строку: ");
        if (!sc.hasNextLine()) {
            System.out.println("Строка не введена.");
            return;
        }
        //Удаление пробелов и знаков препинания в str1
        StringBuilder str1 = new StringBuilder(sc.nextLine().replaceAll("\\W", ""));
        //Перевод строки в нижний регистр
        stringLowerCase(str1);
        System.out.print("Введите вторую строку: ");
        if (!sc.hasNextLine()) {
            System.out.println("Строка не введена.");
            return;
        }
        //То же самое для str2
        StringBuilder str2 = new StringBuilder(sc.nextLine().replaceAll("\\W", ""));
        stringLowerCase(str2);
        //Алогритм реализует удаление символов из строки str2
        //при совпадении символов в str1 и str2
        //Если длина str2 = 0, то строка str2 является анаграммой строки str1
        if (stringLength(str1) != stringLength(str2)) System.out.println("Строка не является анаграммой");
        else {
            int x, y;
            x = -1;
            while (++x < stringLength(str1)) {
                y = -1;
                while (++y < stringLength(str2)) {
                    if (str1.charAt(x) == str2.charAt(y)) {
                        str2.deleteCharAt(y);
                        break;
                    }
                }
            }
        }
        if (stringLength(str2) != 0) System.out.println("Строка не является анаграммой");
        else System.out.println("Строка является анаграммой");
    }

    public static void stringCompare(String str1, String str2) {
        //Является альтернативой методу compareTo()
        for (int i = 0; i < stringLength(str1) && i < stringLength(str2); i++) {
            if ((int)str1.charAt(i) - (int)str2.charAt(i) > 0) {
                System.out.println("Первая строка больше второй.");
                return;
            }
            else if  ((int)str1.charAt(i) - (int)str2.charAt(i) < 0){
                System.out.println("Первая строка меньше второй.");
                return;
            }
        }
        if (stringLength(str1) < stringLength(str2)) {
            System.out.println("Первая строка больше второй.");
        }
        else if (stringLength(str1) > stringLength(str2)) {
            System.out.println("Первая строка меньше второй.");
        }
        else System.out.println("Строки равны.");
    }

    public static void stringCompare(Scanner sc) {
        System.out.print("Задача №4, введите первую строку: ");
        if (!sc.hasNextLine()) {
            System.out.println("Строка не введена.");
            return;
        }
        String str1 = sc.nextLine();
        System.out.print("Введите вторую строку: ");
        if (!sc.hasNextLine()) {
            System.out.println("Строка не введена.");
            return;
        }
        String str2 = sc.nextLine();
        stringCompare(str1, str2);
    }

    public static void stringCompareIgnoreCase(Scanner sc) {
        System.out.print("Задача №5, введите первую строку: ");
        if (!sc.hasNextLine()) {
            System.out.println("Строка не введена.");
            return;
        }
        String str1 = sc.nextLine().replaceAll("\\W", "");
        str1 = stringLowerCase(str1);
        System.out.print("Введите вторую строку: ");
        if (!sc.hasNextLine()) {
            System.out.println("Строка не введена.");
            return;
        }
        String str2 = sc.nextLine().replaceAll("\\W", "");
        str2 = stringLowerCase(str2);
        stringCompare(str1, str2);
    }

    public static void stringConcatenate(Scanner sc) {
        System.out.print("Задача №6, введите первую строку: ");
        if (!sc.hasNextLine()) {
            System.out.println("Строка не введена.");
            return;
        }
        String str1 = sc.nextLine();
        System.out.print("Введите вторую строку: ");
        if (!sc.hasNextLine()) {
            System.out.println("Строка не введена.");
            return;
        }
        String str2 = sc.nextLine();
        System.out.println("Итоговая строка:" + str1 + str2);
    }

    public static void stringContentEquals(Scanner sc) {
        System.out.print("Задача №7, введите строку: ");
        if (!sc.hasNextLine()) {
            System.out.println("Строка не введена.");
            return;
        }
        String str = sc.nextLine();
        System.out.print("Введите последовательность символов: ");
        if (!sc.hasNextLine()) {
            System.out.println("Строка не введена.");
            return;
        }
        CharSequence cs = sc.nextLine();
        if (str.contentEquals(cs)) System.out.println("Строка и последовательность символов равны");
        else System.out.println("Строка и последовательность символов не равны");
    }

    public static void stringEndWith(Scanner sc) {
        System.out.print("Задача №8, введите первую строку: ");
        if (!sc.hasNextLine()) {
            System.out.println("Строка не введена.");
            return;
        }
        String str = sc.nextLine();
        System.out.print("Введите вторую строку: ");
        if (!sc.hasNextLine()) {
            System.out.println("Строка не введена.");
            return;
        }
        String end = sc.nextLine();
        //Создаётся строка strEnd из str длиной end
        //и сравнивается посимвольно с end
        String strEnd = str.substring(stringLength(str) - stringLength(end));
        for (int i = stringLength(end) - 1; i >= 0; i--) {
            if (strEnd.charAt(i) != end.charAt(i)) {
                System.out.println("Вторая строка не является концом первой.");
                return;
            }
        }
        System.out.println("Вторая строка является концом первой.");
    }

    public static boolean stringEquals(String str1, String str2) {
        //Является альтернативой методу equals()
        if (stringLength(str1) != stringLength(str2)) return false;
        else {
            for (int i = 0; i < stringLength(str1); i++) {
                if (str1.charAt(i) != str2.charAt(i)) return false;
            }
        }
        return true;
    }

    public static void stringEquals(Scanner sc) {
        System.out.print("Задача №9, введите первую строку: ");
        if (!sc.hasNextLine()) {
            System.out.println("Строка не введена.");
            return;
        }
        String str1 = sc.nextLine();
        System.out.print("Введите вторую строку: ");
        if (!sc.hasNextLine()) {
            System.out.println("Строка не введена.");
            return;
        }
        String str2 = sc.nextLine();
        if (stringEquals(str1, str2))  System.out.println("Строки равны.");
        else System.out.println("Строки не равны.");
    }

    public static int stringLength(String str) {
        //Является альтернативой методу length()
        int length = 0;
        for (char ignored : str.toCharArray()) length++;
        return length;
    }

    public static int stringLength(StringBuilder strBld) {
        //Является альтернативой методу length() для StringBuilder
        String str = strBld.toString();
        int length = 0;
        for (char ignored : str.toCharArray()) length++;
        return length;
    }

    public static void stringLength(Scanner sc) {
        System.out.print("Задача №10, введите строку: ");
        if (!sc.hasNextLine()) {
            System.out.println("Строка не введена.");
            return;
        }
        String str = sc.nextLine();
        System.out.println("Длина строки: " + stringLength(str));
    }

    public static String stringLowerCase(String str) {
        //Является альтернативой методу toLowerCase()
        StringBuilder s = new StringBuilder(str);
        int i = stringLength(s);
        while (--i > -1)
            if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || ((s.charAt(i) >= 'А' && s.charAt(i) <= 'Я')))
                s.setCharAt(i, (char) (s.charAt(i) + 32));
            else if (s.charAt(i) == 'Ё') s.setCharAt(i, 'ё');
        return new String(s);
    }

    public static void stringLowerCase(StringBuilder s) {
        //Является альтернативой методу toLowerCase() для StringBuilder
        int i = stringLength(s);
        while (--i > -1)
            if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || ((s.charAt(i) >= 'А' && s.charAt(i) <= 'Я')))
                s.setCharAt(i, (char) (s.charAt(i) + 32));
            else if (s.charAt(i) == 'Ё') s.setCharAt(i, 'ё');
    }

    public static void stringLowerCase(Scanner sc) {
        System.out.print("Задача №11, введите строку латинницей или кириллицей: ");
        if (!sc.hasNextLine()) {
            System.out.println("Строка не введена.");
            return;
        }
        String str = sc.nextLine();
        System.out.println("Строка в нижнем регистре: " + stringLowerCase(str));
    }

    public static String stringUpperCase(String str) {
        //Является альтернативой методу toUpperCase()
        StringBuilder s = new StringBuilder(str);
        int i = stringLength(s);
        while (--i > -1)
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || ((s.charAt(i) >= 'а' && s.charAt(i) <= 'я')))
                s.setCharAt(i, (char) (s.charAt(i) - 32));
            else if (s.charAt(i) == 'ё') s.setCharAt(i, 'Ё');
        return new String(s);
    }

    public static void stringUpperCase(Scanner sc) {
        System.out.print("Задача №12, введите строку латинницей или кириллицей: ");
        if (!sc.hasNextLine()) {
            System.out.println("Строка не введена.");
            return;
        }
        String str = sc.nextLine();
        System.out.println("Строка в верхнем регистре: " + stringUpperCase(str));
    }

    public static Map<Character,Integer> charFrequency(String str) {
        //Метод создаёт хэш-карту, где ключом является символ строки,
        //а значением - количество вхождений символа в строку
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < stringLength(str); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                int cnt = map.get(c);
                map.put(c, ++cnt);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }

    public static void secondMostFreqSymbol(Scanner sc) {
        System.out.print("Задача №13, введите строку: ");
        if (!sc.hasNextLine()) {
            System.out.println("Строка не введена.");
            return;
        }
        String str = sc.nextLine();
        Map<Character,Integer> map = charFrequency(str);
        System.out.println("Ключ-значение для каждого символа:\n" + map);
        ArrayList<Integer> mapValues = new ArrayList<>(map.values());
        Collections.sort(mapValues);
        int max2 = mapValues.get(mapValues.size() - 2);
        int i = 0;
        while (++i < stringLength(str))
            for (Map.Entry<Character, Integer> entry : map.entrySet())
                if (max2 == entry.getValue() && str.charAt(i) == entry.getKey())
                    System.out.println("Символ: " + entry.getKey()
                    + ", частота повторения:  " + entry.getValue());
    }

    public static void firstUniqueSymbol(Scanner sc) {
        System.out.print("Задача №15, введите строку: ");
        if (!sc.hasNextLine()) {
            System.out.println("Строка не введена.");
            return;
        }
        String str = sc.nextLine();
        Map<Character,Integer> map = charFrequency(str);
        System.out.println("Ключ-значение для каждого символа:\n" + map);
        int min = Collections.min(map.values());
        int i = 0;
        while (++i < stringLength(str))
            for (Map.Entry<Character, Integer> entry : map.entrySet())
                if (min == entry.getValue() && str.charAt(i) == entry.getKey()) {
                    System.out.println("Первый уникальный символ: " + entry.getKey());
                    return;
                }
    }

    public static void firstInLast(Scanner sc) {
        System.out.print("Задача №16, введите строку: ");
        if (!sc.hasNextLine()) {
            System.out.println("Строка не введена.");
            return;
        }
        String str = sc.nextLine();
        if (stringLength(str) < 2) System.out.println("Строка меньше нужной длины.");
        else if (str.substring(0,2).equals(str.substring(stringLength(str)-2)))
            System.out.println("Два первых символа имеются в конце строки.");
        else if (str.substring(0,2).equals(str.substring(stringLength(str)-1)
                + str.charAt(stringLength(str) - 2)))
            System.out.println("Два первых символа имеются в конце строки.");
        else System.out.println("Два первых символа не имеются в конце строки.");
    }

    public static void threeRepeatSymbols(Scanner sc) {
        System.out.print("Задача №17, введите строку: ");
        if (!sc.hasNextLine()) {
            System.out.println("Строка не введена.");
            return;
        }
        String str = sc.nextLine();
        Map<Character, Integer> map = charFrequency(str);
        System.out.println("Ключ-значение для каждого символа:\n" + map);
        int i = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet())
            if (entry.getValue() == 3)
                i++;
        System.out.println("Кол-во символов, повторяющихся три раза: " + i);
    }

    public static void numberSumInString(Scanner sc) {
        System.out.print("Задача №18, введите строку: ");
        if (!sc.hasNextLine()) {
            System.out.println("Строка не введена.");
            return;
        }
        String str = sc.nextLine();
        int i = 0;
        int res = 0;
        while (i++ < stringLength(str))
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
                res += str.charAt(i) - '0';
        System.out.println("Сумма цифр в строке: " + res);
    }
}
