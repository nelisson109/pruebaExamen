package com.martin.Logica;

import com.martin.Models.Persona;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Logica {
    private static Logica INSTANCE = null;

    private Logica() {
    }

    public static Logica getInstance() {
        if (INSTANCE == null)
            INSTANCE = new Logica();

        return INSTANCE;
    }

    private ObservableList<Persona> listaPersonas = FXCollections.observableArrayList();

    public ObservableList<Persona> getListaPersonas(){
        return listaPersonas;
    }

    public void añadir(Persona persona){
        listaPersonas.add(persona);
    }


}