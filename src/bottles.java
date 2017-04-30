
public class bottles {
	public static void main(String[] args) {
		int song = 99;
		for (int i = 0; i < 98; i++) {
			if (song >= 2) {
				System.out.println(" ");
				System.out.println(song + " bottles of milk on the wall");
				System.out.println(song + " bottles of milk");
				System.out.println("take one down pass it around");
				song--;
			}
				if (song <= 1) {
					System.out.println(song + " bottle of milk on the wall.");
				}
				else{
					System.out.println(song + " bottles of milk on the wall.");
				}
				if (song == 1) {
					System.out.println(" ");
					System.out.println(song + " bottle of milk on the wall");
					System.out.println(song + " bottle of milk");
					System.out.println("take it down pass it around");
					System.out.println("no more bottles of milk on the wall");
				}
			}
		}
	}
