/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package dinasour;

import java.util.ArrayList;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }

    public static boolean search(ArrayList<Integer> array, int e) {
        System.out.println("Inside search");

        if(array == null) return false;

        for(int element : array) {
            if(element == e) return true;
        }
        return false;
    }
}
