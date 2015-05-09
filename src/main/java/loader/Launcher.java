package loader;

import com.google.inject.Guice;

public class Launcher {
    public static void main(String[] args) {
        Guice.createInjector(new Module1());
    }
}
