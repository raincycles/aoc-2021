package xyz.raincycles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static xyz.raincycles.days.Day01Pt1.*;

public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Please provide a path to the input file");
            System.exit(1);
        }

        String input = null;

        try {
            final var inputPath = Paths.get(args[0]);
            input = Files.readString(inputPath);
        } catch (IOException ex) {
            System.err.println("Couldn't read input file: " + ex.getMessage());
            System.exit(1);
        }

        final var solution = solve(input);
        System.out.println(solution);
    }
}
