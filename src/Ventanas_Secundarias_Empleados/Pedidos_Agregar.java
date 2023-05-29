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
package Ventanas_Secundarias_Empleados;

import Metodos_SQL.IniciarSesion_BD;
import static Ventana_Principales.Ventana_Empleados.Contenido_Empleados;
import Ventana_PrincipalesEmpleados.Pedidos_Empleados;
import java.awt.BorderLayout;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author juani
 */
public class Pedidos_Agregar extends javax.swing.JPanel {
    IniciarSesion_BD bd = new IniciarSesion_BD();
    
    
    public String FechaActual2(){
        Date fecha = new Date();
        SimpleDateFormat FechaActual = new SimpleDateFormat("YYYY-MM-dd");
        
        return FechaActual.format(fecha);
    
    }
    public Pedidos_Agregar() {
        initComponents();
        Fecha_txt.setText(FechaActual2());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Regresar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Agregar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        Mesa_txt = new javax.swing.JTextField();
        Domicilio = new javax.swing.JLabel();
        Fecha_txt = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        ID_txt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        Apellido1 = new javax.swing.JLabel();
        cliente_txt = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setBackground(new java.awt.Color(13, 71, 171));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Agregar Pedido");

        javax.swing.GroupLayout TituloLayout = new javax.swing.GroupLayout(Titulo);
        Titulo.setLayout(TituloLayout);
        TituloLayout.setHorizontalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(jLabel10)
                .addContainerGap(326, Short.MAX_VALUE))
        );
        TituloLayout.setVerticalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel10)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 100));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Regresar.setBackground(new java.awt.Color(19, 90, 173));
        Regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegresarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RegresarMousePressed(evt);
            }
        });
        Regresar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Regresar");
        Regresar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jPanel1.add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 200, 50));

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

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Agregar Pedido");
        Agregar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 200, 50));

        Nombre.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        Nombre.setForeground(new java.awt.Color(13, 71, 171));
        Nombre.setText("Numero de Mesa:");
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        Mesa_txt.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        Mesa_txt.setForeground(new java.awt.Color(204, 204, 204));
        Mesa_txt.setText("Ingrese el Numero de Mesa");
        Mesa_txt.setBorder(null);
        Mesa_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Mesa_txtMousePressed(evt);
            }
        });
        Mesa_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mesa_txtActionPerformed(evt);
            }
        });
        Mesa_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Mesa_txtKeyTyped(evt);
            }
        });
        jPanel1.add(Mesa_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 490, -1));

        Domicilio.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        Domicilio.setForeground(new java.awt.Color(13, 71, 171));
        Domicilio.setText("Fecha del Pedido:");
        jPanel1.add(Domicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        Fecha_txt.setEditable(false);
        Fecha_txt.setBackground(new java.awt.Color(255, 255, 255));
        Fecha_txt.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        Fecha_txt.setText("Ingrese la Fecha del Pedido");
        Fecha_txt.setBorder(null);
        Fecha_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Fecha_txtMousePressed(evt);
            }
        });
        Fecha_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fecha_txtActionPerformed(evt);
            }
        });
        jPanel1.add(Fecha_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 170, -1));

        id.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        id.setForeground(new java.awt.Color(13, 71, 171));
        id.setText("ID del Pedido:");
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 140, -1));

        ID_txt.setEditable(false);
        ID_txt.setBackground(new java.awt.Color(204, 204, 204));
        ID_txt.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        ID_txt.setBorder(null);
        jPanel1.add(ID_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 210, -1));

        jSeparator2.setForeground(new java.awt.Color(13, 71, 171));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 490, 10));

        jSeparator3.setForeground(new java.awt.Color(13, 71, 171));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, 210, 10));

        jSeparator5.setForeground(new java.awt.Color(13, 71, 171));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 170, 10));

        Apellido1.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        Apellido1.setForeground(new java.awt.Color(13, 71, 171));
        Apellido1.setText("ID del Cliente:");
        jPanel1.add(Apellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        cliente_txt.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        cliente_txt.setForeground(new java.awt.Color(204, 204, 204));
        cliente_txt.setText("Ingrese el ID del Cliente");
        cliente_txt.setBorder(null);
        cliente_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cliente_txtMousePressed(evt);
            }
        });
        cliente_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cliente_txtActionPerformed(evt);
            }
        });
        cliente_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cliente_txtKeyTyped(evt);
            }
        });
        jPanel1.add(cliente_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 230, -1));

        jSeparator6.setForeground(new java.awt.Color(13, 71, 171));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 230, 10));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 860, 460));
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseEntered
        setColor(Agregar);
    }//GEN-LAST:event_AgregarMouseEntered

    private void AgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseExited
       resetColor(Agregar);
    }//GEN-LAST:event_AgregarMouseExited

    private void RegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarMouseEntered
        setColor(Regresar);
    }//GEN-LAST:event_RegresarMouseEntered

    private void RegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarMouseExited
        resetColor(Regresar);
    }//GEN-LAST:event_RegresarMouseExited

    private void RegresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarMousePressed
        /////REGRESAR A LA SECCION/////
        Pedidos_Empleados p = new Pedidos_Empleados();
        p.setSize(860, 560);
        p.setLocation(0,0);
        
        Contenido_Empleados.removeAll();
        Contenido_Empleados.add(p, BorderLayout.CENTER);
        Contenido_Empleados.revalidate();
        Contenido_Empleados.repaint();
    }//GEN-LAST:event_RegresarMousePressed

    private void Mesa_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mesa_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Mesa_txtActionPerformed

    private void Mesa_txtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mesa_txtMousePressed
        //Metodo Cuando Cambiamos de Campo no pierda la estructura 
        if(Mesa_txt.getText().equals("Ingrese el Numero de Mesa"))
        Mesa_txt.setText("");
        Mesa_txt.setForeground(Color.black); 
        
        
        if(String.valueOf(cliente_txt.getText()).isEmpty()){
        cliente_txt.setText("Ingrese el ID del Cliente");
        cliente_txt.setForeground(new Color(204,204,204));
        }
        
        
    }//GEN-LAST:event_Mesa_txtMousePressed

    private void Fecha_txtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Fecha_txtMousePressed
        if(Fecha_txt.getText().equals("Ingrese la Fecha del Pedido"))
        Fecha_txt.setText("");
        Fecha_txt.setForeground(Color.black);
    }//GEN-LAST:event_Fecha_txtMousePressed

    private void Fecha_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fecha_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Fecha_txtActionPerformed

    private void cliente_txtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cliente_txtMousePressed

        //Metodo Cuando Cambiamos de Campo no pierda la estructura 
        if(cliente_txt.getText().equals("Ingrese el ID del Cliente"))
        cliente_txt.setText("");
        cliente_txt.setForeground(Color.black);
        
        if(String.valueOf(Mesa_txt.getText()).isEmpty()){
        Mesa_txt.setText("Ingrese el Numero de Mesa");
        Mesa_txt.setForeground(new Color(204,204,204));
        }
        
    }//GEN-LAST:event_cliente_txtMousePressed

    private void cliente_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliente_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cliente_txtActionPerformed

    private void AgregarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMousePressed
        //Metodo para agregar un Pedido
        if(bd.existeClientes(cliente_txt.getText())==0){
            JOptionPane.showMessageDialog(null, "Por Favor verifique El ID del cliente");
        }
        else{
        
        IniciarSesion_BD Pedidos = new IniciarSesion_BD();
        String NumMesa = Mesa_txt.getText();
        String Fecha = Fecha_txt.getText();
        String idClientes = cliente_txt.getText();
        if(NumMesa.equals("")||Fecha_txt.equals("")||cliente_txt.equals("")||
                NumMesa.equals("Ingrese el Numero de Mesa")||Fecha_txt.equals("")||cliente_txt.equals("Ingrese el ID del Cliente")){
           JOptionPane.showMessageDialog(null, "Todo los Campos son Requeridos");
           Mesa_txt.setText("Ingrese el Numero de Mesa");
           Mesa_txt.setForeground(new Color(204,204,204));
           cliente_txt.setText("Ingrese el ID del Cliente");
           cliente_txt.setForeground(new Color(204,204,204));
        }
        else{
            Pedidos.Agregarpedido(NumMesa,Fecha,idClientes);
            JOptionPane.showMessageDialog(this, "Los datos del Pedido fueron Guardados Correctamente");
            Mesa_txt.setText("Ingrese el Numero de Mesa");
            Mesa_txt.setForeground(new Color(203,203,203));
            cliente_txt.setText("Ingrese el ID del Cliente");
            cliente_txt.setForeground(new Color(203,203,203));
        }
       }
    }//GEN-LAST:event_AgregarMousePressed

    private void Mesa_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Mesa_txtKeyTyped
    //Valida el ingreso de solo numeros
        Character n = evt.getKeyChar();
        
        if(!Character.isDigit(n)){
            evt.consume();
        
        }
        if(Mesa_txt.getText().length() >=2){
            evt.consume();
        }    
    //Metodo Cuando Cambiamos de Campo no pierda la estructura 
        if(Mesa_txt.getText().equals("Ingrese el Numero de Mesa"))
        Mesa_txt.setText("");
        Mesa_txt.setForeground(Color.black); 
        
        
        if(String.valueOf(cliente_txt.getText()).isEmpty()){
        cliente_txt.setText("Ingrese el ID del Cliente");
        cliente_txt.setForeground(new Color(204,204,204));
        }
        
    }//GEN-LAST:event_Mesa_txtKeyTyped

    private void cliente_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cliente_txtKeyTyped
        //Valida el ingreso de solo numeros
        Character n = evt.getKeyChar();
        
        if(!Character.isDigit(n)){
            evt.consume();
        
        }
        if(cliente_txt.getText().length() >=5){
            evt.consume();
        }  
    //Metodo Cuando Cambiamos de Campo no pierda la estructura 
        if(cliente_txt.getText().equals("Ingrese el ID del Cliente"))
        cliente_txt.setText("");
        cliente_txt.setForeground(Color.black);
        
        if(String.valueOf(Mesa_txt.getText()).isEmpty()){
        Mesa_txt.setText("Ingrese el Numero de Mesa");
        Mesa_txt.setForeground(new Color(204,204,204));
        }
        
    }//GEN-LAST:event_cliente_txtKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Agregar;
    private javax.swing.JLabel Apellido1;
    private javax.swing.JLabel Domicilio;
    private javax.swing.JTextField Fecha_txt;
    private javax.swing.JTextField ID_txt;
    private javax.swing.JTextField Mesa_txt;
    private javax.swing.JLabel Nombre;
    private javax.swing.JPanel Regresar;
    private javax.swing.JPanel Titulo;
    private javax.swing.JTextField cliente_txt;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    // End of variables declaration//GEN-END:variables

    private void setColor(JPanel panel) {
        panel.setBackground(new Color(21,101,192));
    }

    private void resetColor(JPanel panel) {
         panel.setBackground(new Color(18,90,173));
    }
}
