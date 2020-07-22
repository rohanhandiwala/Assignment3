package assignment3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MinFinder {
	public static void main(String[] args) throws IOException {
		
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a filename: ");
		String filename = sc.nextLine();
		
		System.out.println("Looking for minimum...");
		
		
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		
		
		String line;
		int rV = Integer.MAX_VALUE;
		int rP = -1;
		int pV;
		
		
		
		ArrayList<Integer> values = new ArrayList<>();
		while((line = br.readLine()) != null) {
			values.add(Integer.parseInt(line));
		}
		
		for(int i = 0; i < values.size(); i++){
			pV = values.get(i);
			
			if(rV > pV) {
				rV = pV;
				rP = i;
			}
		}
		
		System.out.println("The minimum value is " + rV + " at index " + rP + ".");
	}
}