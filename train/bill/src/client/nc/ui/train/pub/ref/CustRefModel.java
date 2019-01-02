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
	public String[] getClassFieldCode() {//树结构的字段编码
		return new String[]{
				"code",
				"name",
				"parent",
				"pk_custty"
		};
	}	
	@Override
	public String getClassTableName() {//树结构的表名
		return "tr_bd_custclass";
	}	
	@Override
	public String getClassFatherField() {//树结构的父主键字段
		return "parent";
	}	
	@Override
	public String getClassChildField() {//树结构的子主键字段
		return "pk_custty";
	}
	@Override
	public String getClassWherePart() {//树结构的过滤条件
		String wherePart = super.getClassWherePart();
		if(null == wherePart || "".equals(wherePart.trim())){
			wherePart = " isnull(dr,0) = 0 ";
		}else{
			wherePart += " and isnull(dr,0) = 0 ";
		}
		return wherePart;
	}	
	@Override
	public String getClassJoinField() {//树结构：树和表关联的字段
		return "pk_custclass";
	}	
	@Override
	public String getDocJoinField() {//表数据：树和表关联的字段
		return "pk_supclass";
	}	
	@Override
	public String[] getFieldCode() {//表数据的字段编码
		return new String[]{
				"code",
				"name"
		};
	}	
	@Override
	public String[] getFieldName() {//表数据的字段名称
		return new String[]{
				"客户分类编码",
				"客户分类名称"
		};
	}	
	@Override
	public String[] getHiddenFieldCode() {//表数据需要隐藏的字段编码
		return new String[]{
				"pk_cust",
				"pk_supclass"
		};
	}
	@Override
	public String getTableName() {//表数据的表名
		return "tr_bd_cust";
	}
	@Override
	public String getPkFieldCode() {//表数据的主键字段
		return "pk_cust";
	}
	@Override
	public String getRefCodeField() {//表数据的参照编码字段
		return "code";
	}
	@Override
	public String getRefNameField() {//表数据的参照名称字段
		return "name";
	}
	@Override
	public String getWherePart() {//表数据的过滤条件
		String wherePart = super.getWherePart();
		if(null == wherePart || "".equals(wherePart.trim())){
			wherePart = " isnull(dr,0) = 0 ";
		}else{
			wherePart += " and isnull(dr,0) = 0 ";
		}
		return wherePart;
	}
}
