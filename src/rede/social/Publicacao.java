/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rede.social;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author guga
 */
public class Publicacao {
    private int remetenteID;
    private String conteudo;
    private LocalDateTime dataEnvio;

    public int getRemetente() {
        return remetenteID;
    }

    public String getConteudo() {
        return conteudo;
    }

    public LocalDateTime getDataEnvio() {
        return dataEnvio;
    }

    public void setRemetente(int remetenteID) {
        this.remetenteID = remetenteID;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public void setDataEnvio(LocalDateTime dataEnvio) {
        this.dataEnvio = dataEnvio;
    }
    
    
}
