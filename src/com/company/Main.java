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

        int a = Integer.parseInt(lines.get(0)), b = Integer.parseInt(lines.get(1)), c = Integer.parseInt(lines.get(2)), d = Integer.parseInt(lines.get(3)), e = Integer.parseInt(lines.get(4));;
        //Initializing variables for each line.


        //Defining all variables with the lines from the file


        int x, y, z, zx;
        x = a + b;
        y = e + (c - d);
        z = e / a;
        zx = x * y;
        // Done math operations

        String plus = Integer.toString(x);
        String minus = Integer.toString(y);
        String division = Integer.toString(z);
        String multiplication = Integer.toString(zx);
        // Wrinting the result into the file

        PrintWriter out = new PrintWriter("output.txt");
        // Result of the math operations is implented for the another file that can display it.

        out.println(plus);
        out.println(minus);
        out.println(division);
        out.println(multiplication);
        // Selecting the result of the math operations in the separate lines in the output file of the project.

        out.close();
    }
}