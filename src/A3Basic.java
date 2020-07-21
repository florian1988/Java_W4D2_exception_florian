import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class A3Basic {


    public void cat(String named) throws IOException {
        RandomAccessFile input = null;
        String line = null;

        try {

            input = new RandomAccessFile(named, "rws");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }

        }finally {
            if (input != null) {
                input.close();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        A3Basic outcome = new A3Basic();
        outcome.cat("double");
    }
}
