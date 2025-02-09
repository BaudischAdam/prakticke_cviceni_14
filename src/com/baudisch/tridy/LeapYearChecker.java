package com.baudisch.tridy;

import com.baudisch.vyjimky.MimoRozsahLet;

public class LeapYearChecker {

/**
 * Zjišťuje, zda je rok přestupný.
 *
 * @param year je rok k ověření
 * @return true pokud je rok přestupný, false pokud není
 * @throws MimoRozsahLet pokud rok není v rozsahu 1900-2100
 *
 */

public static boolean isLeapYear(int year) {
    if (year < 1900 || year > 2100) {
        throw new MimoRozsahLet("Rok " + year + " není v rozsahu 1900-2100.");
    }
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
}

public static void main(String[] args) {
    try {
        System.out.println("Rok 2000 je přestupný?: " + isLeapYear(2000));
        System.out.println("Rok 2023 je přestupný?: " + isLeapYear(2023));
        System.out.println("Rok 1800 je přestupný?: " + isLeapYear(1800)); // Očekává se výjimka
    } catch (MimoRozsahLet e) {
        System.out.println("Zachycena výjimka: " + e.getMessage());
    }
}
}
