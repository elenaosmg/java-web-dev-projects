package org.launchcode;
import java.time.LocalDate;
import java.util.ArrayList;


public class Menu {

    private ArrayList<MenuItem>menuItems = new ArrayList <>();
    private LocalDate lastUpdated;


    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }


    //TODO: Define custom toString method ()
    //List menu items list by category

    @Override
    public String toString () {
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("appetizer")) {
                appetizers.append('\n').append(item.toString()).append("\n");
            }
        } StringBuilder mainCourses = new StringBuilder();
            for (MenuItem item : menuItems) {
                if (item.getCategory().equals("main course")) {
                    mainCourses.append('\n').append(item.toString()).append("\n");
                }
            } StringBuilder desserts = new StringBuilder();
            for (MenuItem item : menuItems) {
                if (item.getCategory().equals("dessert")) {
                    desserts.append('\n').append(item.toString()).append("\n");
                }
            }
        return "\nOur MENU\n" +
                "APPETIZER" + appetizers.toString() + "\n" +
                "MAIN COURSES" + mainCourses.toString() + "\n" +
                "DESSERTS" + desserts.toString() + "\n";

        }


    //INSTANT METHODS
    //TODO: Define addItem()
    //Make sure to update LastUpdated anytime something is successfully added
    //Bonus mission: prevent addition of duplication
    void addItem (MenuItem newItem) {
        String message = "This item has already  been added";
        if (menuItems.contains(newItem)) {
            System.out.println(message);
            return;
        }
        for (MenuItem item : menuItems) {
            if (item.equals(newItem)) {
                System.out.println(message);
                return;
            }
        }
        menuItems.add(newItem);
        lastUpdated = LocalDate.now();


    }



    //TODO: Define removeItem()
    //Make sure to update LastUpdated anytime something is removed
    void removeItem (MenuItem item) {
        menuItems.remove(item);
        lastUpdated = LocalDate.now();
    }


}
