package cz.upce.fei;

public class Expense {
    private String date; // дата
    private String category; // категорія
    private String note; // коментар
    private double amount; // сума витрати

    public Expense(String date, String category, String note, double amount) {
//        System.out.println("Expense object created");
        this.date = date;
        this.category = category;
        this.note = note;
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Date: " + date + " | Category: " + category + " | Note: " + note + " | Amount: " + amount + "Kč";
    }
}
