package Java_JS.MayoJS08.GuardZooJS;

public class MurcielagoTest {
    
    public static void main(String[] args) {
        
        Muercielago batMan = new Muercielago();
        System.out.println("");
        
        batMan.atacarPueblo();
        batMan.atacarPueblo();
        batMan.atacarPueblo();
        batMan.mostrarEnergia();
        System.out.println("");

        batMan.comerHumanos();
        batMan.comerHumanos();
        batMan.mostrarEnergia();
        System.out.println("");
        
        batMan.volar();
        batMan.volar();
        batMan.mostrarEnergia();
        System.out.println("");
    }
}
