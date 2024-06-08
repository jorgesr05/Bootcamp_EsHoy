package Java_JS.MayoJS02;

public class Vehiculo {
 
    private int pasajeros;
    private int velocidad;
    private int ruedas;
    private int peso;
    private int puertas;
    private String carroceria;
    private String categoria;
    private boolean automatico;
    private double cilindraje;

    public Vehiculo(int pasajeros, int velocidad, int ruedas, int peso, int puertas, String carroceria, String categoria, boolean automatico, double cilindraje){
        this.pasajeros = pasajeros;
        this.velocidad = velocidad;
        this.ruedas = ruedas;
        this.peso =peso;
        this.puertas = puertas;
        this.carroceria = carroceria;
        this.categoria = categoria;
        this.automatico = automatico;
        this.cilindraje = cilindraje;

    }

    

    /* Getters and Setters */

    public Vehiculo(int velocidad, int peso, String carroceria, double cilindraje) {
        this.velocidad = velocidad;
        this.peso = peso;
        this.carroceria = carroceria;
        this.cilindraje = cilindraje;
    }



    public int getPasajeros() {
        return pasajeros;
    }
    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }
    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public int getRuedas() {
        return ruedas;
    }
    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public int getPuertas() {
        return puertas;
    }
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    public String getCarroceria() {
        return carroceria;
    }
    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public boolean isAutomatico() {
        return automatico;
    }
    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }
    public double getCilindraje() {
        return cilindraje;
    }
    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    /* Getters and setters */
    
    
    

       


}
