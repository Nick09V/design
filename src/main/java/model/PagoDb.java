/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class PagoDb extends Conexion{
    public static boolean insertar(Pago p){
       PreparedStatement ps;
       Connection con = getInstance();
       String sql = "INSERT INTO `transaccion` (`cedula_usuario`, `monto`, `fecha`, `tipo`, `descripcion`, `estado`) "
               + "VALUES (?, ?, ?, ?, ?, '0');";
       try{
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getCedula());
            ps.setString(2, p.getMonto());
            ps.setString(3, p.getFecha());
            ps.setString(4, p.getTipo());
            ps.setString(5,p.getDesc());
            ps.execute();
            ps.close();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
       
    }
    public static boolean leerP (String id,Pago p){
        PreparedStatement ps;
       ResultSet rs;
        Connection con = getInstance();
        String sql = "Select * from transaccion where id="+id;
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                p.setCedula(rs.getString("cedula_usuario"));
                p.setMonto(rs.getString("monto"));
                p.setFecha(rs.getString("fecha"));
                p.setTipo(rs.getString("tipo"));
                p.setDesc(rs.getString("descripcion"));
                ps.close();
                return true;
            }else{
                return false;
            }
            
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    }
    public static boolean actualizar(Pago p,String id){
        System.out.println("Entro en actualizar");
        PreparedStatement ps;
        Connection con = getInstance();
        String sql = "UPDATE transaccion SET  cedula_usuario=?,monto=?,fecha=?,tipo=?,descripcion=? "
                + "WHERE id = ?";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getCedula());
            ps.setString(2, p.getMonto());
            ps.setString(3, p.getFecha());
            ps.setString(4, p.getTipo());
            ps.setString(5, p.getDesc());
            ps.setString(6, id);
            ps.execute();
            ps.close();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    }
    public static boolean eliminar(String id){
        System.out.println("Entro en actualizar");
        PreparedStatement ps;
        Connection con = getInstance();
        String sql = "DELETE FROM transaccion where id="+id;
        try{
           ps = con.prepareStatement(sql); 
           ps.execute();
           ps.close();
           return true;
        }catch(SQLException e){
             System.err.println(e);
             return false;
        }
    }
    public static void mostrar(JTable tabla,String cedula){
        System.out.println("Entro en el metodo");
       PreparedStatement ps;
       ResultSet rs;
        Connection con = getInstance();
        String sql = "Select * from transaccion where cedula_usuario="+cedula;
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("id");
        model.addColumn("cedula");
        model.addColumn("monto");
        model.addColumn("fecha de emision");
        model.addColumn("tipo");
        model.addColumn("descripcion");
        model.addColumn("estado");
        tabla.setModel(model);
        String[] datos = new String[7];
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.println("Entro en el while");
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                if(rs.getString(7).equals("0")){
                    datos[6]="Pendiente";
                }else{
                    datos[6]="Pagado";
                }
                
                model.addRow(datos);
            }
            ps.close();
        }catch(SQLException e){
             System.err.println(e);
        }
    }
        
}
