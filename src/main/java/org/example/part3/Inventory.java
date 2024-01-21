package org.example.part3;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
    private ArrayList<Guitar> guitars = new ArrayList<>(); //It said in the image to have this, but i did also do the file

    Inventory() {
        File save = new File("./guitars_database.txt");
        try {
            Scanner read = new Scanner(save);
            String line;
            while (read.hasNextLine()) {
                line = read.nextLine();
                String[] args = line.split(","); //commas cant be in these so this works, see Guitar init
                if (args.length == 7) guitars.add(new Guitar(args[0],
                        Double.parseDouble(args[1]), args[2], args[3], args[4], args[5], args[6]));
            }
            read.close();

        } catch (FileNotFoundException e) {
            try {
                boolean success = save.createNewFile();
                System.err.println("new file needed, initialization success? " + success);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }

    }


    public void addGuitar(String serialNumber, double price,
                          String builder, String model, String type,
                          String backWood, String topWood) { // why wouldnt the input be a single Guitar object to add aaaaa
        Guitar to_add = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
        guitars.add(to_add);

        File save = new File("./guitars_database.txt");
        try {
            FileWriter fw = new FileWriter(save,true);
            fw.write(to_add.toString()+ "\n");
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public Guitar getGuitar(String serial) { // I assume the string in question is the serial number?
        for (Guitar g:
             guitars) {
            if (serial.equals(g.getSerialNumber())) {
                return g;
            }

        }
        return null;
    }

    public Guitar search(Guitar target) { // I don't get the point of this from name alone, what i made checks if the guitar is in the list.
        // if it is it returns the same guitar, if not it's null.
        for (Guitar test: this.guitars) {
            if (test.toString().equals(target.toString())) return target;
        }
        return null;
    }
}
