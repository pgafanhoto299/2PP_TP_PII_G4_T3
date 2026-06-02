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
    private String email, id;
    private ArrayList<Utilizador> seguidores, seguindo;
    private LocalDate dataNasc;
    
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

    public ArrayList<Utilizador> getSeguidores() {
        return seguidores;
    }

    public ArrayList<Utilizador> getSeguindo() {
        return seguindo;
    }

    public LocalDate getDataNasc() {
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

    public void setSeguidores(ArrayList<Utilizador> seguidores) {
        this.seguidores = seguidores;
    }

    public void setSeguindo(ArrayList<Utilizador> seguindo) {
        this.seguindo = seguindo;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }
}
