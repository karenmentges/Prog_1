import java.util.Scanner;

public class ProgramFour {
    public static void main(String args[]) {
        
        int n;
        Parser parser = new Parser();

        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Digite o número de palavras:");
        n = scanner.nextInt(); // scanf 
        scanner.nextLine();

        String vetor[] = new String[n];
        
        for(int i=0; i<n; i++){
            System.out.println("Digite a palavra:");
            vetor[i] = scanner.nextLine(); // fgets
        }
        
        System.out.println("Número de palavras token, ou iniciando em h: " + parser.analize(vetor, n));
        
        
    }
}
