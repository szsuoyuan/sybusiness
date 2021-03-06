package com.sy.modules.entity.ws;

import java.io.Serializable;
import java.util.Date;

public class WsRecord implements Serializable {
	
	
	private String emNumber;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ws_record.r_id
     *
     * @mbggenerated
     */
    private Long rId;//记录id

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ws_record.sys_user_id
     *
     * @mbggenerated
     */
    private Integer sysUserId; //账号id

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ws_record.em_name
     *
     * @mbggenerated
     */
    private String emName;//员工姓名

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ws_record.em_id
     *
     * @mbggenerated
     */
    private Integer emId;//员工id

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ws_record.dept_id
     *
     * @mbggenerated
     */
    private Integer deptId;//部门id

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ws_record.dept_name
     *
     * @mbggenerated
     */
    private String deptName;//部门名称

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ws_record.r_time
     *
     * @mbggenerated
     */
    private Date rTime;//打卡时间

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ws_record.r_valid
     *
     * @mbggenerated
     */
    private Byte rValid;//是否有效打卡

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ws_record.r_status
     *
     * @mbggenerated
     */
    private Byte rStatus;//进出状态

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ws_record.r_name
     *
     * @mbggenerated
     */
    private String rName;//操作人

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ws_record.r_source
     *
     * @mbggenerated
     */
    private Byte rSource;//考勤来源

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ws_record.r_remark
     *
     * @mbggenerated
     */
    private String rRemark;//备注

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ws_record.r_address
     *
     * @mbggenerated
     */
    private String rAddress;//打卡地址

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ws_record.r_delstatus
     *
     * @mbggenerated
     */
    private Integer rDelstatus;//删除标志

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ws_record.r_day
     *
     * @mbggenerated
     */
    private String rDay;//打卡天

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ws_record.create_time
     *
     * @mbggenerated
     */
    private Date createTime;//创建日期

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ws_record.r_on_duty
     *
     * @mbggenerated
     */
    private Byte rOnDuty;//上班/下班，0：上班，1：下班

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ws_record
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ws_record.r_id
     *
     * @return the value of ws_record.r_id
     *
     * @mbggenerated
     */
    public Long getrId() {
        return rId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ws_record.r_id
     *
     * @param rId the value for ws_record.r_id
     *
     * @mbggenerated
     */
    public void setrId(Long rId) {
        this.rId = rId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ws_record.sys_user_id
     *
     * @return the value of ws_record.sys_user_id
     *
     * @mbggenerated
     */
    public Integer getSysUserId() {
        return sysUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ws_record.sys_user_id
     *
     * @param sysUserId the value for ws_record.sys_user_id
     *
     * @mbggenerated
     */
    public void setSysUserId(Integer sysUserId) {
        this.sysUserId = sysUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ws_record.em_name
     *
     * @return the value of ws_record.em_name
     *
     * @mbggenerated
     */
    public String getEmName() {
        return emName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ws_record.em_name
     *
     * @param emName the value for ws_record.em_name
     *
     * @mbggenerated
     */
    public void setEmName(String emName) {
        this.emName = emName == null ? null : emName.trim();
    }


	public String getEmNumber() {
		return emNumber;
	}

	public void setEmNumber(String emNumber) {
		this.emNumber = emNumber;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ws_record.em_id
     *
     * @return the value of ws_record.em_id
     *
     * @mbggenerated
     */
    public Integer getEmId() {
        return emId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ws_record.em_id
     *
     * @param emId the value for ws_record.em_id
     *
     * @mbggenerated
     */
    public void setEmId(Integer emId) {
        this.emId = emId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ws_record.dept_id
     *
     * @return the value of ws_record.dept_id
     *
     * @mbggenerated
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ws_record.dept_id
     *
     * @param deptId the value for ws_record.dept_id
     *
     * @mbggenerated
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ws_record.dept_name
     *
     * @return the value of ws_record.dept_name
     *
     * @mbggenerated
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ws_record.dept_name
     *
     * @param deptName the value for ws_record.dept_name
     *
     * @mbggenerated
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ws_record.r_time
     *
     * @return the value of ws_record.r_time
     *
     * @mbggenerated
     */
    public Date getrTime() {
        return rTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ws_record.r_time
     *
     * @param rTime the value for ws_record.r_time
     *
     * @mbggenerated
     */
    public void setrTime(Date rTime) {
        this.rTime = rTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ws_record.r_valid
     *
     * @return the value of ws_record.r_valid
     *
     * @mbggenerated
     */
    public Byte getrValid() {
        return rValid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ws_record.r_valid
     *
     * @param rValid the value for ws_record.r_valid
     *
     * @mbggenerated
     */
    public void setrValid(Byte rValid) {
        this.rValid = rValid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ws_record.r_status
     *
     * @return the value of ws_record.r_status
     *
     * @mbggenerated
     */
    public Byte getrStatus() {
        return rStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ws_record.r_status
     *
     * @param rStatus the value for ws_record.r_status
     *
     * @mbggenerated
     */
    public void setrStatus(Byte rStatus) {
        this.rStatus = rStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ws_record.r_name
     *
     * @return the value of ws_record.r_name
     *
     * @mbggenerated
     */
    public String getrName() {
        return rName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ws_record.r_name
     *
     * @param rName the value for ws_record.r_name
     *
     * @mbggenerated
     */
    public void setrName(String rName) {
        this.rName = rName == null ? null : rName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ws_record.r_source
     *
     * @return the value of ws_record.r_source
     *
     * @mbggenerated
     */
    public Byte getrSource() {
        return rSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ws_record.r_source
     *
     * @param rSource the value for ws_record.r_source
     *
     * @mbggenerated
     */
    public void setrSource(Byte rSource) {
        this.rSource = rSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ws_record.r_remark
     *
     * @return the value of ws_record.r_remark
     *
     * @mbggenerated
     */
    public String getrRemark() {
        return rRemark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ws_record.r_remark
     *
     * @param rRemark the value for ws_record.r_remark
     *
     * @mbggenerated
     */
    public void setrRemark(String rRemark) {
        this.rRemark = rRemark == null ? null : rRemark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ws_record.r_address
     *
     * @return the value of ws_record.r_address
     *
     * @mbggenerated
     */
    public String getrAddress() {
        return rAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ws_record.r_address
     *
     * @param rAddress the value for ws_record.r_address
     *
     * @mbggenerated
     */
    public void setrAddress(String rAddress) {
        this.rAddress = rAddress == null ? null : rAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ws_record.r_delstatus
     *
     * @return the value of ws_record.r_delstatus
     *
     * @mbggenerated
     */
    public Integer getrDelstatus() {
        return rDelstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ws_record.r_delstatus
     *
     * @param rDelstatus the value for ws_record.r_delstatus
     *
     * @mbggenerated
     */
    public void setrDelstatus(Integer rDelstatus) {
        this.rDelstatus = rDelstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ws_record.r_day
     *
     * @return the value of ws_record.r_day
     *
     * @mbggenerated
     */
    public String getrDay() {
        return rDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ws_record.r_day
     *
     * @param rDay the value for ws_record.r_day
     *
     * @mbggenerated
     */
    public void setrDay(String rDay) {
        this.rDay = rDay == null ? null : rDay.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ws_record.create_time
     *
     * @return the value of ws_record.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ws_record.create_time
     *
     * @param createTime the value for ws_record.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ws_record.r_on_duty
     *
     * @return the value of ws_record.r_on_duty
     *
     * @mbggenerated
     */
    public Byte getrOnDuty() {
        return rOnDuty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ws_record.r_on_duty
     *
     * @param rOnDuty the value for ws_record.r_on_duty
     *
     * @mbggenerated
     */
    public void setrOnDuty(Byte rOnDuty) {
        this.rOnDuty = rOnDuty;
    }
}