package hashMap;

import javax.swing.*;
import java.util.Map;

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
        if (listaDeNOmes.remove(nome) != null){ // SE A LISTA NÃO ESTIVER VAZIA
            return "Nome " +nome + "removido da lista com sucesso! ";
        }else {
            return "Nome não encontrado na lista!";
        }
    }

    public void exibirTodosOsNomes(){
       for (Map.Entry<String, Integer> entry : listaDeNOmes.entrySet()) { // VAI PERCORRENTE ENTRE O NOME E O VALOR DA LISTA
           System.out.println("Nome: " + entry.getKey() + ", Valor: " + entry.getValue()); // ntry.getKey NOME E entry.getValue QUANTIDADE
        }
    }

    public void consultarNomeDaLista(final String nome) {
        if (listaDeNOmes.containsKey(nome)){
            Integer valor = listaDeNOmes.get(nome); // vai buscar o nome pelo valor dele
            System.out.println("Nome: " + nome + ", Valor: " + valor);
        }else {
            System.out.println("NOme não encontrado na lista");

        }
    }

    public static void main(String[] args) {
        HashMap hashMap = new HashMap();

        int opt = 5;

        do {
            opt = Integer.parseInt(JOptionPane.showInputDialog
                    (
                            "1 - Adicionar nome: \n"
                            + "2 - Remover nome: \n"
                            + "4 - Exibir Todos os  nomes: \n"
                            + "5 - Remover nome: \n"
                    ));
            switch (opt) {
                case 1: {
                    System.out.println(hashMap.adicionarOuAtualizar("nome", 1));
                    break;
                }
                case 2: {
                    System.out.println("Existe o nome " +hashMap.removerNomeDaLista(JOptionPane.showInputDialog("Digite um nome para encontrar ")));
                    break;
                }
                case 3: {
                    hashMap.exibirTodosOsNomes();
                    break;
                }
                case 4: {
                    hashMap.consultarNomeDaLista(JOptionPane.showInputDialog("Digite um nome para consultar"));
                    break;
                }
                default:
                    System.out.println("Opção invalida tente de 1 a 5");
            }
        }while (opt != 5);
    }
}
