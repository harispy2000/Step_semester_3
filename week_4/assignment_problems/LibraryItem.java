package week_4.assignment_problems;

class Book extends LibraryItem {

    Book(String title, int daysLate) {
        super(title, daysLate);
    }

    @Override
    double calculateFine() {
        return daysLate * 2.0;
    }
}

class DVD extends LibraryItem {

    DVD(String title, int daysLate) {
        super(title, daysLate);
    }

    @Override
    double calculateFine() {
        return daysLate * 5.0;
    }
}

public abstract class LibraryItem {

    String title;
    int daysLate;

    LibraryItem(String title, int daysLate) {
        this.title = title;
        this.daysLate = daysLate;
    }

    abstract double calculateFine();

    void printDetails() {
        System.out.println(
            title + " -> Fine: Rs." +
            calculateFine()
        );
    }

    public static void main(String[] args) {

        LibraryItem[] items = {
            new Book("Java Programming", 3),
            new DVD("OOP Tutorial", 2)
        };

        for (LibraryItem item : items) {
            item.printDetails();
        }
    }
}