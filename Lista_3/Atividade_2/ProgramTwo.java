import java.util.Scanner;

public class ProgramTwo {
    public static void main(String args[]){
        String nomeProduto, novo;
        float preco, novopreco;
        int quantidade, novaquantidade;
        
        
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        nomeProduto = scanner.nextLine(); // fgets

        System.out.println("Digite o preco do produto: ");
        preco = scanner.nextInt(); // scanf

        System.out.println("Digite a quantidade do produto: ");
        quantidade = scanner.nextInt(); // scanf

        Compra produto = new Compra(nomeProduto, preco, quantidade);

        produto.imprimeResumo();
        


        scanner.nextLine();
        System.out.println("Digite o novo nome do produto: ");
        novo = scanner.nextLine(); // fgets
             
        produto.setNomeProduto(novo);

        System.out.println("Digite o novo preco do produto: ");
        novopreco = scanner.nextInt(); // scanf

        produto.setPreco(novopreco);

        System.out.println("Digite a nova quantidade do produto: ");
        novaquantidade = scanner.nextInt(); // scanf

        produto.setQuantidade(novaquantidade);

        System.out.println("Produto: " + produto.getNomeProduto());
        System.out.println("Preco: " + produto.getPreco());
        System.out.println("Quantidade: " + produto.getQuantidade());

    }
}
