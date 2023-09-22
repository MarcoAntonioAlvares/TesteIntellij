package Pacote;

public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[3];

        v[0] = new Video("Aula 01 de POO");
        v[1] = new Video ("Aula 02 de POO");
        v[2] = new Video ("Aula 03 de POO");

        Gafanhoto g[] = new Gafanhoto[3];
        g[0] = new Gafanhoto("Marco", 25, "M", "Marquinho");
        g[1] = new Gafanhoto("Maria", 22, "F","Maria");
        g[2] = new Gafanhoto("Paulo", 23, "M", "Paulinho");

        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
    }
}