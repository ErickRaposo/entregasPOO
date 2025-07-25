public class Endereco {
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private int cep;

    public Endereco(String logradouro, int numero, String complemento, String bairro, String cidade, String estado, int cep) {
        this.logradouro=logradouro;
        this.numero=numero;
        this.complemento=complemento;
        this.bairro=bairro;
        this.cidade=cidade;
        this.estado=estado;
        this.cep=cep;
    }
}
