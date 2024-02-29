package com.example;

import org.springframework.jdbc.core.JdbcTemplate;

public class CricketImplementation implements Cricket {
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Player player) {
        String query = "insert into cricket(id, name, state) values(?, ?, ?)";
        int result = this.jdbcTemplate.update(query, player.getId(), player.getName(), player.getState());
        if (result == 1) {
            System.out.println("Insert Successfully...");
        }
        return result;

    }

    @Override
    public int update(Player player) {
        String query = "update cricket set name = ?, state = ? where id = ?";
        int result = this.jdbcTemplate.update(query, player.getName(), player.getState(), player.getId());
        if (result == 1) {
            System.out.println("Update Successfully...");
        }
        return result;
    }

    @Override
    public int delete(int player_id) {
        String query = "DELETE FROM cricket WHERE id = ?";
        int result = this.jdbcTemplate.update(query, player_id);
        if (result == 1) {
            System.out.println("Delete Successfully...");
        }
        return result;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jsJdbcTemplate) {
        this.jdbcTemplate = jsJdbcTemplate;
    }

}
