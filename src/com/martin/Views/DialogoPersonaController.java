package com.martin.Views;

import com.martin.Logica.Logica;
import com.martin.Models.Persona;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
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

    private Persona personaModificar;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void setPersonaModificar(Persona personaModificar){//me establece los valores que voy a cambiar para verlos
        this.personaModificar = personaModificar;//importantisimo, sino crea nueva persona
        tfNombre.setText(personaModificar.getNombre());
        tfApellidos.setText(personaModificar.getApellido());
        tfEdad.setText(String.valueOf(personaModificar.getEdad()));
    }

    @FXML
    public void guardar(ActionEvent event){
        if (personaModificar!=null){//modificamos persona que ya existe
            personaModificar.setNombre(tfNombre.getText());
            personaModificar.setApellido(tfApellidos.getText());
            personaModificar.setEdad(Integer.parseInt(tfEdad.getText()));
            Logica.getInstance().modificar(personaModificar);

        }
        else{//alta nueva
            String nombre, apellido;
            int edad;
            nombre = tfNombre.getText();
            apellido = tfApellidos.getText();
            edad = Integer.parseInt(tfEdad.getText());
            Persona persona = new Persona(nombre, apellido, edad);
            Logica.getInstance().añadir(persona);
        }
        getStage().close();
    }

    @FXML
    public void cancelar(ActionEvent event){
        getStage().close();
    }
}
