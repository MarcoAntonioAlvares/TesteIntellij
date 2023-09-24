package Pacote;

public class Visualizacao {

    private Gafanhoto espectador;

    private Video filme;

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    @Override
    public String toString() {
        return "Visualizacao" + '\n' +
                "espectador = " + espectador + '\n' +
                "filme = " + filme
                ;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() +1);
        this.filme.setViews(this.filme.getViews() +1);

    }

    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
}
