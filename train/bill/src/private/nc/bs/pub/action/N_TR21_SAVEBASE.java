package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

import nc.bs.train.bw.quo.plugin.bpplugin.QuoPluginPoint;
import nc.vo.train.quo.AggQuoHVO;
import nc.itf.train.IQuoMaintain;

public class N_TR21_SAVEBASE extends AbstractPfAction<AggQuoHVO> {

	@Override
	protected CompareAroundProcesser<AggQuoHVO> getCompareAroundProcesserWithRules(
			Object userObj) {
		CompareAroundProcesser<AggQuoHVO> processor = null;
		AggQuoHVO[] clientFullVOs = (AggQuoHVO[]) this.getVos();
		if (!StringUtil.isEmptyWithTrim(clientFullVOs[0].getParentVO()
				.getPrimaryKey())) {
			processor = new CompareAroundProcesser<AggQuoHVO>(
					QuoPluginPoint.SCRIPT_UPDATE);
		} else {
			processor = new CompareAroundProcesser<AggQuoHVO>(
					QuoPluginPoint.SCRIPT_INSERT);
		}
		// TODO 在此处添加前后规则
		IRule<AggQuoHVO> rule = null;

		return processor;
	}

	@Override
	protected AggQuoHVO[] processBP(Object userObj,
			AggQuoHVO[] clientFullVOs, AggQuoHVO[] originBills) {

		AggQuoHVO[] bills = null;
		try {
			IQuoMaintain operator = NCLocator.getInstance()
					.lookup(IQuoMaintain.class);
			if (!StringUtil.isEmptyWithTrim(clientFullVOs[0].getParentVO()
					.getPrimaryKey())) {
				bills = operator.update(clientFullVOs, originBills);
			} else {
				bills = operator.insert(clientFullVOs, originBills);
			}
		} catch (BusinessException e) {
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}
		return bills;
	}
}
