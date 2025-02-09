package com.baudisch.vyjimky;

/**
 * Výjimka pokud rok není v rozsahu 1900-2100.
 */
public class MimoRozsahLet extends RuntimeException {
    public MimoRozsahLet(String message) {
        super(message);
    }
}
