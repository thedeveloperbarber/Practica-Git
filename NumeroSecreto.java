import java.util.Random;
import java.util.Scanner;
public class NumeroSecreto {

	public static void main(String[] args) {
		Random rd;
		rd=new Random();
		int numSecreto = rd.nextInt(10);
		int n=1;
		int x;
		Scanner sc=new Scanner(System.in);
		while (n<=5) {
			System.out.println("Introduce un numero entre 1 y 10: ");
			x=sc.nextInt();
			 if (numSecreto==x) {
				 System.out.printf("Felicidades, has acertado el numero %d", numSecreto);
				 break;
			 }
			 else if (n==5) {
				 System.out.printf("Lo siento, no has acertado el número %d", numSecreto);
			 }
			 n+=1;
		}
		sc.close();

	}

}
