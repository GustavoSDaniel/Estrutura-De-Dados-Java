package vetor;

public class Vetor {

    private String [] elementos;
    private int tamanho;

    public Vetor(final int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }


    // EXEMPLO DE ALGORITIMO RUIM: // O PROBLEMA DESSE ALGORITIMO
    // É QUE ELE TEM QUE RODAR TODA A LISTA PAR VER SE É POSSIVEL ADICIONAR UM NOVO ELEMENTO
//    public void adicionar(final  String elemento) {
//        for (int i = 0; i < elementos.length; i ++) { //PERCORRE O VETOR/LISTA
//            if (elementos[i] == null) { // SE ELEMENTO FOR NULL
//                this.elementos[i] = elemento; // ADICIONA ELEMENTO
//                break;
//            }
//        }
//    }

    public boolean adicionar(final  String elemento) throws Exception {

        aumentaCapacidade();

        if (tamanho < elementos.length) { // SER O MEU TAMANHO FOR MENOR QUE O TAMANHO DA MINHA LISTA
            elementos[tamanho] = elemento; // EU VOU PEGAR O TAMANHO E JOGAR O ELEMENTO PARA DENTRO DA LISTA
            tamanho++;
            return true;
        }
        return false;

    }

    private void aumentaCapacidade() {
        if (tamanho == elementos.length) {
            String[] elementosNovos = new String[elementos.length * 2];
            for (int i = 0; i < elementos.length; i++){
                elementosNovos[i] = elementos[i];
            }
            elementos = elementosNovos;
        }
    }

}
