package assignments.assignment2.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by Jack's Surface on 30/04/2018.
 * Authored by Jack
 */
public class CSV {
    private PrintWriter pw;
    private StringBuilder sb;


    /**
     * Creates a new csv file with the supplied name through the PrintWriter and StringBuilder utilities.
     * Prints error if failed.
     * @param filename The filename of the generated CSV file.
     */
    void createCSV(String filename) {
        try {
            pw = new PrintWriter(new File(filename + ".csv"));
            sb = new StringBuilder();
        } catch (FileNotFoundException e) {
            System.err.println("CSV creation failed: " + e);
        }
    }


    /**
     * Adds a comma to the string builder. Prints error if failed.
     */
    void addComma() {
        try {
            sb.append(",");
        } catch (Exception e) {
            System.err.println("String add failed: " + e);
        }
    }


    /**
     * Adds the supplied string to the string builder. Prints error if failed.
     */
    void addString(String string) {
        try {
            sb.append(string);
        } catch (Exception e) {
            System.err.println("String add failed: " + e);
        }
    }


    /**
     * Adds the supplied integer to the string builder. Prints error if failed.
     */
    void addInt(int num) {
        try {
            sb.append(num);
        } catch (Exception e) {
            System.err.println("int add failed: " + e);
        }
    }


    /**
     * Adds the supplied long to the string builder. Prints error if failed.
     */
    void addLong(long num) {
        try {
            sb.append(num);
        } catch (Exception e) {
            System.err.println("long add failed: " + e);
        }
    }


    /**
     * Writes the string builder to the print writer and saves it as a CSV file. Prints error if failed.
     */
    void exportCSV() {
        try {
            pw.write(sb.toString());
            pw.close();
        } catch (Exception e) {
            System.err.println("CSV export failed: " + e);
        }
    }
}
