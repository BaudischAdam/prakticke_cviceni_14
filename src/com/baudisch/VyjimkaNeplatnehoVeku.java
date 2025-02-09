package com.baudisch;

/**
 * Výjimka pokud je věk menší než 18.
 */
public class VyjimkaNeplatnehoVeku extends Exception {
    public VyjimkaNeplatnehoVeku(String message) {
        super(message);
    }
}
