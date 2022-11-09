/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bot.dominika;

import com.bot.dominika.commands.AskCommand;
import com.bot.dominika.commands.SlashCommands;
import com.bot.dominika.events.Events;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.interactions.commands.OptionType;

/**
 *
 * @author Rajko
 */
public class Main {
    public static void main(String[] args) throws Exception {
       JDA jda = JDABuilder.createDefault("MTAyNjExMzMzMzUzNzAzNDMyMA.GkwuLh.AXlW698-2LxtpHJiaKXrqESefeOjm7mfU1J7fo")
               .setActivity(Activity.playing(".")) 
               .addEventListeners(new SlashCommands())
               .addEventListeners(new Events())
               .addEventListeners(new AskCommand())
               .build().awaitReady(); 

       //-----------------SLASH COMMANDS----------------------------------------
       
            jda.upsertCommand("hello","hello very hard").queue();   
            jda.upsertCommand("heil","Heils").queue();
            jda.upsertCommand("food","Name your favorite food").addOption(OptionType.STRING, "name", "name of your favorite food ",true).queue();
            jda.upsertCommand("sum","add 2 numbers")
                    .addOption(OptionType.INTEGER, "operand1", "the first number",true)
                    .addOption(OptionType.INTEGER, "operand2", "second number",true).queue(); 
        
       //-----------------------------------------------------------------------
       
       
    }
}
