public class Foo {
	String Name;
	{ Name = "Initialized"; }
	public static void main(String [] args) {
		Foo f = new Foo();
		f.doStuff(f);
		System.out.println(f.getName());
	}
	void setName(String s) {
		Name = s;
	}
	String getName() {
		return Name;
	}

	void doStuff(Foo g) {
		System.out.println(g.getName());
		g.setName("Boo");
		g = new Foo();
	}
}
