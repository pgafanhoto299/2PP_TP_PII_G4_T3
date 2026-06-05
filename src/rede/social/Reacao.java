/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rede.social;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author guga
 */
public class Reacao {
    private String[] reacoes = {"Trivial", "Dibinguile About you", "Vai dar tudo certo"};
    private LocalDateTime dataReac;
    private ArrayList<Integer> reagidor;

    public String[] getReacoes() {
        return reacoes;
    }

    public LocalDateTime getDataReac() {
        return dataReac;
    }

    public ArrayList<Integer> getReagidor() {
        return reagidor;
    }

    public void setReacoes(String[] reacoes) {
        this.reacoes = reacoes;
    }

    public void setDataReac(LocalDateTime dataReac) {
        this.dataReac = dataReac;
    }

    public void setReagidor(ArrayList<Integer> reagidor) {
        this.reagidor = reagidor;
    }
    
}
