package Employee_Salary_Management_System;

// parent class
public class Employee {
    // declaring attributes
    private String id;
    private String name;
    private String department;
    private double basicSalary;

    // creating constructor
    public Employee(String id, String name, String department, double basicSalary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.basicSalary = basicSalary;
    }

    // creating getter and setter methods
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    // calculating salary method
    public double calculateSalary() {
        return getBasicSalary();
    }

    // category method
    public String getCategory() {
        return "Employee";
    }

    // displaying method
    public void display() {
        System.out.println("Employee ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Category: " + getCategory());
        System.out.printf("Monthly Salary: $%.2f%n", calculateSalary());
    }
}

// child class 1
class FullTimeEmployee extends Employee {
    // declaring attribute
    private double allowance;

    // constructor
    public FullTimeEmployee(String id, String name, String department, double basicSalary, double allowance) {
        super(id, name, department, basicSalary);
        this.allowance = allowance;
    }

    // getter and setter methods
    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    // overriding calculate method
    @Override
    public double calculateSalary() {
        return super.calculateSalary() + getAllowance();
    }

    // overriding category method
    @Override
    public String getCategory() {
        return "Full-Time Employee";
    }

    // overriding display method
    @Override
    public void display() {
        super.display();
    }
}

// child class 2
class PartTimeEmployee extends Employee {
    // declaring attributes
    private double hoursWorked;
    private double hourlyRate;

    // constructor
    public PartTimeEmployee(String id, String name, String department, double basicSalary, double hoursWorked, double hourlyRate) {
        super(id, name, department, basicSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // getter and setter methods
    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    // overriding calculate method
    @Override
    public double calculateSalary() {
        return getHoursWorked() * getHourlyRate();
    }

    // overriding category method
    @Override
    public String getCategory() {
        return "Part-Time Employee";
    }

    // overriding display method
    @Override
    public void display() {
        super.display();
    }
}

// child class 3
class Manager extends Employee {
    // declaring attribute
    private double bonus;

    // constructor
    public Manager(String id, String name, String department, double basicSalary, double bonus) {
        super(id, name, department, basicSalary);
        this.bonus = bonus;
    }

    // getter and setter methods
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // overriding calculate method
    @Override
    public double calculateSalary() {
        return super.calculateSalary() + getBonus();
    }

    // overriding category method
    @Override
    public String getCategory() {
        return "Manager";
    }

    // overriding display method
    @Override
    public void display() {
        super.display();
    }
}

// main class
class Main {
    public static void main(String[] args) {

        Employee[] employees = {
                new FullTimeEmployee("EMP001", "Mohamed Ali", "IT", 500, 180),
                new PartTimeEmployee("EMP002", "Fatima Hassan", "Finance", 0, 50, 5),
                new Manager("EMP003", "Aisha Omar", "HR", 2000, 200)
        };

        System.out.println("===== EMPLOYEE SALARY REPORT =====");
        System.out.println();

        for (Employee x : employees) {
            x.display();
            System.out.println();
        }
    }
}
