
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Visita {
    private String ciudad;
    private Date fechaVisita;
    private String estacion;
    private int tempMax;
    private int tempMin;
    private double tempMed;
private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");

    public Visita(String ciudad, Date fechaVisita, String estacion, int tempMax, int tempMin, double tempMed) {
        this.ciudad = ciudad;
        this.fechaVisita = fechaVisita;
        this.estacion = estacion;
        this.tempMax = tempMax;
        this.tempMin = tempMin;
        this.tempMed = tempMed;
    }
    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Date getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(Date fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public String getEstacion() {
        return estacion;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }

    public int getTempMax() {
        return tempMax;
    }

    public void setTempMax(int tempMax) {
        this.tempMax = tempMax;
    }

    public int getTempMin() {
        return tempMin;
    }

    public void setTempMin(int tempMin) {
        this.tempMin = tempMin;
    }

    public double getTempMed() {
        return tempMed;
    }

    public void setTempMed(double tempMed) {
        this.tempMed = tempMed;
    }
    
    public String[] toArrayString(){
    String[] s = new String[6];
    s[0] = ciudad;
    s[1] = sdf.format(fechaVisita);
    s[2]= estacion;
    s[3]= String.valueOf(tempMin);
    s[4]= String.valueOf(tempMax);
    s[5]= String.valueOf(tempMed);
    return s;
    
    }
}
