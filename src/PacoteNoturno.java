public class PacoteNoturno extends Pacote{
    private double custoAdicionalPorQuilo;

    public PacoteNoturno(String remetente, Endereco enderecoRemetente, String destinatario, Endereco enderecoDestinatario, double peso, double custoPorQuilo, double custoAdicionalPorQuilo) {
        super(remetente, enderecoRemetente, destinatario, enderecoDestinatario, peso, custoPorQuilo);
        this.custoAdicionalPorQuilo=custoAdicionalPorQuilo;
    }

    @Override
    public double calculaCusto() {
        return (getCustoPorQuilo() + custoAdicionalPorQuilo) * getPeso();
    }
}