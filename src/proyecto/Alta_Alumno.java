package proyecto;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Alta_Alumno extends javax.swing.JFrame {

    /**
     * Creates new form altaAlumnos
     */
    public Alta_Alumno() {
        initComponents();
        this.setLocationRelativeTo(null);
        //Se lee la infomacion del archivo txt y se agrega a la tabla
        try {
            cargar_txt();
            listarRegistro();
        } catch (Exception ex) {
            mensaje("No existe el archivo txt");
        }
    }
    
    int clic_tabla;
    public static final String txt_alumnos = "Alum.txt";
    public static Alumno a = new Alumno();
    public static Herramientas List_alumnos = new Herramientas();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSexo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCarrera = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAsignatura = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        guardar = new javax.swing.JButton();
        mod = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtAsignatura2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtAsignatura3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtAsignatura4 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtAsignatura5 = new javax.swing.JTextField();
        txtAsignatura6 = new javax.swing.JTextField();
        txtRuta = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));

        jPanel1.setBackground(new java.awt.Color(243, 244, 154));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        jLabel3.setText("Edad:");

        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        jLabel4.setText("Sexo:");

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        jLabel5.setText("Direccion:");

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        jLabel6.setText("Carrera:");

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        jLabel7.setText("Asignatura 1:");

        tabla.setFont(new java.awt.Font("Lucida Console", 0, 11)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Edad", "Sexo", "Dirección", "Carrera", "Asignatura"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        guardar.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        mod.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        mod.setText("Modificar");
        mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        delete.setText("Borrar");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 11)); // NOI18N
        jLabel8.setText("Asignatura2:");

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 11)); // NOI18N
        jLabel9.setText("Asignatura 3:");

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 11)); // NOI18N
        jLabel10.setText("Asignatura 4:");

        jLabel11.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 11)); // NOI18N
        jLabel11.setText("Asignatura 5:");

        jLabel12.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 11)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAsignatura2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAsignatura3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(txtAsignatura4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAsignatura5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(txtAsignatura6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(mod, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1)
                                                .addComponent(jLabel2))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtId)
                                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(32, 32, 32)
                                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(192, 192, 192)
                                            .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel4)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(186, 186, 186)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 20, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addComponent(txtCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(txtAsignatura2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAsignatura3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(txtAsignatura4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtAsignatura5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtAsignatura6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar)
                    .addComponent(mod)
                    .addComponent(delete))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        jMenu1.setText("Menu");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Menu Principal");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Menu Administrador");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");

        jMenuItem3.setText("Salir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//este metodo permite modificar los datos del txt desde la tabla
    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked

        clic_tabla = tabla.rowAtPoint(evt.getPoint());

        int id = (int) tabla.getValueAt(clic_tabla, 0);//se obtiene el id de la fila que se de click columna 0
        String nombre = "" + tabla.getValueAt(clic_tabla, 1);//se obtiene el nombre de la fila que se da click columna 1
        String edad= "" + tabla.getValueAt(clic_tabla,2);
        String sexo= "" + tabla.getValueAt(clic_tabla,3);
        String direccion= "" + tabla.getValueAt(clic_tabla,4);
        String carrera = "" + tabla.getValueAt(clic_tabla,5);
        String asignatura = "" + tabla.getValueAt(clic_tabla,6);
        String asignatura2 = "" + tabla.getValueAt(clic_tabla,7);
        String asignatura3 = "" + tabla.getValueAt(clic_tabla,8);
        String asignatura4 = "" + tabla.getValueAt(clic_tabla,9);
        String asignatura5 = "" + tabla.getValueAt(clic_tabla,10);
        String asignatura6 = "" + tabla.getValueAt(clic_tabla,11);
//Se llenan los textField con la informacion de la fila que se selecciono
        txtId.setText(String.valueOf(id));
        txtNombre.setText(nombre);
        txtEdad.setText(edad);
        txtSexo.setText(sexo);
        txtDireccion.setText(direccion);
        txtCarrera.setText(carrera);
        txtAsignatura.setText(asignatura);
        txtAsignatura2.setText(asignatura2);
        txtAsignatura3.setText(asignatura3);
        txtAsignatura4.setText(asignatura4);
        txtAsignatura5.setText(asignatura5);
        txtAsignatura6.setText(asignatura6);
        
        
    }//GEN-LAST:event_tablaMouseClicked
//en este metodo se guardar los datos ingresados al txt
    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        File ruta = new File(txtRuta.getText());
        this.ingresarRegistro(ruta);//Se llama al metodo donde se guardan los datos
    }//GEN-LAST:event_guardarActionPerformed
//en este metodo se modifican los datos
    private void modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modActionPerformed
        File ruta = new File(txtRuta.getText());
        this.modificarRegistro(ruta);
    }//GEN-LAST:event_modActionPerformed
//En este meotodo se borran los datos del txt de la fila seleccionada
    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        this.eliminarRegistro();
    }//GEN-LAST:event_deleteActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        Inicio_Sesion in = new Inicio_Sesion();
           in.setVisible(true);
           this.setVisible(false);
           dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

           Menu_Administrador in = new Menu_Administrador();
           in.setVisible(true);
           this.setVisible(false);
           dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
   
           dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
           Inicio_Sesion in = new Inicio_Sesion();
            in.setVisible(true);
            dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed
//metodo que carga la informacion del txt
    public void cargar_txt() {
        File ruta = new File(txt_alumnos);
        try {

            FileReader fi = new FileReader(ruta);
            BufferedReader bu = new BufferedReader(fi);

            String linea = null;
            while ((linea = bu.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linea, ",");
                a = new Alumno();
                a.setId(Integer.parseInt(st.nextToken()));
                a.setNombre(st.nextToken());
                a.setEdad(st.nextToken());
                a.setSexo(st.nextToken());
                a.setDireccion(st.nextToken());
                a.setCarrera(st.nextToken());
                a.setAsignatura(st.nextToken());
                a.setAsignatura1(st.nextToken());
                a.setAsignatura2(st.nextToken());
                a.setAsignatura3(st.nextToken());
                a.setAsignatura4(st.nextToken());
                a.setAsignatura5(st.nextToken());
                
                List_alumnos.agregarRegistro(a);
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
            fw = new FileWriter(txt_alumnos);
            pw = new PrintWriter(fw);

            for (int i = 0; i < List_alumnos.cantidadRegistro(); i++) {
                a = List_alumnos.obtenerRegistro(i);
                pw.println(String.valueOf(a.getId() + ", " + a.getNombre() + ", " + a.getEdad() + ", " + a.getSexo() + ", "
                + a.getDireccion() + ", " + a.getCarrera() + ", " + a.getAsignatura())+ ", " + a.getAsignatura1() + ", "
                + a.getAsignatura2() + ", " + a.getAsignatura3() + ", " + a.getAsignatura4() + ", " + a.getAsignatura5());
            }
            pw.close();

        } catch (Exception ex) {
            mensaje("Error al grabar archivo: " + ex.getMessage());
            System.out.println(ex.getMessage());
        }
    }
    
    public int leerCodigo() {
        try {
            int codigo = Integer.parseInt(txtId.getText().trim().replace(" ","_"));
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
    
    public String leerEdad(){
        try {
            String edad = txtEdad.getText().trim().replace(" ", "_");
            return edad;
        } catch (Exception ex){
            return null;
        }
    }
    
    public String leerSexo(){
        try {
            
            String sexo = txtSexo.getText().trim().replace(" ","_");
            return sexo;
        } catch (Exception ex){
            return null;
        }
    }
    
    public String leerDireccion(){
        try {
            String direccion = txtDireccion.getText().trim().replace(" ","_");
            return direccion;
            
        } catch (Exception ex){
            return null;
        }
    }
    
    public String leerCarrera(){
        try {
            String carrera = txtCarrera.getText().trim().replace(" ", "_");
            return carrera;
            
        } catch (Exception ex){
            return null;
        }
    }
    
    public String leerAsignatura(){
        try {
            String asignatura = txtAsignatura.getText().trim().replace(" ","_");
            return asignatura;
        } catch(Exception ex){
            return null;
        }
    }
    
    public String leerAsignatura2() {
        try {
            String asignatura2 = txtAsignatura2.getText().trim().replace(" ", "_");
            return asignatura2;
        } catch (Exception ex) {
            return null;
        }
    }
       
    public String leerAsignatura3() {
        try {
            String asignatura3 = txtAsignatura3.getText().trim().replace(" ", "_");
            return asignatura3;
        } catch (Exception ex) {
            return null;
        }
    }
    
    public String leerAsignatura4() {
        try {
            String asignatura4 = txtAsignatura4.getText().trim().replace(" ", "_");
            return asignatura4;
        } catch (Exception ex) {
            return null;
        }
    }
    
    public String leerAsignatura5() {
        try {
            String asignatura5 = txtAsignatura5.getText().trim().replace(" ", "_");
            return asignatura5;
        } catch (Exception ex) {
            return null;
        }
    }
    
    public String leerAsignatura6() {
        try {
            String asignatura6 = txtAsignatura6.getText().trim().replace(" ", "_");
            return asignatura6;
        } catch (Exception ex) {
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
        dt.addColumn("Carrera");
        dt.addColumn("Asignatura 1");
        dt.addColumn("Asignatura 2");
        dt.addColumn("Asignatura 3");
        dt.addColumn("Asignatura 4");
        dt.addColumn("Asignatura 5");
        dt.addColumn("Asignatura 6");

        Object fila[] = new Object[dt.getColumnCount()];
        for (int i = 0; i < List_alumnos.cantidadRegistro(); i++) {
            a = List_alumnos.obtenerRegistro(i);
            fila[0] = a.getId();
            fila[1] = a.getNombre();
            fila[2] = a.getEdad();
            fila[3] = a.getSexo();
            fila[4] = a.getDireccion();
            fila[5] = a.getCarrera();
            fila[6] = a.getAsignatura();
            fila[7] = a.getAsignatura1();
            fila[8] = a.getAsignatura2();
            fila[9] = a.getAsignatura3();
            fila[10] = a.getAsignatura4();
            fila[11] = a.getAsignatura5();
            dt.addRow(fila);
        }
        tabla.setModel(dt);
        tabla.setRowHeight(60);
    }
    
    public void ingresarRegistro(File ruta) {
        
        try {
            if (leerCodigo() == -666) {
                mensaje("Ingresar codigo entero");
            } else if (leerNombre() == null) {
                mensaje("Ingresar Nombre");
            } else {
                a = new Alumno(leerCodigo(), leerNombre(), leerEdad(), leerSexo(), leerDireccion(), leerCarrera(), leerAsignatura()
                , leerAsignatura2(), leerAsignatura3(), leerAsignatura4(), leerAsignatura5(), leerAsignatura6());
                if (List_alumnos.buscaCodigo(a.getId()) != -1) {
                    mensaje("Este codigo ya existe");
                } else {
                    List_alumnos.agregarRegistro(a);
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
                int codigo = List_alumnos.buscaCodigo(leerCodigo());
                a = new Alumno(leerCodigo(), leerNombre(), leerEdad(), leerSexo(), leerDireccion(), leerCarrera(), leerAsignatura()
                , leerAsignatura2(), leerAsignatura3(), leerAsignatura4(), leerAsignatura5(), leerAsignatura6());

                if (codigo == -1) {
                    List_alumnos.agregarRegistro(a);
                } else {
                    List_alumnos.modificarRegistro(codigo, a);
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
                int codigo = List_alumnos.buscaCodigo(leerCodigo());
                if (codigo == -1) {
                    mensaje("codigo no existe");
                } else {
                    int s = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar este producto", "Si/No", 0);
                    if (s == 0) {
                        List_alumnos.eliminarRegistro(codigo);

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
                new Alta_Alumno().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mod;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtAsignatura;
    private javax.swing.JTextField txtAsignatura2;
    private javax.swing.JTextField txtAsignatura3;
    private javax.swing.JTextField txtAsignatura4;
    private javax.swing.JTextField txtAsignatura5;
    private javax.swing.JTextField txtAsignatura6;
    private javax.swing.JTextField txtCarrera;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRuta;
    private javax.swing.JTextField txtSexo;
    // End of variables declaration//GEN-END:variables
}
