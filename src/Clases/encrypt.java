package Clases;
import java.util.Base64;

public class encrypt {
       
    public static String messageEncrypt(String encrypt){
        String messageencrypt = Base64.getEncoder().encodeToString(encrypt.getBytes());
        return messageencrypt;
    }
    
    public static String messageDecrypted(String decrypted){
        byte[] messagedecrypt = Base64.getDecoder().decode(decrypted);
        String message = new String(messagedecrypt);
        
        return message;
    }
}
