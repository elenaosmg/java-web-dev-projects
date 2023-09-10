package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<String,String> students = new HashMap <> ();
        Scanner input = new Scanner (System.in);

        String newStudentId;

        System.out.println("Enter your student: ");



        do {
            System.out.println("Student ID: ");
            newStudentId = input.nextLine();

            if (!newStudentId.equals("")) {
                System.out.println("Student Name: ");
                String newStudentName = input.nextLine();
                students.put(newStudentId,newStudentName);

                //input.nextLine();
            }


        } while (!newStudentId.equals(""));

        System.out.println("\nClass roster: ");

        for (Map.Entry<String,String> student : students.entrySet ()) {
            System.out.println(student.getKey() + " (" + student.getValue () + ")");
        }
    }
}
