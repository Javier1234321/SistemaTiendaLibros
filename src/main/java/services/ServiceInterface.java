/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.sql.SQLException;
import java.util.List;
import javax.naming.NamingException;

/**
 *
 * @author javie
 */
public interface ServiceInterface<T>{
    List<T> list();
    T finById(int id);
    void save(T t);
    void delete(Long id);
    
    
}
