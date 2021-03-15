/* Crie uma classe Televisao e uma classe ControleRemoto que pode controlar o
volume e trocar os canais da televisão. O controle de volume permite:
aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
aumentar e diminuir o número do canal em uma unidade;
trocar para um canal indicado;
consultar o valor do volume de som e o canal selecionado.
Crie uma classe principal que permita ao usuário inserir as informações para a televisão, e
utilizar os métodos do controle remoto. */

import java.util.Scanner;

public class ProgramThree {
    public static void main(String args[]) {
        int c, canal;
        Televisao tv = new Televisao();

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
            tv.aumentaVolume();

        case 2:
            tv.diminuiVolume();

        case 3:
            tv.aumentaCanal();

        case 4:
            tv.diminuiCanal();

        case 5:
            System.out.println("Digite o canal para qual deseja trocar: ");
            canal = scanner.nextInt();
            tv.trocaCanal(canal);

        case 6:
            tv.retornaVolumeCanal();

        }
    }
}
