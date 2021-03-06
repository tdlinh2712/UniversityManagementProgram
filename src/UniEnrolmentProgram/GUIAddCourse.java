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
public class GUIAddCourse extends javax.swing.JFrame  {
    
    

    /**
     * Creates new customizer GUIAddCourse
     */
    private UniversityAdmin admin;
    public GUIAddCourse(UniversityAdmin admin) {
        this.admin=admin;
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
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        courseNameText = new javax.swing.JTextField();
        onCampusButton = new javax.swing.JRadioButton();
        onlineButton = new javax.swing.JRadioButton();
        onlinePanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        courseURLText = new javax.swing.JTextField();
        onCampusPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        campusText = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        discountText = new javax.swing.JTextField();
        sessionText = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        addCourseButton = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jLabel8.setText("Course Name");

        jLabel10.setText("Course Type");

        courseNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseNameTextActionPerformed(evt);
            }
        });

        buttonGroup1.add(onCampusButton);
        onCampusButton.setText("On Campus");
        onCampusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onCampusButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(onlineButton);
        onlineButton.setText("Online");
        onlineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onlineButtonActionPerformed(evt);
            }
        });

        jLabel11.setText("URL");

        courseURLText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseURLTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout onlinePanelLayout = new javax.swing.GroupLayout(onlinePanel);
        onlinePanel.setLayout(onlinePanelLayout);
        onlinePanelLayout.setHorizontalGroup(
            onlinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(onlinePanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(courseURLText, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        onlinePanelLayout.setVerticalGroup(
            onlinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(onlinePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(onlinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(courseURLText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel13.setText("Campus");

        campusText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campusTextActionPerformed(evt);
            }
        });

        jLabel14.setText("Session");

        jLabel16.setText("Discount Rate");

        discountText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discountTextActionPerformed(evt);
            }
        });

        sessionText.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AUTUMN", "SPRING", "SUMMER" }));
        sessionText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sessionTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout onCampusPanelLayout = new javax.swing.GroupLayout(onCampusPanel);
        onCampusPanel.setLayout(onCampusPanelLayout);
        onCampusPanelLayout.setHorizontalGroup(
            onCampusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(onCampusPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(onCampusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(onCampusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(onCampusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(discountText, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                        .addComponent(campusText))
                    .addComponent(sessionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        onCampusPanelLayout.setVerticalGroup(
            onCampusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(onCampusPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(onCampusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(campusText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(onCampusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(sessionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(onCampusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(discountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 3, 36)); // NOI18N
        jLabel1.setText("Add A New Course");

        addCourseButton.setText("Add");
        addCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCourseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(onCampusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(onlinePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(51, 51, 51)
                                        .addComponent(courseNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(51, 51, 51)
                                        .addComponent(onCampusButton)
                                        .addGap(38, 38, 38)
                                        .addComponent(onlineButton)
                                        .addGap(58, 58, 58)))
                                .addGap(23, 23, 23)
                                .addComponent(addCourseButton)))))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(courseNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(onCampusButton)
                            .addComponent(onlineButton)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(addCourseButton)))
                .addGap(18, 18, 18)
                .addComponent(onlinePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(onCampusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        add(jPanel5, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void courseNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseNameTextActionPerformed

    private void onCampusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onCampusButtonActionPerformed
        // TODO add your handling code here:
        this.onlinePanel.setVisible(false);
        this.onCampusPanel.setVisible(true);
    }//GEN-LAST:event_onCampusButtonActionPerformed

    private void onlineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onlineButtonActionPerformed
        // TODO add your handling code here:
        this.onlinePanel.setVisible(true);
        this.onCampusPanel.setVisible(false);
    }//GEN-LAST:event_onlineButtonActionPerformed

    private void courseURLTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseURLTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseURLTextActionPerformed

    private void campusTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campusTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campusTextActionPerformed

    private void discountTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discountTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discountTextActionPerformed

    private void sessionTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sessionTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sessionTextActionPerformed

    private void addCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCourseButtonActionPerformed
        // TODO add your handling code here:
        String courseName = this.courseNameText.getText();
        Course course=null;
        if(this.onlineButton.isSelected())
        {
            String url = this.courseURLText.getText();
            course = new OnlineCourse(courseName,url);

        } else if(this.onCampusButton.isSelected())
        {

            String campus = this.campusText.getText();
            Session session= Session.valueOf((String)this.sessionText.getSelectedItem());
            try
            {
                Double discount = Double.parseDouble(this.discountText.getText());
                course = new OnCampusCourse(courseName,campus,session,discount);
                if(discount>=1|discount<=0)
                {
                    JOptionPane.showMessageDialog(null, "Discount must be a number between 0 and 1");
                    return;
                }
            } catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Please enter a number only");
                return;
            }
        }
        if(admin.addCourse(admin.getUsername(),admin.getPassword(),course))
        {
            JOptionPane.showMessageDialog(null, "Course added to the system!");
        } else
        {
            JOptionPane.showMessageDialog(null, "FAILED to add course to the system!");
            this.hide();
        }

    }//GEN-LAST:event_addCourseButtonActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCourseButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField campusText;
    private javax.swing.JTextField courseNameText;
    private javax.swing.JTextField courseURLText;
    private javax.swing.JTextField discountText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton onCampusButton;
    private javax.swing.JPanel onCampusPanel;
    private javax.swing.JRadioButton onlineButton;
    private javax.swing.JPanel onlinePanel;
    private javax.swing.JComboBox<String> sessionText;
    // End of variables declaration//GEN-END:variables
}
