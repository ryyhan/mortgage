/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mortgage;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author prime
 */
public class search extends javax.swing.JFrame {
    
    
    String sno;
    String cdate;
    String ramount;
    String comment;
    String True="true";
    String Mod="yes";
    Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    /**
     * Creates new form search
     */
    public search() {
        con=sql_connection.ConnectDB();
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

        label1 = new java.awt.Label();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        label2 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        textField1 = new java.awt.TextField();
        button1 = new java.awt.Button();
        label7 = new java.awt.Label();
        label4 = new java.awt.Label();
        jPanel2 = new javax.swing.JPanel();
        label5 = new java.awt.Label();
        button2 = new java.awt.Button();
        label6 = new java.awt.Label();
        textField3 = new java.awt.TextField();
        button4 = new java.awt.Button();
        textField4 = new java.awt.TextField();
        button3 = new java.awt.Button();
        label3 = new java.awt.Label();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        button5 = new java.awt.Button();
        label8 = new java.awt.Label();
        textField2 = new java.awt.TextField();
        textField5 = new java.awt.TextField();
        label9 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(255, 255, 153));
        label1.setFont(new java.awt.Font("Comic Sans MS", 0, 50)); // NOI18N
        label1.setForeground(new java.awt.Color(204, 0, 255));
        label1.setText("Search Window");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 460, 70));

        jInternalFrame2.setVisible(true);
        jInternalFrame2.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setBackground(new java.awt.Color(204, 0, 255));
        label2.setFont(new java.awt.Font("Constantia", 1, 40)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Search Using Name/Mobile No.");
        jInternalFrame2.getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 590, 230));

        jTable1.setFont(new java.awt.Font("Trebuchet MS", 1, 35)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(38);
        jScrollPane1.setViewportView(jTable1);

        jInternalFrame2.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 1440, 190));

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        textField1.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 18)); // NOI18N
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });
        textField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField1KeyTyped(evt);
            }
        });

        button1.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        button1.setLabel("Search");
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
        });

        label7.setAlignment(java.awt.Label.CENTER);
        label7.setBackground(new java.awt.Color(153, 153, 255));
        label7.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        label7.setForeground(new java.awt.Color(255, 255, 255));
        label7.setText("Enter Serial Number ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jInternalFrame2.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 19, 810, 100));

        label4.setAlignment(java.awt.Label.CENTER);
        label4.setBackground(new java.awt.Color(204, 0, 255));
        label4.setFont(new java.awt.Font("Constantia", 1, 40)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("Search Using S.No");
        jInternalFrame2.getContentPane().add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 590, 100));

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label5.setAlignment(java.awt.Label.CENTER);
        label5.setBackground(new java.awt.Color(153, 153, 255));
        label5.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("Enter Mobile Number ");
        jPanel2.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 236, 40));

        button2.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        button2.setLabel("Search");
        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button2MouseClicked(evt);
            }
        });
        jPanel2.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 140, 40));

        label6.setAlignment(java.awt.Label.CENTER);
        label6.setBackground(new java.awt.Color(153, 153, 255));
        label6.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setText("Enter Name");
        jPanel2.add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 31, 236, 40));

        textField3.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 18)); // NOI18N
        textField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField3ActionPerformed(evt);
            }
        });
        jPanel2.add(textField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 31, 282, 40));

        button4.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        button4.setLabel("Search");
        button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button4MouseClicked(evt);
            }
        });
        jPanel2.add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 140, 40));

        textField4.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 18)); // NOI18N
        textField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField4ActionPerformed(evt);
            }
        });
        textField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField4KeyTyped(evt);
            }
        });
        jPanel2.add(textField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 282, 40));

        jInternalFrame2.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 810, 230));

        getContentPane().add(jInternalFrame2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 1490, 630));

        button3.setActionCommand("Go back ");
        button3.setBackground(new java.awt.Color(255, 255, 153));
        button3.setFont(new java.awt.Font("Cambria Math", 1, 32)); // NOI18N
        button3.setForeground(new java.awt.Color(204, 0, 204));
        button3.setLabel("Close");
        button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button3MouseClicked(evt);
            }
        });
        getContentPane().add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 780, 150, 40));

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setBackground(new java.awt.Color(153, 153, 255));
        label3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("Comment");
        getContentPane().add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 850, 236, 40));

        jDateChooser1.setDateFormatString("dd/MM/yyyy");
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 740, 260, 40));

        button5.setActionCommand("Go back ");
        button5.setBackground(new java.awt.Color(255, 255, 153));
        button5.setFont(new java.awt.Font("Cambria Math", 1, 32)); // NOI18N
        button5.setForeground(new java.awt.Color(204, 0, 204));
        button5.setLabel("Go back !");
        button5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button5MouseClicked(evt);
            }
        });
        getContentPane().add(button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, 50));

        label8.setAlignment(java.awt.Label.CENTER);
        label8.setBackground(new java.awt.Color(153, 153, 255));
        label8.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        label8.setForeground(new java.awt.Color(255, 255, 255));
        label8.setText("Date");
        getContentPane().add(label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 740, 236, 40));

        textField2.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 18)); // NOI18N
        textField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField2ActionPerformed(evt);
            }
        });
        textField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField2KeyTyped(evt);
            }
        });
        getContentPane().add(textField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 850, 260, 40));

        textField5.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 18)); // NOI18N
        textField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField5ActionPerformed(evt);
            }
        });
        textField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField5KeyTyped(evt);
            }
        });
        getContentPane().add(textField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 790, 260, 40));

        label9.setAlignment(java.awt.Label.CENTER);
        label9.setBackground(new java.awt.Color(153, 153, 255));
        label9.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        label9.setForeground(new java.awt.Color(255, 255, 255));
        label9.setText("Enter Serial Number ");
        getContentPane().add(label9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 790, 236, 40));

        setSize(new java.awt.Dimension(1746, 1003));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1ActionPerformed

    private void textField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField2ActionPerformed

    private void textField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField3ActionPerformed

    private void textField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField1KeyTyped
char iNumber=evt.getKeyChar();
        if(!(Character.isDigit(iNumber)) || (iNumber==KeyEvent.VK_BACK_SPACE) || iNumber == KeyEvent.VK_DELETE )
            
        {
            evt.consume();
            
            
        }        // TODO add your handling code here:
    }//GEN-LAST:event_textField1KeyTyped

    private void textField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField2KeyTyped
char iNumber=evt.getKeyChar();
        if(!(Character.isDigit(iNumber)) || (iNumber==KeyEvent.VK_BACK_SPACE) || iNumber == KeyEvent.VK_DELETE )
            
        {
            evt.consume();
            
            
        }        // TODO add your handling code here:
    }//GEN-LAST:event_textField2KeyTyped

    private void button3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseClicked
       // TODO add your handling code here:
         String sno=textField1.getText();
        int i=Integer.valueOf(sno);
        
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
             cdate = sdf.format(jDateChooser1.getDate());
            
            
            comment=textField2.getText();
            
        String SQL="update  lent set closed='True' , c_date='"+cdate+"' , c_comment='"+comment+"' where serial ='"+i+"' ";
                 
             try{
           
           pst=con.prepareStatement(SQL);
            
             pst.execute();
             JOptionPane.showMessageDialog(null ,"Closed Successfully !");
             
             
 
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null ,e);
            
            
        }
      
    }//GEN-LAST:event_button3MouseClicked

    private void button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseClicked
            
        try{
        String sql="Select serial , name , date , amount , mobile  from lent where serial =?";
        
                    pst=con.prepareStatement(sql);
                    pst.setString(1, textField1.getText());
                    rs=pst.executeQuery();
                   
                        System.out.println(rs);
                        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                    
                    
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null ,e);
        }
                    

        
        
    }//GEN-LAST:event_button1MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
         this.getContentPane().setBackground(new java.awt.Color(204,0,255));
    }//GEN-LAST:event_formWindowActivated

    private void button4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseClicked
       
        
        try{
        String sql="Select serial , name , date , amount , mobile  from lent where name =?";
        
                    pst=con.prepareStatement(sql);
                    pst.setString(1, textField3.getText());
                    rs=pst.executeQuery();
                   
                        System.out.println(rs);
                        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                    
                    
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null ,e);
        }
             
    }//GEN-LAST:event_button4MouseClicked

    private void button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseClicked
    // TODO add your handling code here:
        try{
        String sql="Select serial , name , date , amount , mobile  from lent where mobile =?";
        
                    pst=con.prepareStatement(sql);
                    pst.setString(1, textField4.getText());
                    rs=pst.executeQuery();
                   
                        System.out.println(rs);
                        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                    
                    
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null ,e);
        }
     
    }//GEN-LAST:event_button2MouseClicked

    private void button5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_button5MouseClicked

    private void textField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField4ActionPerformed

    private void textField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textField4KeyTyped

    private void textField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField5ActionPerformed

    private void textField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField5KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textField5KeyTyped

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
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.Button button5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    private java.awt.TextField textField4;
    private java.awt.TextField textField5;
    // End of variables declaration//GEN-END:variables
}
