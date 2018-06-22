
import java.util.ArrayList;
import java.util.*;
/*
 * author Tom Hoogkamp
 * no return statements
 * june 22, 2018
 * this code is to help people playing Final Fantasy XV when they feel either
 * underleveled or underprepared to fight a boss.
 */

/**
 *
 * @author thhoo7460
 */
public class FinalFantasyXVBossList extends javax.swing.JFrame {

    
    /**
     * Creates new form FinalFantasyXVBossList
     */
    public FinalFantasyXVBossList() {
        initComponents();
        /**
         * the following 295 lines of code are all the 
         * information on the bosses
         */
//        bossName.setText("Arachne");
//        level.setText("Level: 12");
//        health.setText("Health: 13,000");
//        strength.setText("Strength: 780");
//        weakness.setText("Weakness: Greatswords, Machinery, Fire, Light");
//        resistant.setText("Resistant: Lightning");
//        playerLevel.setText("Recommended Player Level: 11 - 14");
        
//        bossName.setText("Aramusha");
//        level.setText("Level: 50 - 52");
//        health.setText("Health: 39,500 - 175,600");
//        strength.setText("Strength: 12,120 - 27,710");
//        weakness.setText("Weakness: Swords, Daggers, Lightning, Light");
//        resistant.setText("Resistant: Fire");
//        playerLevel.setText("Recommended Player Level: 50 - 52");
//        
//        bossName.setText("Ardyn");
//        level.setText("Level: 58");
//        health.setText("Health: 200,000");
//        strength.setText("Strength: 4,760");
//        weakness.setText("Weakness: Nothing");
//        resistant.setText("Resistant: Everything");
//        playerLevel.setText("Recommended Player Level: 60 - 65");
//        
//        bossName.setText("Bandersnatch");
//        level.setText("Level: 38 - 47");
//        health.setText("Health: 75,800 - 141,200");
//        strength.setText("Strength: 8,160 - 21,020");
//        weakness.setText("Weakness: Polearms, Machinery, Lightning");
//        resistant.setText("Resistant: Light, Fire, Alterna, Stop, Highly resistant to Death");
//        playerLevel.setText("Recommended Player Level: 38 - 50");
//        
//        bossName.setText("Behemoth King");
//        level.setText("Level: 42");
//        health.setText("Health: 120,900");
//        strength.setText("Strength: 13,720");
//        weakness.setText("Weakness: Greatswords, Shields");
//        resistant.setText("Resistant: Stop, Immune to Ice, Death and Alterna");
//        playerLevel.setText("Recommended Player Level: 40 - 43");
//        
//        bossName.setText("Bennu");
//        level.setText("Level: 55");
//        health.setText("Health: 198,300");
//        strength.setText("Strength: 28,800");
//        weakness.setText("Weakness: Polearms, Machinery, Lightning");
//        resistant.setText("Resistant: Ice, Immune to Light, Death, Alterna, Poison and Stop");
//        playerLevel.setText("Recommended Player Level: 54 - 57");
//        
//        bossName.setText("Bilröst");
//        level.setText("Level: 99");
//        health.setText("Health: 649,700");
//        strength.setText("Strength: 114,210");
//        weakness.setText("Weakness: Swords, Daggers, Ice");
//        resistant.setText("Resistant: Stop, Immune to Fire, Death and Alterna");
//        playerLevel.setText("Recommended Player Level: 99 - 103");
//        
//        bossName.setText("Bloodhorn");
//        level.setText("Level: 2");
//        health.setText("Health: 9,100");
//        strength.setText("Strength: 240");
//        weakness.setText("Weakness: Shields, Polearms, Fire");
//        resistant.setText("Resistant: Ice, Death, Stop");
//        playerLevel.setText("Recommended Player Level: 3 - 4");
//        
//        bossName.setText("Catoblepas");
//        level.setText("Level: 38");
//        health.setText("Health: 85, 500");
//        strength.setText("Strength: 12,060");
//        weakness.setText("Weakness: Polearms, Machinery, Fire");
//        resistant.setText("Resistant: Lightning, Light, Stop, Immune to Death and Alterna");
//        playerLevel.setText("Recommended Player Level: 38 - 40");
//        
//        bossName.setText("Chandravarma");
//        level.setText("Level: 73");
//        health.setText("Health: 285,600");
//        strength.setText("Strength: 56,980");
//        weakness.setText("Weakness: Light");
//        resistant.setText("Resistant: Fire, Ice, Lightning, Swords, Greatswords, Shields, Polearms, Daggers, Firearms, Machinery");
//        playerLevel.setText("Recommended Player Level: 74 - 77");
//        
//        bossName.setText("Deathclaw");
//        level.setText("Level: 34");
//        health.setText("Health: 72,300");
//        strength.setText("Strength: 4,030");
//        weakness.setText("Weakness: Shields, Machinery, Fire, Light");
//        resistant.setText("Resistant: Ice, Immune to Death, Alterna");
//        playerLevel.setText("Recommended Player Level: 35 - 37");
//        
//        bossName.setText("Ifrit");
//        level.setText("Level: 46");
//        health.setText("Health: 99,500");
//        strength.setText("Strength: 18,070");
//        weakness.setText("Weakness: Ice");
//        resistant.setText("Resistant: Immune to Fire, Alterna, Death, Poison, Stop");
//        playerLevel.setText("Recommended Player Level: 48 - 52");
//        
//        bossName.setText("Jabberwock");
//        level.setText("Level: 58");
//        health.setText("Health: 201,200");
//        strength.setText("Strength: 36,680");
//        weakness.setText("Weakness: Polearms, Machinery, Ice");
//        resistant.setText("Resistant: Fire, Stop, Immune to Death, Alterna");
//        playerLevel.setText("Recommended Player Level: 60 - 63");
//        
//        bossName.setText("Jormungand");
//        level.setText("Level: 50");
//        health.setText("Health: 184,200");
//        strength.setText("Strength: 22,940");
//        weakness.setText("Weakness: Swords, Daggers, Ice");
//        resistant.setText("Resistant: Alterna, Stop, Immune to Fire, Death");
//        playerLevel.setText("Recommended Player Level: 53 - 55");
//        
//        bossName.setText("Kengo");
//        level.setText("Level: 71");
//        health.setText("Health: 290,200");
//        strength.setText("Strength: 58,250");
//        weakness.setText("Weakness: Polearms, Firearms, Lightning, Light");
//        resistant.setText("Resistant: Fire, Death, Immune to Alterna");
//        playerLevel.setText("Recommended Player Level: 73 - 77");
//        
//        bossName.setText("Lakhmu Flan");
//        level.setText("Level: 61");
//        health.setText("Health: 274,000");
//        strength.setText("Strength: 39,180");
//        weakness.setText("Weakness: Light");
//        resistant.setText("Resistant: Swords, Greatswords, Shields, Polearms, Daggers, Firearms, Machinery, Fire, Ice, Lightning, Death");
//        playerLevel.setText("Recommended Player Level: 63 - 66");
//        
//        bossName.setText("Leviathan");
//        level.setText("Level: 42");
//        health.setText("Health: 20,000");
//        strength.setText("Strength: 3,070");
//        weakness.setText("Weakness: Nothing");
//        resistant.setText("Resistant: Highly resistant to Swords, Greatswords, Shields, Polearms, Daggers, Firearms, Machinery, Fire, Ice, Lightning, Light, Immune to Death, Alterna, Poison, Stop");
//        playerLevel.setText("Recommended Player Level: 44 - 48");
//        
//        bossName.setText("MA-X Cuirass");
//        level.setText("Level: 22 - 51");
//        health.setText("Health: 46,200 - 108,500");
//        strength.setText("Strength: 2,240 - 19,290");
//        weakness.setText("Weakness: Machinery, Shields");
//        resistant.setText("Resistant: Immune to Light, Death, Alterna, Poison, Stop");
//        playerLevel.setText("Recommended Player Level: 24 - 56");
//        
//        bossName.setText("MA-X Dux");
//        level.setText("Level: 51");
//        health.setText("Health: 108,500");
//        strength.setText("Strength: 19,290");
//        weakness.setText("Weakness: Machinery, Shields");
//        resistant.setText("Resistant: Alterna, Highly resistant to Death, Immune to Light, Poison, Stop");
//        playerLevel.setText("Recommended Player Level: 53 - 56");
//        
//        bossName.setText("MA-X Maniple");
//        level.setText("Level: 23 - 55");
//        health.setText("Health: 47,700 - 124,900");
//        strength.setText("Strength: 2,360 - 23,370");
//        weakness.setText("Weakness: Machinery, Shields");
//        resistant.setText("Resistant: Alterna, Poison, Stop, Highly resistant to Death, Immune to Light");
//        playerLevel.setText("Recommended Player Level: 26 - 60");
//        
//        bossName.setText("Mahanaga");
//        level.setText("Level: 78");
//        health.setText("Health: 380800");
//        strength.setText("Strength: 72,310");
//        weakness.setText("Weakness: Greatswords, Daggers, Ice");
//        resistant.setText("Resistant: Fire, Light, Highly resistant to Death, Immune to Alterna, Stop");
//        playerLevel.setText("Recommended Player Level: 80 - 84");
//        
//        bossName.setText("Malbodoom");
//        level.setText("Level: 85");
//        health.setText("Health: 136,800");
//        strength.setText("Strength: 51,440");
//        weakness.setText("Weakness: Greatswords, Machinery, Fire");
//        resistant.setText("Resistant: Ice, Light, Immune to Death, Alterna");
//        playerLevel.setText("Recommended Player Level: 87 - 92");
//        
//        bossName.setText("Malboro");
//        level.setText("Level: 38");
//        health.setText("Health: 35,000");
//        strength.setText("Strength: 6,180");
//        weakness.setText("Weakness: Greatswords, Machinery, Fire");
//        resistant.setText("Resistant: Ice, Light, Immune to Death, Alterna");
//        playerLevel.setText("Recommended Player Level: 40 - 43");
//        
//        bossName.setText("Manxom");
//        level.setText("Level: 94");
//        health.setText("Health: 483,700");
//        strength.setText("Strength: 105,320");
//        weakness.setText("Weakness: Polearms, Lightning");
//        resistant.setText("Resistant: Greatswords, Ice, Light, Stop, Immune to Death");
//        playerLevel.setText("Recommended Player Level: 95 - 98");
//        
//        bossName.setText("Melusine");
//        level.setText("Level: 99");
//        health.setText("Health: 1,080,520");
//        strength.setText("Strength: 65,820");
//        weakness.setText("Weakness: Fire, Light");
//        resistant.setText("Resistant: Ice, Lightning");
//        playerLevel.setText("Recommended Player Level: 99 - 103");
//        
//        bossName.setText("Mictlantecihuatl");
//        level.setText("Level: 90");
//        health.setText("Health: 457,900");
//        strength.setText("Strength: 91,070");
//        weakness.setText("Weakness: Polearms, Daggers, Ice");
//        resistant.setText("Resistant: Immune to Lightning, Death, Alterna, Stop");
//        playerLevel.setText("Recommended Player Level: 95");
//        
//        bossName.setText("Naga");
//        level.setText("Level: 30");
//        health.setText("Health: 30,700");
//        strength.setText("Strength: 3,400");
//        weakness.setText("Weakness: Greatswords, Daggers, Ice");
//        resistant.setText("Resistant: Fire, Light, Death");
//        playerLevel.setText("Recommended Player Level: 28 - 34");
//        
//        bossName.setText("Naglfar");
//        level.setText("Level: 120");
//        health.setText("Health: 875,700");
//        strength.setText("Strength: 153,380");
//        weakness.setText("Weakness: Fire, Ice, Lightning, Light, Poison, Stop");
//        resistant.setText("Resistant: Swords, Greatswords, Shields, Polearms, Daggers, Firearms, Machinery, Immune to Death, Alterna");
//        playerLevel.setText("Recommended Player Level: 118 - 120");
//        
//        bossName.setText("Omega");
//        level.setText("Level: 119");
//        health.setText("Health: 555,300");
//        strength.setText("Strength: 147,920");
//        weakness.setText("Weakness: Lightning");
//        resistant.setText("Resistant: Absorbs Light, Highly resistant to Swords, Greatswords, Shields, Polearms, Daggers, Firearms, Machinery, Fire, Ice, Immune to Death, Alterna, Poison, Stop");
//        playerLevel.setText("Recommended Player Level: 118 - 120");
//        
//        bossName.setText("Phalaris");
//        level.setText("Level: 85");
//        health.setText("Health: 316,800");
//        strength.setText("Strength: 61,150");
//        weakness.setText("Weakness: Greatswords, Shields, Fire");
//        resistant.setText("Resistant: Light, Ice, Immune to Death, Alterna");
//        playerLevel.setText("Recommended Player Level: 84 - 90");
//        
//        bossName.setText("Quetzalcoatl");
//        level.setText("Level: 32");
//        health.setText("Health: 64,600");
//        strength.setText("Strength: 4,840");
//        weakness.setText("Weakness: Polearms, Daggers, Ice");
//        resistant.setText("Resistant: Immune to Lightning, Death, Alterna, Stop");
//        playerLevel.setText("Recommended Player Level: 30 - 34");
//        
//        bossName.setText("Ravus");
//        level.setText("Level: 44");
//        health.setText("Health: 275,000");
//        strength.setText("Strength: 8,000");
//        weakness.setText("Weakness: Light");
//        resistant.setText("Resistant: Fire, Ice, Lightning, Immune to Death, Alterna, Poison and Stop");
//        playerLevel.setText("Recommended Player Level: 43 - 48");
//        
//        bossName.setText("Rogue Behemoth");
//        level.setText("Level: 35");
//        health.setText("Health: 69,800");
//        strength.setText("Strength: 5,990");
//        weakness.setText("Weakness: Greatswords, Shields");
//        resistant.setText("Resistant: Fire, Light, Alterna, Stop, Highly Resistant to Stop");
//        playerLevel.setText("Recommended Player Level: 34 - 38");
//        
//        bossName.setText("Rogue Karlabos");
//        level.setText("Level: 35");
//        health.setText("Health: 75,300");
//        strength.setText("Strength: 6,350");
//        weakness.setText("Weakness: Swords, Polearms, Ice");
//        resistant.setText("Resistant: Fire, Light, Death");
//        playerLevel.setText("Recommended Player Level: 34 - 38");
//        
//        bossName.setText("The Mystic");
//        level.setText("Level: 53");
//        health.setText("Health: 147,500");
//        strength.setText("Strength: 18,931");
//        weakness.setText("Weakness: Fire, Light");
//        resistant.setText("Resistant: Ice, Lightning, Immune to Death, Alterna, Poison and Stop");
//        playerLevel.setText("Recommended Player Level: 52 - 58");
//        
//        bossName.setText("Titan");
//        level.setText("Level: 25");
//        health.setText("Health: 213,000");
//        strength.setText("Strength: 580");
//        weakness.setText("Weakness: Nothing");
//        resistant.setText("Resistant: Immune to Death, Alterna, Poison and Stop");
//        playerLevel.setText("Recommended Player Level: 24 - 30");
//        
//        bossName.setText("Treant");
//        level.setText("Level: 38");
//        health.setText("Health: 71,000");
//        strength.setText("Strength: 7,160");
//        weakness.setText("Weakness: Greatswords, Machinery, Fire");
//        resistant.setText("Resistant: Lightning, Light, Death, Alterna");
//        playerLevel.setText("Recommended Player Level: 37 - 43");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        bossStats = new javax.swing.JButton();
        bossList = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 0));

        Title.setFont(new java.awt.Font("Rafika", 0, 18)); // NOI18N
        Title.setText("Final Fantasy XV Boss Stats!!!");

        bossStats.setBackground(new java.awt.Color(255, 51, 0));
        bossStats.setText("Check this bosses stats");
        bossStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bossStatsActionPerformed(evt);
            }
        });

        bossList.setBackground(new java.awt.Color(255, 51, 0));
        bossList.setMaximumRowCount(99);
        bossList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Arachne", "Aramusha", "Ardyn", "Bandersnatch", "Behemoth King", "Bennu", "Bilröst", "Bloodhorn", "Catoblepas", "Chandravarma", "Deathclaw", "Ifrit", "Jabberwock", "Jormungand", "Kengo", "Lackhmu Flan", "Leviathan", "MA-X Cuirass", "MA-X Dux", "MA-X Maniple", "Mahanaga", "Malbodoom", "Malboro", "Manxom", "Melusine", "Mictlantecihuatl", "Naga", "Nagalfar", "Omega", "Phalaris", "Quetzalcoatl", "Ravus", "Rogue Behemoth", "Rogue Karlabos", "The Mystic", "Titan", "Treant" }));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, bossStats, org.jdesktop.beansbinding.ObjectProperty.create(), bossList, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        bossList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bossListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Title)
                .addGap(0, 29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bossList, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(bossStats)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title)
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bossStats)
                    .addComponent(bossList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(188, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>                        

    private void bossStatsActionPerformed(java.awt.event.ActionEvent evt) {                                          
/**
 * this section of code allows for clicking the button to move over to a new
 * frame where the bosses statistics will be.
 */
//    if (bossList.getSelectedItem().equals(0)){
        this.setVisible(false);
        new FinalFantasyXVBoss1().setVisible(true);
//    }else if(bossList.getSelectedItem().equals(1)){ 
//        System.out.println("test test test");
//    }
         
//        this.setVisible(false);
//        new FinalFantasyXVBoss1().setVisible(true);
    }                                         

    private void bossListActionPerformed(java.awt.event.ActionEvent evt) {                                         
/**
 * this section of code allows for the user to select which boss they want to
 * view.
 */
        bossList.getSelectedItem();
        if (bossList.getSelectedItem().equals(0)){
        this.setVisible(false);
        new FinalFantasyXVBoss1().setVisible(true);
    }else if(bossList.getSelectedItem().equals(1)){ 
        System.out.println("test test test");
    }
      
    }                                        

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
            java.util.logging.Logger.getLogger(FinalFantasyXVBossList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinalFantasyXVBossList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinalFantasyXVBossList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinalFantasyXVBossList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinalFantasyXVBossList().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel Title;
    private javax.swing.JComboBox bossList;
    private javax.swing.JButton bossStats;
    private javax.swing.JPanel jPanel1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration                   
}
