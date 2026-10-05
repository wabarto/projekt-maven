package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
            System.out.println("i = " + i);
        }

        Files.readString(Path.of("src/main/resources/application.yml"));

        // zasob lezy w src/main/resources/application.yml czyli w korzeniu sciezki klas



        InputStream a = Main.class.getResourceAsStream("application.yml");
        System.out.println(a); // null - szukal w org/example/application.yml

        InputStream b = Main.class.getResourceAsStream("/application.yml");
        System.out.println(b != null); // true - ukosnik oznacza korzen

        InputStream c = Main.class.getClassLoader().getResourceAsStream("application.yml");

        System.out.println(c != null); // true ClassLoader zawsze oznacza korzen

        InputStream d = Main.class.getClassLoader().getResourceAsStream("/application.yml");
        System.out.println(d); // null bo przy ClassLoaderze ukosnik przeszkadza

        readResource("application.yml");
        readResource("data/sample.csv");

    }

    // shouldReadResourceReturnString
    // getResourceAsStream() -> InputStream
    // shouldReadResourceThrowIllegalStateException()
    // getResourceAsStream() -> null

    static String readResource(String name) {
        try (InputStream in = Main.class.getClassLoader().getResourceAsStream(name)) { // -> null
            if (in == null) {
                throw new IllegalStateException("no resource");
            }
            return new String(in.readAllBytes(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new UncheckedIOException("not able to read resource", e);
        }
    }

}