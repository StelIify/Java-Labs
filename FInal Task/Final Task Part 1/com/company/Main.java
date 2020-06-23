/**
 * @author Oleksandr Zorenko KNUTE
 * @version 23.06.2020
 *
 * Classname Main
 *  Final Testing
 *  Task description:
 *
 *  1.1. Download a text about Harry Potter.
 *
 *  1.2. For each distinct word in the text calculate the number of occurrence.
 *
 *  1.3. Use RegEx..
 *
 *  1.4. Sort in the DESC mode by the number of occurrence..
 *
 *  1.5. Find  the first 20 pairs.
 *
 *  1.6  Find all the proper names
 *
 *  1.7.  Count them and arrange in alphabetic order.
 *
 *  1.8.   First 20 pairs and names write into to a file test.txt
 *
 *  1.9.  Create a fine header for the file
 *
 *  1.10  Use Java  Collections to demonstrate your experience (Map, List )
 **/

package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main
{
    //File to which we are going to write
    final static String outputFilePath = "C:\\Users\\StelLify\\Desktop\\test.txt";

    public static void main(String[] args) throws IOException
    {
        // get text from the file
        String text = new String(Files.readAllBytes(Paths.get("C:\\Users\\StelLify\\Desktop\\harry.txt")));

        // get all words from the text
        String[] allWords = text
                .replaceAll("[\\s\\.\\?\\!,\\-\":;]+", " ")
                .split("\\s+");

        //For each distinct word in the text calculate the number of occurrence.
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word: allWords)
        {
            if (wordCount.containsKey(word))
            {
                // Map already contains the word key. Just increment it's count by 1
                wordCount.put(word, wordCount.get(word) + 1);
            } else {

                // Map doesn't have mapping for word. Add one with count = 1
                wordCount.put(word, 1);
            }
        }

        for (Entry<String, Integer> entry: wordCount.entrySet())
        {
            System.out.println("Count of : " + entry.getKey() +
                    " in sentence = " + entry.getValue());
        }

        //Sort in the DESC mode by the number of occurrence.
        final Map<String, Integer> sortedByCount = wordCount.entrySet()
                .stream()
                .sorted((Map.Entry.<String, Integer>comparingByValue().reversed()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(sortedByCount);

        // create Iterator 'items' to be able to switch to next DescendingSortedMap elements from beginning
        Iterator<Map.Entry<String, Integer>> items = sortedByCount.entrySet().iterator();

        // define a path where first 20 pairs will be written
        Path path = Paths.get("C:\\Users\\StelLify\\Desktop\\test.txt");
        
        // write first 20 pairs to the file test.txt
        for (int i = 0; i < 20; i++) 
        {
            Map.Entry<String, Integer> pair = items.next(); // get next item
            System.out.format("Word: %s, occurences: %d%n", pair.getKey(), pair.getValue());
            // write occurrence pair to the file
            Files.write(path, (pair.getKey() + "\n").getBytes(), StandardOpenOption.APPEND);
        }

        //Find all the proper names
        List<String> names = new ArrayList<>();

        Pattern p = Pattern.compile("\\b[A-Z][a-z]{3,}\\b");
        Matcher m = p.matcher(text);
        while (m.find())
        {
            String word = m.group();
            names.add(word);
        }
        
        // Count them and arrange in alphabetic order.
        Collections.sort(names); // sort properNames in alphabetic order
        int properNamesAmount = names.size(); // count proper names
        System.out.println("Proper names amount: " + properNamesAmount);

        // -----------------------------------------------------------------------
        // First 20 pairs and names write into to a file test.txt
        // writing first 20 names to the file test.txt
        for (int i = 0; i < 20; i++) 
        {
            // printing the result
            System.out.println(names.get(i));
            // write proper name to the file
            Files.write(path, (names.get(i) + "\n").getBytes(), StandardOpenOption.APPEND);


    }
}
