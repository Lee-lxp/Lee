package cn.tedu.store.service.controllerException;
/**
 * 请求异常，控制器中异常的基类
 * @author ASUS
 *
 */
public class RequestExcrption extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7953945986347865000L;

	public RequestExcrption() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RequestExcrption(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

	public RequestExcrption(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public RequestExcrption(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public RequestExcrption(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

}
