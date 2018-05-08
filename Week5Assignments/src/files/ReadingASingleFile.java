/*
@author Jacob Duchen
*/

package files;

import java.io.File;
import java.util.Scanner;


public class ReadingASingleFile
{

    public static void main(String[] args) throws Exception
    {
        System.out.println("1. Reading a single file\n");
        // creating an instance of File package tool
        File file = new File("/Users/jacobduchen/desktop/hello.txt");
        //bringing in scanner
        Scanner fileInput = new Scanner(file);
        //parsing through text file with next line, which eats up white space as well i think?
        while (fileInput.hasNextLine())
            System.out.println(fileInput.nextLine());
    }
}
