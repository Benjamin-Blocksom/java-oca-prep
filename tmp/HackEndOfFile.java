       import java.io.*;
import java.util.*;

public class HackEndOfFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineNumber = 1;
        while (sc.hasNext()){
            System.out.println(lineNumber + " " + sc.nextLine());
            lineNumber++;
        }
        sc.close();
    }
}
