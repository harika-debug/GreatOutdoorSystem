package com.capgemini.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Inventory_table")
public class RetailerInventory {
	
	@Id
	@Column(name = "inventory_id")
	private String inventoryId;
	
	@Column(name = "retailer_id")
	private String retailerId;
	
	@Column(name = "product_id")
	private String productId;
	
	@Column(name = "product_quantity")
	private int productQuantity;
	
	@Column(name = "total_amount")
	private double totalAmount;

	@Column(name = "product_receive_time")
	private long productReceiveTime; 
	
	@Column(name = "product_sale_time")
    private long productSaleTime; 

  
	
	public RetailerInventory(String inventoryId,String retailorId,String productId,
			int productQuantity,Double totalAmount,long productRecieveTime,
			long productSaleTime) {
	super();
	
	this.inventoryId = inventoryId;
	this.retailerId = retailerId;
	this.productId = productId;
	this.productQuantity = productQuantity;
	this.totalAmount = totalAmount;
	this.productReceiveTime = productReceiveTime;
	this.productSaleTime = productSaleTime;
	}
	
	
	
		public String getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(String inventoryId) {
		this.inventoryId = inventoryId;
	}

	public String getRetailerId() {
		return retailerId;
	}

	public void setRetailerId(String retailerId) {
		this.retailerId = retailerId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}


	public Integer getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public long getProductReceiveTime() {
		return productReceiveTime;
	}

	public void setProductReceiveTime(long productReceiveTime) {
		this.productReceiveTime = productReceiveTime;
	}

	public long getProductSaleTime() {
		return productSaleTime;
	}

	public void setProductSaleTime(long productSaleTime) {
		this.productSaleTime = productSaleTime;
	}
	
	
}


