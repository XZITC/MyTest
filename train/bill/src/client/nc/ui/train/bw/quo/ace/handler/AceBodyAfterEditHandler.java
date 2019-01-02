package nc.ui.train.bw.quo.ace.handler;


import nc.ui.pub.bill.BillCardPanel;
import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.event.card.CardBodyAfterEditEvent;
import nc.ui.train.common.BodySumUtil;
import nc.vo.pub.lang.UFDouble;

public class AceBodyAfterEditHandler implements IAppEventHandler<CardBodyAfterEditEvent>{

	@Override
	public void handleAppEvent(CardBodyAfterEditEvent e) {
		// TODO 自动生成的方法存根
		
		BillCardPanel cpanel = e.getBillCardPanel();
		String key =  e.getKey();
		
		if("nnum".equals(key) || "nprice".equals(key)){
			BodySumUtil.BodySum(cpanel);
		}	
		int row = e.getRow();
		UFDouble nnum = (UFDouble) cpanel.getBodyValueAt(row, "nnum");
		UFDouble nprice = (UFDouble) cpanel.getBodyValueAt(row, "nprice");
		UFDouble nmmy = UFDouble.ZERO_DBL;
		if(null == nnum){
			nnum = UFDouble.ZERO_DBL;
		}
		if(null == nprice){
			nprice = UFDouble.ZERO_DBL;
		}
		nmmy = nnum.multiply(nprice);
		cpanel.setBodyValueAt(nmmy, row, "nmmy");
	}

}
