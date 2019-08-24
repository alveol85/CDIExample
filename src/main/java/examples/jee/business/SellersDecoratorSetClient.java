package examples.jee.business;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

import examples.jee.dto.SellerDecoratorDTO;

@Decorator
public class SellersDecoratorSetClient implements IDecoratorVentas {

	@Inject
	@Delegate
	private IDecoratorVentas iDecoratorVentas;

	public SellersDecoratorSetClient() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public SellerDecoratorDTO caculatePrice(int quantity) {
		SellerDecoratorDTO sellerDecorator = iDecoratorVentas.caculatePrice(quantity);
		sellerDecorator.setClienteName("alex");
		return sellerDecorator;
	}

}
