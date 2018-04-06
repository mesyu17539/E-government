package com.project.web.common;

import java.util.Map;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component @Lazy
public interface CRUDService {
	@FunctionalInterface
	public static interface Post{
		public void execute(Map<?, ?> paramMap);
	};
	@FunctionalInterface
	public static interface Get{
		public Object execute(Map<?, ?> paramMap);
	};
	@FunctionalInterface
	public static interface Count{
		public int execute(Map<?, ?> paramMap);
	};
	@FunctionalInterface
	public static interface List{
		public List execute(Map<?, ?> paramMap);
	};
	@FunctionalInterface
	public static interface Update{
		public void execute(Map<?, ?> paramMap);
	};
	@FunctionalInterface
	public static interface Delete{
		public void execute(Map<?, ?> paramMap);
	};
}
