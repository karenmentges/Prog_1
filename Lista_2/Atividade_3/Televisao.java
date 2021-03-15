package Lista_2.Atividade_3;

public class Televisao {
    int volume, canal;

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
