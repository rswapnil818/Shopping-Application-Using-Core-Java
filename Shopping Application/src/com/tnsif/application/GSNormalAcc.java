package com.tnsif.application;

import com.tnsif.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {

	public GSNormalAcc(int accNo, String accHolder) {
		super(accNo, accHolder);

	}

	@Override
	public String toString() {
		return "GSNormalAcc [getDeliveryCharges()=" + getDeliveryCharge() + ", toString()=" + super.toString()
				+ ", getAccNo()=" + getAccNo() + ", getAccHolder()=" + getAccHolder() + ", getProductName()="
				+ getProductName() + ", getProductPrice()=" + getProductPrice() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}
