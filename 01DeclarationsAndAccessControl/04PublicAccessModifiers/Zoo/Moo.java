class Zoo {
	public String coolMethod() {
		return "Wow baby";
	}
}
class Moo {
	public void useAZoo() {
		Zoo z = new Zoo();
		System.out.println("A Zoo says, " + z.coolMethod());
	}
}
