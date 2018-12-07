/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignement;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author feli8871
 */
public class Assignment extends javax.swing.JFrame {

    /**
     * Creates new form Assignment
     */
    
    ArrayList list;
    ListIterator iterator;
    int current, next;
    Task t;
    
    public Assignment() {
        initComponents();
        list=new ArrayList();
        iterator=list.listIterator();
        current=0;
        next=0;
    }

    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        lblname = new javax.swing.JLabel();
        lbldescription = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdescription = new javax.swing.JTextArea();
        txtname = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblcurrent = new javax.swing.JLabel();
        txtcurrent = new javax.swing.JTextField();
        lblnext = new javax.swing.JLabel();
        txtnext = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnfirst = new javax.swing.JButton();
        btnprevious = new javax.swing.JButton();
        btnlast = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuprogram = new javax.swing.JMenu();
        menushow = new javax.swing.JMenuItem();
        menuexit = new javax.swing.JMenuItem();
        menuedit = new javax.swing.JMenu();
        menureplace = new javax.swing.JMenuItem();
        menurestore = new javax.swing.JMenuItem();
        menuremove = new javax.swing.JMenuItem();
        menuclear = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        menuprevious = new javax.swing.JMenuItem();
        menunext = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblname.setText("Name:");

        lbldescription.setText("Description:");

        txtdescription.setColumns(20);
        txtdescription.setRows(5);
        jScrollPane1.setViewportView(txtdescription);

        lblcurrent.setText("Current Task:");

        txtcurrent.setText("0");

        lblnext.setText("Next Task:");

        txtnext.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcurrent)
                    .addComponent(lblnext))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtcurrent)
                    .addComponent(txtnext))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcurrent)
                    .addComponent(txtcurrent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnext))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnfirst.setText("|<");
        btnfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfirstActionPerformed(evt);
            }
        });

        btnprevious.setText("<");
        btnprevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpreviousActionPerformed(evt);
            }
        });

        btnlast.setText(">|");
        btnlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlastActionPerformed(evt);
            }
        });

        btnnext.setText(">");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnfirst)
                .addGap(18, 18, 18)
                .addComponent(btnprevious)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(btnnext)
                .addGap(18, 18, 18)
                .addComponent(btnlast)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnfirst)
                    .addComponent(btnprevious)
                    .addComponent(btnlast)
                    .addComponent(btnnext))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        menuprogram.setText("Program");

        menushow.setText("Show All");
        menushow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menushowActionPerformed(evt);
            }
        });
        menuprogram.add(menushow);

        menuexit.setText("Exit");
        menuexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuexitActionPerformed(evt);
            }
        });
        menuprogram.add(menuexit);

        jMenuBar1.add(menuprogram);

        menuedit.setText("Edit");

        menureplace.setText("Replace");
        menureplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menureplaceActionPerformed(evt);
            }
        });
        menuedit.add(menureplace);

        menurestore.setText("Restore");
        menuedit.add(menurestore);

        menuremove.setText("Remove");
        menuedit.add(menuremove);

        menuclear.setText("Clear");
        menuclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuclearActionPerformed(evt);
            }
        });
        menuedit.add(menuclear);

        jMenuBar1.add(menuedit);

        jMenu5.setText("Insert");

        menuprevious.setText("Previous");
        jMenu5.add(menuprevious);

        menunext.setText("Next");
        menunext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menunextActionPerformed(evt);
            }
        });
        jMenu5.add(menunext);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbldescription)
                    .addComponent(lblname))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(txtname)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblname)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbldescription)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menureplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menureplaceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menureplaceActionPerformed

    private void menuexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuexitActionPerformed
        this.dispose();
    }//GEN-LAST:event_menuexitActionPerformed

    private void menunextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menunextActionPerformed
        String n=txtname.getText();
        String d=txtdescription.getText();
        Task t=new Task(n,d);
        if(t.validate()==false){
            JOptionPane.showMessageDialog(this, "You must Enter the Required Information");
            return;
        }
        if(next>0) iterator.next();
        
        iterator.add(t);
        iterator.previous();
        current++;
        next++;
        txtcurrent.setText(""+current);
        txtnext.setText(""+next);
        JOptionPane.showMessageDialog(this, "Task Added");
                
    }//GEN-LAST:event_menunextActionPerformed

    private void btnlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlastActionPerformed
       if(current==next) return;
       while(iterator.hasNext()) iterator.next();
       t=(Task)iterator.previous();
       current=next;
       
       txtcurrent.setText(""+current);
       txtname.setText(t.getName());
       txtdescription.setText(t.getDescription());
       
       
       
    }//GEN-LAST:event_btnlastActionPerformed

    private void menushowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menushowActionPerformed
        String result="";
        for (int i = 0; i < list.size(); i++) {
            t=(Task)list.get(i);
            result+="TASK "+(i+1)+":\n"+t.toString()+"\n";
        
        }
        JOptionPane.showMessageDialog(this,result);
        
    }//GEN-LAST:event_menushowActionPerformed

    private void btnpreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpreviousActionPerformed
        if(current==next) return;
        iterator.previous();
        t=(Task)iterator.next();
        current=next;
        txtcurrent.setText(""+current);
        txtname.setText(t.getName());
        txtdescription.setText(t.getDescription());
    }//GEN-LAST:event_btnpreviousActionPerformed

    private void btnfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfirstActionPerformed
        if(current==next) return;
        while(iterator.hasPrevious()) iterator.previous();
        t=(Task)iterator.next();
        current=next;
       
        txtcurrent.setText(""+current);
        txtname.setText(t.getName());
        txtdescription.setText(t.getDescription());
    }//GEN-LAST:event_btnfirstActionPerformed

    private void menuclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuclearActionPerformed
        txtname.setText("");
        txtdescription.setText("");
        txtcurrent.setText("");
        txtnext.setText("");
    }//GEN-LAST:event_menuclearActionPerformed

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
            java.util.logging.Logger.getLogger(Assignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Assignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Assignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Assignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Assignment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfirst;
    private javax.swing.JButton btnlast;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnprevious;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcurrent;
    private javax.swing.JLabel lbldescription;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblnext;
    private javax.swing.JMenuItem menuclear;
    private javax.swing.JMenu menuedit;
    private javax.swing.JMenuItem menuexit;
    private javax.swing.JMenuItem menunext;
    private javax.swing.JMenuItem menuprevious;
    private javax.swing.JMenu menuprogram;
    private javax.swing.JMenuItem menuremove;
    private javax.swing.JMenuItem menureplace;
    private javax.swing.JMenuItem menurestore;
    private javax.swing.JMenuItem menushow;
    private javax.swing.JTextField txtcurrent;
    private javax.swing.JTextArea txtdescription;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnext;
    // End of variables declaration//GEN-END:variables
}