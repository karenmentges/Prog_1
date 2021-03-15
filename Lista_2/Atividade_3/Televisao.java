/* Crie uma classe Televisao e uma classe ControleRemoto que pode controlar o
volume e trocar os canais da televisão. O controle de volume permite:
● aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
● aumentar e diminuir o número do canal em uma unidade;
● trocar para um canal indicado;
● consultar o valor do volume de som e o canal selecionado.
Crie uma classe principal que permita ao usuário inserir as informações para a televisão, e
utilizar os métodos do controle remoto. */

package Lista_2.Atividade_3;

public class Televisao {
    int volume, canal;

    public Televisao(){
        
    }
   
    public void lerVolume(int volume) {
        this.volume = volume;
    }

    public int consultaVolume() {
        return volume;
    }

    public void lerCanal(int canal) {
        this.canal = canal;
    }

    public int consultaCanal() {
        return canal;
    }
}
