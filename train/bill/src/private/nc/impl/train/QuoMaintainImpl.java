package nc.impl.train;

import nc.impl.pub.ace.AceQuoPubServiceImpl;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.train.quo.AggQuoHVO;
import nc.itf.train.IQuoMaintain;
import nc.vo.pub.BusinessException;

public class QuoMaintainImpl extends AceQuoPubServiceImpl
		implements IQuoMaintain {

	@Override
	public void delete(AggQuoHVO[] clientFullVOs,
			AggQuoHVO[] originBills) throws BusinessException {
		super.pubdeleteBills(clientFullVOs, originBills);
	}

	@Override
	public AggQuoHVO[] insert(AggQuoHVO[] clientFullVOs,
			AggQuoHVO[] originBills) throws BusinessException {
		return super.pubinsertBills(clientFullVOs, originBills);
	}

	@Override
	public AggQuoHVO[] update(AggQuoHVO[] clientFullVOs,
			AggQuoHVO[] originBills) throws BusinessException {
		return super.pubupdateBills(clientFullVOs, originBills);
	}

	@Override
	public AggQuoHVO[] query(IQueryScheme queryScheme)
			throws BusinessException {
		return super.pubquerybills(queryScheme);
	}

	@Override
	public AggQuoHVO[] save(AggQuoHVO[] clientFullVOs,
			AggQuoHVO[] originBills) throws BusinessException {
		return super.pubsendapprovebills(clientFullVOs, originBills);
	}

	@Override
	public AggQuoHVO[] unsave(AggQuoHVO[] clientFullVOs,
			AggQuoHVO[] originBills) throws BusinessException {
		return super.pubunsendapprovebills(clientFullVOs, originBills);
	}

	@Override
	public AggQuoHVO[] approve(AggQuoHVO[] clientFullVOs,
			AggQuoHVO[] originBills) throws BusinessException {
		return super.pubapprovebills(clientFullVOs, originBills);
	}

	@Override
	public AggQuoHVO[] unapprove(AggQuoHVO[] clientFullVOs,
			AggQuoHVO[] originBills) throws BusinessException {
		return super.pubunapprovebills(clientFullVOs, originBills);
	}

}
