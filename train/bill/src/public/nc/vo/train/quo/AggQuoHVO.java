package nc.vo.train.quo;

import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;

@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.train.quo.QuoHVO")

public class AggQuoHVO extends AbstractBill {
	
	  @Override
	  public IBillMeta getMetaData() {
	  	IBillMeta billMeta =BillMetaFactory.getInstance().getBillMeta(AggQuoHVOMeta.class);
	  	return billMeta;
	  }
	    
	  @Override
	  public QuoHVO getParentVO(){
	  	return (QuoHVO)this.getParent();
	  }
	  
}