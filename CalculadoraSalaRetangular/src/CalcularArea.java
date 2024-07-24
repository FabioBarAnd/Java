public class CalcularArea implements CalculoGeometrico{
    @Override
    public void calculo(double altura, double largura) {
        double area = altura * largura;
        System.out.println("A área do retangulo é: " + area);
    }
}
