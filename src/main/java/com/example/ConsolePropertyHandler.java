/*
* File: ConsolePropertyHandler.java
* Author: Sallai András
* Copyright: 2026, Sallai András
* Group: szit.hu
* Date: 2026-03-03
* Github:https://github.com/Ak0s445/okproperty.git
* Refaktorálva: Cipola Ákos, 2026-03-03, II-N
* Licenc: MIT
*/

package com.example;

import java.util.Scanner;

public class ConsolePropertyHandler {

    public void collectPropertyData() {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Ingatlan települése: ");
            String city = scanner.nextLine();

            System.out.print("Ingatlan címe: ");
            String address = scanner.nextLine();

            System.out.print("Ingatlan irányítószáma: ");
            String zipInput = scanner.nextLine();

            Property property = new Property();
            property.city = city;
            property.address = address;
            property.zipCode = Integer.parseInt(zipInput);

            System.out.println(
                property.city + " " +
                property.address + " " +
                property.zipCode
            );

            PropertyFileWriter.write(
                property.city + ":" +
                property.address + ":" +
                property.zipCode
            );
        }
    }
}