package ma.TR_2.dao;


import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public interface IDao<T> {
     public abstract boolean create (T o);
    boolean update (T o);
    boolean delete (T o);
    T findById (int id);
    List<T> findAll ();
    
}
