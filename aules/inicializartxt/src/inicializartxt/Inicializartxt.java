/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicializartxt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Lucas
 */
public class Inicializartxt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File fichero = new File("C:/ProyectoM03/aules/aules.txt");
        
        ArrayList<String> lineas = new ArrayList<>();
        
        try {
             Scanner lectorFichero = new Scanner(fichero);
                      
            while(lectorFichero.hasNext()) {
                lineas.add(lectorFichero.nextLine());
            }
            
            lectorFichero.close();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al abrir/leer el fichero");
        }
        
        try {
            FileWriter writer = new FileWriter(fichero);
            
            for (String linea : lineas) {
                if (!"Línea 4".equals(linea)) {
                    writer.write(linea + "\n");
                }  else {
                    writer.write(linea + "\n");
                }
            }
            
            writer.close();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al abrir/sobreescribir el fichero");
        }
    }
    
}
