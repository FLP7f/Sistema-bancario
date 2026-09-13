public class contapoupanca extends contabancaria {

    private double taxaRendimento;
    private int diaAniversario;

    public contapoupanca() {
        super();
        this.taxaRendimento = 0.0;
        this.diaAniversario = 0;
    }

    public contapoupanca(int numconta, double saldo, String titular, String cpf,
                         double taxaRendimento, int diaAniversario) {

        super(numconta, saldo, titular, cpf);

        this.taxaRendimento = taxaRendimento;
        this.diaAniversario = diaAniversario;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public int getDiaAniversario() {
        return diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }

    @Override
    public void exibirInformacoes() {

        super.exibirInformacoes();

        System.out.println("Taxa de rendimento: " + taxaRendimento + "%");
        System.out.println("Dia de aniversário: " + diaAniversario);
    }
}