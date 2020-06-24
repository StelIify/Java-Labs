/**
 * @author Oleksandr Zorenko KNUTE
 * @version 24 of June 2020
 *
 * Classname LogsManager
 *
 * Module 4. Mulithreading.
 * 1. Use the file from the previous task - logs.txt.
 * 2. Create a class that manages logs in this file.
 * 3. Create a method that finds all the ERROR logs for a specific date and write them
 *    into a specific file (name = ERROR  + Date  + .log).
 * 4. In your main class develop a functionality to create  5 such a files for 5 different days.
 *    Launch them in consistent way (one after another).
 * 5. Repeat the above task in parallel way. Multi-threading.
 * 6. Compare the results.
 **/

package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;



public class LogsManager
{
    private String filePath;

    public LogsManager(String filePath)
    {
        this.filePath = filePath;
    }

    public void setFilePath(String filePath)
    {
        this.filePath = filePath;
    }

    public String getFilePath()
    {
        return filePath;
    }

    /**
     * a method that finds all the ERROR logs for a specific date and write them
     * into a specific file (name = ERROR  + Date  + .log).
     * @param date search by given date
     */

    public void getErrorByDate(String date) throws IOException
    {
        LocalDateTime start = LocalDateTime.now();

        // Get ERROR logs by given date
        List<String> errorLinesList = Files.lines(Paths.get(this.getFilePath()))
                .filter(line -> line.contains(date))
                .filter(line -> line.contains("ERROR"))
                .collect(Collectors.toList());

        // count the number of logs
        int linesCount = errorLinesList.size();

        LocalDateTime finish = LocalDateTime.now();

        // count execution time
        long timeExecuted = ChronoUnit.MILLIS.between(start, finish);

        System.out.println("There are " + linesCount + " ERROR lines." + " on " + date);
        System.out.println("Execution time: " + timeExecuted);

        // convert logs to String
        String stringData = "";
        for (String line : errorLinesList) {
            stringData += line + "\n";
        }

        // specify output file path
        String outputPath = "D:\\Java for Slovakia\\Multi-threading\\src\\com\\company\\ERROR-date" + date + ".txt";
        // write result to the file
        Files.write(Paths.get(outputPath), stringData.getBytes());
    }

}
