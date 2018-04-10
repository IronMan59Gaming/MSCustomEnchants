package me.msce;

import me.msce.commands.test;
import org.bukkit.Server;
import org.bukkit.plugin.Plugin;

public class MainInitialisers {

    public static void commandSetup(Main main){
        main.getCommand("test").setExecutor(new test());
    }

    public static void eventSetup(Plugin plugin, Server server) {
        server.getPluginManager().registerEvents(new EnchanterClickEvent(), plugin);
    }

}
