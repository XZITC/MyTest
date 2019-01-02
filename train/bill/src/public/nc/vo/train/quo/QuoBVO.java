package nc.vo.train.quo;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

/**
 * <b> 此处简要描述此类功能 </b>
 * <p>
 *   此处添加累的描述信息
 * </p>
 *  创建日期:2018-12-10
 * @author YONYOU NC
 * @version NCPrj ??
 */
 
public class QuoBVO extends SuperVO {
	
/**
*主键
*/
public String pk_quo_b;
/**
*集团
*/
public String pk_group;
/**
*机构
*/
public String pk_org;
/**
*机构版本
*/
public String pk_org_v;
/**
*物料编码
*/
public String pk_material;
/**
*数量
*/
public String nnum;
/**
*单价
*/
public String nprice;
/**
*金额
*/
public String nmmy;
/**
*备注
*/
public String vmemo;
/**
*上层单据主键
*/
public String pk_quo;
/**
*时间戳
*/
public UFDateTime ts;
    
    
/**
* 属性 pk_quo_b的Getter方法.属性名：主键
*  创建日期:2018-12-10
* @return java.lang.String
*/
public String getPk_quo_b() {
return this.pk_quo_b;
} 

/**
* 属性pk_quo_b的Setter方法.属性名：主键
* 创建日期:2018-12-10
* @param newPk_quo_b java.lang.String
*/
public void setPk_quo_b ( String pk_quo_b) {
this.pk_quo_b=pk_quo_b;
} 
 
/**
* 属性 pk_group的Getter方法.属性名：集团
*  创建日期:2018-12-10
* @return java.lang.String
*/
public String getPk_group() {
return this.pk_group;
} 

/**
* 属性pk_group的Setter方法.属性名：集团
* 创建日期:2018-12-10
* @param newPk_group java.lang.String
*/
public void setPk_group ( String pk_group) {
this.pk_group=pk_group;
} 
 
/**
* 属性 pk_org的Getter方法.属性名：机构
*  创建日期:2018-12-10
* @return java.lang.String
*/
public String getPk_org() {
return this.pk_org;
} 

/**
* 属性pk_org的Setter方法.属性名：机构
* 创建日期:2018-12-10
* @param newPk_org java.lang.String
*/
public void setPk_org ( String pk_org) {
this.pk_org=pk_org;
} 
 
/**
* 属性 pk_org_v的Getter方法.属性名：机构版本
*  创建日期:2018-12-10
* @return java.lang.String
*/
public String getPk_org_v() {
return this.pk_org_v;
} 

/**
* 属性pk_org_v的Setter方法.属性名：机构版本
* 创建日期:2018-12-10
* @param newPk_org_v java.lang.String
*/
public void setPk_org_v ( String pk_org_v) {
this.pk_org_v=pk_org_v;
} 
 
/**
* 属性 pk_material的Getter方法.属性名：物料编码
*  创建日期:2018-12-10
* @return java.lang.String
*/
public String getPk_material() {
return this.pk_material;
} 

/**
* 属性pk_material的Setter方法.属性名：物料编码
* 创建日期:2018-12-10
* @param newPk_material java.lang.String
*/
public void setPk_material ( String pk_material) {
this.pk_material=pk_material;
} 
 
/**
* 属性 nnum的Getter方法.属性名：数量
*  创建日期:2018-12-10
* @return nc.vo.pub.lang.UFDouble
*/
public String getNnum() {
return this.nnum;
} 

/**
* 属性nnum的Setter方法.属性名：数量
* 创建日期:2018-12-10
* @param newNnum nc.vo.pub.lang.UFDouble
*/
public void setNnum ( String nnum) {
this.nnum=nnum;
} 
 
/**
* 属性 nprice的Getter方法.属性名：单价
*  创建日期:2018-12-10
* @return nc.vo.pub.lang.UFDouble
*/
public String getNprice() {
return this.nprice;
} 

/**
* 属性nprice的Setter方法.属性名：单价
* 创建日期:2018-12-10
* @param newNprice nc.vo.pub.lang.UFDouble
*/
public void setNprice ( String nprice) {
this.nprice=nprice;
} 
 
/**
* 属性 nmmy的Getter方法.属性名：金额
*  创建日期:2018-12-10
* @return nc.vo.pub.lang.UFDouble
*/
public String getNmmy() {
return this.nmmy;
} 

/**
* 属性nmmy的Setter方法.属性名：金额
* 创建日期:2018-12-10
* @param newNmmy nc.vo.pub.lang.UFDouble
*/
public void setNmmy ( String nmmy) {
this.nmmy=nmmy;
} 
 
/**
* 属性 vmemo的Getter方法.属性名：备注
*  创建日期:2018-12-10
* @return java.lang.String
*/
public String getVmemo() {
return this.vmemo;
} 

/**
* 属性vmemo的Setter方法.属性名：备注
* 创建日期:2018-12-10
* @param newVmemo java.lang.String
*/
public void setVmemo ( String vmemo) {
this.vmemo=vmemo;
} 
 
/**
* 属性 生成上层主键的Getter方法.属性名：上层主键
*  创建日期:2018-12-10
* @return String
*/
public String getPk_quo(){
return this.pk_quo;
}
/**
* 属性生成上层主键的Setter方法.属性名：上层主键
* 创建日期:2018-12-10
* @param newPk_quo String
*/
public void setPk_quo(String pk_quo){
this.pk_quo=pk_quo;
} 
/**
* 属性 生成时间戳的Getter方法.属性名：时间戳
*  创建日期:2018-12-10
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getTs() {
return this.ts;
}
/**
* 属性生成时间戳的Setter方法.属性名：时间戳
* 创建日期:2018-12-10
* @param newts nc.vo.pub.lang.UFDateTime
*/
public void setTs(UFDateTime ts){
this.ts=ts;
} 
     
    @Override
    public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("train.QuoBVO");
    }
   }
    