package nc.ui.train.bd.custclass.ace.serviceproxy;

import nc.bs.framework.common.NCLocator;
import nc.vo.train.custclass.CustClassVO;
import nc.itf.train.ICustclassMaintain;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.model.entity.bill.IBill;
import nc.ui.pubapp.uif2app.model.IQueryService;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.ui.uif2.model.IAppModelService;
import nc.vo.uif2.LoginContext;

/**
 * 示例单据的操作代理
 * 
 * @author author
 * @version tempProject version
 */
public class AceCustclassMaintainProxy implements IAppModelService, IQueryService {
	@Override
	public Object insert(Object object) throws Exception {
		ICustclassMaintain operator = NCLocator.getInstance().lookup(
				ICustclassMaintain.class);
		return operator.insert((CustClassVO) object);
	}

	@Override
	public Object update(Object object) throws Exception {
		ICustclassMaintain operator = NCLocator.getInstance().lookup(
				ICustclassMaintain.class);
		return operator.update((CustClassVO) object);
	}

	@Override
	public void delete(Object object) throws Exception {
		ICustclassMaintain operator = NCLocator.getInstance().lookup(
				ICustclassMaintain.class);
		operator.delete((CustClassVO) object);
	}

	@Override
	public Object[] queryByWhereSql(String whereSql) throws Exception {
		ICustclassMaintain query = NCLocator.getInstance().lookup(
				ICustclassMaintain.class);
		return query.query(whereSql);
	}

	@Override
	public Object[] queryByDataVisibilitySetting(LoginContext context)
			throws Exception {
		return null;
	}
}
