package main.java.testcode;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*Напишите метод, который составит строку из стопроцентного повторения слова TEST и метод, который запишет эту строку в простой
текстовый файл, обработайте исключения
 */
public class Primer3 {
    public static void main(String[] args) {
        String test = buildTest();
       // String filename="F:\\Наши документы\\Для Наденьки\\Обучение\\JAVA\\output.txt";// указали путь новый
        String filename="F:/Наши документы/Для Наденьки/Обучение/JAVA/output2.txt";// указали путь через такой /
        wrightToFile(test, filename);
   // System.out.println("Привет!");
    }
    public static String buildTest(){
        StringBuilder sb= new StringBuilder(4*100);
        for(int i=0;i<100;i++){
            sb.append("TEST");
        }return sb.toString();
    }
    public static void wrightToFile(String content, String filename) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){
            writer.write(content);
            System.out.println("Запись в файл успешно завершена " + filename);// по умолчанию  запишел в C:\Users\volll\IdeaProjects\test_project
        }catch (IOException e){
            System.err.println("Произошла ошибка записи в файл " + e.getMessage() );
            e.printStackTrace();
        }
    }
}
