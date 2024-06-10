package Java_JS.MayoJS08.GuardZooJS;

public class Gorila extends Mamifero{
    
    public void lanzarAlgo(){
        int energia = this.getNivelEnergia(); //Capturo la energia actual
        energia -= 5;
        this.setNivelEnergia(energia);//actualizo el valor a la nueva energia
        System.out.println("Lanzando piedras");
        
        // this.nivelEnergia -= 5;
    } 

    public void comerBananas(){
        int energia = this.getNivelEnergia(); //Capturo la energia actual
        energia += 10;
        this.setNivelEnergia(energia);//actualizo el valor a la nueva energia
        System.out.println("Deliciosos plátanos");
    }

    public void trepar(){
        int energia = this.getNivelEnergia(); //Capturo la energia actual
        energia -= 10;
        this.setNivelEnergia(energia);//actualizo el valor a la nueva energia
        System.out.println("Trepando árbol");
    }
}
