package nc.bs.train.bd.cust.ace.bp;

import nc.bs.train.bd.cust.plugin.bpplugin.CustPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.UpdateBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.train.cust.AggCustHVO;

/**
 * �޸ı����BP
 * 
 */
public class AceCustUpdateBP {

	public AggCustHVO[] update(AggCustHVO[] bills,
			AggCustHVO[] originBills) {
		// �����޸�ģ��
		UpdateBPTemplate<AggCustHVO> bp = new UpdateBPTemplate<AggCustHVO>(
				CustPluginPoint.UPDATE);
		// ִ��ǰ����
		this.addBeforeRule(bp.getAroundProcesser());
		// ִ�к����
		this.addAfterRule(bp.getAroundProcesser());
		return bp.update(bills, originBills);
	}

	private void addAfterRule(CompareAroundProcesser<AggCustHVO> processer) {
		// TODO �����
		IRule<AggCustHVO> rule = null;

	}

	private void addBeforeRule(CompareAroundProcesser<AggCustHVO> processer) {
		// TODO ǰ����
		IRule<AggCustHVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.FillUpdateDataRule();
		processer.addBeforeRule(rule);
	}

}
