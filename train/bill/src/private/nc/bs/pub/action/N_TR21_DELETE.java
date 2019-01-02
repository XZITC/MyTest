package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

import nc.bs.train.bw.quo.plugin.bpplugin.QuoPluginPoint;
import nc.vo.train.quo.AggQuoHVO;
import nc.itf.train.IQuoMaintain;

public class N_TR21_DELETE extends AbstractPfAction<AggQuoHVO> {

	@Override
	protected CompareAroundProcesser<AggQuoHVO> getCompareAroundProcesserWithRules(
			Object userObj) {
		CompareAroundProcesser<AggQuoHVO> processor = new CompareAroundProcesser<AggQuoHVO>(
				QuoPluginPoint.SCRIPT_DELETE);
		// TODO 在此处添加前后规则
		return processor;
	}

	@Override
	protected AggQuoHVO[] processBP(Object userObj,
			AggQuoHVO[] clientFullVOs, AggQuoHVO[] originBills) {
		IQuoMaintain operator = NCLocator.getInstance().lookup(
				IQuoMaintain.class);
		try {
			operator.delete(clientFullVOs, originBills);
		} catch (BusinessException e) {
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}
		return clientFullVOs;
	}

}
