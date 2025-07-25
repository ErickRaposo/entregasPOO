public class PacoteDoisDias extends Pacote{
    private double taxaFixa;

    public PacoteDoisDias(String remetente, Endereco enderecoRemetente, String destinatario, Endereco enderecoDestinatario, double peso, double custoPorQuilo, double taxaFixa) {
        super(remetente, enderecoRemetente, destinatario, enderecoDestinatario, peso, custoPorQuilo);
        this.taxaFixa=taxaFixa;
    }

    @Override
    public double calculaCusto() {
        return super.calculaCusto() + taxaFixa;
    }
}
