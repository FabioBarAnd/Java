import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um CEP: ");
        String cep = leitura.nextLine();

        URI endereco = URI.create("https://viacep.com.br/ws/" + cep + "/json/");

        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(endereco)
                    .build();
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            //System.out.println(response.body());

            DadosCepOmdb meusDadosCepOmdb = new Gson().fromJson(response.body(), DadosCepOmdb.class);
            //System.out.println(meusDadosCepOmdb);

            DadosCep meuCep = new DadosCep(meusDadosCepOmdb);
            System.out.println(meuCep);

            EscreveCep escritorDeCep = new EscreveCep();
            escritorDeCep.EscreveCep(meusDadosCepOmdb);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}