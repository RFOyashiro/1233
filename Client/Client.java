package Client;

import Dico.*;

public class Client {

	public static void main(String[] args) {
		IDictionary dico = new FastDictionary();
		
		System.out.println("");
		System.out.println("**************");		
		System.out.println("FastDictionary");
		System.out.println("**************");
		System.out.println("");
		
		dico.put("Kurt", "Etudiant M1 IMAGINA");				
		dico.put("Test3", "Nouvel Ajout 3");
		dico.put("Test4", "Nouvel Ajout 4");
		dico.put("Test5", "Nouvel Ajout 5");
		dico.put("Test6", "Nouvel Ajout 6");
		dico.put("Test7", "Nouvel Ajout 7");
		dico.put("Test8", "Nouvel Ajout 8");
		dico.put("Test9", "Nouvel Ajout 9");
		dico.put("Test10", "Nouvel Ajout 10");
		dico.put("Test11", "Nouvel Ajout 11");
		dico.put("Test12", "Nouvel Ajout 12");
		dico.put("Test13", "Nouvel Ajout 13");
		
		System.out.println("Kurt - " + dico.get("Kurt"));
		
		dico.put("Kurt", "Etudiant M1 IMAGINA - NEW");
		
		System.out.println("Kurt - " + dico.get("Kurt"));
		System.out.println("Test3 - " + dico.get("Test3"));
		System.out.println("Test9 - " + dico.get("Test9"));
		System.out.println("Test8 - " + dico.get("Test8"));
		System.out.println("Test7 - " + dico.get("Test7"));
		System.out.println("Test6 - " + dico.get("Test6"));
		System.out.println("Test5 - " + dico.get("Test5"));
		System.out.println("Test4 - " + dico.get("Test4"));
		System.out.println("Test10 - " + dico.get("Test10"));
		System.out.println("Test11 - " + dico.get("Test11"));
		System.out.println("Test12 - " + dico.get("Test12"));
		System.out.println("Test13 - " + dico.get("Test13"));
		
		dico = new OrderedDictionary();
		
		System.out.println("");
		System.out.println("*****************");		
		System.out.println("OrderedDictionary");
		System.out.println("*****************");
		System.out.println("");
		
		dico.put("Kurt", "Etudiant M1 IMAGINA");				
		dico.put("Test3", "Nouvel Ajout 3");
		dico.put("Test4", "Nouvel Ajout 4");
		dico.put("Test5", "Nouvel Ajout 5");
		dico.put("Test6", "Nouvel Ajout 6");
		dico.put("Test7", "Nouvel Ajout 7");
		dico.put("Test8", "Nouvel Ajout 8");
		dico.put("Test9", "Nouvel Ajout 9");
		dico.put("Test10", "Nouvel Ajout 10");
		dico.put("Test11", "Nouvel Ajout 11");
		dico.put("Test12", "Nouvel Ajout 12");
		dico.put("Test13", "Nouvel Ajout 13");
		
		System.out.println("Kurt - " + dico.get("Kurt"));
		
		dico.put("Kurt", "Etudiant M1 IMAGINA - NEW");
		
		System.out.println("Kurt - " + dico.get("Kurt"));
		System.out.println("Test3 - " + dico.get("Test3"));
		System.out.println("Test9 - " + dico.get("Test9"));
		System.out.println("Test8 - " + dico.get("Test8"));
		System.out.println("Test7 - " + dico.get("Test7"));
		System.out.println("Test6 - " + dico.get("Test6"));
		System.out.println("Test5 - " + dico.get("Test5"));
		System.out.println("Test4 - " + dico.get("Test4"));
		System.out.println("Test10 - " + dico.get("Test10"));
		System.out.println("Test11 - " + dico.get("Test11"));
		System.out.println("Test12 - " + dico.get("Test12"));
		System.out.println("Test13 - " + dico.get("Test13"));
		
		dico = new SortedDictionarySequence();
		
		System.out.println("");
		System.out.println("*****************");		
		System.out.println("SortedDictionary");
		System.out.println("*****************");
		System.out.println("");
		
		dico.put("Kurt", "Etudiant M1 IMAGINA");				
		dico.put("Test3", "Nouvel Ajout 3");
		dico.put("Test2", "Nouvel Ajout 2");
		dico.put("Test4", "Nouvel Ajout 4");
		dico.put("Test5", "Nouvel Ajout 5");
		dico.put("Test6", "Nouvel Ajout 6");
		dico.put("Test7", "Nouvel Ajout 7");
		dico.put("Test8", "Nouvel Ajout 8");
		dico.put("Test9", "Nouvel Ajout 9");
		dico.put("Test10", "Nouvel Ajout 10");
		dico.put("Test11", "Nouvel Ajout 11");
		dico.put("Test12", "Nouvel Ajout 12");
		dico.put("Test13", "Nouvel Ajout 13");
		
		System.out.println("Kurt - " + dico.get("Kurt"));
		
		dico.put("Kurt", "Etudiant M1 IMAGINA - NEW");
		
		System.out.println("Kurt - " + dico.get("Kurt"));
		System.out.println("Test2 - " + dico.get("Test2"));
		System.out.println("Test3 - " + dico.get("Test3"));
		System.out.println("Test4 - " + dico.get("Test4"));
		System.out.println("Test5 - " + dico.get("Test5"));
		System.out.println("Test6 - " + dico.get("Test6"));
		System.out.println("Test7 - " + dico.get("Test7"));
		System.out.println("Test8 - " + dico.get("Test8"));
		System.out.println("Test9 - " + dico.get("Test9"));
		System.out.println("Test10 - " + dico.get("Test10"));
		System.out.println("Test11 - " + dico.get("Test11"));
		System.out.println("Test12 - " + dico.get("Test12"));
		System.out.println("Test13 - " + dico.get("Test13"));
		
		
		//System.out.println((new String("Hugo")).hashCode() + " " + (new String("Hugo")).hashCode());
		//hashCode() fait un equals() afin de toujours donner le même hash pour le même object (selon equals()) 
		//== test les adresses mémoire des 2 opérants / equals test le "physique" des 2 opérants
		
	}

}
