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