// Задача: вывести приветствие пользователя в зависимости от времени суток.
package main.java.testcode;
import java.time.LocalDateTime;
import java.util.Scanner;
//Задача про обращение к пользователю в зависимости от времени суток
public class Main {
    public static void main(String[] args) {
        int hour = LocalDateTime.now().getHour();// ниже просто тест методов
        System.out.println(hour);//выделяем текущий час
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.now().getDayOfMonth());// выделяем дату
        System.out.println(LocalDateTime.now().getMonthValue());// выделяем номер месяца
        System.out.println(LocalDateTime.now().getMonth());// выделяем название месяца
        System.out.println(LocalDateTime.now().getChronology());// система времени, стандарт

        Scanner scanner = new Scanner(System.in); // Создаем объект Сканер
        System.out.print("Введите Ваше имя: ");
        String name = scanner.nextLine(); //Считываем введенную строку. String - это строка, nextLine - считываем строку.
        if (hour <= 12){
            System.out.println("Доброе утро, " + name +"! Рад Вас видеть!");
        }else if (hour <= 18){
            System.out.println("Добрый день, " + name +"! Рад Вас видеть! Пора обедать!");
        }else if (hour <= 22) {
            System.out.println("Добрый вечер, " + name + "! Рад Вас видеть! ");
        }else{
            System.out.println("Доброй ночи, " + name +"! Рад Вас видеть! Но пора уже спать..");
        }

    }

}
