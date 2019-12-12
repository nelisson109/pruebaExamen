package com.martin.Views;

import com.martin.Logica.Logica;
import com.martin.Models.Persona;
import com.martin.Views.Filter.FiltrarNombre;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class  PantallaPrincipalController extends BaseController implements Initializable {
    @FXML
    private TextField tfFiltro;

    private FiltrarNombre filtro;

    @FXML
    private TableView<Persona> tvPersonas;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tvPersonas.setItems(Logica.getInstance().getListaPersonas());

    }

    @FXML
    public void filtrar(ActionEvent event){
        String nombre = tfFiltro.getText();
        filtro = new FiltrarNombre(Logica.getInstance().getListaPersonas());
        tvPersonas.setItems(filtro.filtrar(nombre));

    }

    @FXML
    public void add(ActionEvent event){
        DialogoPersonaController controller = (DialogoPersonaController) cargarDialogo("DialogoPersona.fxml", 400, 300);
        controller.getStage().setTitle("Gestionar Personas");
        controller.abrirDialogo(true);//espera qie le demos a guardar
        tvPersonas.setItems(Logica.getInstance().getListaPersonas());

    }
    @FXML
    public void modificar(ActionEvent event){
        Persona persona = tvPersonas.getSelectionModel().getSelectedItem();
        DialogoPersonaController controller = (DialogoPersonaController) cargarDialogo("DialogoPersona.fxml", 400, 300);
        controller.setPersonaModificar(persona);
        controller.getStage().setTitle("Gestionar Personas");
        controller.abrirDialogo(true);//espera el guardado
        //luego borro la seleccionada y añado en esa posicion

        tvPersonas.setItems(Logica.getInstance().getListaPersonas());
    }

    @FXML
    public void eliminar(ActionEvent event){
        Persona persona;
        persona  = tvPersonas.getSelectionModel().getSelectedItem();
        Logica.getInstance().borrar(persona);
    }

}
