package nc.impl.pub.ace;

import nc.vo.train.custclass.CustClassVO;
import nc.impl.pubapp.pattern.data.vo.VODelete;
import nc.impl.pubapp.pattern.data.vo.VOInsert;
import nc.impl.pubapp.pattern.data.vo.VOQuery;
import nc.impl.pubapp.pattern.data.vo.VOUpdate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public abstract class AceCustclassPubServiceImpl {

	// 增加方法
	public CustClassVO inserttreeinfo(CustClassVO vo) throws BusinessException {
		try {
			// 添加BP规则
			AroundProcesser<CustClassVO> processer = new AroundProcesser<CustClassVO>(
					null);
			processer.before(new CustClassVO[] { vo });
			VOInsert<CustClassVO> ins = new VOInsert<CustClassVO>();
			CustClassVO[] superVOs = ins.insert(new CustClassVO[] { vo });
			return superVOs[0];
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return null;
	}

	// 删除方法
	public void deletetreeinfo(CustClassVO vo) throws BusinessException {
		try {
			// 添加BP规则
			AroundProcesser<CustClassVO> processer = new AroundProcesser<CustClassVO>(
					null);
			processer.before(new CustClassVO[] { vo });
			VODelete<CustClassVO> voDel = new VODelete<CustClassVO>();
			voDel.delete(new CustClassVO[] { vo });
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}

	}

	// 修改方法
	public CustClassVO updatetreeinfo(CustClassVO vo) throws BusinessException {
		try {
			// 添加BP规则
			AroundProcesser<CustClassVO> processer = new AroundProcesser<CustClassVO>(
					null);
			CustClassVO[] originVOs = this
					.getTreeCardVOs(new CustClassVO[] { vo });
			processer.before(new CustClassVO[] { vo });
			VOUpdate<CustClassVO> upd = new VOUpdate<CustClassVO>();
			CustClassVO[] superVOs = upd.update(new CustClassVO[] { vo },
					originVOs);
			return superVOs[0];
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return null;
	}

	private CustClassVO[] getTreeCardVOs(CustClassVO[] vos) {
		String[] ids = this.getIDS(vos);
		VOQuery<CustClassVO> query = new VOQuery<CustClassVO>(CustClassVO.class);
		return query.query(ids);
	}

	private String[] getIDS(CustClassVO[] vos) {
		int size = vos.length;
		String[] ids = new String[size];
		for (int i = 0; i < size; i++) {
			ids[i] = vos[i].getPrimaryKey();
		}
		return ids;
	}

	// 查询方法
	public CustClassVO[] querytreeinfo(String whereSql) throws BusinessException {
		VOQuery<CustClassVO> query = new VOQuery<CustClassVO>(CustClassVO.class);
		return query.query(whereSql, null);
	}
}