package org.launchcode;

import java.util.ArrayList;
import java.time.LocalDate;

public class Menu {
     private ArrayList <MenuItem> MenuItem = new ArrayList <> ();
     private LocalDate lastUpdated;


    public ArrayList<MenuItem> getMenuItem() {
        return MenuItem;
    }
}
