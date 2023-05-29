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
package Ventana_Principales;

import Ventanas_Secundarias.Productos_Registrados;
import static Ventana_Principales.Ventana_Admin.Contenido;
import Ventanas_Secundarias.Productos_Actualizar;
import Ventanas_Secundarias.Productos_Agregar;
import Ventanas_Secundarias.Productos_Eliminar;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;


public class Productos extends javax.swing.JPanel {

    
    public Productos() {
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
        Actualizar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Agregar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
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
        jLabel10.setText("Bienvenido Al Apartado De Productos");

        javax.swing.GroupLayout TituloLayout = new javax.swing.GroupLayout(Titulo);
        Titulo.setLayout(TituloLayout);
        TituloLayout.setHorizontalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
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
        jLabel3.setText("Eliminar Producto");
        Eliminar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

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
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                RegistradosMouseReleased(evt);
            }
        });
        Registrados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Producto Registrados ");
        Registrados.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(Registrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 210, 40));

        Actualizar.setBackground(new java.awt.Color(18, 90, 173));
        Actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ActualizarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ActualizarMousePressed(evt);
            }
        });
        Actualizar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Actualizar Producto");
        Actualizar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 200, 40));

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
        jLabel2.setText("Agregar Producto");
        Agregar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 170, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Producto4.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 120, 120));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Producto 2.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 100, 120));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Product_3.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 120, 120));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Producto_reg.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 100, 120));

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

    private void ActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActualizarMouseEntered
        setColor(Actualizar);
    }//GEN-LAST:event_ActualizarMouseEntered

    private void ActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActualizarMouseExited
        resetColor(Actualizar);
    }//GEN-LAST:event_ActualizarMouseExited

    private void AgregarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMousePressed
      // ABRE LA SECCION 
        Productos_Agregar prin = new Productos_Agregar();
        prin.setSize(860, 560);
        prin.setLocation(0,0);
        
        Contenido.removeAll();
        Contenido.add(prin, BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();
    }//GEN-LAST:event_AgregarMousePressed

    private void EliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMousePressed
        // ABRE LA SECCION 
        Productos_Eliminar prin = new Productos_Eliminar();
        prin.setSize(860, 560);
        prin.setLocation(0,0);
        
        Contenido.removeAll();
        Contenido.add(prin, BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();
    }//GEN-LAST:event_EliminarMousePressed

    private void RegistradosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistradosMousePressed
        // ABRE LA SECCION 
        Productos_Registrados prin = new  Productos_Registrados();
        prin.setSize(860, 560);
        prin.setLocation(0,0);
        
        Contenido.removeAll();
        Contenido.add(prin, BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();
    }//GEN-LAST:event_RegistradosMousePressed

    private void RegistradosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistradosMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_RegistradosMouseReleased

    private void ActualizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActualizarMousePressed
        // ABRE LA SECCION 
        Productos_Actualizar prin = new  Productos_Actualizar();
        prin.setSize(860, 560);
        prin.setLocation(0,0);
        
        Contenido.removeAll();
        Contenido.add(prin, BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();
    }//GEN-LAST:event_ActualizarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Actualizar;
    private javax.swing.JPanel Agregar;
    private javax.swing.JPanel Eliminar;
    private javax.swing.JPanel Registrados;
    private javax.swing.JPanel Titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
