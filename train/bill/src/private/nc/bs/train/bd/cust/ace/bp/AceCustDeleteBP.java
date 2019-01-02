package nc.bs.train.bd.cust.ace.bp;

import nc.bs.train.bd.cust.plugin.bpplugin.CustPluginPoint;
import nc.vo.train.cust.AggCustHVO;

import nc.impl.pubapp.pattern.data.bill.template.DeleteBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;


/**
 * 标准单据删除BP
 */
public class AceCustDeleteBP {

	public void delete(AggCustHVO[] bills) {

		DeleteBPTemplate<AggCustHVO> bp = new DeleteBPTemplate<AggCustHVO>(
				CustPluginPoint.DELETE);
		// 增加执行前规则
		//this.addBeforeRule(bp.getAroundProcesser());
		// 增加执行后业务规则
		//this.addAfterRule(bp.getAroundProcesser());
		bp.delete(bills);
	}

	private void addBeforeRule(AroundProcesser<AggCustHVO> processer) {
		// TODO 前规则
		IRule<AggCustHVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.BillDeleteStatusCheckRule();
		processer.addBeforeRule(rule);
	}

	/**
	 * 删除后业务规则
	 * 
	 * @param processer
	 */
	private void addAfterRule(AroundProcesser<AggCustHVO> processer) {
		// TODO 后规则

	}
}
