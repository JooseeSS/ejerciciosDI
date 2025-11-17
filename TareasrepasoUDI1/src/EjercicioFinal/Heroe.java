/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioFinal;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Usuario
 */
  
public class Heroe {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private String nombre;
    private String poder;
    private int nivel;
    private Date fechaAlta;

    public Heroe(String nombre, String poder, int nivel, Date fechaAlta) {
        this.nombre = nombre;
        this.poder = poder;
        this.nivel = nivel;
        this.fechaAlta = fechaAlta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    
    public  String[] toArrayString(){
    
    String[] s = new String[4];
    s[0] = nombre;
    s[1] = poder;
    s[2] = String.valueOf(nivel);
    s[3] = sdf.format(fechaAlta);

    return s;
    }
}
