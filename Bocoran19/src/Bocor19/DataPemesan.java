/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bocor19;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.Koneksi;

/**
 *
 * @author Rayhan
 */
public class DataPemesan extends javax.swing.JInternalFrame {
private DefaultTableModel model;
    /**
     * Creates new form DataPemesan
     */
    public DataPemesan() {
        initComponents();
        initComponents();
        model = new DefaultTableModel ( );       
        Tabel_Pemesan.setModel(model);       
        model.addColumn("id");
        model.addColumn("nama");
        model.addColumn("nomor_wa");

    getData();    
    }
    
    public void getData( ){
     
     model.getDataVector( ).removeAllElements( );
     model.fireTableDataChanged( );
 
     try{
           
//membuat statemen untuk memanggil data table tabel_buku
           Koneksi connection = new Koneksi();   
           Statement stat = connection.Koneksi().createStatement( );
           String sql        = "Select * from pemesan";
           ResultSet res   = stat.executeQuery(sql);
 
           
//pengecekan terhadap data tabel_buku
           while(res.next ()){
                Object[] obj = new Object[7];
                obj[0] = res.getString("id");
                obj[1] = res.getString("nama");
                obj[2] = res.getString("nomor_wa");
                model.addRow(obj);
            }
      }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
      }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel_Pemesan = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        backGround1 = new yoroshiku.BackGround();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabel_Pemesan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Tabel_Pemesan);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 33, 665, 185));

        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 375, -1, -1));
        getContentPane().add(backGround1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AdminControlPanel yy;
        yy = new AdminControlPanel();
        yy.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabel_Pemesan;
    private yoroshiku.BackGround backGround1;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
