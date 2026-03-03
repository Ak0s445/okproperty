/*
* File: PropertyFileWriter.java
* Author: Sallai András
* Copyright: 2026, Sallai András
* Group: szit.hu
* Date: 2026-03-03
* Github:https://github.com/Ak0s445/okproperty.git
* Refaktorálva: Cipola Ákos, 2026-03-03, II-N
* Licenc: MIT
*/

package com.example;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class PropertyFileWriter {

    private static final String FILE_NAME = "adat.txt";

    public static void write(String content) {
        try {
            FileWriter writer =
                new FileWriter(FILE_NAME, Charset.forName("utf-8"), true);

            writer.write(content);
            writer.write("\n");
            writer.close();

        } catch (IOException e) {
            System.err.println("Hiba: " + e.getMessage());
        }
    }
}