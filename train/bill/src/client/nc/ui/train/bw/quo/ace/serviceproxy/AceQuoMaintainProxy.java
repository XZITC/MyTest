package nc.ui.train.bw.quo.ace.serviceproxy;

import nc.bs.framework.common.NCLocator;
import nc.itf.train.IQuoMaintain;
import nc.ui.pubapp.uif2app.query2.model.IQueryService;
import nc.ui.querytemplate.querytree.IQueryScheme;

/**
 * 示例单据的操作代理
 * 
 * @author author
 * @version tempProject version
 */
public class AceQuoMaintainProxy implements IQueryService {
	@Override
	public Object[] queryByQueryScheme(IQueryScheme queryScheme)
			throws Exception {
		IQuoMaintain query = NCLocator.getInstance().lookup(
				IQuoMaintain.class);
		return query.query(queryScheme);
	}

}