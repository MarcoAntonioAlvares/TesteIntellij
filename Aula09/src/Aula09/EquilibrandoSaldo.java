package Aula09;

import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();

        //TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio.
        double saldoAtualizadoUm =  saldoAtual +  valorDeposito;
        double saldoAtualizadoDois =  saldoAtualizadoUm -  valorRetirada;

        if(saldoAtualizadoUm > valorRetirada){
            System.out.println("Valor Sacado");
        }
        else {
            System.out.println("Saque nao realizado");
        }

        //TODO: Imprimir o a saída de conforme a tabela de exemplos (uma casa decimal).
        System.out.println(saldoAtualizadoDois);
    }
}
