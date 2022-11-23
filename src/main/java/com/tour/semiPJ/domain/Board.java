package com.tour.semiPJ.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Data
@Entity
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String boardNum;
    private String userId;
    private String userNick;
    private String boardTitle;
    private String searchCard;
    private String searchAdd;
    private String boardRegion;
    private String boardTransport;
    private String boardStay;
    private String boardTheme;
    private String searchTag;
    private String boardHeader;
    private int boardClick;
    private int boardLike;

}
