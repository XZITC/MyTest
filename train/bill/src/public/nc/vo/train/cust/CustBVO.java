package nc.vo.train.cust;

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
 *  ��������:2018-12-7
 * @author YONYOU NC
 * @version NCPrj ??
 */
 
public class CustBVO extends SuperVO {
	
/**
*����
*/
public String pk_cust_b;
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
*��ϵ��
*/
public String linkman;
/**
*�Ա�
*/
public String sex;
/**
*�绰
*/
public String phone;
/**
*�ֻ�
*/
public String mobile;
/**
*��ע
*/
public String vmemo;
/**
*�Զ�����1
*/
public String def1;
/**
*�Զ�����2
*/
public String def2;
/**
*�Զ�����3
*/
public String def3;
/**
*�Զ�����4
*/
public String def4;
/**
*�Զ�����5
*/
public String def5;
/**
*�ϲ㵥������
*/
public String pk_cust;
/**
*ʱ���
*/
public UFDateTime ts;
    
    
/**
* ���� pk_cust_b��Getter����.������������
*  ��������:2018-12-7
* @return java.lang.String
*/
public String getPk_cust_b() {
return this.pk_cust_b;
} 

/**
* ����pk_cust_b��Setter����.������������
* ��������:2018-12-7
* @param newPk_cust_b java.lang.String
*/
public void setPk_cust_b ( String pk_cust_b) {
this.pk_cust_b=pk_cust_b;
} 
 
/**
* ���� pk_group��Getter����.������������
*  ��������:2018-12-7
* @return nc.vo.org.GroupVO
*/
public String getPk_group() {
return this.pk_group;
} 

/**
* ����pk_group��Setter����.������������
* ��������:2018-12-7
* @param newPk_group nc.vo.org.GroupVO
*/
public void setPk_group ( String pk_group) {
this.pk_group=pk_group;
} 
 
/**
* ���� pk_org��Getter����.������������
*  ��������:2018-12-7
* @return nc.vo.org.OrgVO
*/
public String getPk_org() {
return this.pk_org;
} 

/**
* ����pk_org��Setter����.������������
* ��������:2018-12-7
* @param newPk_org nc.vo.org.OrgVO
*/
public void setPk_org ( String pk_org) {
this.pk_org=pk_org;
} 
 
/**
* ���� pk_org_v��Getter����.�������������汾
*  ��������:2018-12-7
* @return nc.vo.vorg.OrgVersionVO
*/
public String getPk_org_v() {
return this.pk_org_v;
} 

/**
* ����pk_org_v��Setter����.�������������汾
* ��������:2018-12-7
* @param newPk_org_v nc.vo.vorg.OrgVersionVO
*/
public void setPk_org_v ( String pk_org_v) {
this.pk_org_v=pk_org_v;
} 
 
/**
* ���� linkman��Getter����.����������ϵ��
*  ��������:2018-12-7
* @return java.lang.String
*/
public String getLinkman() {
return this.linkman;
} 

/**
* ����linkman��Setter����.����������ϵ��
* ��������:2018-12-7
* @param newLinkman java.lang.String
*/
public void setLinkman ( String linkman) {
this.linkman=linkman;
} 
 
/**
* ���� sex��Getter����.���������Ա�
*  ��������:2018-12-7
* @return nc.vo.train.cust.Enumerate0
*/
public String getSex() {
return this.sex;
} 

/**
* ����sex��Setter����.���������Ա�
* ��������:2018-12-7
* @param newSex nc.vo.train.cust.Enumerate0
*/
public void setSex ( String sex) {
this.sex=sex;
} 
 
/**
* ���� phone��Getter����.���������绰
*  ��������:2018-12-7
* @return java.lang.String
*/
public String getPhone() {
return this.phone;
} 

/**
* ����phone��Setter����.���������绰
* ��������:2018-12-7
* @param newPhone java.lang.String
*/
public void setPhone ( String phone) {
this.phone=phone;
} 
 
/**
* ���� mobile��Getter����.���������ֻ�
*  ��������:2018-12-7
* @return java.lang.String
*/
public String getMobile() {
return this.mobile;
} 

/**
* ����mobile��Setter����.���������ֻ�
* ��������:2018-12-7
* @param newMobile java.lang.String
*/
public void setMobile ( String mobile) {
this.mobile=mobile;
} 
 
/**
* ���� vmemo��Getter����.����������ע
*  ��������:2018-12-7
* @return java.lang.String
*/
public String getVmemo() {
return this.vmemo;
} 

/**
* ����vmemo��Setter����.����������ע
* ��������:2018-12-7
* @param newVmemo java.lang.String
*/
public void setVmemo ( String vmemo) {
this.vmemo=vmemo;
} 
 
/**
* ���� def1��Getter����.���������Զ�����1
*  ��������:2018-12-7
* @return java.lang.String
*/
public String getDef1() {
return this.def1;
} 

/**
* ����def1��Setter����.���������Զ�����1
* ��������:2018-12-7
* @param newDef1 java.lang.String
*/
public void setDef1 ( String def1) {
this.def1=def1;
} 
 
/**
* ���� def2��Getter����.���������Զ�����2
*  ��������:2018-12-7
* @return java.lang.String
*/
public String getDef2() {
return this.def2;
} 

/**
* ����def2��Setter����.���������Զ�����2
* ��������:2018-12-7
* @param newDef2 java.lang.String
*/
public void setDef2 ( String def2) {
this.def2=def2;
} 
 
/**
* ���� def3��Getter����.���������Զ�����3
*  ��������:2018-12-7
* @return java.lang.String
*/
public String getDef3() {
return this.def3;
} 

/**
* ����def3��Setter����.���������Զ�����3
* ��������:2018-12-7
* @param newDef3 java.lang.String
*/
public void setDef3 ( String def3) {
this.def3=def3;
} 
 
/**
* ���� def4��Getter����.���������Զ�����4
*  ��������:2018-12-7
* @return java.lang.String
*/
public String getDef4() {
return this.def4;
} 

/**
* ����def4��Setter����.���������Զ�����4
* ��������:2018-12-7
* @param newDef4 java.lang.String
*/
public void setDef4 ( String def4) {
this.def4=def4;
} 
 
/**
* ���� def5��Getter����.���������Զ�����5
*  ��������:2018-12-7
* @return java.lang.String
*/
public String getDef5() {
return this.def5;
} 

/**
* ����def5��Setter����.���������Զ�����5
* ��������:2018-12-7
* @param newDef5 java.lang.String
*/
public void setDef5 ( String def5) {
this.def5=def5;
} 
 
/**
* ���� �����ϲ�������Getter����.���������ϲ�����
*  ��������:2018-12-7
* @return String
*/
public String getPk_cust(){
return this.pk_cust;
}
/**
* ���������ϲ�������Setter����.���������ϲ�����
* ��������:2018-12-7
* @param newPk_cust String
*/
public void setPk_cust(String pk_cust){
this.pk_cust=pk_cust;
} 
/**
* ���� ����ʱ�����Getter����.��������ʱ���
*  ��������:2018-12-7
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getTs() {
return this.ts;
}
/**
* ��������ʱ�����Setter����.��������ʱ���
* ��������:2018-12-7
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
    