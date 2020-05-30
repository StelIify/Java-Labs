package com.company;
import java.io.File;
import java.util.Scanner;
import java.util.Hashtable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
    public static void main(String[] args)throws Exception
    {
        String data = "";
        String [] words;
	    File myFile = new File("C:\\Users\\StelLify\\Desktop\\Harry Potter.txt");
	    Scanner myReader = new Scanner(myFile);
	    while (myReader.hasNextLine())
	    {
            data = myReader.nextLine();
            System.out.println((data));

            String in = data;
            int i = 0;
            Pattern p = Pattern.compile("Harry");
            Matcher m = p.matcher( in );
            while (m.find()) {
                i++;
            }
            System.out.println("Word Harry is met " + i + " time");

            String s = data;
            words = s.split(" ");
            String longestWord = "";
            for(int j = 0; j < words.length; j++){
                if(words[j].length() >= longestWord.length()){
                    longestWord = words[j];
                }
            }
            System.out.println("Longest word is " + longestWord);
        }
        myReader.close();

    }


}
