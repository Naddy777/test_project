package main.java;

public class Cycles {
    public static void main(String[] args) {
        double a = Math.random();// Math - функционал в джаве для вычисленний. random = значение будет от 0 до 1 (число с плавающей точкой)
        double b = Math.random();

        for(int i = 0; i < 10; i++){// первый вариант цикла
            System.out.printf("%d", i);
        }
        int count = 0;
        while (count < 10) {// второй вариант цикла, в скобках просто условие
            System.out.printf("%d%n", count);
            count++;//не забыть сделать переменную инкрементом, чтобы не сделать бесконечный цикл
        }
        if (a > b) {// Условия. Самая простая конструкция - только один выбор
            System.out.println("Цикл 1: a > b, " + "a=" + a +"; b=" + b);
        }
        if (a * 100 < 50) {// два условия
            System.out.println("Цикл 2, условие 1: a * 100 < 50, " + "a=" + a);
        } else {
            System.out.println("Цикл 2, условие 2: a * 100 >= 50, " + "a=" + a );
        }
        if (a * 100 < 10) {// много условий
            System.out.println("Цикл 3, условие 1: a * 100 < 10, " + "a=" + a );
        } else if (a * 100 < 20) {
            System.out.println("Цикл 3, условие 2: a * 100 < 20, " + "a=" + a );
        } else if (a * 100 < 30) {
            System.out.println("Цикл 3, условие 3: a * 100 < 30, " + "a=" + a);
        } else {
            System.out.println("Цикл 3, условие 4: a * 100 >= 30, " + "a=" + a);
        }

    }
}
