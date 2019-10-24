
package proyecto;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Inicio_Sesion extends javax.swing.JFrame {
    int errores;
    int seg = 30;
    public Inicio_Sesion () {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        Usuario.setOpaque(true);
        contraseña.setOpaque(true);
        SAES.setOpaque(true);
        
    }

    public Timer t;

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        Usuario = new javax.swing.JLabel();
        contraseña = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        btnAceptar = new javax.swing.JButton();
        Exit1 = new javax.swing.JButton();
        SAES = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        text1 = new javax.swing.JLabel();
        cont = new javax.swing.JLabel();
        text2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Usuario.setBackground(new java.awt.Color(183, 215, 248));
        Usuario.setFont(new java.awt.Font("SansSerif", 2, 20)); // NOI18N
        Usuario.setText("Usuario:");
        getContentPane().add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 93, -1, -1));

        contraseña.setBackground(new java.awt.Color(133, 215, 248));
        contraseña.setFont(new java.awt.Font("Tahoma", 2, 20)); // NOI18N
        contraseña.setText("Contraseña:");
        getContentPane().add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 173, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 93, 205, 25));

        password.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 172, 205, 25));

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        Exit1.setText("Salir");
        Exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit1ActionPerformed(evt);
            }
        });
        getContentPane().add(Exit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, -1, -1));

        SAES.setBackground(new java.awt.Color(174, 242, 242));
        SAES.setFont(new java.awt.Font("SansSerif", 3, 28)); // NOI18N
        SAES.setText("Bienvenido al SAES 2.0");
        getContentPane().add(SAES, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 19, -1, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 324, -1, -1));

        text1.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 12)); // NOI18N
        text1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 190, 22));

        cont.setFont(new java.awt.Font("Yu Gothic Light", 3, 12)); // NOI18N
        cont.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cont, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 35, 20));

        text2.setFont(new java.awt.Font("Yu Gothic Light", 3, 12)); // NOI18N
        text2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 73, 24));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/saes.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String Usuario = "Alumno";
        String Usuario1 = "Administrador";
        String Contraseña = "password";
        String Contraseña1 = "password";

        String Pass = new String(password.getPassword());
        if (txtUsuario.getText().equals(Usuario) && Pass.equals(Contraseña)) {
            Menu_Alumno m2 = new Menu_Alumno();
            m2.setVisible(true);
            dispose();
        } else if (txtUsuario.getText().equals(Usuario1) && Pass.equals(Contraseña1)) {//verifica si la contraseña y el usario del Secretario son correctos
            Menu_Administrador m1 = new Menu_Administrador();//se crea el segundo menu
            m1.setVisible(true);//Perimite que la segunda ventana sea visible
            dispose();//se cierra la ventana actual
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña Incorrectos");
            errores++;
        }
        
        if (errores == 3) {
            int contador = 30;
            text1.setEnabled(true);
            text2.setEnabled(true);
            cont.setEnabled(true);
            btnAceptar.setEnabled(false);
            t = new Timer(1000, null);
            t.start();
            t.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent evt1) {
                    text1.setText("Error intentelo de nuevo en");
                    cont.setText(seg + "");
                    text2.setText("segundos");
                    seg--;
                    if (seg == -1) {
                        btnAceptar.setEnabled(true);
                        seg = 30;
                        errores = 0;
                        t.stop();
                        text1.setText("");
                        text2.setText("");
                        cont.setText("");
                        
                    }
                }
            });
        }
 
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void Exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit1ActionPerformed
        dispose();//cierra la ventana actual y termina el programa
    }//GEN-LAST:event_Exit1ActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed


    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_Sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit1;
    private javax.swing.JLabel SAES;
    private javax.swing.JLabel Usuario;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel cont;
    private javax.swing.JLabel contraseña;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
