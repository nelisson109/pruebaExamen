package com.martin.Logica;

public class Logica {


    private static Logica INSTANCE = null;

    private Logica() {
    }

    public static Logica getInstance() {
        if (INSTANCE == null)
            INSTANCE = new Logica();

        return INSTANCE;
    }
}