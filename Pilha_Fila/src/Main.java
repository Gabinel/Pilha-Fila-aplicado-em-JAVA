import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        //Testando FILA
        Fila fila = new Fila(5);

        System.out.println("Adding: " + fila.add("Bee"));
        System.out.println("Adding: " + fila.add("Radagon"));
        System.out.println("Adding: " + fila.add("House"));
        System.out.println("Adding: " + fila.add("Dragon"));
        System.out.println("Adding: " + fila.add("Amarildo"));

        System.out.println("Is the line empty? " + fila.isEmpty());
        System.out.println("Line's first element: " + fila.first());
        System.out.println("Line's size: " + fila.tamanho());

        while(!fila.isEmpty()) {
            System.out.println("Removing: " + fila.remove());
        }

        System.out.println("Is the line empty?: " + fila.isEmpty());

        //Testando PILHA
        Pilha pilha = new Pilha(5);

        System.out.println("------------------------");

        System.out.println("Adding: " + pilha.add("Bee"));
        System.out.println("Adding: " + pilha.add("Radagon"));
        System.out.println("Adding: " + pilha.add("House"));
        System.out.println("Adding: " + pilha.add("Dragon"));
        System.out.println("Adding: " + pilha.add("Amarildo"));

        System.out.println("Is the pile empty? " + pilha.isEmpty());
        System.out.println("Top: " + pilha.top());
        System.out.println("Pile's size: " + pilha.size());

        while(!pilha.isEmpty()) {
            System.out.println("Removing: " + pilha.pop());
        }

        System.out.println("Is the pile empty? " + pilha.isEmpty());

        System.out.println("------------------------");
        System.out.println("Finished!");

    }
}