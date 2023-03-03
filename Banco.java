package banco;

/**
 * Clase principal que permite gestionar las cuentas bancarias
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Cuenta c = new Cuenta(); //No podemos instanciar una clase abstracta
        CuentaJoven cj1 = new CuentaJoven("12345678", 500);
    }
    
}
