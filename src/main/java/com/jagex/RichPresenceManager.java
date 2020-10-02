package com.jagex;

import net.arikia.dev.drpc.DiscordEventHandlers;
import net.arikia.dev.drpc.DiscordRPC;
import net.arikia.dev.drpc.DiscordRichPresence;

import java.util.Timer;
import java.util.TimerTask;

public class RichPresenceManager extends Thread {
    private long startTime;
    private boolean ready;
    private Timer timer;

    public void run() { init(); }


    public void init() {
         shutdown();
         this.startTime = System.currentTimeMillis();
         System.out.println("Setting up Discord RPC");
         DiscordEventHandlers handlers = new DiscordEventHandlers();
         DiscordRPC.discordInitialize("394072894243864577", handlers, true, "");
         updateState("Client is starting up...", 0L);
         DiscordRPC.discordRunCallbacks();
         this.timer = new Timer();
         this.timer.schedule(new CallbackEvents(), 0L, 1000L);
    }

    public void shutdown() {
         System.out.println("Shutting down...");
         DiscordRPC.discordShutdown();
    }


    public void updateTime() { this.startTime = System.currentTimeMillis(); }


    public void login() {
        updateTime();
        updateState("In Lobby", 0L);
    }

    public void logout() {
        updateTime();
        updateState("In Lobby", 0L);
    }

    public void fullLogout() {
        updateTime();
        updateState("At Login", 0L);
    }

    public void updateStateWithTitle(String title, String details, long time) {
         DiscordRichPresence presence = new DiscordRichPresence();
         presence.details = details;
         presence.state = title;
         presence.largeImageKey = "logo";
         presence.largeImageText = "Description";
         presence.startTimestamp = this.startTime / 1000L;
         presence.endTimestamp = time;
         DiscordRPC.discordUpdatePresence(presence);
    }


    public void updateState(String details, long time) { updateStateWithTitle("Playing Cryogen", details, time); }



    public class CallbackEvents
            extends TimerTask
    {
        public void run() {
                DiscordRPC.discordRunCallbacks();
        }
    }
}
