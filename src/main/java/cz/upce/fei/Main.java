package cz.upce.fei;


public class Main {
    public static void main(String[] args) {
        ExpenseManager manager = new ExpenseManager();

        Expense expense1 = new Expense("17.11.2025", "Food", "FastFood", 50.67);
        Expense expense2 = new Expense("18.11.2025", "Coffee", "Starbucks", 80.00);
        Expense expense3 = new Expense("18.11.2025", "Pancake", "Starbucks", 60.00);
        Expense expense4 = new Expense("19.11.2025", "Book", "Libreri", 90.00);

        manager.addExpense(expense1);
        manager.addExpense(expense2);
        manager.addExpense(expense3);
        manager.addExpense(expense4);

//        manager.showAllExpenses();
//
//        manager.totalExpenses();
//
//        manager.getMaxExpense();
//        manager.getMinExpense();

        manager.getExpensesInRange(60, 100);
    }
}