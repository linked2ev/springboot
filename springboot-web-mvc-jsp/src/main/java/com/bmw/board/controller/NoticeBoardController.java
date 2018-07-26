package com.bmw.board.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("board")
public class NoticeBoardController {
	
	// @RequestParam 사용
	@RequestMapping("noticeBoardList.do")
	public ModelAndView noticeBoardList(HttpServletRequest req, @RequestParam Map<String, Object> commandMap) throws Exception{
	    ModelAndView mv = new ModelAndView();

	    //...데이터 처리
	    commandMap.put("menu", "개발팀 공지사항 게시판");
	    commandMap.put("no", "5");
	    
	    mv.addObject("data", commandMap);

	    return mv;
	}
	
	// @PathVariable 사용
    @RequestMapping(value="/{menu}/{no}", method=RequestMethod.GET)
    public ModelAndView noticeBoard(@PathVariable String menu, @PathVariable int no) {
    	ModelAndView mv = new ModelAndView();
    	
    	//...데이터 처리
        System.out.println("menu=" + menu + ", no=" + no);
        
        Map<String, Object> rmap= new HashMap<String, Object>();
        rmap.put("menu", menu);
        rmap.put("no", no);
	    
	    mv.addObject("data", rmap);

	    mv.setViewName("board/noticeBoardList");
        
        return mv;
    }
	
}
