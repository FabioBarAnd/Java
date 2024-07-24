public class MostrarTabuada implements Tabuada{
    @Override
    public void mostrarTabuada(int numero) {
        int i;
        for(i = 1; i <= 10 ; i++){
            System.out.println(numero + "x" + i + " = " + (numero*i));
        }
    }
}
