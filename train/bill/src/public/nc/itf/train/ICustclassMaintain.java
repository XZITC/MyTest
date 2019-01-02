package nc.itf.train;

import nc.vo.train.custclass.CustClassVO;
import nc.vo.pub.BusinessException;

public interface ICustclassMaintain {

	public void delete(CustClassVO vo) throws BusinessException;

	public CustClassVO insert(CustClassVO vo) throws BusinessException;

	public CustClassVO update(CustClassVO vo) throws BusinessException;

	public CustClassVO[] query(String whereSql) throws BusinessException;
}