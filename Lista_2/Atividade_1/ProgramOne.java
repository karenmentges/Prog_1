/* A classe abaixo representa uma compra em um software de comércio. A classe está com o
código de seus métodos incompleto. Escreva o código faltante dos métodos da classe Compra e
escreva um programa em Java que instancie um objeto da classe Compra, leia do teclado as
informações necessárias para preencher todas as propriedades do objeto e, por último, imprima
essas informações através do método imprimeResumo(). */

package Lista_2.Atividade_1;

import java.util.Scanner;

public class ProgramOne {
    public static void main(String args[]) {
        String nomeProduto;
        float preco;
        int quantidade;

        Scanner scanner;
        scanner = new Scanner(System.in);

        scanner.nextLine();
        System.out.println("Digite o nome do produto: ");
        nomeProduto = scanner.nextLine(); // fgets

        System.out.println("Digite o preço do produto: ");
        preco = scanner.nextInt(); // scanf

        System.out.println("Digite a quantidade do produto: ");
        quantidade = scanner.nextInt(); // scanf

        Compra produto = new Compra(nomeProduto, preco, quantidade);
        produto.imprimeResumo();
    }

}
