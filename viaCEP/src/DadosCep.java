public class DadosCep {
    private String logradouro;
    private String bairro;
    private String localidade;
    private int ddd;

    public DadosCep(String logradouro, String bairro, String localidade, int ddd) {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.localidade = localidade;
        this.ddd = ddd;
    }

    public DadosCep(DadosCepOmdb meusDadosCepOmdb) {
        this.logradouro = meusDadosCepOmdb.logradouro();
        this.bairro = meusDadosCepOmdb.bairro();
        this.localidade = meusDadosCepOmdb.localidade();
        this.ddd = Integer.valueOf(meusDadosCepOmdb.ddd());
    }

    @Override
    public String toString() {
        return "(Rua: " + logradouro + " | Bairro: " + bairro + " | Cidade: " + localidade + " | Ddd: " + ddd + ")";
    }
}
