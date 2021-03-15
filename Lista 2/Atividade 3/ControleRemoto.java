/* Crie uma classe Televisao e uma classe ControleRemoto que pode controlar o
volume e trocar os canais da televisão. O controle de volume permite:
● aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
● aumentar e diminuir o número do canal em uma unidade;
● trocar para um canal indicado;
● consultar o valor do volume de som e o canal selecionado.
Crie uma classe principal que permita ao usuário inserir as informações para a televisão, e
utilizar os métodos do controle remoto. */

public class ControleRemoto {
    Televisao tv = new Televisao();

    void aumentaVolume() {
        int volume = tv.consultaVolume();
        volume++;
        tv.lerVolume(volume);
    }

    void diminuiVolume() {
        int volume = tv.consultaVolume();
        volume--;
        tv.lerVolume(volume);
    }

    void aumentaCanal() {
        int canal = tv.consultaCanal();
        canal++;
        tv.lerCanal(canal);
    }

    void diminuiCanal() {
        int canal = tv.consultaCanal();
        canal--;
        tv.lerCanal(canal);
    }

    void trocaCanal(int canal) {
        tv.lerCanal(canal);
    }

    void retornaVolumeCanal() {
        System.out.println("Volume: " + tv.consultaVolume() + "Canal: " + tv.consultaCanal());
    }
}
