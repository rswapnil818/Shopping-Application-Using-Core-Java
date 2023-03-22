package com.tnsif.client;

import com.tnsif.application.GSNormalAcc;
import com.tnsif.application.GSPrimeAcc;
import com.tnsif.application.GSShopFactory;
import com.tnsif.framework.NormalAcc;
import com.tnsif.framework.PrimeAcc;
import com.tnsif.framework.ShopFactory;

public class Shopping {
	
	public static void main(String[] args) {
		ShopFactory factory=new GSShopFactory();
		
		PrimeAcc gs= new GSPrimeAcc(1, "Swapnil", true);
		gs.bookProduct("Book", 100);
		
		PrimeAcc gs1= new GSPrimeAcc(1, "Sachit", false);
		gs1.bookProduct("Book", 100);
		
		NormalAcc g=new GSNormalAcc(1, "Sachin");
		g.bookProduct("bike", 10000, 500);
	}
}
