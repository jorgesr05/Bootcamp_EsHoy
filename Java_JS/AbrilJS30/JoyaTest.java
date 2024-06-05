package Java_JS.AbrilJS30;

public class JoyaTest {
    
    public static void main(String[] args) {
        
        /* Creación de instancia */
        Joya promiseRing = new Joya();


        /* Asignación del valor */
        promiseRing.setMaterial("Platino");
        /* Lectura del valor */
        System.out.println(promiseRing.getMaterial());
       
        promiseRing.setMarca("Pandora");
        promiseRing.setGramaje(24);
        promiseRing.setPiedra("Diamante");
        promiseRing.setOrigen("Perú");
        promiseRing.setGenero('F');
        promiseRing.setPrecio(3500);
        promiseRing.setTipo("Anillo de promesa");


        System.out.println(promiseRing.getMarca());
        System.out.println(promiseRing.getOrigen());
        System.out.println(promiseRing.getPrecio());

        if (promiseRing.getPrecio()>3000) {
            System.out.println("Está costoso");
        }
    }
}
