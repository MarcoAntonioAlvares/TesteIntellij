package Aula06;

public class ControleRemoto implements Controlador {

    private int volume;
    private boolean ligado;

    private boolean tocando;

    public ControleRemoto() {
        volume = 50;
        ligado = false;
        tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }


    @Override
    public void ligar() {
    setLigado(true);
    }

    @Override
    public void desligar() {
    setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Ligado? " + this.getLigado());
        System.out.println("Tocando? "+ this.getTocando());
        System.out.println("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10){
            System.out.print("I");
        }

    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu");

    }

    @Override
    public void maisVolume() {
        if(getLigado()){
            this.setVolume(this.getVolume() + 10);

        }

    }

    @Override
    public void menosVolume() {
        if(getLigado()){
            this.setVolume(this.getVolume() - 5);
        }

    }

    @Override
    public void ligarMudo() {
        if (getLigado() && this.getVolume() > 0){
            this.setVolume(0);

        }

    }

    @Override
    public void desligarMudo() {
        if (getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }

    }

    @Override
    public void play() {
        if (getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }

    }

    @Override
    public void pause() {
        if (getLigado() && this.getTocando()){
            this.setTocando(false);
        }

    }
}
