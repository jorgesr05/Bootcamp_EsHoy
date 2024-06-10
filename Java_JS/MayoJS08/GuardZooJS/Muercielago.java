package Java_JS.MayoJS08.GuardZooJS;

public class Muercielago extends Mamifero{

    public Muercielago(){
        this.setNivelEnergia(300);
    }

    public void volar(){
        int energia = this.getNivelEnergia(); //Capturo la energia actual
        energia -= 50;
        this.setNivelEnergia(energia);//actualizo el valor a la nueva energia
        System.out.println("Sonido de murciélago volando");
        
        // this.nivelEnergia -= 5;
    } 

    public void comerHumanos(){
        int energia = this.getNivelEnergia(); //Capturo la energia actual
        energia += 25;
        this.setNivelEnergia(energia);//actualizo el valor a la nueva energia
        System.out.println("Comiendo humanos");
    }

    public void atacarPueblo(){
        int energia = this.getNivelEnergia(); //Capturo la energia actual
        energia -= 100;
        this.setNivelEnergia(energia);//actualizo el valor a la nueva energia
        System.out.println("Sonido pueblo en llamas");
    }
    
}
