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
	// 新增
	public AggQuoHVO[] pubinsertBills(AggQuoHVO[] clientFullVOs,
			AggQuoHVO[] originBills) throws BusinessException {
		try {
			// 数据库中数据和前台传递过来的差异VO合并后的结果
			BillTransferTool<AggQuoHVO> transferTool = new BillTransferTool<AggQuoHVO>(
					clientFullVOs);
			// 调用BP
			AceQuoInsertBP action = new AceQuoInsertBP();
			AggQuoHVO[] retvos = action.insert(clientFullVOs);
			// 构造返回数据
			return transferTool.getBillForToClient(retvos);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return null;
	}

	// 删除
	public void pubdeleteBills(AggQuoHVO[] clientFullVOs,
			AggQuoHVO[] originBills) throws BusinessException {
		try {
			// 调用BP
			new AceQuoDeleteBP().delete(clientFullVOs);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
	}

	// 修改
	public AggQuoHVO[] pubupdateBills(AggQuoHVO[] clientFullVOs,
			AggQuoHVO[] originBills) throws BusinessException {
		try {
			// 加锁 + 检查ts
			BillTransferTool<AggQuoHVO> transferTool = new BillTransferTool<AggQuoHVO>(
					clientFullVOs);
			AceQuoUpdateBP bp = new AceQuoUpdateBP();
			AggQuoHVO[] retvos = bp.update(clientFullVOs, originBills);
			// 构造返回数据
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
	 * 由子类实现，查询之前对queryScheme进行加工，加入自己的逻辑
	 * 
	 * @param queryScheme
	 */
	protected void preQuery(IQueryScheme queryScheme) {
		// 查询之前对queryScheme进行加工，加入自己的逻辑
	}

	// 提交
	public AggQuoHVO[] pubsendapprovebills(
			AggQuoHVO[] clientFullVOs, AggQuoHVO[] originBills)
			throws BusinessException {
		AceQuoSendApproveBP bp = new AceQuoSendApproveBP();
		AggQuoHVO[] retvos = bp.sendApprove(clientFullVOs, originBills);
		return retvos;
	}

	// 收回
	public AggQuoHVO[] pubunsendapprovebills(
			AggQuoHVO[] clientFullVOs, AggQuoHVO[] originBills)
			throws BusinessException {
		AceQuoUnSendApproveBP bp = new AceQuoUnSendApproveBP();
		AggQuoHVO[] retvos = bp.unSend(clientFullVOs, originBills);
		return retvos;
	};

	// 审批
	public AggQuoHVO[] pubapprovebills(AggQuoHVO[] clientFullVOs,
			AggQuoHVO[] originBills) throws BusinessException {
		for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		}
		AceQuoApproveBP bp = new AceQuoApproveBP();
		AggQuoHVO[] retvos = bp.approve(clientFullVOs, originBills);
		return retvos;
	}

	// 弃审

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