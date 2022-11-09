/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bot.dominika.commands;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nonnull;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/**
 *
 * @author Rajko
 */
public class AskCommand extends ListenerAdapter {

    @Override
    public void onMessageReceived(@Nonnull MessageReceivedEvent event) {
        if (event.getMessage().getContentRaw().contains("Dominika? povedz")) {
            String[] answers = {"Áno.\n" ,
"Nie.\n" ,
"Je to možné.\n" ,
"Je to veľmi pravdepodobné.\n" ,
"Akoby sa stalo.\n" ,
"Ani náhodou.\n" ,
"Určite.\n" ,
"Nebuď smiešny.\n",
"To ti teraz neviem povedať.\n" ,
"Pochybujem o tom.\n" ,
"Môžeš sa nato spoľahnúť.\n" ,
"Jedného dňa určite.\n" ,
"Je to veľmi nejasné.\n" ,
"S tým by som veľmi nepočítala.\n" ,
"Skôr áno než nie.\n" ,
"Nie je to isté.\n" ,
"Neviem vôbec.\n" ,
"Ťažká otázka.\n" ,
"Raz tomu tak bude.\n" ,
"Nepýtaj sa ma také kraviny.\n" ,
"Prečo ťa zaujíma, čo si myslím?\n" ,
"Istotne.\n" ,
"Istotne nie.\n" ,
"Pravdepodobne.\n" ,
"Sústreď sa a spýtaj sa znova lebo ti nie je rozumieť.\n" ,
"http://gph.is/2xcbvwM\n" ,
"http://gph.is/WArRsu\n" ,
"http://gph.is/1hRfkfc\n" ,
"http://gph.is/14nhiWP\n" ,
"https://gph.is/1g2S6R3\n" ,
"https://gph.is/g/aXYDgOe\n" ,
"http://gph.is/2ck0aO9\n" ,
"http://gph.is/1rhDgx0\n" ,
"http://gph.is/1xK7p6m\n" ,
"http://gph.is/2dBoAFs"};
            Random rand = new Random();
            event.getChannel().sendMessage(answers[rand.nextInt(answers.length)] + "").queue();
            
        }
    }

}
