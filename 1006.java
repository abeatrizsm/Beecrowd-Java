import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
      Scanner prompt = new Scanner(System.in);
      double a = prompt.nextDouble();
      double b = prompt.nextDouble();
      double c = prompt.nextDouble();

      double media = ((a*2)+(b*3)+(c*5))/10;

      System.out.printf("MEDIA = %.1f\n", media);
      prompt.close();
    }
}