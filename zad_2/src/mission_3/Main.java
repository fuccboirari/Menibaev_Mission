package mission_3;

public class Main {
    public static void main(String[] args) {
/*        3. Класс Phone.
        Создайте класс Phone, который содержит переменные number, model и
        weight.
                Создайте три экземпляра этого класса.
        Выведите на консоль значения их переменных.
        Добавить в класс Phone методы: receiveCall, имеет один параметр – имя
        звонящего.Выводит на консоль сообщение “Звонит {name}”. getNumber –
        возвращает номер телефона. Вызвать эти методы для каждого из
        объектов.
                Добавить конструктор в класс Phone, который принимает на вход три
        параметра для инициализации переменных класса - number, model и
        weight.
                Добавить конструктор, который принимает на вход два параметра для
        инициализации переменных класса - number, model.
                Добавить конструктор без параметров.
                Вызвать из конструктора с тремя параметрами конструктор с двумя.
        Добавьте перегруженный метод receiveCall, который принимает два
        параметра - имя звонящего и номер телефона звонящего. Вызвать этот
        метод.
                Создать метод sendMessage с аргументами переменной длины. Данный
        метод принимает на вход номера телефонов, которым будет отправлено
        сообщение. Метод выводит на консоль номера этих телефонов.*/

        Phone phoneOne = new Phone(11111,"Nokia", 8.97);
        Phone phoneTwo = new Phone(22222,"Iphone", 9.15);
        Phone phoneThree = new Phone(22222,"Iphone", 12);

        Phone.printConsole(phoneOne,phoneTwo,phoneThree);

        phoneOne.receiveCall("Anatoly");
        phoneTwo.receiveCall("Gennady");
        phoneThree.receiveCall("Violetta");

        System.out.println();
        System.out.println(phoneOne.getNumber());
        System.out.println(phoneTwo.getNumber());
        System.out.println(phoneThree.getNumber());

        phoneOne.receiveCall("Anatoly",235);
        phoneTwo.receiveCall("Gennady", 547);
        phoneThree.receiveCall("Violetta", 568);

        phoneOne.sendMessage(12345,45678,789568);


    }
}
