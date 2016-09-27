import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the initial tuition: ");
		
		double iT = input.nextDouble();
		
		System.out.println("Enter the increase rate: ");
		double iR = input.nextDouble();
		
		double tT = iT;
		for(int i = 1; i<=3;i++){
			tT = tT + iT*(Math.pow(1+iR, i));
		}
		System.out.printf("The total tuition is $%4.2f" ,tT);
	}
}
