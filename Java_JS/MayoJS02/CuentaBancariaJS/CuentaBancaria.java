package Java_JS.MayoJS02.CuentaBancariaJS;

public class CuentaBancaria {

    private String numeroCuenta;
    private double saldoAhorros;
    private double saldoCorriente;

    private static int cuentasCreadas = 0;
    private static double dineroAlmacenado = 0.00;

    public CuentaBancaria() {
        this.numeroCuenta = generateNumeroCuenta();
        generateNumeroCuenta();
        cuentasCreadas += 1;
    }

    private static String generateNumeroCuenta(){
        String cuenta="";
        for(int i=0; i < 10; i++){
            int aleatorio = ((int) (Math.random()*10))+48;
            char num = (char) aleatorio;
            cuenta += num;
            // System.out.println(aleatorio);
            // System.out.println(num);
            // System.out.println(cuenta); 
        }
        return cuenta;
    }

    public void consignarDinero(double cantidad, String cuenta){
        switch (cuenta) {
            case "ahorros":
                this.saldoAhorros += cantidad;
                dineroAlmacenado += cantidad;
                break;
            case "corriente":
                this.saldoCorriente += cantidad;
                dineroAlmacenado += cantidad;
                break;
            default:
                break;
        }
    }

    public void retirarDinero(double cantidad, String cuenta){
        switch (cuenta) {
            case "ahorros":
            if(cantidad <= this.saldoAhorros){
                this.saldoAhorros -= cantidad;
                dineroAlmacenado -= cantidad;
            } 
            else{
                System.out.println("Fondos insuficientes");
            }
            break;
            case "corriente":
            if(cantidad <= this.saldoCorriente){
                this.saldoCorriente -= cantidad;
                dineroAlmacenado -= cantidad;
            }
            else{
                System.out.println("Fondos insuficientes");
            }
            break;
            default:
                break;
        }
    }
    
    public void verSaldo(){
        System.out.println("Saldo ahorros: S/. "+ this.saldoAhorros);
        System.out.println("Saldo corriente: S/. "+ this.saldoCorriente);
    }

    /* Getters */

        public double getSaldoAhorros() {
        return saldoAhorros;
    }

    public double getSaldoCorriente() {
        return saldoCorriente;
    }
    
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public static int getCuentasCreadas() {
        return cuentasCreadas;
    }

    public static double getDineroAlmacenado() {
        return dineroAlmacenado;
    }

    


    
    
    
    
}