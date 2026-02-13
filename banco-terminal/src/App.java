public class App {
    public static void main(String[] args) throws Exception {
        
        double saldo = 25, valorSolicidado = 18;
        if (saldo > valorSolicidado) {

            saldo = saldo - valorSolicidado;
        } else {

            System.out.println("Saldo insuficiente");
        }

        System.out.println("Saldo final: " + saldo);
        
        saldo = 15;
        valorSolicidado = 22;
        if (saldo > valorSolicidado) {

            saldo = saldo - valorSolicidado;
        } else {

            System.out.println("Saldo insuficiente");
        }

        System.out.println("Saldo final: " + saldo);

    }
}
