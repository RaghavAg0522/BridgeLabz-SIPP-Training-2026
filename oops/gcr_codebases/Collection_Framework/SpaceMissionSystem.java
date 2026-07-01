package Assignment;

import java.util.*;

class Astronaut {

    int astronautId;
    String name;
    String specialization;

    Astronaut(int astronautId, String name, String specialization) {
        this.astronautId = astronautId;
        this.name = name;
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "ID : " + astronautId +
                ", Name : " + name +
                ", Specialization : " + specialization;
    }
}

public class SpaceMissionSystem {

    static HashMap<String, List<Astronaut>> missions = new HashMap<>();
    static HashMap<String, HashSet<Integer>> assignedIds = new HashMap<>();

    // Add mission
    public static void addMission(String missionName) {

        missions.putIfAbsent(missionName, new ArrayList<>());
        assignedIds.putIfAbsent(missionName, new HashSet<>());

        System.out.println(missionName + " Mission Added.");
    }

    // Assign astronaut
    public static void assignAstronaut(String missionName, Astronaut a) {

        if (!missions.containsKey(missionName)) {
            System.out.println("Mission does not exist.");
            return;
        }

        if (assignedIds.get(missionName).contains(a.astronautId)) {
            System.out.println("Duplicate Assignment Not Allowed.");
            return;
        }

        missions.get(missionName).add(a);
        assignedIds.get(missionName).add(a.astronautId);

        System.out.println(a.name + " assigned to " + missionName);
    }

    // Display missions
    public static void displayMissions() {

        for (String mission : missions.keySet()) {

            System.out.println("\nMission : " + mission);

            List<Astronaut> crew = missions.get(mission);

            for (Astronaut a : crew)
                System.out.println(a);

            System.out.println("Total Astronauts : " + crew.size());
        }
    }

    public static void main(String[] args) {

        addMission("Chandrayaan");
        addMission("Gaganyaan");

        Astronaut a1 = new Astronaut(101, "Rohan", "Pilot");
        Astronaut a2 = new Astronaut(102, "Aman", "Scientist");
        Astronaut a3 = new Astronaut(103, "Priya", "Engineer");

        assignAstronaut("Chandrayaan", a1);
        assignAstronaut("Chandrayaan", a2);
        assignAstronaut("Chandrayaan", a1); // Duplicate

        assignAstronaut("Gaganyaan", a1);
        assignAstronaut("Gaganyaan", a3);

        displayMissions();
    }
}

