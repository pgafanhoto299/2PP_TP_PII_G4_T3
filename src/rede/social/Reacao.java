/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rede.social;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author guga
 */
public class Reacao {
    private String[] reacoes = {"Trivial", "Dibinguile About you", "Vai dar tudo certo"};
    private LocalDate dataReac;
    private ArrayList<Utilizador> reagidor;

    public String[] getReacoes() {
        return reacoes;
    }

    public LocalDate getDataReac() {
        return dataReac;
    }

    public ArrayList<Utilizador> getReagidor() {
        return reagidor;
    }

    public void setReacoes(String[] reacoes) {
        this.reacoes = reacoes;
    }

    public void setDataReac(LocalDate dataReac) {
        this.dataReac = dataReac;
    }

    public void setReagidor(ArrayList<Utilizador> reagidor) {
        this.reagidor = reagidor;
    }
    
}
