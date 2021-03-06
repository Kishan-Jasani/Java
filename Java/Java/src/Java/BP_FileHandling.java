package Java;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BP_FileHandling {
	
public static void main(String[] args) throws IOException{
	//Code to create a new File
	File myFile = new File("Kishan.txt");
	myFile.createNewFile();
	
	//Code to write in a File
	FileWriter fw=new FileWriter("Kishan.txt");
	fw.write("This is our first Handled File\nOkay Bye Bye!");
	fw.close();
	
	//Read a file
	Scanner sc=new Scanner(myFile);
	while(sc.hasNextLine()) {
		System.out.println(sc.nextLine());
	}
	sc.close();
	
	//Delete a File
	if(myFile.delete()) {
		System.out.println("I have deleted file");
	}
	else {
		System.out.println("Some Error Occurred!");
	}
}
}

