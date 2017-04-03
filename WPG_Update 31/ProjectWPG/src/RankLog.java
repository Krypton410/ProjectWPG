
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class RankLog {
    

    myMain main = new myMain();
    Challenge challenge = new Challenge();
    Ranking ranking = new Ranking();

    public static Integer Name  = 0;
    public static Integer Rep  = 1;
    public static Integer Time  = 2;
    public static void main(String[] args) throws IOException {
       
        File f;
       
        f = new File("Ranking Log.txt");

        if (!f.exists()) {
            f.createNewFile();
            JOptionPane.showMessageDialog(null, "Ranking Log.txt created!");
            System.out.println("Ranking Log.txt");
        }

        //FileWriter fs = new FileWriter(f);
        BufferedWriter op = new BufferedWriter(new FileWriter(f, true));

        op.write("Ranking Log");
        op.close();

    }
    Iterable<String> USERS;
    
    
    
    
    

    public static void postData3(String name, String replog, String timelog, JLabel[] labels) throws IOException {


    
    
    
    
    
}}
