package Java_JS.AbrilJS30.CafeUtilJS;

import java.util.ArrayList;

public class CafeUtil {
    
    public int getStreakGoal(int numWekks){
        int suma = 0;
        for(int i=1 ;i<=numWekks; i++){
            suma+=i;
        }
        return suma;
    }
    
    double getOrderTotal(double[] prices){
        double total = 0;
        for(double item : prices){
            total += item;
        }
        return total;
    }

    void displayMenu(ArrayList<String> menuItems){
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%d %s \n",i, menuItems.get(i));
        }
            
    }

    void addCustomer(ArrayList<String> customers){
        System.out.println("Por favor, ingresa tu nombre:");
        String userName = System.console().readLine();
        System.out.println("Hola, "+ userName +" !");
        System.out.println("Hay "+ customers.size() +" personas frente a ti,");
        customers.add(userName);
        for (String cliente : customers) {
            System.out.println(cliente);
            
        }

    }


}

        


