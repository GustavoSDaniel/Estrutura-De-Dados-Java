package hashSet;

import javax.swing.*;

public class HashSet {

    private java.util.HashSet<String> hashNomes;

    public HashSet() {
        this.hashNomes = new java.util.HashSet<String>();
    }

    public String adicionarNOme(final String nome) {
        if (hashNomes.add(nome)) {
            return "NOme adcionado com sucesso!";
        }else {
            return "NOme duplicado não foi adicionado!";
        }
    }

    public  boolean existeNOme(final String nome) {
        return hashNomes.contains(nome);
    }

    public String removerNOme(final String nome) {
        if (hashNomes.remove(nome)){
            return "NOme removido com sucesso!";
        }else {
            return "NOme não encontrado!";
        }
    }

    public void mostrarTodosOsNOmes(){
        if (hashNomes.isEmpty()){
            System.out.println("Lista de nomes vazia!");
        }else {
            for (String nome : hashNomes) {
                System.out.println("Nome: " +nome);
            }
        }
    }

    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        int opt = 5;
        do {
            opt = Integer.parseInt(JOptionPane.showInputDialog
                    (
                            "1 - Adicionar nome\n "
                                    + "2 - Verificar nome\n "
                                    + "3 - Remover nome\n "
                                    + "4 - Exibir todos os nome\n "
                                    + "5 - Sair\n "
                    ));
            switch (opt) {
                case 1: {
                    System.out.println(hashSet.adicionarNOme(JOptionPane.showInputDialog("Digite um nome para adicionar")));
                    break;
                }
                case 2: {
                    System.out.println("Existe o nome " +hashSet.existeNOme(JOptionPane.showInputDialog("Digite um nome para encontrar ")));
                    break;
                }
                case 3: {
                    System.out.println(hashSet.removerNOme(JOptionPane.showInputDialog("Digite um nome para remover")));
                    break;
                }
                case 4: {
                    hashSet.mostrarTodosOsNOmes();
                    break;
                }
                default:
                    System.out.println("Opção invalida tente de 1 a 5");
            }

        }
        while (opt != 5);



    }
}
