import java.util.Scanner;

public class contabancaria {

    private int numconta;
    private double saldo = 0;
    private String titular = "";
    private String cpf;
    private static int contador = 1;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumconta() {return numconta;}

    public void setNumconta(int numconta) {this.numconta = numconta;}

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String  getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }



   //GERADOR DE NUMEROS DE CONTAS
    public contabancaria() {
        this.numconta = contador;
        contador = contador + 1;
    }


    //REALIZAR DEPOSITO
    void depositar(){
        Scanner reading = new Scanner(System.in);
         double deposito;
        System.out.println(" Qual o valor do seu deposito?");
        deposito = ( reading.nextDouble());
        System.out.println(" Valor do depositado foi de -> " + deposito);
        this.saldo = deposito+saldo;
        System.out.println("Seu novo saldo é ---> " + saldo);
    }

    //EXIBIR SALDO
    void exibirsaldo(){
    System.out.println("Seu saldo atual é de --->" + saldo);
}


     // REALIZAR SAQUE

    void saque(){
        Scanner reading = new Scanner(System.in);

        System.out.println("Qual valor deseja sacar?");
        double valorsaque = (reading.nextDouble());

        if (valorsaque > saldo) {
            System.out.println(" Não foi possivel realizar o saque no valor de " + valorsaque +
                    " pois ultrapassa valor em conta" );
        }

    if ( valorsaque <= saldo){
        this.saldo = saldo - valorsaque;
        System.out.println(" Saque realizado com sucesso !");
        System.out.println(" Seu saldo atual é --->" + saldo);
    }

    }









}