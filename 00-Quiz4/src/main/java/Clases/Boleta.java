/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Personal
 */
public class Boleta {
    private String fecha, clDoc, clNom, clApl, opNom, pelicula, horario;
    private int cant, sala, precio;

    public Boleta(String fecha, String clDoc, String clNom, String clApl, String opNom, String pelicula, String horario, int cant, int sala, int precio) {
        this.fecha = fecha;
        this.clDoc = clDoc;
        this.clNom = clNom;
        this.clApl = clApl;
        this.opNom = opNom;
        this.pelicula = pelicula;
        this.horario = horario;
        this.cant = cant;
        this.sala = sala;
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public String getClDoc() {
        return clDoc;
    }

    public String getClNom() {
        return clNom;
    }

    public String getClApl() {
        return clApl;
    }

    public String getOpNom() {
        return opNom;
    }

    public String getPelicula() {
        return pelicula;
    }

    public String getHorario() {
        return horario;
    }

    public int getCant() {
        return cant;
    }

    public int getSala() {
        return sala;
    }

    public int getPrecio() {
        return precio;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setClDoc(String clDoc) {
        this.clDoc = clDoc;
    }

    public void setClNom(String clNom) {
        this.clNom = clNom;
    }

    public void setClApl(String clApl) {
        this.clApl = clApl;
    }

    public void setOpNom(String opNom) {
        this.opNom = opNom;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public int calcularPrecio(int cantidad){
        this.precio=cantidad*2;
        return precio;
    }
}
