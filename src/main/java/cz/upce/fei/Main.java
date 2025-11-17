package cz.upce.fei;


public class Main {
    public static void main(String[] args) {
        System.out.println("Main started");
        Expense expense1 = new Expense("17.11.2025", "Food", "FastFood", 50.67);

        System.out.println("Expense 1: " + expense1);
    }
}