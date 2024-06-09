package Java_JS.MayoJS07;

public class Scooter implements Cinetica{

    public double velocidad;
    public double aceleracionMaxima;
    public double potencia;
      
    
   
    public Scooter(double aceleracionMaxima, double potencia) {
        this.velocidad = 0;
        this.aceleracionMaxima = aceleracionMaxima;
        this.potencia = potencia;
    }
 
    /* Getters y setters */

    public double getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    public double getAceleracionMaxima() {
        return aceleracionMaxima;
    }
    public void setAceleracionMaxima(double aceleracionMaxima) {
        this.aceleracionMaxima = aceleracionMaxima;
    }
    public double getPotencia() {
        return potencia;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public void acelerar(double a, double t) {
        this.velocidad = this.velocidad +(a*t);
    
    }
    @Override
    public void frenar(double a, double t) {
        this.velocidad = this.velocidad-(a*t);
        
    }

    
    
}
