
package mycommandprompt;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


import com.trilead.ssh2.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;

public class cmd extends javax.swing.JFrame {

       
        Session s;
        Connection c;
         boolean scroll_mode=true;
    
   
    public cmd() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Bmin = new javax.swing.JButton();
        Bmax = new javax.swing.JButton();
        Bclose = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tcmd = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        AnsField = new javax.swing.JTextArea();
        excute = new javax.swing.JButton();
        Btnarg = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        servername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pratiksha's Terminal");

        Bmin.setText("-");
        Bmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BminActionPerformed(evt);
            }
        });

        Bmax.setText("[]");
        Bmax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmaxActionPerformed(evt);
            }
        });

        Bclose.setText("X");
        Bclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcloseActionPerformed(evt);
            }
        });

        jLabel2.setText("ENTER COMMAND");

        tcmd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tcmd.setToolTipText("Enter Command");
        tcmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcmdActionPerformed(evt);
            }
        });

        AnsField.setColumns(20);
        AnsField.setRows(5);
        jScrollPane1.setViewportView(AnsField);

        excute.setText("EXCUTE");
        excute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excuteActionPerformed(evt);
            }
        });

        Btnarg.setText("SEND ARG");
        Btnarg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnargActionPerformed(evt);
            }
        });

        jLabel3.setText("Enter Server Name");

        servername.setText("hpp710a");
        servername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servernameActionPerformed(evt);
            }
        });

        jLabel4.setText("Enter userName");

        username.setText("lsuae1");
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        jLabel5.setText("Enter password");

        password.setText("lsUae99!");
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(tcmd, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(excute, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(servername, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btnarg, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Bmin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Bmax)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Bclose))))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1045, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Bmin)
                        .addComponent(Bmax)
                        .addComponent(Bclose)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(servername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(username)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btnarg, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tcmd)
                        .addComponent(excute, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BminActionPerformed
        
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_BminActionPerformed

    private void tcmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcmdActionPerformed
       
    }//GEN-LAST:event_tcmdActionPerformed

    private void BmaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BmaxActionPerformed
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_BmaxActionPerformed

    private void BcloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcloseActionPerformed
       
       
         this.dispose();  
    }//GEN-LAST:event_BcloseActionPerformed

    private void BtnargActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnargActionPerformed
       
        String s=JOptionPane.showInputDialog(this,"enter input","user Input",JOptionPane.QUESTION_MESSAGE);
        if(s!=null)
        {
          
        }
    }//GEN-LAST:event_BtnargActionPerformed

 
    private void servernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servernameActionPerformed

        
    }//GEN-LAST:event_servernameActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
     
     
       
    }//GEN-LAST:event_usernameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
      
        
    }//GEN-LAST:event_passwordActionPerformed

    private void excuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excuteActionPerformed
         try{
             
             
                String  server=servername.getText().trim();
                String user=username.getText().trim();
                String pass=String.valueOf(password.getText()).trim();
                String cmd[]=tcmd.getText().split(";");
         
                     c = new Connection(server,22);
                        c.connect();
                        
                        if(c.authenticateWithPassword(user, pass))
                        {

                            s = c.openSession();
                            s.startShell();
                   
                    
                              BufferedReader i=new BufferedReader(new InputStreamReader(s.getStdout()));
                              BufferedWriter o = new BufferedWriter(new OutputStreamWriter(s.getStdin()));
                     
                                        try {
                                                    for(String c1:cmd)
                                                    {
                                                     o.write(c1+"\n");
                                                    }
                                                     o.write("exit\n");
                                                     o.flush(); 
                                                    
                      
                                              } catch (IOException ex) {
                                                        ex.printStackTrace();
                                                    }
                                        
                                            String ip="";
                                             while((ip=i.readLine())!=null)
                                            {
                                                AnsField.append(ip+"\n");
                                            }
                          
                    
                        }
         
               
        }catch(Exception e)
                {
                    e.printStackTrace();
                }
       
    
    }//GEN-LAST:event_excuteActionPerformed

    public static void main(String args[]) {

       
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cmd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cmd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cmd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cmd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cmd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AnsField;
    private javax.swing.JButton Bclose;
    private javax.swing.JButton Bmax;
    private javax.swing.JButton Bmin;
    private javax.swing.JButton Btnarg;
    private javax.swing.JButton excute;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField password;
    private javax.swing.JTextField servername;
    private javax.swing.JTextField tcmd;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
