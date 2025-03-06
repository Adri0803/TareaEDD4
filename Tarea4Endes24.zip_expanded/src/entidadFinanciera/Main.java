package entidadFinanciera;

/**
 * @author Adrián Pérez Chillarón
 * @version 2.0
 * @since 6/3/25
 * Clase que que contiene el método main
 */
public class Main {

    public static void main(String[] args) {
        CCuenta objetoCuenta;
        double saldoActual;

        objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        
     /**
      *  Probar métodos de retirar e ingresar
      */
        probarRetirar(objetoCuenta, 500, 2000);
        probarIngresar(objetoCuenta, 300, 2300);
    }

    /**
     * Método para probar la operación de retirar dinero
     * @param cuenta La cuenta desde la cual se retira el dinero
     * @param cantidad La cantidad de dinero a retirar
     * @param cantidadEsperada El saldo esperado después de retirar el dinero
     */
    public static void probarRetirar(CCuenta cuenta, double cantidad, double cantidadEsperada) {
        try {
			cuenta.retirar(cantidad);
			System.out.println("Retiro de " + cantidad + " realizado con éxito.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    /**
     * Método para probar la operación de ingresar dinero
     * @param cuenta La cuenta donde se ingresará el dinero
     * @param cantidad La cantidad de dinero a ingresar
     * @param cantidadEsperada El saldo esperado después de ingresar el dinero
     */
    public static void probarIngresar(CCuenta cuenta, double cantidad, double cantidadEsperada) {
        try {
			cuenta.ingresar(cantidad);
			System.out.println("Ingreso de " + cantidad + " realizado con éxito.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
