package nc.ui.train.bd.cust.action;

import java.awt.event.ActionEvent;

import nc.ui.pub.beans.MessageDialog;
import nc.ui.uif2.NCAction;
import nc.ui.uif2.UIState;
import nc.ui.uif2.editor.BillForm;
import nc.ui.uif2.model.AbstractAppModel;

public class ExtDocManageAction extends NCAction{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2946591643050638932L;
	public ExtDocManageAction() {
		super.setBtnName("��������");
		// TODO �Զ����ɵĹ��캯�����
	}
	
	private AbstractAppModel model;
	
	public void doAction(ActionEvent e) throws Exception {
			
	}		
	public AbstractAppModel getModel() {
		return model;
	}
	public void setModel(AbstractAppModel model) {
		this.model = model;
		model.addAppEventListener(this);
	}	
	protected boolean isActionEnale(){
		return this.model.getUiState() == UIState.NOT_EDIT;
	}
}

