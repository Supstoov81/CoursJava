package test;

public class TestEtudiant {
	
	public static void main(String[] args) {
		Etudiant e1 = new Etudiant("Bob");
		System.out.println(e1.getNom());
		e1.travailler();
		e1.seReposer();
		
	}

}
