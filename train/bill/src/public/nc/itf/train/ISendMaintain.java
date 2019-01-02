package nc.itf.train;

import nc.itf.pubapp.pub.smart.ISmartService;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;
import nc.vo.train.send.SendVO;

public interface ISendMaintain extends ISmartService{

	 public SendVO[] query(IQueryScheme queryScheme)
      throws BusinessException, Exception;
}