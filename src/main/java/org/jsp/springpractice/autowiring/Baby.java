package org.jsp.springpractice.autowiring;

public class Baby {
	private IceCream iceCream;

	public IceCream getIceCream() {
		return iceCream;
	}

	public void setIceCream(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	
}
