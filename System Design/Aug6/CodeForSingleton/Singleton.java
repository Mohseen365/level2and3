package CodeForSingleton;

public class Singleton { // singleton esi class hoti he jiska sirf ek object hi hota he
	private static Singleton inst; 
	
	private Singleton() { //isko private isliye bnaya taki iska object bhar nhi bana sake
	}
	
	public static Singleton getTheSingleInstance() {
		if(inst == null) { // jab pehli baar getTheSingleInstance ko call krenge tab hi banna chahiye kyuki singleton me sirf 1 object hi hota he
			synchronized (Singleton.class) {// jab ek thread iske ander chla gya to dusre thread ko ander aane nhi deta
				if(inst == null) {
					inst = new Singleton();
				}
			}
		}
		
		return inst;
	}
}
