package Dico;

//--- Questions ---//

   /* Question 5 : pour implémenter SortedDictionary avec une recherche séquentielle de manière economique, la classe doit étendre OrderedDictionary et re-définir 
    * 			   la méthode SearchPlace(Object key); car les 2 autres méthodes sont identiques.
	*
	* solution typage 1 : 
	*                compatible car il est possible de spécialiser un attribut déjà déclaré dans la classe abstraite dans une classe qui l'étends 
	* ne traite pas le problème car grow() modifie un tableau d'Object et non de Comparable. Donc c'est l'attribut keys de OrderedDictionary qui augmentera sa taille et non l'attribut keys de
	* 								SortedDictionary !!! On ne peut pas spécialiser le type d'un attribut !!!
	*
	* solution typage 2 : 
	*                compatible car toutes les classes ont Object comme superclass or, Comparable est un classe donc elle étends la classe Object
	* ne traite pas le problème car la methode searchPlace appelé sera le sera celle de OrderedDictionary car c'est une surchage (re-definition co-variante)
	* et non une re-definition (non-respect de la règle de contra-variance de Liskov)
	*/

public class SortedDictionarySequence extends OrderedDictionary {
	
	//--- Fields ---//
	
	//protected Comparable keys[] = new Comparable[0];
	
	//--- Constructors ---//
	
	public SortedDictionarySequence() {}
	
	//--- Override from OrderedDictionay ---//
	
	protected int searchPlace(Comparable key) {
		int indice = this.grow(1);
		System.out.println("patate ?");
		for (int i = 0; i < keys.length; ++i)
			if (key.compareTo(keys[i]) > 0){
				for (int j = keys.length - 2; j > i; ++j){
					keys[j + 1] = keys[j];
					values[j + 1] = values[j];
				}
				indice = i;
				
				System.out.println(i);
				
				break;
			}
		return indice;
	}

}
