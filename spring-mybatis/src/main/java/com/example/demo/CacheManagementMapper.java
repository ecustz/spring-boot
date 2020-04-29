package com.example.demo;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CacheManagementMapper {
	@Results(id = "cacheKeyResult", value = {
		    @Result(property = "parentKey", column = "PARN_CACH_KEY_TXT", id = true),
		    @Result(property = "rebuildable", column = "RBLD_IND"),
		    @Result(property = "deletable", column = "DEL_IND"),
		    @Result(property = "editable", column = "EDT_IND"),
		    @Result(property = "functionType", column = "SRC_APPL_NM"),
		    @Result(property = "createdID", column = "CREATE_ID"),
		    @Result(property = "createdDate", column = "CREATE_TS"),
		    @Result(property = "lastMaintainedID", column = "LAST_MNT_ID"),
		    @Result(property = "lastMaintainedDate", column = "LAST_MNT_TS"),
		    @Result(property = "lastMaintainedAction", column = "LAST_MNT_ACT")
		})
	@Select("select * from OPCGRP.OPC_CACH_MNT where PARN_CACH_KEY_TXT = #{keyName}")
	public CacheBO findCacheKeyByKeyName(final String keyName);
	
	//Dynamic Search
	@ResultMap("cacheKeyResult")
	@Select({"<script> "+
	"select * from OPCGRP.OPC_CACH_MNT where 1=1 " + 
	"<if test='cacheKey!=null'> and PARN_CACH_KEY_TXT = #{cacheKey} </if>" 
	+"FETCH FIRST 2 ROWS ONLY"
	+" </script>"})
	public List<CacheBO> findCachesByDynamicConditions(final CacheRequest cacheRequest);
	
	//IN Query
	@ResultMap("cacheKeyResult")
	@Select({"<script> "+
	"select * from OPCGRP.OPC_CACH_MNT where 1=1 " + 
	"and PARN_CACH_KEY_TXT in " + 
	"<foreach item='cacheKey' collection='cacheKeys' separator=',' open='(' close=')' index=''>" 
	+" #{cacheKey} "
	+"</foreach>"
	+" </script>"})
	public List<CacheBO> findCachesByCacheKeys(final CacheRequest cacheRequest);
}
