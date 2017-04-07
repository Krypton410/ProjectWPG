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
public class BBeginner extends javax.swing.JFrame {

    /**
     * Creates new form BBeginner
     */
    public BBeginner() {
        initComponents();
        setTitle("Beginner Program Generated");
        setResizable(false);
        setSize(800, 726);
                                  //Repititions
                                String[]bsets;
				bsets = new String[4];
				bsets[0] = "3 sets";
				bsets[1] = "4 sets";
				bsets[2] = "3 sets";
				bsets[3] = "4 sets";
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
                                String[]breps;
                                breps = new String[6];
                                breps[0] = "12 reps";
                                breps[1] = "10 reps";
                                breps[2] = "14 reps";
                                breps[3] = "15 reps"; 
                                breps[4] = "8 reps";
                                breps[5] = "7 reps";
                                
                                
                                String[]cooldown;
                                cooldown = new String[5];
                                cooldown[0] = "Jumping Jacks";
                                cooldown[1] = "Stretch ";
                                cooldown[2] = "Exercise Mimicry";
                                cooldown[3] = "Jog";
                                cooldown[4] = "Sparring/Shadow Boxing";
                                int cd = (int) (Math.random()*5);
                                int cd1 = (int) (Math.random()*5);
                                int cd2 = (int) (Math.random()*5);
                                int cd3 = (int) (Math.random()*5);
                          
                                
                                String[]time;
                                time = new String[4];
                                time[0] = "1 minute";
                                time[1] = "Two Minutes";
                                time[2] = "30 seconds";
                                time[3] = "45 seconds";
                                int rd = (int) (Math.random()*4);
                                int rd1 = (int) (Math.random()*4);
                                int rd2 = (int) (Math.random()*4);
                                
                                

        			//One
				//beginner
				String[]bchest;
				bchest = new String[10];
				bchest[0] = "Declined Push ups";
				bchest[1] = "Inclined Push ups";
				bchest[2] = "Wide Push Ups";
				bchest[3] = "Knuckle Push ups";
				bchest[4] = "Regular Push Ups";
				bchest[5] = "Diamond Push Ups";
				bchest[6] = "Explosive Regular Push ups";
				bchest[7] = "Wall push ups";
				bchest[8] = "Spiderman Push ups";
				bchest[9] = "Plank to push ups";
				int a = (int) (Math.random()*10);
				int a1 = (int) (Math.random()*10);
				int a2 = (int) (Math.random()*10);
				
				
				
				
				String[]bback;
				bback = new String[9];
				bback[0] = "Australian Pull Ups";
				bback[1] = "1 arm Australian pull ups";
				bback[2] = "Chin ups";
				bback[3] = "Good Mornings";
				bback[4] = "Reverse Archer Sit ups";
				bback[5] = "Reverse Snow Angels";
				bback[6] = "Negative Pull ups";
				bback[7] = "Negative Chin Ups";
				bback[8] = "Australian Chin ups";
				int b = (int) (Math.random()*9);
				int b1 = (int) (Math.random()*9);
				int b2 = (int) (Math.random()*9);
				
				
				
				String[]babs;
				babs = new String[10];
				babs[0] = "Sit ups";
				babs[1] = "knee planks";
				babs[2] = "V ups";
				babs[3] = "Plank Ups";
				babs[4] = "Reverse plank ups";
				babs[5] = "Lying Leg Raise";
				babs[6] = "Single arm plank";
				babs[7] = "Straddle planks";
				babs[8] = "Straddle V ups";
				babs[9] = "Crunches";
				int ba = (int) (Math.random()*10);
				int ba1 = (int) (Math.random()*10);
				int ba2 = (int) (Math.random()*10);
				int ba3 = (int) (Math.random()*10);

				
				
				String[]blegs;
				blegs = new String[9];
				blegs[0] = "Regular Squat";
				blegs[1] = "close squat";
				blegs[2] = "Bulgarian Split Squat";
				blegs[3] = "Side Lunges";
				blegs[4] = "Cossack squat";
				blegs[5] = "Sumo squats";
				blegs[6] = "Hindu squats";
				blegs[7] = "Frog Jumps";
				blegs[8] = "Jumping Lunges";
				int c = (int) (Math.random()*9);
				int c1 = (int) (Math.random()*9);
				int c2 = (int) (Math.random()*9);
                                
                                
                                bchest1.setText(bchest[a]);
                                bchest2.setText(bchest[a1]);
                                bchest3.setText(bchest[a2]);
                                
                                
                                
                                bback1.setText(bback[b]);
                                bback2.setText(bback[b1]);
                                bback3.setText(bback[b2]);
                                
                                babs1.setText(babs[ba]);
                                babs2.setText(babs[ba1]);
                                babs3.setText(babs[ba2]);
                                babs4.setText(babs[ba3]);
                                
                                
                                blegs1.setText(blegs[c]);
                                blegs2.setText(blegs[c1]);
                                blegs3.setText(blegs[c2]);
                                
                                
                                    cdown1.setText(cooldown[cd]);
                                    cdown2.setText(cooldown[cd1]);
                                    cdown3.setText(cooldown[cd2]);
                                    
                                    
                                    ctime1.setText(time[rd]);
                                    ctime2.setText(time[rd1]);
                                    ctime3.setText(time[rd2]);
                                    
                                    
                                    
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

                                    creps1.setText(breps[randomInt] + " "  + bsets[br1]);
                                    creps2.setText(breps[second1] + " "  + bsets[br2]);
                                    creps3.setText(breps[randomInt1] + " "  + bsets[br3]);
                       
                                    backreps1.setText(breps[randomInt2] + " " + bsets[br]);
                                    backreps2.setText(breps[randomInt3] + " " + bsets[br4]);
                                    backreps3.setText(breps[randomInt4] + " " + bsets[br5]);
                                    
                                    brabs1.setText(breps[randomInt5] + " " + bsets[br6]);
                                    brabs2.setText(breps[randomInt6] + " " + bsets[br7]);
                                    brabs3.setText(breps[randomInt7] + " " + bsets[br8]);
                                    brabs4.setText(breps[randomInt8] + " " + bsets[br9]);
                                    
                                    
                                    
                                    legrep1.setText(breps[randomInt9] + " " + bsets[br10]);
                                    legrep2.setText(breps[randomInt10] + " " + bsets[br11]);
                                    legrep3.setText(breps[randomInt11] + " " + bsets[br12]);                                   
                              
                                    



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

        babs2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        babs4 = new javax.swing.JLabel();
        blegs1 = new javax.swing.JLabel();
        blegs3 = new javax.swing.JLabel();
        blegs2 = new javax.swing.JLabel();
        bback2 = new javax.swing.JLabel();
        babs3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        babs1 = new javax.swing.JLabel();
        bback3 = new javax.swing.JLabel();
        bback1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bchest3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        creps1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        bchest2 = new javax.swing.JLabel();
        backreps1 = new javax.swing.JLabel();
        creps3 = new javax.swing.JLabel();
        creps2 = new javax.swing.JLabel();
        legrep3 = new javax.swing.JLabel();
        backreps2 = new javax.swing.JLabel();
        backreps3 = new javax.swing.JLabel();
        bchest1 = new javax.swing.JLabel();
        legrep1 = new javax.swing.JLabel();
        brabs3 = new javax.swing.JLabel();
        brabs2 = new javax.swing.JLabel();
        brabs1 = new javax.swing.JLabel();
        cdown2 = new javax.swing.JLabel();
        legrep2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        cdown1 = new javax.swing.JLabel();
        ctime3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        cdown3 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        ctime2 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        brabs4 = new javax.swing.JLabel();
        ctime1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(null);

        babs2.setForeground(new java.awt.Color(240, 240, 240));
        babs2.setText("babs2");
        getContentPane().add(babs2);
        babs2.setBounds(370, 120, 120, 50);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Repetition & Sets");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 260, 150, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Cooldownn");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(630, 50, 130, 30);

        babs4.setForeground(new java.awt.Color(240, 240, 240));
        babs4.setText("babs4");
        getContentPane().add(babs4);
        babs4.setBounds(370, 200, 130, 50);

        blegs1.setForeground(new java.awt.Color(240, 240, 240));
        blegs1.setText("blegs1");
        getContentPane().add(blegs1);
        blegs1.setBounds(510, 90, 120, 30);

        blegs3.setForeground(new java.awt.Color(240, 240, 240));
        blegs3.setText("blegs3");
        getContentPane().add(blegs3);
        blegs3.setBounds(510, 160, 110, 40);

        blegs2.setForeground(new java.awt.Color(240, 240, 240));
        blegs2.setText("blegs2");
        getContentPane().add(blegs2);
        blegs2.setBounds(510, 130, 110, 30);

        bback2.setForeground(new java.awt.Color(240, 240, 240));
        bback2.setText("back2");
        getContentPane().add(bback2);
        bback2.setBounds(220, 120, 150, 50);

        babs3.setForeground(new java.awt.Color(240, 240, 240));
        babs3.setText("babs3");
        getContentPane().add(babs3);
        babs3.setBounds(370, 160, 120, 50);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Chest & Triceps");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(60, 310, 110, 17);

        babs1.setForeground(new java.awt.Color(240, 240, 240));
        babs1.setText("babs1");
        getContentPane().add(babs1);
        babs1.setBounds(370, 80, 100, 50);

        bback3.setForeground(new java.awt.Color(240, 240, 240));
        bback3.setText("back3");
        getContentPane().add(bback3);
        bback3.setBounds(220, 160, 150, 50);

        bback1.setForeground(new java.awt.Color(240, 240, 240));
        bback1.setText("back1");
        getContentPane().add(bback1);
        bback1.setBounds(220, 80, 150, 50);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Legs & Glutes");
        jLabel6.setToolTipText("");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(510, 50, 90, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Abs & Obliques");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(370, 57, 100, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Back & Biceps");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(220, 60, 90, 14);

        bchest3.setForeground(new java.awt.Color(240, 240, 240));
        bchest3.setText("chest3");
        getContentPane().add(bchest3);
        bchest3.setBounds(40, 170, 250, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText(" Chest & Triceps");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 60, 110, 17);

        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("2.)");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(30, 400, 14, 14);

        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("1.)");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 360, 20, 14);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("Abs & Obliques");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(370, 310, 100, 17);

        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("3.)");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(30, 440, 14, 14);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setText("Legs & Glutes");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(500, 310, 82, 17);

        creps1.setForeground(new java.awt.Color(240, 240, 240));
        creps1.setText("Chest Reps 1");
        getContentPane().add(creps1);
        creps1.setBounds(60, 360, 120, 14);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setText("Back & Biceps");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(220, 310, 100, 17);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setText("Rest Time");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(40, 490, 310, 50);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(240, 240, 240));
        jLabel17.setText("Cooldown");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(640, 310, 70, 17);

        bchest2.setForeground(new java.awt.Color(240, 240, 240));
        bchest2.setText("chest2");
        getContentPane().add(bchest2);
        bchest2.setBounds(40, 120, 180, 50);

        backreps1.setForeground(new java.awt.Color(240, 240, 240));
        backreps1.setText("Backreps1");
        getContentPane().add(backreps1);
        backreps1.setBounds(220, 360, 140, 14);

        creps3.setForeground(new java.awt.Color(240, 240, 240));
        creps3.setText("Chest Reps 3");
        getContentPane().add(creps3);
        creps3.setBounds(60, 440, 130, 14);

        creps2.setForeground(new java.awt.Color(240, 240, 240));
        creps2.setText("Chest Reps 2");
        getContentPane().add(creps2);
        creps2.setBounds(60, 400, 130, 14);

        legrep3.setForeground(new java.awt.Color(240, 240, 240));
        legrep3.setText("Legs");
        getContentPane().add(legrep3);
        legrep3.setBounds(500, 430, 140, 14);

        backreps2.setForeground(new java.awt.Color(240, 240, 240));
        backreps2.setText("Backreps2");
        getContentPane().add(backreps2);
        backreps2.setBounds(220, 400, 150, 14);

        backreps3.setForeground(new java.awt.Color(240, 240, 240));
        backreps3.setText("Backreps3");
        getContentPane().add(backreps3);
        backreps3.setBounds(220, 440, 150, 14);

        bchest1.setForeground(new java.awt.Color(240, 240, 240));
        bchest1.setText("chest1");
        getContentPane().add(bchest1);
        bchest1.setBounds(40, 80, 250, 50);

        legrep1.setForeground(new java.awt.Color(240, 240, 240));
        legrep1.setText("Legs");
        getContentPane().add(legrep1);
        legrep1.setBounds(500, 360, 130, 14);

        brabs3.setForeground(new java.awt.Color(240, 240, 240));
        brabs3.setText("ab reps 3");
        getContentPane().add(brabs3);
        brabs3.setBounds(370, 440, 140, 10);

        brabs2.setForeground(new java.awt.Color(240, 240, 240));
        brabs2.setText("ab reps 2");
        getContentPane().add(brabs2);
        brabs2.setBounds(370, 400, 140, 10);

        brabs1.setForeground(new java.awt.Color(240, 240, 240));
        brabs1.setText("ab reps 1");
        getContentPane().add(brabs1);
        brabs1.setBounds(370, 360, 140, 14);

        cdown2.setForeground(new java.awt.Color(240, 240, 240));
        cdown2.setText("cooldown 2");
        getContentPane().add(cdown2);
        cdown2.setBounds(640, 130, 140, 14);

        legrep2.setForeground(new java.awt.Color(240, 240, 240));
        legrep2.setText("Legs");
        getContentPane().add(legrep2);
        legrep2.setBounds(500, 390, 130, 14);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(240, 240, 240));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(690, 670, 73, 23);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(240, 240, 240));
        jLabel24.setText("Chest");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(50, 540, 40, 17);

        cdown1.setForeground(new java.awt.Color(240, 240, 240));
        cdown1.setText("cooldown1");
        getContentPane().add(cdown1);
        cdown1.setBounds(640, 100, 140, 14);

        ctime3.setForeground(new java.awt.Color(240, 240, 240));
        ctime3.setText("Cdown");
        getContentPane().add(ctime3);
        ctime3.setBounds(640, 420, 140, 14);

        jLabel18.setForeground(new java.awt.Color(240, 240, 240));
        jLabel18.setText("1 minute Interval");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(50, 570, 120, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Beginner Workout Routine Generated:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 10, 330, 50);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(240, 240, 240));
        jLabel25.setText("Back");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(220, 540, 29, 17);

        cdown3.setForeground(new java.awt.Color(240, 240, 240));
        cdown3.setText("cooldown 3");
        getContentPane().add(cdown3);
        cdown3.setBounds(640, 170, 130, 14);

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(240, 240, 240));
        jLabel27.setText("Legs");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(510, 540, 60, 17);

        jLabel22.setForeground(new java.awt.Color(240, 240, 240));
        jLabel22.setText("30 seconds Interval");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(370, 564, 120, 50);

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(240, 240, 240));
        jLabel26.setText("Abs");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(370, 540, 80, 17);

        ctime2.setForeground(new java.awt.Color(240, 240, 240));
        ctime2.setText("Cdown");
        getContentPane().add(ctime2);
        ctime2.setBounds(640, 380, 140, 14);

        jLabel23.setForeground(new java.awt.Color(240, 240, 240));
        jLabel23.setText("1 minute Interval");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(500, 570, 100, 40);

        jLabel19.setForeground(new java.awt.Color(240, 240, 240));
        jLabel19.setText("1 minute Interval");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(210, 560, 100, 60);

        brabs4.setForeground(new java.awt.Color(240, 240, 240));
        brabs4.setText("ab reps 4");
        getContentPane().add(brabs4);
        brabs4.setBounds(370, 480, 140, 14);

        ctime1.setForeground(new java.awt.Color(240, 240, 240));
        ctime1.setText("Cdown");
        getContentPane().add(ctime1);
        ctime1.setBounds(640, 350, 130, 14);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/background.jpg"))); // NOI18N
        getContentPane().add(jLabel20);
        jLabel20.setBounds(-20, -10, 820, 840);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/background.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-20, -10, 820, 840);

        jLabel21.setText("jLabel21");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(650, 430, 40, 14);

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
            java.util.logging.Logger.getLogger(BBeginner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BBeginner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BBeginner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BBeginner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BBeginner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel babs1;
    private javax.swing.JLabel babs2;
    private javax.swing.JLabel babs3;
    private javax.swing.JLabel babs4;
    private javax.swing.JLabel backreps1;
    private javax.swing.JLabel backreps2;
    private javax.swing.JLabel backreps3;
    private javax.swing.JLabel bback1;
    private javax.swing.JLabel bback2;
    private javax.swing.JLabel bback3;
    private javax.swing.JLabel bchest1;
    private javax.swing.JLabel bchest2;
    private javax.swing.JLabel bchest3;
    private javax.swing.JLabel blegs1;
    private javax.swing.JLabel blegs2;
    private javax.swing.JLabel blegs3;
    private javax.swing.JLabel brabs1;
    private javax.swing.JLabel brabs2;
    private javax.swing.JLabel brabs3;
    private javax.swing.JLabel brabs4;
    private javax.swing.JLabel cdown1;
    private javax.swing.JLabel cdown2;
    private javax.swing.JLabel cdown3;
    private javax.swing.JLabel creps1;
    private javax.swing.JLabel creps2;
    private javax.swing.JLabel creps3;
    private javax.swing.JLabel ctime1;
    private javax.swing.JLabel ctime2;
    private javax.swing.JLabel ctime3;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel legrep1;
    private javax.swing.JLabel legrep2;
    private javax.swing.JLabel legrep3;
    // End of variables declaration//GEN-END:variables
}
