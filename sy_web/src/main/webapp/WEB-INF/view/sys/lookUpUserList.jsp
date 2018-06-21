<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ include file="../ws/pageControl/jstlImport.jsp" %>
<div class="pageHeader">
	<form onsubmit="return dwzSearch(this,'dialog');" action="${pageContext.request.contextPath}/sys/lookUpUserList" method="post">
	<div class="searchBar">
		<table class="searchContent" style="float: left;">
			<tr>
				<td>
					账号名称：<input type="text" name="username" value=""/>
				</td>
			</tr>
		</table>
		<div class="subBar" style="float: right;">
			<ul>
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit">检索</button></div></div></li>
			</ul>
		</div>
	</div>
	</form>
</div>
<div class="pageContent">
	<div class="panelBar">
		<!--  
		<ul class="toolBar">
			<li><a class="add" href="${pageContext.request.contextPath}/sys/preadduser" target="dialog" title="添加帐号"  width="720" height="400"><span>添加</span></a></li>
			<li><a class="edit" href="${pageContext.request.contextPath}/sys/searchSysUserByUId/{sid_user}" target="dialog" title="修改账号" width="720" height="400"><span>修改</span></a></li>
			<li class="line">line</li>
		</ul>
		-->
	</div>
	<table class="table" width="100%" layoutH="112">
		<thead>
			<tr>
				<th width="8%">账号ID</th>
				<th width="20%">登录账号</th>
				<th width="15%">账号密码</th>
				<th width="20%">账号描述</th>
				<th width="10%">是否启用</th>
				<th width="10%">创建时间</th>
				<th width="10%">最后修改时间</th>
				<th width="5%">带回</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${userList}" var="user">
					<tr target="sid_user" rel="${user.id}">
						<td>${user["id"]}</td>
						<td>${user["username"]}</td>
						<td>${user["userpass"]}</td>
						<td>${user["userremark"] }</td>
						<td>${user["userstatus"]==1?"启用":"禁用" }</td>
						<td><fmt:formatDate value="${user.createTime }" pattern="yyyy-MM-dd HH:mm"/></td>
						<td><fmt:formatDate value="${user.updateTime }" pattern="yyyy-MM-dd HH:mm"/></td>
						<td><a class="btnSelect" href="javascript:$.bringBack({id:'${user.id }', userName:'${user.username}'})" title="查找带回">选择</a></td>
					</tr>
			</c:forEach>
		</tbody>
	</table>
	<c:import url="../ws/pageControl/paging.jsp" >
		<c:param name="action" value="${pageContext.request.contextPath}/sys/lookUpUserList"></c:param>
	</c:import>
</div>
