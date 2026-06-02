/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rede.social;

import java.time.LocalDate;

/**
 *
 * @author guga
 */
public class Mensagem {
    private StringBuilder conteudo;
    private Utilizador remetente, destinatario;
    private LocalDate dataEnvio;

    public StringBuilder getConteudo() {
        return conteudo;
    }

    public Utilizador getRemetente() {
        return remetente;
    }

    public Utilizador getDestinatario() {
        return destinatario;
    }

    public LocalDate getDataEnvio() {
        return dataEnvio;
    }

    public void setConteudo(StringBuilder conteudo) {
        this.conteudo = conteudo;
    }

    public void setRemetente(Utilizador remetente) {
        this.remetente = remetente;
    }

    public void setDestinatario(Utilizador destinatario) {
        this.destinatario = destinatario;
    }

    public void setDataEnvio(LocalDate dataEnvio) {
        this.dataEnvio = dataEnvio;
    }
    
    
}
