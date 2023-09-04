package org.launchcode;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main  (String[] args) {
      double length;
      double width;
      double area;
       Scanner input;

      input = new Scanner (System.in);
      System.out.println("Enter length: ");
      length = input.nextDouble();

      System.out.println("Enter width: ");
      width = input.nextDouble();
      input.close();

      area = length*width;
      System.out.println("The area of a rectangle is " + area);
    }
}
