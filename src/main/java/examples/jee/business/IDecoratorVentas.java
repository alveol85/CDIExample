package examples.jee.business;

import examples.jee.dto.SellerDecoratorDTO;

public interface IDecoratorVentas {
	
	public SellerDecoratorDTO caculatePrice(int quantity);

}
