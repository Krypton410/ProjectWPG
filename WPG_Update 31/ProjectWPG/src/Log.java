
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

public class Log {

    myMain main = new myMain();
    Challenge challenge = new Challenge();
    Ranking ranking = new Ranking();

    public static Integer Name  = 0;
    public static Integer Rep  = 1;
    public static Integer Time  = 2;
    public static void main(String[] args) throws IOException {
       
        File f;
       
        f = new File("Log.txt");

        if (!f.exists()) {
            f.createNewFile();
            System.out.println("Log.txt");
        }

        //FileWriter fs = new FileWriter(f);
        BufferedWriter op = new BufferedWriter(new FileWriter(f, true));

        op.write("log");
        op.close();

    }
    Iterable<String> USERS;
    
    
    
    
    

    public String postData3(String name, String replog, String timelog, JLabel[] labels) throws IOException {
        File f;
         ArrayList<String> USERS = new ArrayList<String>();
        PushUpChallenge puc = new PushUpChallenge();

        f = new File("Log.txt");
        if (!f.exists()) {
            f.createNewFile();
            JOptionPane.showMessageDialog(null, "Log Made");
        }
        JOptionPane.showMessageDialog(null, "Log Started");
        //Writer fs = new FileWriter(f);
        Writer op;
        op = new BufferedWriter(new FileWriter(f, true));
        Charset charset = StandardCharsets.UTF_8;
        //  Files.newBufferedWriter(f, charset, StandardOpenOption.APPEND);
        String e = main.maintextbox.getText();

        StringBuilder sb = new StringBuilder();


        
            op.append("#  USER  #   REP  #    TIME       ");
            op.append("\n");
            op.append("#NAME");
            op.write("   ");
            op.write("#REP");
            op.write("   ");
           op.write("#TIME");
        
      
        op.append("\n");
        op.append((name) + "        " + (replog) + "        " + (timelog));

        op.append("\n");
        Files.write(Paths.get("log.txt"), sb.toString().getBytes(), StandardOpenOption.APPEND);
        op.close();

        FileInputStream ifs = new FileInputStream(f);
        DataInputStream in = new DataInputStream(ifs);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String str;
        String pr;

        while ((str = br.readLine()) != null) {
            /*    
          ranking.postName(str);
          ranking.postName(str);
           challenge.postData(uname);
             */
             JOptionPane.showMessageDialog(null, str);

        str = str.trim();
        if((str.length()!=0) && (str.charAt(0)!='#')){
            
            String[] logname = str.split("\\s+");
            USERS.add(logname[Name]);
            
        }
            
          JLabel userA1,userB2, userC3,userD4,userE5,userF6,userG7,userH8,userI9,userJ0;
          userA1 = ranking.userA;
          userB2 = ranking.userB;
          userC3 = ranking.userC;
          userD4 = ranking.userD;
          userE5 = ranking.userE;
          userF6 = ranking.userF;
          userG7 = ranking.userG;
          userH8 = ranking.userH;
          userI9 = ranking.userI;
          userJ0 = ranking.userJ;
          
          
          
            for (String s : USERS){
                System.out.println(s);
                String cur[] = {s};
                labels = new  JLabel[cur.length];
                int i;
                 
                 
                for(i=0; i <cur.length; i++){
                    labels[i] = new JLabel(cur[i]);
                   // ranking.postData3(labels);
                }
               // ranking.postData(s);
               
            }
            
    

        

        }

            
        
                    

        
        
        
        
        
        
        in.close();

        return name;
        
    }

    
    
    
    
    
}
