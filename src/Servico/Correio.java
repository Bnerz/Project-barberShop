/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servico;

import Model.Agendamento;

/**
 *
 * @author Student
 */
public class Correio {
    
    public void notificarPorEmail(Agendamento agendamento){
        
        String emailFormatado = formarEmail(agendamento);
        String destinatario = agendamento.getCliente().getEmail();
        
        // uso da classe de email
        Email email = new Email("Agendamento BarberShop",emailFormatado, destinatario);
        email.enviar();
}

    private String formarEmail(Agendamento agendamento) {
        String nomeCliente = agendamento.getCliente().getNome();
        String servico = agendamento.getServico().getDescricao();
        String dataAgendamento = agendamento.getDataFormatada();
        String horaAgendamentos = agendamento.getHoraFormatada();
        float valor = agendamento.getValor();
        
        return "Olá" + nomeCliente + " O seu agendamento para " 
                + servico 
                + "está marcado para dia: " 
                + dataAgendamento 
                + "às " 
                + horaAgendamentos 
                + "No valor total de R$: " 
                + valor 
                + "Obrigado";        
    }   
}