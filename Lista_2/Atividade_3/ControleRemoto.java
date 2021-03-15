public class ControleRemoto {
    Televisao tv = new Televisao();

    public ControleRemoto() {

    }

    public void aumentaVolume() {
        int volume = tv.consultaVolume();
        volume++;
        tv.lerVolume(volume);
    }

    public void diminuiVolume() {
        int volume = tv.consultaVolume();
        volume--;
        tv.lerVolume(volume);
    }

    public void aumentaCanal() {
        int canal = tv.consultaCanal();
        canal++;
        tv.lerCanal(canal);
    }

    public void diminuiCanal() {
        int canal = tv.consultaCanal();
        canal--;
        tv.lerCanal(canal);
    }

    public void trocaCanal(int canal) {
        tv.lerCanal(canal);
    }

    public void retornaVolumeCanal() {
        System.out.println("Volume: " + tv.consultaVolume() + "\nCanal: " + tv.consultaCanal());
    }
}
