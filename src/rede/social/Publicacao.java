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
public class Publicacao {
    private Utilizador remetente;
    private StringBuilder conteudo;
    private LocalDate dataEnvio;

    public Utilizador getRemetente() {
        return remetente;
    }

    public StringBuilder getConteudo() {
        return conteudo;
    }

    public LocalDate getDataEnvio() {
        return dataEnvio;
    }

    public void setRemetente(Utilizador remetente) {
        this.remetente = remetente;
    }

    public void setConteudo(StringBuilder conteudo) {
        this.conteudo = conteudo;
    }

    public void setDataEnvio(LocalDate dataEnvio) {
        this.dataEnvio = dataEnvio;
    }
    
    
}
