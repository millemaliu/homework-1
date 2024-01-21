package part3;


import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class InventoryTest
{
    @Test
    public void InvTest() throws IOException {
        assert newFileMade();
        guitars_added();
        searchTest();

    }

    boolean newFileMade() throws IOException {
        //tests if the inventory is creating a new file if none is present
        File save = new File("guitars_database.txt");
        if(!save.exists()) save.createNewFile();
        save.delete();
        Inventory x = new Inventory();
        return save.isFile();

    }

    void guitars_added() throws FileNotFoundException {
        //tests if the inventory is creating a new file if none is present, also tests getGuitar
        File save = new File("guitars_database.txt");
        Inventory x = new Inventory();
        x.addGuitar("2394310", 60.99, "Gibbons", "Trigger", "Medium", "Black", "Red");
        x.addGuitar("98491204", 49.00, "Gibbon", "Rust", "Large", "Brown", "Blue");
        x.addGuitar("98491704", 59.00, "Gib,bon", "Patience", "Small", "Gold", "Cream");
        String[] to_search = {"2394310", "98491204", "98491704"};



        Scanner read = new Scanner(save);
        String line = "";
        for (String sn: to_search) {
            if (line.equals("\n")) continue;
            line = read.nextLine();
            assert(line.equals(x.getGuitar(sn).toString()));

        }
        assert (x.getGuitar("00000") == null);
        read.close();
    }


    void searchTest() throws FileNotFoundException {
        //tests if the inventory searching properly
        Inventory x = new Inventory();
        Guitar exists1 = new Guitar("2394310", 60.99, "Gibbons", "Trigger", "Medium", "Black", "Red");
        Guitar not_exists = new Guitar("2395310", 60.99, "Gibbos", "Trigger", "Medium", "Black", "Red");
        Guitar exists2 = new Guitar("98491704", 59.00, "Gib,bon", "Patience", "Small", "Gold", "Cream");


        assert(x.search(exists1) != null);
        assert(x.search(not_exists) == null);
        assert(x.search(exists2) != null);


    }



}
