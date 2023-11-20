package Clases;

public class Registro {
    public String placa;  
    public String prop;
    public String fecha;
    public int horEnt;
    public int horSal;
    public int minEnt;
    public int minSal;
    public int tiempo;
    public int valorpagar;

    public Registro(String placa, String prop, String fecha, int horEnt, int horSal, int minEnt, int minSal, int tiempo, int valorpagar) {
        this.placa = placa;
        this.prop = prop;
        this.fecha = fecha;
        this.horEnt = horEnt;
        this.horSal = horSal;
        this.minEnt = minEnt;
        this.minSal = minSal;
        this.tiempo = tiempo;
        this.valorpagar = valorpagar;
    }
}

