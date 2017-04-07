

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.util.List;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.TableColumn;
import javax.swing.DefaultRowSorter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.RowSorter.SortKey;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Maxwell
 */
public class RANK extends javax.swing.JFrame {
//FOR TEXT
    private static CharSequence ast;
    private static String complete;
   

    /**
     * Creates new form RANK
     */
    public RANK() throws IOException {
        initComponents();

        setTitle("Rank");
        setResizable(false);
        setSize(726, 400);

        DefaultTableModel modTable = null;
        DefaultTableModel DefaultTableModel = modTable;
        modTable = new DefaultTableModel();
        table.setModel(modTable);
        DefaultTableModel modTable1 = null;
        DefaultTableModel = modTable1;
        modTable.addColumn("Users");
        modTable.addColumn("User");
        modTable.addColumn("Reps");
        table.setEnabled(false);
       

        int n = 0, i;


        String names = null;
        String players = JOptionPane.showInputDialog(null, "Enter Number Of Participants:", JOptionPane.OK_CANCEL_OPTION);
        System.out.println("Enter number of Paricipants");

        
        int length = Integer.valueOf(players);
        /**
         * Accept number of elements input *
         */
        String[] namess = new String[length];
        int[] reps = new int[length];
        String Preps = null;
        String complete = null;
        String pNamess = null;
        String add = null;
        String pe = null;
        String concat = null;
        int ast = 0;
        int index = 0;
        for (int counter = 0; counter < length; counter++) {

            pNamess = JOptionPane.showInputDialog(null, "Enter Participants :" + (counter + 1), JOptionPane.OK_CANCEL_OPTION);

            namess[counter] = pNamess;
            

        }
        
        
        
        /* for (String user : namess) {

            System.out.println(user);
            JOptionPane.showMessageDialog(null, user);   
        }
test*/
        n = length;
        /**
         * Create array of value given elements *
         */
        int arr[] = new int[n];
        /**
         * Accept elements *
         */
        System.out.println("\nEnter " + n + " integer elements");
        //for (int counter = 0; counter < length; counter++) {
       
        //}
        for (i = 0; i < n; i++) {
            for (String user : namess) {
                System.out.println(user);
                //JOptionPane.showMessageDialog(null, user);
                pe = user;

            }
          

            Preps = JOptionPane.showInputDialog(null, "Reps Made for :" + namess[i] + "[" + (i + 1) + "]", JOptionPane.OK_CANCEL_OPTION);                  
                                   for(int z = 0; z < reps.length; z++){
                                       if(arr[i] == reps[z]){
                                       index = z;
                                       }
                    ast = Integer.valueOf(Preps); 
              add = namess[i] + ast;
              complete = namess[i];
          // complete = Preps + ast;
          
           concat = String.valueOf(ast);
            arr[i] = Integer.valueOf(concat);
        
            }
            modTable.addRow(new Object[] {i+1,complete, ast});
        
            table.setAutoCreateRowSorter(true);
            table.getRowSorter().toggleSortOrder(2);
            table.getRowSorter().toggleSortOrder(0);
            
            String Record = complete + ast;
            //Record(Record, n);
            
            //arr[i] = ast;
            //complete =  namess[index] + " " + arr[i];
             //Call method sort *   
        }
        for (int a : arr) {   
            sort(arr);
            table.getRowSorter().toggleSortOrder(2);
        }    
        //table.getRowSorter().toggleSortOrder(0);
//  Display
        System.out.println("Sorted ");

        for (i = 0; i < n; i++) {
          // complete =   complete + String.valueOf(arr[i]) ;
JOptionPane.showMessageDialog(null, arr[i]);

           //JOptionPane.showMessageDialog(null, arr[i]);
        }
        //ast = Integer.valueOf(Preps);
        JOptionPane.showMessageDialog(null, "Ranking Finished");
       // System.out.println(arr[i]);

        System.out.println(namess[index]);

    }
    
    
    public void record(String Record){
                      
        }
    
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton2.setForeground(new java.awt.Color(240, 240, 240));
        jButton2.setText("Save to Text");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(60, 340, 90, 21);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Participants");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 20, 230, 30);

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(240, 240, 240));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(600, 340, 55, 23);

        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(180, 60, 380, 270);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 730, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        JOptionPane.showMessageDialog(null, "Done!");
        DefaultTableModel modTable = null;
      
        
        Record(modTable);
        /*
        try{
        File f;
        f = new File("Record.txt");
        if (!f.exists()) {
            f.createNewFile();
            System.out.println("Record.txt");
        }
        //FileWriter fs = new FileWriter(f);
        BufferedWriter op = new BufferedWriter(new FileWriter(f, true));
        op.write("log");
        op.close();

        f = new File("Record.txt");
        if (!f.exists()) {
            f.createNewFile();
            JOptionPane.showMessageDialog(null, "Log Made");
        }
        JOptionPane.showMessageDialog(null, "Saved to Record.txt");
        Writer fs = new FileWriter(f);
        op = new BufferedWriter(new FileWriter(f, true));
        Charset charset = StandardCharsets.UTF_8;
        StringBuilder sb = new StringBuilder();
           op.append("#  USER  #   REP  #");
           op.append("\n");
       
           op.append("#NAME");
           op.write("   ");
           op.write("#REP");
           
        Files.write(Paths.get("Record.txt"), sb.toString().getBytes(), StandardOpenOption.APPEND);
        op.close();

        
        
        
                }
        catch (IOException ex) {
                Logger.getLogger(RANK.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        */
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        PullUpsChallenge pull = new PullUpsChallenge();
        pull.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void getAsk() {

        PullUpsChallenge pull = new PullUpsChallenge();
        Sort sort = new Sort();
        String participants = JOptionPane.showInputDialog(null, "Enter Number Of Participants:", JOptionPane.OK_CANCEL_OPTION);

        //participants = pull.init(participants);
        //pull.init.getText(participants);
        int length = Integer.valueOf(participants);
        int n = length;

        String[] names = new String[length];
        int[] reps = new int[length];
        for (int counter = 0; counter < length; counter++) {

            String pNames = JOptionPane.showInputDialog(null, "Enter Participants :" + (counter + 1), JOptionPane.OK_CANCEL_OPTION);

            names[counter] = pNames;

        }

        for (int counter = 0; counter < length; counter++) {
            Iterable<String> pNames = null;

            String pReps = JOptionPane.showInputDialog(null, "Reps Made for :" + pNames + "[" + (counter + 1) + "]", JOptionPane.OK_CANCEL_OPTION);

            reps[counter] = (Integer.valueOf(pReps));

        }

        for (String str : names) {

            System.out.println(str);
        }

        for (int r : reps) {
            System.out.println(r);
        }
    }
    public static void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int arr[], int low, int high) {
        //Descending Order 
        int i =  low, j = high;
        int temp;
        int pivot = arr[(low + high) / 2];
        //partition 
        while (i <= j) {
            //Decend
            while (arr[i] > pivot) {
                i++;
            }
            while (arr[j] < pivot) {
                j--;
            }
            if (i <= j) {
             //Swaps
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
         //Sorting lower half 
        if (low < j) {
            quickSort(arr, low, j);
        }
         // Sorting upper half 
        if (i < high) {
            quickSort(arr, high, i);
        }
    }

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
            java.util.logging.Logger.getLogger(RANK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RANK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RANK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RANK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new RANK().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(RANK.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    private void Record(DefaultTableModel modTable) {
        
        
        
        
         try{
        File f;
        f = new File("Record.txt");
        if (!f.exists()) {
            f.createNewFile();
            System.out.println("Record.txt");
        }
        //FileWriter fs = new FileWriter(f);
        BufferedWriter op = new BufferedWriter(new FileWriter(f, true));
        op.write("log");
        op.close();

        f = new File("Record.txt");
        if (!f.exists()) {
            f.createNewFile();
            JOptionPane.showMessageDialog(null, "Log Made");
        }
        //JOptionPane.showMessageDialog(null, "Saved to Record.txt");
        Writer fs = new FileWriter(f);
        op = new BufferedWriter(new FileWriter(f, true));
        Charset charset = StandardCharsets.UTF_8;
        StringBuilder sb = new StringBuilder();
        /*           op.append("#  USER  #   REP  #");
        op.append("\n");
        
        op.append("#NAME");
        op.write("   ");
        op.write("#REP");
        op.write("\n");*/
        for(int i = 0; i < table.getRowCount(); i++){
        for(int j = 0; j < table.getColumnCount(); j++){
            op.append(table.getModel().getValueAt(i,j) + "          " );
        }
            op.append("\n ----------------------\n");
        }
           PrintWriter os = new PrintWriter(f);
        
           /*           os.println("");
           for (int row = 0; row < table.getRowCount(); row++){
           for(int col = 0; col < table.getColumnCount(); col++){
           os.print(table.getColumn(col));
           os.print(": ");
           os.println(table.getValueAt(row,col));
           }
           }
           */
           
        Files.write(Paths.get("Record.txt"), sb.toString().getBytes(), StandardOpenOption.APPEND);
        op.close();

        
        
        
                }
        catch (IOException ex) {
                Logger.getLogger(RANK.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        
        

                
        
        
        
       
    }
}
