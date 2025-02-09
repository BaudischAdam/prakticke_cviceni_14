package com.baudisch.tridy;

import com.baudisch.vyjimky.VyjimkaNeplatnehoVeku;

public class AgeValidator {
    /**
     * Metoda ověří věk a vyhodí výjimku, pokud je nižší než 18.
     *
     * @param age jevěk k ověření
     * @throws VyjimkaNeplatnehoVeku pokud je věk nižší než 18
     */

    public static void checkAge(int age) throws VyjimkaNeplatnehoVeku {
        if (age < 18) {
            throw new VyjimkaNeplatnehoVeku("Musí Vám být více jak 18");
        }
        System.out.println("Věk je dostatečný");
    }

    public static void main(String[] args) {
        try {
            checkAge(16); // Očekává se vyhození výjimky
        } catch (VyjimkaNeplatnehoVeku e) {
            System.out.println("Zachycena výjimka: " + e.getMessage());
        }
    }
}
