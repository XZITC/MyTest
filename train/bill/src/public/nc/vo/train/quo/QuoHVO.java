package nc.vo.train.quo;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

/**
 * <b> �˴���Ҫ�������๦�� </b>
 * <p>
 *   �˴�����۵�������Ϣ
 * </p>
 *  ��������:2018-12-10
 * @author YONYOU NC
 * @version NCPrj ??
 */
 
public class QuoHVO extends SuperVO {
	
/**
*����
*/
public String pk_quo;
/**
*����
*/
public String pk_group;
/**
*����
*/
public String pk_org;
/**
*�����汾
*/
public String pk_org_v;
/**
*���۵����
*/
public String vbillno;
/**
*��������
*/
public UFDate dbilldate;
/**
*����״̬
*/
public String vbillstatus;
/**
*�������ͱ���
*/
public String pk_billtypecode;
/**
*��������
*/
public String pk_billtype;
/**
*ҵ������
*/
public String pk_busitype;
/**
*�������ͱ���
*/
public String vtrantypecode;
/**
*��������
*/
public String ctrantypeid;
/**
*�ͻ�����
*/
public String pk_custclass;
/**
*�ͻ�
*/
public String pk_cust;
/**
*���۲���
*/
public String pk_dept;
/**
*���۲��Ű汾
*/
public String pk_dept_v;
/**
*������
*/
public String ntotalnum;
/**
*�ܽ��
*/
public String ntoalmny;
/**
*������
*/
public String creator;
/**
*����ʱ��
*/
public UFDateTime creationtime;
/**
*����޸���
*/
public String modifier;
/**
*����޸�ʱ��
*/
public UFDate modifieditime;
/**
*�����
*/
public String vapproveid;
/**
*���ʱ��
*/
public UFDateTime tapprovietime;
/**
*�������
*/
public String vapprovename;
/**
*��ע
*/
public String vmemo;
/**
*ʱ���
*/
public UFDateTime ts;
    
    
/**
* ���� pk_quo��Getter����.������������
*  ��������:2018-12-10
* @return java.lang.String
*/
public String getPk_quo() {
return this.pk_quo;
} 

/**
* ����pk_quo��Setter����.������������
* ��������:2018-12-10
* @param newPk_quo java.lang.String
*/
public void setPk_quo ( String pk_quo) {
this.pk_quo=pk_quo;
} 
 
/**
* ���� pk_group��Getter����.������������
*  ��������:2018-12-10
* @return nc.vo.org.GroupVO
*/
public String getPk_group() {
return this.pk_group;
} 

/**
* ����pk_group��Setter����.������������
* ��������:2018-12-10
* @param newPk_group nc.vo.org.GroupVO
*/
public void setPk_group ( String pk_group) {
this.pk_group=pk_group;
} 
 
/**
* ���� pk_org��Getter����.������������
*  ��������:2018-12-10
* @return nc.vo.org.OrgVO
*/
public String getPk_org() {
return this.pk_org;
} 

/**
* ����pk_org��Setter����.������������
* ��������:2018-12-10
* @param newPk_org nc.vo.org.OrgVO
*/
public void setPk_org ( String pk_org) {
this.pk_org=pk_org;
} 
 
/**
* ���� pk_org_v��Getter����.�������������汾
*  ��������:2018-12-10
* @return nc.vo.vorg.OrgVersionVO
*/
public String getPk_org_v() {
return this.pk_org_v;
} 

/**
* ����pk_org_v��Setter����.�������������汾
* ��������:2018-12-10
* @param newPk_org_v nc.vo.vorg.OrgVersionVO
*/
public void setPk_org_v ( String pk_org_v) {
this.pk_org_v=pk_org_v;
} 
 
/**
* ���� vbillno��Getter����.�����������۵����
*  ��������:2018-12-10
* @return java.lang.String
*/
public String getVbillno() {
return this.vbillno;
} 

/**
* ����vbillno��Setter����.�����������۵����
* ��������:2018-12-10
* @param newVbillno java.lang.String
*/
public void setVbillno ( String vbillno) {
this.vbillno=vbillno;
} 
 
/**
* ���� dbilldate��Getter����.����������������
*  ��������:2018-12-10
* @return nc.vo.pub.lang.UFDate
*/
public UFDate getDbilldate() {
return this.dbilldate;
} 

/**
* ����dbilldate��Setter����.����������������
* ��������:2018-12-10
* @param newDbilldate nc.vo.pub.lang.UFDate
*/
public void setDbilldate ( UFDate dbilldate) {
this.dbilldate=dbilldate;
} 
 
/**
* ���� vbillstatus��Getter����.������������״̬
*  ��������:2018-12-10
* @return java.lang.String
*/
public String getVbillstatus() {
return this.vbillstatus;
} 

/**
* ����vbillstatus��Setter����.������������״̬
* ��������:2018-12-10
* @param newVbillstatus java.lang.String
*/
public void setVbillstatus ( String vbillstatus) {
this.vbillstatus=vbillstatus;
} 
 
/**
* ���� pk_billtypecode��Getter����.���������������ͱ���
*  ��������:2018-12-10
* @return java.lang.String
*/
public String getPk_billtypecode() {
return this.pk_billtypecode;
} 

/**
* ����pk_billtypecode��Setter����.���������������ͱ���
* ��������:2018-12-10
* @param newPk_billtypecode java.lang.String
*/
public void setPk_billtypecode ( String pk_billtypecode) {
this.pk_billtypecode=pk_billtypecode;
} 
 
/**
* ���� pk_billtype��Getter����.����������������
*  ��������:2018-12-10
* @return nc.vo.pub.billtype.BilltypeVO
*/
public String getPk_billtype() {
return this.pk_billtype;
} 

/**
* ����pk_billtype��Setter����.����������������
* ��������:2018-12-10
* @param newPk_billtype nc.vo.pub.billtype.BilltypeVO
*/
public void setPk_billtype ( String pk_billtype) {
this.pk_billtype=pk_billtype;
} 
 
/**
* ���� pk_busitype��Getter����.��������ҵ������
*  ��������:2018-12-10
* @return nc.vo.pf.pub.BusitypeVO
*/
public String getPk_busitype() {
return this.pk_busitype;
} 

/**
* ����pk_busitype��Setter����.��������ҵ������
* ��������:2018-12-10
* @param newPk_busitype nc.vo.pf.pub.BusitypeVO
*/
public void setPk_busitype ( String pk_busitype) {
this.pk_busitype=pk_busitype;
} 
 
/**
* ���� vtrantypecode��Getter����.���������������ͱ���
*  ��������:2018-12-10
* @return java.lang.String
*/
public String getVtrantypecode() {
return this.vtrantypecode;
} 

/**
* ����vtrantypecode��Setter����.���������������ͱ���
* ��������:2018-12-10
* @param newVtrantypecode java.lang.String
*/
public void setVtrantypecode ( String vtrantypecode) {
this.vtrantypecode=vtrantypecode;
} 
 
/**
* ���� ctrantypeid��Getter����.����������������
*  ��������:2018-12-10
* @return java.lang.String
*/
public String getCtrantypeid() {
return this.ctrantypeid;
} 

/**
* ����ctrantypeid��Setter����.����������������
* ��������:2018-12-10
* @param newCtrantypeid java.lang.String
*/
public void setCtrantypeid ( String ctrantypeid) {
this.ctrantypeid=ctrantypeid;
} 
 
/**
* ���� pk_custclass��Getter����.���������ͻ�����
*  ��������:2018-12-10
* @return nc.vo.train.custclass.CustClassVO
*/
public String getPk_custclass() {
return this.pk_custclass;
} 

/**
* ����pk_custclass��Setter����.���������ͻ�����
* ��������:2018-12-10
* @param newPk_custclass nc.vo.train.custclass.CustClassVO
*/
public void setPk_custclass ( String pk_custclass) {
this.pk_custclass=pk_custclass;
} 
 
/**
* ���� pk_cust��Getter����.���������ͻ�
*  ��������:2018-12-10
* @return nc.vo.train.cust.CustHVO
*/
public String getPk_cust() {
return this.pk_cust;
} 

/**
* ����pk_cust��Setter����.���������ͻ�
* ��������:2018-12-10
* @param newPk_cust nc.vo.train.cust.CustHVO
*/
public void setPk_cust ( String pk_cust) {
this.pk_cust=pk_cust;
} 
 
/**
* ���� pk_dept��Getter����.�����������۲���
*  ��������:2018-12-10
* @return java.lang.String
*/
public String getPk_dept() {
return this.pk_dept;
} 

/**
* ����pk_dept��Setter����.�����������۲���
* ��������:2018-12-10
* @param newPk_dept java.lang.String
*/
public void setPk_dept ( String pk_dept) {
this.pk_dept=pk_dept;
} 
 
/**
* ���� pk_dept_v��Getter����.�����������۲��Ű汾
*  ��������:2018-12-10
* @return java.lang.String
*/
public String getPk_dept_v() {
return this.pk_dept_v;
} 

/**
* ����pk_dept_v��Setter����.�����������۲��Ű汾
* ��������:2018-12-10
* @param newPk_dept_v java.lang.String
*/
public void setPk_dept_v ( String pk_dept_v) {
this.pk_dept_v=pk_dept_v;
} 
 
/**
* ���� ntotalnum��Getter����.��������������
*  ��������:2018-12-10
* @return nc.vo.pub.lang.UFDouble
*/
public String getNtotalnum() {
return this.ntotalnum;
} 

/**
* ����ntotalnum��Setter����.��������������
* ��������:2018-12-10
* @param newNtotalnum nc.vo.pub.lang.UFDouble
*/
public void setNtotalnum ( String ntotalnum) {
this.ntotalnum=ntotalnum;
} 
 
/**
* ���� ntoalmny��Getter����.���������ܽ��
*  ��������:2018-12-10
* @return nc.vo.pub.lang.UFDouble
*/
public String getNtoalmny() {
return this.ntoalmny;
} 

/**
* ����ntoalmny��Setter����.���������ܽ��
* ��������:2018-12-10
* @param newNtoalmny nc.vo.pub.lang.UFDouble
*/
public void setNtoalmny ( String ntoalmny) {
this.ntoalmny=ntoalmny;
} 
 
/**
* ���� creator��Getter����.��������������
*  ��������:2018-12-10
* @return java.lang.String
*/
public String getCreator() {
return this.creator;
} 

/**
* ����creator��Setter����.��������������
* ��������:2018-12-10
* @param newCreator java.lang.String
*/
public void setCreator ( String creator) {
this.creator=creator;
} 
 
/**
* ���� creationtime��Getter����.������������ʱ��
*  ��������:2018-12-10
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getCreationtime() {
return this.creationtime;
} 

/**
* ����creationtime��Setter����.������������ʱ��
* ��������:2018-12-10
* @param newCreationtime nc.vo.pub.lang.UFDateTime
*/
public void setCreationtime ( UFDateTime creationtime) {
this.creationtime=creationtime;
} 
 
/**
* ���� modifier��Getter����.������������޸���
*  ��������:2018-12-10
* @return java.lang.String
*/
public String getModifier() {
return this.modifier;
} 

/**
* ����modifier��Setter����.������������޸���
* ��������:2018-12-10
* @param newModifier java.lang.String
*/
public void setModifier ( String modifier) {
this.modifier=modifier;
} 
 
/**
* ���� modifieditime��Getter����.������������޸�ʱ��
*  ��������:2018-12-10
* @return nc.vo.pub.lang.UFDate
*/
public UFDate getModifieditime() {
return this.modifieditime;
} 

/**
* ����modifieditime��Setter����.������������޸�ʱ��
* ��������:2018-12-10
* @param newModifieditime nc.vo.pub.lang.UFDate
*/
public void setModifieditime ( UFDate modifieditime) {
this.modifieditime=modifieditime;
} 
 
/**
* ���� vapproveid��Getter����.�������������
*  ��������:2018-12-10
* @return java.lang.String
*/
public String getVapproveid() {
return this.vapproveid;
} 

/**
* ����vapproveid��Setter����.�������������
* ��������:2018-12-10
* @param newVapproveid java.lang.String
*/
public void setVapproveid ( String vapproveid) {
this.vapproveid=vapproveid;
} 
 
/**
* ���� tapprovietime��Getter����.�����������ʱ��
*  ��������:2018-12-10
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getTapprovietime() {
return this.tapprovietime;
} 

/**
* ����tapprovietime��Setter����.�����������ʱ��
* ��������:2018-12-10
* @param newTapprovietime nc.vo.pub.lang.UFDateTime
*/
public void setTapprovietime ( UFDateTime tapprovietime) {
this.tapprovietime=tapprovietime;
} 
 
/**
* ���� vapprovename��Getter����.���������������
*  ��������:2018-12-10
* @return java.lang.String
*/
public String getVapprovename() {
return this.vapprovename;
} 

/**
* ����vapprovename��Setter����.���������������
* ��������:2018-12-10
* @param newVapprovename java.lang.String
*/
public void setVapprovename ( String vapprovename) {
this.vapprovename=vapprovename;
} 
 
/**
* ���� vmemo��Getter����.����������ע
*  ��������:2018-12-10
* @return java.lang.String
*/
public String getVmemo() {
return this.vmemo;
} 

/**
* ����vmemo��Setter����.����������ע
* ��������:2018-12-10
* @param newVmemo java.lang.String
*/
public void setVmemo ( String vmemo) {
this.vmemo=vmemo;
} 
 
/**
* ���� ����ʱ�����Getter����.��������ʱ���
*  ��������:2018-12-10
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getTs() {
return this.ts;
}
/**
* ��������ʱ�����Setter����.��������ʱ���
* ��������:2018-12-10
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
    