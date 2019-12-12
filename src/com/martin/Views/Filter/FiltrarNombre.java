package com.martin.Views.Filter;

import com.martin.Models.Persona;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class FiltrarNombre {
    private ObservableList<Persona> listaPersonas;
    private ObservableList<Persona> listaFiltrada;

    public FiltrarNombre(ObservableList<Persona> listaPersonas){
        this.listaPersonas = listaPersonas;
        listaFiltrada = FXCollections.observableArrayList();

    }
    public ObservableList<Persona> filtrar(String nombre){
        if(nombre!=null && !"".equals(nombre)){
            listaFiltrada.clear();
            for(Persona persona : listaPersonas){
                if(persona.getNombre().equals(nombre)){
                    listaFiltrada.add(persona);
                }
            }
            return listaFiltrada;
        }else{
            return listaPersonas;
        }
    }
}
