
package proyecto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class Alta_Profesores extends javax.swing.JFrame {

    public Alta_Profesores() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        try {
            cargar_txt();
            listarRegistro();
        } catch (Exception ex) {
            mensaje("No existe el archivo txt");
        }
    }
    
    int clic_tabla;
    public static String ruta_txt = "profesores.txt";
    public static profesor a = new profesor();
    public static proceso2 rp2 = new proceso2();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ID = new javax.swing.JLabel();
        Nom = new javax.swing.JLabel();
        Edad = new javax.swing.JLabel();
        Sexo = new javax.swing.JLabel();
        Direcc = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla2 = new javax.swing.JTable();
        guar = new javax.swing.JButton();
        modi = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        txtRuta = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Mat1 = new javax.swing.JLabel();
        Mat2 = new javax.swing.JLabel();
        txtMateria1 = new javax.swing.JTextField();
        txtMateria2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(206, 152, 152));

        ID.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        ID.setText("ID:");

        Nom.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        Nom.setText("Nombre:");

        Edad.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        Edad.setText("Edad:");

        Sexo.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        Sexo.setText("Sexo:");

        Direcc.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        Direcc.setText("Dirección:");

        Tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Edad", "Sexo", "Dirección", "No. Materias"
            }
        ));
        Tabla2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla2);

        guar.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        guar.setText("Guardar");
        guar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guarActionPerformed(evt);
            }
        });

        modi.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        modi.setText("Modificar");
        modi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modiActionPerformed(evt);
            }
        });

        borrar.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        borrar.setText("Borrar");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Mat1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 11)); // NOI18N
        Mat1.setText("Materia 1:");

        Mat2.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 11)); // NOI18N
        Mat2.setText("Materia 2:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Direcc)
                                    .addComponent(Sexo)
                                    .addComponent(Edad))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Nom)
                                    .addComponent(ID))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                    .addComponent(txtNombre)
                                    .addComponent(txtId))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Mat1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMateria1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Mat2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMateria2)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(modi)
                                .addGap(32, 32, 32))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(guar)
                                    .addComponent(borrar))
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ID)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mat1)
                            .addComponent(txtMateria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nom)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mat2)
                            .addComponent(txtMateria2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Edad)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Sexo)
                            .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Direcc)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guar)
                        .addGap(15, 15, 15)
                        .addComponent(modi)
                        .addGap(18, 18, 18)
                        .addComponent(borrar)))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tabla2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla2MouseClicked
        clic_tabla = Tabla2.rowAtPoint(evt.getPoint());

        int id = (int) Tabla2.getValueAt(clic_tabla, 0);//se obtiene el id de la fila que se de click columna 0
        String nombre = "" + Tabla2.getValueAt(clic_tabla, 1);//se obtiene el nombre de la fila que se da click columna 1
        String edad= "" + Tabla2.getValueAt(clic_tabla,2);
        String sexo= "" + Tabla2.getValueAt(clic_tabla,3);
        String direccion= "" + Tabla2.getValueAt(clic_tabla,4);
        String materia1 = "" + Tabla2.getValueAt(clic_tabla, 5);
        String materia2 = "" + Tabla2.getValueAt(clic_tabla, 6);
//Se llenan los textField con la informacion de la fila que se selecciono
        txtId.setText(String.valueOf(id));
        txtNombre.setText(nombre);
        txtEdad.setText(edad);
        txtSexo.setText(sexo);
        txtDireccion.setText(direccion);
        txtMateria1.setText(materia1);
        txtMateria2.setText(materia2);
        
    }//GEN-LAST:event_Tabla2MouseClicked

    private void guarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guarActionPerformed
        File ruta = new File(txtRuta.getText());
        this.ingresarRegistro(ruta);//Se llama al metodo donde se guardan los datos
    }//GEN-LAST:event_guarActionPerformed

    private void modiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modiActionPerformed
        File ruta = new File(txtRuta.getText());
        this.modificarRegistro(ruta);
    }//GEN-LAST:event_modiActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        this.eliminarRegistro();
    }//GEN-LAST:event_borrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Menu1 men = new Menu1();
        men.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    public final void cargar_txt() {
        
        File ruta = new File(ruta_txt);
        try {

            FileReader fi = new FileReader(ruta);
            BufferedReader bu = new BufferedReader(fi);

            String linea = null;
            while ((linea = bu.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linea, ",");
                a = new profesor();
                a.setId(Integer.parseInt(st.nextToken()));
                a.setNombre(st.nextToken());
                a.setEdad(st.nextToken());
                a.setSexo(st.nextToken());
                a.setDireccion(st.nextToken());
                a.setMateria1(st.nextToken());
                a.setMateria2(st.nextToken());
                rp2.agregarRegistro(a);
            }
            bu.close();
        } catch (Exception ex) {
            mensaje("Error al cargar archivo: " + ex.getMessage());
            System.out.println(ex.getMessage());
        }
    }
    
    public void grabar_txt() {
        FileWriter fw;
        PrintWriter pw;
        try {
            fw = new FileWriter(ruta_txt);
            pw = new PrintWriter(fw);

            for (int i = 0; i < rp2.cantidadRegistro(); i++) {
                a = rp2.obtenerRegistro(i);
                pw.println(String.valueOf(a.getId() + ", " + a.getNombre() + ", " + a.getEdad() + ", " + a.getSexo() + ", "
                        + a.getDireccion() + ", " + a.getMateria1() + ", " + a.getMateria2()));
            }
            pw.close();

        } catch (Exception ex) {
            mensaje("Error al grabar archivo: " + ex.getMessage());
            System.out.println(ex.getMessage());
        }
    }
    
    
    public int leerCodigo() {
        try {
            int codigo = Integer.parseInt(txtId.getText().trim());
            return codigo;
        } catch (Exception ex) {
            return -666;
        }
    }

    public String leerNombre() {
        try {
            String nombre = txtNombre.getText().trim().replace(" ", "_");
            return nombre;
        } catch (Exception ex) {
            return null;
        }
    }

    public String leerEdad() {
        try {
            String edad = txtEdad.getText().trim().replace(" ", "_");
            return edad;
        } catch (Exception ex) {
            return null;
        }
    }

    public String leerSexo() {
        try {

            String sexo = txtSexo.getText().trim().replace(" ", "_");
            return sexo;
        } catch (Exception ex) {
            return null;
        }
    }

    public String leerDireccion() {
        try {
            String direccion = txtDireccion.getText().trim().replace(" ", "_");
            return direccion;

        } catch (Exception ex) {
            return null;
        }
    }
    
    public String leerMateria1(){
        try { 
            String materia1 = txtMateria1.getText().trim().replace(" ","_");
            return materia1;
        }catch (Exception ex) { 
            return null;
        }
    }
    
    public String leerMateria2(){
        try {
            String materia2 = txtMateria2.getText().trim().replace(" ", "_");
            return materia2;
        }catch (Exception ex){
            return null;
        }
    }

    public void listarRegistro() {
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        dt.addColumn("ID");
        dt.addColumn("Nombre");
        dt.addColumn("Edad");
        dt.addColumn("Sexo");
        dt.addColumn("Dirección");
        dt.addColumn("Materia 1");
        dt.addColumn("Materia 2");
        
        Object fila[] = new Object[dt.getColumnCount()];
        for (int i = 0; i < rp2.cantidadRegistro(); i++) {
            a = new profesor();
            a = rp2.obtenerRegistro(i);
            fila[0] = a.getId();
            fila[1] = a.getNombre();
            fila[2] = a.getEdad();
            fila[3] = a.getSexo();
            fila[4] = a.getDireccion();
            fila[5] = a.getMateria1();
            fila[6] = a.getMateria2();
            dt.addRow(fila);
        }
        Tabla2.setModel(dt);
        Tabla2.setRowHeight(60);
    }

    public void ingresarRegistro(File ruta) {
        try {
            if (leerCodigo() == -666) {
                mensaje("Ingresar codigo entero");
            } else if (leerNombre() == null) {
                mensaje("Ingresar Nombre");
            } else {
                a = new profesor(leerCodigo(), leerNombre(), leerEdad(), leerSexo(), leerDireccion(), leerMateria1(), leerMateria2());
                if (rp2.buscaCodigo(a.getId()) != -1) {
                    mensaje("Este codigo ya existe");
                } else {
                    rp2.agregarRegistro(a);
                }

                grabar_txt();
                listarRegistro();
                //(lt.limpiar_texto(panel);
            }
        } catch (Exception ex) {
            mensaje(ex.getMessage());
        }
    }

    public void modificarRegistro(File ruta) {
        try {
            if (leerCodigo() == -666) {
                mensaje("Ingresar codigo entero");
            } else if (leerNombre() == null) {
                mensaje("Ingresar Nombre");
            } else {
                int codigo = rp2.buscaCodigo(leerCodigo());
                a = new profesor(leerCodigo(), leerNombre(), leerEdad(), leerSexo(), leerDireccion(), leerMateria1(), leerMateria2());

                if (codigo == -1) {
                    rp2.agregarRegistro(a);
                } else {
                    rp2.modificarRegistro(codigo, a);
                }

                grabar_txt();
                listarRegistro();
                //lt.limpiar_texto(panel);
            }
        } catch (Exception ex) {
            mensaje(ex.getMessage());
        }
    }

    public void eliminarRegistro() {
        try {
            if (leerCodigo() == -666) {
                mensaje("Ingrese codigo entero");
            } else {
                int codigo = rp2.buscaCodigo(leerCodigo());
                if (codigo == -1) {
                    mensaje("codigo no existe");
                } else {
                    int s = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar este producto", "Si/No", 0);
                    if (s == 0) {
                        rp2.eliminarRegistro(codigo);

                        grabar_txt();
                        listarRegistro();
                        //lt.limpiar_texto(panel);
                    }
                }

            }
        } catch (Exception ex) {
            mensaje(ex.getMessage());
        }
    }

    public void mensaje(String texto) {
        JOptionPane.showMessageDialog(null, texto);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alta_Profesores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Direcc;
    private javax.swing.JLabel Edad;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel Mat1;
    private javax.swing.JLabel Mat2;
    private javax.swing.JLabel Nom;
    private javax.swing.JLabel Sexo;
    private javax.swing.JTable Tabla2;
    private javax.swing.JButton borrar;
    private javax.swing.JButton guar;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modi;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMateria1;
    private javax.swing.JTextField txtMateria2;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRuta;
    private javax.swing.JTextField txtSexo;
    // End of variables declaration//GEN-END:variables
}
