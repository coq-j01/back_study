<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>ex08.jsp</title>
  </head>
  <body>
  포워딩된 페이지는 ex08.jsp입니다.<br>
  id 파라미터 값은 <%= request.getParameter("id") %> <br>
  pw 파라미터 값은 <%= request.getParameter("pw") %> <br>
  </body>
</html>