package assignment3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

	public class SecondLargest {
	public static void main(String[] args) throws IOException {
			
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Please enter a filename: ");
			String filename = sc.nextLine();
			
			System.out.println("Looking for second largest...");
			
		
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			
			
			String line;
			int sL = Integer.MIN_VALUE;
			int sLP = -1;
			int largest = Integer.MIN_VALUE + 1;
			int largestPlace = -1;
			int pV;
			
			
			ArrayList<Integer> values = new ArrayList<>();
			while((line = br.readLine()) != null) {
				values.add(Integer.parseInt(line));
			}
			
			if(values.size() < 2) {
				System.out.println(Integer.MIN_VALUE);
			}
			
			
			for(int i = 0; i < values.size(); i++){
				pV = values.get(i);
				
				if(pV > largest) {
					sL = largest;
					largest = pV;
					sLP = largestPlace;
					largestPlace = i;
				}else if (pV < largest && pV > sL) {
					sLP = i;
					sL = pV;
				}
				
				
			}
			
			System.out.println("The second largest value is " + sL + " at index " + sLP+ ".");
		}
	}

