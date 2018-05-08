/*
@author Jacob Duchen
*/

package files;

import java.io.File;
import java.util.Scanner;

public class ReadingMultipleFiles {

    public static void main(String[] args) throws Exception
    {
        System.out.println("1. Reading a single file\n");
        // creating an instance of File package tool
        File fileNames = new File("/Users/jacobduchen/desktop/courseName.txt");
        File fileCodes = new File("/Users/jacobduchen/desktop/courseCode.txt");
        //bringing in scanner
        Scanner fileInputName = new Scanner(fileNames);
        Scanner fileInputCode = new Scanner(fileCodes);
        //parsing through text file with next line, which eats up white space as well i think?
        //here we print our information in desired formatted string
        while (fileInputName.hasNextLine())
            System.out.println(fileInputCode.nextLine() +  " - " + fileInputName.nextLine());
    }
}
