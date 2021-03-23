/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicializartxt;

import java.io.File;
import java.util.Scanner;
/**
 *
 * @author Lucas
 */
public class Inicializartxt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File fichero = new File("C:/aules/aules.txt");
        try {
            
            Scanner lectorFichero = new Scanner(fichero, "ISO-8859-1");
            
            while(lectorFichero.hasNext()) {
                System.out.println(lectorFichero.nextLine());
            }
            
            lectorFichero.close();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al abrir/leer el fichero");
        }
    }
    
}
