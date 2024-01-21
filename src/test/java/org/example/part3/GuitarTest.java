package org.example.part3;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class GuitarTest {

    @Test
    public void GuiTarst() {


        //Test 1: Init

        //basic guitar, test some get methods
        Guitar g1 = new Guitar("2394310", 60.99, "Gibbons", "Trigger", "Medium", "Black", "Red");
        assert(g1.getSerialNumber().equals("2394310"));
        assert(g1.getBuilder().equals("Gibbons"));
        assert(g1.getModel().equals("Trigger"));

        //second basic guitar, test rest of get methods
        Guitar g2 = new Guitar("2395310", 60.99, "Gibbos", "Trigger", "Medium", "Black", "Red");
        assert(g2.getType().equals("Medium"));
        assert(g2.getBackWood().equals("Black"));
        assert(g2.getTopWood().equals("Red"));

        //guitar with comma in name, should be removed.
        Guitar g3 = new Guitar("98491704", 59.00, "Gib,bon", "Patience", "Small", "Gold", "Cream");
        assert(g3.getBuilder().equals("Gibbon"));



        //Test 2: Prices

        assert(g1.getPrice() == 60.99);
        assert(g3.getPrice() == 59.00);
        //changed price
        g1.setPrice(99.99);
        assert(g1.getPrice() == 99.99);



        //Test 3: toString

        assert(g1.toString().equals("2394310,99.99,Gibbons,Trigger,Medium,Black,Red")); //new price
        assert(g2.toString().equals("2395310,60.99,Gibbos,Trigger,Medium,Black,Red")); //typical guitar
        assert(g3.toString().equals("98491704,59.0,Gibbon,Patience,Small,Gold,Cream")); //comma originally



    }

}
