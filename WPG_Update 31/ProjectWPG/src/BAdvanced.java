
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
public class BAdvanced extends javax.swing.JFrame {

    /**
     * Creates new form BAdvanced
     */
    public BAdvanced() {
        initComponents();
         setTitle("Advanced Program Generated");
        setResizable(false);
        setSize(800, 726);
        
        
        
        	
				String[]achest;
				achest = new String[10];
				achest[0] = "One Arm Push ups";
				achest[1] = "Typewriter Push ups";
				achest[2] = "Archer Push Ups";
				achest[3] = "Stationary Superman Push Ups";
				achest[4] = "Superman Push Ups";
				achest[5] = "Toe touch push ups aka 'Aztec Push Ups'";
 				achest[6] = "Single arm toe touch  push ups";
				achest[7] = "Pseudo push ups";
				achest[8] = "Back Clap Push Ups";
				achest[9] = "OA clapping push ups(each arms)";
				int h = (int) (Math.random()*10);
				int h1 = (int) (Math.random()*10);
				int h2 = (int) (Math.random()*10);
				int h3 = (int) (Math.random()*10);
				
				
				
				String[]aback;
				aback = new String[10];
				aback[0] = "Clapping pull ups";
				aback[1] = "Typewriter pull ups";
				aback[2] = "Archer Pull Ups";
				aback[3] = "Assisted One Arm pull ups";
				aback[4] = "OAPU Negatives";
				aback[5] = "Weighted pull ups";
				aback[6] = "CG high Pull ups";
				aback[7] = "WG high pull ups";
				aback[8] = "Muscle Ups";
				aback[9] = "WG muscle ups";
				int p = (int) (Math.random()*10);
				int i1 = (int) (Math.random()*10);
				int i2 = (int) (Math.random()*10);
				int i3 = (int) (Math.random()*10);
				
				
				String[]abs;
				abs = new String[7];
				abs[0] = "L sit(Bar)";
				abs[1] = "Leg raise(Half)";
				abs[2] = "Leg raise(Full)";
				abs[3] = "L sit(Floor)";
				abs[4] = "Full Hollow Body Hold";
				abs[5] = "Dragon Flags";
				abs[6] = "Ab roller";
 				int j = (int)  (Math.random()*7);
				int j1 = (int)  (Math.random()*7);
				int j2 = (int)  (Math.random()*7);
				int j3 = (int)  (Math.random()*7);
				
				
				String[]alegs;
				alegs = new String[8];
				alegs[0] = "Pistol squat(each leg)";
				alegs[1] = "Weighted Pistol squat";
				alegs[2] = "Alternate PS (Each legs)";
				alegs[3] = "Diamond Squats";
 				alegs[4] = "Reverse Lunge Shrimp Squat";
				alegs[5] = "Falling Tower";
				alegs[6] = "Kneel to explosive squat";
				alegs[7] = "Alternate Explosive PS";
				int k = (int) (Math.random()*8);
				int k1 = (int) (Math.random()*8);
				int k2 = (int) (Math.random()*8);
				int k3 = (int) (Math.random()*8);
				
				
                                
                                achest1.setText(achest[h]);
                                achest2.setText(achest[h1]);
                                achest3.setText(achest[h2]);
                               
                                aback1.setText(aback[p]);
                                aback2.setText(aback[i1]);
                                aback3.setText(aback[i2]);
                                
                                aabs1.setText(abs[j]);
                                aabs2.setText(abs[j1]);
                                aabs3.setText(abs[j2]);
                                aabs4.setText(abs[j3]);
                                
                                alegs1.setText(alegs[k]);
                                alegs2.setText(alegs[k1]);
                                alegs3.setText(alegs[k2]);
                                
                                
                                
                                
                                
                                                                
                               String[]isets;
				isets = new String[4];
				isets[0] = "3 sets";
				isets[1] = "4 sets";
				isets[2] = "3 sets";
				isets[3] = "2 sets";
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
                                ireps[0] = "4 reps";
                                ireps[1] = "9 reps";
                                ireps[2] = "6 reps";
                                ireps[3] = "5 reps"; 
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
                                
                                
                                    cdown1.setText(icooldown[cd]);
                                    cdown2.setText(icooldown[cd1]);
                                    cdown3.setText(icooldown[cd2]);
                                    
                                    
                                    creps1.setText(itime[rd]);
                                    creps2.setText(itime[rd1]);
                                    creps3.setText(itime[rd2]);

                              
                                
                                        
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

                                    achestreps1.setText(ireps[randomInt] + " "  + isets[br1]);
                                    achestreps2.setText(ireps[second1] + " "  + isets[br2]);
                                    achestreps3.setText(ireps[randomInt1] + " "  + isets[br3]);
                       
                                    abackreps1.setText(ireps[randomInt2] + " " + isets[br]);
                                    abackreps2.setText(ireps[randomInt3] + " " + isets[br4]);
                                    abackreps3.setText(ireps[randomInt4] + " " + isets[br5]);
                                    
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        achest2 = new javax.swing.JLabel();
        achest1 = new javax.swing.JLabel();
        achest3 = new javax.swing.JLabel();
        aback2 = new javax.swing.JLabel();
        aback3 = new javax.swing.JLabel();
        aabs3 = new javax.swing.JLabel();
        aabs2 = new javax.swing.JLabel();
        aabs1 = new javax.swing.JLabel();
        aback1 = new javax.swing.JLabel();
        aabs4 = new javax.swing.JLabel();
        alegs1 = new javax.swing.JLabel();
        alegs2 = new javax.swing.JLabel();
        alegs3 = new javax.swing.JLabel();
        cdown1 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        cdown3 = new javax.swing.JLabel();
        cdown2 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        achestreps1 = new javax.swing.JLabel();
        achestreps3 = new javax.swing.JLabel();
        achestreps2 = new javax.swing.JLabel();
        abackreps1 = new javax.swing.JLabel();
        abackreps2 = new javax.swing.JLabel();
        abackreps3 = new javax.swing.JLabel();
        abreps1 = new javax.swing.JLabel();
        abreps2 = new javax.swing.JLabel();
        abreps3 = new javax.swing.JLabel();
        legreps1 = new javax.swing.JLabel();
        legreps2 = new javax.swing.JLabel();
        legreps3 = new javax.swing.JLabel();
        creps1 = new javax.swing.JLabel();
        creps2 = new javax.swing.JLabel();
        creps3 = new javax.swing.JLabel();
        abreps4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Advanced Program Generated");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 20, 380, 50);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(670, 660, 70, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Chest & Triceps");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 90, 100, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Back & Biceps");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(210, 90, 100, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Abs & Obliques");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(360, 90, 120, 17);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Cooldown");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(660, 90, 90, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Legs & Glutes");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(520, 90, 90, 17);

        achest2.setForeground(new java.awt.Color(240, 240, 240));
        achest2.setText("Chest 2");
        getContentPane().add(achest2);
        achest2.setBounds(40, 180, 160, 14);

        achest1.setForeground(new java.awt.Color(240, 240, 240));
        achest1.setText("Chest1");
        getContentPane().add(achest1);
        achest1.setBounds(40, 140, 170, 14);

        achest3.setForeground(new java.awt.Color(240, 240, 240));
        achest3.setText("Chest 3");
        getContentPane().add(achest3);
        achest3.setBounds(40, 220, 170, 14);

        aback2.setForeground(new java.awt.Color(240, 240, 240));
        aback2.setText("Back 2");
        getContentPane().add(aback2);
        aback2.setBounds(210, 180, 140, 14);

        aback3.setForeground(new java.awt.Color(240, 240, 240));
        aback3.setText("Back 3");
        getContentPane().add(aback3);
        aback3.setBounds(210, 220, 150, 14);

        aabs3.setForeground(new java.awt.Color(240, 240, 240));
        aabs3.setText("abs3");
        getContentPane().add(aabs3);
        aabs3.setBounds(360, 220, 160, 14);

        aabs2.setForeground(new java.awt.Color(240, 240, 240));
        aabs2.setText("abs 2");
        getContentPane().add(aabs2);
        aabs2.setBounds(360, 180, 150, 14);

        aabs1.setForeground(new java.awt.Color(240, 240, 240));
        aabs1.setText("Abs 1");
        getContentPane().add(aabs1);
        aabs1.setBounds(360, 140, 160, 14);

        aback1.setForeground(new java.awt.Color(240, 240, 240));
        aback1.setText("Back1");
        getContentPane().add(aback1);
        aback1.setBounds(210, 140, 150, 14);

        aabs4.setForeground(new java.awt.Color(240, 240, 240));
        aabs4.setText("abs 4");
        getContentPane().add(aabs4);
        aabs4.setBounds(360, 250, 160, 14);

        alegs1.setForeground(new java.awt.Color(240, 240, 240));
        alegs1.setText("legsv 1");
        getContentPane().add(alegs1);
        alegs1.setBounds(520, 140, 140, 14);

        alegs2.setForeground(new java.awt.Color(240, 240, 240));
        alegs2.setText("legs 2");
        getContentPane().add(alegs2);
        alegs2.setBounds(520, 180, 140, 14);

        alegs3.setForeground(new java.awt.Color(240, 240, 240));
        alegs3.setText("legs 3");
        getContentPane().add(alegs3);
        alegs3.setBounds(520, 220, 140, 14);

        cdown1.setForeground(new java.awt.Color(240, 240, 240));
        cdown1.setText("cdown1");
        getContentPane().add(cdown1);
        cdown1.setBounds(660, 140, 120, 14);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(240, 240, 240));
        jLabel25.setText("Chest  ");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(60, 320, 150, 17);

        cdown3.setForeground(new java.awt.Color(240, 240, 240));
        cdown3.setText("cdown 3");
        getContentPane().add(cdown3);
        cdown3.setBounds(660, 220, 130, 14);

        cdown2.setForeground(new java.awt.Color(240, 240, 240));
        cdown2.setText("cdown 2");
        getContentPane().add(cdown2);
        cdown2.setBounds(660, 180, 130, 14);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(240, 240, 240));
        jLabel24.setText("Sets & Repetition");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(30, 270, 220, 22);

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(240, 240, 240));
        jLabel26.setText("Back");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(210, 320, 100, 17);

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(240, 240, 240));
        jLabel27.setText("Abs");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(360, 320, 140, 17);

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(240, 240, 240));
        jLabel28.setText("Legs");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(520, 320, 130, 17);

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(240, 240, 240));
        jLabel29.setText("Cooldown");
        getContentPane().add(jLabel29);
        jLabel29.setBounds(670, 320, 90, 17);

        jLabel30.setForeground(new java.awt.Color(240, 240, 240));
        jLabel30.setText("1.)");
        getContentPane().add(jLabel30);
        jLabel30.setBounds(30, 360, 20, 14);

        jLabel31.setForeground(new java.awt.Color(240, 240, 240));
        jLabel31.setText("2.)");
        getContentPane().add(jLabel31);
        jLabel31.setBounds(30, 390, 20, 14);

        jLabel32.setForeground(new java.awt.Color(240, 240, 240));
        jLabel32.setText("3.)");
        getContentPane().add(jLabel32);
        jLabel32.setBounds(30, 420, 20, 14);

        jLabel33.setForeground(new java.awt.Color(240, 240, 240));
        jLabel33.setText("4.)");
        getContentPane().add(jLabel33);
        jLabel33.setBounds(30, 450, 20, 14);

        achestreps1.setForeground(new java.awt.Color(240, 240, 240));
        achestreps1.setText("chest reps 1134");
        getContentPane().add(achestreps1);
        achestreps1.setBounds(60, 360, 140, 14);

        achestreps3.setForeground(new java.awt.Color(240, 240, 240));
        achestreps3.setText("jLabel36");
        getContentPane().add(achestreps3);
        achestreps3.setBounds(60, 420, 150, 14);

        achestreps2.setForeground(new java.awt.Color(240, 240, 240));
        achestreps2.setText("chest reps 2");
        getContentPane().add(achestreps2);
        achestreps2.setBounds(60, 390, 150, 14);

        abackreps1.setForeground(new java.awt.Color(240, 240, 240));
        abackreps1.setText("back reps");
        getContentPane().add(abackreps1);
        abackreps1.setBounds(210, 360, 150, 14);

        abackreps2.setForeground(new java.awt.Color(240, 240, 240));
        abackreps2.setText("back reps");
        getContentPane().add(abackreps2);
        abackreps2.setBounds(210, 390, 150, 14);

        abackreps3.setForeground(new java.awt.Color(240, 240, 240));
        abackreps3.setText("back reps");
        getContentPane().add(abackreps3);
        abackreps3.setBounds(210, 420, 150, 14);

        abreps1.setForeground(new java.awt.Color(240, 240, 240));
        abreps1.setText("ab reps");
        getContentPane().add(abreps1);
        abreps1.setBounds(360, 360, 160, 14);

        abreps2.setForeground(new java.awt.Color(240, 240, 240));
        abreps2.setText("ab reps");
        getContentPane().add(abreps2);
        abreps2.setBounds(360, 390, 160, 14);

        abreps3.setForeground(new java.awt.Color(240, 240, 240));
        abreps3.setText("ab reps");
        getContentPane().add(abreps3);
        abreps3.setBounds(360, 420, 160, 14);

        legreps1.setForeground(new java.awt.Color(240, 240, 240));
        legreps1.setText("leg reps4");
        getContentPane().add(legreps1);
        legreps1.setBounds(520, 360, 140, 14);

        legreps2.setForeground(new java.awt.Color(240, 240, 240));
        legreps2.setText("leg reps");
        getContentPane().add(legreps2);
        legreps2.setBounds(520, 390, 110, 14);

        legreps3.setForeground(new java.awt.Color(240, 240, 240));
        legreps3.setText("leg reps");
        getContentPane().add(legreps3);
        legreps3.setBounds(520, 420, 150, 14);

        creps1.setForeground(new java.awt.Color(240, 240, 240));
        creps1.setText("cdown");
        getContentPane().add(creps1);
        creps1.setBounds(670, 360, 100, 14);

        creps2.setForeground(new java.awt.Color(240, 240, 240));
        creps2.setText("cdown");
        getContentPane().add(creps2);
        creps2.setBounds(670, 390, 110, 14);

        creps3.setForeground(new java.awt.Color(240, 240, 240));
        creps3.setText("cdown");
        getContentPane().add(creps3);
        creps3.setBounds(670, 420, 110, 14);

        abreps4.setForeground(new java.awt.Color(240, 240, 240));
        abreps4.setText("ab reps");
        getContentPane().add(abreps4);
        abreps4.setBounds(360, 450, 160, 14);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Rest Time");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 490, 160, 14);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Chest");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(60, 540, 70, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Back");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(210, 540, 70, 17);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("Abs");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(360, 540, 150, 17);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("Legs");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(520, 540, 70, 17);

        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setText("1 minute Interval");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(60, 580, 110, 14);

        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setText("1:30 minutes Interval");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(210, 580, 150, 14);

        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("30 seconds Interval");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(360, 580, 150, 14);

        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setText("2 minutes Interval");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(520, 580, 140, 14);

        jLabel2.setBackground(new java.awt.Color(102, 0, 0));
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/BAdvanced.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-1630, 0, 2540, 730);

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
            java.util.logging.Logger.getLogger(BAdvanced.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BAdvanced.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BAdvanced.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BAdvanced.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BAdvanced().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aabs1;
    private javax.swing.JLabel aabs2;
    private javax.swing.JLabel aabs3;
    private javax.swing.JLabel aabs4;
    private javax.swing.JLabel aback1;
    private javax.swing.JLabel aback2;
    private javax.swing.JLabel aback3;
    private javax.swing.JLabel abackreps1;
    private javax.swing.JLabel abackreps2;
    private javax.swing.JLabel abackreps3;
    private javax.swing.JLabel abreps1;
    private javax.swing.JLabel abreps2;
    private javax.swing.JLabel abreps3;
    private javax.swing.JLabel abreps4;
    private javax.swing.JLabel achest1;
    private javax.swing.JLabel achest2;
    private javax.swing.JLabel achest3;
    private javax.swing.JLabel achestreps1;
    private javax.swing.JLabel achestreps2;
    private javax.swing.JLabel achestreps3;
    private javax.swing.JLabel alegs1;
    private javax.swing.JLabel alegs2;
    private javax.swing.JLabel alegs3;
    private javax.swing.JLabel cdown1;
    private javax.swing.JLabel cdown2;
    private javax.swing.JLabel cdown3;
    private javax.swing.JLabel creps1;
    private javax.swing.JLabel creps2;
    private javax.swing.JLabel creps3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
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
