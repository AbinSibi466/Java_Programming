package labEx5;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
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

            // Path inFilePath = Paths.get(inFile);
            // Path outFilePath = Paths.get(outFile);

            // System.out.println("Processing: " + inFilePath.toAbsolutePath());

            try (BufferedReader reader = Files.newBufferedReader(Paths.get(inFile))) {
                while ((line = reader.readLine()) != null)
                    total += Integer.parseInt(line);
            }

            try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outFile))) {
                writer.write("Total: " + total);
            }

            System.out.println("Output written to: " + Paths.get(outFile).toAbsolutePath());
        } catch (IOException e) {
            System.err.println("Error processing files:");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Error converting line to integer:");
            e.printStackTrace();
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        String[] inFiles = {
            "Java pgm\\labEx5\\file1.txt",
            "Java pgm\\labEx5\\file2.txt",
            "Java pgm\\labEx5\\file3.txt",
            "Java pgm\\labEx5\\file4.txt", 
            "Java pgm\\labEx5\\file5.txt",
            "Java pgm\\labEx5\\file6.txt"
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
 