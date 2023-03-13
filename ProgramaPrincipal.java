import java.util.PrimitiveIterator;

// O Exercicio começa a partir da linha 18
// Criar um arquivo com o nome ProgramaPrincipal.java
public class ProgramaPrincipal {
    // Esse código esta correto
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(1234, "João da Silva");
        ContaBancaria conta2 = new ContaBancaria(5678, "Maria Souza");

        conta1.depositar(1000);
        conta2.depositar(500);

        conta1.sacar(300);
        conta2.sacar(700);

        System.out.println("Saldo da conta 1: " + conta1.obterSaldo);
        System.out.println("Saldo da conta 2: " + conta2.obterSaldo);
    }
}

// Existem 10 erros
class ContaBancaria {
    public String obterSaldo;
    // Atributos
    private int numeroConta;
    private String nomeTitular;
    private double saldoAtual;

    // Método Construtor
    public ContaBancaria (int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    // Métodos 
    public void depositar(double valordepositar) {
        saldoAtual = saldoAtual + valordepositar;
    } 

    public void sacar(double valorSaque) {
        if (valorSaque > saldoAtual) {
         sacar insuficiente;
        } else {
            saldoAtual = saldoAtual - valorSaque;
        }
    }

    private void obterSaldo() {
        return;
    }
}