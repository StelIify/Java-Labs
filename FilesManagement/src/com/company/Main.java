/**
 * @author Oleksandr Zorenko KNUTE
 * @version 24.06.2020
 *
 * Classname Main
 * The main class where all actions will be executed
 *
 * Module 4. Files management.
 * 1. Parse the file logs.txt (see the attachment).  Extract to a separate file all the logs from October 2019
 * 2. Calculate the total number of logs (lines)
 * 3. Calculate the total  number of  ERROR logs. Use previous skills - String.split
 * 4. Calculate the total number of ERROR logs. Use Files.lines
 * 5. Compare two results
 **/

package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) throws IOException {

        // Parse the file logs.txt
        String fileData = new String(Files.readAllBytes(Paths.get("C:\\Users\\StelLify\\Desktop\\logs.txt")));

        // split file string into array by next line
        String[] lines = fileData.split("\\n");

        // Get all lines which are dated in October 2019
        List<String> octoberLines = Files.lines(Paths.get("C:\\Users\\StelLify\\Desktop\\logs.txt"))
                .filter(line -> line.contains("2019-10"))
                .collect(Collectors.toList());

        String octoberLogs = "";
        // collect List elements to octoberLogs string
        for (String line :octoberLines){
            octoberLogs += line + System.lineSeparator();
        }

        Path path = Paths.get("C:\\Users\\StelLify\\Desktop\\octoberLogs.txt");
        Files.write(path, octoberLogs.getBytes());

        // Calculate the total number of logs (lines)
        System.out.println("The total number of logs (lines): " + lines.length);

        // Calculate the total number of ERROR logs
        int errorsLines = 0;

        LocalDateTime start1 = LocalDateTime.now();

        for (String line : lines) {
            if (line.contains("ERROR")) {
                errorsLines++;
            }
        }

        LocalDateTime finish1 = LocalDateTime.now();

        // calculate difference between start and finish
        long executionTime1 = ChronoUnit.MILLIS.between(start1, finish1);

        System.out.println("the total number of ERROR logs: (using String.split) " + errorsLines);

        //  Calculate the total number of ERROR logs. Use Files.lines
        LocalDateTime start2 = LocalDateTime.now();
        final long errorsLines2 = Files.lines(Paths.get("C:\\Users\\StelLify\\Desktop\\logs.txt"))
                .filter(line -> line.contains("ERROR"))
                .count();

        LocalDateTime finish2 = LocalDateTime.now();

        // calculate difference between start and finish
        long executionTime2 = ChronoUnit.MILLIS.between(start2, finish2);

        System.out.println("The total number of ERROR logs: (using Files.lines) " + errorsLines2);

        //Compare two results
        System.out.println("It took " + executionTime1 + " ms. to count ERROR logs using String.split");
        System.out.println("It took " + executionTime2 + " ms. to count ERROR logs using Files.lines");

    }
}