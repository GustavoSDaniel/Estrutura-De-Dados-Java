package vetor;

public class VetorTest {
    public static void main(String[] args) {


        try {

            Vetor nomes = new Vetor(5);

            nomes.adicionar("Gustavo");
            nomes.adicionar("Liziane");
            nomes.adicionar("Gabriela");
            nomes.adicionar("Wandro");
            nomes.adicionar("Anna");
            nomes.adicionar("Leandro");
            nomes.adicionar("Luciana");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
