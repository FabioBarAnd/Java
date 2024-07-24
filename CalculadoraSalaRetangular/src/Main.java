public class Main {
    public static void main(String[] args) {
        double altura = 5;
        double largura = 2;

        CalcularArea area = new CalcularArea();
        area.calculo(altura, largura);

        CalcularPerimetro perimetro = new CalcularPerimetro();
        perimetro.calculo(altura, largura);
    }
}