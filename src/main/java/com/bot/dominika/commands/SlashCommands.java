/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bot.dominika.commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.OptionMapping;

/**
 *
 * @author Rajko
 */
public class SlashCommands extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        super.onSlashCommandInteraction(event); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        if (event.getName().equals("hello")) {
            event.reply("Hello").queue();
            
        } else if (event.getName().equals("heil")) {
            event.deferReply().queue();
            event.getHook().sendMessage("You just heiled you nazi brat.").queue();
            
        } else if (event.getName().equals("food")) {
            OptionMapping option = event.getOption("name");

            if (option == null) {
                event.reply("for some reason a food name was not provided").queue();
                return;
            }

            String favoriteFood = option.getAsString();

            event.reply("Your favorite food is " + favoriteFood).queue();
        } else if (event.getName().equals("sum")) {
            try {
                OptionMapping operand1 = event.getOption("operand1");
                OptionMapping operand2 = event.getOption("operand2");

                if (operand1 == null || operand2 == null) {
                    event.reply("no numbers were provided").queue();
                }
                int sum = operand1.getAsInt() + operand2.getAsInt();

                event.reply(operand1 + " + " + operand2 + " = " + sum).queue();
            } catch (Exception e) {
                System.out.println(e);
                event.reply("NOPE!!!").queue();
            }
        }
    }

}
