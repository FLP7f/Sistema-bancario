
public class Main {

    public static void main(String[] args) {

        System.out.println("===============================");
        System.out.println(" BEM-VINDO A SUA CONTA BANCARIA");
        System.out.println("===============================");

        contacorrente corrente1 = new contacorrente();
        corrente1.setTitular("Ana");
        corrente1.setCpf("111.111.111-11");
        corrente1.setSaldo(1000.00);
        corrente1.setLimiteCredito(500.00);
        corrente1.setTaxaManutencao(25.00);

        contacorrente corrente2 = new contacorrente(
                2,
                2500.00,
                "Carlos",
                "222.222.222-22",
                1000.00,
                30.00
        );

        contapoupanca poupanca1 = new contapoupanca();

        poupanca1.setTitular("Maria");
        poupanca1.setCpf("333.333.333-33");
        poupanca1.setSaldo(1500.00);
        poupanca1.setTaxaRendimento(0.5);
        poupanca1.setDiaAniversario(10);
 
        contapoupanca poupanca2 = new contapoupanca(
                4,
                3000.00,
                "João",
                "444.444.444-44",
                0.6,
                15
        );

        System.out.println("\n--- ENCAPSULAMENTO ---");
        System.out.println("Titular da conta corrente 1: "
                + corrente1.getTitular());

        System.out.println("Saldo da conta poupança 1: R$ "
                + poupanca1.getSaldo());

        System.out.println("\n--- HERANÇA E POLIMORFISMO ---");

        contabancaria conta1 = corrente2;
        contabancaria conta2 = poupanca2;

        conta1.exibirInformacoes();

        System.out.println();

        conta2.exibirInformacoes();

        System.out.println("\n--- SOBRECARGA DE MÉTODOS ---");

        System.out.println("Cálculo 1: R$ "
                + corrente1.calcularSaldo());

        System.out.println("Cálculo 2: R$ "
                + corrente1.calcularSaldo(500.00));

        System.out.println("Cálculo 3: R$ "
                + corrente1.calcularSaldo(500.00, 200.00));

        System.out.println("\n--- CONTA CORRENTE 2 ---");
        corrente2.exibirInformacoes();

        System.out.println("\n--- CONTA POUPANÇA 2 ---");
        poupanca2.exibirInformacoes();
    }
}

