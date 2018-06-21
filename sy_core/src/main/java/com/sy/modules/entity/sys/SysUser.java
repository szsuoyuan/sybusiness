package com.sy.modules.entity.sys;

import com.sy.commons.entity.ParentEntity;
import com.sy.modules.entity.agt.Keyword;

/**
 * 系统用户管理
 * 
 * @author sss 2013-8-9
 */

public class SysUser extends ParentEntity {

	private static final long serialVersionUID = 7941086829855106914L;
	private Integer parentid;
	private String username; // 帐号
	private String userpass; // 密码
	private Integer userstatus;// 状态：1=有效，0=无效
	private String userremark;// 备注信息
	private String roleName;
	private Integer roleId;
	// 支付宝参数
	private String alipayKey;
	private String alipayId;
	private String alipayAccount;
	private CompanyInfo company;
	private Keyword key;
	private Integer delStatus;
	private Integer eStatus;
	private SysEmployee emp;
	
	public SysUser() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpass() {
		return userpass;
	}

	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}

	public String getUserremark() {
		return userremark;
	}

	public void setUserremark(String userremark) {
		this.userremark = userremark;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getAlipayKey() {
		return alipayKey;
	}

	public void setAlipayKey(String alipayKey) {
		this.alipayKey = alipayKey;
	}

	public String getAlipayId() {
		return alipayId;
	}

	public void setAlipayId(String alipayId) {
		this.alipayId = alipayId;
	}

	public String getAlipayAccount() {
		return alipayAccount;
	}

	public void setAlipayAccount(String alipayAccount) {
		this.alipayAccount = alipayAccount;
	}

	public CompanyInfo getCompany() {
		return company;
	}

	public void setCompany(CompanyInfo company) {
		this.company = company;
	}

	public Integer getUserstatus() {
		return userstatus;
	}

	public void setUserstatus(Integer userstatus) {
		this.userstatus = userstatus;
	}

	public Keyword getKey() {
		return key;
	}

	public void setKey(Keyword key) {
		this.key = key;
	}
	public Integer getParentid() {
		return parentid;
	}

	public void setParentid(Integer parentid) {
		this.parentid = parentid;
	}

	public Integer geteStatus() {
		return eStatus;
	}

	public void seteStatus(Integer eStatus) {
		this.eStatus = eStatus;
	}

	public SysEmployee getEmp() {
		return emp;
	}

	public void setEmp(SysEmployee emp) {
		this.emp = emp;
	}

	public String toString(){
		return "user info{id :"+id+",username： "+username+"}";
	}

	public Integer getDelStatus() {
		return delStatus;
	}

	public void setDelStatus(Integer delStatus) {
		this.delStatus = delStatus;
	}


}
