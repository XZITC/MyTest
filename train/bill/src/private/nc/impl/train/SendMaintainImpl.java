package nc.impl.train;

import nc.impl.pub.ace.AceSendPubServiceImpl;
import nc.impl.pubapp.pub.smart.BatchSaveAction;
import nc.vo.bd.meta.BatchOperateVO;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;
import nc.vo.train.send.SendVO;
import nc.itf.train.ISendMaintain;

public class SendMaintainImpl extends AceSendPubServiceImpl
		implements ISendMaintain {

	@Override
	public SendVO[] query(IQueryScheme queryScheme) throws BusinessException {
		return super.pubquerybasedoc(queryScheme);
	}

	@Override
	public BatchOperateVO batchSave(BatchOperateVO batchVO) throws BusinessException {
		BatchSaveAction<SendVO> saveAction = new BatchSaveAction<SendVO>();
		BatchOperateVO retData = saveAction.batchSave(batchVO);
		return retData;
	}
}
