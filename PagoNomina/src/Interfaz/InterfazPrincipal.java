/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;


import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import mundo.Empleado;


/**
 *
 * @author nicoa
 */
public class InterfazPrincipal extends javax.swing.JFrame 
{
    // Se realiza la conexion  a la base de datos y se genera el DAO que permitira guardar la información del empleado
    public static ConnectionSource conexion;
    public static Dao < Empleado,Integer > TabladeEmpleados;
    

    /**
     * Creates new form InterfazPagoNomina
     */
    public InterfazPrincipal() 
    {
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
        jLabel2 = new javax.swing.JLabel();
        EmpleadosPrincipal = new javax.swing.JButton();
        NominaPrincipal = new javax.swing.JButton();
        SalirdelSistema = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bienvenido al sistema de manejo de empleados y pagos de nomina");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("MANEJO DE EMPLEADOS Y PAGOS DE NOMINA");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Empleados.jpg"))); // NOI18N

        EmpleadosPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/employee.png"))); // NOI18N
        EmpleadosPrincipal.setText(" Empleados");
        EmpleadosPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpleadosPrincipalActionPerformed(evt);
            }
        });

        NominaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/income.png"))); // NOI18N
        NominaPrincipal.setText("Nomina");
        NominaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NominaPrincipalActionPerformed(evt);
            }
        });

        SalirdelSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/log-out.png"))); // NOI18N
        SalirdelSistema.setText("Salir del sistema");
        SalirdelSistema.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SalirdelSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirdelSistemaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(EmpleadosPrincipal)
                        .addGap(75, 75, 75)
                        .addComponent(NominaPrincipal)
                        .addGap(77, 77, 77)
                        .addComponent(SalirdelSistema))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(30, 30, 30)))
                .addGap(156, 156, 156))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmpleadosPrincipal)
                    .addComponent(NominaPrincipal)
                    .addComponent(SalirdelSistema))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  // Se crea un metodo para cerrar la aplicación en el sistema usando AWT format
    public void close()
  {
      WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
      Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
  }

    /**
     *
     * @throws Exception
     */
   
    private void EmpleadosPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpleadosPrincipalActionPerformed
        InterfazEmpleados frame = new InterfazEmpleados();
        // escondemos la interfaz principal de empleados
        this.setVisible(false);
        // mostramos la interfaz principal 
        frame.setVisible(true);
    }//GEN-LAST:event_EmpleadosPrincipalActionPerformed

    private void SalirdelSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirdelSistemaActionPerformed
        close();
    }//GEN-LAST:event_SalirdelSistemaActionPerformed

    private void NominaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NominaPrincipalActionPerformed
        InterfazNomina frame = new InterfazNomina();
        this.setVisible(false);
        frame.setVisible(true);
    }//GEN-LAST:event_NominaPrincipalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception 
    {
        // Se requiere una url para la base de datos generada localmente dentro del proyecto
        String url = "jdbc:h2:file:./data/misempleados";
        // Se realiza la conexion de la base de datos a la URL
        conexion = new JdbcConnectionSource(url);
        System.out.println("Conexión realizada!");
        TabladeEmpleados = DaoManager.createDao(conexion, Empleado.class);
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Darcula".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            
            public void run() 
            {
                new InterfazPrincipal().setVisible(true);
            }
        });
        // conexion de datos 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EmpleadosPrincipal;
    private javax.swing.JButton NominaPrincipal;
    private javax.swing.JButton SalirdelSistema;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
