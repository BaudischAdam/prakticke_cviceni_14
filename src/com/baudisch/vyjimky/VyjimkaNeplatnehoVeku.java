package com.baudisch.vyjimky;

/**
 * Výjimka pokud je věk menší než 18.
 */
public class VyjimkaNeplatnehoVeku extends Exception {
    public VyjimkaNeplatnehoVeku(String message) {
        super(message);
    }
}
