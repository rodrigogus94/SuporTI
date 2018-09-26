/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Negocio.Login;
import Repositorio.RepositorioLogin;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.swing.JOptionPane;

@ManagedBean(name = "ControladorLogin")
@SessionScoped
public class ControladorLogin {
    
    private RepositorioLogin rl = null;
    private Login SelectLogin = null;

  

    public Login getSelectLogin() {
        return SelectLogin;
    }

    public void setSelectLogin(Login SelectLogin) {
        this.SelectLogin = SelectLogin;
    }

    public ControladorLogin() {
        this.rl = new RepositorioLogin();
    }
    
    public String inserirLogin(Login l){
        this.rl.inserir(l);
        return "Login.xhtml";
    }
    
    public String alterarLogin(Login l){
        this.rl.alterar(l);
        return "lista.xhtml";
    }   
    
    public Login recuperarLogin(int id){
        return this.rl.recuperar(id);
    }
    
    public void deletarLogin(Login l){
        this.rl.deletar(l);
    }
    
    public List<Login> recuperarTudoLogin(){
        return this.rl.recuperarTodos();
    }
    
    public String validarLogin(Login l){
        if(l.getLogin().equals(l) && l.getSenha().equals(l)){
            JOptionPane.showMessageDialog(null, "Eaiii porrra");
        }
        return "index.xhtml";
    }
    
}
