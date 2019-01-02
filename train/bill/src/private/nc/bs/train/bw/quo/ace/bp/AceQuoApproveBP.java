package nc.bs.train.bw.quo.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.train.quo.AggQuoHVO;

/**
 * ��׼������˵�BP
 */
public class AceQuoApproveBP {

	/**
	 * ��˶���
	 * 
	 * @param vos
	 * @param script
	 * @return
	 */
	public AggQuoHVO[] approve(AggQuoHVO[] clientBills,
			AggQuoHVO[] originBills) {
		for (AggQuoHVO clientBill : clientBills) {
			clientBill.getParentVO().setStatus(VOStatus.UPDATED);
		}
		BillUpdate<AggQuoHVO> update = new BillUpdate<AggQuoHVO>();
		AggQuoHVO[] returnVos = update.update(clientBills, originBills);
		return returnVos;
	}

}
