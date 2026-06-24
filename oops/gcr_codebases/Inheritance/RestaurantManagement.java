interface Worker {
    void performDuties();
}

class Person {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("ID   : " + id);
    }
}

class Chef extends Person implements Worker {

    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef prepares and cooks food.");
    }
}

class Waiter extends Person implements Worker {

    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter takes orders and serves customers.");
    }
}

public class RestaurantManagement {
    public static void main(String[] args) {

        Chef chef = new Chef("Raghav", 101);
        Waiter waiter = new Waiter("Aman", 102);

        System.out.println("Chef Details:");
        chef.displayInfo();
        chef.performDuties();

        System.out.println();

        System.out.println("Waiter Details:");
        waiter.displayInfo();
        waiter.performDuties();
    }
}