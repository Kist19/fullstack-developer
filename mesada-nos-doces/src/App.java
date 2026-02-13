import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {
        double mesada = 500.0;
        while (mesada > 0) {

            double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do Valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda sua mesada em do doces");
    }

    private static double valorAleatorio() {

        double valor = ThreadLocalRandom.current().nextDouble(1, 12);
        return Math.round(valor * 100.0) / 100.0;

    }
}
