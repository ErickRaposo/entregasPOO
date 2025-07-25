public class Pacote {
    private String remetente;
    private Endereco enderecoRemetente;
    private String destinatario;
    private Endereco enderecoDestinatario;
    private double peso;
    private double custoPorQuilo;

    public double getCustoPorQuilo() {
        return custoPorQuilo;
    }

    public double getPeso() {
        return peso;
    }

    public double calculaCusto() {
        return peso*custoPorQuilo;
    }

    public Pacote(String remetente, Endereco enderecoRemetente, String destinatario, Endereco enderecoDestinatario, double peso, double custoPorQuilo) {
        if (peso <= 0 || custoPorQuilo <= 0) {
            throw new IllegalArgumentException("Peso e custo por quilo devem ser positivos.");
        }

        this.remetente = remetente;
        this.enderecoRemetente = enderecoRemetente;
        this.destinatario = destinatario;
        this.enderecoDestinatario = enderecoDestinatario;
        this.peso = peso;
        this.custoPorQuilo = custoPorQuilo;
    }
}
