package Dico;
public class OrderedDictionary extends AbstractDictionary {
	
	//--- Constructors ---//
	
	public OrderedDictionary() {}
	
	//--- Methods ---//
	
	protected int grow (int add){
		
		//System.out.println("growing");
		
		Object newKeys[] = new Object[keys.length + add];
		Object newValues[] = new Object[keys.length + add];
		
		for (int i = 0; i < keys.length; ++i){
			newKeys[i] = keys[i];
			newValues[i] = values[i];
		}	
		
		keys = newKeys;
		values = newValues;
		//System.out.println(keys.length);
		return newKeys.length - 1;
	}
	
	//--- Methods From AbstractDictionary ---//
	
	@Override
	protected int getIndex(Object key) {
		for (int i = 0; i < keys.length; ++i)
			//System.out.println(i +" " + keys[i] + " " + key + " " + key.equals(keys[i]));
			if (key.equals(keys[i])) {System.out.println("indice de " + keys[i] + " : " + i);return i;}
		return -1;
	}

	@Override
	protected int searchOne() {
		for (int i = 0; i < keys.length; ++i)
			if (keys[i] != null) return i;
		return -1;
	}

	@Override
	protected int searchPlace(Object key) {
		int indice = this.grow(1);
		return indice;
	}

}
