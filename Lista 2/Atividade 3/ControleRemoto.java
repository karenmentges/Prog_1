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
