package com.example.demo;

import java.util.List;

public class CacheRequest {
	private String cacheKey;
	private List<String> cacheKeys;

	public List<String> getCacheKeys() {
		return cacheKeys;
	}

	public void setCacheKeys(List<String> cacheKeys) {
		this.cacheKeys = cacheKeys;
	}

	public String getCacheKey() {
		return cacheKey;
	}

	public void setCacheKey(String cacheKey) {
		this.cacheKey = cacheKey;
	}
}
