package Java_JS.AbrilJS24;

public class Test {
    
    public static void main(String[] args) {
        
        /* Variables primitivas */
        int edad = 28; // int -> númerico entero
        double estatura = 1.85; // double -> númerico decimal
        char genero = 'M'; // char -> caracter sencillo
        boolean casado = true; // boolean -> valor lógico true/false
        long nit = 1234567891; // long-> valor númerico grande
        
        /* Variables no primitivas */
        Integer edad = 28; // Int -> númerico entero
        Double estatura = 1.85; // Double -> númerico decimal
        String genero = 'M'; // String -> cadena de caracteres
        Boolean casado = true; // Boolean -> valor lógico true/false
        Long nit = 1234567891; // Long-> valor númerico grande
        
        /* OBJETIVO ES REDUCIR CUALQUIER PROCESO A UNA SERIE DE INSTRUCCIONES */
        
        /* PARA COMPRAR HUEVOS */
        Integer numeroHuevos = 3;

        if(numeroHuevos<4){
            /* Si la es verdadera ejecuta el código */
            System.out.println("Hay que comprar más huevos");
        } 
        else {
            /* Cuando la condición del if no se cumple ejecuta el código else */
            System.out.println("Hay suficientes huevos");
        }



    }
}
