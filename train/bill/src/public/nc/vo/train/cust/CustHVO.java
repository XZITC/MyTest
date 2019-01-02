package nc.vo.train.cust;

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
 *  创建日期:2018-12-7
 * @author YONYOU NC
 * @version NCPrj ??
 */
 
public class CustHVO extends SuperVO {
	
/**
*主键
*/
public String pk_cust;
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
*客户编码
*/
public String code;
/**
*客户名称
*/
public String name;
/**
*客户分类
*/
public String pk_supclass;
/**
*经济行业
*/
public String industry;
/**
*创建人
*/
public String creator;
/**
*创建时间
*/
public UFDate creationtime;
/**
*最后修改人
*/
public String modifier;
/**
*最后修改时间
*/
public UFDate modifieditime;
/**
*备注
*/
public String vmemo;
/**
*时间戳
*/
public UFDateTime ts;
    
    
/**
* 属性 pk_cust的Getter方法.属性名：主键
*  创建日期:2018-12-7
* @return java.lang.String
*/
public String getPk_cust() {
return this.pk_cust;
} 

/**
* 属性pk_cust的Setter方法.属性名：主键
* 创建日期:2018-12-7
* @param newPk_cust java.lang.String
*/
public void setPk_cust ( String pk_cust) {
this.pk_cust=pk_cust;
} 
 
/**
* 属性 pk_group的Getter方法.属性名：集团
*  创建日期:2018-12-7
* @return nc.vo.org.GroupVO
*/
public String getPk_group() {
return this.pk_group;
} 

/**
* 属性pk_group的Setter方法.属性名：集团
* 创建日期:2018-12-7
* @param newPk_group nc.vo.org.GroupVO
*/
public void setPk_group ( String pk_group) {
this.pk_group=pk_group;
} 
 
/**
* 属性 pk_org的Getter方法.属性名：机构
*  创建日期:2018-12-7
* @return nc.vo.org.OrgVO
*/
public String getPk_org() {
return this.pk_org;
} 

/**
* 属性pk_org的Setter方法.属性名：机构
* 创建日期:2018-12-7
* @param newPk_org nc.vo.org.OrgVO
*/
public void setPk_org ( String pk_org) {
this.pk_org=pk_org;
} 
 
/**
* 属性 pk_org_v的Getter方法.属性名：机构版本
*  创建日期:2018-12-7
* @return nc.vo.vorg.OrgVersionVO
*/
public String getPk_org_v() {
return this.pk_org_v;
} 

/**
* 属性pk_org_v的Setter方法.属性名：机构版本
* 创建日期:2018-12-7
* @param newPk_org_v nc.vo.vorg.OrgVersionVO
*/
public void setPk_org_v ( String pk_org_v) {
this.pk_org_v=pk_org_v;
} 
 
/**
* 属性 code的Getter方法.属性名：客户编码
*  创建日期:2018-12-7
* @return java.lang.String
*/
public String getCode() {
return this.code;
} 

/**
* 属性code的Setter方法.属性名：客户编码
* 创建日期:2018-12-7
* @param newCode java.lang.String
*/
public void setCode ( String code) {
this.code=code;
} 
 
/**
* 属性 name的Getter方法.属性名：客户名称
*  创建日期:2018-12-7
* @return java.lang.String
*/
public String getName() {
return this.name;
} 

/**
* 属性name的Setter方法.属性名：客户名称
* 创建日期:2018-12-7
* @param newName java.lang.String
*/
public void setName ( String name) {
this.name=name;
} 
 
/**
* 属性 pk_supclass的Getter方法.属性名：客户分类
*  创建日期:2018-12-7
* @return java.lang.String
*/
public String getPk_supclass() {
return this.pk_supclass;
} 

/**
* 属性pk_supclass的Setter方法.属性名：客户分类
* 创建日期:2018-12-7
* @param newPk_supclass java.lang.String
*/
public void setPk_supclass ( String pk_supclass) {
this.pk_supclass=pk_supclass;
} 
 
/**
* 属性 industry的Getter方法.属性名：经济行业
*  创建日期:2018-12-7
* @return java.lang.String
*/
public String getIndustry() {
return this.industry;
} 

/**
* 属性industry的Setter方法.属性名：经济行业
* 创建日期:2018-12-7
* @param newIndustry java.lang.String
*/
public void setIndustry ( String industry) {
this.industry=industry;
} 
 
/**
* 属性 creator的Getter方法.属性名：创建人
*  创建日期:2018-12-7
* @return java.lang.String
*/
public String getCreator() {
return this.creator;
} 

/**
* 属性creator的Setter方法.属性名：创建人
* 创建日期:2018-12-7
* @param newCreator java.lang.String
*/
public void setCreator ( String creator) {
this.creator=creator;
} 
 
/**
* 属性 creationtime的Getter方法.属性名：创建时间
*  创建日期:2018-12-7
* @return nc.vo.pub.lang.UFDate
*/
public UFDate getCreationtime() {
return this.creationtime;
} 

/**
* 属性creationtime的Setter方法.属性名：创建时间
* 创建日期:2018-12-7
* @param newCreationtime nc.vo.pub.lang.UFDate
*/
public void setCreationtime ( UFDate creationtime) {
this.creationtime=creationtime;
} 
 
/**
* 属性 modifier的Getter方法.属性名：最后修改人
*  创建日期:2018-12-7
* @return java.lang.String
*/
public String getModifier() {
return this.modifier;
} 

/**
* 属性modifier的Setter方法.属性名：最后修改人
* 创建日期:2018-12-7
* @param newModifier java.lang.String
*/
public void setModifier ( String modifier) {
this.modifier=modifier;
} 
 
/**
* 属性 modifieditime的Getter方法.属性名：最后修改时间
*  创建日期:2018-12-7
* @return nc.vo.pub.lang.UFDate
*/
public UFDate getModifieditime() {
return this.modifieditime;
} 

/**
* 属性modifieditime的Setter方法.属性名：最后修改时间
* 创建日期:2018-12-7
* @param newModifieditime nc.vo.pub.lang.UFDate
*/
public void setModifieditime ( UFDate modifieditime) {
this.modifieditime=modifieditime;
} 
 
/**
* 属性 vmemo的Getter方法.属性名：备注
*  创建日期:2018-12-7
* @return java.lang.String
*/
public String getVmemo() {
return this.vmemo;
} 

/**
* 属性vmemo的Setter方法.属性名：备注
* 创建日期:2018-12-7
* @param newVmemo java.lang.String
*/
public void setVmemo ( String vmemo) {
this.vmemo=vmemo;
} 
 
/**
* 属性 生成时间戳的Getter方法.属性名：时间戳
*  创建日期:2018-12-7
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getTs() {
return this.ts;
}
/**
* 属性生成时间戳的Setter方法.属性名：时间戳
* 创建日期:2018-12-7
* @param newts nc.vo.pub.lang.UFDateTime
*/
public void setTs(UFDateTime ts){
this.ts=ts;
} 
     
    @Override
    public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("train.CustHVO");
    }
   }
    