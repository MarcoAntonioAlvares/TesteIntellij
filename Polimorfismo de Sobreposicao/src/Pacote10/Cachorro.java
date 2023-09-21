package Pacote10;

import java.util.Objects;

public class Cachorro extends Lobo{

    @Override

    public void emitirSom(){
        System.out.println("Au!Au!");
    }
    public void reagir(String frase){
        if(Objects.equals(frase, "toma comida") || Objects.equals(frase, "Ola"))
        {System.out.println("Abanar e Latir");}
            else
        {System.out.println("Rosnar");}


    }
    public void reagir(int hora, int min){
        if(hora < 12)
        { System.out.println("Abanar");}
        else if (hora >=18 && hora < 24)
        {System.out.println("Ignorar");}
        else if (hora >= 24)
        {System.out.println("Hora invalida");}
        else
        {System.out.println("Abanar e Latir");}



    }
    public void reagir(boolean dono){
        if(dono)
        { System.out.println("Abanar e Pular");}
        else
        {System.out.println("Rosnar e Latir");
            this.emitirSom();}

    }
    public void reagir(int idade, float peso){
        if(idade < 5)
            if (peso < 10)
                System.out.println("Abanar");
        else
                System.out.println("Latir");
        else
            if(peso < 10)
                System.out.println("Rosnar");
            else
                System.out.println("Ignorar");


    }
}
