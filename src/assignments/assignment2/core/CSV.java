package assignments.assignment2.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CSV {
    private PrintWriter pw;
    private StringBuilder sb;

    void createCSV(String filename) {
        try {
            pw = new PrintWriter(new File(filename + ".csv"));
            sb = new StringBuilder();
        } catch (FileNotFoundException e) {
            System.err.println("CSV creation failed: " + e);
        }
    }

    void addComma() {
        try {
            sb.append(",");
        } catch (Exception e) {
            System.err.println("String add failed: " + e);
        }
    }

    void addString(String string) {
        try {
            sb.append(string);
        } catch (Exception e) {
            System.err.println("String add failed: " + e);
        }
    }

    void addInt(int num) {
        try {
            sb.append(num);
        } catch (Exception e) {
            System.err.println("int add failed: " + e);
        }
    }

    void addLong(long num) {
        try {
            sb.append(num);
        } catch (Exception e) {
            System.err.println("long add failed: " + e);
        }
    }

    void exportCSV() {
        try {
            pw.write(sb.toString());
            pw.close();
        } catch (Exception e) {
            System.err.println("CSV export failed: " + e);
        }
    }
}
