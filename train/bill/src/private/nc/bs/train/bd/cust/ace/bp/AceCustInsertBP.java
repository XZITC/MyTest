package nc.bs.train.bd.cust.ace.bp;

import nc.bs.train.bd.cust.plugin.bpplugin.CustPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.InsertBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.train.cust.AggCustHVO;

/**
 * 标准单据新增BP
 */
public class AceCustInsertBP {

	public AggCustHVO[] insert(AggCustHVO[] bills) {

		InsertBPTemplate<AggCustHVO> bp = new InsertBPTemplate<AggCustHVO>(
				CustPluginPoint.INSERT);
		this.addBeforeRule(bp.getAroundProcesser());
		this.addAfterRule(bp.getAroundProcesser());
		return bp.insert(bills);

	}

	/**
	 * 新增后规则
	 * 
	 * @param processor
	 */
	private void addAfterRule(AroundProcesser<AggCustHVO> processor) {
		// TODO 新增后规则
		IRule<AggCustHVO> rule = null;
	}

	/**
	 * 新增前规则
	 * 
	 * @param processor
	 */
	private void addBeforeRule(AroundProcesser<AggCustHVO> processer) {
		// TODO 新增前规则
		IRule<AggCustHVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.FillInsertDataRule();
		processer.addBeforeRule(rule);
	}
}
