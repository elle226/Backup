public class Test {
	public static void main (String[] args) {

		Person taro = new Person();
		taro.name = "taro";
		taro.age = 18;
		System.out.println(taro.name);
		System.out.println(taro.age);

		Person jiro = new Person ("jiro", 20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);

		Person saburo = new Person("saburo");
		saburo.name = "saburo";
		saburo.age = 0;
		System.out.println(saburo.name);
		System.out.println(saburo.age);

		Person no = new Person(25);
		no.name = "名前なし";
		no.age = 25;
		System.out.println(no.name);
		System.out.println(no.age);

		Person hanako = new Person(17, "hanako");
		hanako.name = "hanako";
		hanako.age = 17;
		System.out.println(hanako.name);
		System.out.println(hanako.age);
	}
}