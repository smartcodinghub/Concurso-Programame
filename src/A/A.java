/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author usraux
 */
public class A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n,casos,iteraciones;
        String aux,aux2;
        
        casos = Integer.parseInt(in.readLine());
        for(int i = 0; i < casos;i++){
            
            
        aux = in.readLine();
        
        n = Integer.parseInt(aux);
        iteraciones = 1;
        while(n < 1000000000){
        
            
            aux = "" + n;
            aux2 = reverse(aux);   
        
            n = Integer.parseInt(aux) + Integer.parseInt(aux2);
        
        if(reverse("" + n).equals("" + n)){
            
            System.out.println(iteraciones + " " + n); 
            break;
            
        }
            
                    
        
        iteraciones++;
        }
        if(!reverse("" + n).equals("" + n)){
            
            System.out.println("Lychrel?");             
        }
           
        }
    }
    
    static String reverse(String aux){
        
        String aux2 = "";
        for(int i = 0;i < aux.length();i++){
            
             aux2 =   aux.charAt(i) + aux2;
        }
        
        return aux2;
    }
}

