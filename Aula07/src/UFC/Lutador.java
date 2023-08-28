package UFC;

public class Lutador {

    private String nome;

    private String nacionalidade;

    private int idade;

    private float altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    private String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        this.categoria = categoria;
        if (peso < 52.2) {
            this.categoria = " Invalido";
        } else if (peso <= 70.3) {
            this.categoria = " Leve";
        } else if (peso <= 83.9) {
            this.categoria = " Medio";
        } else if (peso <= 120.2) {
            this.categoria = " Pesado";
        } else {
            this.categoria = " Invalido";

        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    private float peso;

    private String categoria;

    private int vitorias;

    private int derrotas;

    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public void apresentar() {
        System.out.println("Aqui Temos ele");
        System.out.println("De origem: " + this.getNacionalidade());
        System.out.println("Com a idade de: " + this.getIdade() + " anos");
        System.out.println("E a altura de: " + this.getAltura() + "m");
        System.out.println("Pesando: " + this.getPeso() + "Kg");
        System.out.println("Ele que ja ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("E empatou: " + this.getEmpates());
        System.out.println("E la vamos nos vem ai: " + this.getNome());
    }

    ;

    public void status() {
        System.out.println(this.getNome() + " da categoria de peso" + this.getCategoria());
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
    }
        public void ganharLuta() {
            this.setVitorias(this.getVitorias() + 1);
        }
        ;


        public void perderLuta() {
            this.setDerrotas(this.getDerrotas() + 1);
        }
        ;

        public void empatarLuta() {
            this.setEmpates(this.getEmpates() + 1);
        }
        ;

    }
