/*
* File: Main.java
* Author: Sallai András
* Copyright: 2026, Sallai András
* Group: szit.hu
* Date: 2026-03-03
* Github:https://github.com/Ak0s445/okproperty.git
* Refaktorálva: Cipola Ákos, 2026-03-03, II-N
* Licenc: MIT
*/

package com.example;

public class Main {

    public static void main(String[] args) {

        System.out.println("Ingatlan tárolása...");
        ConsolePropertyHandler handler =
        new ConsolePropertyHandler();
        handler.collectPropertyData();
    }
}