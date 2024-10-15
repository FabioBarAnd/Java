package ZeroComoDivisorException;

public class ZeroComoDivisorException extends RuntimeException {
    private String mensagem;
    public ZeroComoDivisorException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return mensagem;
    }
}
