/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Pc12
 */
public class MascotasModel {
    private String NombreMascota;
    private String Raza;
    private char   Vacunado;
    private String Ruta;

    /**
     * @return the NombreMascota
     */
    public String getNombreMascota() {
        return NombreMascota;
    }

    /**
     * @param NombreMascota the NombreMascota to set
     */
    public void setNombreMascota(String NombreMascota) {
        this.NombreMascota = NombreMascota;
    }

    /**
     * @return the Raza
     */
    public String getRaza() {
        return Raza;
    }

    /**
     * @param Raza the Raza to set
     */
    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    /**
     * @return the Vacunado
     */
    public char getVacunado() {
        return Vacunado;
    }

    /**
     * @param Vacunado the Vacunado to set
     */
    public void setVacunado(char Vacunado) {
        this.Vacunado = Vacunado;
    }

    /**
     * @return the Ruta
     */
    public String getRuta() {
        return Ruta;
    }

    /**
     * @param Ruta the Ruta to set
     */
    public void setRuta(String Ruta) {
        this.Ruta = Ruta;
    }
}
