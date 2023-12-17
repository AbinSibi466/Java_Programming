package ClassWork;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class AdderThread extends Thread {
    private String inFile, outFile;
    private static final Object lock = new Object(); // For synchronization
    private static int totalSum = 0; // Shared total sum

    public AdderThread(String inFile, String outFile) {
        this.inFile = inFile;
        this.outFile = outFile;
    }

    @Override
    public void run() {
        int localSum = 0;
        String line = null;

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(inFile))) {
            while ((line = reader.readLine()) != null) {
                localSum += Integer.parseInt(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Synchronize access to totalSum
        synchronized (lock) {
            totalSum += localSum;
        }

        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outFile))) {
            writer.write("Total: " + localSum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int getTotalSum() {
        return totalSum;
    }
}

public class Main2 {
    public static void main(String[] args) {
        String[] inFiles = {"./file1.txt", "./file2.txt", "./file3.txt", "./file4.txt", "./file5.txt", "./file6.txt"};
        String[] outFiles = {"./file1.out.txt", "./file2.out.txt", "./file3.out.txt", "./file4.out.txt", "./file5.out.txt", "./file6.out.txt"};

        // Create and start threads
        Thread[] threads = new Thread[inFiles.length];
        for (int i = 0; i < inFiles.length; i++) {
            AdderThread adderThread = new AdderThread(inFiles[i], outFiles[i]);
            threads[i] = adderThread;
            adderThread.start();
        }

        // Wait for all threads to finish
        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the total sum
        System.out.println("Total sum across all files: " + AdderThread.getTotalSum());
    }
}
