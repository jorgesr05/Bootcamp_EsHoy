package Java_JS.AbrilJS24.JSCafeTask;

public class CafeJava {
    public static void main(String[] args) {
        
        String saludoGeneral = "Bienvenido al Café Java, ";
        String mensajePendiente = ", tu pedido estará listo en breve";
        String mensajeListo = ", tu pedido está listo";
        String mensajeMostrarTotal = "Tu total es $";

        double precioMocha = 3.5;
        double precioCapuchino = 2.5;
        double precioCafeLeche = 3.97;
        double precioFiltro = 2.11;
        
        String cliente1 = "Cindhuri";
        String cliente2 = "Sam";
        String cliente3 = "Jimmy";
        String cliente4 = "Noah";

        boolean estaListoOrden1 = false;
        boolean estaListoOrden2 = true;
        boolean estaListoOrden3 = true;
        boolean estaListoOrden4 = false;

        System.out.println(saludoGeneral + cliente1);
        System.out.println(cliente1 + mensajePendiente);
        System.out.println(cliente1 + mensajeListo);
        System.out.println(mensajeMostrarTotal + precioCapuchino);

        System.out.println(estaListoOrden3? cliente3+mensajeListo : cliente3+mensajePendiente);
        System.out.println(estaListoOrden4? cliente4+mensajeListo : cliente4+mensajePendiente);

        System.out.println(cliente2 + ", " + mensajeMostrarTotal + precioCafeLeche*2);
        System.out.println(estaListoOrden2? cliente2+mensajeListo : cliente2+mensajePendiente);

        System.out.println(cliente3+", disculpe pero "+mensajeMostrarTotal+(precioCafeLeche-precioFiltro));

    }
}
