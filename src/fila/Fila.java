package fila;

import java.util.*;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();
        fila.offer("CLiente 0"); //offer adiciona a fila
        fila.offer("CLiente 2");
        System.out.println(fila.poll()); //poll mostra o primeiro da fila



        PriorityQueue<String> fila2 = new PriorityQueue<>(); // FIla de prioridade nesse caso puxando pela string a primeira letra do alfabeto no caso o A
        fila2.offer("CLiente 3");
        fila2.offer("CLiente 4");
        fila2.offer("Ali ta o primeiro");
        System.out.println(fila2.poll());

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // PEGANDO SEMPRE O MENOR VALOR
        minHeap.offer(30);
        minHeap.offer(10);
        minHeap.offer(20);
        System.out.println(minHeap.poll());

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());// PEGANDO SEMPRE O AMIOR VALOR
        maxHeap.offer(30);
        maxHeap.offer(10);
        maxHeap.offer(20);
        maxHeap.offer(102);
        System.out.println(maxHeap.poll());
    }

    public static class FilaDePrioridade implements Comparable<FilaDePrioridade> {

        String nome;
        int prioridade;

        public FilaDePrioridade(String nome, int prioridade) {
            this.nome = nome;
            this.prioridade = prioridade;
        }

        @Override
        public int compareTo(FilaDePrioridade filaDePrioridade) {
            return Integer.compare(this.prioridade, filaDePrioridade.prioridade); //COMPARANDO AS PRIORIDADES

        }
    }
}
