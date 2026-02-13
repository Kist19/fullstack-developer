
public class app {
    public static void main(String[] args) throws Exception {

        Estudante est1 = new Estudante();
        est1.nome = "João";
        est1.idade = 13;
        est1.altura = 1.52;
        est1.sexo = Sex.Masculino;

        Estudante est2 = new Estudante();
        est2.nome = "Maria";
        est2.idade = 12;
        est2.altura = 1.45;
        est2.sexo = Sex.Feminino;

        Estudante est3 = new Estudante();
        est3.nome = "Julia";
        est3.idade = 14;
        est3.altura = 1.67;
        est3.sexo = Sex.Feminino;

        Estudante[] estudantes = { est1, est2, est3 };

        for (Estudante est : estudantes) {
            est.apresentar();
        }
    }

    public static class Estudante {

        public String nome;
        public int idade;
        public double altura;
        public Sex sexo;

        public void apresentar() {
            System.out.println("Olá! Meu nome é " + nome + ", tenho " + idade + " anos, minha altura é de " + altura
                    + " e meu sexo é " + sexo + ".");
        }

    }

    enum Sex {

        Masculino, Feminino;

    }
}
