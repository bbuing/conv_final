package com.tour.semiPJ.domain.dto

import javax.persistence.Column

data class BoardDto(
    var userId: String,
    var userNick: String,
    var boardTitle: String,
    var searchCard: String,
    var searchAdd: String,
    var boardRegion: String,
    var boardTransport: String,
    var boardStay: String,
    var boardTheme: String
)
