/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package g;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 *
 * @author usraux
 */
public class G3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        HashMap<String,String> letras = new HashMap();
        letras.put("A",".-");
        letras.put("B","-...");
        letras.put("C","-.-.");
        letras.put("D","-..");
        letras.put("E",".");
        letras.put("F","..-.");
        letras.put("G","--.");
        letras.put("H","....");
        letras.put("I","..");
        letras.put("J",".---");
        letras.put("K","-.-");
        letras.put("L",".-..");
        letras.put("M","--");
        letras.put("N","-.");
        letras.put("O","---");
        letras.put("P",".--.");
        letras.put("Q","--.-");
        letras.put("R",".-.");
        letras.put("S","...");
        letras.put("T","-");
        letras.put("U","..-");
        letras.put("V","...-");
        letras.put("W",".--");
        letras.put("X","-..-");
        letras.put("Y","-.--");
        letras.put("Z","--..");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            
            String comprobar = in.readLine();
            if(comprobar.isEmpty()){
                
                System.exit(0);
            }
            String solucion = "";
            for(Character c:comprobar.toCharArray()){
                
                if(c.toString().equalsIgnoreCase("o")){
                    
                    solucion += "-";
                }else if(c.toString().equalsIgnoreCase("e") || c.toString().equalsIgnoreCase("i") || c.toString().equalsIgnoreCase("a") || c.toString().equalsIgnoreCase("u")){
                    
                    solucion += ".";
                }
            }
            
            if((letras.get(comprobar.substring(0, 1).toUpperCase()).equals(solucion))){
                
                System.out.println(comprobar + " OK");
            }else{
                
                System.out.println(comprobar + " X");
            }
        }
    }
}

