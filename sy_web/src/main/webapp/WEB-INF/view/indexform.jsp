<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="utf-8" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>薇汀企业管理中心</title>
<link href="${pageContext.request.contextPath}/public/themes/default/style.css" rel="stylesheet" type="text/css" media="screen"/>
<link href="${pageContext.request.contextPath}/public/themes/css/core.css" rel="stylesheet" type="text/css" media="screen"/>
<link href="${pageContext.request.contextPath}/public/themes/css/print.css" rel="stylesheet" type="text/css" media="print"/>
<link href="${pageContext.request.contextPath}/public/uploadify/css/uploadify.css" rel="stylesheet" type="text/css" media="screen"/>
<link href="${pageContext.request.contextPath}/css/styles.css" type="text/css" media="all" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/css/skitter.styles.css" type="text/css" media="all" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/css/core.css" type="text/css" rel="stylesheet" />
<!--[if IE]>
<link href="themes/css/ieHack.css" rel="stylesheet" type="text/css" media="screen"/>
<![endif]-->

<!--[if lte IE 9]>
<script src="js/speedup.js" type="text/javascript"></script>
<![endif]-->

<script src="${pageContext.request.contextPath}/public/js/jquery-1.7.2.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/public/js/jquery.cookie.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/public/js/jquery.validate.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/public/js/jquery.bgiframe.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/public/xheditor/xheditor-1.2.1.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/public/xheditor/xheditor_lang/zh-cn.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/public/uploadify/scripts/jquery.uploadify.js" type="text/javascript"></script>

<!-- svg图表  supports Firefox 3.0+, Safari 3.0+, Chrome 5.0+, Opera 9.5+ and Internet Explorer 6.0+ -->
<script type="text/javascript" src="${pageContext.request.contextPath}/public/chart/raphael.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/public/chart/g.raphael.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/public/chart/g.bar.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/public/chart/g.line.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/public/chart/g.pie.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/public/chart/g.dot.js"></script>

<script src="${pageContext.request.contextPath}/public/js/dwz.core.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/public/js/dwz.util.date.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/public/js/dwz.validate.method.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/public/js/dwz.regional.zh.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/public/js/dwz.barDrag.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/public/js/dwz.drag.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/public/js/dwz.tree.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/public/js/dwz.accordion.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/public/js/dwz.ui.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/public/js/dwz.theme.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/public/js/dwz.switchEnv.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/public/js/dwz.alertMsg.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/public/js/dwz.contextmenu.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/public/js/dwz.navTab.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/public/js/dwz.tab.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/public/js/dwz.resize.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/public/js/dwz.dialog.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/public/js/dwz.dialogDrag.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/public/js/dwz.sortDrag.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/public/js/dwz.cssTable.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/public/js/dwz.stable.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/public/js/dwz.taskBar.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/public/js/dwz.ajax.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/public/js/dwz.pagination.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/public/js/dwz.database.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/public/js/dwz.datepicker.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/public/js/dwz.effects.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/public/js/dwz.panel.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/public/js/dwz.checkbox.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/public/js/dwz.history.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/public/js/dwz.combox.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/public/js/dwz.print.js" type="text/javascript"></script>
<!--<script src="bin/dwz.min.js" type="text/javascript"></script>-->
<script src="${pageContext.request.contextPath}/public/js/dwz.regional.zh.js" type="text/javascript"></script>
<!-- 省市区级联 -->
<script type="text/javascript" src="${pageContext.request.contextPath}/scripts/jquery.provincesCity.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/scripts/provincesdata.js"></script>
<!-- 处理图片上传 -->
<script type="text/javascript" src="${pageContext.request.contextPath}/scripts/ajaxfileupload.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/scripts/indexCore.js"></script>
</head>

<body scroll="no">
	<div id="layout">
		<div id="header">
			<div class="headerNav">
				<%-- <a class="logo" href="http://www.fdmaster.com" target="_blank">标志</a> --%>
				<!-- <span class="logo1" id="mylogo"></span> --><span class="logo2">薇汀企业管理中心</span>
				<ul class="nav">
					<li><font color="#fff">您好：${username}</font></li>
					<li><a href="http://www.wedoss.com" target="_blank">官网</a></li>
					<li><a href="login.jsp">退出</a></li>
				</ul>
				<ul class="themeList" id="themeList">
					<li theme="default"><div class="selected">蓝色</div></li>
					<li theme="green"><div>绿色</div></li>
					<!--<li theme="red"><div>红色</div></li>-->
					<li theme="purple"><div>紫色</div></li>
					<li theme="silver"><div>银色</div></li>
					<li theme="azure"><div>天蓝</div></li>
				</ul>
			</div>
			<!-- navMenu -->
		</div>

		<div id="leftside">
			<div id="sidebar_s">
				<div class="collapse">
					<div class="toggleCollapse"><div></div></div>
				</div>
			</div>
			<div id="sidebar">
				<div class="toggleCollapse"><h2>主菜单</h2><div>收缩</div></div>
				<div class="accordion" fillSpace="sidebar">
					<c:forEach items="${requestScope.menuList }" var="m">
						<c:if test="${m.smFatherid==1 && m.smId>1 }">
							<div class="accordionHeader">
								<h2><span>Folder</span>${m.smName }</h2>
							</div>
							<div class="accordionContent">
							    <ul class="tree treeFolder">
								    <c:forEach items="${menuList}" var="n">
										<c:if test="${n.smFatherid==m.smId }">
											<li><a href="${pageContext.request.contextPath}/${n.smUri}" target="navTab" rel="${n.smRel }">${n.smName }</a></li>
										</c:if>
									</c:forEach>
								</ul>
							</div>
						</c:if>
					</c:forEach>			
				</div>
			</div>
		</div>
		<div id="container">
			<div id="navTab" class="tabsPage">
				<div class="tabsPageHeader">
					<div class="tabsPageHeaderContent"><!-- 显示左右控制时添加 class="tabsPageHeaderMargin" -->
						<ul class="navTab-tab">
							<li tabid="main" class="main"><a href="javascript:;"><span><span class="home_icon">我的主页</span></span></a></li>
						</ul>
					</div>
					<div class="tabsLeft">left</div><!-- 禁用只需要添加一个样式 class="tabsLeft tabsLeftDisabled" -->
					<div class="tabsRight">right</div><!-- 禁用只需要添加一个样式 class="tabsRight tabsRightDisabled" -->
					<div class="tabsMore">more</div>
				</div>
				<ul class="tabsMoreList">
					<li><a href="javascript:;">我的主页</a></li>
				</ul>
				
				<div class="navTab-panel tabsPageContent layoutBox">
					<div class="page unitBox" style="overflow-x:hidden; width: 100%;border: 0px red solid;" layoutH="2">
						<div style="width: 47%; border: 1px solid #e66; margin:5px ;margin-left:15px; float: left; min-height: 100px;border: 0px solid red;">
							<div style=" margin: 5px;" class="panel" defH="210">
								<h1>企业简介<a href="${pageContext.request.contextPath}/ws/showAbout" target="navTab" class="genduo" title="公司简介">更多>></a></h1>
								<div style="background-color: #ffffff">
									<table width="100%">
										<tr>
											<td align="center" style="vertical-align: middle; width: 100px;"><img src="images/gsjs11.png" height="100px" width="80px"></td>
											<td align="center" style="vertical-align: middle;"><em style="height: 200px; width: 1px;border: 1px;background-color: #B7B7B7;display: block;"></em></td>
											<td align="left" style="vertical-align: top; padding: 10px;" id="aboutResult">
												<!-- 公司简介 -->
											</td>
										</tr>
									</table>
								</div>
							</div>
							<div style=" margin: 5px" class="panel" defH="210">
								<h1>商家资讯 <a href="${pageContext.request.contextPath}/ws/showNews" target="navTab" class="genduo" title="新闻资讯">更多>></a></h1>
								<div style="background-color: #ffffff">
									<table width="100%">
										<tr>
											<td align="center" style="vertical-align: middle; width:100px; "><img src="images/news_in.png" height="110px"></td>
											<td align="center" style="vertical-align: middle;"><em style="height: 200px; width: 1px;border: 1px;background-color: #B7B7B7;display: block;"></em></td>
											<td align="left" style="vertical-align: top;">
												<table class="newsContent" border="0" id="newsResult">
													<!-- 新闻资讯 -->
													<tr>
														<td style="color: #5BBD2B; text-align: left; width: 4px;">&gt;&gt;</td>
														<td style="text-align: left;"><a id="news1" href="#" target="navTab"></a></td><td id="t1" style="color:#ABABAB"></td>
													</tr>
													<tr>
														<td style="color: #5BBD2B; text-align: left; width: 4px;">&gt;&gt;</td>
														<td style="text-align: left;"><a id="news2" href="#" target="navTab"></a></td><td id="t2" style="color:#ABABAB"></td>
													</tr>
													<tr>
														<td style="color: #5BBD2B; text-align: left; width: 4px;">&gt;&gt;</td>
														<td style="text-align: left;"><a id="news3" href="#" target="navTab"></a></td><td id="t3" style="color:#ABABAB"></td>
													</tr>
													<tr>
														<td style="color: #5BBD2B; text-align: left; width: 4px;">&gt;&gt;</td>
														<td style="text-align: left;"><a id="news4" href="#" target="navTab"></a></td><td id="t4" style="color:#ABABAB"></td>
													</tr>
													<tr>
														<td style="color: #5BBD2B; text-align: left; width: 4px;">&gt;&gt;</td>
														<td style="text-align: left;"><a id="news5" href="#" target="navTab"></a></td><td id="t5" style="color:#ABABAB"></td>
													</tr>
												</table>
											</td>
										</tr>
									</table>
								</div>
							</div>
						</div>
						<div style="width: 49%; border: 1px solid #e66; float: left; min-height: 100px;margin-top:5px;margin-left:0px; ;border: 0px solid red;">
							<div style=" margin: 5px;" class="panel" defH="210">
								<h1>我的账户 <a class="genduo" href="${pageContext.request.contextPath}/sys/findCompanyInfo" target="navTab" title="账户信息">更多>></a></h1>
								<div style="background-color: #ffffff" >
									<table width="100%">
										<tr>
											<td align="center" style="vertical-align: middle; width: 100px;"><img src="images/db.jpg"></td>
											<td align="center" style="vertical-align: middle;"><em style="height: 200px; width: 1px;border: 1px;background-color: #B7B7B7;display: block;"></em></td>
											<td align="left" style="vertical-align: top;">
												<table class="newsContent" border="0" id="account">
												<!-- 我的账户 -->
												</table>
											</td>
										</tr>
									</table>
								</div>
							</div>
							<div style=" margin: 5px" class="panel" defH="210">
								<h1>新功能推荐</h1>
								<div style="background-color: #ffffff; text-align: left;" >
								   敬请期待！
								</div>
							</div>
						</div>
				</div>
			</div>
		</div>
	</div>
</div>
	<div id="footer">Copyright &copy; 2017 <span>苏州索远团队</span></div>
</body>
</html>