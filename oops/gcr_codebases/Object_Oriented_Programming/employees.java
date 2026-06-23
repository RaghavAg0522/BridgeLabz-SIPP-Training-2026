class employees {
    String name;
    int id;
    double salary;

    employees(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        employees emp = new employees("Raghav", 101, 50000);

        emp.displayDetails();
    }
}