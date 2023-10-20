package br.com.alura.musicCentral.models;

public class audiobook extends audio{
    private String author;
    private String theme;
    private int pages;

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void getTheme(String theme){
        this.theme = theme;
    }
    public void getPages(int pages){
        this.pages = pages;
    }

    @Override
    public int getClassification(){
        if(this.getTotalPlays() > 2000){
            return 10;
        }else{
            return 7;
        }
    }

}
