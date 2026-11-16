package Exercicio02;

public class Aluno {

    private String nome;
    private int idade;
    private double coragem;
    private double inteligencia;
    private double ambicao;
    private double lealdade;
    private double estrategia;
    private double criatividade;
    private String casa;

    // Construtor
    public Aluno(String nome, int idade, double coragem,
                 double inteligencia, double ambicao,
                 double lealdade, double estrategia,
                 double criatividade) {

        this.nome = nome;
        this.idade = idade;
        this.coragem = coragem;
        this.inteligencia = inteligencia;
        this.ambicao = ambicao;
        this.lealdade = lealdade;
        this.estrategia = estrategia;
        this.criatividade = criatividade;
    }

    public void calcularCasa() {

        double grifinoria = (2 * coragem) + lealdade;

        double sonserina = (2 * ambicao) + estrategia;

        double corvinal = (2 * inteligencia) + criatividade;

        double lufalufa = ((2 * lealdade) + coragem) / 3.0;

        double maior = grifinoria;
        casa = "Grifinória";

        if (sonserina > maior) {
            maior = sonserina;
            casa = "Sonserina";
        }

        if (corvinal > maior) {
            maior = corvinal;
            casa = "Corvinal";
        }

        if (lufalufa > maior) {
            maior = lufalufa;
            casa = "Lufa-Lufa";
        }
    }

    public void exibirInformacoes() {

        System.out.println("\n INFORMAÇÕES DO ALUNO ");

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Coragem: " + coragem);
        System.out.println("Inteligência: " + inteligencia);
        System.out.println("Ambição: " + ambicao);
        System.out.println("Lealdade: " + lealdade);
        System.out.println("Estratégia: " + estrategia);
        System.out.println("Criatividade: " + criatividade);

        System.out.println("Casa escolhida: " + casa);
    }
}
