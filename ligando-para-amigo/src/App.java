import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Discando...");

        do {

            System.out.println("Telefone tocando");

        } while (tocando());

        System.out.println("alô !!!");
    }

    private static boolean tocando(){

        boolean atendeu = new Random().nextInt (5)==1;
        if (!atendeu) {
            System.out.println("Na linha");
        }
        return ! atendeu;
    }
}
