/*
* File: Main.java
* Author: Sallai András
* Copyright: 2026, Sallai András
* Group: szit.hu
* Date: 2026-03-03
* Github: https://github.com/oktatrefakt/
* Licenc: MIT
*/

/*
Az osztály milyen csomagba tartozik
*/
package com.example;

//A főosztály
public class Main {
    /* A Main a főosztály. A főosztályban a fő 
    metódus a main() metódus, aminek az args egy kötelező
    paramétere. Más nyelvekben elhagyható, itt nem. */
    public static void main(String[] args) {
        System.out.println("Ingatlan tárolása...");
        Toga t = new Toga();
        t.sim();
    }//main vége
}//Main osztály vége