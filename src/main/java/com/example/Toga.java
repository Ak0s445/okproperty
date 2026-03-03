/*
* File: Toga.java
* Author: Sallai András
* Copyright: 2026, Sallai András
* Group: szit.hu
* Date: 2026-03-03
* Github: https://github.com/oktatrefakt/
* Licenc: MIT
*/

package com.example;

import java.util.Scanner;

/*
A Toga bekéri egy ingatlan 3 adatát. 
Település (city), cím (address), irányítószáma (zip) */
public class Toga {
    /*
    A sim végzi a bekérést:
    */
    public void sim() {
        /*
        A try(){} szerkezet catch ág nélkül
        csak arra való, hogy a sima zárójelben () 
        megnyitott objektum, a {} blokk végére
        automatikusan bezárja.  */
        try(Scanner u = new Scanner(System.in)){
            System.out.print("Ingatlan települése: ");
            //Ingatlan települése az s változóban
            String s = u.nextLine();
            System.out.print("Ingatlan címe: ");
            //Ingatlan címe az l változóban
            String l = u.nextLine();
            System.out.print("Ingatlan irányítószáma: ");
            //Ingatlan irányítószáma az p változóban van
            String p = u.nextLine();
            
            /*
            A Tal osztályból t objektum az adatokat tartalmazza.
            */
            Tal t = new Tal();
            t.a = s;
            t.b = l;
            t.zip = Integer.parseInt(p);
            
            //Kiírjuk a konzolra
            System.out.println(t.a + " " + t.b + " " + t.zip);
            //Kiírjuk fájlba is:
            Fem.le(t.a + ":" + t.b + ":" + t.zip);

        }
    }   
}
