/*Задача Напишите метод, который принимает на вход строку (String) и определяет, является ли строка палиндромом (возвращает булинговое значение)
 */
package main.java.testcode;
//public static void main(String[] args) {
//    System.out.println("Привет!");

import java.util.Scanner;

public class Primer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создаем объект Сканер
        System.out.print("Введите слово или фразу: ");
        String slovo = scanner.nextLine();
        String revers = new StringBuilder(slovo)
                .reverse().toString();
        System.out.println(revers);
        boolean palindrom=slovo.equalsIgnoreCase(revers);
        if (palindrom){
            System.out.printf("%s - палиндром.%n", slovo);
        }else {
            System.out.printf("%s - не палиндром.%n", slovo);
        }


    }
}
