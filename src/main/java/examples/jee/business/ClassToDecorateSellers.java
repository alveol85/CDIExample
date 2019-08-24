package examples.jee.business;

import examples.jee.dto.SellerDecoratorDTO;

public class ClassToDecorateSellers implements IDecoratorVentas {

	public ClassToDecorateSellers() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public SellerDecoratorDTO caculatePrice(int quantity) {
		
		SellerDecoratorDTO sellerDecorator = new SellerDecoratorDTO();
		sellerDecorator.setProductName("Lapicero");
		sellerDecorator.setValue(1800);
		sellerDecorator.setTotalValue(sellerDecorator.getValue() * quantity);
		
		return sellerDecorator;
	}

}
