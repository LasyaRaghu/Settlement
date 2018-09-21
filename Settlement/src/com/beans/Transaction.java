package com.beans;

public class Transaction {
	private String transactionId;
	private String buyerCompanyId;
	private String securityId;
	private String sellerCompanyId;
	private int quantity;
	private float price;
	
	public Transaction() {
		
	}
	public Transaction(String transactionId, String buyerCompanyId,String securityId,String sellerCompanyId,int quantity, float price) {
		super();
		this.transactionId = transactionId;
		this.buyerCompanyId = buyerCompanyId;
		this.securityId = securityId;
		this.sellerCompanyId = sellerCompanyId;
		this.quantity=quantity;
		this.price =  price;
	}
	public String getTransId() {
		return transactionId;
	}
	public void setTransId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getBuyerCompId() {
		return buyerCompanyId;
	}
	public void setBuyerCompId(String buyerCompanyId) {
		this.buyerCompanyId = buyerCompanyId;
	}
	public String getSecurityId() {
		return securityId;
	}
	public void setSecurityId(String securityId) {
		this.securityId = securityId;
	}
	public String getSellerCompId() {
		return sellerCompanyId;
	}
	public void setSellerCompId(String sellerCompanyId) {
		this.sellerCompanyId = sellerCompanyId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
  
}
