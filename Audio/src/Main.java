public class Main {
    public static void main(String[] args) {
        Musica musica = new Musica();
        Podcast podcast = new Podcast();

        musica.setCurtidas(4056);
        musica.setDuracao(251);
        musica.setTitulo("Audio 1");
        musica.setTotalReproducoes(8650);
        musica.setCantor("Namaste");
        musica.mostrarDados();
        System.out.println(musica.getCantor());

        podcast.setCurtidas(3);
        podcast.setDuracao(78569);
        podcast.setTitulo("O dia em que os bolivianos descobriram a Espanha");
        podcast.setTotalReproducoes(56);
        podcast.setReprodutor("Redcast");
        podcast.mostrarDados();
        System.out.println(podcast.getReprodutor());

        Classificacao classificacao = new Classificacao();
        classificacao.inclui(musica);
        classificacao.inclui(podcast);
    }
}