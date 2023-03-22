package com.tnsif.application;

import com.tnsif.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {

	public GSPrimeAcc(int accNo, String accHolder, boolean isPrime) {
		super(accNo, accHolder, isPrime);
		
	}
	

	@Override
	public String toString() {
		return "GSPrimeAcc [toString()=" + super.toString() + ", getAccNo()=" + getAccNo() + ", getAccHolder()="
				+ getAccHolder() + ", getProductName()=" + getProductName() + ", getProductPrice()=" + getProductPrice()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
