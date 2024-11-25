
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class TASKMAIN extends javax.swing.JFrame {

    /**
     * Creates new form TASKMAIN
     */
    public TASKMAIN() {
        initComponents();
       
               

    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        updt = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Clear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Addtask-resize.png"))); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete-resize.png"))); // NOI18N
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Set Due Date");

        updt.setBackground(new java.awt.Color(255, 255, 255));
        updt.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        updt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update-resize.png"))); // NOI18N
        updt.setText("Update");
        updt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updtMouseClicked(evt);
            }
        });
        updt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updtActionPerformed(evt);
            }
        });

        jDateChooser1.setBackground(new java.awt.Color(0, 0, 0));
        jDateChooser1.setDateFormatString("MM d, yy ");
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jDateChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser1MouseClicked(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/done-resize.png"))); // NOI18N
        jButton3.setText(" Done");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Input Task");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel1.setText("TASK MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(422, 422, 422)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        Clear.setBackground(new java.awt.Color(255, 255, 255));
        Clear.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        Clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clear-resize.png"))); // NOI18N
        Clear.setText(" Clear");
        Clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearMouseClicked(evt);
            }
        });
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTable2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTable2.setForeground(new java.awt.Color(0, 102, 0));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TASKS", "DUE DATE", "TIME POSTED", "DIFFICULTY"
            }
        ));
        jTable2.setRowHeight(20);
        jTable2.setRowMargin(3);
        jScrollPane2.setViewportView(jTable2);

        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 153, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TASKS", "DUE DATE", "TIME POSTED ", "DIFFICULTY"
            }
        ));
        jTable1.setMaximumSize(new java.awt.Dimension(2147483647, 30));
        jTable1.setRowHeight(20);
        jTable1.setRowMargin(3);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("TASKS");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("DONE TASKS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(244, 244, 244))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(288, 288, 288))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tasklogo3.png"))); // NOI18N

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EASY", "NORMAL", "HARD" }));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Difficulty");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(updt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField1))
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(90, 90, 90)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(2, 2, 2)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(2, 2, 2)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(updt, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //this button is to remove the single row of task
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();
    DefaultTableModel model2 = (DefaultTableModel) jTable2.getModel();

    if (jTable1.getSelectedRowCount() == 1) {
        String task = model1.getValueAt(jTable1.getSelectedRow(), 0).toString();
          String time = model1.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String date = model1.getValueAt(jTable1.getSelectedRow(), 2).toString();
      

        // Add the task to JTable2
        model2.addRow(new Object[]{task, date, time});
        model1.removeRow(jTable1.getSelectedRow());

        // Sort both tables
        bubbleSortTable(jTable1);
        bubbleSortTable(jTable2);

        JOptionPane.showMessageDialog(this, "Task: " + task + "\nMoved to Task Done!");
    } else {
        if (jTable1.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "No tasks available to move.");
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to move.");
        }
    }
      
    }//GEN-LAST:event_jButton2ActionPerformed

      // Load and scale the image for jLabel1
 
    
    //this button is to add the input from user
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");
    SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");

    // Retrieve the task, date, and selected difficulty
    String task = jTextField1.getText();
    Date date = jDateChooser1.getDate();
    String difficulty = (String) jComboBox1.getSelectedItem();  // Get the selected difficulty
    
    // Get the current system time
    Date currentTime = new Date(); // Current system time
    
    if (task.isEmpty() || date == null) {
        JOptionPane.showMessageDialog(this, "Please enter a task and select a date!");
    } else {
        // Format the date and current system time
        String formattedDate = dateFormat.format(date);
        String formattedTime = timeFormat.format(currentTime); // Format the current time

        // Add the new row to jTable1
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        tblModel.addRow(new Object[]{task,  formattedDate,formattedTime, difficulty});  // Add difficulty to the row
        
        // Sort the table (you can call your bubbleSortTable method here)
        bubbleSortTable(jTable1);

        // Display success message
        String message = "Task: " + task + "\nTime Posted: " + formattedTime + "\nDue Date: " + formattedDate + "\nDifficulty: " + difficulty;
        JOptionPane.showMessageDialog(this, "Task added successfully!\n" + message);
        
        // Clear the input fields
        jTextField1.setText("");
        jDateChooser1.setDate(null);
              
    }//GEN-LAST:event_jButton1ActionPerformed
      
        
    }
    
    
    
    private void updtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updtActionPerformed
       DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
    int selectedRow = jTable1.getSelectedRow();
    
    if (selectedRow != -1) {
        String task = jTextField1.getText();
        Date date = jDateChooser1.getDate();
        String difficulty = (String) jComboBox1.getSelectedItem();
        
        if (task.isEmpty() || date == null || difficulty == null) {
            JOptionPane.showMessageDialog(this, "Please enter a task, date, and difficulty!");
        } else {
            String formattedDate = new SimpleDateFormat("MM-dd-yyyy").format(date);
            String formattedTime = new SimpleDateFormat("hh:mm a").format(new Date());  // Use current time
            
            // Update the values in the table
            tblModel.setValueAt(task, selectedRow, 0);
            tblModel.setValueAt(formattedDate, selectedRow, 1);
            tblModel.setValueAt(formattedTime, selectedRow, 2);
            tblModel.setValueAt(difficulty, selectedRow, 3);  // Update difficulty

            // Display success message
            JOptionPane.showMessageDialog(this, "Task updated successfully!");
            bubbleSortTable(jTable1);  // Ensure the table is sorted after update
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please select a row to update.");
    }
    }//GEN-LAST:event_updtActionPerformed

    


  /*
    private void updtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updtMouseClicked
    
    }//GEN-LAST:event_updtMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
       
         
    
        
        
        
    }//GEN-LAST:event_jButton3MouseClicked
*/
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();
    DefaultTableModel model2 = (DefaultTableModel) jTable2.getModel();

    if (jTable1.getSelectedRowCount() == 1) {
        String task = model1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String date = model1.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String time = model1.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String difficulty = model1.getValueAt(jTable1.getSelectedRow(), 3).toString();  // Get difficulty

        // Add the row to jTable2
        model2.addRow(new Object[]{task, date, time, difficulty});
        model1.removeRow(jTable1.getSelectedRow());

        // Sort both tables
        bubbleSortTable(jTable1);
        bubbleSortTable(jTable2);

        // Display success message
        String message = "Task: " + task + "\nMoved to Task Done!\nDifficulty: " + difficulty;
        JOptionPane.showMessageDialog(this, message);
    } else {
        if (jTable1.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "No tasks available to move.");
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to move.");
        }
    }
    
    }//GEN-LAST:event_jButton3ActionPerformed
/*
    private void jDateChooser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser1MouseClicked

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearActionPerformed

    private void ClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();

   }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
*/
  
private void bubbleSortTable(javax.swing.JTable table) {
    DefaultTableModel model = (DefaultTableModel) table.getModel();
    int rowCount = model.getRowCount();
    int colCount = model.getColumnCount();

    // Compare by date, then by time, then by task name, and lastly by difficulty
    for (int i = 0; i < rowCount - 1; i++) {
        for (int j = 0; j < rowCount - i - 1; j++) {
            String date1 = model.getValueAt(j, 1).toString();
            String date2 = model.getValueAt(j + 1, 1).toString();

            String time1 = model.getValueAt(j, 2).toString();
            String time2 = model.getValueAt(j + 1, 2).toString();

            String task1 = model.getValueAt(j, 0).toString();
            String task2 = model.getValueAt(j + 1, 0).toString();

            String difficulty1 = model.getValueAt(j, 3).toString();  // Get difficulty for row 1
            String difficulty2 = model.getValueAt(j + 1, 3).toString();  // Get difficulty for row 2

            // First compare by date (in MM-dd-yyyy format)
            try {
                Date taskDate1 = new SimpleDateFormat("MM-dd-yyyy").parse(date1);
                Date taskDate2 = new SimpleDateFormat("MM-dd-yyyy").parse(date2);

                if (taskDate1.after(taskDate2)) {
                    // Swap rows if the date is later
                    swapRows(model, j, j + 1);
                } else if (taskDate1.equals(taskDate2)) {
                    // If dates are the same, compare by time
                    SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");
                    Date taskTime1 = timeFormat.parse(time1);
                    Date taskTime2 = timeFormat.parse(time2);

                    if (taskTime1.after(taskTime2)) {
                        // Swap rows if time is later
                        swapRows(model, j, j + 1);
                    } else if (taskTime1.equals(taskTime2)) {
                        // If times are the same, compare by task name alphabetically
                        if (task1.compareToIgnoreCase(task2) > 0) {
                            // Swap rows if task name comes later alphabetically
                            swapRows(model, j, j + 1);
                        } else if (task1.equalsIgnoreCase(task2)) {
                            // If task names are the same, compare by difficulty
                            if (difficulty1.compareToIgnoreCase(difficulty2) > 0) {
                                // Swap rows if difficulty comes later alphabetically
                                swapRows(model, j, j + 1);
                            }
                        }
                    }
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }
}

private void swapRows(DefaultTableModel model, int row1, int row2) {
    int colCount = model.getColumnCount();
    for (int col = 0; col < colCount; col++) {
        Object temp = model.getValueAt(row1, col);
        model.setValueAt(model.getValueAt(row2, col), row1, col);
        model.setValueAt(temp, row2, col);
    }
}

private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
    DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
    int selectedRow = jTable1.getSelectedRow();  // Get the selected row index
    
    if (selectedRow != -1) {  // Make sure a row is selected
        // Get the values from the selected row
        String task = tblModel.getValueAt(selectedRow, 0).toString();
        String date = tblModel.getValueAt(selectedRow, 1).toString();
        String time = tblModel.getValueAt(selectedRow, 2).toString();
        String difficulty = tblModel.getValueAt(selectedRow, 3).toString();
        
        // Set the values into the text fields
        jTextField1.setText(task);
        
        try {
            // Set the date in the jDateChooser
            Date formattedDate = new SimpleDateFormat("MM-dd-yyyy").parse(date);
            jDateChooser1.setDate(formattedDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Set the selected difficulty in the combo box
        jComboBox1.setSelectedItem(difficulty);
    }
}
    //CLEAR ALL TASK IN JTABLE1
     private void ClearMouseClicked(java.awt.event.MouseEvent evt) {                                      
      
         DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
    if (tblModel.getRowCount() > 0) {
        tblModel.setRowCount(0); // Clear all rows
        JOptionPane.showMessageDialog(this, "All tasks have been cleared!");
    } else {
        JOptionPane.showMessageDialog(this, "The table is already empty.");
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
            java.util.logging.Logger.getLogger(TASKMAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TASKMAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TASKMAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TASKMAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TASKMAIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton updt;
    // End of variables declaration//GEN-END:variables

}