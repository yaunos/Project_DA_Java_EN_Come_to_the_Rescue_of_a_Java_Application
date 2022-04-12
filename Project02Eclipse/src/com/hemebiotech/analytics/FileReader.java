package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;


import java.util.List;
import java.util.Map;

public class Main { //please check AnalyticsCounter.java instead

    public static void main(){

        IEntreeSortie entreeSortie = new EntreeSortieFichierXML();

        ITraitement traitement = new TraitementTreeMap();

        // Lire dans un fichier
        List<String> donnes = entreeSortie.lireDonnes("fichier.xml");

        // Compter le nombre d'occurence des éléments
        Map<String, Integer> donnesCompte = traitement.compter(donnes);

        // Trier
        Map<String, Integer> donneesTriees =traitement.trier(donnesCompte);

        // Charger dans un autre fichier
        entreeSortie.sauvegarder(donneesTriees);

    }

}