package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dao.OrderDTO;

public class OrderForm extends BaseForm{

	@NotEmpty(message = "name is required")
	public String orderName;
	
	@NotEmpty(message = "price is required")
	public int price;
	
	
	
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	@Override
	public BaseDTO getDto() {
		
	OrderDTO dto = 	initDTO(new OrderDTO());
	dto.setOrderName(orderName);
	dto.setPrice(price);
	
	
		return dto;
	}
}
