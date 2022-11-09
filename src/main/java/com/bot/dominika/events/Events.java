/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bot.dominika.events;

import javax.annotation.Nonnull;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/**
 *
 * @author Rajko
 */
public class Events extends ListenerAdapter {

    @Override
    public void onMessageReceived(@Nonnull MessageReceivedEvent event) {
                
        if (!event.getAuthor().isBot()) {
            String message = event.getMessage().getContentRaw();
            //event.getTextChannel().sendMessage(message).queue(); //Sending a message
            
        }

    }
}
