package com.tour.semiPJ.repository

import com.tour.semiPJ.domain.Board
import com.tour.semiPJ.domain.dto.BoardDto
import org.springframework.data.jpa.repository.JpaRepository

interface BoardRepository : JpaRepository<Board, Long>{
    fun save(boardDto: BoardDto): Long
}