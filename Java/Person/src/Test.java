
public class Test {

	public static void main(String[] args) {

		Person jiro = new Person();
		jiro.name = "木村次郎";
		jiro.age = 18;
		jiro.phoneNumber = "090-0000-1111";
		jiro.address = "東京都";
		jiro.sex = "男性";
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		System.out.println(jiro.sex);
		jiro.talk();
		jiro.walk();
		jiro.run();
		
		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;
		hanako.phoneNumber = "090-1111-2222";
		hanako.address = "千葉県";
		hanako.sex = "女性";
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		System.out.println(hanako.sex);
		hanako.talk();
		hanako.walk();
		hanako.run();

		Person yusuke = new Person();
		yusuke.name = "太田祐助";
		yusuke.age = 24;
		yusuke.phoneNumber = "090-5555-6666";
		yusuke.address = "神奈川県";
		yusuke.sex = "男性";
		System.out.println(yusuke.name);
		System.out.println(yusuke.age);
		System.out.println(yusuke.phoneNumber);
		System.out.println(yusuke.address);
		System.out.println(yusuke.sex);
		yusuke.talk();
		yusuke.walk();
		yusuke.run();
	}

}
