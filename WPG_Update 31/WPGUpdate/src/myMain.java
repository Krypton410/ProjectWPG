
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.AbstractButton;
import javax.swing.JTextField;
import java.util.ArrayList;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 *
 * @author Maxwell
 */


public class myMain extends javax.swing.JFrame {



 


    private boolean radioText;


    private void groupButton() {
        ButtonGroup bg = new ButtonGroup();
        bg.add(radio1);
        bg.add(radio2);
        bg.add(cradio1);
        radio1.setSelected(true);
        
    }
     
  
    public myMain() {
        
        
        
        
        setTitle("Workout Program Generator");
        initComponents();
 
        setResizable(false);
        setSize(726, 376);
        groupButton();
       // warn.setVisible(false);        
        String radioText = "";
        
        if (radio1.isSelected())
        {
            radioText = radio1.getText();
        }
        if (radio2.isSelected())
        {
            radioText = radio2.getText();
        }
        if (cradio1.isSelected())
        {
            radioText = cradio1.getText();
        }
        
        //Option 1
    }



    

 


        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        warn = new javax.swing.JLabel();
        maintextbox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        mainok = new javax.swing.JButton();
        radio1 = new javax.swing.JRadioButton();
        radio2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        mainexit = new javax.swing.JButton();
        cradio1 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/bckgrnd.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Workout Program Generator"); // NOI18N
        getContentPane().setLayout(null);

        warn.setFont(new java.awt.Font("MS UI Gothic", 0, 12)); // NOI18N
        warn.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(warn);
        warn.setBounds(260, 80, 190, 0);

        maintextbox.setBackground(new java.awt.Color(51, 51, 51));
        maintextbox.setForeground(new java.awt.Color(240, 240, 240));
        maintextbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maintextboxActionPerformed(evt);
            }
        });
        maintextbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                maintextboxKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                maintextboxKeyTyped(evt);
            }
        });
        getContentPane().add(maintextbox);
        maintextbox.setBounds(240, 50, 220, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter Username:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 60, 94, 14);

        mainok.setBackground(new java.awt.Color(0, 0, 0));
        mainok.setForeground(new java.awt.Color(240, 240, 240));
        mainok.setText("OK");
        mainok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainokActionPerformed(evt);
            }
        });
        mainok.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mainokKeyPressed(evt);
            }
        });
        getContentPane().add(mainok);
        mainok.setBounds(140, 310, 47, 23);

        radio1.setBackground(new java.awt.Color(0, 0, 0));
        radio1.setForeground(new java.awt.Color(240, 240, 240));
        radio1.setText("Build Muscle Mass & Strength");
        radio1.setName(""); // NOI18N
        radio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio1ActionPerformed(evt);
            }
        });
        radio1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                radio1KeyPressed(evt);
            }
        });
        getContentPane().add(radio1);
        radio1.setBounds(140, 120, 290, 23);

        radio2.setBackground(new java.awt.Color(0, 0, 0));
        radio2.setForeground(new java.awt.Color(240, 240, 240));
        radio2.setText("Increase Endurance & Burn Calories Quick");
        radio2.setName(""); // NOI18N
        radio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio2ActionPerformed(evt);
            }
        });
        radio2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                radio2KeyPressed(evt);
            }
        });
        getContentPane().add(radio2);
        radio2.setBounds(140, 150, 290, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Mark Goal Below:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 90, 96, 14);

        mainexit.setBackground(new java.awt.Color(0, 0, 0));
        mainexit.setForeground(new java.awt.Color(240, 240, 240));
        mainexit.setText("Exit");
        mainexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainexitActionPerformed(evt);
            }
        });
        getContentPane().add(mainexit);
        mainexit.setBounds(540, 310, 51, 23);

        cradio1.setBackground(new java.awt.Color(0, 0, 0));
        cradio1.setForeground(new java.awt.Color(240, 240, 240));
        cradio1.setText("Challenge Mode");
        cradio1.setName(""); // NOI18N
        cradio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cradio1ActionPerformed(evt);
            }
        });
        cradio1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cradio1KeyPressed(evt);
            }
        });
        getContentPane().add(cradio1);
        cradio1.setBounds(140, 180, 290, 23);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 840, 610);

        jButton1.setText("jButton1");
        getContentPane().add(jButton1);
        jButton1.setBounds(460, 130, 73, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void mainexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainexitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    
        
    }//GEN-LAST:event_mainexitActionPerformed

    private void mainokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainokActionPerformed
        //
       
        //PushUpChallenge.area.setText(myMain.maintextbox.getText());
       
      
       Challenge challenge = new Challenge();
       Log log = new Log();
        Choice2 choice = new Choice2();
        myMain main = new myMain(); 
        Pass pass = new Pass();
        Output output = new Output();
        Ranking ranking = new Ranking();
        String uname = maintextbox.getText();
      
      
        String r = "";
        String k = String.valueOf(radioText);
        
         if(uname.equals(r))
        {
           JOptionPane.showMessageDialog(null, "Username is required");
           radioText = true;
        }
     //start
        {
        
         if(radio1.isSelected())
        {
            if(uname.equals(r))
        {
             if(!(r.equals(r))){
             JOptionPane.showMessageDialog(null, "Username is required");
              output.setVisible(false);}
                    
        }
          
             else
             {  
            output.setVisible(true);
            this.setVisible(false);
            choice.setVisible(false);
             }
             }
         if (radio2.isSelected())
              {
              if(uname.equals(r))
              {         
                    if(!(r.equals(r))){
                   JOptionPane.showMessageDialog(null, "Username is required");
                   choice.setVisible(false);}
              }
            else
              {
            choice.setVisible(true);
            this.setVisible(false);
            output.setVisible(false);
              }
              }
         if (cradio1.isSelected())
              {
              if(uname.equals(r))
              {         
                    if(!(r.equals(r))){
                   JOptionPane.showMessageDialog(null, "Username is required");
                   challenge.setVisible(false);}
              }
            else
              {
            this.setVisible(false);
            challenge.postData(uname);
            challenge.setVisible(true);
           
            output.setVisible(false);
            
            /*
         String rep = challenge.PushRec.getText();
        String time = challenge.PushTime.getText();
      
                  try {
                      log.postData(uname, rep, time);
                  } catch (IOException ex) {
                      Logger.getLogger(myMain.class.getName()).log(Level.SEVERE, null, ex);
                  }
           */
           //pass.setData(uname);
             } 
              

       }
         
        
        
        }
        
 
          
    }//GEN-LAST:event_mainokActionPerformed

    private void radio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_radio1ActionPerformed

    private void radio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio2ActionPerformed

    private void cradio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cradio1ActionPerformed
        // TODO add your handling code here:

        
        
    }//GEN-LAST:event_cradio1ActionPerformed

    private void maintextboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maintextboxActionPerformed
        
        // TODO add your handling code here:
        myMain q = new myMain();
        String usr = maintextbox.getText();
    }//GEN-LAST:event_maintextboxActionPerformed

    private void maintextboxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_maintextboxKeyPressed
     if(evt.getKeyCode()==KeyEvent.VK_ENTER)
     { 
         Output output = new Output();
     
        String uname = maintextbox.getText();
        String r = "";
        {
        if(uname.equals(r))
        {
           JOptionPane.showMessageDialog(null, "Username is required");
        }
        else
        {
            output.setVisible(true);
        }
        }
     }
// TODO add your handling code here:
    }//GEN-LAST:event_maintextboxKeyPressed

    private void mainokKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mainokKeyPressed
       
        // TODO add your handling code here:
    }//GEN-LAST:event_mainokKeyPressed

    private void radio1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_radio1KeyPressed
        // TODO add your handling code here:
     if(evt.getKeyCode()==KeyEvent.VK_ENTER)
     { 
         Output output = new Output();
     
        String uname = maintextbox.getText();
        String r = "";
        {
        if(uname.equals(r))
        {
           JOptionPane.showMessageDialog(null, "Username is required");
        }
        else
        {
            output.setVisible(true);
        }
        }
     }
    }//GEN-LAST:event_radio1KeyPressed

    private void radio2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_radio2KeyPressed
        // TODO add your handling code here:
     if(evt.getKeyCode()==KeyEvent.VK_ENTER)
     { 
         Output output = new Output();
     
        String uname = maintextbox.getText();
        String r = "";
        {
        if(uname.equals(r))
        {
           JOptionPane.showMessageDialog(null, "Username is required");
        }
        else
        {
            output.setVisible(true);
        }
        }
     }
    }//GEN-LAST:event_radio2KeyPressed

    private void cradio1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cradio1KeyPressed
        // TODO add your handling code here:
  if(evt.getKeyCode()==KeyEvent.VK_ENTER)
     { 
         Output output = new Output();
     
        String uname = maintextbox.getText();
        String r = "";
        {
        if(uname.equals(r))
        {
           JOptionPane.showMessageDialog(null, "Username is required");
        }
        else
        {
            output.setVisible(true);
        }
        }
     }
    }//GEN-LAST:event_cradio1KeyPressed

    private void maintextboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_maintextboxKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!(Character.isAlphabetic(c) || (c==java.awt.event.KeyEvent.VK_BACK_SPACE) || (c==java.awt.event.KeyEvent.VK_DELETE))){
        
        warn.setText("Special Characters are not allowed");
        evt.consume();
        
        }
        else
         warn.setVisible(false);
    }//GEN-LAST:event_maintextboxKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(myMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(myMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(myMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(myMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                
                try
              {
                        Thread.sleep(2800);
              }
            catch (Exception e)
            {
                
            }
                
                
                
                
                new myMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton cradio1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton mainexit;
    private javax.swing.JButton mainok;
    public javax.swing.JTextField maintextbox;
    private javax.swing.JRadioButton radio1;
    private javax.swing.JRadioButton radio2;
    private javax.swing.JLabel warn;
    // End of variables declaration//GEN-END:variables


}
