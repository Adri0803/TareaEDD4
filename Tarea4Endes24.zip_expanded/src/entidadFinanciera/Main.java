package entidadFinanciera;


public class Main {

    public static void main(String[] args) {
        CCuenta objetoCuenta;
        double saldoActual;
        

        objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        
     // Probar métodos de retirar e ingresar
        probarRetirar(objetoCuenta, 500, 2000);
        probarIngresar(objetoCuenta, 300, 2300);
    }

    // Método para probar la operación de retirar dinero
    public static void probarRetirar(CCuenta cuenta, double cantidad, double cantidadEsperada) {
        try {
			cuenta.retirar(cantidad);
			System.out.println("Retiro de " + cantidad + " realizado con éxito.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    // Método para probar la operación de ingresar dinero
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