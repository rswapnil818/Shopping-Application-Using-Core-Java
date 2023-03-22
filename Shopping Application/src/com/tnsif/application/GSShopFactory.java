package com.tnsif.application;

import com.tnsif.framework.NormalAcc;
import com.tnsif.framework.PrimeAcc;
import com.tnsif.framework.ShopFactory;

public class GSShopFactory extends ShopFactory {

	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accHolder, boolean isPrime) {
		GSPrimeAcc gsPrimeAcc = new GSPrimeAcc(accNo, accHolder, isPrime);
		return gsPrimeAcc;
	}

	@Override
	public NormalAcc getNewNormalAccount(int accNo, String accHolder, float deliveryCharges) {
		GSNormalAcc gsNormalAcc = new GSNormalAcc(accNo, accHolder);
		return gsNormalAcc;
	}

}
