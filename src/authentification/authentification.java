//declarations
package authentification;
import javax.swing.JOptionPane;
import TabDeBord.TabDeBord;
import TabDeBord.TabDeBordEtudiant;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wassim
 */
public class authentification extends javax.swing.JFrame {
java.sql.Connection conn = null;
ResultSet rs = null;
Statement st;
    /**
     * Creates new form authentification
     */
    public authentification() {
        initComponents();
    }
        String Item;//avoir le contenu de liste déroulante
        String util;//avoir le contenu de champs utilisateur pur vérification CONNEXION
        String mdp;// avoir le contenu de champs mot de passe pur vérification CONNEXION
        int nbressais=1;// variable stock le nombre d'essais de connexion
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        authentification = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Jbuttonconnexion = new javax.swing.JButton();
        Jbuttoneffacer = new javax.swing.JButton();
        DepMI = new javax.swing.JLabel();
        jTextmotdepasse = new javax.swing.JPasswordField();
        jTextutilisateur = new javax.swing.JTextField();
        JlabelGRN = new javax.swing.JLabel();
        Jbuttoneffacer1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabelauthent = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("S'authentifier");
        setBackground(new java.awt.Color(204, 204, 204));

        authentification.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/authentification/images.png"))); // NOI18N

        Jbuttonconnexion.setText("CONNEXION");
        Jbuttonconnexion.setToolTipText("Connexion");
        Jbuttonconnexion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jbuttonconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbuttonconnexionActionPerformed(evt);
            }
        });

        Jbuttoneffacer.setText("EFFACER");
        Jbuttoneffacer.setToolTipText("Effacer");
        Jbuttoneffacer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jbuttoneffacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbuttoneffacerActionPerformed(evt);
            }
        });

        DepMI.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        DepMI.setForeground(new java.awt.Color(102, 102, 102));
        DepMI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DepMI.setText("Departement MI Alger1");

        jTextmotdepasse.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextmotdepasse.setToolTipText("mot de passe");
        jTextmotdepasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextmotdepasseActionPerformed(evt);
            }
        });

        jTextutilisateur.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextutilisateur.setToolTipText("utilisateur");
        jTextutilisateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextutilisateurActionPerformed(evt);
            }
        });
        jTextutilisateur.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextutilisateurKeyTyped(evt);
            }
        });

        JlabelGRN.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JlabelGRN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlabelGRN.setText("Gestion des Reclamations des Etudiant Département MI Alger 1");

        Jbuttoneffacer1.setText("AIDE");
        Jbuttoneffacer1.setToolTipText("Aide");
        Jbuttoneffacer1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jbuttoneffacer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbuttoneffacer1ActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Utilisateur :");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Mot de passe:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Si vous dépassez le nombre d'essai de connexion (3) l'aplication va étre fermé !");

        jLabelauthent.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelauthent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelauthent.setText("S'authentifier");

        jComboBox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Etudiant", "Secrétariat" }));
        jComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout authentificationLayout = new javax.swing.GroupLayout(authentification);
        authentification.setLayout(authentificationLayout);
        authentificationLayout.setHorizontalGroup(
            authentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JlabelGRN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(authentificationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(authentificationLayout.createSequentialGroup()
                .addGroup(authentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(authentificationLayout.createSequentialGroup()
                        .addGap(447, 447, 447)
                        .addComponent(jTextutilisateur, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(authentificationLayout.createSequentialGroup()
                        .addGap(448, 448, 448)
                        .addComponent(jTextmotdepasse, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabelauthent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(authentificationLayout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addGroup(authentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(authentificationLayout.createSequentialGroup()
                        .addComponent(Jbuttoneffacer, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(Jbuttonconnexion))
                    .addGroup(authentificationLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(Jbuttoneffacer1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, authentificationLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(authentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DepMI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1051, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, authentificationLayout.createSequentialGroup()
                        .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(465, 465, 465))))
        );
        authentificationLayout.setVerticalGroup(
            authentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(authentificationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JlabelGRN)
                .addGap(20, 20, 20)
                .addComponent(jLabelauthent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextutilisateur, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextmotdepasse, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(authentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jbuttonconnexion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbuttoneffacer, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Jbuttoneffacer1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(DepMI)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(authentification, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(authentification, javax.swing.GroupLayout.PREFERRED_SIZE, 674, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextutilisateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextutilisateurActionPerformed
        
    }//GEN-LAST:event_jTextutilisateurActionPerformed

    private void JbuttonconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbuttonconnexionActionPerformed
        //declaration de variable 
        util=jTextutilisateur.getText();     //getText() stocket le text da textfield  
        mdp=jTextmotdepasse.getText();
        Item=jComboBox.getSelectedItem().toString(); //stocket le text de la liste deroulante
    try {
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/BD","mialger1","mialger1");//connection ala base de donnée
            st=(Statement)conn.createStatement();
            if(Item.equals("Etudiant"))// si etudiant
            rs=st.executeQuery("select * from STUDENTS");
                if(Item.equals("Secrétariat"))  //si secritaire
                rs=st.executeQuery("select * from USERS");
                    while(rs.next()){ // parcourir la table de bdd ligne par ligne tant le next element est différent de null
                        if(rs.getString(1).equals(util) && rs.getString(2).equals(mdp)){// test d'égalité entre le champs user et mdp avec la 1ére coloumn de la tables USER qui corréspond a le nom d'utilisateur avec la deuxiem qui correspond au mot de passe ce ce utilisateur
                        if(Item.equals("Etudiant")){// si etudiant
                        TabDeBordEtudiant tab = new TabDeBordEtudiant();
                        tab.setVisible(true);}//affichage
                        if(Item.equals("Secrétariat")){//si secritaire
                        TabDeBord tab = new TabDeBord();
                        tab.setVisible(true);}//affichage
                        dispose();// fermer la fenetre
                        return;//sortir de bloc try catch
                }}
                if(util.equals("") || mdp.equals("")){//warning 
                    JOptionPane.showMessageDialog(null,"Veuillez Rentrez des Informations Valide !","Erreur",JOptionPane.WARNING_MESSAGE);
                    }else{            
                        if(nbressais!=3){//nombre d'essais
                            nbressais++;
                            JOptionPane.showMessageDialog(null,"l'utilisateur et/ou le mot de passe que vous avez indiqué est faux ! \n il vous reste "+(4-nbressais)+" essaies","Erreur",JOptionPane.WARNING_MESSAGE);
                            jTextutilisateur.setText("");//reset
                            jTextmotdepasse.setText("");//reset
                                }else{
                                System.exit(0);//Fermer le systéme lors de le troisiéme essai
                                }
                    }
                }
    
     catch (SQLException ex) {
        Logger.getLogger(authentification.class.getName()).log(Level.SEVERE, null, ex);
    } 
    }//GEN-LAST:event_JbuttonconnexionActionPerformed

    private void jTextmotdepasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextmotdepasseActionPerformed
       
    }//GEN-LAST:event_jTextmotdepasseActionPerformed

    private void JbuttoneffacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbuttoneffacerActionPerformed
    jTextutilisateur.setText("");//reset
    jTextmotdepasse.setText("");//reset
    }//GEN-LAST:event_JbuttoneffacerActionPerformed

    private void Jbuttoneffacer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbuttoneffacer1ActionPerformed
        Aide aide = new Aide();//création JFrame aide
        aide.setVisible(true);//affichage
    }//GEN-LAST:event_Jbuttoneffacer1ActionPerformed

    private void jTextutilisateurKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextutilisateurKeyTyped

    }//GEN-LAST:event_jTextutilisateurKeyTyped

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
            java.util.logging.Logger.getLogger(authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new authentification().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DepMI;
    private javax.swing.JButton Jbuttonconnexion;
    private javax.swing.JButton Jbuttoneffacer;
    private javax.swing.JButton Jbuttoneffacer1;
    private javax.swing.JLabel JlabelGRN;
    private javax.swing.JPanel authentification;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelauthent;
    private javax.swing.JPasswordField jTextmotdepasse;
    private javax.swing.JTextField jTextutilisateur;
    // End of variables declaration//GEN-END:variables
}
