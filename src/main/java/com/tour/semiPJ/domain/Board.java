package com.tour.semiPJ.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String board_num;
    private String user_id;
    private String user_nick;
    private String board_title;
    private String search_card;
    private String search_add;
    private String board_region;
    private String board_transport;
    private String board_stay;
    private String board_theme;
    private String search_tag;
    private String board_header;
    private int board_click;
    private int board_like;

    public String getBoard_num() {
        return board_num;
    }

    public void setBoard_num(String board_num) {
        this.board_num = board_num;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_nick() {
        return user_nick;
    }

    public void setUser_nick(String user_nick) {
        this.user_nick = user_nick;
    }

    public String getBoard_title() {
        return board_title;
    }

    public void setBoard_title(String board_title) {
        this.board_title = board_title;
    }

    public String getSearch_card() {
        return search_card;
    }

    public void setSearch_card(String search_card) {
        this.search_card = search_card;
    }

    public String getSearch_add() {
        return search_add;
    }

    public void setSearch_add(String search_add) {
        this.search_add = search_add;
    }

    public String getBoard_region() {
        return board_region;
    }

    public void setBoard_region(String board_region) {
        this.board_region = board_region;
    }

    public String getBoard_transport() {
        return board_transport;
    }

    public void setBoard_transport(String board_transport) {
        this.board_transport = board_transport;
    }

    public String getBoard_stay() {
        return board_stay;
    }

    public void setBoard_stay(String board_stay) {
        this.board_stay = board_stay;
    }

    public String getBoard_theme() {
        return board_theme;
    }

    public void setBoard_theme(String board_theme) {
        this.board_theme = board_theme;
    }

    public String getSearch_tag() {
        return search_tag;
    }

    public void setSearch_tag(String search_tag) {
        this.search_tag = search_tag;
    }

    public String getBoard_header() {
        return board_header;
    }

    public void setBoard_header(String board_header) {
        this.board_header = board_header;
    }

    public int getBoard_click() {
        return board_click;
    }

    public void setBoard_click(int board_click) {
        this.board_click = board_click;
    }

    public int getBoard_like() {
        return board_like;
    }

    public void setBoard_like(int board_like) {
        this.board_like = board_like;
    }
}
