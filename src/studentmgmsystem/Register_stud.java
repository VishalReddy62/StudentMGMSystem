/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmgmsystem;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Rutu
 */
public class Register_stud extends javax.swing.JFrame {

    /**
     * Creates new form Register_stud
     */
    Connection con;
    PreparedStatement pre,pr;
    
    public Register_stud() {
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
        rn = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        an = new javax.swing.JTextField();
        sn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sex = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        mn = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        di = new javax.swing.JComboBox();
        yoa = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        add = new javax.swing.JTextArea();
        sub = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        st = new javax.swing.JComboBox();
        ca = new javax.swing.JComboBox();
        dob = new com.toedter.calendar.JDateChooser();
        mb = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register");
        setBackground(new java.awt.Color(102, 255, 204));
        setForeground(new java.awt.Color(51, 255, 51));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ENTER INFORMATION OF STUDENT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Rockwell", 1, 18), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 0, 255));

        rn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rnActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 0, 255));
        jLabel11.setText("Gender");

        jLabel10.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 255));
        jLabel10.setText("Adhar NO");

        an.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 255));
        jLabel3.setText("Student Name");

        sex.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        sex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Gender", "Female", "Male" }));
        sex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 255));
        jLabel2.setText("Roll No");

        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });

        mn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 255));
        jLabel6.setText("Date Of Birth");

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 255));
        jLabel5.setText("Mother Name");

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 255));
        jLabel4.setText("Father Name");

        jLabel13.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 0, 255));
        jLabel13.setText("Standard");

        jLabel14.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 0, 255));
        jLabel14.setText("Division");

        jLabel9.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 255));
        jLabel9.setText("Year Of Admission");

        jLabel7.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 255));
        jLabel7.setText("Category");

        di.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Division", "A", "B", "C", "D", "E" }));
        di.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diActionPerformed(evt);
            }
        });

        yoa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Year", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2025", "2026", "2027", "2028", "2029", "2030" }));
        yoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yoaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 255));
        jLabel8.setText("Address");

        add.setColumns(20);
        add.setRows(5);
        jScrollPane1.setViewportView(add);

        sub.setBackground(new java.awt.Color(204, 255, 204));
        sub.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        sub.setForeground(new java.awt.Color(204, 0, 51));
        sub.setText("Submit");
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 255, 153));
        jButton2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 51));
        jButton2.setText("Clear");

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 0, 51));
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        st.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        st.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Standard", "Nursary", "LKG", "UKG", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        st.setSelectedItem(st);
        st.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stActionPerformed(evt);
            }
        });

        ca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Category", "OPEN", "SC", "ST", "OBC", "NT", "NT-B", "NT-C", "NT-D" }));
        ca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caActionPerformed(evt);
            }
        });

        mb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 0, 255));
        jLabel15.setText("Mobile No");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(56, 56, 56)
                                    .addComponent(sex, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(56, 56, 56)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(mn)
                                        .addComponent(sn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                                        .addComponent(rn, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(an, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fn, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dob, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(mb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 82, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(di, 0, 153, Short.MAX_VALUE)
                                        .addComponent(yoa, 0, 153, Short.MAX_VALUE)
                                        .addComponent(st, 0, 153, Short.MAX_VALUE)
                                        .addComponent(ca, 0, 153, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(di, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(an, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ca, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sex, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yoa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(dob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jSeparator1.setBackground(new java.awt.Color(255, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 0, 0));

        jSeparator2.setBackground(new java.awt.Color(255, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(255, 0, 0));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("S.S. NIKAM ENGLISH SCHOOL, LONERE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(526, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(421, 421, 421))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rnActionPerformed

    private void anActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anActionPerformed

    private void sexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexActionPerformed

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnActionPerformed

    private void mnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnActionPerformed

    private void diActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diActionPerformed

    private void yoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yoaActionPerformed

    public void clr()
    {
        sn.setText("");
                rn.setText("");
                an.setText("");
                sex.setToolTipText("Select Gender");
                fn.setText("");
                mn.setText(null);
                mb.setText(null);
                dob.setDate(null);
                st.setToolTipText(null);
                di.setToolTipText(null);
                yoa.setToolTipText(null);
                yoa.setToolTipText(null);
                add.setText(null);

    }
    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
        db d=new db();
        try
        {
            //dob.setDateFormatString("dd/mm/yyyy");
            if(sn.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this,"PLEASE ENTER STUDENT NAME..");
            }
             if(rn.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this,"PLEASE ENTER STUDENT ROLL NUMBER..");
            }
              if(an.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this,"PLEASE ENTER STUDENT ADHAR NUMBER..");
            }
               if(fn.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this,"PLEASE ENTER STUDENT FATHER NAME..");
            }
                if(mn.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this,"PLEASE ENTER STUDENT NAME..");
            }
                 if(dob.getDate().equals(""))
            {
                JOptionPane.showMessageDialog(this,"PLEASE ENTER STUDENT NAME..");
            }
                  if(st.getSelectedItem().equals("Select Standard"))
            {
                JOptionPane.showMessageDialog(this,"PLEASE PLEASE KINDLY SELECT STANDARD..");
            }
                   if(di.getSelectedItem().equals("Select Division"))
            {
                JOptionPane.showMessageDialog(this,"PLEASE SELECT DIVISION..");
            }
                    if(yoa.getSelectedItem().equals("Select Category"))
            {
                JOptionPane.showMessageDialog(this,"PLEASE SELECT CATEGORY..");
            }
                     if(yoa.getSelectedItem().equals("Select Year"))
            {
                JOptionPane.showMessageDialog(this,"PLEASE ENTER YEAR OF ADMISSION..");
            }
                      if(add.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this,"PLEASE ENTER STUDENT ADDRESS..");
            }
                       if(sex.getSelectedItem().equals("Select Gender"))
            {
                JOptionPane.showMessageDialog(this,"PLEASE ENTER STUDENT'S GENDER..");
            }
                       
                       
                   
            con=d.getconnection();
            pre=con.prepareStatement("insert into resstudent values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pre.setString(1,sn.getText().toUpperCase());
            pre.setString(2,rn.getText());
            pre.setString(3,an.getText());
            pre.setString(4, sex.getSelectedItem().toString());
            pre.setString(5,fn.getText().toUpperCase());
            pre.setString(6, mn.getText());
            pre.setString(7,dob.getDate().toLocaleString());
            pre.setString(8,mb.getText());
            pre.setString(9,st.getSelectedItem().toString());
            pre.setString(10, di.getSelectedItem().toString());
            pre.setString(11, ca.getSelectedItem().toString());
            pre.setString(12,yoa.getSelectedItem().toString());
            pre.setString(13,add.getText());
            ResultSet rs=pre.executeQuery();
            
            if(rs.next())
            {
                JOptionPane.showMessageDialog(null,"DATA INSERTED...!!!!");
               
            }
            
            //backup table
            pr=con.prepareStatement("insert into register_stud_backup values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pr.setString(1,sn.getText().toUpperCase());
            pr.setString(2,rn.getText());
            pr.setString(3,an.getText());
            pr.setString(4, sex.getSelectedItem().toString());
            pr.setString(5,fn.getText());
            pr.setString(6, mn.getText());
            pr.setString(7,dob.getDate().toLocaleString());
            pr.setString(8,mb.getText());
            pr.setString(9,st.getSelectedItem().toString());
            pr.setString(10, di.getSelectedItem().toString());
            pr.setString(11, ca.getSelectedItem().toString());
            pr.setString(12,yoa.getSelectedItem().toString());
            pr.setString(13,add.getText());

            ResultSet rs1=pr.executeQuery();
            if(rs1.next())
            {
                
                    JOptionPane.showMessageDialog(null,"DATA DUPLICATED USE ANOTHER TABLE.....!!!!");
            }     
        }
            
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        clr();
        // TODO add your handling code here:
    }//GEN-LAST:event_subActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        hodoption ln=new hodoption();
        ln.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void stActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stActionPerformed

    private void caActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caActionPerformed

    private void mbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mbActionPerformed

    /**
     * @param args the command line arguments
     */
    public void Register_stud() {
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
            java.util.logging.Logger.getLogger(Register_stud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_stud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_stud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_stud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_stud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea add;
    private javax.swing.JTextField an;
    private javax.swing.JComboBox ca;
    private javax.swing.JComboBox di;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTextField fn;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField mb;
    private javax.swing.JTextField mn;
    private javax.swing.JTextField rn;
    private javax.swing.JComboBox sex;
    private javax.swing.JTextField sn;
    private javax.swing.JComboBox st;
    private javax.swing.JButton sub;
    private javax.swing.JComboBox yoa;
    // End of variables declaration//GEN-END:variables
}
