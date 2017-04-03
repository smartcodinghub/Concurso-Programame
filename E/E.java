/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ovicentp
 */
public class E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        InputStream s = System.in;
        //s = new FileInputStream(".\\src\\E\\test.txt");

        /* No uso try-withresources-catch muy caro para las mediciones que hacen en el concurso. 
         * En cualquir otro caso es obligatorio 
         */
        BufferedReader in = new BufferedReader(new InputStreamReader(s));

        while (in.ready()) {

            ReadTunnel(in);
        }

        in.close();
    }

    private static void ReadTunnel(BufferedReader in) throws IOException {

        System.out.println("T---------T");
        String tunnel = in.readLine();
        int tunnelLength = tunnel.length();
        /* Half of the max value, so it won't be never over 500 */
        ArrayList<Integer> tunnelTlf = new ArrayList<Integer>(250);

        for (int i = 0; i < tunnelLength; i++) {
            if (tunnel.charAt(i) == 'T') {
                tunnelTlf.add(i);
            }
        }

        int count = Integer.parseInt(in.readLine());

        for (int i = 0; i < count; i++) {

            String runTo = null;
            int position = Integer.parseInt(in.readLine()) - 1;
            int found = Collections.binarySearch(tunnelTlf, position);

            /* We are at a tlf */
            if (found >= 0) {
                System.out.println("AQUI");
                continue;
            }

            found = found * -1 - 1;

            int left = found == 0 ? -1 : tunnelTlf.get(found - 1);
            int right = found == tunnelLength || found >= tunnelTlf.size() ? tunnelLength : tunnelTlf.get(found);

            int leftDiff = position - left;
            int rightDiff = right - position;

            if (leftDiff < rightDiff) {
                System.out.println("PENINSULA");
            } else if (leftDiff > rightDiff) {
                System.out.println("ISLAS");
            } else {

                if (left <= tunnelLength - position) {
                    System.out.println("PENINSULA");
                } else {
                    System.out.println("ISLAS");
                }
            }
        }
    }

}
