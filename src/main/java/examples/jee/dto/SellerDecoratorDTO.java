package examples.jee.dto;

public class SellerDecoratorDTO {

	public SellerDecoratorDTO() {
		// TODO Auto-generated constructor stub
	}

	private String productName;
	private int value;
	private int totalValue;
	private String clienteName;
	private Double ivaValue;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(int totalValue) {
		this.totalValue = totalValue;
	}

	public String getClienteName() {
		return clienteName;
	}

	public void setClienteName(String clienteName) {
		this.clienteName = clienteName;
	}

	public Double getIvaValue() {
		return ivaValue;
	}

	public void setIvaValue(Double ivaValue) {
		this.ivaValue = ivaValue;
	}
	
}
