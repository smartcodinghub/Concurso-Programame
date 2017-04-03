/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author usraux
 */
public class D3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n,f,salida,total;
        
        
        
        
        while(true){
        
        String[] leido = in.readLine().split(" ");
        n = Integer.parseInt(leido[0]);
        f = Integer.parseInt(leido[1]);
        
        if(n == 0 && f == 0){
            
            System.exit(0);
        }
        salida = 0;
        total = 0;
        for(int i = 1;i < n+1;i++){
            
            if(i < n - f + 1+1){
            salida = salida + i;
            }
            total += i;
        }
        
        
        System.out.println(total - salida);
    }
    }
}

