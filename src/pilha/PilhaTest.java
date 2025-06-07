package pilha;

import java.util.Stack;

public class PilhaTest {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("Pagina 1"); // PARTA ADICIONAR
        stack.push("Pagina 2"); // PARTA ADICIONAR

        System.out.println(stack.pop()); // PARA PEGAR
    }
}
