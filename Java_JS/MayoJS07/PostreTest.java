package Java_JS.MayoJS07;

public class PostreTest {

    public static void main(String[] args) {
        
        Postre arrozZambito = new Postre();
        arrozZambito.setNombre("Arroz Zambito");
        arrozZambito.setMomento("postre");
        arrozZambito.consumir();

        Postre arrozLeche = new Postre(true,true,"Banana Split",false,false,"Americano","Leche",false, true, false,"chispas de colores");

        
    }
    
}
