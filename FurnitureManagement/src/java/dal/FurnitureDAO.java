/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import model.Furniture;


public class FurnitureDAO extends DBContext{
    PreparedStatement stm;
    ResultSet rs;

    public List<Furniture> search (String search) {

        List<Furniture> list = new ArrayList<>();
        try {
         
            if (connection != null) {
                String sql = "select * from tblFurniture where name like ?";
                stm = connection.prepareStatement(sql);
                stm.setString(1, "%"+search+ "%");
                rs = stm.executeQuery();
                while (rs.next()) {
                    list.add(new Furniture(rs.getString(1), 
                            rs.getString(2), 
                            rs.getString(3), 
                            rs.getDouble(4), rs.getString(5), rs.getString(6), rs.getInt(7)));
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
}
    
     public void delete (String id) {

        try {
            if (connection != null) {
                String sql = "update tblFurniture set status =0 where id= ?";
                stm = connection.prepareStatement(sql);
                stm.setString(1, id);
                stm.executeUpdate();
              
            }
        } catch (Exception e) {
            System.out.println(e);
        }
}

}