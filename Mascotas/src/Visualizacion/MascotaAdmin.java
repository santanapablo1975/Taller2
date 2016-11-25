/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visualizacion;

import Modelo.MascotasModel;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pc12
 */
public class MascotaAdmin {
    
     public void Guardar(MascotasModel modelo) {
    
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter("C:\\archivos\\mascotas.txt", true);
            pw = new PrintWriter(fichero);
            pw.println(modelo.getNombreMascota()+ "," + modelo.getRaza()+ "," + modelo.getVacunado()+ "," + modelo.getRuta());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para 
                // asegurarnos que se cierra el fichero.
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        
         
    }
     
      public List<MascotasModel>Mostrar() {
        
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        List<MascotasModel> lista = new ArrayList<>();
        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File("C:\\archivos\\mascotas.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            // Lectura del fichero
            String linea;           
            while ((linea = br.readLine()) != null) { //mientras haya linea mostramos
                MascotasModel modelo = new MascotasModel();
                String arreglo[] = linea.split(",");// metodo para partir un caracter !!! metodo CSV
                modelo.setNombreMascota(arreglo[0]);
                modelo.setRaza(arreglo[1]);
                modelo.setVacunado(arreglo[2].charAt(0));  // revizar                
                //modelo.setEdad(Integer.parseInt(arreglo[2]));
                modelo.setRuta(arreglo[3]);
                
                lista.add(modelo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
    
    
}
        
        return lista;
        
}
    
}
