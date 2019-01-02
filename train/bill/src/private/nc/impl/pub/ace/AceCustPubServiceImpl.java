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
	// 新增
	public AggCustHVO[] pubinsertBills(AggCustHVO[] vos)
			throws BusinessException {
		try {
			// 数据库中数据和前台传递过来的差异VO合并后的结果
			BillTransferTool<AggCustHVO> transferTool = new BillTransferTool<AggCustHVO>(
					vos);
			AggCustHVO[] mergedVO = transferTool.getClientFullInfoBill();

			// 调用BP
			AceCustInsertBP action = new AceCustInsertBP();
			AggCustHVO[] retvos = action.insert(mergedVO);
			// 构造返回数据
			return transferTool.getBillForToClient(retvos);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return null;
	}

	// 删除
	public void pubdeleteBills(AggCustHVO[] vos) throws BusinessException {
		try {
			// 加锁 比较ts
			BillTransferTool<AggCustHVO> transferTool = new BillTransferTool<AggCustHVO>(
					vos);
			AggCustHVO[] fullBills = transferTool.getClientFullInfoBill();
			AceCustDeleteBP deleteBP = new AceCustDeleteBP();
			deleteBP.delete(fullBills);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
	}

	// 修改
	public AggCustHVO[] pubupdateBills(AggCustHVO[] vos)
			throws BusinessException {
		try {
			// 加锁 + 检查ts
			BillTransferTool<AggCustHVO> transTool = new BillTransferTool<AggCustHVO>(
					vos);
			// 补全前台VO
			AggCustHVO[] fullBills = transTool.getClientFullInfoBill();
			// 获得修改前vo
			AggCustHVO[] originBills = transTool.getOriginBills();
			// 调用BP
			AceCustUpdateBP bp = new AceCustUpdateBP();
			AggCustHVO[] retBills = bp.update(fullBills, originBills);
			// 构造返回数据
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
	 * 由子类实现，查询之前对queryScheme进行加工，加入自己的逻辑
	 * 
	 * @param queryScheme
	 */
	protected void preQuery(IQueryScheme queryScheme) {
		// 查询之前对queryScheme进行加工，加入自己的逻辑
	}

}