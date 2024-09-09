package org.launchcode;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class GradebookHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> nameId = new HashMap<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name of the student(or hit Enter to finish)");
        String name;

        do {

            System.out.print("Student: ");
            name = input.nextLine();

            if (!name.equals("")) {
                System.out.print("Id: ");
                int id = input.nextInt();
                nameId.put(id, name);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!name.equals(""));
        input.close();

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : nameId.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }

        System.out.println("Number of students in roster: " + nameId.size());


    }
}
