package main.java.testcode;
import java.util.*;

public class Spisok {
    public static void main(String[] args) {
        /*
        //Array или  ArrayList
        T[]
        ArrayList<T>_;
        //Создание
        int[] a = new int[5];
        ArrayList<Integer> list= new ArrayList<>();
        //Доступ
        a[1];
        list.get(1);
        // Добавление, удаление: нельзя менять размер, можно только перезаписать
        // add(), remove()
        */
        String[] arr = new String[3];// Пример использования массива
        arr[0]="A";
        arr[1]="B";
        arr[2]="C";
        System.out.println("Работаем с массивом. ");
        System.out.println(arr.toString());
        System.out.println(arr);
        System.out.println(arr[0]);// можем вывести все элементы либо через цикл, или собрать в стрингбилдер
        System.out.println("Теперь работаем с ArrayList. ");
        List<String> list=new ArrayList<>();//Пример использования ArrayList
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add(list.size()/2,"E");// вариант добавления элемента в середину массива
        System.out.println("Печатаем массив: " + list);
        System.out.println("Печатаем второй элемент массива: " + list.get(1));
        list.remove("A");
        list.remove(0);
        System.out.println("Печатаем второй элемент массива после того, как удалили первый: " + list.get(1));
        System.out.println("Печатаем весь массив: " + list);
        List<Integer> nums= Arrays.asList(5,2,8,3);
        System.out.println("Вводим новый список и печатаем его до сортировки: " + nums);
        Collections.sort(nums);
        System.out.println("Печатаем после сортировки: " + nums);




    }
}
