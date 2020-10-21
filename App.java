
public class App {

	public static void main(String[] args) {
		
		for(byte i=5;i>=1;i--) {
			for(byte j=1;j<=5;j++) {
				if(j>=i) {
					System.out.print(j);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

	}

}
