package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	AlienDictionary dizionario = new AlienDictionary();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtInsert;

    @FXML
    private Button btnTranslate;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnClear;

    @FXML
    void doClear(ActionEvent event) {

    }

    @FXML
    void doTranslate(ActionEvent event) {
    	
    	String input[] = txtInsert.getText().split(" ");
    	
    	if(txtInsert.getText().contains(" ")) {         //abbiamo due termini, dunque aggiungiamo una word al dizionario
    		
    		dizionario.addWord(input[0], input[1]);
    	}
    	else {
    		
    		txtResult.setText(dizionario.translateWord(input[0]));
    	}
    	

    }

    @FXML
    void initialize() {
        assert txtInsert != null : "fx:id=\"txtInsert\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
