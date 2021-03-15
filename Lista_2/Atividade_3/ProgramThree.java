import java.util.Scanner;

public class ProgramThree {
    public static void main(String args[]) {
        int c, canal;
        ControleRemoto cr = new ControleRemoto();

        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("1 - Aumenta Volume.");
        System.out.println("2 - Diminui Volume.");
        System.out.println("3 - Aumenta Canal.");
        System.out.println("4 - Diminui Canal.");
        System.out.println("5 - Troca Canal.");
        System.out.println("6 - Retorna valor do Volume e do Canal.");
        System.out.println("0 - Sair.");
        System.out.println();
        
        for(int cont=0; cont<=100; cont++){
            System.out.println("Digite o número da operação: ");
            c = scanner.nextInt();

            if(c==0){
              break;
            }

            switch (c) {
                case 1:
                    cr.aumentaVolume();
                    break;
        
                case 2:
                    cr.diminuiVolume();
                    break;
        
                case 3:
                    cr.aumentaCanal();
                    break;
        
                case 4:
                    cr.diminuiCanal();
                    break;
        
                case 5: 
                    System.out.println("Digite o canal para qual deseja trocar: ");
                    canal = scanner.nextInt();
                    cr.trocaCanal(canal);
                    break;
                    
                case 6:
                    cr.retornaVolumeCanal();
                    break;
        
            }
            
        }
    }
}
