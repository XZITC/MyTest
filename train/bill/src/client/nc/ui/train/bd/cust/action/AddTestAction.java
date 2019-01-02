package nc.ui.train.bd.cust.action;

import java.awt.event.ActionEvent;

import nc.ui.pub.beans.MessageDialog;
import nc.ui.uif2.NCAction;
import nc.ui.uif2.UIState;
import nc.ui.uif2.editor.BillForm;
import nc.ui.uif2.model.AbstractAppModel;

public class AddTestAction extends NCAction{	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3043518018449385491L;
	public AddTestAction() {
		super.setBtnName("���԰�ť");
		// TODO �Զ����ɵĹ��캯�����
	}
	
	private BillForm editor;
	
	private AbstractAppModel model;
	public void doAction(ActionEvent e) throws Exception {
		MessageDialog.showHintDlg(editor, "��ʾ", "�����Լ����µİ�ť");
	}	
	
	public BillForm getEditor() {
		return editor;
	}
	public void setEditor(BillForm editor) {
		this.editor = editor;
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
