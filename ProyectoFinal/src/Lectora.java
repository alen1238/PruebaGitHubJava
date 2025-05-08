import java.util.Scanner;

public class Lectora {
    private Scanner lector;

    public Lectora() {
        lector = new Scanner(System.in);
    }

    public Scanner getLector(){
        return lector;
    }
}
