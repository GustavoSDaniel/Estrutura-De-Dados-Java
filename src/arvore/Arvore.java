package arvore;

public class Arvore {

    private Folha folha;
    private Arvore esquerda;
    private Arvore direita;

    public Arvore() { // ARVORE VAZIA
        this.folha = null;
        this.esquerda = null;
        this.direita = null;
    }

    public Arvore (Folha folha) {
        this.folha = folha;
        this.esquerda = null;
        this.direita = null;
    }


    public boolean isEmpty() { // METODO PARA VER SE A FOLHA ESTÁ VAZIA
        return this.folha == null;
    }

    public void inserirFolha(Folha novaFolha) {
        if (this.isEmpty()) { // SE A ARVORE ESTIVER VAZIA
            this.folha = novaFolha;  // CRIANDO A RAIZ
        } else {
            Arvore novoArvore = new Arvore(novaFolha); // SE ELA NÃO ESTIVER VAZIA (JÁ EXISTE UM NÓ)
            if (novaFolha.getValor() < this.folha.getValor()) { // SE O VALOR DESSA NOVA FOLHA FOR MENOR QUE O JA EXISTENTE
                if (this.esquerda == null) { // SE O LADO ESQUERDO NÃO TIVER NADA (FOR NULL) CRIE UMA NOVA ARVORE SE JÁ EXISTIR ADICIONE A FOLHA
                    this.esquerda = novoArvore;  // CRIE UMA NOVA ARVORE

                    System.out.println("Folha: " + novaFolha.getValor() + " a esquerda de: " + this.folha.getValor());
                }
                else {
                    this.esquerda.inserirFolha(novaFolha); // INSIRA A FOLHA NESSA NOVA ARVORE CRIADA A ESQUERDA
                }
            }else if (novaFolha.getValor() > this.folha.getValor()) { // SE O VALOR DA NOVA FOLHA FOR MAIOR QUE A FOLHA RAIZ
                    if (this.direita == null) { // SE O LADO DIREITO NÃO EXISTIR
                        this.direita = novoArvore; // CRIE UMA NOVA ARVORE

                        System.out.println("Folha: " + novaFolha.getValor() + " a Direita de: " + this.folha.getValor());

                    }
                    else {
                        this.direita.inserirFolha(novaFolha); // SE JA EXISTIR UMA ARVORE ADICIONE  ESSA NOVA FOLHA
                    }
            }
        }
    }
}
