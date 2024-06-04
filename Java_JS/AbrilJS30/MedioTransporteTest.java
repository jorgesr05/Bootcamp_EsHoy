package Java_JS.AbrilJS30;

public class MedioTransporteTest {
    
    public static void main(String[] args) {
        
        String[] nombre = {};
        
        MedioTransporte chino = new MedioTransporte();
        chino.capacidad = 5000;
        chino.medio = "Terrestre";
        chino.velocidadMaxima = 90;
        chino.carga = false;
        chino.masivo = true;
        chino.unidadVelocidad = "km/h";

        MedioTransporte chosicano = new MedioTransporte();
        chosicano.capacidad = 4000;
        chosicano.medio = "Terrestre";
        chosicano.velocidadMaxima = 90;
        chosicano.carga = false;
        chosicano.masivo = true;
        chosicano.unidadVelocidad = "km/h";

        MedioTransporte barcoGeneral = new MedioTransporte();
        barcoGeneral.capacidad = 100000;
        barcoGeneral.medio = "Acuático";
        barcoGeneral.velocidadMaxima = 8;
        barcoGeneral.carga = true;
        barcoGeneral.masivo = false;
        barcoGeneral.unidadVelocidad = "kn/h";

        System.out.println("");
        System.out.println(nombre);
        System.out.println(chino);
        System.out.println(chosicano);
        System.out.println(barcoGeneral);

    }


}
