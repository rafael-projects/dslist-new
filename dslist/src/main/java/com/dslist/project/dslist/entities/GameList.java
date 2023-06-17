package com.dslist.project.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_game_list")
public class GameList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;


    public GameList() {

    }

    public GameList(Long id, String name) {
        this.id = id;
        this.name = name;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GameList gameList)) return false;

        if (!Objects.equals(id, gameList.id)) return false;
        return Objects.equals(name, gameList.name);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
