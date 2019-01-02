package nc.vo.train.cust;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggCustHVOMeta extends AbstractBillMeta{
	
	public AggCustHVOMeta(){
		this.init();
	}
	
	private void init() {
		this.setParent(nc.vo.train.cust.CustHVO.class);
		this.addChildren(nc.vo.train.cust.CustBVO.class);
	}
}