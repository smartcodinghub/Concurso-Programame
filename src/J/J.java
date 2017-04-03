/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author usraux
 */
public class J {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> anteriores;
        String[] sucesores;
        String dummy;
        int n;
        
        dummy = in.readLine();
        while(!dummy.equals("0")){
        
        anteriores = new ArrayList(Arrays.asList(in.readLine().split(" ")));
        dummy = in.readLine();
        sucesores = in.readLine().split(" ");
        
        
        for(int i = 0;i < sucesores.length; i++){
            
            String sucesor = sucesores[i];
            n = 0;
            for(int j = 0;j < anteriores.size();j++){
                
                if(sucesor.equals(anteriores.get(j))){
                    
                    n++;
                }
            }
            anteriores.add(sucesor);
            System.out.println(n+1);
        }
        System.out.println("");
        dummy = in.readLine();
        }
        System.exit(0);
    }
}

