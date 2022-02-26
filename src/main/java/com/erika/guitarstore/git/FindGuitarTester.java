package com.erika.guitarstore.git;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        //Set up guitar inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);
                
        GuitarSpec erinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER);
        System.out.println("Erin wishes to see something like this = " + erinLikes.toString());
        
        List matchingGuitars = inventory.search(erinLikes);
        System.out.println("Matching list = " + matchingGuitars);
        
        if(!matchingGuitars.isEmpty()){
            System.out.println("Erin might like these:");
            for(Iterator i = matchingGuitars.iterator(); i.hasNext();){
                Guitar guitar = (Guitar)i.next();
                GuitarSpec spec = guitar.getSpec();
                System.out.println("This: " + guitar.getSerialNumber() + " - " + spec.getBuilder() + " - " + spec.getModel() + " - " + spec.getType() + " - " + guitar.getPrice());
            }        
        } else {
            System.out.println("Nothing here.");
        }        
    }

    private static void initializeInventory(Inventory inventory) {
        GuitarSpec addSpec1 = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("V95693", 1499.99, addSpec1);
        
        GuitarSpec addSpec2 = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("ZM007", 2799.99, addSpec2);
        inventory.addGuitar("ABC12", 359.99, new GuitarSpec(Builder.COLLINGS, "Tonante", Type.ACOUSTIC, 12, Wood.BRAZILIAN_ROSEWOOD, Wood.MAPLE));
        
        System.out.println("Successfully added.");
    }   
}
