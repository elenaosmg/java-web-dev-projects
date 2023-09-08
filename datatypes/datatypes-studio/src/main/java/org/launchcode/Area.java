package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Basic solution
//        System.out.println("Enter a radius: ");
//        double radius = input.nextDouble ();
//        double area = Circle.getArea(radius);
//        System.out.println("The area of a circle of radius " +
//                radius + " is: " + area);




        //  Bonus 1. Validation without loop
//      System.out.println("Enter a radius: ");
//        if (input.hasNextDouble()) {
//            double radius = input.nextDouble();
//
//            if (radius > 0) {
//                double area = Circle.getArea(radius);
//                System.out.println("The area of a circle of radius " +
//                        radius + "is: " + area);
//            } else {
//                System.out.println("Radius should be a positive number.");
//            }
//        } else {
//            System.out.println("This is not a valid input.");
//        }


        // Bonus 2. Loop

        double radius; // add before loop, so that it is
        // accessible out of the loop too

        do {
            System.out.println("Enter a positive number for the radius: ");
            while (!input.hasNextDouble()) {
                System.out.println("The radius must be a positive number! Try again!");
                input.next();
            }
            radius = input.nextDouble();
        }   while (radius <=0);

        double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + "is: " + area);


        input.close();
    }

}





