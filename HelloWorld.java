import java.util.*;

public class Hello {

  public static void main(String[] args) {

    System.out.println( "Hello World!" );

    ArrayList<String> greetings = new
    ArrayList<String>();

    greetings.add("Hola");
    greetings.add("Bonjour");
    greetings.add("Ni hao");
    greetings.add("Jambo");

    for (String hello: greetings) {
      System.out.println(hello);
    }

  }
}
