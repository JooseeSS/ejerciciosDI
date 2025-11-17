/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Calculos {
    private String nombreOperacion;
    private int primerNumero;
    private int segundoNumero;
private double resultado;
    public Calculos(String nombreOperacion, int primerNumero, int segundoNumero, double resultado) {
        this.nombreOperacion = nombreOperacion;
        this.primerNumero = primerNumero;
        this.segundoNumero = segundoNumero;
        this.resultado = resultado;
    }

    public String getNombreOperacion() {
        return nombreOperacion;
    }

    public void setNombreOperacion(String nombreOperacion) {
        this.nombreOperacion = nombreOperacion;
    }

    public void setPrimerNumero(int primerNumero) {
        this.primerNumero = primerNumero;
    }

    public void setSegundoNumero(int segundoNumero) {
        this.segundoNumero = segundoNumero;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public int getPrimerNumero() {
        return primerNumero;
    }

    public int getSegundoNumero() {
        return segundoNumero;
    }

    public double getResultado() {
        return resultado;
    }
    public String[] toArrayString() {

    String[] s = new String[4];
    s[0] = nombreOperacion;
    s[1] = String.valueOf(primerNumero);   
    s[2] = String.valueOf(segundoNumero);  
    s[3] = String.valueOf(resultado);    
    return s;
}
}
