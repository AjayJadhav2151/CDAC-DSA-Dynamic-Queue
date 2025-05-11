package DynamicQueue;
import java.util.Scanner;

public class ClientDynamicQueue {

	public static void main(String[] args) {
		DynamicQueue q = new DynamicQueue();
		
		Scanner sc = new Scanner(System.in);
		
		int value = 0,option = 0;
		
		do {
			System.out.println("********MENU*****************");
			System.out.println("\n 1.ENQUEUE"+
								"\n 2.DEQUEUE"+
								"\n 3.display"+
								"\n 0.exit");
			System.out.println("Enter your Choice: ");
			option = sc.nextInt();
			
			switch (option) {
			case 1:{
				System.out.println("Enter values: ");
				value = sc.nextInt();
				
				q.Enqueue(value);
				break;
			}
			case 2:{
				value = q.Dequeue();
				if(value != -1) {
					System.out.println("Dequeu::"+value);
				}
				break;
			}
			case 3:{
				q.display();
				break;
			}

			case 0:{
				System.out.println("End........");
				System.exit(0);
			}
		}
		} while(option != 0);

	}

}
