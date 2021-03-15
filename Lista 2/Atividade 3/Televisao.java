/* Crie uma classe Televisao e uma classe ControleRemoto que pode controlar o
volume e trocar os canais da televisão. O controle de volume permite:
● aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
● aumentar e diminuir o número do canal em uma unidade;
● trocar para um canal indicado;
● consultar o valor do volume de som e o canal selecionado.
Crie uma classe principal que permita ao usuário inserir as informações para a televisão, e
utilizar os métodos do controle remoto. */

public class Televisao {
    int volume, canal;

    void lerVolume(int volume) {
        this.volume = volume;
    }

    int consultaVolume() {
        return volume;
    }

    void lerCanal(int canal) {
        this.canal = canal;
    }

    int consultaCanal() {
        return canal;
    }
}
