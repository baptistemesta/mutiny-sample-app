/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package mutiny.sample.app;

import io.smallrye.mutiny.Multi;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Multi.createFrom().items("a", "b", "c")
                .onItem().transform(s -> {
            if ("b".equals(s)) {
                throw new RuntimeException("");
            } else return s;
        })
                .onFailure().recoverWithItem("toto")
                .onItem().transform(item -> item + " mutiny")
                .onItem().transform(String::toUpperCase)
                .subscribe().with(
                item -> System.out.println(">> " + item));
    }
}
