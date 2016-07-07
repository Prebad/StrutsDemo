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
public class testAction extends ActionSupport {
	@Override
	public String execute(){
		return "success";
	}
}
