/* Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar
as seguintes operações: Uma pessoa deve possuir os seguintes atributos: nome, data de nascimento
(Data(dia, mes, ano)), altura, peso. Crie um método construtor para a classe Pessoa
passando todos os atributos como parâmetro. */

import java.util.Scanner;

public class ProgramTwo {
    public static void main(String args[]) {
        Agenda[] vetor = new Agenda[] { new Agenda(), new Agenda(), new Agenda(), new Agenda(), new Agenda(),
                new Agenda(), new Agenda(), new Agenda(), new Agenda(), new Agenda() };
        int i = 0, c;
        String nome;
        int idade, index;
        float altura;

        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("1 - Armazenar uma pessoa.");
        System.out.println("2 - Remover uma pessoa.");
        System.out.println("3 - Buscar uma pessoa.");
        System.out.println("4 - Imprimir Agenda.");
        System.out.println("5 - Imprimir Pessoa.");
        System.out.println();

        System.out.println("Digite o número da operação: ");
        c = scanner.nextInt(); // scanf

        switch (c) {
        case 1: {
            scanner.nextLine();
            System.out.println("Digite o nome: ");
            nome = scanner.nextLine(); // fgets

            System.out.println("Digite a idade: ");
            idade = scanner.nextInt(); // scanf

            System.out.println("Digite a altura: ");
            altura = scanner.nextInt(); // scanf

            vetor[i] = vetor.armazenaPessoa(nome, idade, altura);
            i++;

        }

        case 2: {
            scanner.nextLine();
            System.out.println("Digite o nome: ");
            nome = scanner.nextLine(); // fgets

            vetor.removePessoa(nome);

        }

        case 3: {
            scanner.nextLine();
            System.out.println("Digite o nome: ");
            nome = scanner.nextLine(); // fgets

            System.out.println("Index da pessoa buscada: " + vetor.buscaPessoa(nome));
        }

        case 4: {
            vetor.imprimeAgenda();
        }

        case 5: {
            System.out.println("Digite o index da pessoa: ");
            index = scanner.nextInt(); // scanf

            vetor.imprimePessoa(index, vetor);
        }

        }
    }
}
