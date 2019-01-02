package nc.ui.train.common;

import nc.ui.pub.bill.BillCardPanel;
import nc.vo.pub.lang.UFDouble;

public class BodySumUtil {
	public static void BodySum(BillCardPanel cpanel){
		//获取表体总体的行      .取得标题.取得行总数
		int count = cpanel.getBillModel().getRowCount();
		UFDouble ntoalmny = UFDouble.ZERO_DBL;
		UFDouble ntotalnum = UFDouble.ZERO_DBL;
		//循环表体
		for (int i = 0;i < count; i ++){
			UFDouble nnum = (UFDouble) cpanel.getBodyValueAt(i, "nnum");
			UFDouble nprice = (UFDouble) cpanel.getBodyValueAt(i, "nprice");
			if(null == nnum){
				nnum = UFDouble.ZERO_DBL;
			}
			if(null == nprice){
				nprice = UFDouble.ZERO_DBL;
			}
			ntoalmny = ntoalmny.add(nnum.multiply(nprice));
			ntotalnum = ntotalnum.add(nnum);			
		}
		cpanel.setHeadItem("ntoalmny", ntoalmny);
		cpanel.setHeadItem("ntotalnum", ntotalnum);
	}
}
