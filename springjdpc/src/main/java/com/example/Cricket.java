package com.example;

import java.util.List;

public interface Cricket {
    public int insert(Player player);

    public int update(Player player);

    public int delete(int player_id);

    public Player getPlayer(int player_id);

    public List<Player> getAllPlayers();
}
