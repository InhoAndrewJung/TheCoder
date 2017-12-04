<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>    
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no, user-scalable=no">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
<link rel="stylesheet" media="screen and (max-width:1024px)" href="resources/css/desktop.css">
<link rel="stylesheet" media="screen and (max-width:768px)" href="resources/css/tablet.css">
<link rel="stylesheet" media="screen and (max-width:320px)" href="resources/css/mobile.css">
<script src="resources/js/ace.js" type="text/javascript" charset="utf-8"></script>
<style type="text/css" media="screen">
    #codebox { 
        position: relative;

        width : 100%;
        height : 450px;
    }
</style>


	<title>Coding everywhere.</title>
</head>
<body>

<div class="container ">
<div class="row ">
			 <div class="col"> <br/><br/><a href="index.jsp" style="text-decoration:none;color:black;"><h1>The Coder</h1></a></div>
		</div>
		<div class="dropdown-divider"></div>

<!-- Custom row start -->		
<div class="crow">	
<br>
<!-- Question area start -->
<div class="alert alert-secondary" role="alert">
  <h4><strong>문제1 : A+B</strong></h4>
  <p>두 수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.</p>
  <h5><strong>입력</strong></h5>
  <p>첫째 줄에 A와 B가 주어진다.</p>
  <h5><strong>출력</strong></h5>
  <p>첫째 줄에 A+B를 출력한다.</p>
</div>
<!-- Question area start -->
<!-- code write area start -->
<form name="form" action="result" method="post">

    <label for="write-code" class="text-muted">코드 작성</label>
     <div class="form-group">
    <div id="codebox" name="code" >   import java.util.*;
	import java.io.*;
	
	
    public class code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		
		
		
		
		
	}
}
</div>
</div>

  

<div class="p-1 mb-1 bg-warning text-white">클래스 이름 code는 변경할 수 없습니다.</div>
<!-- <div class="p-1 mb-1 bg-success text-white">System.in은 추후 문제용으로 제공예정입니다.</div> -->
<!-- <div class="p-1 mb-1 bg-danger text-white">서버에 영향을 줄 수 있는 코드는 입력을 금지합니다.</div> -->
<input type="hidden" id="context" name="code"></input>
<span class="d-flex justify-content-end"><input type="submit" class="btn btn-primary" value="제출" onClick='getValue()'/></span>
</form>
<!-- code write area end -->
</div>
<!-- Custom row end -->
<div style="height:100px"></div>




<script>
    var editor = ace.edit("codebox");
    editor.setTheme("ace/theme/monokai");
    editor.getSession().setMode("ace/mode/java");
    document.getElementById('codebox').style.fontSize='15px';
    console.log(editor.getValue());
    
    function getValue(){
    	var editor = ace.edit("codebox");
    	$("#context").val(editor.getValue());
    }
</script>
</body>
</html>
