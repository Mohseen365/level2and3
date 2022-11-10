package CodeForSingleton;

public class Singleton { // singleton esi class hoti he jiska sirf ek object hi hota he
	private static Singleton inst; // isko static isliye banaya kyuki static fun ke liye static data mem chahiye;   private isliye taki bahar wla n use kr sake
	
	private Singleton() { //isko private isliye bnaya taki iska object bhar nhi bana sake
	}
	
	public static Singleton getTheSingleInstance() { // isko static isliye bnaya he kyuki ham bina constructor call kre class ke through call krenge
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
