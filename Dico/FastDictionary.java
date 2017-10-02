package Dico;

import java.lang.Math;

public class FastDictionary extends AbstractDictionary {
	
	//--- Constructors ---//
	
	public FastDictionary(){}
	
	//--- Methods ---//
		
	private boolean mustGrow(){
		return this.size() >= (3 * keys.length) / 4;
	}
	
	private void grow(){
		if (!this.mustGrow()) return;
		//System.out.println("Growing...");
		Object newKeys[] = new Object[keys.length + 4];
		Object newValues[] = new Object[keys.length + 4];
		int index = 0;
		
		for (int i = 0; i < keys.length; ++i)
			if (keys[i] != null){
				index = Math.abs(keys[i].hashCode()) % newKeys.length;
				if (newKeys[index] != null) {		
					for (int j = index; j < newKeys.length; j = (j+1) % newKeys.length)
						if (newKeys[j] == null) {
							newKeys[j] = keys[i];
							newValues[j] = values[i];
						
							//System.out.println("indice : " + j + " | value newKeys : " + newKeys[j] + " | value keys : " + keys[i]);
						
							break;
						}
				}
				else {
					newKeys[index] = keys[i];
					newValues[index] = values[i];
					//System.out.println("indice : " + index + " | value newKeys : " + newKeys[index] + " | value keys : " + keys[i]);
				}
			}
		
		keys = newKeys;
		values = newValues;
	}
	
	//--- Abstract Methods from AbstractDictionay ---//
	
	@Override
	protected int searchPlace(Object key) {
		this.grow();
		return getIndex(key);
	}

	@Override
	protected int getIndex(Object key) {
		
		//System.out.println("\t" + key.hashCode() +  " modulo " + keys.length +  " : " + key.hashCode() % keys.length);
		
		this.grow();
		
		int hKey = Math.abs(key.hashCode()) % keys.length;
		
		//System.out.println("\tcurrent key: " + keys[hKey]);
		
		if (keys[hKey] != null && !key.equals(keys[hKey]))
			for (int i = hKey; i < keys.length; i = (i+1) % keys.length) {
				if (keys[i] == null || key.equals(keys[i])) return i;
			}
		
		//System.out.println("\tNo For");
		return hKey;
	}
	
	@Override
	protected int searchOne() {
		if (this.size() == 0) return -1;
		for (int i = 0; i < keys.length; ++i)
			if (keys[i] != null) return i;
		return -1;
		
	}

}
