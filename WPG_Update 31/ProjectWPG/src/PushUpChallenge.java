/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;

import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.NumberFormatter;
/**
 *
 * @author Maxwell
 */
public class PushUpChallenge extends javax.swing.JFrame {
/*
    static void postData(Label usrdisplay) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
    /**
     * Creates new form PushUpChallenge
     */

       public String[] getanswer = new String[0];
         int passed;
         
             
    public PushUpChallenge()  {
        
        initComponents();
        myMain ti = new myMain();
        Challenge challenge = new Challenge();
        setTitle("Challenge: Push Up");

        setResizable(false);
        setSize(726, 400);
       
        Timer timer = new Timer();
        show1.setVisible(false);
        repinput.setVisible(false);
           DefaultTableModel modTable;
       
  

        
        

        
      /* timer
        TimerTask task = new TimerTask()
        {     
            public void run()         
        {     
                   passed++;
                   time.setText(String.valueOf(passed));            
                }    
        };    
     timer.scheduleAtFixedRate(task, 0, 1000);//1000ms = 1 s
    
   
           boolean l = true;
         if (stp.isEnabled()) {
         timer.cancel();
         timer.purge();
         return;
         
         
         }
    */
      
        
    }
  
    
      

    
        public String postData(String name, String participants, DefaultTableModel DefaultTableModel){
        area.setText(name);
        DefaultTableModel modTable = null;
        DefaultTableModel = modTable;
        modTable = new DefaultTableModel();
        table.setModel(modTable);
        DefaultTableModel modTable1 = null;
        DefaultTableModel = modTable1;
        modTable.addColumn("Place");
        modTable.addColumn("Reps");
        modTable.addColumn("test");
        modTable.addColumn("testw");

        
        
    
        
        int length = Integer.valueOf(participants); 
        JOptionPane.showMessageDialog(null, "Number of Participants Recorded");
        String[] names = new String[length];
        String[] reps = new String[length];
        String connect = name + reps;
        
        
        for(int counter = 0; counter < length; counter++){
            
            String pNames = JOptionPane.showInputDialog(null, "Enter Participants :" + (counter + 1), JOptionPane.OK_CANCEL_OPTION);
            names[counter] = pNames;
              
            String username = repinput.getText().trim();
                reps[counter] = username;
               
            }
           
            
                for(int counter = 0; counter < length; counter++){
            
            JOptionPane.showMessageDialog(null, names[counter]);
            names[counter] = names[counter];
            reps[counter] = reps[counter];
            //modTable.addRow(connect);
            JLabel labels[] = new JLabel[length];
          
            for (JLabel label : labels)
            {
                label = new JLabel();
            
                for(int i = 0; i < length; i++){
                    labels[i] = new JLabel(names[counter]);
                    String[] a =  new String[4];
                            a1.setText(names[i]);
                            a2.setText(names[i]);
                            a3.setText(names[counter]);
                            a4.setText(names[counter]);
                    
                    //return labels;
                    
                }
                
            }
            
          // modTable.addRow(names);
           //Players.setText(Integer.toString(counter));
         // modTable.addRow(reps);
      
            }
                
                                
            for(int counter = 0; counter < length; counter++){
               
                String username = repinput.getText().trim();
                reps[counter] = (username);
              
                
                
            }
                
            for(int counter = 0; counter < length; counter++){
                String st[] = new String[length];
                
                
            }
          return name;      
        }       
        
    
    PushUpChallenge(String user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   




    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        time = new java.awt.Label();
        warn = new javax.swing.JLabel();
        show1 = new javax.swing.JLabel();
        repinput = new java.awt.TextField();
        block = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        w = new java.awt.Label();
        strt = new java.awt.Button();
        stp = new java.awt.Button();
        save = new java.awt.Button();
        area = new java.awt.Label();
        jLabel2 = new javax.swing.JLabel();
        btn = new java.awt.Button();
        a1 = new java.awt.Label();
        a2 = new java.awt.Label();
        a3 = new java.awt.Label();
        a4 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        table.setBackground(new java.awt.Color(51, 51, 51));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(670, 120, 40, 190);

        time.setAlignment(java.awt.Label.CENTER);
        time.setBackground(new java.awt.Color(51, 51, 51));
        time.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        time.setFont(new java.awt.Font("Lucida Console", 0, 50)); // NOI18N
        time.setForeground(new java.awt.Color(240, 240, 240));
        time.setText("0");
        getContentPane().add(time);
        time.setBounds(490, 10, 220, 110);

        warn.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        warn.setForeground(new java.awt.Color(240, 240, 240));
        getContentPane().add(warn);
        warn.setBounds(200, 150, 140, 20);

        show1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        show1.setForeground(new java.awt.Color(240, 240, 240));
        show1.setText("Enter Repetitions Made :");
        getContentPane().add(show1);
        show1.setBounds(20, 150, 140, 20);

        repinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repinputActionPerformed(evt);
            }
        });
        repinput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                repinputKeyTyped(evt);
            }
        });
        getContentPane().add(repinput);
        repinput.setBounds(160, 150, 30, 20);

        block.setAlignment(java.awt.Label.CENTER);
        block.setBackground(new java.awt.Color(51, 51, 51));
        block.setFont(new java.awt.Font("Lucida Console", 0, 48)); // NOI18N
        block.setForeground(new java.awt.Color(240, 240, 240));
        block.setText("0");
        getContentPane().add(block);
        block.setBounds(490, 10, 220, 110);

        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("USER");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 60, 70, 14);

        label1.setBackground(new java.awt.Color(48, 48, 48));
        label1.setForeground(new java.awt.Color(240, 240, 240));
        label1.setText("Time Set :");
        getContentPane().add(label1);
        label1.setBounds(20, 110, 60, 20);

        w.setAlignment(java.awt.Label.CENTER);
        w.setBackground(new java.awt.Color(48, 48, 48));
        w.setForeground(new java.awt.Color(240, 240, 240));
        getContentPane().add(w);
        w.setBounds(80, 110, 50, 20);

        strt.setBackground(new java.awt.Color(51, 51, 51));
        strt.setForeground(new java.awt.Color(240, 240, 240));
        strt.setLabel("Start Timer");
        strt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                strtActionPerformed(evt);
            }
        });
        getContentPane().add(strt);
        strt.setBounds(100, 330, 80, 24);

        stp.setBackground(new java.awt.Color(51, 51, 51));
        stp.setForeground(new java.awt.Color(240, 240, 240));
        stp.setLabel("Stop Timer");
        stp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stpActionPerformed(evt);
            }
        });
        getContentPane().add(stp);
        stp.setBounds(100, 330, 80, 24);

        save.setBackground(new java.awt.Color(51, 51, 51));
        save.setForeground(new java.awt.Color(240, 240, 240));
        save.setLabel("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save);
        save.setBounds(100, 330, 80, 24);

        area.setAlignment(java.awt.Label.CENTER);
        area.setBackground(new java.awt.Color(48, 48, 48));
        area.setForeground(new java.awt.Color(240, 240, 240));
        getContentPane().add(area);
        area.setBounds(20, 80, 110, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Push Up Challenge");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 10, 290, 40);

        btn.setBackground(new java.awt.Color(51, 51, 51));
        btn.setForeground(new java.awt.Color(240, 240, 240));
        btn.setLabel("Back");
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btn);
        btn.setBounds(620, 330, 43, 24);

        a1.setText("label2");
        getContentPane().add(a1);
        a1.setBounds(350, 120, 38, 20);

        a2.setText("label3");
        getContentPane().add(a2);
        a2.setBounds(350, 150, 38, 20);

        a3.setText("label4");
        getContentPane().add(a3);
        a3.setBounds(350, 180, 38, 20);

        a4.setText("label5");
        getContentPane().add(a4);
        a4.setBounds(350, 210, 38, 20);

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/Challengepu.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-30, -20, 870, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        // TODO add your handling code here:
             myMain begin = new myMain();
  Challenge challenge = new Challenge();
              
        String getRep = repinput.getText();
        challenge.postRep1((getRep));
        String getTime = w.getText();
        challenge.postTime1((getTime)) ;
        
          String uname =  area.getText();
                 String test = "";
               
          if (getRep.equals(test) && getTime.equals(test))
               JOptionPane.showMessageDialog(null, "Null values was recorded");

          challenge.postData1(uname);
          
          challenge.setVisible(true);
          this.setVisible(false);
  
         
                  
                  
                  
                //String getRep = repinput.getText();
                //challenge.postRep(getRep);
                
    }//GEN-LAST:event_btnActionPerformed

    private void strtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_strtActionPerformed
        // TODO add your handling code here:
     
                strt.setVisible(false);
                stp.setVisible(true);
                save.setVisible(false);
                btn.setVisible(false);
                    Timer timer = new Timer();
    
      
        TimerTask task = new TimerTask()
        {
            @Override 
            public void run()
          
            {      
                    passed++;
                    time.setText(String.valueOf(passed));
            }  
        
            
  
            };   
     timer.scheduleAtFixedRate(task, 0, 1000);//1000ms = 1 s
     

                    
    }//GEN-LAST:event_strtActionPerformed

    private void stpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stpActionPerformed
        // TODO add your handling code here:
    
        w.setText(String.valueOf(passed));
        String rec = String.valueOf(w.getText());
      
        time.setText(String.valueOf(rec));
        
              
                save.setVisible(true);
                stp.setVisible(false);
                strt.setVisible(false);
                
               
                time.setVisible(false);
                block.setVisible(true);
                save.setVisible(true);
        
                repinput.setVisible(true);
                show1.setVisible(true);
        
    }//GEN-LAST:event_stpActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
                String username = repinput.getText().trim();
                 int get = Integer.valueOf(username);
               
        Challenge challenge = new Challenge();
//        int getRep = Integer.valueOf(repinput.getText());
//        challenge.postRep(getRep);
        int getTime = Integer.valueOf(w.getText());
        String uname = area.getText();
        
        
        
        
                
                  Ranking ranking = new Ranking();
                
        PushUpChallenge puc = new PushUpChallenge();
                     myMain begin = new myMain();
        Log log = new Log();
              
 
        String rep = repinput.getText();
        String time = w.getText();
        String name = area.getText();
        ranking.postTime1(rep, time, name);
    
        
        
         
                                        
        String replog = repinput.getText();
        String timelog = w.getText();
        JLabel[] labels = null;
        
        
        
        challenge.postData(uname);
        challenge.postTime(getTime);          
      
                
        puc.time.setVisible(false);
               
                save.setVisible(false);
                stp.setVisible(false);
                strt.setVisible(false);
         
        
        
        try {
            log.postData3(name, replog, timelog, labels);
            
        } catch (IOException ex) {
         //   Logger.getLogger(Challenge.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        

                
                
        
       


        
        
        //int maxtime = w.getText();
        
        
        
      
        
    }//GEN-LAST:event_saveActionPerformed

    private void repinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repinputActionPerformed
// TODO add your handling code here:
        



    
        int k;
        boolean x = true;
    
        String p = String.valueOf(repinput.getText());
        
        
        
        
        
        
    
        
    }//GEN-LAST:event_repinputActionPerformed

    private void repinputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_repinputKeyTyped
        // TODO add your handling code here:
        
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE))){
            evt.consume();
            warn.setText("This Box only accepts Numbers");
        }
        else
            warn.setVisible(false);
    }//GEN-LAST:event_repinputKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PushUpChallenge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PushUpChallenge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PushUpChallenge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PushUpChallenge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        
        
        
 

        
        
        
        
        
        
        
        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PushUpChallenge().setVisible(true);
                 
           
              ;
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label a1;
    private java.awt.Label a2;
    private java.awt.Label a3;
    private java.awt.Label a4;
    java.awt.Label area;
    private java.awt.Label block;
    private java.awt.Button btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    java.awt.TextField repinput;
    private java.awt.Button save;
    private javax.swing.JLabel show1;
    private java.awt.Button stp;
    private java.awt.Button strt;
    private javax.swing.JTable table;
    public java.awt.Label time;
    java.awt.Label w;
    private javax.swing.JLabel warn;
    // End of variables declaration//GEN-END:variables

    void setUser(String user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void getAnswer(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
