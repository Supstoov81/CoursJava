package test;

public class TestVoiture {
	public static void main(String[] args) {
		Voiture v = new Voiture("OPEL","Vert",4);
		System.out.println(v.getMarque());
		v.setMarque("BMW");
		System.out.println(v.getMarque());
	}

}
