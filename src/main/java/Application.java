package main.java;
public class Application {
    public static void main(String[] args) {
        byte foot_size = 42; // равно значит положить значение в переменную. Лучше переменные называть так, чтобы понятно было, что лежит внутри
        System.out.println("Размер обуви - " + foot_size);//

        short age = 50;
        System.out.println("Возраст - " + age);

        int salary = 1_000_000;// большое число
        System.out.println("Зарплата в год - " + salary);

        long income = 4_885_445_589L;// ставим в конце "L", объясняем. что это длинное число;
        System.out.println("Доход компании в год - " + income);

        float temperature = 3600000.678f;// ставим в конце "f", объясняем. что это дробное число;
        System.out.println("Тип float) - " + temperature);// float может потерять час знаков, если число большое

        double temperature2 = 3600000.678; // в конце ничего не ставим, компилятор понимает double по умолчанию
        System.out.println("Тип double) - " + temperature2);

        boolean student = false;
        System.out.println("Является ли студентом? - " + student);

        char c = 'c';
        System.out.println("Знак латиницы - " + c);

    }
}