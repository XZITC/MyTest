package nc.itf.train;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.train.quo.AggQuoHVO;
import nc.vo.pub.BusinessException;

public interface IQuoMaintain {

	public void delete(AggQuoHVO[] clientFullVOs,
			AggQuoHVO[] originBills) throws BusinessException;

	public AggQuoHVO[] insert(AggQuoHVO[] clientFullVOs,
			AggQuoHVO[] originBills) throws BusinessException;

	public AggQuoHVO[] update(AggQuoHVO[] clientFullVOs,
			AggQuoHVO[] originBills) throws BusinessException;

	public AggQuoHVO[] query(IQueryScheme queryScheme)
			throws BusinessException;

	public AggQuoHVO[] save(AggQuoHVO[] clientFullVOs,
			AggQuoHVO[] originBills) throws BusinessException;

	public AggQuoHVO[] unsave(AggQuoHVO[] clientFullVOs,
			AggQuoHVO[] originBills) throws BusinessException;

	public AggQuoHVO[] approve(AggQuoHVO[] clientFullVOs,
			AggQuoHVO[] originBills) throws BusinessException;

	public AggQuoHVO[] unapprove(AggQuoHVO[] clientFullVOs,
			AggQuoHVO[] originBills) throws BusinessException;
}
