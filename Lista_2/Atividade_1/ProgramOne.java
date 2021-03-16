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
