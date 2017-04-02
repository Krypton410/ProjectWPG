/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maxwell
 */
import java.lang.String;
import java.awt.Color;
import java.io.IOException;
import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.table.DefaultTableModel;
public class Ranking extends javax.swing.JFrame {
    
    
    
    

    /**
     * Creates new form Ranking
     */
    //TABLE
     DefaultTableModel modTable;
   
    public Ranking() {
        Challenge challenge = new Challenge();
        myMain begin = new myMain();
       PushUpChallenge puc = new PushUpChallenge();
         modTable=new DefaultTableModel();
      
         modTable.addColumn("Ranking");
         modTable.addColumn("Name");
         modTable.addColumn("Repetition");
         modTable.addColumn("Time");
         
         /*
         
            String st[]=new String[4];
            st[0] = "1";
            st[1] = begin.maintextbox.getText().trim();
            st[2] = puc.repinput.getText().trim();
            st[3] = puc.w.getText().trim();
             modTable.addRow(st);
         
         */

        setTitle("Ranking Statistics");
        initComponents();
     //   addRowToJTable();
    
        setResizable(false);
        setSize(800, 726);
    }

    
    
    
           public void postTime1(String rep, String time, String s){
               Ranking ranking = new Ranking();
               myMain begin = new myMain();
               PushUpChallenge puc = new PushUpChallenge();
               Challenge challenge = new Challenge();
               Log log = new Log();
              
              String st[]=new String[4];
            st[0] = "s";
            st[1] = puc.area.getText().trim();
            st[2] = puc.repinput.getText().trim();
            st[3] = puc.w.getText().trim();
       
             modTable.addRow(st);
              
              String z = "1";
            String a = puc.area.getText().trim();
            String b = puc.repinput.getText().trim();
            String c = puc.w.getText().trim();
           }
    
          public void postData(String uname){
              Challenge challenge = new Challenge();
        challenge.usrdisplay.setText(uname.toUpperCase());}
  
    public void postData3(JLabel labels){
        Log log = new Log();
        
        

                  
    }

 
    
     //JList list = new JList(puc.names);
    
        
    
    public class User{
        public int place;
        public String user1;
        public int repetition;
        public int time;
        
        public User(int Place, String User1, int Repetition, int Time)
        {
            this.place = Place;
            this.user1 = User1;
            this.repetition = Repetition;
            this.time = Time;
            
        }
    }
    /*
          public void postName(String pr){
            User u1 = new User(1,pr,5,10);
      
         }
    
    */
          
    
    public ArrayList ListUsers()
    {
      //  Log log = new Log();
    PushUpChallenge puc = new PushUpChallenge();
     Challenge challenge = new Challenge();
         //String b = log.postName(String pr);
         
                       
            String z = "1";
            String a = challenge.usrdisplay.getText();
            String b = puc.repinput.getText().trim();
            String c = puc.w.getText().trim();
         
         
         
        ArrayList<User> list = new ArrayList<User>();
        User u1 = new User(1,a,5,10);
        User u2 = new User(2,"te",9,20);
        User u3 = new User(3,"test3",4,30);
        User u4 = new User(4,"test 4",5,40);
        User u5 = new User(5,"test5",6,50);
        User u6 = new User(6,"sn",7,60);
        User u7 = new User(7,"adas",5,70);
        User u8 = new User(8,"adas",5,80);
        User u9 = new User(9,"adas",5,90);
        User u10 = new User(10,"adas",5,1000);
        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        list.add(u5);
        list.add(u6);
        list.add(u7);
        list.add(u8);
        list.add(u9);
        list.add(u10);
        return list;
    }
    
    
    
    /*
    public void addRowToJTable()
    {
        
      
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        ArrayList<User> list = ListUsers();
        Object rowData[] = new Object[4];
        for(int i=0; i<list.size (); i++)
        {
            rowData[0] = list.get(i).place;
            rowData[1] = list.get(i).user1;
            rowData[2] = list.get(i).repetition;
            rowData[3] = list.get(i).time;
            model.addRow(rowData);
            
        }
            
        
    }
*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        list1 = new java.awt.List();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        userB = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        userD = new javax.swing.JLabel();
        userC = new javax.swing.JLabel();
        userE = new javax.swing.JLabel();
        userA = new javax.swing.JLabel();
        userG = new javax.swing.JLabel();
        userF = new javax.swing.JLabel();
        userH = new javax.swing.JLabel();
        userJ = new javax.swing.JLabel();
        userI = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(30, 60, 740, 20);

        list1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list1ActionPerformed(evt);
            }
        });
        getContentPane().add(list1);
        list1.setBounds(330, 120, 240, 280);

        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Repetition");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(210, 120, 60, 14);

        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("10");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 330, 20, 14);

        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("1");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 150, 6, 14);

        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("4");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 210, 6, 14);

        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("2");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 170, 6, 14);

        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("6");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(30, 250, 6, 14);

        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setText("7");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(30, 270, 6, 14);

        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("9");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(30, 310, 6, 14);

        userB.setForeground(new java.awt.Color(240, 240, 240));
        userB.setText("2");
        getContentPane().add(userB);
        userB.setBounds(120, 170, 90, 14);

        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setText("8");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(30, 290, 6, 14);

        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("3");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 190, 6, 14);

        userD.setForeground(new java.awt.Color(240, 240, 240));
        userD.setText("3");
        getContentPane().add(userD);
        userD.setBounds(120, 210, 90, 14);

        userC.setForeground(new java.awt.Color(240, 240, 240));
        userC.setText("3");
        getContentPane().add(userC);
        userC.setBounds(120, 190, 90, 14);

        userE.setForeground(new java.awt.Color(240, 240, 240));
        userE.setText("4");
        getContentPane().add(userE);
        userE.setBounds(120, 230, 90, 14);

        userA.setForeground(new java.awt.Color(240, 240, 240));
        userA.setText("1");
        getContentPane().add(userA);
        userA.setBounds(120, 150, 90, 14);

        userG.setForeground(new java.awt.Color(240, 240, 240));
        userG.setText("7");
        getContentPane().add(userG);
        userG.setBounds(120, 270, 90, 14);

        userF.setForeground(new java.awt.Color(240, 240, 240));
        userF.setText("6");
        getContentPane().add(userF);
        userF.setBounds(120, 250, 100, 14);

        userH.setForeground(new java.awt.Color(240, 240, 240));
        userH.setText("8");
        getContentPane().add(userH);
        userH.setBounds(120, 290, 90, 14);

        userJ.setForeground(new java.awt.Color(240, 240, 240));
        userJ.setText("1");
        getContentPane().add(userJ);
        userJ.setBounds(120, 330, 110, 14);

        userI.setForeground(new java.awt.Color(240, 240, 240));
        userI.setText("9");
        getContentPane().add(userI);
        userI.setBounds(120, 310, 100, 14);

        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Place");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 120, 25, 14);

        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Name");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(120, 120, 27, 14);

        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("5");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(30, 230, 6, 14);

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setForeground(new java.awt.Color(240, 240, 240));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(580, 650, 55, 23);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Rankings");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 20, 260, 25);

        label1.setBackground(new java.awt.Color(51, 51, 51));
        label1.setForeground(new java.awt.Color(240, 240, 240));
        label1.setText("Push Ups Category");
        getContentPane().add(label1);
        label1.setBounds(30, 80, 110, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/ranking_1_1.jpg"))); // NOI18N
        jLabel2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                jLabel2AncestorRemoved(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -20, 810, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         Challenge challenge = new Challenge();
        PushUpChallenge puc = new PushUpChallenge();
                     myMain begin = new myMain();
        
              
        String getRep = puc.repinput.getText();
        challenge.postRep1((getRep));
        String getTime = puc.w.getText();
        challenge.postTime1((getTime)) ;
        
        
        
          String uname =  puc.area.getText();
          challenge.postData1((uname));
          challenge.setVisible(true);
          this.setVisible(false);
          
          
    }//GEN-LAST:event_jButton1ActionPerformed

    
   
    
    
    private void jLabel2AncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel2AncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2AncestorRemoved

    private void list1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_list1ActionPerformed

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
            java.util.logging.Logger.getLogger(Ranking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ranking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ranking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ranking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ranking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private java.awt.Label label1;
    private java.awt.List list1;
    public javax.swing.JLabel userA;
    public javax.swing.JLabel userB;
    public javax.swing.JLabel userC;
    public javax.swing.JLabel userD;
    public javax.swing.JLabel userE;
    public javax.swing.JLabel userF;
    public javax.swing.JLabel userG;
    public javax.swing.JLabel userH;
    public javax.swing.JLabel userI;
    public javax.swing.JLabel userJ;
    // End of variables declaration//GEN-END:variables
}
