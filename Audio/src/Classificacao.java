public class Classificacao {
    public void inclui(Audio audio) {
        if(audio.classificacao() > 9) {
            System.out.println(audio.getTitulo() + " está entre suas preferidas");
        } else {
            System.out.println(audio.getTitulo() + "está sendo escutado por muitos");
        }
    }
}
