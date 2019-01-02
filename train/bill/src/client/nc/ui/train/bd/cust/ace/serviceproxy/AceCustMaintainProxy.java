package nc.ui.train.bd.cust.ace.serviceproxy;

import nc.bs.framework.common.NCLocator;
import nc.ui.pubapp.pub.task.ISingleBillService;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.model.entity.bill.IBill;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.ui.pubapp.uif2app.actions.IDataOperationService;
import nc.ui.pubapp.uif2app.query2.model.IQueryService;
import nc.ui.uif2.components.pagination.IPaginationQueryService;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.train.cust.AggCustHVO;
import nc.itf.train.ICustMaintain;

/**
 * 示例单据的操作代理
 * 
 * @author author
 * @version tempProject version
 */
public class AceCustMaintainProxy implements IDataOperationService,
		IQueryService ,ISingleBillService<AggCustHVO>{
	@Override
	public IBill[] insert(IBill[] value) throws BusinessException {
		ICustMaintain operator = NCLocator.getInstance().lookup(
				ICustMaintain.class);
		AggCustHVO[] vos = operator.insert((AggCustHVO[]) value);
		return vos;
	}

	@Override
	public IBill[] update(IBill[] value) throws BusinessException {
		ICustMaintain operator = NCLocator.getInstance().lookup(
				ICustMaintain.class);
		AggCustHVO[] vos = operator.update((AggCustHVO[]) value);
		return vos;
	}

	@Override
	public IBill[] delete(IBill[] value) throws BusinessException {
		// 目前的删除并不是走这个方法，由于pubapp不支持从这个服务中执行删除操作
		// 单据的删除实际上使用的是：ISingleBillService<AggSingleBill>的operateBill
		ICustMaintain operator = NCLocator.getInstance().lookup(
				ICustMaintain.class);
		operator.delete((AggCustHVO[]) value);
		return value;
	}
	
	@Override
	public AggCustHVO operateBill(AggCustHVO bill) throws Exception {
		ICustMaintain operator = NCLocator.getInstance().lookup(
				ICustMaintain.class);
		operator.delete(new AggCustHVO[] { bill });
		return bill;
	}

	@Override
	public Object[] queryByQueryScheme(IQueryScheme queryScheme)
			throws Exception {
		ICustMaintain query = NCLocator.getInstance().lookup(
				ICustMaintain.class);
		return query.query(queryScheme);
	}

}
