package main.java;

public class Enging {
    public static void main(String[] args){
    boolean v8 = false;
    void stop() {
        boolean v8 = true;
        System.out.println("Значение локальной переменной %s%n", v8);
        System.out.println("Значение локальной переменной %s%n", this.v8);
    }
}
}
