/**
 * 
 */
package demo;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * @author 308
 *
 */
public class loginInterceptor implements Interceptor {

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.interceptor.Interceptor#destroy()
	 */
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.interceptor.Interceptor#init()
	 */
	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.interceptor.Interceptor#intercept(com.opensymphony.xwork2.ActionInvocation)
	 */
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		ActionContext context = ActionContext.getContext();
		Map<String,Object> session = context.getSession();
		String username =(String)session.get("username");
		String password =(String)session.get("password");
		if("admin".equals(username)&&"123".equals(password)){
			invocation.invoke();
			return "success";
		}else{
			return "loginfailed";
		}
	}

}
