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
       try {
            FileWriter writer = new FileWriter(fichero);
            
            writer.write("Línea 1\n");
            writer.write("Línea 2\n");
            writer.write("Línea 3\n");
            
            writer.close();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al crear/escribir en el fichero");
        }
    }
    
}
