/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UniEnrolmentProgram;

import javax.swing.JOptionPane;

/**
 *
 * @author linh
 */
public class GUIEditStudent extends javax.swing.JFrame {
    

    /**
     * Creates new customizer GUIAddStudent
     */
    private UniversityAdmin admin;
    private Student student;
    public GUIEditStudent(UniversityAdmin admin,Student student) {
        this.admin=admin;
        this.student=student;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        studentNameText = new javax.swing.JTextField();
        courseIDText = new javax.swing.JTextField();
        internationalButton = new javax.swing.JRadioButton();
        domesticButton = new javax.swing.JRadioButton();
        internationalPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        countryText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        agentText = new javax.swing.JTextField();
        domesticPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cityText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TFNText = new javax.swing.JTextField();
        editButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jPanel2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel2ComponentShown(evt);
            }
        });

        jLabel1.setText("Student Name");

        jLabel2.setText("Course Code");

        jLabel3.setText("Student Type");

        studentNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentNameTextActionPerformed(evt);
            }
        });

        courseIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseIDTextActionPerformed(evt);
            }
        });

        buttonGroup1.add(internationalButton);
        internationalButton.setText("International");
        internationalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                internationalButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(domesticButton);
        domesticButton.setText("Domestic");
        domesticButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                domesticButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Country");

        countryText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryTextActionPerformed(evt);
            }
        });

        jLabel5.setText("Agent");

        javax.swing.GroupLayout internationalPanelLayout = new javax.swing.GroupLayout(internationalPanel);
        internationalPanel.setLayout(internationalPanelLayout);
        internationalPanelLayout.setHorizontalGroup(
            internationalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(internationalPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(internationalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(internationalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(agentText, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                    .addComponent(countryText))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        internationalPanelLayout.setVerticalGroup(
            internationalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(internationalPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(internationalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(countryText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(internationalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(agentText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setText("City");

        cityText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityTextActionPerformed(evt);
            }
        });

        jLabel7.setText("TFN");

        javax.swing.GroupLayout domesticPanelLayout = new javax.swing.GroupLayout(domesticPanel);
        domesticPanel.setLayout(domesticPanelLayout);
        domesticPanelLayout.setHorizontalGroup(
            domesticPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(domesticPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(domesticPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(domesticPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TFNText, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                    .addComponent(cityText))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        domesticPanelLayout.setVerticalGroup(
            domesticPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(domesticPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(domesticPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(domesticPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TFNText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        editButton.setText("Save");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel8.setText("Edit Student Information");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(internationalButton)
                                        .addGap(38, 38, 38)
                                        .addComponent(domesticButton))
                                    .addComponent(courseIDText)
                                    .addComponent(studentNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(domesticPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(internationalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(92, 92, 92))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(studentNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editButton)
                        .addGap(2, 2, 2)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(courseIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(internationalButton)
                    .addComponent(domesticButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(internationalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(domesticPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add Student", jPanel2);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void studentNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentNameTextActionPerformed

    private void courseIDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseIDTextActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_courseIDTextActionPerformed

    private void internationalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_internationalButtonActionPerformed
        // TODO add your handling code here:
        internationalPanel.setVisible(true);
        domesticPanel.setVisible(false);
    }//GEN-LAST:event_internationalButtonActionPerformed

    private void domesticButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_domesticButtonActionPerformed
        // TODO add your handling code here:
        internationalPanel.setVisible(false);
        domesticPanel.setVisible(true);
    }//GEN-LAST:event_domesticButtonActionPerformed

    private void countryTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countryTextActionPerformed

    private void cityTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityTextActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        String name = this.studentNameText.getText();
        student.setName(name);
        if(this.internationalButton.isSelected())
        {
            String country = this.countryText.getText();
            String agent = this.agentText.getText();
            student.setCountry(country);
            student.setAgent(agent);
            JOptionPane.showMessageDialog(null, "Detail changed!");
        } else
        {
            String city = this.cityText.getText();
            try
            {
            Long TFN = Long.parseLong(this.TFNText.getText());
            student.setTFN(TFN);
            } catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Please enter long only");
                return;
            }
            student.setCity(city);
            JOptionPane.showMessageDialog(null, "Detail changed!");
            this.hide();
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void jPanel2ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel2ComponentShown
        // TODO add your handling code here:
        studentNameText.setText(student.getName());
        courseIDText.setText(student.getCourseID(student.getUsername(), student.getPassword())+"");
        courseIDText.setEnabled(false);
        if(student instanceof InternationalStudent)
        {
            internationalButton.setSelected(true);
            internationalButton.setEnabled(false);
            domesticButton.setEnabled(false);
            internationalPanel.setVisible(true);
            domesticPanel.setVisible(false);
            countryText.setText(student.getCountry());
            agentText.setText(student.getAgent());
        } else
        {
            domesticButton.setSelected(true);
            internationalButton.setEnabled(false);
            domesticButton.setEnabled(false);
            internationalPanel.setVisible(false);
            domesticPanel.setVisible(true);
            cityText.setText(student.getCity());
            TFNText.setText(student.getTFN()+"");
        }
    }//GEN-LAST:event_jPanel2ComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TFNText;
    private javax.swing.JTextField agentText;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cityText;
    private javax.swing.JTextField countryText;
    private javax.swing.JTextField courseIDText;
    private javax.swing.JRadioButton domesticButton;
    private javax.swing.JPanel domesticPanel;
    private javax.swing.JButton editButton;
    private javax.swing.JRadioButton internationalButton;
    private javax.swing.JPanel internationalPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField studentNameText;
    // End of variables declaration//GEN-END:variables
}