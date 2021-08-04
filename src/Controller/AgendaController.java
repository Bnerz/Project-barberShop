/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.Servico;
import Servico.Correio;
import View.Agenda;
import java.util.ArrayList;

/**
 *
 * @author Abner Teixeira
 */
public class AgendaController {

    private final Agenda view;
    private final AgendaHelper helper;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }

    public void atualizarTabela() {
        // Buscar Lista com agendamentos do banco de dados
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();

        // exibir esta lista na View
        helper.preencherTabela(agendamentos);

    }

    public void atualizarCliente() {

        //Buscar cliente no banco de dados
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        
        //exibir cliente no combobox
        helper.preencherCliente(clientes);
        
                
    }
    
    public void atualizarServiço() {
        //buscar serviço no BD
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> servicos = servicoDAO.selectAll();
        //exibir servico no BD
        
        helper.preencherServicos(servicos);
        
    }
    
    public void atualizarValor(){
        
        Servico servico = helper.obterServico();
        helper.setarValor(servico.getValor());
    }

        
    public void agendar(){
        //buscar Objeto Agendamento da Tela
        Agendamento agendamento = helper.obterModelo();
        //Salvar o objeto no banco de dados     
        new AgendamentoDAO().insert(agendamento);
        Correio correio = new Correio();
        correio.notificarPorEmail(agendamento);
        
        //Inserir elemento na tabela
        atualizarTabela();
        helper.limparTela();
        
        
        
    }
}   
