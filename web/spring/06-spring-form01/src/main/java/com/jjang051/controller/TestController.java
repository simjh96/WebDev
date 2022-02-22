package com.jjang051.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jjang051.model.DataDto;
import com.jjang051.model.MemberDto;

@Controller
public class TestController {
	@GetMapping("/Test01.do")
	public String test01(MemberDto memberDto) {
		memberDto.setId("id");

		return "test01";
	}
	@GetMapping("/Form.do")
	public String form(MemberDto memberDto) {
		memberDto.setNo("no");
		
		return "test02";
	}
}
