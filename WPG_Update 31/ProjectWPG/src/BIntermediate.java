
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maxwell
 */
public class BIntermediate extends javax.swing.JFrame {

    /**
     * Creates new form BIntermediate
     */
    public BIntermediate() {
        initComponents();
        setTitle("Intermediate Program Generated");
        setResizable(false);
        setSize(800, 726);
        
        
        
        		
				
				//Intermediate
				String[]ichest;
				ichest = new String[10];
				ichest[0] = "Clapping Push Ups";
				ichest[1] = "Finger tip Push ups";
				ichest[2] = "Uneven Push ups (Side to side)";
				ichest[3] = "Regular PU to Diamond PU";
				ichest[4] = "Wide Push ups to Normal Push Ups";
				ichest[5] = "Shoulder tap Push ups";
				ichest[6] = "Regular PU to X PU";
				ichest[7] = "Chest Tap Push ups";
				ichest[8] = "Russian Push ups";
				ichest[9] = "Weighted Push ups";
				int d = (int) (Math.random()*10);
				int d1 = (int) (Math.random()*10);
				int d2 = (int) (Math.random()*10);
				int d3 = (int) (Math.random()*10);
				
				
				
				String[]iback;
				iback = new String[9];
				iback[0] = "Pull Ups";
				iback[1] = "Close grip Pull ups";
				iback[2] = "Wide grip Pull ups";
				iback[3] = "Wide grip Chin ups";
				iback[4] = "Close grip chin ups";
				iback[5] = "Slow PU (5 sec up 5 sec down)";
				iback[6] = "Alternate grip switch PU/CU";
				iback[7] = "Weighted Australian PU";
				iback[8] = "Weighted Australian CU";				
				int e = (int) (Math.random()*9);
				int e1 = (int) (Math.random()*9);
				int e2 = (int) (Math.random()*9);
				int e3 = (int) (Math.random()*9);
				
				
				
				String[]iabs;
				iabs = new String[9];
				iabs[0] = "knee raise";
				iabs[1] = "knee oblique twist(bar)";
				iabs[2] = "oblique twists";
				iabs[3] = "Side Plank";
				iabs[4] = "Leg raises(Ground)";
				iabs[5] = "Pike ups";
				iabs[6] = "Crossfit toe to bar";
				iabs[7] = "Hollow body hold half";
				iabs[8] = "Abs slider (Towel)";
				int f = (int) (Math.random()*9);
				int f1 = (int) (Math.random()*9);
				int f2 = (int) (Math.random()*9);
				int f3 = (int) (Math.random()*9);
				
				
				
				
				String[]ilegs;
				ilegs = new String[7];
				ilegs[0] = "Explosive Squats";
				ilegs[1] = "Box Jumps";
				ilegs[2] = "Single leg exlplosive squats";
				ilegs[3] = "Weighted Squats";
				ilegs[4] = "Burpees";
				ilegs[5] = "Weighted Wide squat";
				ilegs[6] = "Assisted pistol squat";
                                
				int g = (int) (Math.random()*7);
				int g1 = (int) (Math.random()*7);
				int g2 = (int) (Math.random()*7);
                                
				//advance 
                                
                                ichest1.setText(ichest[d]);
                                ichest2.setText(ichest[d1]);
                                ichest3.setText(ichest[d2]);
                                
                                iback1.setText(iback[e]);
                                iback2.setText(iback[e1]);
                                iback3.setText(iback[e2]);
                                
                                iabs1.setText(iabs[f]);
                                iabs2.setText(iabs[f1]);
                                iabs3.setText(iabs[f2]);
                                iabs4.setText(iabs[f3]);
                                
                                ilegs1.setText(ilegs[g]);
                                ilegs2.setText(ilegs[g1]);
                                ilegs3.setText(ilegs[g2]);
                                
                                
                                
                                
                               String[]isets;
				isets = new String[4];
				isets[0] = "3 sets";
				isets[1] = "4 sets";
				isets[2] = "3 sets";
				isets[3] = "4 sets";
				int br = (int) (Math.random()*4);
				int br1 = (int) (Math.random()*4);
				int br2 = (int) (Math.random()*4);
				int br3 = (int) (Math.random()*4);
                                int br4 = (int) (Math.random()*4);
                                int br5 = (int) (Math.random()*4);
                                int br6 = (int) (Math.random()*4);
                                int br7 = (int) (Math.random()*4);
                                int br8 = (int) (Math.random()*4);
                                int br9 = (int) (Math.random()*4);
                                int br10 = (int) (Math.random()*4);
                                int br11 = (int) (Math.random()*4);
                                int br12 = (int) (Math.random()*4);
                                String[]ireps;
                                ireps = new String[6];
                                ireps[0] = "12 reps";
                                ireps[1] = "10 reps";
                                ireps[2] = "14 reps";
                                ireps[3] = "15 reps"; 
                                ireps[4] = "8 reps";
                                ireps[5] = "7 reps";
                                
                                
                                String[]icooldown;
                                icooldown = new String[5];
                                icooldown[0] = "Jumping Jacks";
                                icooldown[1] = "Stretch ";
                                icooldown[2] = "Exercise Mimicry";
                                icooldown[3] = "Jog";
                                icooldown[4] = "Sparring/Shadow Boxing";
                                int cd = (int) (Math.random()*5);
                                int cd1 = (int) (Math.random()*5);
                                int cd2 = (int) (Math.random()*5);
                                int cd3 = (int) (Math.random()*5);
                          
                                
                                String[]itime;
                                itime = new String[4];
                                itime[0] = "1 minute";
                                itime[1] = "Two Minutes";
                                itime[2] = "30 seconds";
                                itime[3] = "45 seconds";
                                int rd = (int) (Math.random()*4);
                                int rd1 = (int) (Math.random()*4);
                                int rd2 = (int) (Math.random()*4);
                                
                                
                                    idown1.setText(icooldown[cd]);
                                    idown2.setText(icooldown[cd1]);
                                    idown3.setText(icooldown[cd2]);
                                    
                                    
                                    ctime1.setText(itime[rd]);
                                    ctime2.setText(itime[rd1]);
                                    ctime3.setText(itime[rd2]);

                              
                                  
                                Random rnd = new Random();
             
                                for (int i = 0; i < 6; ++i)
                                {
                                    
                                    int randomInt = rnd.nextInt(6);
                                    int second1 = rnd.nextInt(6);
                                    int randomInt1 = rnd.nextInt(6);
                                    int randomInt2 = rnd.nextInt(6);
                                    int randomInt3 = rnd.nextInt(6);
                                    int randomInt4 = rnd.nextInt(6);
                                    int randomInt5 = rnd.nextInt(6);
                                    int randomInt6 = rnd.nextInt(6);
                                    int randomInt7 = rnd.nextInt(6);
                                    int randomInt8 = rnd.nextInt(6);
                                    int randomInt9 = rnd.nextInt(6);
                                    int randomInt10 = rnd.nextInt(6);
                                    int randomInt11 = rnd.nextInt(6);

                                    chestreps1.setText(ireps[randomInt] + " "  + isets[br1]);
                                    chestreps2.setText(ireps[second1] + " "  + isets[br2]);
                                    chestreps3.setText(ireps[randomInt1] + " "  + isets[br3]);
                       
                                    backreps1.setText(ireps[randomInt2] + " " + isets[br]);
                                    backreps2.setText(ireps[randomInt3] + " " + isets[br4]);
                                    backreps3.setText(ireps[randomInt4] + " " + isets[br5]);
                                    
                                    abreps1.setText(ireps[randomInt5] + " " + isets[br6]);
                                    abreps2.setText(ireps[randomInt6] + " " + isets[br7]);
                                    abreps3.setText(ireps[randomInt7] + " " + isets[br8]);
                                    abreps4.setText(ireps[randomInt8] + " " + isets[br9]);
                                    
                                    
                                    
                                    legreps1.setText(ireps[randomInt9] + " " + isets[br10]);
                                    legreps2.setText(ireps[randomInt10] + " " + isets[br11]);
                                    legreps3.setText(ireps[randomInt11] + " " + isets[br12]);                                   
                              
                                    



                                }
        
               
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ichest1 = new javax.swing.JLabel();
        iabs3 = new javax.swing.JLabel();
        ichest3 = new javax.swing.JLabel();
        iabs1 = new javax.swing.JLabel();
        iabs2 = new javax.swing.JLabel();
        iabs4 = new javax.swing.JLabel();
        iback3 = new javax.swing.JLabel();
        ilegs1 = new javax.swing.JLabel();
        iback1 = new javax.swing.JLabel();
        ilegs3 = new javax.swing.JLabel();
        ilegs2 = new javax.swing.JLabel();
        idown1 = new javax.swing.JLabel();
        idown2 = new javax.swing.JLabel();
        iback2 = new javax.swing.JLabel();
        ichest2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        idown3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        chestreps1 = new javax.swing.JLabel();
        chestreps3 = new javax.swing.JLabel();
        chestreps2 = new javax.swing.JLabel();
        backreps1 = new javax.swing.JLabel();
        backreps3 = new javax.swing.JLabel();
        backreps2 = new javax.swing.JLabel();
        abreps1 = new javax.swing.JLabel();
        abreps2 = new javax.swing.JLabel();
        abreps3 = new javax.swing.JLabel();
        legreps1 = new javax.swing.JLabel();
        abreps4 = new javax.swing.JLabel();
        legreps3 = new javax.swing.JLabel();
        legreps2 = new javax.swing.JLabel();
        ctime1 = new javax.swing.JLabel();
        ctime2 = new javax.swing.JLabel();
        ctime3 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(800, 726));
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(0, 48, 60));
        jButton1.setForeground(new java.awt.Color(240, 240, 240));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(640, 660, 73, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Chest & Triceps");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 90, 130, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Legs & Glutes");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(520, 90, 100, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Abs & Obliques");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(380, 90, 120, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Cooldown");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(660, 90, 90, 17);

        ichest1.setForeground(new java.awt.Color(240, 240, 240));
        ichest1.setText("Chest 1");
        getContentPane().add(ichest1);
        ichest1.setBounds(30, 140, 170, 14);

        iabs3.setForeground(new java.awt.Color(240, 240, 240));
        iabs3.setText("abs 3");
        getContentPane().add(iabs3);
        iabs3.setBounds(380, 200, 140, 14);

        ichest3.setForeground(new java.awt.Color(240, 240, 240));
        ichest3.setText("Chest 3");
        getContentPane().add(ichest3);
        ichest3.setBounds(30, 200, 170, 14);

        iabs1.setForeground(new java.awt.Color(240, 240, 240));
        iabs1.setText("abs1");
        getContentPane().add(iabs1);
        iabs1.setBounds(380, 140, 130, 14);

        iabs2.setForeground(new java.awt.Color(240, 240, 240));
        iabs2.setText("abs2");
        getContentPane().add(iabs2);
        iabs2.setBounds(380, 170, 140, 14);

        iabs4.setForeground(new java.awt.Color(240, 240, 240));
        iabs4.setText("abs 4");
        getContentPane().add(iabs4);
        iabs4.setBounds(380, 230, 140, 14);

        iback3.setForeground(new java.awt.Color(240, 240, 240));
        iback3.setText("Back 3");
        getContentPane().add(iback3);
        iback3.setBounds(200, 200, 150, 14);

        ilegs1.setForeground(new java.awt.Color(240, 240, 240));
        ilegs1.setText("legs 1");
        getContentPane().add(ilegs1);
        ilegs1.setBounds(520, 140, 140, 14);

        iback1.setForeground(new java.awt.Color(240, 240, 240));
        iback1.setText("Back 1");
        getContentPane().add(iback1);
        iback1.setBounds(200, 140, 150, 14);

        ilegs3.setForeground(new java.awt.Color(240, 240, 240));
        ilegs3.setText("Legs 3");
        getContentPane().add(ilegs3);
        ilegs3.setBounds(520, 200, 130, 14);

        ilegs2.setForeground(new java.awt.Color(240, 240, 240));
        ilegs2.setText("legs 2");
        getContentPane().add(ilegs2);
        ilegs2.setBounds(520, 170, 140, 14);

        idown1.setForeground(new java.awt.Color(240, 240, 240));
        idown1.setText("cdown1");
        getContentPane().add(idown1);
        idown1.setBounds(660, 140, 130, 14);

        idown2.setForeground(new java.awt.Color(240, 240, 240));
        idown2.setText("cdown2");
        getContentPane().add(idown2);
        idown2.setBounds(660, 170, 130, 14);

        iback2.setForeground(new java.awt.Color(240, 240, 240));
        iback2.setText("Back 2");
        getContentPane().add(iback2);
        iback2.setBounds(200, 170, 150, 14);

        ichest2.setForeground(new java.awt.Color(240, 240, 240));
        ichest2.setText("chest 2");
        getContentPane().add(ichest2);
        ichest2.setBounds(30, 170, 160, 14);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Intermediate Program Generated");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 30, 280, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Back & Biceps");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(200, 90, 100, 17);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Repetition & Sets");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 270, 260, 22);

        idown3.setForeground(new java.awt.Color(240, 240, 240));
        idown3.setText("cdown 3");
        getContentPane().add(idown3);
        idown3.setBounds(660, 200, 130, 14);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Chest & Triceps");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(60, 330, 120, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Back & Biceps");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(220, 330, 110, 17);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("Abs & Obliques");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(380, 330, 100, 17);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("Legs & Glutes");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(520, 330, 90, 17);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setText("Cooldown");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(660, 330, 90, 17);

        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setText("1.)");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(30, 370, 20, 14);

        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("2.)");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(30, 400, 14, 14);

        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setText("3.)");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(30, 430, 20, 14);

        jLabel17.setForeground(new java.awt.Color(240, 240, 240));
        jLabel17.setText("4.)");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(30, 460, 20, 14);

        chestreps1.setForeground(new java.awt.Color(240, 240, 240));
        chestreps1.setText("Chest Reps");
        getContentPane().add(chestreps1);
        chestreps1.setBounds(60, 370, 150, 14);

        chestreps3.setForeground(new java.awt.Color(240, 240, 240));
        chestreps3.setText("Chest Reps");
        getContentPane().add(chestreps3);
        chestreps3.setBounds(60, 430, 150, 14);

        chestreps2.setForeground(new java.awt.Color(240, 240, 240));
        chestreps2.setText("Chest Reps");
        getContentPane().add(chestreps2);
        chestreps2.setBounds(60, 400, 150, 14);

        backreps1.setForeground(new java.awt.Color(240, 240, 240));
        backreps1.setText("Back reps");
        getContentPane().add(backreps1);
        backreps1.setBounds(220, 370, 150, 14);

        backreps3.setForeground(new java.awt.Color(240, 240, 240));
        backreps3.setText("Back Reps");
        getContentPane().add(backreps3);
        backreps3.setBounds(220, 430, 140, 14);

        backreps2.setForeground(new java.awt.Color(240, 240, 240));
        backreps2.setText("Back Rpes");
        getContentPane().add(backreps2);
        backreps2.setBounds(220, 400, 140, 14);

        abreps1.setForeground(new java.awt.Color(240, 240, 240));
        abreps1.setText("abs reps");
        getContentPane().add(abreps1);
        abreps1.setBounds(380, 370, 130, 14);

        abreps2.setForeground(new java.awt.Color(240, 240, 240));
        abreps2.setText("abs reps 2");
        getContentPane().add(abreps2);
        abreps2.setBounds(380, 400, 140, 14);

        abreps3.setForeground(new java.awt.Color(240, 240, 240));
        abreps3.setText("abs reps");
        getContentPane().add(abreps3);
        abreps3.setBounds(380, 430, 130, 14);

        legreps1.setForeground(new java.awt.Color(240, 240, 240));
        legreps1.setText("lreps");
        getContentPane().add(legreps1);
        legreps1.setBounds(520, 370, 130, 14);

        abreps4.setForeground(new java.awt.Color(240, 240, 240));
        abreps4.setText("Abs reps ");
        getContentPane().add(abreps4);
        abreps4.setBounds(380, 460, 130, 14);

        legreps3.setForeground(new java.awt.Color(240, 240, 240));
        legreps3.setText("lreps");
        getContentPane().add(legreps3);
        legreps3.setBounds(520, 430, 140, 14);

        legreps2.setForeground(new java.awt.Color(240, 240, 240));
        legreps2.setText("lreps");
        getContentPane().add(legreps2);
        legreps2.setBounds(520, 400, 140, 14);

        ctime1.setForeground(new java.awt.Color(240, 240, 240));
        ctime1.setText("cdown");
        getContentPane().add(ctime1);
        ctime1.setBounds(660, 370, 130, 14);

        ctime2.setForeground(new java.awt.Color(240, 240, 240));
        ctime2.setText("cxdown");
        getContentPane().add(ctime2);
        ctime2.setBounds(660, 400, 130, 14);

        ctime3.setForeground(new java.awt.Color(240, 240, 240));
        ctime3.setText("cdown");
        getContentPane().add(ctime3);
        ctime3.setBounds(660, 430, 130, 14);

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(240, 240, 240));
        jLabel34.setText("Rest Time");
        getContentPane().add(jLabel34);
        jLabel34.setBounds(30, 500, 360, 22);

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(240, 240, 240));
        jLabel35.setText("Chest");
        getContentPane().add(jLabel35);
        jLabel35.setBounds(60, 550, 35, 17);

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(240, 240, 240));
        jLabel37.setText("Abs");
        getContentPane().add(jLabel37);
        jLabel37.setBounds(390, 550, 22, 17);

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(240, 240, 240));
        jLabel39.setText("Cooldown");
        getContentPane().add(jLabel39);
        jLabel39.setBounds(660, 550, 61, 17);

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(240, 240, 240));
        jLabel36.setText("Back");
        getContentPane().add(jLabel36);
        jLabel36.setBounds(220, 550, 29, 17);

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(240, 240, 240));
        jLabel38.setText("Legs");
        getContentPane().add(jLabel38);
        jLabel38.setBounds(520, 550, 80, 17);

        jLabel18.setForeground(new java.awt.Color(240, 240, 240));
        jLabel18.setText("1 minute Interval");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(60, 590, 160, 14);

        jLabel19.setForeground(new java.awt.Color(240, 240, 240));
        jLabel19.setText("1 minute Interval");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(220, 590, 160, 14);

        jLabel21.setForeground(new java.awt.Color(240, 240, 240));
        jLabel21.setText("1 minute Interval");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(520, 590, 140, 14);

        jLabel20.setForeground(new java.awt.Color(240, 240, 240));
        jLabel20.setText("30 seconds Interval");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(390, 590, 120, 14);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/intermediate back.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 840, 730);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                new Output().setVisible(true);
                  this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(BIntermediate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BIntermediate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BIntermediate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BIntermediate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BIntermediate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel abreps1;
    private javax.swing.JLabel abreps2;
    private javax.swing.JLabel abreps3;
    private javax.swing.JLabel abreps4;
    private javax.swing.JLabel backreps1;
    private javax.swing.JLabel backreps2;
    private javax.swing.JLabel backreps3;
    private javax.swing.JLabel chestreps1;
    private javax.swing.JLabel chestreps2;
    private javax.swing.JLabel chestreps3;
    private javax.swing.JLabel ctime1;
    private javax.swing.JLabel ctime2;
    private javax.swing.JLabel ctime3;
    private javax.swing.JLabel iabs1;
    private javax.swing.JLabel iabs2;
    private javax.swing.JLabel iabs3;
    private javax.swing.JLabel iabs4;
    private javax.swing.JLabel iback1;
    private javax.swing.JLabel iback2;
    private javax.swing.JLabel iback3;
    private javax.swing.JLabel ichest1;
    private javax.swing.JLabel ichest2;
    private javax.swing.JLabel ichest3;
    private javax.swing.JLabel idown1;
    private javax.swing.JLabel idown2;
    private javax.swing.JLabel idown3;
    private javax.swing.JLabel ilegs1;
    private javax.swing.JLabel ilegs2;
    private javax.swing.JLabel ilegs3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel legreps1;
    private javax.swing.JLabel legreps2;
    private javax.swing.JLabel legreps3;
    // End of variables declaration//GEN-END:variables
}
