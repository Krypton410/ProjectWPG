
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.binding.Bindings;
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
public class PullUpsChallenge extends javax.swing.JFrame {

    /**
     * Creates new form PullUpsChallenge
     */
    int passed;
    // String participants = JOptionPane.showInputDialog(null, "Enter Number Of Participants:", JOptionPane.OK_CANCEL_OPTION);


    public PullUpsChallenge() {
        initComponents();
        myMain ti = new myMain();
        Challenge challenge = new Challenge();
        setTitle("Challenge: Pull Ups");

        setResizable(false);
        setSize(726, 400);

        Timer timer = new Timer();
        jLabel5.setVisible(false);
        jScrollPane2.setVisible(false);
        block.setVisible(false);
        jButton1.setVisible(false);
        time.setVisible(false);
        jButton2.setVisible(false);
        table.setVisible(true);
        info.setVisible(true);
        fin.setVisible(false);
        jButton5.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        info1.setVisible(false);
    }
//not called yet

    public static void init() {

        PullUpsChallenge pull = new PullUpsChallenge();
        
       String participants = JOptionPane.showInputDialog(null, "Enter Number Of Participants:", JOptionPane.OK_CANCEL_OPTION);
       int v = Integer.valueOf(participants);
    }

    
    
    
    
    
    
    
    
    
    
     public static void getAsk() {

        PullUpsChallenge pull = new PullUpsChallenge();
        Sort sort =new Sort();
    String participants = JOptionPane.showInputDialog(null, "Enter Number Of Participants:", JOptionPane.OK_CANCEL_OPTION);

        DefaultTableModel modTable = new DefaultTableModel();
        pull.table.setVisible(true);
        pull.table.setModel(modTable);
        pull.table.setEnabled(false);

        modTable.addColumn("User");
        modTable.addColumn("Reps");

        //participants = pull.init(participants);
        //pull.init.getText(participants);
        int length = Integer.valueOf(participants);
        int n = length;
       
         String[] names = new String[length];
         int[] reps = new int[length];
        for (int counter = 0; counter < length; counter++) {

            String pNames = JOptionPane.showInputDialog(null, "Enter Participants :" + (counter + 1), JOptionPane.OK_CANCEL_OPTION);
          
           names[counter] =  pNames;
            
 
        }

                for (int counter = 0; counter < length; counter++) {
            String pNames = null;

           
          String pReps = JOptionPane.showInputDialog(null, "Reps Made for :" + pNames + "[" +(counter + 1) + "]", JOptionPane.OK_CANCEL_OPTION);
        
            reps[counter]= (Integer.valueOf(pReps));
 
        }
        
        
        for (String str : names) {
            modTable.addRow(new Object[]{str});
            System.out.println(str);

        }
        for(int r: reps){
            modTable.addRow(new Object[]{r});
            System.out.println(r);
            
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void ask(String pNames, String pReps, DefaultTableModel modTable, String[] names,  String participants, int n) {

        PullUpsChallenge pull = new PullUpsChallenge();
        Sort sort =new Sort();
    participants = JOptionPane.showInputDialog(null, "Enter Number Of Participants:", JOptionPane.OK_CANCEL_OPTION);

        modTable = new DefaultTableModel();
        pull.table.setVisible(true);
        pull.table.setModel(modTable);
        pull.table.setEnabled(false);

        modTable.addColumn("User");
        modTable.addColumn("Reps");

        //participants = pull.init(participants);
        //pull.init.getText(participants);
        int length = Integer.valueOf(participants);
        n = length;
        sort.ask( pNames,pReps, modTable, names,participants,n);
         names = new String[length];
         int[] reps = new int[length];
        for (int counter = 0; counter < length; counter++) {

            pNames = JOptionPane.showInputDialog(null, "Enter Participants :" + (counter + 1), JOptionPane.OK_CANCEL_OPTION);
          
           names[counter] =  pNames;
            
 
        }

                for (int counter = 0; counter < length; counter++) {

           
            pReps = JOptionPane.showInputDialog(null, "Reps Made for :" + pNames + "[" +(counter + 1) + "]", JOptionPane.OK_CANCEL_OPTION);
        
            reps[counter]= (Integer.valueOf(pReps));
 
        }
        
        
        for (String str : names) {
            modTable.addRow(new Object[]{str});
            System.out.println(str);

        }
        for(int r: reps){
            modTable.addRow(new Object[]{r});
            System.out.println(r);
            
        }
    }
        /*
    public static void getReps(String ureps, String pNames, String[] dual) {
        PullUpsChallenge pull = new PullUpsChallenge();
      String  participants = JOptionPane.showInputDialog(null, "Please Confirm Number Of Participants:", JOptionPane.OK_CANCEL_OPTION);
  

        int length = Integer.valueOf(participants);
        dual = new String[length];
        for (int counter = 0; counter < length; counter++) {
            DefaultTableModel modTable = null;
            
            pull.ask(pNames, modTable, dual, participants );
            ureps = JOptionPane.showInputDialog(null, "Reps Made for :" + pNames + (counter + 1), JOptionPane.OK_CANCEL_OPTION);

            //dual[counter][counter] = pNames;
            // dual[counter][counter] = pReps;
            //  reps[counter] = pReps;
            
            dual[counter] = ureps;
        }
        for (String r : dual){
            System.out.println(r);
        }
        

    }

    //NOTIFYIN
    public static void notify(String alert) {
        JOptionPane.showMessageDialog(null, "Number of Participants Recorded");

    }

    //MYDRAFT
    public static void postData(String name, String participants, String pNames, DefaultTableModel modTable) {

        int length = Integer.valueOf(participants);

        for (int counter = 0; counter < length; counter++) {

            String pReps = JOptionPane.showInputDialog(null, "Reps Made for :" + pNames + (counter + 1), JOptionPane.OK_CANCEL_OPTION);

            //dual[counter][counter] = pNames;
            // dual[counter][counter] = pReps;
            //  reps[counter] = pReps;
        }

        {

            //TRANSFER
            //  }
            /*
            modTable.addColumn("User");
            modTable.addColumn("time");

            for (String r : reps) {

                modTable.addRow(new Object[]{r, r});

            }
             */
            //for(int counter = 0; counter < length; counter++){
            //Players.setText(Integer.toString(counter));
    
        //}

    //}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        info1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        info = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fin = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        time = new java.awt.Label();
        block = new java.awt.Label();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("<html> <p>Pull-ups is the second-most important calisthenics exercise after push-ups.</p>  <p>Pulling your entire body weight against gravity really does take a long of strength and multiple muscle groups.</p><p> And just like push-ups, you can change up your pull-up variation very easily with different grips, arm width, and movements.</p>   </html>");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 20, 430, 280);

        jButton5.setBackground(new java.awt.Color(51, 51, 51));
        jButton5.setFont(new java.awt.Font("Source Code Pro", 0, 10)); // NOI18N
        jButton5.setForeground(new java.awt.Color(240, 240, 240));
        jButton5.setText("<html> <p>Start</p> <p>Competition</p> </html> ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(60, 259, 100, 30);

        info1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        info1.setForeground(new java.awt.Color(240, 240, 240));
        info1.setText("Click Finish to proceed.");
        getContentPane().add(info1);
        info1.setBounds(60, 305, 250, 20);

        jButton4.setBackground(new java.awt.Color(0, 102, 102));
        jButton4.setForeground(new java.awt.Color(240, 240, 240));
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(610, 340, 55, 20);

        info.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        info.setForeground(new java.awt.Color(240, 240, 240));
        info.setText("Players will do a test of maximum Pull Ups");
        getContentPane().add(info);
        info.setBounds(220, 230, 250, 15);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/puuullups (2).gif"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(460, 90, 210, 230);

        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Activated Muscles");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(520, 320, 140, 14);

        fin.setBackground(new java.awt.Color(51, 51, 51));
        fin.setForeground(new java.awt.Color(240, 240, 240));
        fin.setText("FINISH");
        fin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finActionPerformed(evt);
            }
        });
        getContentPane().add(fin);
        fin.setBounds(180, 330, 100, 23);

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("GulimChe", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(240, 240, 240));
        jButton3.setText("START");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(290, 170, 110, 50);

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setForeground(new java.awt.Color(240, 240, 240));
        jButton2.setText("Reset Time");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(290, 330, 100, 23);

        time.setAlignment(java.awt.Label.CENTER);
        time.setBackground(new java.awt.Color(0, 0, 0));
        time.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        time.setFont(new java.awt.Font("Lucida Console", 0, 50)); // NOI18N
        time.setForeground(new java.awt.Color(240, 240, 240));
        time.setText("0");
        getContentPane().add(time);
        time.setBounds(460, 20, 210, 70);

        block.setAlignment(java.awt.Label.CENTER);
        block.setBackground(new java.awt.Color(0, 0, 0));
        block.setFont(new java.awt.Font("Lucida Console", 0, 48)); // NOI18N
        block.setForeground(new java.awt.Color(240, 240, 240));
        block.setText("0");
        getContentPane().add(block);
        block.setBounds(460, 20, 210, 70);

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(240, 240, 240));
        jButton1.setText("Start Timer");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(60, 330, 100, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Pull Ups Challenge");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 10, 350, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dark bckgrnd.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-6, 0, 730, 400);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(table);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(630, 300, 30, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        Timer timer = new Timer();

        TimerTask task = new TimerTask() {

            @Override
            public void run() {

                passed++;

                time.setText(String.valueOf(passed));

            }

        };

        //1000ms = 1 s
        jButton1.setText("Stop Timer");

        if (jButton1.getText().equals("Started")) {

        }
        if (jButton1.getText().equals("Stop Timer")) {
            jButton1.setText("Done");

            //task.cancel();
            jButton1.setVisible(false);

            // task.cancel();
            time.setText("0");
            //   timer.purge();
            block.setVisible(false);
            time.setVisible(true);
            jButton1.setText("Started");
            //timer.scheduleAtFixedRate(task, 0, 1000);
        }

        /*
                  if(jButton1.getText().equals("Start Timer")){
                  
                timer.scheduleAtFixedRate(task, 0, 1000);

                }
         */
        passed = 0;
        time.setText("0");
        {
            timer.scheduleAtFixedRate(task, 0, 1000);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        passed = 0;

        jButton1.setText("Start Timer");
        jButton1.setVisible(true);
        block.setVisible(true);
        time.setVisible(false);
        time.setText("0");


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Here try0]
        
        PullUpsChallenge pull = new PullUpsChallenge();
        String pNames = null;
        String participants = null;
     //  init();
  
       
        jButton3.setVisible(false);
        jLabel3.setVisible(false);
        jLabel5.setVisible(true);
        block.setVisible(true);
        jButton1.setVisible(true);
        time.setVisible(true);
        jButton2.setVisible(true);
       
       
        info.setVisible(false);
        fin.setVisible(false);
        jButton5.setVisible(true);
        jButton4.setVisible(true);

        /*
        DefaultTableModel modTable1 = null;
        DefaultTableModel modTable = null;
        DefaultTableModel DefaultTableModel = modTable1;
        DefaultTableModel = modTable;
        DefaultTableModel = modTable1;
        modTable = new DefaultTableModel();
        table.setModel(modTable);
        table.setEnabled(false);
        modTable.addColumn("User");
        
        int length = Integer.valueOf(participants);
        String[] names = new String[length];
  for (int counter = 0; counter < length; counter++) {
        String pNames = JOptionPane.showInputDialog(null, "Enter Participants :" + (counter + 1), JOptionPane.OK_CANCEL_OPTION);
       names[counter] = pNames;
        
        
  }
              for (String str : names) {
                modTable.addRow(new Object[]{str});

            }
        
         */
    }//GEN-LAST:event_jButton3ActionPerformed

    private void finActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finActionPerformed
        try {
            RANK rank = new RANK();
            Challenge challenge = new Challenge();
            rank.setVisible(true);
            this.setVisible(false);
            /*
            PullUpsChallenge pull = new PullUpsChallenge();
            String ureps = null;
            String pNames = null;
            String[] dual = null;
            
            int n = 0;
            
            //modTable = modTable.addRow("adasdasd");
            DefaultTableModel modTable = null;
            //int length = Integer.valueOf(null);
            String pReps = null;
            String participants = null;
            
            pull.ask(pNames, pReps, modTable, dual,  participants, n);
            */
            //init();
            //  pull.ask(ureps , pNames, dual);
            
            
            // TODO add your handling code here:
            /*
            DefaultTableModel modTable1 = null;
            DefaultTableModel modTableR = null;
            DefaultTableModel modRank = null;
            DefaultTableModel DefaultTableModel = modTable1;
            DefaultTableModel = modTableR;
            DefaultTableModel = modRank;
            DefaultTableModel = modTable1;
            modRank = new DefaultTableModel();
            modTableR = new DefaultTableModel();
            tableR.setModel(modTableR);
            rank.setModel(modRank);
            
            modTableR.addColumn("Reps");
            modRank.addColumn("Rank");
            tableR.setEnabled(false);
            rank.setEnabled(false);
            int length = Integer.valueOf(participants);
            String[] reps = new String[length];
            String[] rank = new String[length];
            
            
            
            for (int counter = 0; counter < length; counter++) {
            String pReps = JOptionPane.showInputDialog(null, "Enter Repetititon Made:" + (counter + 1), JOptionPane.OK_CANCEL_OPTION);
            reps[counter] = pReps;
            
            }
            
            for (String r : reps){
            modTableR.addRow(new Object[] {r});
            }
            for (int no = 0; no < length; no++){
            
            rank[no] = String.valueOf(length);
            }
            
            for(String no1 : rank){
            modRank.addRow(new Object[] {no1});
            }
            */
        } catch (IOException ex) {
            Logger.getLogger(PullUpsChallenge.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_finActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Challenge challenge = new Challenge();
        this.setVisible(false);
        challenge.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
       fin.setVisible(true);
       
       JOptionPane.showMessageDialog(null, "Competition has commenced! \n    Click finish for evaluation");
        jButton5.setVisible(false);
        jLabel4.setVisible(true);
        info1.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(PullUpsChallenge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PullUpsChallenge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PullUpsChallenge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PullUpsChallenge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PullUpsChallenge().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label block;
    private javax.swing.JButton fin;
    private javax.swing.JLabel info;
    private javax.swing.JLabel info1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    public java.awt.Label time;
    // End of variables declaration//GEN-END:variables

    private void quickSort(int[] arr, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
