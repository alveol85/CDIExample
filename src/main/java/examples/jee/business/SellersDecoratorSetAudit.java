package examples.jee.business;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

import examples.jee.dto.SellerDecoratorDTO;

@Decorator
public class SellersDecoratorSetAudit implements IDecoratorVentas {
	
	@Inject
	@Delegate
	private IDecoratorVentas iDecoratorVentas;

	public SellersDecoratorSetAudit() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public SellerDecoratorDTO caculatePrice(int quantity) {
		SellerDecoratorDTO sellerDecorator = iDecoratorVentas.caculatePrice(quantity);
		System.out.println("se realiza la auditoria del producto " + sellerDecorator.getProductName());
		return sellerDecorator;
	}

}
