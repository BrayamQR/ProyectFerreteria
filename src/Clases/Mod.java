package Clases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Mod {
    
    public static boolean validarEmail(String email){
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9\\+]+(\\.[_A-Za-z0-9-]+)*@"+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(email);
        
        return mather.find();
    }
    
    public String modeloTexto(String texto){
        String text="";
        char primeraLetra = ' ';
        char c = ' ';
        int aux=0;
        for(int i = 0; i < texto.length();i++){
            primeraLetra = texto.charAt(0);
            c = texto.charAt(i);
            if(primeraLetra == ' '){
                JOptionPane.showMessageDialog(null, "Su nombre no puede empezar con un ESPACIO ...","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if(!Character.isLetter(primeraLetra)){
                JOptionPane.showMessageDialog(null, "Su nombre debe empezar con un caracter alfavetico ...","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if(i == 0){
                c = Character.toUpperCase(c);
            }
            else if(i >= 1){
                c = Character.toLowerCase(c);
            }
            
            if(c == ' '){
                aux = (i+1);
            }
            if(aux == i){
                c = Character.toUpperCase(c);
            }
            text += c;
        }
        return text;
    }
}
