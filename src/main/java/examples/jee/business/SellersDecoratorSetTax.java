package examples.jee.business;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

import examples.jee.dto.SellerDecoratorDTO;

@Decorator
public class SellersDecoratorSetTax implements IDecoratorVentas {
	
	@Inject
	@Delegate
	private IDecoratorVentas iDecoratorVentas;

	public SellersDecoratorSetTax()  {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public SellerDecoratorDTO caculatePrice(int quantity) {
		SellerDecoratorDTO sellerDecorator = iDecoratorVentas.caculatePrice(quantity);
		sellerDecorator.setIvaValue(sellerDecorator.getTotalValue() * 0.12);
		return sellerDecorator;
	}

}
