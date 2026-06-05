/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rede.social;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author guga
 */
public class Utilizador {
    private StringBuilder senha, username;
    private String email, id, dataNasc;
    private ArrayList<Integer> seguidores, seguindo;
    private LocalDate dataCriac;

    public LocalDate getDataCriac() {
        return dataCriac;
    }

    public void setDataCriac(LocalDate dataCriac) {
        this.dataCriac = dataCriac;
    }
    
    
    public StringBuilder getSenha() {
        return senha;
    }

    public StringBuilder getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Integer> getSeguidores() {
        return seguidores;
    }

    public ArrayList<Integer> getSeguindo() {
        return seguindo;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setSenha(StringBuilder senha) {
        this.senha = senha;
    }

    public void setUsername(StringBuilder username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSeguidores(ArrayList<Integer> seguidores) {
        this.seguidores = seguidores;
    }

    public void setSeguindo(ArrayList<Integer> seguindo) {
        this.seguindo = seguindo;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Utilizador(StringBuilder senha, StringBuilder username, String email, String id, String dataNasc) {
        this.senha = senha;
        this.username = username;
        this.email = email;
        this.id = id;
        this.seguidores = new ArrayList<>();
        this.seguindo = new ArrayList<>();
        this.dataNasc = dataNasc;
        this.dataCriac = LocalDate.now();
    }
    
    
}
