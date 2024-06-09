package Java_JS.MayoJS02.CuentaBancariaJS;

public class CuentaBancariaTest {
 
    public static void main(String[] args) {
    
        CuentaBancaria cuentaJorge = new CuentaBancaria();
        CuentaBancaria cuentaLic = new CuentaBancaria();

        cuentaJorge.consignarDinero(1000, "ahorros");
        cuentaJorge.consignarDinero(1200, "corriente");
        cuentaJorge.verSaldo();
        System.out.println("--------------");
        cuentaJorge.retirarDinero(800, "corriente");
        cuentaJorge.verSaldo();
        System.out.println("--------------");
        cuentaJorge.retirarDinero(800, "corriente");
        cuentaJorge.verSaldo();

        System.out.println("--------------");

        cuentaLic.consignarDinero(2500, "corriente");

        System.out.println(CuentaBancaria.getCuentasCreadas());
        System.out.println(CuentaBancaria.getDineroAlmacenado());
        System.out.println(cuentaJorge.getNumeroCuenta());
        System.out.println(cuentaLic.getNumeroCuenta());
    }

    

}
