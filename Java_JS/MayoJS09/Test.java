package Java_JS.MayoJS09;

import java.util.Date;

public class Test {

    public static void main(String[] args) {
        
        System.out.println("");
        System.out.println(ObrasDeArte.getContadorObras());
        System.out.println(ObrasDeArte.getListaObras());

        @SuppressWarnings("deprecation")
        ObrasDeArte unaNochesEstrellada = new ObrasDeArte("Vincent Van Gogh", new Date(1889,1,1), "pintura", "post impresionismo", "oleso sobre lienzo");

        unaNochesEstrellada.createRecord();

        System.out.println(ObrasDeArte.getContadorObras());
        System.out.println(ObrasDeArte.getListaObras());
        System.out.println("ID: " + unaNochesEstrellada.getId());

        @SuppressWarnings("deprecation")
        ObrasDeArte venusDeMilo = new ObrasDeArte("Alexandros", new Date(-160,1,1), "escultura", "naturalista", "escultura sobre marmol");

        venusDeMilo.createRecord();

        System.out.println(ObrasDeArte.getContadorObras());
        System.out.println(ObrasDeArte.getListaObras());
        System.out.println("ID: " + venusDeMilo.getId());

        @SuppressWarnings("deprecation")
        ObrasDeArte laNovenaSinfonia = new ObrasDeArte("Bethoven", new Date(1824,1,1), "música", "clásica", "composición musical");

        laNovenaSinfonia.createRecord();

        System.out.println(ObrasDeArte.getContadorObras());
        System.out.println(ObrasDeArte.getListaObras());
        System.out.println("ID: " + laNovenaSinfonia.getId());

        System.out.println("=========================");

        System.out.println(laNovenaSinfonia.toString());
    }
        
    }
    

