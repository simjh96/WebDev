<%@page import="java.sql.Date"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.simjh96.jdbc.JDBCConnection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="./include/header.jsp"  %>
<% 
	JDBCConnection jdbc = new JDBCConnection();
	PreparedStatement pstmt = jdbc.pstmt;
	Connection conn = jdbc.conn;
	ResultSet rs = null;
		
	String sql = "SELECT * FROM NOTICE";
	pstmt = conn.prepareStatement(sql);
	rs = pstmt.executeQuery();
%>

  <body>
    <div id="mainVisual">
      <ul class="swiper-wrapper visualList">
        <li class="visual01 swiper-slide">
          <div class="img"></div>
          <div class="slogan">
            <p><span>PRUGIO ART HALL</span></p>
            <p><span>TO NEW MISSION</span></p>
          </div>
        </li>
        <li class="visual02 swiper-slide">
          <div class="img"></div>
          <div class="slogan">
            <p><span>PRUGIO ART HALL</span></p>
            <p><span>TO NEW MISSION</span></p>
          </div>
        </li>
      </ul>
      <button class="btn prev"><img src="images/prev_bx.png" alt="" /></button>
      <button class="btn next"><img src="images/next_bx.png" alt="" /></button>
      <div class="pagination"></div>
    </div>
    <!--mainVisual end-->
    <div id="motto" class="section">
      <div class="container">
        <div class="title"></div>
        <div class="contents">
          <p class="main">
            SHARING PLACE TO SHARE JOY AND <br />
            IMPRESSION THROUGH CULTURAL ART
            <a href="">more view</a>
          </p>
          <p class="sub">
            문화예술을 통한 즐거움과 감동을 공유하는 나눔터 <br />
            푸르지오는 깨끗함, 싱그러움을 표현하는 "푸르다"라는 <br />
            순우리말에 대지, 공간을 뜻하는 "GEO"를 결합하는 것으로 <br />
            사람, 자연, 그리고 환경이 하나 된 차원 높은 생활 문화 공간을 의미한다.
          </p>
        </div>
      </div>
    </div>

    <div id="notice" class="section">
      <div class="container">
        <div class="title">
          <h2>
            <span class="kor"><a>공지사항</a></span>
            <span class="eng">Notice</span>
          </h2>
          <p>푸르지오아트홀 소식입니다.</p>
        </div>
        <div class="contents">
          <ul>
          <%
          	int i = 0;
          	System.out.println(rs.next());
          	System.out.println("==================");
          	while (rs.next() && i<3) {
          		System.out.println(i);  
          		System.out.println("printing li tags");
          		String title = rs.getString("TITLE");
          		String content = rs.getString("CONTENT");
          		String regdate = rs.getString("REGDATE");
          		System.out.println(regdate);
%>
              <li>
              <a href="">
                <div class="dateBox">
                  <span class="date"><%=regdate.substring(8, 10)%></span>
                  <span class="year"><%=regdate.substring(2, 4)%>.<%=regdate.substring(5, 7)%></span>
                </div>
                <div class="desc">
                  <p><%=title%></p>
                </div>
              </a>
              <div class="answer">
                <%=content%>
              </div>
            </li>
<%          		
          		i++;
          	}
          	System.out.println("==================");
          	jdbc.close();
          %>
          </ul>
        </div>
      </div>
    </div>
  </body>
<%@ include file="./include/footer.jsp"  %>






