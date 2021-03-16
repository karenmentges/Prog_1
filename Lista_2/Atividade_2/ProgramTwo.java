import java.util.Scanner;

public class ProgramTwo {
    public static void main(String args[]) {
        Agenda[] vetor = new Agenda[] { new Agenda(), new Agenda(), new Agenda(), new Agenda(), new Agenda(),
                new Agenda(), new Agenda(), new Agenda(), new Agenda(), new Agenda() };
        Agenda v = new Agenda();
        int i=0, c, com=-1, dia, mes, ano;
        String nome = new String("NULL");
        String nome1 = new String("NULL");
        String nome2 = new String("NULL");
        int idade, index;
        float altura, peso;
        

        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("1 - Armazenar uma pessoa.");
        System.out.println("2 - Remover uma pessoa.");
        System.out.println("3 - Buscar uma pessoa.");
        System.out.println("4 - Imprimir Agenda.");
        System.out.println("5 - Imprimir Pessoa.");
        System.out.println();

        
        for(int cont=0; cont<=100; cont++){
            System.out.println("Digite o número da operação: ");
            c = scanner.nextInt(); 
            scanner.nextLine();

            if(c==0){
              break;
            }

            switch (c) {
            case 1: 
                System.out.println("Digite o nome: ");
                nome = scanner.nextLine(); 

                System.out.println("Digite o dia de nascimento: ");
                dia = scanner.nextInt(); 

                System.out.println("Digite o mês de nascimento: ");
                mes = scanner.nextInt();

                System.out.println("Digite o ano de nascimento: ");
                ano = scanner.nextInt();

                System.out.println("Digite a idade: ");
                idade = scanner.nextInt(); 

                System.out.println("Digite a altura: ");
                altura = scanner.nextInt(); 

                System.out.println("Digite o peso: ");
                peso = scanner.nextInt(); 

                Data data = new Data(dia, mes, ano);
                Pessoa pessoa = new Pessoa(nome, data, idade, altura, peso);
                vetor[i].pessoa = v.armazenaPessoa(pessoa);
                i++;
                break;

            case 2: 
                System.out.println("Digite o nome: ");
                nome1 = scanner.nextLine(); 
                v.removePessoa(nome1, vetor);
                break;
        

            case 3:
                com = -1;
                System.out.println("Digite o nome: ");
                nome2 = scanner.nextLine(); 
                com = v.buscaPessoa(nome2, vetor);
                if(com==-1){
                    System.out.println("Não foi encontrado uma pessoa com o nome buscado.");
                }
                else{
                    System.out.println("Index da pessoa buscada: " + com);
                }
                break;        

            case 4: 
                v.imprimeAgenda(vetor);
                break;        

            case 5: 
                System.out.println("Digite o index da pessoa: ");
                index = scanner.nextInt(); 
                v.imprimePessoa(index, vetor);
                break;
      
        }
        }
    }
}
