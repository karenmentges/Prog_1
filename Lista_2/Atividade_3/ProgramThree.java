package Lista_2.Atividade_3;

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
        System.out.println();

        System.out.println("Digite o número da operação: ");
        c = scanner.nextInt();

        switch (c) {
        case 1:
            cr.aumentaVolume();

        case 2:
            cr.diminuiVolume();

        case 3:
            cr.aumentaCanal();

        case 4:
            cr.diminuiCanal();

        case 5:
            System.out.println("Digite o canal para qual deseja trocar: ");
            canal = scanner.nextInt();
            cr.trocaCanal(canal);

        case 6:
            cr.retornaVolumeCanal();

        }
    }
}
