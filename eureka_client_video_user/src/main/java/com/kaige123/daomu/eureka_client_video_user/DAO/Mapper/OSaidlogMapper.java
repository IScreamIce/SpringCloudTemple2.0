package com.kaige123.daomu.eureka_client_video_user.DAO.Mapper;

import com.kaige123.daomu.eureka_client_video_user.DAO.Bean.OSaidlog;
import com.kaige123.daomu.eureka_client_video_user.DAO.Bean.OSaidlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OSaidlogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osaidlog
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    long countByExample(OSaidlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osaidlog
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    int deleteByExample(OSaidlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osaidlog
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    int deleteByPrimaryKey(Long alid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osaidlog
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    int insert(OSaidlog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osaidlog
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    int insertSelective(OSaidlog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osaidlog
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    List<OSaidlog> selectByExample(OSaidlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osaidlog
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    OSaidlog selectByPrimaryKey(Long alid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osaidlog
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    int updateByExampleSelective(@Param("record") OSaidlog record, @Param("example") OSaidlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osaidlog
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    int updateByExample(@Param("record") OSaidlog record, @Param("example") OSaidlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osaidlog
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    int updateByPrimaryKeySelective(OSaidlog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osaidlog
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    int updateByPrimaryKey(OSaidlog record);
}