package com.sy.modules.dao.sys;

import com.sy.modules.common.MyBatisRepository;
import com.sy.modules.entity.sys.WtRole;
import com.sy.modules.entity.sys.WtRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@MyBatisRepository
public interface WtRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wt_role
     *
     * @mbggenerated
     */
    int countByExample(WtRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wt_role
     *
     * @mbggenerated
     */
    int deleteByExample(WtRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wt_role
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer wtRId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wt_role
     *
     * @mbggenerated
     */
    int insert(WtRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wt_role
     *
     * @mbggenerated
     */
    int insertSelective(WtRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wt_role
     *
     * @mbggenerated
     */
    List<WtRole> selectByExampleWithRowbounds(WtRoleExample example, RowBounds rowBounds);
    
    
    List<WtRole> selectByExampleByPage(WtRoleExample example);
    
    

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wt_role
     *
     * @mbggenerated
     */
    List<WtRole> selectByExample(WtRoleExample example);
    
    List<WtRole> selectAllRoles();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wt_role
     *
     * @mbggenerated
     */
    WtRole selectByPrimaryKey(Integer wtRId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wt_role
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") WtRole record, @Param("example") WtRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wt_role
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") WtRole record, @Param("example") WtRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wt_role
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(WtRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wt_role
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(WtRole record);
}