
import java.util.Scanner;

public class ProgramaIMC {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome:");
        String nome = entrada.nextLine();

        System.out.println("Digite o sobrenome:");
        String sobrenome = entrada.nextLine();

        System.out.println("Digite a idade:");
        int idade = entrada.nextInt();

        System.out.println("Digite a altura:");
        double altura = entrada.nextDouble();

        System.out.println("Digite o peso:");
        double peso = entrada.nextDouble();

        Pessoa pessoa = new Pessoa(nome, sobrenome, idade, altura, peso, 0);

        pessoa.CalculaIMC();

        System.out.println("\n--- RESULTADO ---");

        System.out.println("Nome: " + pessoa.getNome() + " " + pessoa.getSobrenome());

        System.out.println("Idade: " + pessoa.getIdade());

        System.out.println("IMC: " + pessoa.getImc());

        System.out.println("Classificação:");
        pessoa.InformaObesidade();

    }
}
