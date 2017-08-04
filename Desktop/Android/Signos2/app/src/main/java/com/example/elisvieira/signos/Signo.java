package com.example.elisvieira.signos;

import java.io.Serializable;

/**
 * Created by elisvieira on 03/08/2017.
 */

public class Signo implements Serializable {

    private int diainicio;
    private int diafim;
    private int mesinicio;
    private int mesfim;
    private String nome;
    private String imagem;


    public Signo (){

    }

    //sobrecarga de construtor
    public Signo (int diainicio, int mesinicio, int diafim,  int mesfim, String nome, String imagem){

        this.diainicio = diainicio;
        this.mesinicio = mesinicio;
        this.diafim = diafim;
        this.mesfim = mesfim;
        this.nome = nome;
        this.imagem = imagem;
    }

    public int getDiainicio() {return diainicio;}

    public int getDiafim() {return diafim;}

    public int getMesinicio() {return mesinicio;}

    public int getMesfim() {return mesfim;}

    public String getNome() {return nome;}

    public String getImagem() {return imagem;}


}
