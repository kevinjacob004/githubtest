import java.io.*;

class FileReaderThread extends Thread {
    public void run() {
        try (FileInputStream fin = new FileInputStream("f4.txt");
             FileOutputStream foutPrime = new FileOutputStream("f5.txt");
             FileOutputStream foutNonPrime = new FileOutputStream("f6.txt")) {

            int i;
            while ((i = fin.read()) != -1) {
               

                int number = Character.getNumericValue(i);
                int f = 0; // Initialize f inside the loop

                for (int j = 2; j <= number / 2; j++) {
                    if (number % j == 0) {
                        f = 1;
                        break;
                    }
                }

                if (f == 0) {
                    foutPrime.write(i);
                } else {
                    foutNonPrime.write(i);
                }
            }
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

class fileprime {
    public static void main(String arg[]) {
        FileReaderThread fileReaderThread = new FileReaderThread();
        fileReaderThread.start();
    }
}