package hashMap;

public class HashMap {

    private java.util.HashMap<String, Integer> listaDeNOmes;

    public HashMap() {
        this.listaDeNOmes = new java.util.HashMap<String, Integer>();
    }

    public String adicionarOuAtualizar( final String nome, final int valor) {
        if (valor <= 0){
            return "Valor invalido, deve se adicionar um valor positivo";
        }
        if (listaDeNOmes.containsKey(nome)){ // SE A MINHA LISTA DE NOMES CONTEM ESSE NOME
            listaDeNOmes.put(nome, listaDeNOmes.get(nome) + valor); //ADICIONA O NOME (SOBREPONDO) E VAI MOSTRA A QUANTIDDADE DE NOMES MAIS O VALOR
            return "NOme: " + nome + ", Nome atualizado com sucesso!: ";
        }else {
            listaDeNOmes.put(nome, valor); //CASO AINDA NÃO TENHA ESE NOME ADICIONE ELE
            return "Nome adicionado a lista com sucesso! ";
        }
    }

    public String removerNomeDaLista(final String nome) {

    }

    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
    }
}
