package entidadFinanciera;

/** Clase que representa una cuenta bancaria. Permite realizar operaciones de ingreso y retiro de dinero,
 * y obtener el saldo actual de la cuenta.
 * @author Adrián Pérez Chillarón
 * @version 2.0
 * @since 6/3/25
 */
public class CCuenta {

    private static final String ERRORCANTIDADNEGATIVA = "No se puede ingresar una cantidad negativa";
    
    /**
     * Nombre de la persona titular de la cuenta
     */
    private String nombre;
    
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor por defecto para la clase CCuenta.
     * Inicializa los valores de la cuenta con valores predeterminados.
     */
    public CCuenta() {
    }

    /**
     * Constructor para inicializar una cuenta con los valores proporcionados.
     * 
     * @param nom Nombre del titular de la cuenta
     * @param cue Número de la cuenta bancaria
     * @param sal Saldo inicial de la cuenta
     * @param tipo Tipo de interés asociado a la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     * 
     * @return El saldo actual de la cuenta
     */
    public double estado() {
        return this.saldo;
    }

    /**
     * Ingresa una cantidad de dinero en la cuenta.
     * 
     * @param cantidad La cantidad de dinero a ingresar en la cuenta
     * @throws Exception Si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception(ERRORCANTIDADNEGATIVA);
        }
        saldo = saldo + cantidad;
    }

    /**
     * Retira una cantidad de dinero de la cuenta.
     * 
     * @param cantidad La cantidad de dinero a retirar de la cuenta
     * @throws Exception Si la cantidad es negativa o si no hay suficiente saldo
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (saldo < cantidad) {
            throw new Exception("No hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     * 
     * @return El nombre del titular
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta.
     * 
     * @param nombre El nombre del titular
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de cuenta.
     * 
     * @return El número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta.
     * 
     * @param cuenta El número de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     * 
     * @return El saldo actual
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta.
     * 
     * @param saldo El saldo de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interés de la cuenta.
     * 
     * @return El tipo de interés asociado a la cuenta
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés de la cuenta.
     * 
     * @param tipoInterés El tipo de interés a establecer para la cuenta
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
