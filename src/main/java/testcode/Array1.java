//Задача: дан массив, и число 3. Нужно сравнить с числом каждый элемент массива и вывести те, что больше - в конец массива
package main.java.testcode;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int[] arrays = {3, 2, 2, 3};//Дали массив значений
        int a = 3;// число для сравнения
        System.out.println(Arrays.toString(arrays));// так можно напечатать массив
        moveNumtoEnd(arrays, a);// пишем метод, по которому будем выводить новый массив
        System.out.println("Новый массив: " + Arrays.toString(arrays));
    }
    public static void moveNumtoEnd (int[] arrays, int a){
        int wright = 0;// даем индекс для сравнения - правая
        for (int array : arrays) {// пишем условие - пройтись циклом по каждому элементу массива arrays
            if (array != a) {// если элемент массива не равен переменной а
                arrays[wright++] = array;// добавляем индекс ++ и присваиваем выбранному новому элементу массива (через индекс)
                // новое значение, которое будем сравнивать с а
            }
        }
        while (wright<arrays.length){//пока длина массива позволяет, переписываем оставшиеся переменные по указанному индексу
            arrays[wright++] = a;
        }
    }

    }

