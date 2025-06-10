package fila;

import java.util.PriorityQueue;

public class FilaDePrioridadeTeste {
    public static void main(String[] args) {
        PriorityQueue<FIlaDePrioridade> fIlaDePrioridades = new PriorityQueue<>();
        fIlaDePrioridades.add(new FIlaDePrioridade("Responder emails", 3));
        fIlaDePrioridades.add(new FIlaDePrioridade("Corrigir Bugs", 1));
        fIlaDePrioridades.add(new FIlaDePrioridade("Planejamento De Sprint", 2));

        System.out.println("Tarefas por ordem de Prioridade ");
        while (!fIlaDePrioridades.isEmpty()){  //ENQUANTO A FILHA NÃO ESTIVER VAZIA
            System.out.println(fIlaDePrioridades.poll()); // PRINTA O RESULTADO
        }

    }
}
