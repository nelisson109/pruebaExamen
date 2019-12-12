package com.martin.Views;

import com.martin.Logica.Logica;
import com.martin.Models.Persona;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class DialogoPersonaController extends BaseController implements Initializable {
    @FXML
    private TextField tfNombre;

    @FXML
    private TextField tfApellidos;

    @FXML
    private TextField tfEdad;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    public void guardar(ActionEvent event){
        Persona persona;
        String nombre, apellido;
        int edad;
        nombre = tfNombre.getText();
        apellido = tfApellidos.getText();
        edad = Integer.parseInt(tfEdad.getText());
      //  persona = new Persona(nombre, apellido, edad);
      //  Logica.getInstance().añadir(persona);
        getStage().close();
    }

    @FXML
    public void guardarModificacion(ActionEvent event){

    }
    @FXML
    public void cancelar(ActionEvent event){
        getStage().close();
    }
}
