package nc.impl.train;

import nc.impl.pub.ace.AceCustclassPubServiceImpl;
import nc.itf.train.ICustclassMaintain;
import nc.vo.train.custclass.CustClassVO;
import nc.vo.pub.BusinessException;

public class CustclassMaintainImpl extends AceCustclassPubServiceImpl implements ICustclassMaintain {

      @Override
    public void delete(CustClassVO vos) throws BusinessException {
        super.deletetreeinfo(vos);
    }
  
      @Override
    public CustClassVO insert(CustClassVO vos) throws BusinessException {
        return super.inserttreeinfo(vos);
    }
    
      @Override
    public CustClassVO update(CustClassVO vos) throws BusinessException {
        return super.updatetreeinfo(vos);    
    }
  
      @Override
    public CustClassVO[] query(String whereSql)
        throws BusinessException {
        return super.querytreeinfo(whereSql);
    }

  
}
