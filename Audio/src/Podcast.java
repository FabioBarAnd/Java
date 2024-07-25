public class Podcast extends Audio {
    private String reprodutor;

    public String getReprodutor() {
        return reprodutor;
    }
    public void setReprodutor(String reprodutor) {
        this.reprodutor = reprodutor;
    }

    @Override
    public int classificacao() {
        if(getTotalReproducoes() > 400) {
            return 10;
        } else {
            return 7;
        }
    }
}
