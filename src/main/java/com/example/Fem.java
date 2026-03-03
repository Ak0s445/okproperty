/*
* File: Fem.java
* Author: Sallai András
* Copyright: 2026, Sallai András
* Group: szit.hu
* Date: 2026-03-03
* Github: https://github.com/oktatrefakt/
* Licenc: MIT
*/

package com.example;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class Fem {
    public static void le(String c) {
        try {
            FileWriter t = new FileWriter("adat.txt", Charset.forName("utf-8"), true);          t.write(c);             t.write("\n");             t.close();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
