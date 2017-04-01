import java.io.*;

public class Pass
{
        public void postData(String uname){
        this.getText(uname);}
    
   public static void main(String[] args) throws IOException{
       File f;
       f = new File("Data");
       
       if(!f.exists()){
           f.createNewFile();
           System.out.println("new data.txt");
       }
       
       
       
       FileWriter fs = new FileWriter(f);
       BufferedWriter op = new BufferedWriter(fs);
       
       op.write("awefaa");
       op.close();
       

   }

    private void getText(String uname) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
           
   
}