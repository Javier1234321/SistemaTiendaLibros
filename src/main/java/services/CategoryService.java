/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;
import repositories.CategoryRepository;
import repositories.CrudRepository;
import models.Category;
import java.util.List;
import java.sql.SQLException;
import javax.naming.NamingException;
import util.ServiceException;
/**
 *
 * @author javie
 */
public class CategoryService implements ServiceInterface<Category>{
    private CrudRepository<Category> crudRepositoryCategory;
    public CategoryService() {
        this.crudRepositoryCategory = new CategoryRepository();
    }
    
    public List<Category> list(){
        try{
            return crudRepositoryCategory.list();
        }catch(SQLException | NamingException e){
        throw new ServiceException(
            "No fue posible obtener las categorías",
            e
        );
        }
    }

    @Override
    public Category finById(int id) {
        try{
            return crudRepositoryCategory.finById(id);
        }catch(SQLException | NamingException e){
          throw new ServiceException(  "No fue posible obtener las categorias",
            e);
        }
        
    }

    @Override
    public void save(Category t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
