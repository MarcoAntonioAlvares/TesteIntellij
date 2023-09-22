package Pacote;

public abstract class Pessoa {
    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Pessoa" + "\n" +
                "nome ='" + nome + '\'' + "\n" +
                ", idade =" + idade + "\n" +
                ", sexo ='" + sexo + '\'' + "\n" +
                ", experiencia =" + experiencia;

    }

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }

    protected String nome;
    protected int idade;
    protected String sexo;

    protected float experiencia;


    protected void ganharExp() {

    }
}
