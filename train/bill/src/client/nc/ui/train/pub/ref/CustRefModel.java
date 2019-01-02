package nc.ui.train.pub.ref;
import nc.ui.bd.ref.AbstractRefGridTreeModel;
public class CustRefModel extends AbstractRefGridTreeModel{
	public CustRefModel() {
		super();
	}	
	@Override
	public int getClassDefaultFieldCount() {
		return super.getClassDefaultFieldCount();
	}	
	@Override
	public String[] getClassFieldCode() {//���ṹ���ֶα���
		return new String[]{
				"code",
				"name",
				"parent",
				"pk_custty"
		};
	}	
	@Override
	public String getClassTableName() {//���ṹ�ı���
		return "tr_bd_custclass";
	}	
	@Override
	public String getClassFatherField() {//���ṹ�ĸ������ֶ�
		return "parent";
	}	
	@Override
	public String getClassChildField() {//���ṹ���������ֶ�
		return "pk_custty";
	}
	@Override
	public String getClassWherePart() {//���ṹ�Ĺ�������
		String wherePart = super.getClassWherePart();
		if(null == wherePart || "".equals(wherePart.trim())){
			wherePart = " isnull(dr,0) = 0 ";
		}else{
			wherePart += " and isnull(dr,0) = 0 ";
		}
		return wherePart;
	}	
	@Override
	public String getClassJoinField() {//���ṹ�����ͱ�������ֶ�
		return "pk_custclass";
	}	
	@Override
	public String getDocJoinField() {//�����ݣ����ͱ�������ֶ�
		return "pk_supclass";
	}	
	@Override
	public String[] getFieldCode() {//�����ݵ��ֶα���
		return new String[]{
				"code",
				"name"
		};
	}	
	@Override
	public String[] getFieldName() {//�����ݵ��ֶ�����
		return new String[]{
				"�ͻ��������",
				"�ͻ���������"
		};
	}	
	@Override
	public String[] getHiddenFieldCode() {//��������Ҫ���ص��ֶα���
		return new String[]{
				"pk_cust",
				"pk_supclass"
		};
	}
	@Override
	public String getTableName() {//�����ݵı���
		return "tr_bd_cust";
	}
	@Override
	public String getPkFieldCode() {//�����ݵ������ֶ�
		return "pk_cust";
	}
	@Override
	public String getRefCodeField() {//�����ݵĲ��ձ����ֶ�
		return "code";
	}
	@Override
	public String getRefNameField() {//�����ݵĲ��������ֶ�
		return "name";
	}
	@Override
	public String getWherePart() {//�����ݵĹ�������
		String wherePart = super.getWherePart();
		if(null == wherePart || "".equals(wherePart.trim())){
			wherePart = " isnull(dr,0) = 0 ";
		}else{
			wherePart += " and isnull(dr,0) = 0 ";
		}
		return wherePart;
	}
}
