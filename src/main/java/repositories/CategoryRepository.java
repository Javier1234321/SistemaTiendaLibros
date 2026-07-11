/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import javax.naming.NamingException;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import models.Category;
import util.DatabaseConnection;

/**
 *
 * @author javie
 */
public class CategoryRepository implements CrudRepository<Category>{

    @Override
    public List<Category> list() throws SQLException,NamingException {
        List<Category> categorys=new ArrayList<>();
        String sql="SELECT * FROM cat_category";
        try(Connection conn=DatabaseConnection.getConnection();
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);){
            while(rs.next()){
                Category category=getCategory(rs);
                categorys.add(category);
            }
        }
        return categorys;
    }

    @Override
    public Category finById(int id) throws SQLException, NamingException {
        Category c=new Category();
        String sql="SELECT * FROM cat_category cc WHERE cc.i_id_category=?";
        try(Connection conn=DatabaseConnection.getConnection();
            PreparedStatement stmt=conn.prepareStatement(sql);){
        stmt.setInt(1, id);
            try(ResultSet rs=stmt.executeQuery()){
                if(rs.next()){
                    c=getCategory(rs);
                }
            }
        }
        return c;
    }

    @Override
    public void save(Category t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    @Override
    public void delete(Long id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private Category getCategory(ResultSet rs) throws SQLException{
        Category category=new Category();
        category.setCategory(rs.getString("v_category"));
        category.setDescription(rs.getString("t_description"));
        category.setId(rs.getInt("i_id_category"));
        category.setBitStatus(rs.getBoolean("b_status"));
        return category;
    }
}
