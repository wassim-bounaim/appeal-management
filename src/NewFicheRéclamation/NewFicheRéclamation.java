//declarations
package NewFicheRéclamation;
import TabDeBord.TabDeBord;
import java.awt.event.KeyEvent;

import java.awt.print.PrinterException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author wassim
 */
public class NewFicheRéclamation extends javax.swing.JFrame {
    java.sql.Connection conn = null;
    /**
     * Creates new form NewFicheRéclamation
     */
    public NewFicheRéclamation() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldNom = new javax.swing.JTextField();
        jTextFieldGroupe = new javax.swing.JTextField();
        jTextFieldPrénom = new javax.swing.JTextField();
        jTextFieldMatricule = new javax.swing.JTextField();
        jTextFieldMatiére = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        FicheDeRéclamation = new javax.swing.JTextArea();
        jTextFieldenseignant = new javax.swing.JTextField();
        jTextFieldréel = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArearemarks = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArearéponse = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaarguments = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldaffichée = new javax.swing.JTextField();
        jComboBoxNiveau = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldenseignant1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ajouter une Nouvelle Fiche");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ajouter une Réclamation de Note");

        jSeparator1.setBackground(new java.awt.Color(102, 102, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 102, 102));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Prénom");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Groupe");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Nom");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Matiére");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Matricule");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Date");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Note Réel");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Nom de l'enseignat (e)");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Remarques");

        jTextFieldNom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextFieldNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNomKeyTyped(evt);
            }
        });

        jTextFieldGroupe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextFieldGroupe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldGroupeKeyTyped(evt);
            }
        });

        jTextFieldPrénom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextFieldPrénom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPrénomKeyTyped(evt);
            }
        });

        jTextFieldMatricule.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextFieldMatricule.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldMatriculeKeyTyped(evt);
            }
        });

        jTextFieldMatiére.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextFieldMatiére.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldMatiéreKeyTyped(evt);
            }
        });

        FicheDeRéclamation.setColumns(20);
        FicheDeRéclamation.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        FicheDeRéclamation.setRows(5);
        jScrollPane1.setViewportView(FicheDeRéclamation);

        jTextFieldenseignant.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextFieldenseignant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldenseignantKeyTyped(evt);
            }
        });

        jTextFieldréel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextFieldréel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldréelActionPerformed(evt);
            }
        });
        jTextFieldréel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldréelKeyTyped(evt);
            }
        });

        jTextArearemarks.setColumns(20);
        jTextArearemarks.setRows(5);
        jTextArearemarks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane2.setViewportView(jTextArearemarks);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Réponse administrative");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Arguments et Remarques");

        jTextArearéponse.setColumns(20);
        jTextArearéponse.setRows(5);
        jTextArearéponse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane3.setViewportView(jTextArearéponse);

        jTextAreaarguments.setColumns(20);
        jTextAreaarguments.setRows(5);
        jTextAreaarguments.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane4.setViewportView(jTextAreaarguments);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Niveau");

        jTextFieldaffichée.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextFieldaffichée.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldaffichéeActionPerformed(evt);
            }
        });
        jTextFieldaffichée.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldaffichéeKeyTyped(evt);
            }
        });

        jComboBoxNiveau.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "L1", "L2", "L3", "M1", "M2" }));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Note Affichée");

        jTextFieldenseignant1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel13)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(13, 13, 13)))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldenseignant, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldenseignant1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(jTextFieldMatiére, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldréel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                                .addComponent(jTextFieldGroupe, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(56, 56, 56)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel6))
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldPrénom)
                                            .addComponent(jTextFieldMatricule, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(jLabel18)
                                                .addGap(31, 31, 31))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBoxNiveau, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldaffichée, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(22, 22, 22)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldPrénom, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldMatricule, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldGroupe, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldMatiére, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxNiveau, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jTextFieldréel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldaffichée, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTextFieldenseignant, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextFieldenseignant1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                        .addComponent(jSeparator1))))
        );

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Imprimer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("Effacer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("Génerer une fiche");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setText("Retour");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Enregistrer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(70, 70, 70))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldréelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldréelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldréelActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            FicheDeRéclamation.print();//fonction d'impression
        } catch (PrinterException ex) {
            Logger.getLogger(NewFicheRéclamation.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(JOptionPane.showConfirmDialog(null,"Voulez Vous Retourner ? tout les informations vont etre effacées","Retour",JOptionPane.YES_NO_OPTION)==
                JOptionPane.YES_NO_OPTION)//warning de retour
        {        
            TabDeBord tab = new TabDeBord();//créer la page de retour (le tableau de bord)
        dispose();//fermer  fenetre courante
        tab.setVisible(true);}
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //vider tout les champs
        jTextFieldNom.setText("");
        jTextFieldPrénom.setText("");
        jTextFieldMatricule.setText("");
        jTextFieldGroupe.setText("");
        jTextFieldMatiére.setText("");
        jTextFieldréel.setText("");
        jTextFieldaffichée.setText("");
        jTextFieldenseignant.setText("");
        jTextArearemarks.setText("");
        jTextArearéponse.setText("");
        jTextAreaarguments.setText("");
        FicheDeRéclamation.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //generation d'une fiche de réclamation papier A4
        FicheDeRéclamation.setText("");
        FicheDeRéclamation.append("\t             Université Benyoucef Benkhedda-Alger 1 \n"
                + "\t\tFaculté des Sciences \n"
                + "\t           Département de Mathématiques et Informatique\n\n"
                + "\t               Recours de rectification d’une note\n\n"
                + " Nom : "+jTextFieldNom.getText()+"\t Prénom : "+jTextFieldPrénom.getText() + "\n\n"
                +" Groupe : "+ jTextFieldGroupe.getText()+"\t Matricule : "+jTextFieldMatricule.getText() + "\n\n"
                +"                    Matiére : "+ jTextFieldMatiére.getText()+"\n\n"
                + " Note Réel : "+jTextFieldréel.getText()+"\t Note Affichée : "+jTextFieldaffichée.getText() + "\n\n"
                + " Nom de l'enseignant : "+jTextFieldenseignant.getText() +"\n\n"
                +"\t\t\t Signature de l'étudiants : \n\n\n\n\n"
                        
                        
                        +"Remarques :"+jTextArearemarks.getText()
                        
                        +"\n\n\n\n"
                
                        +"Réponse administratif : "+jTextArearéponse.getText()

                
                        +"\n\n\n\n"
                
                        +"Réponse administratif :"+jTextAreaarguments.getText());
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextFieldaffichéeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldaffichéeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldaffichéeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try {
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/BD","mialger1","mialger1");//connection ala base de donnée
            PreparedStatement st = conn.prepareStatement("insert into FICHES (NOM,PRENOM,GROUPE,MATRICULE,MATIERE,NIVEAU,ENSEIGNANT,REMARQUES,REPONSE,ARGMNTS,NOTEAFFICHE,NOTEREEL,DATE)values(?,?,?,?,?,?,?,?,?,?,?,?,?)");// inserer dans la base de donnée
           //inserer dans la base de donnée
            st.setString(1,jTextFieldNom.getText());
            st.setString(2,jTextFieldPrénom.getText());
            st.setString(3,jTextFieldGroupe.getText());
            st.setString(4,jTextFieldMatricule.getText());
            st.setString(5,jTextFieldMatiére.getText());
            st.setString(6,jComboBoxNiveau.getSelectedItem().toString());
            st.setString(7,jTextFieldenseignant.getText());
            st.setString(8,jTextArearemarks.getText());
            st.setString(9,jTextArearéponse.getText());
            st.setString(10,jTextAreaarguments.getText());
            st.setString(11,jTextFieldaffichée.getText());
            st.setString(12,jTextFieldréel.getText());
            st.setString(13,jTextFieldenseignant1.getText());
            
                if(JOptionPane.showConfirmDialog(null,"Voullez Vous Ajouter ?","Ajouter",JOptionPane.WARNING_MESSAGE)==JOptionPane.YES_NO_OPTION){
                    st.executeUpdate();//executer l'insertion dans la base de donnée
                        //vider les champs
                    jTextFieldNom.setText("");
                    jTextFieldPrénom.setText("");
                    jTextFieldMatricule.setText("");
                    jTextFieldGroupe.setText("");
                    jTextFieldMatiére.setText("");
                    jTextFieldréel.setText("");
                    jTextFieldaffichée.setText("");
                    jTextFieldenseignant.setText("");
                    jTextFieldenseignant1.setText("");                                    
                
                }

        }
        
        catch (SQLException ex) {
            Logger.getLogger(NewFicheRéclamation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldGroupeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldGroupeKeyTyped
                char c =evt.getKeyChar();
        if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE)){
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_jTextFieldGroupeKeyTyped

    private void jTextFieldMatriculeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMatriculeKeyTyped
                char c =evt.getKeyChar();
        if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE)){
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_jTextFieldMatriculeKeyTyped

    private void jTextFieldaffichéeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldaffichéeKeyTyped
                char c =evt.getKeyChar();
        if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE)){
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_jTextFieldaffichéeKeyTyped

    private void jTextFieldréelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldréelKeyTyped
                char c =evt.getKeyChar();
        if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE)){
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_jTextFieldréelKeyTyped

    private void jTextFieldNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomKeyTyped
                char c =evt.getKeyChar();
        if(!(Character.isAlphabetic(c)) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE)){
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNomKeyTyped

    private void jTextFieldPrénomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPrénomKeyTyped
                        char c =evt.getKeyChar();
        if(!(Character.isAlphabetic(c)) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE)){
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_jTextFieldPrénomKeyTyped

    private void jTextFieldMatiéreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMatiéreKeyTyped
                        char c =evt.getKeyChar();
        if(!(Character.isAlphabetic(c)) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE)){
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_jTextFieldMatiéreKeyTyped

    private void jTextFieldenseignantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldenseignantKeyTyped
                        char c =evt.getKeyChar();
        if(!(Character.isAlphabetic(c)) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE)){
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_jTextFieldenseignantKeyTyped

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
            java.util.logging.Logger.getLogger(NewFicheRéclamation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewFicheRéclamation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewFicheRéclamation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewFicheRéclamation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new NewFicheRéclamation().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea FicheDeRéclamation;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBoxNiveau;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextAreaarguments;
    private javax.swing.JTextArea jTextArearemarks;
    private javax.swing.JTextArea jTextArearéponse;
    private javax.swing.JTextField jTextFieldGroupe;
    private javax.swing.JTextField jTextFieldMatiére;
    private javax.swing.JTextField jTextFieldMatricule;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JTextField jTextFieldPrénom;
    private javax.swing.JTextField jTextFieldaffichée;
    private javax.swing.JTextField jTextFieldenseignant;
    private javax.swing.JTextField jTextFieldenseignant1;
    private javax.swing.JTextField jTextFieldréel;
    // End of variables declaration//GEN-END:variables
}
