package Java_JS.MayoJS09;

import java.util.ArrayList;
import java.util.Date;

public class ObrasDeArte extends TablaBase{

    private static int contadorObras = 0;
    private static ArrayList<ObrasDeArte> listaObras = new ArrayList<ObrasDeArte> ();
    private static ArrayList<String> obrasGuardadas = new ArrayList<String>();

    public static ArrayList<String> getObrasGuardadas() {
        return obrasGuardadas;
    }

    public static void setObrasGuardadas(ArrayList<String> obrasGuardadas) {
        ObrasDeArte.obrasGuardadas = obrasGuardadas;
    }

    private String autor;
    private Date creacion;
    private String tipo;
    private String corriente;
    private String categoria;
    
    

    /* Implementación de métodos abstractos */

    public ObrasDeArte(String autor, Date creacion, String tipo,
            String corriente, String categoria) {
        super(contadorObras +1, new Date(), new Date());
        this.autor = autor;
        this.creacion = creacion;
        this.tipo = tipo;
        this.corriente = corriente;
        this.categoria = categoria;

        contadorObras ++;
        listaObras.add(this);

    }

    

    @Override
    public String toString() {
        String text = autor + ", "+ creacion + ", " + tipo+ ", "+ corriente + ", "+ categoria;
        return text;
    }

    @Override
    public void createRecord() {
        System.out.println("Se ha creado una nueva obra");        
        obrasGuardadas.add(this.toString());
    }

    @Override
    public void deleteRecord() {
        System.out.println("Se ha eliminado una nueva obra");
    }

    @Override
    public void updateRecord() {
        System.out.println("Se ha actualizado una nueva obra"); 
    }

    /* Getters y setters */

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getCreacion() {
        return creacion;
    }

    public void setCreacion(Date creacion) {
        this.creacion = creacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCorriente() {
        return corriente;
    }

    public void setCorriente(String corriente) {
        this.corriente = corriente;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /* Getters y setters de Statics */
    public static int getContadorObras() {
        return contadorObras;
    }

    public static void setContadorObras(int contadorObras) {
        ObrasDeArte.contadorObras = contadorObras;
    }

    public static ArrayList<ObrasDeArte> getListaObras() {
        return listaObras;
    }

    public static void setListaObras(ArrayList<ObrasDeArte> listaObras) {
        ObrasDeArte.listaObras = listaObras;
    }
    
}
