package org.launchcode;

import java.util.Scanner;

public class MilesAndGas {

    public static void main (String [] args) {

        Scanner input = new Scanner (System.in);

        System.out.println ("Enter miles number: ");
        double miles = input.nextDouble();

        System.out.println ("Enter amount of consumed gas in gallons: ");
        double gas = input.nextDouble();
        input.close();

        double milesPerGallon = miles/gas;
        System.out.println("Your miles per gallon gas consumption is " + milesPerGallon);





    }
}
