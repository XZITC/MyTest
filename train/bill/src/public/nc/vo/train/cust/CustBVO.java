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
 
public class CustBVO extends SuperVO {
	
/**
*主键
*/
public String pk_cust_b;
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
*联系人
*/
public String linkman;
/**
*性别
*/
public String sex;
/**
*电话
*/
public String phone;
/**
*手机
*/
public String mobile;
/**
*备注
*/
public String vmemo;
/**
*自定义项1
*/
public String def1;
/**
*自定义项2
*/
public String def2;
/**
*自定义项3
*/
public String def3;
/**
*自定义项4
*/
public String def4;
/**
*自定义项5
*/
public String def5;
/**
*上层单据主键
*/
public String pk_cust;
/**
*时间戳
*/
public UFDateTime ts;
    
    
/**
* 属性 pk_cust_b的Getter方法.属性名：主键
*  创建日期:2018-12-7
* @return java.lang.String
*/
public String getPk_cust_b() {
return this.pk_cust_b;
} 

/**
* 属性pk_cust_b的Setter方法.属性名：主键
* 创建日期:2018-12-7
* @param newPk_cust_b java.lang.String
*/
public void setPk_cust_b ( String pk_cust_b) {
this.pk_cust_b=pk_cust_b;
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
* 属性 linkman的Getter方法.属性名：联系人
*  创建日期:2018-12-7
* @return java.lang.String
*/
public String getLinkman() {
return this.linkman;
} 

/**
* 属性linkman的Setter方法.属性名：联系人
* 创建日期:2018-12-7
* @param newLinkman java.lang.String
*/
public void setLinkman ( String linkman) {
this.linkman=linkman;
} 
 
/**
* 属性 sex的Getter方法.属性名：性别
*  创建日期:2018-12-7
* @return nc.vo.train.cust.Enumerate0
*/
public String getSex() {
return this.sex;
} 

/**
* 属性sex的Setter方法.属性名：性别
* 创建日期:2018-12-7
* @param newSex nc.vo.train.cust.Enumerate0
*/
public void setSex ( String sex) {
this.sex=sex;
} 
 
/**
* 属性 phone的Getter方法.属性名：电话
*  创建日期:2018-12-7
* @return java.lang.String
*/
public String getPhone() {
return this.phone;
} 

/**
* 属性phone的Setter方法.属性名：电话
* 创建日期:2018-12-7
* @param newPhone java.lang.String
*/
public void setPhone ( String phone) {
this.phone=phone;
} 
 
/**
* 属性 mobile的Getter方法.属性名：手机
*  创建日期:2018-12-7
* @return java.lang.String
*/
public String getMobile() {
return this.mobile;
} 

/**
* 属性mobile的Setter方法.属性名：手机
* 创建日期:2018-12-7
* @param newMobile java.lang.String
*/
public void setMobile ( String mobile) {
this.mobile=mobile;
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
* 属性 def1的Getter方法.属性名：自定义项1
*  创建日期:2018-12-7
* @return java.lang.String
*/
public String getDef1() {
return this.def1;
} 

/**
* 属性def1的Setter方法.属性名：自定义项1
* 创建日期:2018-12-7
* @param newDef1 java.lang.String
*/
public void setDef1 ( String def1) {
this.def1=def1;
} 
 
/**
* 属性 def2的Getter方法.属性名：自定义项2
*  创建日期:2018-12-7
* @return java.lang.String
*/
public String getDef2() {
return this.def2;
} 

/**
* 属性def2的Setter方法.属性名：自定义项2
* 创建日期:2018-12-7
* @param newDef2 java.lang.String
*/
public void setDef2 ( String def2) {
this.def2=def2;
} 
 
/**
* 属性 def3的Getter方法.属性名：自定义项3
*  创建日期:2018-12-7
* @return java.lang.String
*/
public String getDef3() {
return this.def3;
} 

/**
* 属性def3的Setter方法.属性名：自定义项3
* 创建日期:2018-12-7
* @param newDef3 java.lang.String
*/
public void setDef3 ( String def3) {
this.def3=def3;
} 
 
/**
* 属性 def4的Getter方法.属性名：自定义项4
*  创建日期:2018-12-7
* @return java.lang.String
*/
public String getDef4() {
return this.def4;
} 

/**
* 属性def4的Setter方法.属性名：自定义项4
* 创建日期:2018-12-7
* @param newDef4 java.lang.String
*/
public void setDef4 ( String def4) {
this.def4=def4;
} 
 
/**
* 属性 def5的Getter方法.属性名：自定义项5
*  创建日期:2018-12-7
* @return java.lang.String
*/
public String getDef5() {
return this.def5;
} 

/**
* 属性def5的Setter方法.属性名：自定义项5
* 创建日期:2018-12-7
* @param newDef5 java.lang.String
*/
public void setDef5 ( String def5) {
this.def5=def5;
} 
 
/**
* 属性 生成上层主键的Getter方法.属性名：上层主键
*  创建日期:2018-12-7
* @return String
*/
public String getPk_cust(){
return this.pk_cust;
}
/**
* 属性生成上层主键的Setter方法.属性名：上层主键
* 创建日期:2018-12-7
* @param newPk_cust String
*/
public void setPk_cust(String pk_cust){
this.pk_cust=pk_cust;
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
    return VOMetaFactory.getInstance().getVOMeta("train.CustBVO");
    }
   }
    