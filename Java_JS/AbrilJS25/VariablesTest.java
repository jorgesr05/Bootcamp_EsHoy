package Java_JS.AbrilJS25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class VariablesTest {
    
    public static void main(String[] args) {
        double estatura = 1.87;
        int estaturaCerrada;
        
        estaturaCerrada = (int) estatura;

        float estaturaFlotante = estaturaCerrada;

        System.out.println(estatura);
        System.out.println(estaturaCerrada);
        System.out.println(estaturaFlotante);

        
        long start = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        System.out.println("Suma: " + sum);
        long end = System.currentTimeMillis();
        double total = (double) (end - start) / 1000;
        System.out.println("Tiempo de ejecución: " + total + " segundos");
        
        long start2 = System.currentTimeMillis();
        int sum2 = 0;
        for (byte i = 0; i < 100; i++) {
            sum2 += i;
        }
        System.out.println("Suma: " + sum2);
        long end2 = System.currentTimeMillis();
        double total2 = (double) (end2 - start2) / 1000;
        System.out.println("Tiempo de ejecución: " + total2 + " segundos");

        int[] bingo;
        bingo = new int[5];
        bingo[0] = 12;
        bingo[1] = 16;
        bingo[2] = 32;
        bingo[3] = 18;
        bingo[4] = 7;

        System.out.println(bingo[3]);

        int[] loteria = {4, 8, 48, 5, 9};
        System.out.println(loteria[2]);

        ArrayList<Integer> chance = new ArrayList<Integer>();
        chance.add(42);
        chance.add(38);
        System.out.println(chance);
        chance.add(18);
        System.out.println(chance);

        int num = (int) (Math.random()*10);

        while (num<7) {
            num = (int) (Math.random()*10);
            System.out.println(num);
            
        }
        System.out.println("-------------------------");
        for(int i=0; i<20; i+=2){
            System.out.println(i);
        }

        System.out.println("-------------------------");
        for(int j=0; j<loteria.length; j+=2){
            System.out.println(loteria[j]);
        }

        System.out.println(chance.getLast());

        System.out.println("-------------------------");
       
        for(Integer numero: chance){
            System.out.println(numero);
            // otras operaciones que usan name
        }
        
        HashMap<String, String> glosario = new HashMap<String, String>();
        glosario.put("perro", "mamífero perteneciente a la familia de los cánidos");
        glosario.put("gato", "mamífero perteneciente a la familia de los félidos");
        glosario.put("chinchilla", "mamífero perteneciente a la familia de los roedores");
        glosario.put("alpaca", "mamífero perteneciente a la familia de los cámelidos");
     
        System.out.println(glosario);

        System.out.println(glosario.get("chinchilla"));

        /* extracción llaves */
        Set<String> keys = glosario.keySet();
        System.out.println(keys);

        for(String key : keys){
            System.out.println(key);
            System.out.println(glosario.get(key));
        }
    }
}
