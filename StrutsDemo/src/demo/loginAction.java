/**
 * 
 */
package demo;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author 308
 *
 */
public class loginAction extends ActionSupport {
	private String username;
	private String password;
	private Dao.simpleDao simpleDao = new Dao.simpleDao();
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String execute(){
		//System.out.println(simpleDao.executeQuery("select * from skmp_bm"));
		if("admin".equals(username)&&"123".equals(password)){
			Map<String, Object> session = ActionContext.getContext().getSession();
			session.put("username", "admin");
			session.put("password", "123");
			return "success";
		}
		else return "login";
	}
}
