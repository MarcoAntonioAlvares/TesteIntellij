package Aula09;

public class Main {
    public static void main(String[] args) {
       Mamifero m = new Mamifero();
       Reptil r = new Reptil();
       Peixe p = new Peixe();
       Ave v = new Ave();
       Canguru c = new Canguru();
       Cachorro k = new Cachorro();
       Cobra coral = new Cobra();
       Pomba paz = new Pomba();


       m.setCorPelo("Marrom");
       m.setIdade(3);
       m.setMembros(4);
       m.setPeso(40.3f);




        System.out.println("Cor do pelo: " + m.getCorPelo());
        System.out.println("Idade: " + m.getIdade());
        System.out.println("Número de membros: " + m.getMembros());
        System.out.println("Peso: " + m.getPeso());


        coral.emitirSom();
        paz.emitirSom();
    }
}