package com.telegrambot.bot.telegramBot;

import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;

public class TelegramBot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {

        String message = update.getMessage().getText();
        System.out.println(message);
    }

    @Override
    public String getBotUsername() {
        return "Taxes";
    }

    @Override
    public String getBotToken() {
        return "1154258817:AAH72Ckt3PtGmJ49tW_GEdXFMDItfmgbdU";
    }
}
