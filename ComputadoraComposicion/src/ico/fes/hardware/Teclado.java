/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.hardware;

/**
 *
 * @author Usuario
 */
public class Teclado {
    private String marca;
    private String modelo;
    private float numeroDeTeclas;
    private String multimedia;

    public Teclado() {
    }

    public Teclado(String marca, String modelo, float numeroDeTeclas, String multimedia) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroDeTeclas = numeroDeTeclas;
        this.multimedia = multimedia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getNumeroDeTeclas() {
        return numeroDeTeclas;
    }

    public void setNumeroDeTeclas(float numeroDeTeclas) {
        this.numeroDeTeclas = numeroDeTeclas;
    }

    public String getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(String multimedia) {
        this.multimedia = multimedia;
    }

    @Override
    public String toString() {
        return "Teclado{" + "marca=" + marca + ", modelo=" + modelo + ", numeroDeTeclas=" + numeroDeTeclas + ", multimedia=" + multimedia + '}';
    }
    
    
}
