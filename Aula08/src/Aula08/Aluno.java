package Aula08;

public class Aluno extends Pessoa {

    protected int Matricula;
    protected String Curso;

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int matricula) {
        Matricula = matricula;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String curso) {
        Curso = curso;
    }

    public void pagarMensalidade(){
        System.out.println("Mensalidade paga");
    }

    @Override
    public String toString() {
        return super.toString()  +
                "\nMatricula=" + Matricula +
                ",\nCurso='" + Curso + '\''
                ;
    }
}
