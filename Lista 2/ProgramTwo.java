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
        case 1:
            break;

        case 2:
            break;

        case 3:
            break;

        case 4:
            break;

        case 5:
            break;
        }
    }
}
