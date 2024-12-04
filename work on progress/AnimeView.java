/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.example.AnimeRegisterProject;

/**
 *
 * @author shaua
 */
import java.util.List;

public class AnimeView {

    public void showMenu() {
            System.out.println();
            System.out.println("1. Add Anime");
            System.out.println("2. List all Animes");
            System.out.println("3. List 'Animes that I want to watch'");
            System.out.println("4. List 'Animes that I already watched'");
            System.out.println("5. Quit");
            System.out.println("Select one option: ");
    }

    public void showAnime(Anime anime) {
        System.out.println("Anime: " + anime.getName());
        System.out.println("Genre: " + anime.getGenre());
        System.out.println("Watched: " + anime.getWatchedStatus());
        System.out.println("Status: " + anime.getStatusType());
        System.out.println("Year: " + anime.getYear());
        System.out.println("Episodes: " + anime.getEpisodes());
        System.out.println("Sinopse: " + anime.getSynopse());
        System.out.println("Review: " + anime.getReview());
        System.out.println("rate: " + anime.getRate());
        System.out.println();
    }

    public void showAnimes(List<Anime> animes) {
        for (int i = 0; i < animes.size(); i++) {
            Anime anime = animes.get(i);
            System.out.println("Anime " + (i + 1));
            showAnime(anime);
        }
    }

    public void showMensage(String mensage) {
        System.out.println(mensage);
    }

    public void showError(String error) {
        System.out.println("Error: " + error);
    }
}
