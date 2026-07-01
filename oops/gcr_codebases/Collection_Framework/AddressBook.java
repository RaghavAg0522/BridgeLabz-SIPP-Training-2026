package Assignment;

import java.util.*;

class Contact implements Comparable<Contact> {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public int compareTo(Contact c) {
        return this.name.compareToIgnoreCase(c.name);
    }

    @Override
    public String toString() {
        return "Name : " + name +
                ", Phone : " + phone +
                ", Email : " + email;
    }
}

public class AddressBook {

    static ArrayList<Contact> contacts = new ArrayList<>();
    static HashMap<String, Contact> map = new HashMap<>();
    static HashSet<String> phoneSet = new HashSet<>();

    public static void addContact(String name, String phone, String email) {

        if (phoneSet.contains(phone)) {
            System.out.println("Duplicate phone number not allowed.");
            return;
        }

        Contact c = new Contact(name, phone, email);

        contacts.add(c);
        map.put(name, c);
        phoneSet.add(phone);

        System.out.println("Contact Added.");
    }

    public static void search(String name) {

        if (map.containsKey(name))
            System.out.println(map.get(name));
        else
            System.out.println("Contact Not Found.");
    }

    public static void delete(String name) {

        if (!map.containsKey(name)) {
            System.out.println("Contact Not Found.");
            return;
        }

        Contact c = map.remove(name);
        contacts.remove(c);
        phoneSet.remove(c.phone);

        System.out.println("Contact Deleted.");
    }

    public static void display() {

        Collections.sort(contacts);

        System.out.println("\nAddress Book:");

        for (Contact c : contacts)
            System.out.println(c);
    }

    public static void main(String[] args) {

        addContact("Raghav", "9876543210", "raghav@gmail.com");
        addContact("Aman", "9999999999", "aman@gmail.com");
        addContact("Riya", "8888888888", "riya@gmail.com");

        search("Aman");

        delete("Riya");

        display();
    }
}