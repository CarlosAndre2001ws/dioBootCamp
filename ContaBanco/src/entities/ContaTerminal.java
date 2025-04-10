package entities;

public class ContaTerminal {
    public String nome;
    private final int numConta;
    private double saldo;
    private final String numAgencia;


    public ContaTerminal(String nome, String numAgencia, int numConta, double saldo) {
        this.nome = nome;
        this.numAgencia = numAgencia;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public double deposito(double valor) {
        this.saldo += valor;
        return this.saldo;
    }

    public void imprimirConta() {
        System.out.printf("Olá " + this.nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + this.numAgencia + ", conta " + this.numConta + " e seu saldo %.2f" + this.saldo + " já está disponível para saque\n");
    }
}
