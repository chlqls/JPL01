//예제5

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EOFExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "number.dat";
		
		try {
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName));
			
			System.out.println("Reading ALL the integers");
			System.out.println("in the file " + fileName);
			
			try {
				while(true) {
					int anInteger = inputStream.readInt();
					System.out.println(anInteger);
				}
			}
			catch(EOFException e) {
				System.out.println("End of reading from file.");
			}
			inputStream.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("Cannot find file " + fileName);
		}
		catch(IOException e) {
			System.out.println("Problem with input from file " + fileName);
		}
		
	}

}
