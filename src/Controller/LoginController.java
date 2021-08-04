/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;
import View.MenuPrincipal;

/**
 *
 * @author Abner Teixeira
 */
public class LoginController {
    
    private final Login view;
    private LoginHelper helper;
    
    public LoginController(Login view){
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNosistema(){
        //pegar o usuario da view
        //pesquisar o usuario no Banco
        //Se o usuario tiver o mesmo usuario e senha que o usuario do banco direcionar para o meu menu
        //Senao mostrar uma mensagem ao usuario com Usuario ou senha invalidos;
        
                
    }
    
    
    public void entrarNoSistema(){
        //pegar um usuário da view
        Usuario usuario = helper.obterModelo();
        //Pesquisar o usuário no banco
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
        //Se o usuário da view estiver o mesmo usuário e senha vindo do banco redirecionar para o menu;
      
        //Senão mostrar uma mensgem para o usuário ou senha inválidos
        if(usuarioAutenticado != null){
            //navegar para o menu principal
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose();
        }else{
            view.exibeMensagem("Usuário ou senha invalidos");
        }
        
        
        
        
    }
    
    
    
    
    
    public void fizTarefa(){
        System.out.println("Busquei algo no banco de dados");
        
        this.view.exibeMensagem("Executei o fiz Tarefa");
        
    }
        
    }
    

