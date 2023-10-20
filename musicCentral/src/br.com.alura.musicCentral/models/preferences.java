package br.com.alura.musicCentral.models;

public class preferences{

    public void include(audio audio){
        if(audio.getClassification() >=9){
            System.out.println(audio.getTitle() + " está entre as minhas preferidas!!")
        }else{
            System.out.println(audio.getTitle() + " é uma otima opção para conhecer mais tarde");
        }
    }
}