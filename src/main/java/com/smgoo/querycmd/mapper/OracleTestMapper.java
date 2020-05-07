package com.smgoo.querycmd.mapper;

import java.util.List;

import com.smgoo.querycmd.domain.HREmployee;

import org.apache.ibatis.annotations.Param;

public interface OracleTestMapper {

    // public String getUname(@Param("uid") String uid) throws Exception;

    public String getUname(@Param("employeeId") int employeeId) throws Exception;

    public List<HREmployee> getAllList() throws Exception;
}
