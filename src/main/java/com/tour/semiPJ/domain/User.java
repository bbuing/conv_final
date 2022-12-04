package com.tour.semiPJ.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@Table(name = "finalpj_user")
@Entity
public class User {
    @Id
    private String userEmail;
    private String userPw;
    private String userName;
    private String userNick;
    private String userQuestion;
    private String userAnswer;
    private String userPhone;
    private String userLev;
    private String userProfile;
    private String userHeader;
    private String userInterest;
    private String userId;
}
