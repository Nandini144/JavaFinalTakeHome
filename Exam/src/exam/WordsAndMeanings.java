/*Given a path to the file, do the following
 * 1.create a method called doesFileExist(String path) which 
 * takes the path of the file and tells user if the file exists at
 * that path or not. Asume all paths are relative to your project 
 * structure. If the file does not exist, catch the requisite exception.
 * 2. Read each word and its possible meanings and print them out.
 * your output should look like this:
 * word1
 * meaning1
 * meaning2
 * 
 */
package exam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordsAndMeanings {

	public static void main(String[] args) throws IOException {
		// Reading from file
		String path = "C:\\Users\\Nandini\\Desktop\\finalTakeHomeData.txt";
		boolean outcome = doesFileExist("C:\\Users\\Nandini\\Desktop\\finalTakeHomeData.txt");
		if (outcome == true) {
			File f = new File(path);
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);

			// loop to read a line and put it in line variable and loop until it reads
			// through all lines
			String line = null;
			while ((line = br.readLine()) != null) {
				// splitting each line based on '-' and putting in a lineArray
				String[] lineArray = line.split("-");
				// splitting the meanings by","
				String[] lineArray2 = lineArray[1].split(",");

				System.out.print("Word : " + lineArray[0] + "\n");
				System.out.print("Meaning 1 : " + lineArray2[0] + "\n");
				System.out.print("Meaning 2 : " + lineArray2[1].trim() + "\n");

			}
		}
	}

	public static boolean doesFileExist(String path) throws IOException {

		try {
			File file = new File(path);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			// Check if the specified file
			// Exists or not
			if (file.exists()) {
				System.out.println("File Exists");
				return true;
			}
		} catch (Exception e) {
			File file = new File(path);
			System.out.println("The file " + file.getPath() + " was not found.");
		}

		return false;
	}

}
