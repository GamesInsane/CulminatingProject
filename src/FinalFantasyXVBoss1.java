
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

/*
 * author Tom Hoogkamp
 * no return statements
 * june 22, 2018
 * this code is to display the selected bosses stats in an easy to read format.
 */

/**
 *
 * @author thhoo7460
 */
public class FinalFantasyXVBoss1 extends javax.swing.JFrame {

    /**
     * Creates new form FinalFantasyXVBoss1
     */
    public FinalFantasyXVBoss1() {
        initComponents();
//    ArrayList <String> names = new ArrayList();
//    ArrayList <String> levels = new ArrayList();
//    ArrayList <String> healths = new ArrayList();
//    ArrayList <String> strengths = new ArrayList();
//    ArrayList <String> weaknesss = new ArrayList();
//    ArrayList <String> resistants = new ArrayList();
//    ArrayList <String> playerLevels = new ArrayList();
//    
//    Collections.addAll(names, "Arachne", "Aramusha", "Ardyn", "Bandarsnatch", "Behemoth King", "Bennu", "Bilröst", "Bloodhorn", "Catoblepas", "Chandravarma", "Deathclaw", "Ifrit", "Jabberwock", "Jormungand", "Kengo", "Lakhmu Flan", "Leviathan", "MA-X Cuirass", "MA-X Dux", "MA-X Maniple", "Mahanaga", "Malbodoom", "Malboro", "Manxom", "Melusine", "Mictlantecihuatl", "Naga", "Naglfar", "Omega", "Phalaris", "Quetzalcoatl", "Ravus", "Rogue Behemoth", "Rogue Karlabos", "The Mystic", "Titan", "Treant");
//    Collections.addAll(levels, "12", "50 - 52", "58", "38 - 47", "42", "55", "99", "2", "38", "73", "34", "46", "58", "50", "71", "61", "42", "22 - 51", "51", "23 - 55", "78", "85", "38", "94", "99", "90", "30", "120", "119", "85", "32", "44", "35", "35", "53", "25", "38");
//    Collections.addAll(healths, "13,000", "39,500 - 175,600", "200,000", "75,800 - 141,200", "120,900", "198,300", "649,700", "9,100", "85,500", "285,600", "72,300", "99,500", "201,200", "184,200", "290,200", "274,000", "290,000", "46,200 - 108,500", "108,500", "47,700 - 124,900", "380,800", "136,800", "35,000", "483,700", "1,080,520", "457,900", "30,700", "875,700", "555,300", "316,800", "64,600", "275,000", "69,800", "75,300", "147,500", "213,000", "71,000");
//    Collections.addAll(strengths, "780", "12,120 - 27,710", "4,760", "8,160 - 21,020", "13,720", "28,800", "114,210", "240", "12,060", "56,980", "4,030", "18,070", "36,680", "22,940", "58,250", "39,180", "3,070", "2,240 - 19,290", "19,290", "2,360 - 23,370", "72,310", "51,440", "6,180", "105,320", "65,820", "91,070", "3,400", "153,380", "147,920", "61,150", "4,840", "8,000", "5,990", "6,350", "18,931", "580", "7,160");
//    Collections.addAll(weaknesss, "Greatswords, Machinery, Fire, Light", "Swords, Daggers, Lightning, Light", "Nothing", "Polearms, Machinery, Lightning", "Greatswords, Shields", "Polearms, Machinery, Lightning", "Swords, Daggers, Ice", "Shields, Polearms, Fire", "Polearms, Machinery, Ice", "Light", "Shields, Machinery, Fire, Light", "Ice", "Polearms, Machinery, Ice", "Swords, Daggers, Ice", "Polearms, Firearms, Lightning, Light", "Light", "Nothing", "Shields, Machinery", "Shields, Machinery", "Shields, Machinery", "Greatswords, Daggers, Ice", "Greatswords, Machinery, Fire", "Greatswords, Machinery, Fire", "Polearms, Lightning", "Fire, Light", "Polearms, Daggers, Ice", "Greatswords, Daggers, Ice", "Fire, Ice, Lightning, Light, Poison, Stop", "Lightning", "Greatswords, Shields, Fire", "Polearms, Daggers, Ice", "Light", "Greatswords, Shields", "Swords, Polearms, Ice", "Fire, Light", "Nothing", "Greatswords, Machinery, Fire");
//    Collections.addAll(resistants, "Lightning", "Fire", "Everything", "Light, Fire, Death, Alterna, Stop", "Ice, Death, Alterna, Stop", "Light, Ice, Death, Alterna, Poison, Stop", "Fire, Death, Alterna, Stop", "Ice, Death, Stop", "Lightning, Light, Stop, Death, Alterna", "Fire, Ice, Lightning, Swords, Greatswords, Shields, Polearms, Daggers, Firearms, Machinery", "Ice, Death , Alterna", "Fire, Death, Alterna, Poison, Stop", "Fire, Death, Alterna, Stop", "Fire, Death, Alterna, Stop", "Fire, Death, Alterna", "Swords, Greatswords, Shields, Polearms, Daggers, Firearms, Machinery, Fire, Ice, Lightning, Death", "Swords, Greatswords, Shields, Polearms, Daggers, Firearms, Machinery, Fire, Ice, Lightning, Light, Death, Alterna, Poison, Stop", "Light, Death, Alterna, Poison, Stop", "Light, Death, Alterna, Poison, Stop", "Light, Death, Alterna, Poison, Stop", "Fire, Light, Death, Alterna, Stop", "Ice, Light, Death, Alterna", "Ice, Light, Death, Alterna", "Greatswords, Ice, Light, Stop, Death", "Ice, Lightning", "Lightning, Death, Alterna, Stop", "Fire, Light, Death", "Swords, Greatswords, Shields, Polearms, Daggers, Firearms, Machinery, Death, Alterna", "Light, Swords, Greatswords, Shields, Polearms, Daggers, Firearms, Machinery, Fire, Ice, Death, Alterna, Poison, Stop", "Ice, Light, Death, Alterna", "Lightning, Death, Alterna, Stop", "Fire, Ice, Lightning, Death, Alterna, Poison, Stop", "Fire, Light, Alterna, Stop, Death", "Fire, Light, Death", "Ice, Lightning, Death, Alterna, Poison, Stop", "Death, Alterna, Poison, Stop", "Lightning, Light, Death, Alterna");
//    Collections.addAll(playerLevels, "11 - 14", "48 - 54", "60 - 65", "38 - 50", "40 - 43", "54 - 57", "99 - 103", "3 - 4", "38 - 40", "74 - 77", "35 - 37", "48 - 52", "60 - 63", "53 - 55", "73 - 77", "63 - 66", "44 - 48", "24 - 56", "53 - 56", "26 - 60", "80 - 84", "87 - 92", "40 - 43", "95 - 98", "99 - 103", "90 - 95", "28 - 34", "118 - 120", "118 - 120", "84 - 90", "30 - 34", "43 - 48", "34 - 38", "34 - 38", "52 - 58", "24 - 30", "37 - 43");
//
//    
//        bossName.setText( names.get(names.size()));
        
        bossName.setText("Arachne");
        level.setText("Level: 12");
        health.setText("Health: 13,000");
        strength.setText("Strength: 780");
        weakness.setText("Weakness: Greatswords, Machinery, Fire, Light");
        resistant.setText("Resistant: Lightning");
        playerLevel.setText("Recommended Player Level: 11 - 14");
        
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

        jPanel1 = new javax.swing.JPanel();
        bossName = new javax.swing.JLabel();
        health = new javax.swing.JLabel();
        strength = new javax.swing.JLabel();
        weakness = new javax.swing.JLabel();
        resistant = new javax.swing.JLabel();
        level = new javax.swing.JLabel();
        backToList = new javax.swing.JButton();
        playerLevel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        bossName.setFont(new java.awt.Font("Saved By Zero", 0, 18)); // NOI18N
        bossName.setText("Boss Name");

        health.setText("health: ");

        strength.setText("strength:");

        weakness.setText("weakness:");

        resistant.setText("resistant:");

        level.setText("level: ");

        backToList.setBackground(new java.awt.Color(0, 153, 204));
        backToList.setText("back to list");
        backToList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToListActionPerformed(evt);
            }
        });

        playerLevel.setText("recommended player level:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backToList)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(level)
                            .addComponent(health)
                            .addComponent(strength)
                            .addComponent(weakness)
                            .addComponent(resistant)
                            .addComponent(playerLevel))
                        .addGap(131, 131, 131))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(bossName)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bossName)
                    .addComponent(backToList))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(level)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(health)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(strength)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(weakness)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resistant)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerLevel)
                .addGap(34, 34, 34))
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

        pack();
    }// </editor-fold>                        
     
    private void backToListActionPerformed(java.awt.event.ActionEvent evt) {                                           
       /**
        * the following code will move the user back to the boss selection
        * menu for them to pick another boss
        */
        this.setVisible(false);
        new FinalFantasyXVBossList().setVisible(true);
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
            java.util.logging.Logger.getLogger(FinalFantasyXVBoss1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinalFantasyXVBoss1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinalFantasyXVBoss1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinalFantasyXVBoss1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinalFantasyXVBoss1().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton backToList;
    private javax.swing.JLabel bossName;
    private javax.swing.JLabel health;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel level;
    private javax.swing.JLabel playerLevel;
    private javax.swing.JLabel resistant;
    private javax.swing.JLabel strength;
    private javax.swing.JLabel weakness;
    // End of variables declaration                   
}
