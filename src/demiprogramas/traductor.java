/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demiprogramas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class traductor extends javax.swing.JFrame {

    /**
     * Creates new form traductor
     */
    public traductor() {
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

        jLabel1 = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        ingles = new javax.swing.JButton();
        frances = new javax.swing.JButton();
        aleman = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pantalla = new javax.swing.JTextArea();
        fraR = new javax.swing.JButton();
        ingR = new javax.swing.JButton();
        aleR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Introduce la palabra en español: ");

        ingles.setText("Ingles");
        ingles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inglesActionPerformed(evt);
            }
        });

        frances.setText("Frances");
        frances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                francesActionPerformed(evt);
            }
        });

        aleman.setText("Aleman");
        aleman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alemanActionPerformed(evt);
            }
        });

        pantalla.setEditable(false);
        pantalla.setColumns(20);
        pantalla.setRows(5);
        jScrollPane1.setViewportView(pantalla);

        fraR.setText("<->");
        fraR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fraRActionPerformed(evt);
            }
        });

        ingR.setText("<->");
        ingR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingRActionPerformed(evt);
            }
        });

        aleR.setText("<->");
        aleR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aleRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel1)
                        .addGap(63, 63, 63)
                        .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(frances, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ingles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(aleman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fraR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(aleR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ingR, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ingles)
                                    .addComponent(ingR))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(frances)
                                    .addComponent(fraR))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(aleman)
                                    .addComponent(aleR)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alemanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alemanActionPerformed
        
        String pEsp = input.getText().toLowerCase();
        boolean entro = false;
        for (int i = 0; i < palEspañol.size(); i++) {
            if(palEspañol.get(i).equals(pEsp)){
                pantalla.setText("La palabra "+pEsp+" se dice en alemán: "+palAleman.get(i));
                entro=true;
                break;
            }
        }
        if(!entro){
            JOptionPane.showMessageDialog(rootPane, "No hubo coincidencias");
            pantalla.setText("");
        }
        
    }//GEN-LAST:event_alemanActionPerformed

    private void inglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inglesActionPerformed
        // TODO add your handling code here:
        
        String pEsp = input.getText().toLowerCase();
        boolean entro = false;
        
        for (int i = 0; i < palEspañol.size(); i++) {
            if(palEspañol.get(i).equals(pEsp)){
                pantalla.setText("La palabra "+pEsp+" se dice en ingles: "+palIngles.get(i));
                entro=true;
                break;
            }
        }if(!entro){
            JOptionPane.showMessageDialog(rootPane, "No hubo coincidencias");
            pantalla.setText("");
        }
        
    }//GEN-LAST:event_inglesActionPerformed

    private void francesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_francesActionPerformed
        // TODO add your handling code here:
        
        String pEsp = input.getText().toLowerCase();
        boolean entro = false;
        
        for (int i = 0; i < palEspañol.size(); i++) {
            if(palEspañol.get(i).equals(pEsp)){
                pantalla.setText("La palabra "+pEsp+" se dice en frances: "+palFrances.get(i));
                entro=true;
                break;
            }
        }
        if(!entro){
            JOptionPane.showMessageDialog(rootPane, "No hubo coincidencias");
            pantalla.setText("");
        }
        
    }//GEN-LAST:event_francesActionPerformed

    private void ingRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingRActionPerformed
        // TODO add your handling code here:
        
        String p = input.getText().toLowerCase();
        boolean entro = false;
        
        for (int i = 0; i < palIngles.size(); i++) {
            if(palIngles.get(i).equals(p)){
                pantalla.setText("La palabra "+p+" se dice en español: "+palEspañol.get(i));
                entro=true;
                break;
            }
        }
        if(!entro){
            JOptionPane.showMessageDialog(rootPane, "No hubo coincidencias");
            pantalla.setText("");
        }
        
    }//GEN-LAST:event_ingRActionPerformed

    private void fraRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fraRActionPerformed
        // TODO add your handling code here:
        
        String p = input.getText().toLowerCase();
        boolean entro = false;
        
        for (int i = 0; i < palFrances.size(); i++) {
            if(palFrances.get(i).equals(p)){
                pantalla.setText("La palabra "+p+" se dice en Frances: "+palEspañol.get(i));
                entro=true;
                break;
            }
        }
        if(!entro){
            JOptionPane.showMessageDialog(rootPane, "No hubo coincidencias");
            pantalla.setText("");
        }
        
    }//GEN-LAST:event_fraRActionPerformed

    private void aleRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aleRActionPerformed
        // TODO add your handling code here:
        
        String p = input.getText().toLowerCase();
        boolean entro = false;
        
        for (int i = 0; i < palAleman.size(); i++) {
            if(palAleman.get(i).equals(p)){
                pantalla.setText("La palabra "+p+" se dice en Aleman: "+palEspañol.get(i));
                entro=true;
                break;
            }
        }
        if(!entro){
            JOptionPane.showMessageDialog(rootPane, "No hubo coincidencias");
            pantalla.setText("");
        }
        
    }//GEN-LAST:event_aleRActionPerformed

    static ArrayList<String> palEspañol = new ArrayList();
    static ArrayList<String> palIngles = new ArrayList();
    static ArrayList<String> palFrances = new ArrayList();
    static ArrayList<String> palAleman = new ArrayList();
    
    
    static ArrayList<String[]> palIdiomas = new ArrayList();
    
    
    
    public static void leerTxt(){
        try{
            BufferedReader lector = new BufferedReader(new FileReader("palabras.txt"));
            String linea;
            String []tempPal;
            while((linea=lector.readLine())!=null){
                tempPal=linea.split("::");
                palEspañol.add(tempPal[0]);
                palIngles.add(tempPal[1]);
                palFrances.add(tempPal[2]);
                palAleman.add(tempPal[3]);
            }
        }catch(Exception e){
            
        }

        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        leerTxt();
        
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
            java.util.logging.Logger.getLogger(traductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(traductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(traductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(traductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new traductor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aleR;
    private javax.swing.JButton aleman;
    private javax.swing.JButton fraR;
    private javax.swing.JButton frances;
    private javax.swing.JButton ingR;
    private javax.swing.JButton ingles;
    private javax.swing.JTextField input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea pantalla;
    // End of variables declaration//GEN-END:variables
}
