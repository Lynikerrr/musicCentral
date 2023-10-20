package br.com.alura.musicCentral.main;

public class main{
    public static void main(String[] args){
       
        //Musica Geminiano Djonga

        music Geminiano = new music();
        Geminiano.setTitle("Geminiano");
        Geminiano.setSinger("Djonga");

        for(int i = 0; i < 1000; i++){
            Geminiano.plays();
        }
        for(int i =0; i < 50; i++0){
            Geminiano.like();
        }

        // Musica Novo Balanço Veigh

        music veigh = new music();
        veigh.setTitle("Novo Balanço");
        veigh.setSinger("Veigh");

        for(int i = 0; i < 1000; i++){
            veigh.plays();
        }
        for(int i =0; i < 50; i++0){
            veigh.like();
        }

        // Musica M4 Teto

        music teto = new music();
        teto.setTitle("M4");
        teto.setSinger("Teto");

        for(int i = 0; i < 1000; i++){
            teto.plays();
        }
        for(int i =0; i < 50; i++0){
            teto.like();
        }

        // Podpah Podcast

        podcast Podpah = new podcast();
        Podpah.setTitle("PodPah");
        PodPah.setHost("Igão e Mitico");

        for(int i = 0; i < 1000; i++){
            Podpah.plays();
        }
        for(int i = 0; i < 500; i++){
            PodPah.like();
        }

        podcast sacani = new podcast();
        sacani.setTitle("Ciencia sem Fim");
        sacani.setHost("Sergio Sacani");

        for(int i = 0; i < 1000; i++){
            sacani.plays();
        }
        for(int i = 0; i < 500; i++){
            sacani.like();
        }

        // AudioBook O Homem mais rico da Babilônia

        audiobook Book = new audiobook();
        Book.setTitle("O homem mais rico da Babilônia");
        Book.setAuthor("George Samuel Clason");
        Book.setTheme("Finanças");

        for(int i = 0; i < 1000; i++){
            Book.plays();
        }

        // AudioBook Pai rico, Pai pobre

        audiobook Book1 = new audiobook();
        Book1.setTitle("Pai rico, Pai pobre");
        Book1.setAuthor("Robert T. Kiyosaki");
        Book1.setTheme("Finanças");

        for(int i = 0; i < 1000; i++){
            Book.plays();
        }
        
        // Utilização da classe de preferencias

        preferences userPreference = new preferences();
        userPreference.include(PodPah);
        userPreference.include(sacani)
        userPreference.include(Geminiano);
        userPreference.include(teto);
        userPreference.include(veigh);
        userPreference.include(Book);
        userPreference.include(Book1);
    }

}
