package com.tnsif.framework;

public abstract class NormalAcc extends ShopAcc {

	public NormalAcc(int accNo, String accHolder) {
		super(accNo, accHolder);
		// TODO Auto-generated constructor stub
	}

	public float deliveryCharge;

	public void bookProduct(String productName, float productPrice, float deliveryCharge) {
		System.out.println("UserID : " + getAccNo());
		System.out.println("UserName : " + getAccHolder());
		System.out.println("Products are: " + productName + " = " + productPrice);
		System.out.println("Total Payable Amount is = " + (productPrice + deliveryCharge));
		System.out.println("Dear User>>>Thank You, Your Order Placed Successfully");
		System.out.println("----------------------------------------------------------------");

	}

	@Override
	public String toString() {
		return "NormalAcc [deliveryCharge=" + deliveryCharge + ", getDeliveryCharges()=" + getDeliveryCharge()
				+ ", getAccNo()=" + getAccNo() + ", getAccHolder()=" + getAccHolder() + ", getProductName()="
				+ getProductName() + ", getProductPrice()=" + getProductPrice() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
