package nc.itf.train;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.train.cust.AggCustHVO;
import nc.vo.pub.BusinessException;

public interface ICustMaintain {

	public void delete(AggCustHVO[] vos) throws BusinessException;

	public AggCustHVO[] insert(AggCustHVO[] vos) throws BusinessException;

	public AggCustHVO[] update(AggCustHVO[] vos) throws BusinessException;

	public AggCustHVO[] query(IQueryScheme queryScheme)
			throws BusinessException;

}