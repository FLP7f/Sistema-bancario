public class contacorrente extends contabancaria {

    private double limiteCredito;
    private double taxaManutencao;

    public contacorrente() {
        super();
        this.limiteCredito = 0.0;
        this.taxaManutencao = 0.0;
    }

    public contacorrente(int numconta, double saldo, String titular, String cpf,
                         double limiteCredito, double taxaManutencao) {

        super(numconta, saldo, titular, cpf);

        this.limiteCredito = limiteCredito;
        this.taxaManutencao = taxaManutencao;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public double getTaxaManutencao() {
        return taxaManutencao;
    }

    public void setTaxaManutencao(double taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }

    @Override
    public void exibirInformacoes() {

        super.exibirInformacoes();

        System.out.println("Limite de crédito: R$ " + limiteCredito);
        System.out.println("Taxa de manutenção: R$ " + taxaManutencao);
    }
}