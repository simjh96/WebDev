package com.jjang051.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

	@GetMapping("/Parameter01.do")
	public String parameter01(HttpServletRequest request) {
		String data01 = request.getParameter("data01");
		String data02 = request.getParameter("data02");
		String data03 = request.getParameter("data03");
		System.out.println("data01===" + data01);
		System.out.println("data02===" + data02);
		System.out.println("data03===" + data03);
		return "parameter01";
	}

	@GetMapping("/Parameter02.do")
	public String parameter02(@RequestParam(value = "data01") int data01, @RequestParam(value = "data02") int data02,
			@RequestParam(value = "data03") int[] data03) {
		System.out.println("data01===" + data01);
		System.out.println("data02===" + data02);
		System.out.println("data03===" + data03);

		return null;
	}

	@GetMapping("/Parameter04.do")
	public String parameter04(int data01, int data02, int data03) {
		System.out.println("data01===" + data01);
		System.out.println("data02===" + data02);
		System.out.println("data03===" + data03);

		return null;
	}

	@GetMapping("/parameter/{data01}/{data02}/{data03}")
	public String parameter06(@PathVariable String data01, @PathVariable String data02, @PathVariable String data03) {
		System.out.println("data01===" + data01);
		System.out.println("data02===" + data02);
		System.out.println("data03===" + data03);

		return null;
	}

}
