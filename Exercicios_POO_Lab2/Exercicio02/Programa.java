package Exercicio02;


import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String continuar;

        do {

            System.out.println("\n CHAPÉU SELETOR DE HOGWARTS");

            System.out.println("Digite o nome do aluno:");
            String nome = entrada.nextLine();

            System.out.println("Digite a idade:");
            int idade = entrada.nextInt();

            System.out.println("Digite a coragem:");
            double coragem = entrada.nextDouble();

            System.out.println("Digite a inteligencia:");
            double inteligencia = entrada.nextDouble();

            System.out.println("Digite a ambicao:");
            double ambicao = entrada.nextDouble();

            System.out.println("Digite a lealdade:");
            double lealdade = entrada.nextDouble();

            System.out.println("Digite a estrategia:");
            double estrategia = entrada.nextDouble();

            System.out.println("Digite a criatividade:");
            double criatividade = entrada.nextDouble();

            Aluno aluno = new Aluno(nome, idade, coragem,
                    inteligencia, ambicao, lealdade,
                    estrategia, criatividade);

            aluno.calcularCasa();

            aluno.exibirInformacoes();

            entrada.nextLine();

            System.out.println("\nDeseja cadastrar outro aluno? (S/N)");
            continuar = entrada.nextLine();

        } while (continuar.equalsIgnoreCase("S"));

        System.out.println("\nPrograma encerrado!");

    }
}
