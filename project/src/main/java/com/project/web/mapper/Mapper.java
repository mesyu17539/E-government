package com.project.web.mapper;

import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public interface Mapper {
	public int existMember(Map<?,?> param);
	public int existUser(Map<?,?> param);
	public int existVip(Map<?,?> param);
	public int exist(Map<?,?> param);
}
