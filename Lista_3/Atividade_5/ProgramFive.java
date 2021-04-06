import java.util.Scanner;

public class ProgramFive {
    public static void main(String args[]){
        int id;
        String nome, texto;

        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Digite o nome do Autor: ");
        nome = scanner.nextLine(); // fgets

        System.out.println("Digite o ID do Autor: ");
        id = scanner.nextInt(); // scanf

        Autor autor = new Autor(nome, id);

        scanner.nextLine();
        System.out.println("Digite o texto do Autor: ");
        texto = scanner.nextLine(); // scanf

        Post post = new Post(autor, texto);

        post.imprimeResumo();
    }
}
