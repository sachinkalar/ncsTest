package com.rays.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dao.OrderDTO;
import com.rays.form.OrderForm;
import com.rays.service.OrderServiceInt;

@RestController
@RequestMapping(value = "Order")
public class OrderCtl extends BaseCtl<OrderForm, OrderDTO, OrderServiceInt> {

	@Autowired
	public OrderServiceInt ods;

	@PostMapping("search")
	public ORSResponse search(@RequestBody OrderForm form) {

		OrderDTO dto = (OrderDTO) form.getDto();

		ORSResponse res = new ORSResponse(true);

		res.addData(ods.serach(dto));

		return res;
	}

}
