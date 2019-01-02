package nc.vo.train.cust;

import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;

@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.train.cust.CustHVO")

public class AggCustHVO extends AbstractBill {
	
	  @Override
	  public IBillMeta getMetaData() {
	  	IBillMeta billMeta =BillMetaFactory.getInstance().getBillMeta(AggCustHVOMeta.class);
	  	return billMeta;
	  }
	    
	  @Override
	  public CustHVO getParentVO(){
	  	return (CustHVO)this.getParent();
	  }
	  
}