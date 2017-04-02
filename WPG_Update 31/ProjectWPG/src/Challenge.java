
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Maxwell
 */
public class Challenge extends javax.swing.JFrame {

    /**
     * Creates new form Challenge
     */
    public Challenge() {
        initComponents();
        setTitle("Challenges Sector");
        setResizable(false);
        setSize(726, 400);
        String name = usrdisplay.getText();
        myMain doi = new myMain();

    }

    //calling uname from myMain to this
    public void postData(String uname) {
        usrdisplay.setText(uname.toUpperCase());
    }

    public void postRep(int getRep) {
        PushRec.setText(String.valueOf(getRep));
    }

    public void postTime(int getTime) {
        PushTime.setText(String.valueOf(getTime));
    }

    //Back
    public void postData1(String uname) {
        usrdisplay.setText(uname.toUpperCase());
    }

    public void postRep1(String getRep) {
        PushRec.setText((getRep));
    }

    public void postTime1(String getTime) {
        PushTime.setText(getTime);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        PullRec = new javax.swing.JLabel();
        PlankTime = new javax.swing.JLabel();
        PHold = new javax.swing.JLabel();
        PushTime = new javax.swing.JLabel();
        PushRec = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PullTime1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        j4 = new javax.swing.JLabel();
        usrdisplay = new java.awt.Label();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Push Ups:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 140, 70, 14);

        PullRec.setForeground(new java.awt.Color(240, 240, 240));
        PullRec.setText("|");
        getContentPane().add(PullRec);
        PullRec.setBounds(80, 160, 60, 14);

        PlankTime.setForeground(new java.awt.Color(240, 240, 240));
        PlankTime.setText("|");
        getContentPane().add(PlankTime);
        PlankTime.setBounds(140, 180, 40, 14);

        PHold.setForeground(new java.awt.Color(240, 240, 240));
        PHold.setText("|");
        getContentPane().add(PHold);
        PHold.setBounds(80, 180, 60, 14);

        PushTime.setForeground(new java.awt.Color(240, 240, 240));
        PushTime.setText("|");
        getContentPane().add(PushTime);
        PushTime.setBounds(140, 140, 40, 14);

        PushRec.setForeground(new java.awt.Color(240, 240, 240));
        PushRec.setText("|");
        getContentPane().add(PushRec);
        PushRec.setBounds(80, 140, 60, 14);

        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Pull Ups :");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 160, 70, 14);

        PullTime1.setForeground(new java.awt.Color(240, 240, 240));
        PullTime1.setText("|");
        getContentPane().add(PullTime1);
        PullTime1.setBounds(140, 160, 40, 14);

        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Record");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 120, 60, 14);

        j4.setFont(new java.awt.Font("Lucida Console", 0, 13)); // NOI18N
        j4.setForeground(new java.awt.Color(240, 240, 240));
        j4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j4.setText("USER ");
        getContentPane().add(j4);
        j4.setBounds(40, 20, 50, 14);

        usrdisplay.setAlignment(java.awt.Label.CENTER);
        usrdisplay.setBackground(new java.awt.Color(0, 0, 0));
        usrdisplay.setFont(new java.awt.Font("Lithos Pro Regular", 0, 12)); // NOI18N
        usrdisplay.setForeground(new java.awt.Color(240, 240, 240));
        getContentPane().add(usrdisplay);
        usrdisplay.setBounds(30, 80, 60, 20);

        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/myicon.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(310, 50, 480, 410);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Choose Challenges below:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(190, 40, 220, 40);

        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Planks :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 180, 60, 14);

        jButton4.setFont(new java.awt.Font("Dotum", 0, 12)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(40, 303, 70, 30);

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButton1.setText("Push ups Challenge");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(190, 110, 160, 23);

        jButton2.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jButton2.setText("Planks");
        getContentPane().add(jButton2);
        jButton2.setBounds(190, 190, 160, 23);

        jButton3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButton3.setText("Pull Ups Challenge");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(190, 150, 160, 23);

        jButton5.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jButton5.setText("Rankings");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(190, 300, 160, 30);

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/D.gif"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(61, 0, 0)));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 100, 100);

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/rsz_redblack.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 730, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new myMain().setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new PushUpChallenge().setVisible(false);
        Challenge challenge = new Challenge();
        //   String uname = challenge.postData(String.valueOf());
        PushUpChallenge begin = new PushUpChallenge();
        Log log = new Log();
       
      
        
        String name = usrdisplay.getText();
        DefaultTableModel DefaultTableModel = null;
        //begin.postData(name, participants, DefaultTableModel);
        
        begin.setVisible(true);
        this.setVisible(false);

        //  begin.postData(usrdisplay);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        Ranking ranking = new Ranking();
        Challenge challenge = new Challenge();
        PushUpChallenge puc = new PushUpChallenge();
        myMain begin = new myMain();

        String getRepC = puc.repinput.getText();
        challenge.postRep1((getRepC));
        String getTimeC = challenge.PushTime.getText();
        challenge.postTime1((getTimeC));
        String uname = puc.area.getText();
        String rep = PushRec.getText();
        String time = PushTime.getText();
        String name = usrdisplay.getText();
        ranking.postTime1(getRepC, getTimeC, uname);

        challenge.postData1(uname);

        /*
            String st[]=new String[4];
            st[0] = "1";
            st[1] = begin.maintextbox.getText().trim();
            st[2] = puc.repinput.getText().trim();
            st[3] = puc.w.getText().trim();
            
         */
        ranking.setVisible(true);
        this.setVisible(false);

        //ranking.postData(name);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        PullUpsChallenge pull = new PullUpsChallenge();
        pull.setVisible(false);
       
                
        String name = usrdisplay.getText();
        DefaultTableModel DefaultTableModel = null;
        //pull.postData(name, participants, DefaultTableModel);
        
         pull.setVisible(true);;
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Challenge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Challenge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Challenge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Challenge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Challenge().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PHold;
    private javax.swing.JLabel PlankTime;
    private javax.swing.JLabel PullRec;
    private javax.swing.JLabel PullTime1;
    javax.swing.JLabel PushRec;
    javax.swing.JLabel PushTime;
    public javax.swing.JLabel j4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public java.awt.Label usrdisplay;
    // End of variables declaration//GEN-END:variables

    void setUser(String user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
