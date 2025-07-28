package main.java.testcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//Задача: Заполнить список десятью случайными числами. отсортировать список методом sort() и вывести его на экран.

public class SpisokChislo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        Random r = new Random();
        for (int i=0; i<10;i++){
            nums.add(r.nextInt(1000));// Рандомом набираем числа до 100
        }
        System.out.println("Массив до сортировки: " + nums);
        Collections.sort(nums);// сортируем массив
        System.out.println("Массив после сортировки: " + nums);
    }

}
