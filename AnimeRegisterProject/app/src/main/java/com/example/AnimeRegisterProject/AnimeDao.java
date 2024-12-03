/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.AnimeRegisterProject;

import java.util.List;

public interface AnimeDao {

  // Method to save an Anime object (including table creation if not exists)
  public void saveAnime(Anime anime) throws Exception;

  // Method to retrieve all Anime objects

    /**
     *
     * @return
     * @throws Exception
     */
  public List<Anime> getAllAnimes() throws Exception;
}
