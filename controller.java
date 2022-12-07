import java.lang.Math;
import java.sql.Array;
import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class controller {
    static Double keyboard() {
        double result = Math.pow(view.enterDigit(), view.enterPow());
        return result;
    }

    public static String[] readFile() throws IOException {
        List<String> listOfStrings = new ArrayList<String>();
        BufferedReader bf = new BufferedReader(new FileReader("input.txt"));
        String line = bf.readLine();
        while (line != null) {
            listOfStrings.add(line);
            line = bf.readLine();
        }
        bf.close();
        String[] array = listOfStrings.toArray(new String[0]);
        return array;
    }
    
    public static Integer digit() throws Exception {
        String[] s = readFile();
        Integer a = Integer.parseInt (s[0]);
        return a;
    }
    
    public static Integer pow() throws Exception {
        String[] s = readFile();
        Integer b = Integer.parseInt (s[1]);
        return b;
    }
    
    static Double fromFile() throws Exception {
        double result = Math.pow(digit(), pow());
        return result;
    }

    static void writeFile() throws Exception {
        try(FileWriter fw = new FileWriter("output.txt", false)) {
            String s = Double.toString(fromFile());
            fw.write(s);
        }
    }
}



