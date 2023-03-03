package banco;

/**
 * Clase Cuenta que permite almacenar información de una cuenta bancaria
 */
public abstract class Cuenta {

	private String numeroCuenta;
    private double saldo;
    private static int contador = 0; //Atributo común a todas las instancias de la clase
    
    public Cuenta() {
        System.out.println("Constructor por defecto de Cuenta");
        this.numeroCuenta = "";
        this.saldo = 0;
    }
    
    /**
     * Constructor con dos parámetros
     * @param numeroCuenta Número de cuenta
     * @param saldo Saldo de la cuenta
     */
    public Cuenta(String numeroCuenta, double saldo) {
        System.out.println("Constructor con parámetros de Cuenta");
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    
    /**
     * Método abstracto que debe ser redefinido en las clases derivadas
     */
    public abstract void pagarIntereses ();

}
