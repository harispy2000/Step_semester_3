package week_4.assignment_problems;

class Developer extends Employee {

    Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculatePay() {
        return salary + 10000;
    }
}

class Manager extends Employee {

    Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculatePay() {
        return salary + 20000;
    }
}

public abstract class Employee {

    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract double calculatePay();

    void printPay() {
        System.out.println(
            name + " -> Pay: Rs." +
            calculatePay()
        );
    }

    public static void main(String[] args) {

        Employee[] employees = {
            new Developer("Karthik", 50000),
            new Manager("Meera", 70000)
        };

        for (Employee employee : employees) {
            employee.printPay();
        }
    }
}