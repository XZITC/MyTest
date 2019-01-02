package nc.bs.train.bd.cust.ace.bp;

import nc.bs.train.bd.cust.plugin.bpplugin.CustPluginPoint;
import nc.vo.train.cust.AggCustHVO;

import nc.impl.pubapp.pattern.data.bill.template.DeleteBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;


/**
 * ��׼����ɾ��BP
 */
public class AceCustDeleteBP {

	public void delete(AggCustHVO[] bills) {

		DeleteBPTemplate<AggCustHVO> bp = new DeleteBPTemplate<AggCustHVO>(
				CustPluginPoint.DELETE);
		// ����ִ��ǰ����
		//this.addBeforeRule(bp.getAroundProcesser());
		// ����ִ�к�ҵ�����
		//this.addAfterRule(bp.getAroundProcesser());
		bp.delete(bills);
	}

	private void addBeforeRule(AroundProcesser<AggCustHVO> processer) {
		// TODO ǰ����
		IRule<AggCustHVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.BillDeleteStatusCheckRule();
		processer.addBeforeRule(rule);
	}

	/**
	 * ɾ����ҵ�����
	 * 
	 * @param processer
	 */
	private void addAfterRule(AroundProcesser<AggCustHVO> processer) {
		// TODO �����

	}
}
