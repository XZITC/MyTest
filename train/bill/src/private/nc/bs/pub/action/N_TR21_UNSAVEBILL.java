package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.UncommitStatusCheckRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

import nc.bs.train.bw.quo.plugin.bpplugin.QuoPluginPoint;
import nc.vo.train.quo.AggQuoHVO;
import nc.itf.train.IQuoMaintain;

public class N_TR21_UNSAVEBILL extends AbstractPfAction<AggQuoHVO> {

	@Override
	protected CompareAroundProcesser<AggQuoHVO> getCompareAroundProcesserWithRules(
			Object userObj) {
		CompareAroundProcesser<AggQuoHVO> processor = new CompareAroundProcesser<AggQuoHVO>(
				QuoPluginPoint.UNSEND_APPROVE);
		// TODO 在此处添加前后规则
		processor.addBeforeRule(new UncommitStatusCheckRule());

		return processor;
	}

	@Override
	protected AggQuoHVO[] processBP(Object userObj,
			AggQuoHVO[] clientFullVOs, AggQuoHVO[] originBills) {
		IQuoMaintain operator = NCLocator.getInstance().lookup(
				IQuoMaintain.class);
		AggQuoHVO[] bills = null;
		try {
			bills = operator.unsave(clientFullVOs, originBills);
		} catch (BusinessException e) {
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}
		return bills;
	}

}
