import java.io.File;
import java.io.IOException;

public class cl3 {
    public static void main(String[] args) {
        
        // Corrected file path string
        File f = new File("C:\\Users\\anura\\Desktop\\Angular\\Java3.txt");
        
        try {
            if (f.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }
        //  test change222dfg
        //  test change222dfgsgsdgfsf
    }
}

