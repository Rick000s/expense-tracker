package cz.upce.fei;

import java.util.ArrayList;

public class ExpenseManager {
    private ArrayList<Expense> expenses = new ArrayList<>();

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public void removeExpense(Expense expense) {
        expenses.remove(expense);
    }

    public void showAllExpenses() {
        for (Expense e : expenses) {
            System.out.println(e);
        }
    }

    public void totalExpenses() {
        double total = 0;
        for (Expense e : expenses) {
            total += e.getAmount();
        }
        System.out.println("Total Expenses: " + String.format("%.2f", total) + " Kč");
    }

    public void getMaxExpense() {

        Expense max = expenses.get(0);

        for (Expense e : expenses) {
            if (e.getAmount() > max.getAmount()) {
                max = e;
            }
        }
        System.out.printf("Max Expenses: %.2f Kč (%s)%n", max.getAmount(), max);
    }

    public void getMinExpense() {

        Expense min = expenses.get(0);

        for (Expense e : expenses) {
            if (e.getAmount() < min.getAmount()) {
                min = e;
            }
        }
        System.out.printf("Max Expenses: %.2f Kč (%s)%n", min.getAmount(), min);
    }

    public void getExpensesInRange(double start, double end) {
        boolean found = false;

        if (start > end) {
            double tmp = start;
            start = end;
            end = tmp;
        }

        for (Expense e : expenses) {
            if (e.getAmount() >= start && e.getAmount() <= end) {
                System.out.println(e); // vypíše jen samotný výdaj
                found = true;
            }
        }

        if (!found) {
            System.out.println("No expenses found in this range.");
        }
    }
}