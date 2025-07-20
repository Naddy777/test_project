package main.java;

public class SwitchCase {//Пример условия Свитч Кейс, но он не работает
    public static void main(String[] args) {
        String name = args[0];
        switch (name){
            case "Игорь" -> System.out.println("Это Игорь");
            case "Вася" -> System.out.println("Это Вася");
            default -> System.out.println("Неизвестный персонаж");
        }
    }
}
