/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.example.AnimeRegisterProject;

/**
 *
 * @author shaua
 */
import java.util.ArrayList;
import java.util.Scanner;

class Anime {
    private String name;
    private String genre;
    private Boolean watched;
    private Boolean status;
    private Short year;
    private Byte episodes;
    private String synopse;
    private String review;
    private Float rate;

    public Anime (String name, String genre, Boolean watched, Boolean status, Short year, Byte episodes, String synopse, String review, Float rate) {
        this.name = name;
        this.genre = genre;
        this.watched = watched;
        this.status = status;
        this.year = year;
        this.episodes = episodes;
        this.synopse = synopse;
        this.review = review;
        this.rate = rate;
    }
    
    public String getName() {
        return name;
    }
    
    public String getGenre(){
        return genre;
    }
    
    public Boolean getWatched(){
        return watched;
    }

    public Boolean getStatus(){
        return status;
    }

    public Short getYear(){
        return year;
    }
    
    public Byte getEpisodes(){
        return episodes;
    }
            
    public String getSynopse(){
        return synopse;
    }
            
    public String getReview() {
        return review;
    }        
            
    public Float getRate(){
        return rate;
    }
    
    public String getWatchedStatus(){
        return watched ? "It was already watched" : "I want to watch it";
    }
    
    public String getStatusType(){
        return status ? "Concluded" : "On Going";
    }
    
}

public class Register {
    private static ArrayList<Anime> animes = new ArrayList<>();
    private static Scanner scanner = new Scanner (System.in);
    
    public static void main (String[] args){
        while (true){
            System.out.println();
            System.out.println("1. Add Anime");
            System.out.println("2. List all Animes");
            System.out.println("3. List 'Animes that I want to watch'");
            System.out.println("4. List 'Animes that I already watched'");
            System.out.println("5. Quit");
            System.out.println("Select one option: ");
            int option = Integer.parseInt(scanner.nextLine());
            System.out.println();

            
            switch (option){
                case 1: 
                    registerAnime();
                    break;
                case 2: 
                    listAnime();
                    break;
                case 3:
                    listWantAnime();
                    break;
                case 4:
                    listWatchedAnime();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("the option is not valid.");
            }
        }    
    }
    
    private static void registerAnime(){
        
        System.out.print("Insert the Anime's name: ");
        String name = scanner.nextLine();
        
        System.out.print("Insert the Anime's gender: ");
        String genre = scanner.nextLine();
        
        System.out.println("Did you already watch this anime? (yes/no): ");
        Boolean watched = scanner.nextLine().equalsIgnoreCase("yes");
    
        System.out.print("Is the anime concluded? (yes/no): ");
        Boolean status = scanner.nextLine().equalsIgnoreCase("yes");
        
        System.out.print("Year: ");
        Short year = Short.parseShort(scanner.nextLine());
        
        System.out.print("episodes: ");
        Byte episodes = Byte.parseByte(scanner.nextLine());

        System.out.print("Synopse: ");
        String synopse = scanner.nextLine();
        
        System.out.print("Personal Review: ");
        String review = scanner.nextLine(); 
        
        System.out.print("Your rate to this anime: ");
        Float rate = Float.parseFloat(scanner.nextLine());
        


        
        
        
       Anime anime = new Anime (name, genre, watched, status, year, episodes, synopse, review, rate);
       animes.add(anime);
       System.out.println("Anime sucessfully registered");
    }
    
    private static void listAnime(){
        if (animes.isEmpty()){
            
            System.out.println("Anime was not found");
        
        } else {
        
            for (int i = 0; i < animes.size(); i++) {
                Anime anime = animes.get(i);
            
                System.out.println("Anime " + (i + 1));
                System.out.println("Name: " + anime.getName());
                System.out.println();
            }
        }
            
            }
    
    private static void listWatchedAnime() {
        if (animes.stream().noneMatch(Anime::getWatched)){
            
            System.out.println("There are no animes registered in this list");
        } else {
            
            animes.stream()
                    
                .filter(Anime::getWatched)
                .forEach(anime->{

                    System.out.println("Name: " + anime.getName());
                    System.out.println();
                    });
    }
        }
    
    private static void listWantAnime() {
        if (animes.stream(). allMatch(Anime::getWatched)){
            
            System.out.println("There are no animes registered in this list");
        } else {
            
            animes.stream()
                    
                .filter(anime -> !anime.getWatched())
                .forEach(anime ->{
  
                    System.out.println("Name: " + anime.getName());
                    System.out.println();
                                  
                });

}
    
}
}
