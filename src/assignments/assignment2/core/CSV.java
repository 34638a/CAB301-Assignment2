package assignments.assignment2.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CSV {
    private PrintWriter pw;
    private StringBuilder sb;

    /*
    Create CSV file
    Input:
        The csv file name excluding the file extension
    Output:
        N/A
    Description:
        Creates a new csv file with the supplied name through the PrintWriter and
        StringBuilder utilities. Prints error if failed.
    */
    void createCSV(String filename) {
        try {
            pw = new PrintWriter(new File(filename + ".csv"));
            sb = new StringBuilder();
        } catch (FileNotFoundException e) {
            System.err.println("CSV creation failed: " + e);
        }
    }

    /*
    Add Comma
    Input:
        N/A
    Output:
        N/A
    Description:
        Adds a comma to the string builder. Prints error if failed.
    */
    void addComma() {
        try {
            sb.append(",");
        } catch (Exception e) {
            System.err.println("String add failed: " + e);
        }
    }

    /*
    Add String
    Input:
        A string
    Output:
        N/A
    Description:
        Adds the supplied string to the string builder. Prints error if failed.
    */
    void addString(String string) {
        try {
            sb.append(string);
        } catch (Exception e) {
            System.err.println("String add failed: " + e);
        }
    }

    /*
    Add int
    Input:
        An int
    Output:
        N/A
    Description:
        Adds the supplied integer to the string builder. Prints error if failed.
    */
    void addInt(int num) {
        try {
            sb.append(num);
        } catch (Exception e) {
            System.err.println("int add failed: " + e);
        }
    }

    /*
    Add long
    Input:
        A long
    Output:
        N/A
    Description:
        Adds the supplied long to the string builder. Prints error if failed.
    */
    void addLong(long num) {
        try {
            sb.append(num);
        } catch (Exception e) {
            System.err.println("long add failed: " + e);
        }
    }

    /*
    Export CSV
    Input:
        N/A
    Output:
        N/A
    Description:
        Writes the string builder to the print writer and saves it as a CSV file. Prints error if failed.
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
