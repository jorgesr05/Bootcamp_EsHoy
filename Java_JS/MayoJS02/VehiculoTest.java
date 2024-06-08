package Java_JS.MayoJS02;

public class VehiculoTest {
    
    public static void main(String[] args) {
        
        /* Instancia */

        Vehiculo mustang = new Vehiculo(4,260,4,1450,2,"muscle","automovil",true,4.0);
        
        Vehiculo hillux = new Vehiculo(180, 2500, "runner", 3);
        System.out.println(hillux.getVelocidad());
        System.out.println(hillux.getRuedas());

    }
}
