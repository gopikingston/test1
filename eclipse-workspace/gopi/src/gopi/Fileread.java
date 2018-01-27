package gopi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fileread {
	public static void main(String[] args) throws FileNotFoundException {
	
		File f = new File("/home/gopinath/t1");
	
		Scanner scan = new Scanner(f);
		scan.useDelimiter("[^A-Za-z]+");
		
		while(scan.hasNextLine()) {
		
			System.out.println(scan.nextLine());
		
		}
	
		
	}

}
