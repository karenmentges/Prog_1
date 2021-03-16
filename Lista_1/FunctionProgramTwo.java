import java.util.Scanner; 

class FunctionProgramTwo {
    String nome;
    int id;

    void carregaDoTeclado(){
        FunctionProgramTwo autor = new FunctionProgramTwo();
        
        Scanner scanner;
        scanner = new Scanner(System.in);

        scanner.nextLine();
        System.out.println("Digite o nome do Autor: ");
        autor.nome = scanner.nextLine(); //fgets
        
        System.out.println("Digite o ID do Autor: ");
        autor.id = scanner.nextInt(); // scanf

        System.out.println("Nome: " + autor.nome);
        System.out.println("ID: " + autor.id);
        
    }
    
        
}

