/*
Descripción: PROYECTO FINAL
Fecha: AGOSTO 2022
Equipo:
*Aguilar Brun Mario
*Lizárraga Moreno Ricardo
*Lopez Mora Alan Ignacio
*Meza Borrego Juan Manuel
*Pérez Pérez Joshua Mizraim
*Toledo Becerra Gustavo

 */
package Ventana_PrincipalesEmpleados;


import static Ventana_Principales.Ventana_Empleados.Contenido_Empleados;
import Ventanas_Secundarias_Empleados.Ordenes_Actualizar;
import Ventanas_Secundarias_Empleados.Ordenes_Agregar;
import Ventanas_Secundarias_Empleados.Ordenes_Eliminar;
import Ventanas_Secundarias_Empleados.Ordenes_Registrados;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;


public class Ordenes_Empleados extends javax.swing.JPanel {

    
    public Ordenes_Empleados() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Eliminar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Registrados = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Agregar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setBackground(new java.awt.Color(13, 71, 171));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Que Desea Realizar?");

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Bienvenido al Apartado De Pedidos");

        javax.swing.GroupLayout TituloLayout = new javax.swing.GroupLayout(Titulo);
        Titulo.setLayout(TituloLayout);
        TituloLayout.setHorizontalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addContainerGap(224, Short.MAX_VALUE)
                .addGroup(TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TituloLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(165, 165, 165))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TituloLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(290, 290, 290))))
        );
        TituloLayout.setVerticalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 100));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Eliminar.setBackground(new java.awt.Color(18, 90, 173));
        Eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EliminarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EliminarMousePressed(evt);
            }
        });
        Eliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Eliminar Orden");
        Eliminar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanel1.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 190, 40));

        Registrados.setBackground(new java.awt.Color(18, 90, 173));
        Registrados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Registrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegistradosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegistradosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RegistradosMousePressed(evt);
            }
        });
        Registrados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ordenes Registradas ");
        Registrados.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(Registrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 210, 40));

        Agregar.setBackground(new java.awt.Color(19, 90, 173));
        Agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AgregarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AgregarMousePressed(evt);
            }
        });
        Agregar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Agregar Orden");
        Agregar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 170, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pedido_del.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 120, 120));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pedido_add.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 120, 120));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pedido_1.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 100, 120));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 860, 460));
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseEntered
        setColor(Agregar);
    }//GEN-LAST:event_AgregarMouseEntered

    private void AgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseExited
       resetColor(Agregar);
    }//GEN-LAST:event_AgregarMouseExited

    private void EliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseEntered
        setColor(Eliminar);
    }//GEN-LAST:event_EliminarMouseEntered

    private void EliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseExited
        resetColor(Eliminar);
    }//GEN-LAST:event_EliminarMouseExited

    private void RegistradosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistradosMouseEntered
        setColor(Registrados);
    }//GEN-LAST:event_RegistradosMouseEntered

    private void RegistradosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistradosMouseExited
        resetColor(Registrados);
    }//GEN-LAST:event_RegistradosMouseExited

    private void AgregarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMousePressed
        // ABRE LA SECCION 
        Ordenes_Agregar prin = new Ordenes_Agregar();
        prin.setSize(860, 560);
        prin.setLocation(0,0);
        
        Contenido_Empleados.removeAll();
        Contenido_Empleados.add(prin, BorderLayout.CENTER);
        Contenido_Empleados.revalidate();
        Contenido_Empleados.repaint();
    }//GEN-LAST:event_AgregarMousePressed

    private void EliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMousePressed
        // ABRE LA SECCION 
        Ordenes_Eliminar pe = new Ordenes_Eliminar();
        pe.setSize(860, 560);
        pe.setLocation(0,0);
        
        Contenido_Empleados.removeAll();
        Contenido_Empleados.add(pe, BorderLayout.CENTER);
        Contenido_Empleados.revalidate();
        Contenido_Empleados.repaint();
    }//GEN-LAST:event_EliminarMousePressed

    private void RegistradosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistradosMousePressed
        // ABRE LA SECCION 
        Ordenes_Registrados pr = new Ordenes_Registrados ();
        pr.setSize(860, 560);
        pr.setLocation(0,0);
        
        Contenido_Empleados.removeAll();
        Contenido_Empleados.add(pr, BorderLayout.CENTER);
        Contenido_Empleados.revalidate();
        Contenido_Empleados.repaint();
    }//GEN-LAST:event_RegistradosMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Agregar;
    private javax.swing.JPanel Eliminar;
    private javax.swing.JPanel Registrados;
    private javax.swing.JPanel Titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void setColor(JPanel panel) {
        panel.setBackground(new Color(21,101,192));
    }

    private void resetColor(JPanel panel) {
         panel.setBackground(new Color(18,90,173));
    }
}