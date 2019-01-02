package nc.impl.pub.ace;

import nc.bs.train.bw.quo.ace.bp.AceQuoInsertBP;
import nc.bs.train.bw.quo.ace.bp.AceQuoUpdateBP;
import nc.bs.train.bw.quo.ace.bp.AceQuoDeleteBP;
import nc.bs.train.bw.quo.ace.bp.AceQuoSendApproveBP;
import nc.bs.train.bw.quo.ace.bp.AceQuoUnSendApproveBP;
import nc.bs.train.bw.quo.ace.bp.AceQuoApproveBP;
import nc.bs.train.bw.quo.ace.bp.AceQuoUnApproveBP;
import nc.impl.pubapp.pattern.data.bill.BillLazyQuery;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.train.quo.AggQuoHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.VOStatus;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public abstract class AceQuoPubServiceImpl {
	// ����
	public AggQuoHVO[] pubinsertBills(AggQuoHVO[] clientFullVOs,
			AggQuoHVO[] originBills) throws BusinessException {
		try {
			// ���ݿ������ݺ�ǰ̨���ݹ����Ĳ���VO�ϲ���Ľ��
			BillTransferTool<AggQuoHVO> transferTool = new BillTransferTool<AggQuoHVO>(
					clientFullVOs);
			// ����BP
			AceQuoInsertBP action = new AceQuoInsertBP();
			AggQuoHVO[] retvos = action.insert(clientFullVOs);
			// ���췵������
			return transferTool.getBillForToClient(retvos);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return null;
	}

	// ɾ��
	public void pubdeleteBills(AggQuoHVO[] clientFullVOs,
			AggQuoHVO[] originBills) throws BusinessException {
		try {
			// ����BP
			new AceQuoDeleteBP().delete(clientFullVOs);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
	}

	// �޸�
	public AggQuoHVO[] pubupdateBills(AggQuoHVO[] clientFullVOs,
			AggQuoHVO[] originBills) throws BusinessException {
		try {
			// ���� + ���ts
			BillTransferTool<AggQuoHVO> transferTool = new BillTransferTool<AggQuoHVO>(
					clientFullVOs);
			AceQuoUpdateBP bp = new AceQuoUpdateBP();
			AggQuoHVO[] retvos = bp.update(clientFullVOs, originBills);
			// ���췵������
			return transferTool.getBillForToClient(retvos);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return null;
	}

	public AggQuoHVO[] pubquerybills(IQueryScheme queryScheme)
			throws BusinessException {
		AggQuoHVO[] bills = null;
		try {
			this.preQuery(queryScheme);
			BillLazyQuery<AggQuoHVO> query = new BillLazyQuery<AggQuoHVO>(
					AggQuoHVO.class);
			bills = query.query(queryScheme, null);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return bills;
	}

	/**
	 * ������ʵ�֣���ѯ֮ǰ��queryScheme���мӹ��������Լ����߼�
	 * 
	 * @param queryScheme
	 */
	protected void preQuery(IQueryScheme queryScheme) {
		// ��ѯ֮ǰ��queryScheme���мӹ��������Լ����߼�
	}

	// �ύ
	public AggQuoHVO[] pubsendapprovebills(
			AggQuoHVO[] clientFullVOs, AggQuoHVO[] originBills)
			throws BusinessException {
		AceQuoSendApproveBP bp = new AceQuoSendApproveBP();
		AggQuoHVO[] retvos = bp.sendApprove(clientFullVOs, originBills);
		return retvos;
	}

	// �ջ�
	public AggQuoHVO[] pubunsendapprovebills(
			AggQuoHVO[] clientFullVOs, AggQuoHVO[] originBills)
			throws BusinessException {
		AceQuoUnSendApproveBP bp = new AceQuoUnSendApproveBP();
		AggQuoHVO[] retvos = bp.unSend(clientFullVOs, originBills);
		return retvos;
	};

	// ����
	public AggQuoHVO[] pubapprovebills(AggQuoHVO[] clientFullVOs,
			AggQuoHVO[] originBills) throws BusinessException {
		for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		}
		AceQuoApproveBP bp = new AceQuoApproveBP();
		AggQuoHVO[] retvos = bp.approve(clientFullVOs, originBills);
		return retvos;
	}

	// ����

	public AggQuoHVO[] pubunapprovebills(AggQuoHVO[] clientFullVOs,
			AggQuoHVO[] originBills) throws BusinessException {
		for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		}
		AceQuoUnApproveBP bp = new AceQuoUnApproveBP();
		AggQuoHVO[] retvos = bp.unApprove(clientFullVOs, originBills);
		return retvos;
	}

}