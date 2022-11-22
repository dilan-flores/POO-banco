import java.util.Scanner;

public class ATM {
    //ATRIBUTOS

    String usuario;
    float deposito;
    float retiro;
    float valor; // cantidad de diner en dólares en la cuenta

    //CONTRUCTOR
    public ATM(){
        usuario = "Dilan";
        valor = 300;
    }

    //MÉTODOS

    ATM datos = new ATM();
    Scanner entrada = new Scanner(System.in);

    public void deposito(ATM datos){
        float ingresar;
        System.out.println("Usuario: " + datos.getUsuario());
        System.out.println(" Cantidad a depositar:");
        ingresar = entrada.nextFloat();
        valor = valor + ingresar;
        System.out.println("El proceso a sido ejecutado con éxito");
    };
    public void retiro(){
        float sacar;
        System.out.println("Usuario: " + datos.getUsuario());
        System.out.println(" Cantidad a depositar:");
        sacar = entrada.nextFloat();
        if(sacar <= valor){
            System.out.println("El proceso a sido ejecutado con éxito");
        }else{
            System.out.println("No cuenta con el dinero suficiente");
        };
    };

    // SETTER AND GETTER


    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public float getDeposito() {
        return deposito;
    }

    public void setDeposito(float deposito) {
        this.deposito = deposito;
    }

    public float getRetiro() {
        return retiro;
    }

    public void setRetiro(float retiro) {
        this.retiro = retiro;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
