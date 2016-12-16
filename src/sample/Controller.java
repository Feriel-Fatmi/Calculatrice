package sample;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.fxml.FXML;

public class Controller {
        @FXML
        private Label resultat;
        private double chiffre1 = 0;
        private double chiffre2 = 0;
        private String opperation ="";
        private boolean status = false;
        private Fonctions fonctions = new Fonctions();
        @FXML
        public void processchiffre(ActionEvent event){
            if (status == false){
                resultat.setText("");
                status = true;
            }
            String number = ((Button)event.getSource()).getText();
            resultat.setText(resultat.getText()+number);
        }

        @FXML
        public void processopperation(ActionEvent event){
            String nembre = ((Button)event.getSource()).getText();
            if(!nembre.equals("=")){
                if (!opperation.isEmpty()){
                    return;
                }
                opperation = nembre;
                chiffre1 = Long.parseLong(resultat.getText());
                resultat.setText("");
            }else{
                if (opperation.isEmpty()){
                    return;
                }
                double chiffre = Long.parseLong(resultat.getText());
                double output = fonctions.calculer(chiffre1,chiffre2,opperation);
                resultat.setText(String.valueOf(output));
                opperation ="";
                status = false;
            }
        }
    }
