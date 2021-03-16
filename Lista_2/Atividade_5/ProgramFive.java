import java.util.Scanner;

public class ProgramFive {
    public static void main(String args[]) {

        Dicionario dicionario = new Dicionario();
        int i=0, c, valor;
        String nome = new String();
        
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("1 - Adiciona ao Dicionário.");
        System.out.println("2 - Procurar no Dicionário.");
        System.out.println("0 - Sair.");
        System.out.println();
        
        for(int cont=0; cont<=100; cont++){
            System.out.println("Digite o número da operação: ");
            c = scanner.nextInt();
            scanner.nextLine();

            if(c==0){
              break;
            }
            else if(c==1){
                System.out.println("Digite o nome: ");
                nome = scanner.nextLine(); 

                System.out.println("Digite o valor: ");
                valor = scanner.nextInt(); 

                Var var = new Var(valor, nome);
                dicionario.tabela[i] = var;

                i++;
            }
            else if(c==2){
                System.out.println("Digite o nome: ");
                nome = scanner.nextLine();

                dicionario.getVariavelByNome(nome);
            }
        }  
    }
}
