package assignment3;
import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.Scanner;

	public class ReverseSearch {

		public static void main(String[] args) throws IOException {
			Scanner sc = new Scanner(System.in);
			System.out.print("Please enter a filename: ");
			String filename = sc.nextLine();
			System.out.print("Please enter a value to be searched for: ");
			int K = Integer.parseInt(sc.nextLine());
			System.out.println("Searching...");
			
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			
			String line;
			
			ArrayList<Integer> values = new ArrayList<>();
			while((line = br.readLine()) != null) {
				values.add(Integer.parseInt(line));
				
			}
			
			int retValue = -1;
			boolean retbool = false;
			for(int i = 0; i < values.size(); i++) {
				if(values.get(i) == K) {
					retbool = true;
					
					if(retValue<i) {
						retValue = i;
					}
				}
			}
			
			if(retbool == false) {
				System.out.println("Not found! Exiting with error code: -1");
			}
			if(retbool == true) {
				System.out.println("Found! The last index of the value " + K + " is at index " + retValue);
			}
			
		}
	}

