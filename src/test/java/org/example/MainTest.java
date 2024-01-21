package org.example;


import org.example.part2.ProblemsTest;
import org.example.part3.GuitarTest;
import org.example.part3.InventoryTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class MainTest {

    @Test
    void mainTest() throws IOException {
        GuitarTest a = new GuitarTest();
        a.GuiTarst();

        InventoryTest b = new InventoryTest();
        b.InvTest();

        ProblemsTest c = new ProblemsTest();
        c.test();

    }

}
