package ProblemOnHashMap;

import java.util.*;

public class StudentMarks {

    public static void main(String[] args) {
        HashMap<String, Integer> studentMarks = new HashMap<>();

        studentMarks.put("Alice", 85);
        studentMarks.put("Bob", 92);
        studentMarks.put("Charlie", 78);
        studentMarks.put("David", 90);

        System.out.println("Marks of Bob: " + studentMarks.get("Bob"));
        System.out.println("\nStudents:");
        for (String student : studentMarks.keySet()) {
            System.out.println(student);
        }
// Iterating over key-value pairs
        System.out.println("\nStudent Marks:");
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
        System.out.println("\nDoes Alice exist? " + studentMarks.containsKey("Alice")); // true

        // Checking if a value exists
        System.out.println("Is 90 present? " + studentMarks.containsValue(90)); // true

        // Removing a key-value pair
        studentMarks.remove("Charlie");
        System.out.println("\nAfter removing Charlie: " + studentMarks);
    }

}
