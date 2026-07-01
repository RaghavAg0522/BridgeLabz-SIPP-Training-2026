package Assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TrafficMonitoring {

    static HashMap<String, Integer> traffic = new HashMap<>();

    // Add or Update vehicle count
    public static void updateTraffic(String road, int vehicles) {

        traffic.put(road, traffic.getOrDefault(road, 0) + vehicles);

        System.out.println("Updated " + road);
    }

    // Display sorted roads
    public static void displayReport() {

        TreeMap<String, Integer> sortedRoads = new TreeMap<>(traffic);

        System.out.println("\nTraffic Report:");

        for (Map.Entry<String, Integer> entry : sortedRoads.entrySet()) {

            System.out.println(entry.getKey() + " -> " + entry.getValue() + " vehicles");
        }

        System.out.println("\nTotal Roads : " + traffic.size());
    }

    // Find busiest road
    public static void busiestRoad() {

        String road = "";
        int max = 0;

        for (Map.Entry<String, Integer> entry : traffic.entrySet()) {

            if (entry.getValue() > max) {
                max = entry.getValue();
                road = entry.getKey();
            }
        }

        System.out.println("\nBusiest Road : " + road);
        System.out.println("Vehicle Count : " + max);
    }

    public static void main(String[] args) {

        updateTraffic("MG Road", 120);
        updateTraffic("Ring Road", 300);
        updateTraffic("Airport Road", 180);
        updateTraffic("NH-48", 450);
        updateTraffic("Ring Road", 150);

        displayReport();

        busiestRoad();
    }
}