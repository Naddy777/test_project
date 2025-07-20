package main.java;

public class Stacktrace {//Пример работы программы по стэктрейсу
    public static void main(String[] args) {
        one();//Начинаем с метода one
    }
    public static void one() {
        int a = 10;
        int b = 11;
        System.out.printf("Метод one: a=%d, b=%d, (a+b)=%d%n", a, b, (a + b));
        two();// Переходим к методу two
        b = 2000;// Приходим сюда из метода two и завершаем путь по методу one
        System.out.printf("Метод one: a=%d, b=%d, (a+b)=%d%n", a, b, (a + b));

    }
    public static void two() {
        int c = 20;
        int d = 22;
        System.out.printf("Метод two: c=%d, d=%d, (с+d)=%d%n", c, d, (c + d));
        three();// Переходим к методу three
        c = 200;//Приходим сюда из метода three и завершаем путь по методу two
        System.out.printf("Метод two: c=%d, d=%d, (c+d)=%d%n", c, d, (c + d));

    }
    public static void three() {
        int e = 30;
        int f = 33;
        System.out.printf("Метод three: e=%d, f=%d, (e+f)=%d%n", e, f, (e + f)); //Выполняем и возвращаемся в метод two

    }
}