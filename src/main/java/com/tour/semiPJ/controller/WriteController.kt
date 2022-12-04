package com.tour.semiPJ.controller

import com.tour.semiPJ.domain.dto.BoardDto
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class WriteController {
    @PostMapping("/write")
    fun writeBoard(@RequestBody boardDto: BoardDto) : Long {
        println(boardDto)
        return 1
//    BasicBean basic = BasicBean.newInstance();
//    // 새로 설정한 번호로 이미지들을 저장할 폴더를 생성한다. 이때 생성한 폴더는 이후 Write페이지에서 저장하지 않고 취소하였을시 삭제하도록 한다.
//		basic.setPath(req, "upload/" + board_num);
//    String path = basic.getPath();
//    File folder = new File(path);
//		if(!folder.exists()) {
//        folder.mkdir();
//    }
//	    basic.setMax(50 * 1024 * 1024);
//	    basic.setEncType("UTF-8");
//
//    String param = req.getParameter("param");
//	    if(param == null) {
//        basic.setMulti(req);
//        param = basic.getMulti().getParameter("param");
//    }
//
//    String url ="";
//    Command command = null;
//    FactoryCommand factory = FactoryCommand.newInstance();
//    command = factory.createCommand(param,basic.getMulti());
//
//		try {url = (String)command.processCommand(req, resp);} catch (SerialException e) {System.out.println("WriteControl : " + e);}
//    RequestDispatcher view = req.getRequestDispatcher(url);
//		view.forward(req, resp);
    }
}