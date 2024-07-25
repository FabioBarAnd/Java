public class Musica extends Audio {
    private String cantor;

    public String getCantor() {
        return cantor;
    }
    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    @Override
    public int classificacao() {
        if(getTotalReproducoes() > 2000) {
            return 10;
        } else {
            return 6;
        }
    }
}
