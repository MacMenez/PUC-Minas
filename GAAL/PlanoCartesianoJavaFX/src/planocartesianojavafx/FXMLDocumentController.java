/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package planocartesianojavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author asimov
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label mensagemAviso;
    private TextField campoInserirCord;
    
    @FXML
    private void inserirPonto(ActionEvent event) {
        String coordenadas = campoInserirCord.getText();
        String[] pontos = coordenadas.split(",");
        Boolean validarX = false, validarY = false;
        
        try {
            int x = Integer.parseInt(pontos[0]);
            if((x >= -6) && (x <= 6)){ 
                mensagemAviso.setText("Ponto X Válido!"); 
                validarX = true;
            }
            else{ mensagemAviso.setText("Ponto X Inválido!"); }
        } catch (Exception e) { mensagemAviso.setText("Formatação Inválida no Ponto X!"); }
        
        try {
            int y = Integer.parseInt(pontos[1]);
            if((y >= -6) && (y <= 6)){ 
                mensagemAviso.setText("Ponto Y Válido!");
                validarY = true;
            }
            else{ mensagemAviso.setText("Ponto Y !"); }
        } catch (Exception e) { mensagemAviso.setText("Formatação Inválida no Ponto Y!"); }
        
        if(validarX && validarY){ mensagemAviso.setText("Ponto inserido com sucesso!"); }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
