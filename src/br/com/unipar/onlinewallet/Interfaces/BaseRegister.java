/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.onlinewallet.Interfaces;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Matheus
 */
public interface BaseRegister<T extends Serializable> {

    void save(T t) throws Exception;

    T update(T t);


    default void print() {
        System.out.println("Printando algoo....");
    }
    
}
