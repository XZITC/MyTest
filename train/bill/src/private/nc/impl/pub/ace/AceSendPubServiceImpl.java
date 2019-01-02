package nc.impl.pub.ace;
import nc.bs.train.bd.send.ace.bp.AceSendBP;
import nc.impl.pubapp.pub.smart.SmartServiceImpl;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.ISuperVO;
import nc.vo.train.send.SendVO;
import nc.vo.uif2.LoginContext;

public abstract class AceSendPubServiceImpl extends SmartServiceImpl {
	public SendVO[] pubquerybasedoc(IQueryScheme querySheme)
			throws nc.vo.pub.BusinessException {
		return new AceSendBP().queryByQueryScheme(querySheme);
	}
}