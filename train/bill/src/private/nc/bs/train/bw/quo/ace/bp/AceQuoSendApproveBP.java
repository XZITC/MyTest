package nc.bs.train.bw.quo.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.train.quo.AggQuoHVO;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * ��׼���������BP
 */
public class AceQuoSendApproveBP {
	/**
	 * ������
	 * 
	 * @param vos
	 *            ����VO����
	 * @param script
	 *            ���ݶ����ű�����
	 * @return �����ĵ���VO����
	 */

	public AggQuoHVO[] sendApprove(AggQuoHVO[] clientBills,
			AggQuoHVO[] originBills) {
		for (AggQuoHVO clientFullVO : clientBills) {
			clientFullVO.getParentVO().setAttributeValue("${vmObject.billstatus}",
					BillStatusEnum.COMMIT.value());
			clientFullVO.getParentVO().setStatus(VOStatus.UPDATED);
		}
		// ���ݳ־û�
		AggQuoHVO[] returnVos = new BillUpdate<AggQuoHVO>().update(
				clientBills, originBills);
		return returnVos;
	}
}
