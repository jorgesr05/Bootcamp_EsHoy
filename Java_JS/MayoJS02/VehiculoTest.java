package Java_JS.MayoJS02;

public class VehiculoTest {
    
    public static void main(String[] args) {
        
        /* Instancia */

        System.out.println(Vehiculo.carrosFabricados);
        System.out.println(Vehiculo.listaVehiculos);

        Vehiculo mustang = new Vehiculo(4,350,4,1450,2,"muscle","automovil",true,4.0);
        System.out.println(Vehiculo.carrosFabricados);

        Vehiculo hillux = new Vehiculo(250, 2500, "runner", 3);
        System.out.println(hillux.getVelocidad());
        System.out.println(hillux.getRuedas());
        System.out.println(Vehiculo.carrosFabricados);

        mustang.acelerar(250);
        mustang.acelerar(280);

        hillux.acelerar(250);
        hillux.acelerar(280);

        mustang.acelerar(360,10);

        System.out.println(Vehiculo.carrosFabricados);
        System.out.println(Vehiculo.listaVehiculos);

        new Vehiculo(220,4);
        System.out.println(Vehiculo.carrosFabricados);
        System.out.println(Vehiculo.listaVehiculos);

        Vehiculo.listaVehiculos.get(2).acelerar(210);

        System.out.println(Vehiculo.getVehiculoVeloz().getVelocidad());
    }
}
