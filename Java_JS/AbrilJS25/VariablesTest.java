package Java_JS.AbrilJS25;

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
        Integer sum = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println("Suma: " + sum);
        long end = System.currentTimeMillis();
        double total = (double) (end - start) / 1000;
        System.out.println("Tiempo de ejecución: " + total + " segundos");
        
        


    }
}
