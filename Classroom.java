public class Classroom{
	public static void main(String[] args) {
		
		Wilder loic = new Wilder("Loic", true);
		Wilder pascal = new Wilder("Pascal", false);
		Wilder sebastien = new Wilder("Sebastien", true);
		Wilder hadaaika = new Wilder("Hadaaika", false);
		Wilder yanis = new Wilder("Yanis", true);
		Wilder agnies = new Wilder("Agnies", false);
		Wilder damien = new Wilder("Damien", true);
		Wilder kevin = new Wilder("Kevin", false);

		System.out.println(loic.whoAmI());
		System.out.println(pascal.whoAmI());
		System.out.println(sebastien.whoAmI());
		System.out.println(hadaaika.whoAmI());
		System.out.println(yanis.whoAmI());
		System.out.println(agnies.whoAmI());
		System.out.println(damien.whoAmI());
		System.out.println(kevin.whoAmI());
	}
}