/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package i;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author usraux
 */
public class I {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] leido;
        int t,p,d,salida;
        
        while(true){
        
        leido = in.readLine().split(" ");
        
        t = Integer.parseInt(leido[0]);
        p = Integer.parseInt(leido[1]);
        d = Integer.parseInt(leido[2]);
        if(t == 0 && p == 0 && d == 0){
            
            System.exit(0);
        }
        salida = (t/p * d) + (t - p*(t/p));
        
        System.out.println(salida);
        }
    }
}

