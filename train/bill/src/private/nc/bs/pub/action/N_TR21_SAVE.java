package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.CommitStatusCheckRule;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

import nc.bs.train.bw.quo.plugin.bpplugin.QuoPluginPoint;
import nc.vo.train.quo.AggQuoHVO;
import nc.itf.train.IQuoMaintain;

public class N_TR21_SAVE extends AbstractPfAction<AggQuoHVO> {

	protected CompareAroundProcesser<AggQuoHVO> getCompareAroundProcesserWithRules(
			Object userObj) {
		CompareAroundProcesser<AggQuoHVO> processor = new CompareAroundProcesser<AggQuoHVO>(
				QuoPluginPoint.SEND_APPROVE);
		// TODO �ڴ˴�������ǰ�����
		IRule<AggQuoHVO> rule = new CommitStatusCheckRule();
		processor.addBeforeRule(rule);
		return processor;
	}

	@Override
	protected AggQuoHVO[] processBP(Object userObj,
			AggQuoHVO[] clientFullVOs, AggQuoHVO[] originBills) {
		IQuoMaintain operator = NCLocator.getInstance().lookup(
				IQuoMaintain.class);
		AggQuoHVO[] bills = null;
		try {
			bills = operator.save(clientFullVOs, originBills);
		} catch (BusinessException e) {
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}
		return bills;
	}

}
