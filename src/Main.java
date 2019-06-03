package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
// Importing all required packages that are needed in the code.


public class Main {

    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("input.txt"), Charset.defaultCharset());
        // Importing required data from the file in the directory of the projects.

        int a = Integer.parseInt(lines.get(0));
        int b = Integer.parseInt(lines.get(1));
        int c = Integer.parseInt(lines.get(2));
        int d = Integer.parseInt(lines.get(3));
        int e = Integer.parseInt(lines.get(4));
        // Creating massive of the rows with reading all lines with the digets.

        int x = a + b;
        int y = e + (c - d);
        int z = e / a;
        int zx = x * y;
        // Done math operations

        String Plus = Integer.toString(x);
        String Minus = Integer.toString(y);
        String Division = Integer.toString(z);
        String Double = Integer.toString(zx);
        // Wrinting the result into the file

        PrintWriter out = new PrintWriter("output.txt");
        // Result of the math operations is implented for the another file that can display it.

        out.println(Plus);
        out.println(Minus);
        out.println(Division);
        out.println(Double);
        // Selecting the result of the math operations in the separate lines in the output file of the project.

        out.close();
    }
}