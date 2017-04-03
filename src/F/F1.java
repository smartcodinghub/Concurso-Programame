/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package f;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author usraux
 */
public class F1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        int casos;
        int total;
        casos = Integer.parseInt(in.readLine());
        
        for(int i = 0; i < casos;i++){
            total = 0;
            cadena = in.readLine();
            for(int j = 0; j < cadena.length();j++){
                
                total += new Integer(cadena.charAt(j));
            } 
            for(int j = total-1;j>=0;j--){
                if(!(j%2==0 || j%3==0 || j%5==0 || j%7==0 || j%11==0 || j%13==0 || j%17==0)){
                   
                    System.out.println(j);
                    break;
                }
            }
        }
        
        
    }
}

