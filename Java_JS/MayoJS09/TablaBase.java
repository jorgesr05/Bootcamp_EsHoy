package Java_JS.MayoJS09;

import java.util.Date;

public abstract class TablaBase {

    private int id;
    private Date createdAt;
    private Date updatedAt;

    /* Constructor */

    public TablaBase(int id, Date createdAt, Date updatedAt) {
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    @Override
    public String toString() {
        
        return id+", "+createdAt+"," +updatedAt;
    }
    /* Métodos sin implementar */
    public abstract void createRecord();
    public abstract void updateRecord();
    public abstract void deleteRecord();

    /* Métodos con implementación */
    public void viewCreationDate(){
        System.out.println(createdAt);
    }
    
    public void viewUpDate(){
        System.out.println(updatedAt);
    }
    
    

    /* Getters y setters */
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    
    
}
