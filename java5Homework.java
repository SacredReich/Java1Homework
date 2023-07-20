import java.util.*;

public class java5Homework {
    public static void main(String[] args) {
        HashMap<String, HashSet<String>> phonebook = new HashMap<>();
        addContact(phonebook, "Петросян", "12345");
        addContact(phonebook, "Галкин", "23456");
        addContact(phonebook, "Кашпировский", "34567");
        addContact(phonebook, "Галкин", "45678");
        addContact(phonebook, "Полежайкин", "56789");
        addContact(phonebook, "Кашпировский", "67890");
        addContact(phonebook, "Полежайкин", "78901");
        addContact(phonebook, "Галкин", "89012");

        printPhonebook(phonebook);
    }

    public static void addContact(HashMap<String, HashSet<String>> phonebook, String name, String phoneNumber) {
        HashSet<String> numbers = phonebook.getOrDefault(name, new HashSet<>());
        numbers.add(phoneNumber);
        phonebook.put(name, numbers);
    }

    public static void printPhonebook(HashMap<String, HashSet<String>> phonebook) {
        List<Map.Entry<String, HashSet<String>>> sortedContacts = new ArrayList<>(phonebook.entrySet());
        sortedContacts.sort(Comparator.comparingInt(entry -> -entry.getValue().size()));

        for (Map.Entry<String, HashSet<String>> entry : sortedContacts) {
            String name = entry.getKey();
            HashSet<String> numbers = entry.getValue();
            System.out.println(name + ": " + numbers);
        }
    }
}
