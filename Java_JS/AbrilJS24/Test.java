package Java_JS.AbrilJS24;

public class Test {
    
    public static void saludar(){
        System.out.println("Hola");

    }

    public static void saludar(String nombre){
        System.out.print("Hola ");
        System.out.println(nombre);
    }
    
    public static void saludar(String nombre, Double hora){
        String saludo = "";
        if(hora>0 && hora<12){
            saludo = saludo.concat("Buenos días ");
        }
        else if(hora<19){
            saludo = saludo.concat("Buenas tardes ");
        }
        else {
            saludo = saludo.concat("Buenas noches ");
        }
        saludo = saludo.concat(nombre);
        
        System.out.println(saludo);
    }
    


    public static void main(String[] args) {
        
        /* Variables primitivas */
        int edad = 28; // int -> númerico entero
        double estatura = 1.85; // double -> númerico decimal
        char genero = 'M'; // char -> caracter sencillo
        boolean casado = true; // boolean -> valor lógico true/false
        long nit = 1234567891; // long-> valor númerico grande
        
        /* Variables no primitivas */
        Integer edad2 = 28; // Int -> númerico entero
        Double estatura2 = 1.85; // Double -> númerico decimal
        String genero2 = "M"; // String -> cadena de caracteres
        Boolean casado2 = true; // Boolean -> valor lógico true/false
        Long nit2 = (long) 123456; // Long-> valor númerico grande
        
        /* OBJETIVO ES REDUCIR CUALQUIER PROCESO A UNA SERIE DE INSTRUCCIONES */
        
        /* PARA COMPRAR HUEVOS */
        Integer numeroHuevos = -4;

        if(numeroHuevos<4 && numeroHuevos >=0){
            /* Si la es verdadera ejecuta el código */
            System.out.println("Hay que comprar más huevos");
        } 
        else if (numeroHuevos >= 8) {
            System.out.println("Hay que cocinarlos pronto");
        }
        else if(numeroHuevos <0){
            System.out.println("Estás debiendo huevos");
        }
        else {
            /* Cuando la condición del if no se cumple ejecuta el código else */
            System.out.println("Hay suficientes huevos");
        }

        /* SWITCH */
        String saludo = "Hola";
        System.out.println(saludo);

        switch (edad) {
            case 7:
                System.out.println("Niño");
                break;
            case 17:
                System.out.println("Joven");
                break;
            case 27:
                System.out.println("Señor");
                break;
            default:
                System.out.println("Mister");
                break;
        }

        System.out.println("Hola");
        System.out.println(genero == 'M'? "Señor" :"Señora");

        System.out.println("Prueba");
        System.out.println(genero2 == "M"? "Varón":"Madamme");

        System.out.println("Test");
        System.out.println(casado? "Happy":"Unhappy");

        /* String */

        String greetings = "Hi There";
        int lenght = greetings.length();
        System.out.println("La longitud de la frase es: "+ lenght);
        greetings = greetings.concat(" Mr Jorge");
        System.out.println(greetings);

        String sentence = "   ¡espacios por todas partes!   ";
        System.out.println(sentence.trim());

        saludar("Jorge",20.5);
        saludar();
        saludar("Juan");
        saludar("Katty",16.3);


    }

}
