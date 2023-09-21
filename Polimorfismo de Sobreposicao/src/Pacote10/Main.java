package Pacote10;

public class Main {
    public static void main(String[] args) {
        Cachorro x = new Cachorro();

        x.reagir("Ola");
        x.reagir("Vai apanhar");
        x.reagir(11,45);
        x.reagir(21,00);
        x.reagir(true);
        x.reagir(false);
        x.reagir(2,  12.5f);
        x.reagir(17,4.5f);
    }
}