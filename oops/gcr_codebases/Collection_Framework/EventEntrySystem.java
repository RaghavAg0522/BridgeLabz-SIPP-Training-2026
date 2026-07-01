package Assignment;

import java.util.HashSet;

public class EventEntrySystem {

    static HashSet<String> participants = new HashSet<>();

    public static void register(String email) {

        if (participants.add(email))
            System.out.println("Registration Successful.");
        else
            System.out.println("Duplicate Registration Rejected.");
    }

    public static void displayParticipants() {

        System.out.println("\nRegistered Participants:");

        for (String email : participants)
            System.out.println(email);

        System.out.println("Total Participants : " + participants.size());
    }

    public static void main(String[] args) {

        register("abc@gmail.com");
        register("xyz@gmail.com");
        register("abc@gmail.com");
        register("java@gmail.com");

        displayParticipants();
    }
}
