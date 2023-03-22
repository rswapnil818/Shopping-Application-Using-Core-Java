package com.tnsif.framework;

public abstract class PrimeAcc extends ShopAcc {

	public PrimeAcc(int accNo, String accHolder) {
		super(accNo, accHolder);

	}

	private boolean isPrime = true;

	public PrimeAcc(int accNo, String accHolder, boolean isPrime) {
		super(accNo, accHolder);
		this.isPrime = isPrime;
	}

	static final private float deliveryCharges = 00.50f;

	public void bookProduct(String productName, float productPrice) {
		if (isPrime) {
			System.out.println("UserID : " + getAccNo());
			System.out.println("UserName : " + getAccHolder());
			System.out.println("Products are: " + productName + " = " + productPrice);
			System.out.println("Total Payable Amount is = " + (productPrice + deliveryCharges));
			System.out.println("Dear Prime User >>> Thank You, Your Order Placed Successfully");
			System.out.println("----------------------------------------------------------------");
		} else {
			System.out.println("Dear  "+getAccHolder()+">> You are not a Prime User");
			System.out.println("------------------------------------------------------------------");

		}

	}

	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", getAccNo()=" + getAccNo() + ", getAccHolder()=" + getAccHolder()
				+ ", getProductName()=" + getProductName() + ", getProductPrice()=" + getProductPrice()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

}
