import java.util.Scanner;

public class SmartTV {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SmartTV tv = new SmartTV();

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("\n===== MENU SMART TV =====");
            System.out.println("1 - Ligar TV");
            System.out.println("2 - Desligar TV");
            System.out.println("3 - Aumentar volume");
            System.out.println("4 - Diminuir volume");
            System.out.println("5 - Mudar canal");
            System.out.println("6 - Ver status da TV");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    tv.ligar();
                    break;

                case 2:
                    tv.desligar();
                    break;

                case 3:
                    tv.aumentarVolume();
                    break;

                case 4:
                    tv.diminuirVolume();
                    break;

                case 5:
                    System.out.print("Digite o canal desejado: ");
                    int novoCanal = scanner.nextInt();
                    tv.mudarCanal(novoCanal);
                    break;

                case 6:
                    tv.status();
                    break;

                case 0:
                    System.out.println("Encerrando programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }

    boolean ligada = false;
    int canal = 1;
    int volume = 20;

    public void ligar() {
        ligada = true;
        System.out.println("TV ligada.");
    }

    public void desligar() {
        ligada = false;
        System.out.println("TV desligada.");
    }

    public void aumentarVolume() {
        if (!ligada) {
            System.out.println("Ligue a TV para alterar o volume.");
            return;
        }
        volume++;
        System.out.println("Volume: " + volume);
    }

    public void diminuirVolume() {
        if (!ligada) {
            System.out.println("Ligue a TV para alterar o volume.");
            return;
        }
        volume--;
        System.out.println("Volume: " + volume);
    }

    public void mudarCanal(int novoCanal) {
        if (!ligada) {
            System.out.println("Ligue a TV para mudar o canal.");
            return;
        }
        canal = novoCanal;
        System.out.println("Canal atual: " + canal);
    }

    public void status() {
        System.out.println("\n--- STATUS DA TV ---");
        System.out.println("Ligada: " + ligada);
        System.out.println("Canal: " + canal);
        System.out.println("Volume: " + volume);
    }
}
