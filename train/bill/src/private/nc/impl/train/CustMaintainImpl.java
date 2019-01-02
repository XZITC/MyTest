package nc.impl.train;

import nc.impl.pub.ace.AceCustPubServiceImpl;
import nc.vo.train.cust.AggCustHVO;
import nc.itf.train.ICustMaintain;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;

public class CustMaintainImpl extends AceCustPubServiceImpl implements
		ICustMaintain {

	@Override
	public void delete(AggCustHVO[] vos) throws BusinessException {
		super.pubdeleteBills(vos);
	}

	@Override
	public AggCustHVO[] insert(AggCustHVO[] vos) throws BusinessException {
		return super.pubinsertBills(vos);
	}

	@Override
	public AggCustHVO[] update(AggCustHVO[] vos) throws BusinessException {
		return super.pubupdateBills(vos);
	}

	@Override
	public AggCustHVO[] query(IQueryScheme queryScheme)
			throws BusinessException {
		return super.pubquerybills(queryScheme);
	}

}
