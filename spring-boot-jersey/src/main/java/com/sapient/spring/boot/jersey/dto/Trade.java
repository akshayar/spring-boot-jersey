package com.sapient.spring.boot.jersey.dto;

public class Trade {
	private int id;
	private String symbol;
	private double quantity;
	private double price;
	/**
	 * @return the id
	 */
	public final int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public final void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the symbol
	 */
	public final String getSymbol() {
		return symbol;
	}
	/**
	 * @param symbol the symbol to set
	 */
	public final void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	/**
	 * @return the quantity
	 */
	public final double getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public final void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the price
	 */
	public final double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public final void setPrice(double price) {
		this.price = price;
	}
	
	
	

}
