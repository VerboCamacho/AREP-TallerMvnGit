package edu.escuelaing.arem.ASE.app;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Verbo Camacho Villamarin
 */
public class ReadFile {
    LinkedList lista = null;
    /**
     * Method to read the file
     * @param  archivo String
     *
     */
    public ReadFile(String archivo) {
        try{
            lista= new LinkedList();
            String lectura;
            BufferedReader lector = new BufferedReader(new FileReader(archivo));

            while ((lectura = lector.readLine())!= null){
                lista.addNode(Float.parseFloat(lectura));
            }
            lector.close();

        }catch(Exception e){
            System.err.println("Archivo no encontrado");
        }
    }

    /**
     * Method to get the list with data
     * @return lista LinkedList
     */

    public LinkedList getData(){

        return lista;
    }



}
