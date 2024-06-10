package Java_JS.MayoJS08.GuardZooJS;

public class Mamifero {
    
    private int nivelEnergia = 100;
    

    public Mamifero() {
    }
    

    public int mostrarEnergia(){
        System.out.println(this.nivelEnergia);
        return this.nivelEnergia;
    }


    /* GETTERS Y SETTERS */

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public void setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }


    

}
