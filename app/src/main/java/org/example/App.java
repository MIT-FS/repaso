/*
 * clase principal
 */
package org.example;

public class App {
    public String getGreeting() {
        return "Hola mundo me llamo javcamgil";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
