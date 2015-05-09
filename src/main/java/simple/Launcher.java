package simple;

import com.google.inject.Guice;

public class Launcher {
    public static void main(String[] args) {
        Guice.createInjector().getInstance(BeanB.class).hello();
    }
}
