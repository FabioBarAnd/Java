public class CalcularPerimetro implements CalculoGeometrico{
    @Override
    public void calculo(double altura, double largura) {
        double perimetro = largura*2 + altura*2;
        System.out.println("O perimetro do retangulo é: " + perimetro);
    }
}
