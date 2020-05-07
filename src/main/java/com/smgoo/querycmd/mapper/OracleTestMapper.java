package com.smgoo.querycmd.mapper;

import org.apache.ibatis.annotations.Param;

public interface OracleTestMapper {

    public String getUname(@Param("uid") String uid) throws Exception;
}
