package com.tnsif.framework;

public abstract class ShopAcc {

	private int accNo;
	private String accHolder;
	private String productName;
	private float productPrice;
	private float deliveryCharge;

	public ShopAcc(int accNo, String accHolder) {
		super();
		this.accNo = accNo;
		this.accHolder = accHolder;
		// this.productName = productName;
		// this.productPrice = productPrice;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	public float getDeliveryCharge() {
		return deliveryCharge;
	}

	public void setDeliveryCharge(float deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}

	public void bookproduct(String productName,float productPrice) {
       this.productName=productName;
       this.productPrice=productPrice;
	}

	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accHolder=" + accHolder + ", productName=" + productName
				+ ", productPrice=" + productPrice + ", deliveryCharge=" + deliveryCharge + ", getAccNo()=" + getAccNo()
				+ ", getAccHolder()=" + getAccHolder() + ", getProductName()=" + getProductName()
				+ ", getProductPrice()=" + getProductPrice() + ", getDeliveryCharge()=" + getDeliveryCharge()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	

}
