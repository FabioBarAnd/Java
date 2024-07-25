public class Audio {
    private String titulo;
    private double duracao;
    private int totalReproducoes;
    private int curtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public double getDuracao() {
        return duracao;
    }
    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }


    public int getTotalReproducoes() {
        return totalReproducoes;
    }
    public void setTotalReproducoes(int totalReproducoes) {
        this.totalReproducoes = totalReproducoes;
    }


    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int classificacao() {
        return  classificacao;
    }

    public void mostrarDados() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Duracao: " + getDuracao());
        System.out.println("Reproduções: " + getTotalReproducoes());
        System.out.println("Curtidas: " + getCurtidas());
    }
}
