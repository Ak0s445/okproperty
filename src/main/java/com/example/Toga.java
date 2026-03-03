package com.example;

import java.util.Scanner;

public class Toga {
    /*
    Farba döntve a 
    */
    public void sim() {
        try(Scanner u = new Scanner(System.in)){
            System.out.print("Ingatlan települése: ");
            String s = u.nextLine();
            System.out.print("Ingatlan címe: ");
            String l = u.nextLine();
            System.out.print("Ingatlan irányítószáma: ");
            String p = u.nextLine();
            
            Tal t = new Tal();
            t.a = s;
            t.b = l;
            t.zip = Integer.parseInt(p);
            System.out.println(t.a + " " + t.b + " " + t.zip);
            Fem.le(t.a + ":" + t.b + ":" + t.zip);

        }
    }   
}
