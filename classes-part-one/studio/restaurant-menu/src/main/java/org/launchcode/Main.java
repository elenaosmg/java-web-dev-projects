package org.launchcode;

public class Main {

    public static void main (String [] args) {

        // TODO: Create 5 menu items in different categories

        MenuItem item1 = new MenuItem ("ravioli", "filled with meat, sour cream added", 10.20, "main course");
        MenuItem item2 = new MenuItem ("salad", "veg salad with oil", 11.20, "appetizer");
        MenuItem item3 = new MenuItem ("fresh fruit", "oranges, bananas", 7.20, "dessert");
        MenuItem item4 = new MenuItem ("soup", "cabbige soup", 6.20, "main course");
        MenuItem item5 = new MenuItem ("fish", "salted herring with onion", 10.20, "appetizer");

        System.out.println(item1.isNew());


        // TODO: Print 1st item

        System.out.println(item1);


        // TODO: Create menu

        Menu menu = new Menu();


        // TODO: Add items to menu and print it

        menu.addItem (item1);
        menu.addItem (item2);
        menu.addItem (item3);
        menu.addItem (item4);
        menu.addItem (item5);

        System.out.println(menu);


        // TODO: Remove an item and print menu

        menu.removeItem (item4);
        System.out.println(menu);

        // TODO: Test equals method

        System.out.println((item1.equals(item2)));

        MenuItem item6 = new MenuItem("fish", "salted herring with onion", 10.20, "appetizer");

        System.out.println((item5.equals(item6)));

        // BONUS MISSION


        // TODO: Attempt to add a duplicate item, then print menu to confirm it wasn't added

        menu.addItem(item6);
        System.out.println((menu));

        menu.addItem(item1);





    }

}
