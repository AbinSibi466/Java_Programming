package labEx5;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class Adder extends Thread {
    private String inFile, outFile;

    public Adder(String inFile, String outFile) {
        this.inFile = inFile;
        this.outFile = outFile;
    }

    public void run() {
        try {
            int total = 0;
            String line;

            try (BufferedReader reader = Files.newBufferedReader(Paths.get(inFile))) {
                while ((line = reader.readLine()) != null)
                    total += Integer.parseInt(line);
            }

            try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outFile))) {
                writer.write("Total: " + total);
            }
        } catch (IOException e) {
            // Handle IOException (e.g., print an error message)
            e.printStackTrace();
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        String[] inFiles = {
            "./file1.txt",
            "./file2.txt",
            "./file3.txt",
            "./file4.txt", 
            "./file5.txt",
            "./file6.txt"
        };
        String[] outFiles = new String[inFiles.length];

        // Generate output file names based on input file names
        for (int i = 0; i < inFiles.length; i++) {
            outFiles[i] = inFiles[i].replace(".txt", ".out.txt");
        }

        Adder[] adders = new Adder[inFiles.length];

        for (int i = 0; i < inFiles.length; i++) {
            adders[i] = new Adder(inFiles[i], outFiles[i]);
            adders[i].start();
        }

        for (Adder adder : adders) {
            try {
                adder.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
