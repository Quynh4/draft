/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nofom
 */
public class UserDAO extends DBContext{
    public String checkLogin(String userID, String pass){
        try {
            PreparedStatement ps = connection.prepareStatement("select * from [tblUsers] where "
                    + "[userID] = ? and [password] = ?");
            ps.setString(1,userID);
            ps.setString(2, pass);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            return rs.getString(2); 
        }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static void main(String[] args) {
        System.out.println(new UserDAO().checkLogin("admin", "123"));
    }
}
