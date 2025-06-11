package dijkstra;

import java.security.InvalidParameterException;
import java.util.*;

public class AlgoritimoDeDijkstra {

    private int vertices [] [];

    public AlgoritimoDeDijkstra(final int numVertices) {
        vertices = new int [numVertices] [numVertices];
    }

    public void criarArestas(final int noOrigem, final int noDestino, final int peso) {
        if (peso >= 1){
            vertices [noOrigem][noDestino] = peso;
            vertices [noDestino][noOrigem] = peso;
        }else {
            throw new InvalidParameterException(" O peso do nó origem ["+noOrigem+"] para o nó destino ["+noDestino+"] não pode ser negativo ");
        }
    }

    public int getMaisProximo(final int listaCustos[], final Set<Integer> naoVIstados) {
        int minDistancia = Integer.MAX_VALUE;
        int noProximo = 0;
        for (Integer i : naoVIstados) {
            if (listaCustos[i] < minDistancia) {
                minDistancia = listaCustos[i];
                noProximo = i;
            }
        }
        return noProximo;
    }

    public List<Integer> getVizinhos(final int no) {
        List<Integer> vizinhos = new ArrayList<Integer>();
        for (int i = 0; i < vertices.length; i++) {
             if (vertices [no][i] > 0) {
                 vizinhos.add(i);
             }
        }
        return vizinhos;
    }

    public int getCusto(final int noOrigem, final int noDestino) {
        return vertices [noOrigem][noDestino];
    }

    public List<Integer> caminhoMinimo(final int noOrigem, final int noDestino) {

        int custo [] = new int[vertices.length];
        int antecessor [] = new int[vertices.length];
        Set<Integer> naoVIstados = new HashSet<Integer>();

        custo[noOrigem] = 0;
        for (int v = 0; v < vertices.length; v++) {
            if (v != noOrigem) {
                custo[v] = Integer.MAX_VALUE;
            }
            antecessor[v] = -1;
            naoVIstados.add(v);
        }
        while (!naoVIstados.isEmpty()) {
            int noMaisProximo = getMaisProximo(custo, naoVIstados);

            naoVIstados.remove(noMaisProximo);

            for (Integer vizinhos : getVizinhos(noMaisProximo)) {
                int custoTotal = custo[noMaisProximo] + getCusto(noMaisProximo, vizinhos);
                if (custoTotal < custo[vizinhos]) {
                    custo[vizinhos] = custoTotal;
                    antecessor[vizinhos] = noMaisProximo;
                }
            }

            if (noMaisProximo == noDestino) {
                return caminhoMaisProximo(antecessor, noMaisProximo);
            }
        }

        return null;
    }

    public List<Integer> caminhoMaisProximo(final int antecessor[], int noMaisProximo) {
        List<Integer> caminho = new ArrayList<>();
        caminho.add(noMaisProximo);

        while (antecessor[noMaisProximo] != -1) {
            caminho.add(antecessor[noMaisProximo]);
            noMaisProximo = antecessor[noMaisProximo];
        }
        Collections.reverse(caminho);
        return caminho;
    }
}
