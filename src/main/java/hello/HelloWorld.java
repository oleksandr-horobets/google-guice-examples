package hello;

import com.google.inject.Guice;

public class HelloWorld {
    public static void main(String[] args) {
        Guice.createInjector().getInstance(Greeter.class).sayHello();
    }
}


