package Conductores;

import Conductores.Bottelegram.PokemonBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Main {

public static void main (String[] args) {

    try{
        TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
        PokemonBot poke=new PokemonBot();
        botsApi.registerBot(poke);
        System.out.println("EL bot esta funcionando.........mandar:/pokemon pikachu");
    }
    catch(Exception ex){
        System.out.println("error"+ex .getMessage());
    }
}
}

