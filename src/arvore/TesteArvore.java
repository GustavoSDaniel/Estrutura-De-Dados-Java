package arvore;

public class TesteArvore {
    public static void main(String[] args) {

        Arvore arvore = new Arvore(new Folha(30));
        arvore.inserirFolha(new Folha(15));
        arvore.inserirFolha(new Folha(45));
        arvore.inserirFolha(new Folha(7));
        arvore.inserirFolha(new Folha(19));

    }
}
