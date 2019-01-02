package nc.bs.train.bw.quo.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.train.quo.AggQuoHVO;
import nc.vo.pub.VOStatus;

/**
 * 标准单据弃审的BP
 */
public class AceQuoUnApproveBP {

	public AggQuoHVO[] unApprove(AggQuoHVO[] clientBills,
			AggQuoHVO[] originBills) {
		for (AggQuoHVO clientBill : clientBills) {
			clientBill.getParentVO().setStatus(VOStatus.UPDATED);
		}
		BillUpdate<AggQuoHVO> update = new BillUpdate<AggQuoHVO>();
		AggQuoHVO[] returnVos = update.update(clientBills, originBills);
		return returnVos;
	}
}
