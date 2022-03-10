package com.jjang051.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApiController {

	@RequestMapping("/Corona.do")
	@ResponseBody
	public String apiCall(String date) throws Exception {
		
		StringBuilder urlBuilder = new StringBuilder(
				"http://openapi.data.go.kr/openapi/service/rest/Covid19/getCovid19SidoInfStateJson"); /* URL */
		urlBuilder.append("?" + URLEncoder.encode("serviceKey", "UTF-8")
				+ "=lg4zpY%2FyAnA67yLXnBcaerpTU8hvwY9j5KuRE0kHaha8MJ0UBplCWhZ%2BeN5CRgKsuYQOLXANNMyxn%2FqwWHLMtw%3D%3D"); /*
																															 * Service
																															 * Key
																															 */
		urlBuilder
				.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /* 페이지번호 */
		urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "="
				+ URLEncoder.encode("10", "UTF-8")); /* 한 페이지 결과 수 */
		urlBuilder.append("&" + URLEncoder.encode("startCreateDt", "UTF-8") + "="
				+ URLEncoder.encode(date, "UTF-8")); /* 검색할 생성일 범위의 시작 */
		urlBuilder.append("&" + URLEncoder.encode("endCreateDt", "UTF-8") + "="
				+ URLEncoder.encode(date, "UTF-8")); /* 검색할 생성일 범위의 종료 */
		urlBuilder.append("&" + URLEncoder.encode("_type", "UTF-8") + "="
				+ URLEncoder.encode("json", "UTF-8")); /* 검색할 생성일 범위의 종료 */
		URL url = new URL(urlBuilder.toString());
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "application/json");

		String json = null;
		if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
			json = StreamUtils.copyToString(conn.getInputStream(), StandardCharsets.UTF_8);
		} else {
			json = StreamUtils.copyToString(conn.getErrorStream(), StandardCharsets.UTF_8);
		}
		conn.disconnect();
		
		return json;
	}

}
