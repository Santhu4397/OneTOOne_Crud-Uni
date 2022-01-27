package controller;

import Dao.invoicedao;
import Dto.Item;
import Dto.invoice;

public class controller {

	public static void main(String[] args) {
			invoicedao invoicedao=new invoicedao();
			Item item=new Item();
			item.setId(1);
			item.setName("mobile");
			item.setCost(15000);
			item.setQty(2);
			invoice invoice=new invoice();
			invoice.setId(1);
			invoice.setName("santhu");
			invoice.setBillingAddress("BLR JSP");
			invoice.setTax(16.85);
			invoice.setGstnumber("TRS-1568-86547");
			invoice.setItem(item);
			//invoicedao.save(invoice, item);
			//invoicedao.delete(3);
			invoicedao.update(invoice);
			invoice invoice2=invoicedao.get(1);
			System.out.println(invoice2.getName());
			

	}

}
