<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.input_wrap{
	padding: 5px 20px;
}
label{
    display: block;
    margin: 10px 0;
    font-size: 20px;	
}
input{
	padding: 5px;
    font-size: 17px;
}
textarea{
	width: 800px;
    height: 200px;
    font-size: 15px;
    padding: 10px;
}
.btn{
  	display: inline-block;
    font-size: 22px;
    padding: 6px 12px;
    background-color: #fff;
    border: 1px solid #ddd;
    font-weight: 600;
    width: 140px;
    height: 41px;
    line-height: 39px;
    text-align : center;
    margin-left : 30px;
    cursor : pointer;
}
.btn_wrap{
	padding-left : 80px;
	margin-top : 50px;
}
#delete_btn{
	background-color: #f3e3e7;
}
</style>
</head>
<body>

<h1>게시판 등록</h1>
<form action="/board/enroll" method="post">
	<div class="input_wrap">
		<label>Title</label>
		<input name="title">
	</div>
	<div class="input_wrap">
		<label>Content</label>
		<textarea rows="3" name="content"></textarea>
	</div>
	<div class="input_wrap">
		<label>Writer</label>
		<input name="writer">
	</div>
	
	<div class="btn_wrap">	
		<button class="btn">등록</button>
	</div>
</form>



</body>
</html>