package com.tour.semiPJ.domain

import lombok.Getter
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Getter
@Table(name = "finalpj_board")
@Entity
class Board(
    @Column(nullable = false)
    val userId: String,
    @Column(nullable = false)
    val userNick: String,
    @Column(nullable = false)
    val boardTitle: String,
    @Column(nullable = false)
    val searchCard: String,
    @Column(nullable = false)
    val searchAdd: String,
    @Column(nullable = false)
    val boardRegion: String,
    @Column(nullable = false)
    val boardTransport: String,
    @Column(nullable = false)
    val boardStay: String,
    @Column(nullable = false)
    val boardTheme: String
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val boardNum: Long? = 0
//    private val searchTag: String? = null
//    private val boardHeader: String? = null
    private val boardClick = 0
    private val boardLike = 0
}