package aula05;

public class Main {
    public static void main(String[] args){

        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setTipo("CP");
        p1.setDono("jairo");
        p1.setSaldo(30000);
        p1.setStatus(true);
        p1.estadoAtual();

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setTipo("CC");
        p2.setDono("Marquinho");
        p2.setSaldo(15);
        p2.setStatus(true);
        p2.estadoAtual();
    }
}