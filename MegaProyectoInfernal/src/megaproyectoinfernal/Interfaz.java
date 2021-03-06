/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package megaproyectoinfernal;

import static java.awt.Frame.MAXIMIZED_BOTH;
import static javax.swing.JFrame.setDefaultLookAndFeelDecorated;
import javax.swing.*;

/**
 *
 * @author Usuario_2DAM
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setTitle("Practica 2");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog_Añadir = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_numMat_Añadir = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txt_Nombre_Añadir = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txt_dia = new javax.swing.JTextField();
        txt_mes = new javax.swing.JTextField();
        txt_ano = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txt_Nota_Añadir = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jButton_AñadirJOption = new javax.swing.JButton();
        jDialog_Borrar = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jDialog_Modificar = new javax.swing.JDialog();
        jLabel11 = new javax.swing.JLabel();
        jPanel_Botones = new javax.swing.JPanel();
        jButton_Añadir = new javax.swing.JButton();
        jButton_Borrar = new javax.swing.JButton();
        jButton_Modificar = new javax.swing.JButton();
        jButton_Filtrar = new javax.swing.JButton();
        jButton_LimpFiltro = new javax.swing.JButton();
        jScrollPane_Tabla = new javax.swing.JScrollPane();
        jTable_Tabla = new javax.swing.JTable();
        jPanel_Importar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox_Importar = new javax.swing.JComboBox<>();
        jFormattedTextField_Importar = new javax.swing.JFormattedTextField();
        jButton_Importar = new javax.swing.JButton();
        jButton_BuscarImp = new javax.swing.JButton();
        jPanel_Exportar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox_Exportar = new javax.swing.JComboBox<>();
        jFormattedTextField_Exportar = new javax.swing.JFormattedTextField();
        jButton_BuscarExp = new javax.swing.JButton();
        jButton_Exportar = new javax.swing.JButton();

        jDialog_Añadir.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialog_Añadir.setTitle("Datos del Alumno");
        jDialog_Añadir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jDialog_Añadir.setType(java.awt.Window.Type.UTILITY);

        jLabel5.setText("Nº Matricula:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_numMat_Añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_numMat_Añadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel6.setText("Nombre Alumno:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(txt_Nombre_Añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_Nombre_Añadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setText("Fecha Nacimiento:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_ano, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel8.setText("Nota Media:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_Nota_Añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_Nota_Añadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton_AñadirJOption.setText("Añadir");
        jButton_AñadirJOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AñadirJOptionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_AñadirJOption, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_AñadirJOption)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog_AñadirLayout = new javax.swing.GroupLayout(jDialog_Añadir.getContentPane());
        jDialog_Añadir.getContentPane().setLayout(jDialog_AñadirLayout);
        jDialog_AñadirLayout.setHorizontalGroup(
            jDialog_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_AñadirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jDialog_AñadirLayout.setVerticalGroup(
            jDialog_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_AñadirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setText("Falta saber como lo quiero hacer");

        jLabel10.setText("Mostrar info del alumno y que esten los botones de confirmar borrado o no");

        javax.swing.GroupLayout jDialog_BorrarLayout = new javax.swing.GroupLayout(jDialog_Borrar.getContentPane());
        jDialog_Borrar.getContentPane().setLayout(jDialog_BorrarLayout);
        jDialog_BorrarLayout.setHorizontalGroup(
            jDialog_BorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_BorrarLayout.createSequentialGroup()
                .addGroup(jDialog_BorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog_BorrarLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel9))
                    .addGroup(jDialog_BorrarLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog_BorrarLayout.setVerticalGroup(
            jDialog_BorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_BorrarLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel9)
                .addGap(59, 59, 59)
                .addComponent(jLabel10)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        jLabel11.setText("Tampoco se como lo hare");

        javax.swing.GroupLayout jDialog_ModificarLayout = new javax.swing.GroupLayout(jDialog_Modificar.getContentPane());
        jDialog_Modificar.getContentPane().setLayout(jDialog_ModificarLayout);
        jDialog_ModificarLayout.setHorizontalGroup(
            jDialog_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_ModificarLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel11)
                .addContainerGap(204, Short.MAX_VALUE))
        );
        jDialog_ModificarLayout.setVerticalGroup(
            jDialog_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_ModificarLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel11)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_Añadir.setText("Añadir");
        jButton_Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AñadirActionPerformed(evt);
            }
        });

        jButton_Borrar.setText("Borrar");
        jButton_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BorrarActionPerformed(evt);
            }
        });

        jButton_Modificar.setText("Modificar");
        jButton_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ModificarActionPerformed(evt);
            }
        });

        jButton_Filtrar.setText("Filtrar");

        jButton_LimpFiltro.setText("Limpiar Filtro");

        javax.swing.GroupLayout jPanel_BotonesLayout = new javax.swing.GroupLayout(jPanel_Botones);
        jPanel_Botones.setLayout(jPanel_BotonesLayout);
        jPanel_BotonesLayout.setHorizontalGroup(
            jPanel_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BotonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Añadir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Borrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Modificar)
                .addGap(18, 18, 18)
                .addComponent(jButton_Filtrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_LimpFiltro)
                .addGap(18, 18, 18))
        );
        jPanel_BotonesLayout.setVerticalGroup(
            jPanel_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BotonesLayout.createSequentialGroup()
                .addGroup(jPanel_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Añadir)
                    .addComponent(jButton_Borrar)
                    .addComponent(jButton_Modificar)
                    .addComponent(jButton_Filtrar)
                    .addComponent(jButton_LimpFiltro))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jTable_Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº Matricula", "Nombre Alumno", "Fecha Nacimiento", "Nota Media", "Edad"
            }
        ));
        jScrollPane_Tabla.setViewportView(jTable_Tabla);

        jPanel_Importar.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Importar desde:"));

        jLabel1.setText("Tipo fichero:");

        jLabel2.setText("Ruta fichero:");

        jComboBox_Importar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XML", "JSON", "Serializable", "Directo" }));

        jFormattedTextField_Importar.setEditable(false);

        jButton_Importar.setText("Importar");

        jButton_BuscarImp.setText("Buscar");

        javax.swing.GroupLayout jPanel_ImportarLayout = new javax.swing.GroupLayout(jPanel_Importar);
        jPanel_Importar.setLayout(jPanel_ImportarLayout);
        jPanel_ImportarLayout.setHorizontalGroup(
            jPanel_ImportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ImportarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_ImportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_ImportarLayout.createSequentialGroup()
                        .addGroup(jPanel_ImportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_ImportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox_Importar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jFormattedTextField_Importar))
                        .addGap(18, 18, 18)
                        .addComponent(jButton_BuscarImp))
                    .addGroup(jPanel_ImportarLayout.createSequentialGroup()
                        .addComponent(jButton_Importar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel_ImportarLayout.setVerticalGroup(
            jPanel_ImportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ImportarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_ImportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox_Importar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_ImportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jFormattedTextField_Importar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_BuscarImp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Importar)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel_Exportar.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Exportar a:"));

        jLabel3.setText("Tipo fichero:");

        jLabel4.setText("Ruta fichero:");

        jComboBox_Exportar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XML", "JSON", "Serializable", "Directo" }));

        jFormattedTextField_Exportar.setEditable(false);

        jButton_BuscarExp.setText("Buscar");

        jButton_Exportar.setText("Exportar");

        javax.swing.GroupLayout jPanel_ExportarLayout = new javax.swing.GroupLayout(jPanel_Exportar);
        jPanel_Exportar.setLayout(jPanel_ExportarLayout);
        jPanel_ExportarLayout.setHorizontalGroup(
            jPanel_ExportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ExportarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_ExportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_ExportarLayout.createSequentialGroup()
                        .addGroup(jPanel_ExportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_ExportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextField_Exportar)
                            .addComponent(jComboBox_Exportar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton_BuscarExp))
                    .addGroup(jPanel_ExportarLayout.createSequentialGroup()
                        .addComponent(jButton_Exportar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel_ExportarLayout.setVerticalGroup(
            jPanel_ExportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ExportarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_ExportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox_Exportar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_ExportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jFormattedTextField_Exportar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_BuscarExp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Exportar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_Exportar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_Importar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel_Botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane_Tabla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane_Tabla, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_Importar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_Exportar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    //metodo que inicia los JDialog (Funciona)
    private void iniciar_jDialog(JDialog ventana){
        ventana.pack();
        ventana.setModal(true);
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);  
    }
    
    private void jButton_AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AñadirActionPerformed
        iniciar_jDialog(jDialog_Añadir);
        
    }//GEN-LAST:event_jButton_AñadirActionPerformed

    private void jButton_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BorrarActionPerformed
        iniciar_jDialog(jDialog_Borrar);

    }//GEN-LAST:event_jButton_BorrarActionPerformed

    private void jButton_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ModificarActionPerformed
        iniciar_jDialog(jDialog_Modificar);
        
    }//GEN-LAST:event_jButton_ModificarActionPerformed

    private boolean filtroDatos(){
        try{
            int contador =0;
            boolean hayNumeros=true;
            int num = Integer.parseInt (txt_numMat_Añadir.getText());
            String nom = txt_Nombre_Añadir.getText();
            double not = Double.parseDouble(txt_Nota_Añadir.getText());
            int dia = Integer.parseInt(txt_dia.getText());
            int mes = Integer.parseInt(txt_mes.getText());
            int ano = Integer.parseInt(txt_ano.getText());
            
            if(num>0)contador++;
            System.out.println(contador);
            
            if(not>=0 && not<=14)contador++;

            for(int i=0; i<nom.length();i++){
                if(Character.isDigit(nom.charAt(i))){
                    hayNumeros=true;
                    break;
                }else{
                    hayNumeros=false;
                }
            }    
            if(!hayNumeros)contador++;

            if(dia>0 && dia<32){
                if(mes<13&&mes>0){
                    if(ano>1900 && ano<2020){                     
                        contador++;
                    }
                }
            }

            if(mes==2 && dia>28){
                contador--;
            }

            if(contador==4){
                return true;            
            }else{
                return false;
            }
            
        }catch(NumberFormatException ex){
            return false;
        }
    }
    
    private void jButton_AñadirJOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AñadirJOptionActionPerformed
        if(filtroDatos()){
            JOptionPane.showMessageDialog(null, "ta gucci");
        }else{
            JOptionPane.showMessageDialog(null, "There's a bug on you!");
        }
        
    }//GEN-LAST:event_jButton_AñadirJOptionActionPerformed


    
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Añadir;
    private javax.swing.JButton jButton_AñadirJOption;
    private javax.swing.JButton jButton_Borrar;
    private javax.swing.JButton jButton_BuscarExp;
    private javax.swing.JButton jButton_BuscarImp;
    private javax.swing.JButton jButton_Exportar;
    private javax.swing.JButton jButton_Filtrar;
    private javax.swing.JButton jButton_Importar;
    private javax.swing.JButton jButton_LimpFiltro;
    private javax.swing.JButton jButton_Modificar;
    private javax.swing.JComboBox<String> jComboBox_Exportar;
    private javax.swing.JComboBox<String> jComboBox_Importar;
    private javax.swing.JDialog jDialog_Añadir;
    private javax.swing.JDialog jDialog_Borrar;
    private javax.swing.JDialog jDialog_Modificar;
    private javax.swing.JFormattedTextField jFormattedTextField_Exportar;
    private javax.swing.JFormattedTextField jFormattedTextField_Importar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel_Botones;
    private javax.swing.JPanel jPanel_Exportar;
    private javax.swing.JPanel jPanel_Importar;
    private javax.swing.JScrollPane jScrollPane_Tabla;
    private javax.swing.JTable jTable_Tabla;
    private javax.swing.JTextField txt_Nombre_Añadir;
    private javax.swing.JTextField txt_Nota_Añadir;
    private javax.swing.JTextField txt_ano;
    private javax.swing.JTextField txt_dia;
    private javax.swing.JTextField txt_mes;
    private javax.swing.JTextField txt_numMat_Añadir;
    // End of variables declaration//GEN-END:variables
}
