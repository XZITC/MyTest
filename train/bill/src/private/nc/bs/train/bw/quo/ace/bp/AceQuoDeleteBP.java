package nc.bs.train.bw.quo.ace.bp;

import nc.bs.train.bw.quo.plugin.bpplugin.QuoPluginPoint;
import nc.vo.train.quo.AggQuoHVO;

import nc.impl.pubapp.pattern.data.bill.template.DeleteBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;


/**
 * 标准单据删除BP
 */
public class AceQuoDeleteBP {

	public void delete(AggQuoHVO[] bills) {

		DeleteBPTemplate<AggQuoHVO> bp = new DeleteBPTemplate<AggQuoHVO>(
				QuoPluginPoint.DELETE);
		// 增加执行前规则
		this.addBeforeRule(bp.getAroundProcesser());
		// 增加执行后业务规则
		this.addAfterRule(bp.getAroundProcesser());
		bp.delete(bills);
	}

	private void addBeforeRule(AroundProcesser<AggQuoHVO> processer) {
		// TODO 前规则
		IRule<AggQuoHVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.BillDeleteStatusCheckRule();
		processer.addBeforeRule(rule);
	}

	/**
	 * 删除后业务规则
	 * 
	 * @param processer
	 */
	private void addAfterRule(AroundProcesser<AggQuoHVO> processer) {
		// TODO 后规则

	}
}
