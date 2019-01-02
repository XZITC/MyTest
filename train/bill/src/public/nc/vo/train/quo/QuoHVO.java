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
 
public class QuoHVO extends SuperVO {
	
/**
*主键
*/
public String pk_quo;
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
*报价单编号
*/
public String vbillno;
/**
*报价日期
*/
public UFDate dbilldate;
/**
*单据状态
*/
public String vbillstatus;
/**
*单据类型编码
*/
public String pk_billtypecode;
/**
*单据类型
*/
public String pk_billtype;
/**
*业务类型
*/
public String pk_busitype;
/**
*交易类型编码
*/
public String vtrantypecode;
/**
*交易类型
*/
public String ctrantypeid;
/**
*客户分类
*/
public String pk_custclass;
/**
*客户
*/
public String pk_cust;
/**
*销售部门
*/
public String pk_dept;
/**
*销售部门版本
*/
public String pk_dept_v;
/**
*总数量
*/
public String ntotalnum;
/**
*总金额
*/
public String ntoalmny;
/**
*创建人
*/
public String creator;
/**
*创建时间
*/
public UFDateTime creationtime;
/**
*最后修改人
*/
public String modifier;
/**
*最后修改时间
*/
public UFDate modifieditime;
/**
*审核人
*/
public String vapproveid;
/**
*审核时间
*/
public UFDateTime tapprovietime;
/**
*审核批语
*/
public String vapprovename;
/**
*备注
*/
public String vmemo;
/**
*时间戳
*/
public UFDateTime ts;
    
    
/**
* 属性 pk_quo的Getter方法.属性名：主键
*  创建日期:2018-12-10
* @return java.lang.String
*/
public String getPk_quo() {
return this.pk_quo;
} 

/**
* 属性pk_quo的Setter方法.属性名：主键
* 创建日期:2018-12-10
* @param newPk_quo java.lang.String
*/
public void setPk_quo ( String pk_quo) {
this.pk_quo=pk_quo;
} 
 
/**
* 属性 pk_group的Getter方法.属性名：集团
*  创建日期:2018-12-10
* @return nc.vo.org.GroupVO
*/
public String getPk_group() {
return this.pk_group;
} 

/**
* 属性pk_group的Setter方法.属性名：集团
* 创建日期:2018-12-10
* @param newPk_group nc.vo.org.GroupVO
*/
public void setPk_group ( String pk_group) {
this.pk_group=pk_group;
} 
 
/**
* 属性 pk_org的Getter方法.属性名：机构
*  创建日期:2018-12-10
* @return nc.vo.org.OrgVO
*/
public String getPk_org() {
return this.pk_org;
} 

/**
* 属性pk_org的Setter方法.属性名：机构
* 创建日期:2018-12-10
* @param newPk_org nc.vo.org.OrgVO
*/
public void setPk_org ( String pk_org) {
this.pk_org=pk_org;
} 
 
/**
* 属性 pk_org_v的Getter方法.属性名：机构版本
*  创建日期:2018-12-10
* @return nc.vo.vorg.OrgVersionVO
*/
public String getPk_org_v() {
return this.pk_org_v;
} 

/**
* 属性pk_org_v的Setter方法.属性名：机构版本
* 创建日期:2018-12-10
* @param newPk_org_v nc.vo.vorg.OrgVersionVO
*/
public void setPk_org_v ( String pk_org_v) {
this.pk_org_v=pk_org_v;
} 
 
/**
* 属性 vbillno的Getter方法.属性名：报价单编号
*  创建日期:2018-12-10
* @return java.lang.String
*/
public String getVbillno() {
return this.vbillno;
} 

/**
* 属性vbillno的Setter方法.属性名：报价单编号
* 创建日期:2018-12-10
* @param newVbillno java.lang.String
*/
public void setVbillno ( String vbillno) {
this.vbillno=vbillno;
} 
 
/**
* 属性 dbilldate的Getter方法.属性名：报价日期
*  创建日期:2018-12-10
* @return nc.vo.pub.lang.UFDate
*/
public UFDate getDbilldate() {
return this.dbilldate;
} 

/**
* 属性dbilldate的Setter方法.属性名：报价日期
* 创建日期:2018-12-10
* @param newDbilldate nc.vo.pub.lang.UFDate
*/
public void setDbilldate ( UFDate dbilldate) {
this.dbilldate=dbilldate;
} 
 
/**
* 属性 vbillstatus的Getter方法.属性名：单据状态
*  创建日期:2018-12-10
* @return java.lang.String
*/
public String getVbillstatus() {
return this.vbillstatus;
} 

/**
* 属性vbillstatus的Setter方法.属性名：单据状态
* 创建日期:2018-12-10
* @param newVbillstatus java.lang.String
*/
public void setVbillstatus ( String vbillstatus) {
this.vbillstatus=vbillstatus;
} 
 
/**
* 属性 pk_billtypecode的Getter方法.属性名：单据类型编码
*  创建日期:2018-12-10
* @return java.lang.String
*/
public String getPk_billtypecode() {
return this.pk_billtypecode;
} 

/**
* 属性pk_billtypecode的Setter方法.属性名：单据类型编码
* 创建日期:2018-12-10
* @param newPk_billtypecode java.lang.String
*/
public void setPk_billtypecode ( String pk_billtypecode) {
this.pk_billtypecode=pk_billtypecode;
} 
 
/**
* 属性 pk_billtype的Getter方法.属性名：单据类型
*  创建日期:2018-12-10
* @return nc.vo.pub.billtype.BilltypeVO
*/
public String getPk_billtype() {
return this.pk_billtype;
} 

/**
* 属性pk_billtype的Setter方法.属性名：单据类型
* 创建日期:2018-12-10
* @param newPk_billtype nc.vo.pub.billtype.BilltypeVO
*/
public void setPk_billtype ( String pk_billtype) {
this.pk_billtype=pk_billtype;
} 
 
/**
* 属性 pk_busitype的Getter方法.属性名：业务类型
*  创建日期:2018-12-10
* @return nc.vo.pf.pub.BusitypeVO
*/
public String getPk_busitype() {
return this.pk_busitype;
} 

/**
* 属性pk_busitype的Setter方法.属性名：业务类型
* 创建日期:2018-12-10
* @param newPk_busitype nc.vo.pf.pub.BusitypeVO
*/
public void setPk_busitype ( String pk_busitype) {
this.pk_busitype=pk_busitype;
} 
 
/**
* 属性 vtrantypecode的Getter方法.属性名：交易类型编码
*  创建日期:2018-12-10
* @return java.lang.String
*/
public String getVtrantypecode() {
return this.vtrantypecode;
} 

/**
* 属性vtrantypecode的Setter方法.属性名：交易类型编码
* 创建日期:2018-12-10
* @param newVtrantypecode java.lang.String
*/
public void setVtrantypecode ( String vtrantypecode) {
this.vtrantypecode=vtrantypecode;
} 
 
/**
* 属性 ctrantypeid的Getter方法.属性名：交易类型
*  创建日期:2018-12-10
* @return java.lang.String
*/
public String getCtrantypeid() {
return this.ctrantypeid;
} 

/**
* 属性ctrantypeid的Setter方法.属性名：交易类型
* 创建日期:2018-12-10
* @param newCtrantypeid java.lang.String
*/
public void setCtrantypeid ( String ctrantypeid) {
this.ctrantypeid=ctrantypeid;
} 
 
/**
* 属性 pk_custclass的Getter方法.属性名：客户分类
*  创建日期:2018-12-10
* @return nc.vo.train.custclass.CustClassVO
*/
public String getPk_custclass() {
return this.pk_custclass;
} 

/**
* 属性pk_custclass的Setter方法.属性名：客户分类
* 创建日期:2018-12-10
* @param newPk_custclass nc.vo.train.custclass.CustClassVO
*/
public void setPk_custclass ( String pk_custclass) {
this.pk_custclass=pk_custclass;
} 
 
/**
* 属性 pk_cust的Getter方法.属性名：客户
*  创建日期:2018-12-10
* @return nc.vo.train.cust.CustHVO
*/
public String getPk_cust() {
return this.pk_cust;
} 

/**
* 属性pk_cust的Setter方法.属性名：客户
* 创建日期:2018-12-10
* @param newPk_cust nc.vo.train.cust.CustHVO
*/
public void setPk_cust ( String pk_cust) {
this.pk_cust=pk_cust;
} 
 
/**
* 属性 pk_dept的Getter方法.属性名：销售部门
*  创建日期:2018-12-10
* @return java.lang.String
*/
public String getPk_dept() {
return this.pk_dept;
} 

/**
* 属性pk_dept的Setter方法.属性名：销售部门
* 创建日期:2018-12-10
* @param newPk_dept java.lang.String
*/
public void setPk_dept ( String pk_dept) {
this.pk_dept=pk_dept;
} 
 
/**
* 属性 pk_dept_v的Getter方法.属性名：销售部门版本
*  创建日期:2018-12-10
* @return java.lang.String
*/
public String getPk_dept_v() {
return this.pk_dept_v;
} 

/**
* 属性pk_dept_v的Setter方法.属性名：销售部门版本
* 创建日期:2018-12-10
* @param newPk_dept_v java.lang.String
*/
public void setPk_dept_v ( String pk_dept_v) {
this.pk_dept_v=pk_dept_v;
} 
 
/**
* 属性 ntotalnum的Getter方法.属性名：总数量
*  创建日期:2018-12-10
* @return nc.vo.pub.lang.UFDouble
*/
public String getNtotalnum() {
return this.ntotalnum;
} 

/**
* 属性ntotalnum的Setter方法.属性名：总数量
* 创建日期:2018-12-10
* @param newNtotalnum nc.vo.pub.lang.UFDouble
*/
public void setNtotalnum ( String ntotalnum) {
this.ntotalnum=ntotalnum;
} 
 
/**
* 属性 ntoalmny的Getter方法.属性名：总金额
*  创建日期:2018-12-10
* @return nc.vo.pub.lang.UFDouble
*/
public String getNtoalmny() {
return this.ntoalmny;
} 

/**
* 属性ntoalmny的Setter方法.属性名：总金额
* 创建日期:2018-12-10
* @param newNtoalmny nc.vo.pub.lang.UFDouble
*/
public void setNtoalmny ( String ntoalmny) {
this.ntoalmny=ntoalmny;
} 
 
/**
* 属性 creator的Getter方法.属性名：创建人
*  创建日期:2018-12-10
* @return java.lang.String
*/
public String getCreator() {
return this.creator;
} 

/**
* 属性creator的Setter方法.属性名：创建人
* 创建日期:2018-12-10
* @param newCreator java.lang.String
*/
public void setCreator ( String creator) {
this.creator=creator;
} 
 
/**
* 属性 creationtime的Getter方法.属性名：创建时间
*  创建日期:2018-12-10
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getCreationtime() {
return this.creationtime;
} 

/**
* 属性creationtime的Setter方法.属性名：创建时间
* 创建日期:2018-12-10
* @param newCreationtime nc.vo.pub.lang.UFDateTime
*/
public void setCreationtime ( UFDateTime creationtime) {
this.creationtime=creationtime;
} 
 
/**
* 属性 modifier的Getter方法.属性名：最后修改人
*  创建日期:2018-12-10
* @return java.lang.String
*/
public String getModifier() {
return this.modifier;
} 

/**
* 属性modifier的Setter方法.属性名：最后修改人
* 创建日期:2018-12-10
* @param newModifier java.lang.String
*/
public void setModifier ( String modifier) {
this.modifier=modifier;
} 
 
/**
* 属性 modifieditime的Getter方法.属性名：最后修改时间
*  创建日期:2018-12-10
* @return nc.vo.pub.lang.UFDate
*/
public UFDate getModifieditime() {
return this.modifieditime;
} 

/**
* 属性modifieditime的Setter方法.属性名：最后修改时间
* 创建日期:2018-12-10
* @param newModifieditime nc.vo.pub.lang.UFDate
*/
public void setModifieditime ( UFDate modifieditime) {
this.modifieditime=modifieditime;
} 
 
/**
* 属性 vapproveid的Getter方法.属性名：审核人
*  创建日期:2018-12-10
* @return java.lang.String
*/
public String getVapproveid() {
return this.vapproveid;
} 

/**
* 属性vapproveid的Setter方法.属性名：审核人
* 创建日期:2018-12-10
* @param newVapproveid java.lang.String
*/
public void setVapproveid ( String vapproveid) {
this.vapproveid=vapproveid;
} 
 
/**
* 属性 tapprovietime的Getter方法.属性名：审核时间
*  创建日期:2018-12-10
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getTapprovietime() {
return this.tapprovietime;
} 

/**
* 属性tapprovietime的Setter方法.属性名：审核时间
* 创建日期:2018-12-10
* @param newTapprovietime nc.vo.pub.lang.UFDateTime
*/
public void setTapprovietime ( UFDateTime tapprovietime) {
this.tapprovietime=tapprovietime;
} 
 
/**
* 属性 vapprovename的Getter方法.属性名：审核批语
*  创建日期:2018-12-10
* @return java.lang.String
*/
public String getVapprovename() {
return this.vapprovename;
} 

/**
* 属性vapprovename的Setter方法.属性名：审核批语
* 创建日期:2018-12-10
* @param newVapprovename java.lang.String
*/
public void setVapprovename ( String vapprovename) {
this.vapprovename=vapprovename;
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
    return VOMetaFactory.getInstance().getVOMeta("train.QuoHVO");
    }
   }
    