package Assignment;

import java.util.ArrayList;

public class SmartParking {

    static ArrayList<String> vehicles = new ArrayList<>();

    public static void enterVehicle(String number) {

        vehicles.add(number);
        System.out.println(number + " Entered.");
    }

    public static void exitVehicle(String number) {

        if (vehicles.remove(number))
            System.out.println(number + " Exited.");
        else
            System.out.println("Vehicle Not Found.");
    }

    public static void searchVehicle(String number) {

        if (vehicles.contains(number))
            System.out.println("Vehicle is Parked.");
        else
            System.out.println("Vehicle Not Found.");
    }

    public static void displayVehicles() {

        System.out.println("\nParked Vehicles:");

        for (String vehicle : vehicles)
            System.out.println(vehicle);

        System.out.println("Occupied Slots : " + vehicles.size());
    }

    public static void main(String[] args) {

        enterVehicle("HR26AB1234");
        enterVehicle("DL01XY5678");
        enterVehicle("UP14PQ1111");

        searchVehicle("DL01XY5678");

        exitVehicle("UP14PQ1111");

        displayVehicles();
    }
}