package Dico;

public abstract class AbstractDictionary implements IDictionary {
	
	protected Object keys[] = new Object[0];
	protected Object values[] = new Object[0];
	protected int size = 0;
	
	//--- Constructors ---//
	
	public AbstractDictionary () {}
	
	//--- Getter & Setter ---//
	
	public Object[] getKeys() {
		return keys;
	}
	
	public Object[] getValues() {
		return values;
	}
	
	//--- Methods from IDictionary ---//

	public Object get (Object key) {
		//long start = System.nanoTime(); 
		int i = this.getIndex(key);
		
		if (i > -1) {
			/*long elapsedTime = System.nanoTime() - start;
			System.out.println("\rthis get(" + key + ") took " + elapsedTime + " ns\r\r");*/
			
			return values[i];
		}
		
		/*long elapsedTime = System.nanoTime() - start;
		System.out.println("\rthis get(" + key + ") took " + elapsedTime + " ns\r\r");*/
		
		return null;
	}

	public int size() {
		return size;
	}

	public boolean containsKey(Object key) {
		return !(this.get(key) == null);
	}
	
	public IDictionary put (Object key, Object value){
		//long start = System.nanoTime();  
		int i = this.getIndex(key);
		
		if (i >= 0) {
			keys[i] = key;
			values[i] = value;
			/*long elapsedTime = System.nanoTime() - start;
			System.out.println("\rthis put(" + key + ") took " + elapsedTime + " ns\r\r");*/
			size++;
			return this;
		}
		
		i = this.searchPlace(key);
		keys[i] = key;
		values[i] = value;
		/*long elapsedTime = System.nanoTime() - start;
		System.out.println("\rthis put(" + key + ") took " + elapsedTime + " ns\r\r");*/		
		size++;
		return this;
	}
	
	public boolean isEmpty() {
		int i = searchOne();
		if (i > -1) return true;
		return false;
	}
	
	//--- Abstract Methods ---//
	
	protected abstract int searchPlace (Object key);
	protected abstract int getIndex (Object key);
	protected abstract int searchOne ();

	
}