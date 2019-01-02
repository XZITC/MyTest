package nc.impl.pub.ace;

import nc.bs.train.bd.cust.ace.bp.AceCustInsertBP;
import nc.bs.train.bd.cust.ace.bp.AceCustUpdateBP;
import nc.bs.train.bd.cust.ace.bp.AceCustDeleteBP;
import nc.impl.pubapp.pattern.data.bill.BillLazyQuery;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.train.cust.AggCustHVO;

public abstract class AceCustPubServiceImpl {
	// ����
	public AggCustHVO[] pubinsertBills(AggCustHVO[] vos)
			throws BusinessException {
		try {
			// ���ݿ������ݺ�ǰ̨���ݹ����Ĳ���VO�ϲ���Ľ��
			BillTransferTool<AggCustHVO> transferTool = new BillTransferTool<AggCustHVO>(
					vos);
			AggCustHVO[] mergedVO = transferTool.getClientFullInfoBill();

			// ����BP
			AceCustInsertBP action = new AceCustInsertBP();
			AggCustHVO[] retvos = action.insert(mergedVO);
			// ���췵������
			return transferTool.getBillForToClient(retvos);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return null;
	}

	// ɾ��
	public void pubdeleteBills(AggCustHVO[] vos) throws BusinessException {
		try {
			// ���� �Ƚ�ts
			BillTransferTool<AggCustHVO> transferTool = new BillTransferTool<AggCustHVO>(
					vos);
			AggCustHVO[] fullBills = transferTool.getClientFullInfoBill();
			AceCustDeleteBP deleteBP = new AceCustDeleteBP();
			deleteBP.delete(fullBills);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
	}

	// �޸�
	public AggCustHVO[] pubupdateBills(AggCustHVO[] vos)
			throws BusinessException {
		try {
			// ���� + ���ts
			BillTransferTool<AggCustHVO> transTool = new BillTransferTool<AggCustHVO>(
					vos);
			// ��ȫǰ̨VO
			AggCustHVO[] fullBills = transTool.getClientFullInfoBill();
			// ����޸�ǰvo
			AggCustHVO[] originBills = transTool.getOriginBills();
			// ����BP
			AceCustUpdateBP bp = new AceCustUpdateBP();
			AggCustHVO[] retBills = bp.update(fullBills, originBills);
			// ���췵������
			retBills = transTool.getBillForToClient(retBills);
			return retBills;
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return null;
	}

	public AggCustHVO[] pubquerybills(IQueryScheme queryScheme)
			throws BusinessException {
		AggCustHVO[] bills = null;
		try {
			this.preQuery(queryScheme);
			BillLazyQuery<AggCustHVO> query = new BillLazyQuery<AggCustHVO>(
					AggCustHVO.class);
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

}