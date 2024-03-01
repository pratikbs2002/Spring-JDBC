package com.example;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        ApplicationContext context = new ClassPathXmlApplicationContext("com/bean_config.xml");
        Cricket cricket = context.getBean("cricket", Cricket.class);
        // Player player = new Player(148, "Pratik Suthar", "Gujarat");
        // cricket.insert(player);
        // cricket.update(player);
        // cricket.delete(player.getId());
        // Player player = cricket.getPlayer(148);
        // System.out.println(player);

        List<Player> players = cricket.getAllPlayers();
        for (Player player : players) {
            System.out.println(player);
        }

    }
}
