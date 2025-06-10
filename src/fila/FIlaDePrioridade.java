package fila;

public class FIlaDePrioridade implements Comparable<FIlaDePrioridade> { // IMPLEMENTEI A INTERFACE DE COMPARAÇÕES

    String nome;
    int prioridade;


    public FIlaDePrioridade(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    @Override
    public int compareTo(FIlaDePrioridade fIlaDePrioridade) {
        return Integer.compare(this.prioridade, fIlaDePrioridade.prioridade); //COMPARANDO AS PRIORIDADES QUANTO MENOR O NUMERO AMIOR A PRIORIDADE
    }

    @Override
    public String toString() {
        return "Prioridade: " + prioridade + " Tarefa: " + nome;
    }
}
