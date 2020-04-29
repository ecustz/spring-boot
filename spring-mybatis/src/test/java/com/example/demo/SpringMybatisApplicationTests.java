package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringMybatisApplicationTests {

@Autowired
private CacheManagementMapper cacheManagementMapper;

	@Test
	public void testSearchCacheByKeyName() {
		CacheBO cacheBO= cacheManagementMapper.findCacheKeyByKeyName("OPC_SYS_CONFIG_LIST");
		System.out.println("THE RESULT = " + cacheBO);
	}
	
	@Test
	public void testSearchCachesByCacheRequestDynamically() {
		CacheRequest cacheRequest = new CacheRequest();
		//cacheRequest.setCacheKey("OPC_SYS_CONFIG_LIST");
		List<CacheBO> cacheBOs= cacheManagementMapper.findCachesByDynamicConditions(cacheRequest);
		System.out.println("THE RESULTS BY DYNAMICALLY= " + cacheBOs);
	}
	
	@Test
	public void testSearchCachesByCacheKeys() {
		CacheRequest cacheRequest = new CacheRequest();
		List<String> cacheKeys = new ArrayList<>();
		cacheKeys.add("OPC_SYS_CONFIG_LIST");
		cacheKeys.add("DDS_COMMON_GFSOPTINTARIFFLIST");
		cacheRequest.setCacheKeys(cacheKeys);
		List<CacheBO> cacheBOs= cacheManagementMapper.findCachesByCacheKeys(cacheRequest);
		System.out.println("THE RESULTS BY IN QUERY = " + cacheBOs);
	}

}
