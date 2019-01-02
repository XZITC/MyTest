package nc.vo.train.quo;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggQuoHVOMeta extends AbstractBillMeta{
	
	public AggQuoHVOMeta(){
		this.init();
	}
	
	private void init() {
		this.setParent(nc.vo.train.quo.QuoHVO.class);
		this.addChildren(nc.vo.train.quo.QuoBVO.class);
	}
}