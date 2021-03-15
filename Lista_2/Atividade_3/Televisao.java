package Lista_2.Atividade_3;

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
