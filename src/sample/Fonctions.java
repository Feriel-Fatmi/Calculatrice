package sample;
import java.lang.Exception;
public class Fonctions {
    public double calculer(double chiffre1, double chiffre2, String opperation )   {
        switch(opperation){
            case "+":return chiffre1+chiffre2;
            case "-":
                return  chiffre1-chiffre2;
            case "*":
                return chiffre1*chiffre2;
            case "/":
                if (chiffre2 == 0) throw new ArithmeticException("erreur");
                    else
                return  chiffre1/chiffre2;
            default:
                return 0;
        }
    }
}

