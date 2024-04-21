package com.dio.desafio;

public class ContaTerminal {
    private final int numero;
    private final String agencia;
    private final String nomeCliente;
    private double saldo;

    public  ContaTerminal(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;

        System.out.println("\"Olá, " + this.nomeCliente + ". Obrigado por criar uma conta em nosso banco, sua agência é " + this.agencia +  " e conta " + this.numero + ". Seu saldo de " +  this.saldo + " já está disponível para saque.");
    }

    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public Double getSaldo(){
        return saldo;
    }



    public void realizarSaque(double valor)
    {
        if(valor > saldo){
            System.out.println("Saldo insuficiente");
            return;
        }

        saldo -= valor;
    }

    public void realizarDeposito(double valor)
    {
        saldo += valor;
    }
}
