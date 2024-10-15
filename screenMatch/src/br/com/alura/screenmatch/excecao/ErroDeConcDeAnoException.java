package br.com.alura.screenmatch.excecao;

public class ErroDeConcDeAnoException extends RuntimeException {
    private String mensagem;
    public ErroDeConcDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
