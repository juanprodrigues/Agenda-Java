package Agenda;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JuanPC
 */

public class Agenda extends javax.swing.JFrame {

    //variables globales
    static int[] vectorDNI = new int[10];
    static String[] vectorNombre = new String[10];
    static String[] vectorApellido = new String[10];
    static String[] vectorDirecion = new String[10];
    static int[] vectorTelefono = new int[10];
    static String[] vectorNacimiento = new String[10]; //lo hago string porque no voy ha realizar ningun calculo

    public Agenda() {
        initComponents();
        setTitle("Mi agenda"); //titulo de agenda
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFondo = new javax.swing.JPanel();
        panelFondoElementos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labApellido = new javax.swing.JLabel();
        labIndice = new javax.swing.JLabel();
        texIndice = new javax.swing.JTextField();
        texApellido = new javax.swing.JTextField();
        texNombre = new javax.swing.JTextField();
        texDNI = new javax.swing.JTextField();
        labDNI = new javax.swing.JLabel();
        botGuardar = new javax.swing.JButton();
        botAnterior = new javax.swing.JButton();
        labNombre = new javax.swing.JLabel();
        botSiguiente = new javax.swing.JButton();
        labDrecion = new javax.swing.JLabel();
        labNacimiento = new javax.swing.JLabel();
        texNacimiento = new javax.swing.JTextField();
        texTelefono = new javax.swing.JTextField();
        texDirecion = new javax.swing.JTextField();
        labTelefono = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);
        setSize(new java.awt.Dimension(652, 490));

        PanelFondo.setBackground(new java.awt.Color(102, 102, 102));

        panelFondoElementos.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel2.setText("Agenda Electronica");

        labApellido.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        labApellido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labApellido.setText("Apellido:");

        labIndice.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        labIndice.setText("Indice");

        texIndice.setEditable(false);
        texIndice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        texIndice.setText("0");
        texIndice.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        texIndice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texIndiceActionPerformed(evt);
            }
        });

        texApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        texApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texApellidoActionPerformed(evt);
            }
        });

        texNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        texNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texNombreActionPerformed(evt);
            }
        });

        texDNI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        texDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texDNIActionPerformed(evt);
            }
        });

        labDNI.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        labDNI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labDNI.setText("DNI :");

        botGuardar.setBackground(new java.awt.Color(51, 102, 255));
        botGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/save.png"))); // NOI18N
        botGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botGuardarActionPerformed(evt);
            }
        });

        botAnterior.setBackground(new java.awt.Color(51, 102, 255));
        botAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/arrow-left.png"))); // NOI18N
        botAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botAnteriorActionPerformed(evt);
            }
        });

        labNombre.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        labNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labNombre.setText("Nombre:");

        botSiguiente.setBackground(new java.awt.Color(51, 102, 255));
        botSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/arrow-right.png"))); // NOI18N
        botSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botSiguienteActionPerformed(evt);
            }
        });

        labDrecion.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        labDrecion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labDrecion.setText("Direccion:");

        labNacimiento.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        labNacimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labNacimiento.setText("F.Nacimient:");

        texNacimiento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        texNacimiento.setToolTipText("");
        texNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texNacimientoActionPerformed(evt);
            }
        });

        texTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        texTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texTelefonoActionPerformed(evt);
            }
        });

        texDirecion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        texDirecion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texDirecionActionPerformed(evt);
            }
        });

        labTelefono.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        labTelefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTelefono.setText("Telefono:");

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Ejemplo:14-07-1997");

        javax.swing.GroupLayout panelFondoElementosLayout = new javax.swing.GroupLayout(panelFondoElementos);
        panelFondoElementos.setLayout(panelFondoElementosLayout);
        panelFondoElementosLayout.setHorizontalGroup(
            panelFondoElementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoElementosLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelFondoElementosLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(labDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(texDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(labDrecion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(texDirecion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelFondoElementosLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(labNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(texNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(labTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(texTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelFondoElementosLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(labApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(texApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(labNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(texNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelFondoElementosLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(botAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(botGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(botSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelFondoElementosLayout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(labIndice, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(texIndice, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelFondoElementosLayout.setVerticalGroup(
            panelFondoElementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoElementosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(panelFondoElementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labDrecion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texDirecion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelFondoElementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panelFondoElementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panelFondoElementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panelFondoElementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labIndice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texIndice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelFondoLayout = new javax.swing.GroupLayout(PanelFondo);
        PanelFondo.setLayout(PanelFondoLayout);
        PanelFondoLayout.setHorizontalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFondoLayout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(panelFondoElementos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        PanelFondoLayout.setVerticalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFondoLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(panelFondoElementos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void texNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texNombreActionPerformed

    private void texApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texApellidoActionPerformed

    private void texIndiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texIndiceActionPerformed

    }//GEN-LAST:event_texIndiceActionPerformed

    private void botGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botGuardarActionPerformed
        //trae la posicion del indice
        String posicion = texIndice.getText();
//        System.out.println(posicion);
        int posicionInt = Integer.parseInt(posicion);
        //le asigno el texto quie contine las casillas del la agenda a cada vairable
        String apellido = texApellido.getText();
        String nombre = texNombre.getText();
        String DNI = texDNI.getText();

        String direccion = texDirecion.getText();
        String telefono = texTelefono.getText();
        String nacimiento = texNacimiento.getText();

        //los guardo en su respectivo vector
        vectorApellido[posicionInt] = apellido;
        vectorNombre[posicionInt] = nombre;
        //int =String
        int DNIEntero = Integer.parseInt(DNI);
        vectorDNI[posicionInt] = DNIEntero;

        vectorNacimiento[posicionInt] = nacimiento;

        vectorDirecion[posicionInt] = direccion;
        //int =String
        int telefonoEntero = Integer.parseInt(telefono);
        vectorTelefono[posicionInt] = telefonoEntero;

        //muestra por consola
        for (int i = 0; i < vectorNombre.length; i++) {
            //uso este if para que no me muestre los valores nullos y ceros por consola
            if (vectorDNI[i] != 0) {                
                System.out.println("Nombre: " + vectorNombre[i]);
                System.out.println("Apellido: " + vectorApellido[i]);
                System.out.println("DNI: " + vectorDNI[i]);
                System.out.println("Direcion: " + vectorDirecion[i]);
                System.out.println("Telefono: " + vectorTelefono[i]);
                System.out.println("Nacimiento: " + vectorNacimiento[i]);
                System.out.println("----------------------------------------------------------------------");
                
            }

        }
    }//GEN-LAST:event_botGuardarActionPerformed

    private void botSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botSiguienteActionPerformed
        //boton mostrar siquiente. Su funcion es trael elemtos del vector. Asiendo uin set.
        String posicion = texIndice.getText();

        int posicionInt = Integer.parseInt(posicion);
        if (posicionInt < 9) {
            posicionInt++;
            String posicString = String.valueOf(posicionInt);
            texIndice.setText(posicString);
        }

        texApellido.setText(vectorApellido[posicionInt]);
        texNombre.setText(vectorNombre[posicionInt]);

        texDirecion.setText(vectorDirecion[posicionInt]);
        texNacimiento.setText(vectorNacimiento[posicionInt]);

        //este if sirve para que no pe ponga el valor por defecto cero en el texdni
        //problema: que aun guarda el valor anterior guardado
        // solucionado con el else!! =)
        //siguinte problema: al regresar con la tecla me pone un cero.
        if (vectorDNI[posicionInt] != 0) {
            String DNIString = String.valueOf(vectorDNI[posicionInt]);
            texDNI.setText(DNIString);
            String telefonoString = String.valueOf(vectorTelefono[posicionInt]);
            texTelefono.setText(telefonoString);
        } else {
            texDNI.setText("");
            texTelefono.setText("");
        }

    }//GEN-LAST:event_botSiguienteActionPerformed

    private void botAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botAnteriorActionPerformed
        String posicion = texIndice.getText();

        int posicionInt = Integer.parseInt(posicion);
        if (posicionInt > 0) {
            posicionInt--;
            System.out.println(posicionInt);
            String posicString = String.valueOf(posicionInt);
            texIndice.setText(posicString);
        }

        texApellido.setText(vectorApellido[posicionInt]);
        texNombre.setText(vectorNombre[posicionInt]);
        texDirecion.setText(vectorDirecion[posicionInt]);
        texNacimiento.setText(vectorNacimiento[posicionInt]);
        //este if sirve para que no pe ponga el valor por defecto cero en el texdni
        if (vectorDNI[posicionInt] != 0) {
            String DNIString = String.valueOf(vectorDNI[posicionInt]);
            texDNI.setText(DNIString);
            String telefonoString = String.valueOf(vectorTelefono[posicionInt]);
            texTelefono.setText(telefonoString);
        } else {
            texDNI.setText("");
            texTelefono.setText("");

        }
    }//GEN-LAST:event_botAnteriorActionPerformed

    private void texDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texDNIActionPerformed

    private void texNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texNacimientoActionPerformed

    private void texTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texTelefonoActionPerformed

    private void texDirecionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texDirecionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texDirecionActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Agenda().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JButton botAnterior;
    private javax.swing.JButton botGuardar;
    private javax.swing.JButton botSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labApellido;
    private javax.swing.JLabel labDNI;
    private javax.swing.JLabel labDrecion;
    private javax.swing.JLabel labIndice;
    private javax.swing.JLabel labNacimiento;
    private javax.swing.JLabel labNombre;
    private javax.swing.JLabel labTelefono;
    private javax.swing.JPanel panelFondoElementos;
    private javax.swing.JTextField texApellido;
    private javax.swing.JTextField texDNI;
    private javax.swing.JTextField texDirecion;
    private javax.swing.JTextField texIndice;
    private javax.swing.JTextField texNacimiento;
    private javax.swing.JTextField texNombre;
    private javax.swing.JTextField texTelefono;
    // End of variables declaration//GEN-END:variables
}
