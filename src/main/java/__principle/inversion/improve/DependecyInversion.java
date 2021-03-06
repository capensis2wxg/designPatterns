package __principle.inversion.improve;

/**
 * @author capensis
 */
public class DependecyInversion {

	public static void main(String[] args) {
		//客户端无需改变
		Person person = new Person();
		person.receive(new Email());
		person.receive(new WeiXin());
	}

}

/**
 * 接受消息
 */
interface IReceiver {
	/**
	 * 实现接受消息
	 * @return String
	 */
	String getInfo();
}

class Email implements IReceiver {
	@Override
	public String getInfo() {
		return "电子邮件信息: hello,world";
	}
}

/**
 * 增加微信
 */

class WeiXin implements IReceiver {
	@Override
	public String getInfo() {
		return "微信信息: hello,ok";
	}
}

/**
 *  方式2
 */
class Person {
	/**
	 *  这里我们是对接口的依赖
	 */
	public void receive(IReceiver receiver ) {
		System.out.println(receiver.getInfo());
	}
}
