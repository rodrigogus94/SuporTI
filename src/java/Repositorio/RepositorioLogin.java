/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Repositorio;

import Negocio.Login;
import dao.DaoManagerHiber;
import java.util.List;

/**
 *
 * @author Rodri
 */
public class RepositorioLogin implements InterfaceRepositorio.Interface<Login, String>{

    @Override
    public void inserir(Login l) {
        DaoManagerHiber.persist(l);
    }

    @Override
    public void alterar(Login l) {
        DaoManagerHiber.update(l);
    }

    @Override
    public Login recuperar(int id) {
       return (Login)DaoManagerHiber.recover("from Login where id = " + id).get(0);
    }

    @Override
    public void deletar(Login l) {
        DaoManagerHiber.delete(l);
    }

    @Override
    public List<Login> recuperarTodos() {
       List<Login> list = DaoManagerHiber.recover("from Login ");
       if(list.isEmpty()){
           return null;
       }else{
           return null;
       }
    }
    
}
