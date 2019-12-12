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
  //  private ObservableList<Persona> listaFiltrada = FXCollections.observableArrayList();

    public ObservableList<Persona> getListaPersonas(){
        return listaPersonas;
    }



    public void añadir(Persona persona){
        listaPersonas.add(persona);
    }

    public void borrar(Persona persona){
        listaPersonas.remove(persona);
    }

    public void modificar(Persona persona){
        int indice = listaPersonas.indexOf(persona);
        listaPersonas.set(indice, persona);
    }

}