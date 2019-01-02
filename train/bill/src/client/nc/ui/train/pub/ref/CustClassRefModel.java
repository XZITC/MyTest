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
	public String[] getFieldCode() {//参照数据的字段编码
		return new String[]{
				"code",
				"name"
		};
	}
	@Override
	public String[] getFieldName() {//参照数据的字段名称
		return new String[]{
				"客户分类编码",
				"客户分类名称"
		};
	}
	@Override
	public String[] getHiddenFieldCode() {//需要隐藏的参照数据的字段编码
		//需要把涉及到但不用的字段放入，不仅是getFieldCode中的字段
		//本例中还应该将getFatherField方法中的字段和getChildField方法中的字段放入
		return new String[]{"pk_custty", "parent"};
	}
	@Override
	public String getTableName() {//参照数据的表名
		return "tr_bd_custclass";
	}
	@Override
	public String getPkFieldCode() {//参照数据对应表的主键
		return "pk_custty";
	}
	@Override
	public String getFatherField() {//树结构的父主键字段
		return "parent";
	}
	
	@Override
	public String getChildField() {//树结构的子主键字段
		return "pk_custclass";
	}
	
	@Override
	public String getRefCodeField() {//参照对应的编码字段
		return "code";
	}
	
	@Override
	public String getRefNameField() {//参照对应的名称字段
		return "name";
	}
	
	@Override
	public String getWherePart() {//参照数据的过滤条件
		String wherePart = super.getWherePart();
		if(null == wherePart || "".equals(wherePart.trim())){
			wherePart = " dr = 0 ";
		}else{
			wherePart += " and dr = 0 ";
		}
		return wherePart;
	}

}
