/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author usraux
 */
public class B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n,x,y,it;
        double aux;
        
        it = Integer.parseInt(in.readLine());
        for(int j = 0; j < it;j++){
        n = Integer.parseInt(in.readLine());
        
        for(int i = n-1; i >= 0;i--){
            
            x = i;
            aux = Math.sqrt(Math.pow(n, 2) - Math.pow(x, 2));
            y = (int) aux;
            if(aux - y == 0){
                
                System.out.println(x + y);
                break;
            }
            
        }
        }
        
    }
}

