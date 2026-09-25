package week_4.assignment_problems;

class Faculty extends Staff {

    Faculty(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.10;
    }
}

class AdminStaff extends Staff {

    AdminStaff(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.05;
    }
}

public abstract class Staff {

    String name;
    double salary;

    Staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract double calculateBonus();

    void printDetails() {
        System.out.println(
            name + " -> Bonus: Rs." +
            calculateBonus()
        );
    }

    public static void main(String[] args) {

        Staff[] staffMembers = {
            new Faculty("Ravi", 50000),
            new AdminStaff("Anitha", 40000)
        };

        for (Staff staff : staffMembers) {
            staff.printDetails();
        }
    }
}