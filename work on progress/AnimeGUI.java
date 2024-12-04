/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.example.AnimeRegisterProject;

/**
 *
 * @author shaua
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AnimeGUI {

    private AnimeDAO animeDAO;
    private JFrame frame;
    private JTextField nameField;
    private JTextField genreField;
    private JCheckBox watchedCheck;
    private JCheckBox concludedCheck;
    private JTextField yearField;
    private JTextField episodesField;
    private JTextArea synopseArea;
    private JTextArea reviewArea;
    private JTextField rateField;
    
    public AnimeGUI(AnimeDAO animeDAO){
    
        this.animeDAO = animeDAO;
        createInterface();
    }
    
    private void createInterface(){
    
        frame = new JFrame("Register of Animes");
    }
}