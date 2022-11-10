package CodeForAdapterDesignPattern;

import java.util.List;

// Data consumer
public class Intranet {
	IPhoneListSource source; // iski jagah pr ham vo saari classes bhi le sakte he jo is interface ko implement krti he
	
	public Intranet(IPhoneListSource source) {
		this.source = source;
	}
	
	public void printPhoneNumbers() {
		List<String> phones = this.source.GetPhoneNumbers();
		System.out.println(phones);
	}
}
