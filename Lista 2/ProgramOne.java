import java.util.Scanner; 

public class ProgramOne {
    public static void main(String args[]) {
        String nomeProduto;
        float preço;
        int quantidade;
        Compra produto = new Compra();
        
        Scanner scanner;
        scanner = new Scanner(System.in);

        scanner.nextLine();
        System.out.println("Digite o nome do produto: ");
        nomeProduto = scanner.nextLine(); //fgets
        
        System.out.println("Digite o preço do produto: ");
        preço = scanner.nextInt(); // scanf

        System.out.println("Digite a quantidade do produto: ");
        quantidade = scanner.nextInt(); // scanf

        produto = Compra(nomeProduto, preço, quantidade);
    }
    
}
