import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {


    // REPRODUTOR MUSICAL//

    boolean estadoReproducao = false;
    int selecionaMusica = 1;

    @Override
    public void tocar() {
        estadoReproducao = true;
        System.out.println("Tocando música " + selecionaMusica);
    }

    @Override
    public void pausar() {
        estadoReproducao = false;
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica() {
        selecionaMusica++;
        System.out.println("Selecionando música " + selecionaMusica);
    }

    // APARELHO TELEFÔNICO//

    boolean correioDeVoz = false;
    int numeroDeTelefone;

    @Override
    public void iniciarCorreioVoz() {
        correioDeVoz = true;
        System.out.println("Correio de voz ativado...");
    }

    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public void ligar() {
        System.out.print("Ligar para: ");
        numeroDeTelefone = scanner.nextInt();

        boolean atendeu = new Random().nextBoolean();

        if (atendeu) {
            atender();
        } else {
            System.out.println("A pessoa do número " + numeroDeTelefone + " não atendeu");
        }
    }

    @Override
    public void atender() {
        System.out.println("Ligou para o número: " + numeroDeTelefone);
    }

    // NAVEGADOR DE INTERNET//

    List<String> abas = new ArrayList<>();
    int abaAtual = -1;

    @Override
    public void exibirPagina() {
        if (abaAtual >= 0) {
            System.out.println("Exibindo: " + abas.get(abaAtual));
        } else {
            System.out.println("Nenhuma página aberta.");
        }
    }

    @Override
    public void adicionarNovaAba() {
        abas.add("Página " + (abas.size() + 1));
        abaAtual = abas.size() - 1;
        System.out.println("Nova aba aberta.");
    }

    @Override
    public void atualizarPagina() {
        if (abaAtual >= 0) {
            System.out.println("Atualizando: " + abas.get(abaAtual));
        } else {
            System.out.println("Nenhuma página para atualizar.");
        }
    }

    // MAIN //

    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        iphone.tocar();
        iphone.selecionarMusica();
        iphone.pausar();

        iphone.iniciarCorreioVoz();
        iphone.ligar();

        iphone.adicionarNovaAba();
        iphone.exibirPagina();
        iphone.atualizarPagina();
    }
}
