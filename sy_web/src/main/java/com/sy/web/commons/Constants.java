package com.sy.web.commons;

/**
 * 常量类
 * 
 * @author sss 2013-8-15
 */
public class Constants {
	//session key
	public static final String USER_LOGIN_SESSION_KEY = "sessionkey";

	// 系统编码
	public static final String DEFAULT_ENCODING = "utf-8";

	// 服务器保存图片根路径
	public static final String APPIMAGES = "appimages/";
	
	//系统中表示假删除
	public static final Integer DELSTATE=0;	//删除
	
	public static final Integer ISDELSTATE=1; //可用
	// ----------------------------------------------------json数据相关------------------------------------------------------

	// 返回结果状态
	public static final String SUCCESS = "200";

	public static final String ERROR = "300";
	// 操作后
	public static final String CLOSECURRENT = "closeCurrent";// 关闭当前窗口

	public static final String FORWARD = "forward";
	// 对应主页面左边菜单rel
	// sys
	public static final String REL_USERMANAGER = "006";
	public static final String REL_EMPLOYEEMANAGE="033";
	public static final String REL_CUSTOMERMANAGER="019";
	public static final String REL_SEACUSTOMERMANAGE="039";
	public static final String REL_LINKMANMANAGER="020";
	public static final String REL_RECORDMANAGER="040";
	public static final String REL_PARENTMENU = "page9";

	// ws
	public static final String REL_SELFMODULE = "page27";
	public static final String REL_PHONEMANAGER = "017";
	public static final String REL_NEWSCLASS = "022";
	public static final String REL_NEWSMANAGER = "023";
	public static final String REL_LUNBOPIC = "page18";
	public static final String REL_PRODUCTTYPE = "026";
	public static final String REL_PRODUCTMANAGER = "027";
	public static final String REL_SUPPLIERMANAGER = "032";
	public static final String REL_SPECMANAGER = "025";

	// 操作结果
	public static final String MSG_LOGIN_FAIL = "登录失败!";
	public static final String MSG_LOGIN_SUCCESS = "登录成功!";
	public static final String MSG_USER_EXIST = "用户已经存在!";
	public static final String MSG_PASS_FAIL = "旧密码输入有误，请重新输入!";
	public static final String MSG_ADD_SUCCESS = "新增成功!";
	public static final String MSG_ADD_FAIL = "新增失败!";
	public static final String MSG_DEL_SUCCESS = "删除成功!";
	public static final String MSG_DEL_FAIL = "删除失败!";
	public static final String MSG_RETURN_SEA_SUCCESS="退回公海成功!";
	public static final String MSG_RETURN_SEA_FAIL="退回公海失败!";
	public static final String MSG_RECEIVE_SUCCESS="领取成功!";
	public static final String MSG_RECEIVE_FAIL="领取失败!";
	public static final String MSG_DEL_FAIL_TIP="当前角色下有用户,无法删除!";
	public static final String MSG_UPDATE_SUCCESS = "更新成功!";
	public static final String MSG_UPDATE_FAIL = "更新失败!";
	public static final String MSG_GET_SUCCESS = "查询成功!";
	public static final String MSG_GET_FAIL = "查询失败!";
	public static final String MSG_UP_SUCCESS = "上架成功!";
	public static final String MSG_DOWN_SUCCESS = "下架成功!";
	public static final String MSG_SALES_SUCCESS = "商品变为促销状态";
	public static final String MSG_NORMAL_SUCCESS = "商品恢复正常状态";

	// -----------------------------------------sss---------------------------------------------------------
	public static final String MSG_LOAD_SUCCESS = "上传成功";
	public static final String MSG_LOAD_FAIL = "上传失败";
	public static final String MSG_WX_PARENT_MENU_MAX_COUNT = "微信主菜单最多只能有3个";
	public static final String MSG_WX_SON_MENU_MAX_COUNT = "主菜单最多只能包含5个子菜单";
	public static final String MSG_WX_DEL_FAIL = "当前主菜单包含子菜单，删除失败！";
	public static final String MSG_ADD_WX_PARENT_MENU_SUCCESS = "生成成功！";
	public static final String MSG_ADD_WX_PARENT_MENU_FAIL = "生成失败！";
	public static final String MSG_ADD_WX_KEY_WORD = "添加失败，检查关键字是否已存在！";

	// -----------------------------------------LC---------------------------------------------------------
	public static final String MSG_ERROR_exit = "有数据存在无法删除，请先清除此分类下相关数据再重试！";
	public static final Integer INDEX_SHOW_ROW = 4;// 首页四个豆腐块显示消息条数
	public static final String MSG_UNKNOWN_OPERATION = "未知操作!";
	public static final String MSG_OPERATIO_FAIL = "操作失败!";
	public static final String MSG_OPERATIO_SUCCESS = "操作成功！";
	public static final String MSG_ACTIVATE_SUCCESS = "激活成功！";
	public static final String MSG_NEWSTITLE_NOTNULL = "新闻标题不能空!";
	public static final String MSG_NEWSCAT_NOTNULL = "新闻分类不能为空!";
	public static final String MSG_INVALID_SUCCESS = "此账号已失效!";
	public static final String MSG_NEWSID_NOTNULL = "请选择一条新闻";
	public static final String MSG_PRODUCTID_NOTNULL = "请选择一条产品信息";
	public static final String RESOURCE_PATH = "/demand.xml";// 资源文件
	public static final double AGENCY_MAKE_PRICE = 200.0;// 代制作价格
	public static final double AGENCY_ISSUE_PRICE = 100.0;// 代发布价格
	public static final String MSG_KEYWORD_USABLE = "关键词可用";
	public static final String MSG_KEYWORD_RETURN = "此关键词已注册";
	public static final String MSG_USERNAME_REDO_FAIL = "此建站账号已存在!";
	public static final String MSG_WALLET_SCANTILY_FAIL = "账户余额不足，请充值后再试！";
	public static final String MSG_ADD_INDENT_SUCCESS = "订单已提交！";
	public static final String MSG_ADD_INDENT_ERROR = "订单提交失败,或账户余额不足！";
	public static final String MSG_INDENT_BROKEN = "提交数据不完整!";
	public static final String MSG_USERNAME_FAIL = "用户名错误!";
	public static final String MSG_NAMEPASS_FAIL = "密码错误!";
	public static final String MSG_LOGIN_NO = "请登录";

	// -----------------------------------------LHL---------------------------------------------------------

	public static final String MSG_ADDSMS_Exists = "短信主题已存在!";
	public static final String MSG_ADDPhone_Exists = "该号码已存在!";
	public static final String MSG_Save_Success = "保存成功!";
	public static final String MSG_Save_Fail = "保存失败!";
	public static final String MSG_Pic_EXISTS = "图片名称已存在!";

	// -----------------------------------------------------------------------------------------------------
	// 角色
	public enum role {
		ADMIN(1L), AGENT(2L);
		private Long number;

		public Long getNumber() {
			return number;
		}

		public void setNumber(Long number) {
			this.number = number;
		}

		private role(Long number) {
			this.number = number;
		}
	}

	//七牛云服务器
	public static final String DB_IMAGE_FILE = "http://obxgyv3if.bkt.clouddn.com";

}
