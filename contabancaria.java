import java.util.Scanner;

public class contabancaria {
    private Scanner reading = new Scanner(System.in);

    private int numconta;
    private double saldo = 0;
    private String titular = "";
    private String cpf;
    private static int contador = 1;

    // GETTERS E SETTERS
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumconta() {
        return numconta;
    }

    public void setNumconta(int numconta) {
        this.numconta = numconta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular != null && !titular.trim().isEmpty()) {
            this.titular = titular;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf != null && !cpf.trim().isEmpty()) {
            this.cpf = cpf;
        }
    }

    // CONSTRUTOR PADRÃO
    public contabancaria() {
        this.numconta = contador;
        contador = contador + 1;
    }

    // CONSTRUTOR SOBRECARREGADO
    public contabancaria(int numconta, double saldo, String titular, String cpf) {
        this.numconta = numconta;
        this.saldo = saldo;
        setTitular(titular);
        setCpf(cpf);
    }

    public void exibirInformacoes() {
        System.out.println("Número da conta: " + numconta);
        System.out.println("Titular: " + titular);
        System.out.println("CPF: " + cpf);
        System.out.println("Saldo: R$ " + saldo);
    }

    public double calcularSaldo() {
        return saldo;
    }

    public double calcularSaldo(double deposito) {
        return saldo + deposito;
    }

    public double calcularSaldo(double deposito, double saque) {
        return saldo + deposito - saque;
    }

    void depositar() {

        double deposito;

        System.out.println("Qual o valor do seu deposito?");
        deposito = reading.nextDouble();

        System.out.println("Valor depositado foi de -> " + deposito);

        this.saldo = deposito + saldo;

        System.out.println("Seu novo saldo é ---> " + saldo);
    }

    void exibirsaldo() {
        System.out.println("Seu saldo atual é de ---> " + saldo);
    }

    void saque() {

        System.out.println("Qual valor deseja sacar?");
        double valorsaque = reading.nextDouble();

        if (valorsaque > saldo) {
            System.out.println("Não foi possível realizar o saque no valor de "
                    + valorsaque
                    + " pois ultrapassa valor em conta");
        }

        if (valorsaque <= saldo) {
            this.saldo = saldo - valorsaque;

            System.out.println("Saque realizado com sucesso!");
            System.out.println("Seu saldo atual é ---> " + saldo);
        }
    }
}