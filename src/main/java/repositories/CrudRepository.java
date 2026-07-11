/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositories;

import javax.naming.NamingException;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author javie
 */
public interface CrudRepository<T> {
    List<T> list() throws SQLException,NamingException;
    T finById(int id) throws SQLException,NamingException;
    void save(T t) throws SQLException;
    void delete(Long id) throws SQLException;
}
