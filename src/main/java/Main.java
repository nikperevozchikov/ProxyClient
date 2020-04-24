import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------");
        try {
            System.out.println(Client.multiple(2, 4));
        } catch (IOException ex) {
            ex.printStackTrace();
            System.err.println();
        }
    }
}