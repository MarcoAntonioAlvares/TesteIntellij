package Aula09;

public class Peixe extends Animal{

    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");

    }

    @Override
    public void alimentar() {
        System.out.println("comendo Substancias subaquaticas");

    }

    @Override
    public void emitirSom() {
        System.out.println("Sem emissao de som");

    }

    public void soltarBolha() {
        System.out.println("Soltou uma bolha");
    }
}
