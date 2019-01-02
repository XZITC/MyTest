package nc.ui.train.pub.ref;
import nc.ui.bd.ref.AbstractRefTreeModel;
public class CustClassRefModel extends AbstractRefTreeModel{
	public CustClassRefModel(){
		super();
	}
	@Override
	public int getClassDefaultFieldCount() {
		return super.getClassDefaultFieldCount();
	}
	@Override
	public String[] getFieldCode() {//�������ݵ��ֶα���
		return new String[]{
				"code",
				"name"
		};
	}
	@Override
	public String[] getFieldName() {//�������ݵ��ֶ�����
		return new String[]{
				"�ͻ��������",
				"�ͻ���������"
		};
	}
	@Override
	public String[] getHiddenFieldCode() {//��Ҫ���صĲ������ݵ��ֶα���
		//��Ҫ���漰�������õ��ֶη��룬������getFieldCode�е��ֶ�
		//�����л�Ӧ�ý�getFatherField�����е��ֶκ�getChildField�����е��ֶη���
		return new String[]{"pk_custty", "parent"};
	}
	@Override
	public String getTableName() {//�������ݵı���
		return "tr_bd_custclass";
	}
	@Override
	public String getPkFieldCode() {//�������ݶ�Ӧ�������
		return "pk_custty";
	}
	@Override
	public String getFatherField() {//���ṹ�ĸ������ֶ�
		return "parent";
	}
	
	@Override
	public String getChildField() {//���ṹ���������ֶ�
		return "pk_custclass";
	}
	
	@Override
	public String getRefCodeField() {//���ն�Ӧ�ı����ֶ�
		return "code";
	}
	
	@Override
	public String getRefNameField() {//���ն�Ӧ�������ֶ�
		return "name";
	}
	
	@Override
	public String getWherePart() {//�������ݵĹ�������
		String wherePart = super.getWherePart();
		if(null == wherePart || "".equals(wherePart.trim())){
			wherePart = " dr = 0 ";
		}else{
			wherePart += " and dr = 0 ";
		}
		return wherePart;
	}

}
