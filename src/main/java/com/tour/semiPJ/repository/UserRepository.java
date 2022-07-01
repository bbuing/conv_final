package com.tour.semiPJ.repository;

import com.tour.semiPJ.domain.Board;
import com.tour.semiPJ.domain.User;

import java.util.List;

public interface UserRepository {
    // 회원 탈퇴
    User del(String email);
    //String sql = "delete from userTbl where user_email=?";

    //회원 가입
    User join(User user);

    //String sql = "insert into userTbl(user_name, user_nick,user_email,user_pw,user_question,user_answer,user_phone,user_interest) values(?,?,?,?,?,?,?,?)";
    //개인정보수정 위해 개인정보 불러오기
    User findByEmail(String email);

    //String sql = "select * from userTbl where user_email=?";
    //개인정보 수정
    User update(User user);

    //String sql = "update userTbl set user_nick = ?,user_pw= ?,user_question = ?,user_answer = ?, user_phone = ?, user_interest = ?, user_profile = ?, user_header=? where user_email=?";
    //id 찾기
    User findByName(User user);

    //String sql = "select user_email from userTbl where user_name = ? and user_nick =  ? and user_phone = ?";
    //비밀번호 1차 찾기 이름,별명,id,핸드폰 번호로 찾기
    User findPw1(User user);
    //String sql = "select user_email,user_question from userTbl where user_name = ? and user_nick =  ? and user_email = ? and user_phone = ?";
    //비밀번호 2차 찾기 입력한 질문&답변으로 검색
    User findPw2(User user);

    //String sql = "select user_answer from userTbl where user_email = '"+emp.getUser_email()+"'";
    User updatePw(User user);

    // 비밀번호 2차 인증까지 맞았다면 새로운 비밀번호로 변경
    //String sql = "update userTbl set user_pw = ? where user_email='"+emp.getUser_email()+"'";
    //로그인
    User login(User user);

    //String sql = "select user_name,user_nick, user_email, user_profile, user_header, user_id from userTbl where user_email=? and user_pw=?";
    // 내가 작성한 글 찾기, 작성한 글이 몇개가 있을지 모르기 때문에 벡터로 받아옴
    List<Board> findMyWrite(User user);

    //String sql = "SELECT  A.*, b.user_id, b.user_nick ,c.search_tag, C.search_card , C.search_add FROM boardTbl AS A INNER JOIN userTbl AS B INNER JOIN searchTbl AS C  ON A.user_id = ? && B.user_id = ? && c.user_id = ?;";
    //로그아웃
    User logout(User user);

    //String sql = "select user_email from userTbl where user_id=?";
    //내가 좋아요 누른 글 검색
    List<Board> findLikeWrite(User user);
    //String sql = "SELECT  A.*, b.user_nick ,c.board_click, C.board_like, D.user_like_board  FROM searchTbl AS A INNER JOIN userTbl AS B INNER JOIN boardTbl AS C INNER JOIN likeTbl AS D ON A.board_num = D.user_like_board = C.board_num && B.user_id = ? && D.user_id = ?";
}
