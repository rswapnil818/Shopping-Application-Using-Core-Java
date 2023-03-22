package com.tnsif.framework;

public abstract class ShopFactory {
	
	public abstract PrimeAcc getNewPrimeAccount(int accNo, String accHolder,boolean isPrime);
	public abstract NormalAcc getNewNormalAccount(int accNo, String accHolder,  float deliveryCharges);

}
