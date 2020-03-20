package studentform;

import java.sql.*;
import javax.swing.JOptionPane;
public class StudentForm extends javax.swing.JFrame {

    static Connection connection;
    static Statement stmt;
    
    public StudentForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lastname_field = new javax.swing.JTextField();
        lastname = new javax.swing.JLabel();
        id_label = new javax.swing.JLabel();
        id1 = new javax.swing.JTextField();
        middlename = new javax.swing.JLabel();
        middlename_field = new javax.swing.JTextField();
        firstname = new javax.swing.JLabel();
        firstname_field = new javax.swing.JTextField();
        birthyear = new javax.swing.JLabel();
        birthyear_field = new javax.swing.JTextField();
        birthyear1 = new javax.swing.JLabel();
        course_field = new javax.swing.JTextField();
        birthyear2 = new javax.swing.JLabel();
        yearlevel_field = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        display = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lastname_field.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        lastname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lastname.setText("Last Name:");

        id_label.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        id_label.setText("ID:");

        id1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        middlename.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        middlename.setText("Middle Name:");

        middlename_field.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        firstname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        firstname.setText("First Name:");

        firstname_field.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        birthyear.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        birthyear.setText("Birth Year:");

        birthyear_field.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        birthyear1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        birthyear1.setText("Course:");

        course_field.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        birthyear2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        birthyear2.setText("Year Level:");

        yearlevel_field.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        display.setText("Display");
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(save)
                        .addGap(37, 37, 37)
                        .addComponent(edit)
                        .addGap(45, 45, 45)
                        .addComponent(delete)
                        .addGap(42, 42, 42)
                        .addComponent(display))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(birthyear)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(birthyear_field, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(firstname)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(firstname_field, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lastname)
                                .addComponent(id_label))
                            .addGap(33, 33, 33)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lastname_field, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(birthyear1)
                                .addComponent(birthyear2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(course_field, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(yearlevel_field, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(middlename)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(middlename_field))))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastname)
                    .addComponent(lastname_field, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(middlename)
                    .addComponent(middlename_field, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstname)
                    .addComponent(firstname_field, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthyear)
                    .addComponent(birthyear_field, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthyear1)
                    .addComponent(course_field, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthyear2)
                    .addComponent(yearlevel_field, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(edit)
                    .addComponent(delete)
                    .addComponent(display))
                .addGap(26, 26, 26))
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
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        int id = Integer.parseInt(id1.getText());
        String lastname = lastname_field.getText();
        String middlename = middlename_field.getText();
        String firstname = firstname_field.getText();
        int birthyear = Integer.parseInt(birthyear_field.getText());
        String course = course_field.getText();
        int yearlevel = Integer.parseInt(yearlevel_field.getText());
         try{
         stmt.executeUpdate("INSERT INTO student " 
                 + "VALUES("+id1+","
                 +","+lastname+","
                 +","+middlename+","
                 +","+firstname+","
                 +","+birthyear+","
                 +","+course+","
                 +","+yearlevel+","
                 + ")");
        
         }catch(SQLException ex){}
    }//GEN-LAST:event_saveActionPerformed

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        try{
          ResultSet rs = stmt.executeQuery("SELECT * FROM student");
          while(rs.next()){
              int id = rs.getInt("id");
              String lastname = rs.getString("lastname");
              String middlename = rs.getString("middlename");
              String firstname = rs.getString("firstname");
              int birthyear = rs.getInt("birthyear");
              String course = rs.getString("course");
              int yearlevel = rs.getInt("yearlevel");
              
              System.out.println(id+"\t"
                      +lastname+"\t"
                      +middlename+"\t"
                      +firstname+"\t"
                      +birthyear+"\t"
                      +course+"\t"
                      +yearlevel+"\t");
          }
      }catch(SQLException e) {}
    }//GEN-LAST:event_displayActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
       int id = Integer.parseInt(id_label.getText());
        JOptionPane.showInputDialog("Enter ID: " + id); 
       try {
           stmt.executeUpdate("DELETE FROM student.StudentDB WHERE  = '"+id_label+"'");
           }catch(SQLException e){}
      
    }//GEN-LAST:event_deleteActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
       
    }//GEN-LAST:event_editActionPerformed

    
    /**
     * @param args the command line arguments
     */
       public static void main(String args[]) 
        throws ClassNotFoundException, SQLException {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        connection = DriverManager.getConnection(
        "jdbc:derby://localhost:1527/StudentDB","student","student");
        stmt = connection.createStatement();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentForm().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel birthyear;
    private javax.swing.JLabel birthyear1;
    private javax.swing.JLabel birthyear2;
    private javax.swing.JTextField birthyear_field;
    private javax.swing.JTextField course_field;
    private javax.swing.JButton delete;
    private javax.swing.JButton display;
    private javax.swing.JButton edit;
    private javax.swing.JLabel firstname;
    private javax.swing.JTextField firstname_field;
    private javax.swing.JTextField id1;
    private javax.swing.JLabel id_label;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lastname;
    private javax.swing.JTextField lastname_field;
    private javax.swing.JLabel middlename;
    private javax.swing.JTextField middlename_field;
    private javax.swing.JButton save;
    private javax.swing.JTextField yearlevel_field;
    // End of variables declaration//GEN-END:variables
}
