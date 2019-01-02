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
 
public class QuoBVO extends SuperVO {
	
/**
*����
*/
public String pk_quo_b;
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
*���ϱ���
*/
public String pk_material;
/**
*����
*/
public String nnum;
/**
*����
*/
public String nprice;
/**
*���
*/
public String nmmy;
/**
*��ע
*/
public String vmemo;
/**
*�ϲ㵥������
*/
public String pk_quo;
/**
*ʱ���
*/
public UFDateTime ts;
    
    
/**
* ���� pk_quo_b��Getter����.������������
*  ��������:2018-12-10
* @return java.lang.String
*/
public String getPk_quo_b() {
return this.pk_quo_b;
} 

/**
* ����pk_quo_b��Setter����.������������
* ��������:2018-12-10
* @param newPk_quo_b java.lang.String
*/
public void setPk_quo_b ( String pk_quo_b) {
this.pk_quo_b=pk_quo_b;
} 
 
/**
* ���� pk_group��Getter����.������������
*  ��������:2018-12-10
* @return java.lang.String
*/
public String getPk_group() {
return this.pk_group;
} 

/**
* ����pk_group��Setter����.������������
* ��������:2018-12-10
* @param newPk_group java.lang.String
*/
public void setPk_group ( String pk_group) {
this.pk_group=pk_group;
} 
 
/**
* ���� pk_org��Getter����.������������
*  ��������:2018-12-10
* @return java.lang.String
*/
public String getPk_org() {
return this.pk_org;
} 

/**
* ����pk_org��Setter����.������������
* ��������:2018-12-10
* @param newPk_org java.lang.String
*/
public void setPk_org ( String pk_org) {
this.pk_org=pk_org;
} 
 
/**
* ���� pk_org_v��Getter����.�������������汾
*  ��������:2018-12-10
* @return java.lang.String
*/
public String getPk_org_v() {
return this.pk_org_v;
} 

/**
* ����pk_org_v��Setter����.�������������汾
* ��������:2018-12-10
* @param newPk_org_v java.lang.String
*/
public void setPk_org_v ( String pk_org_v) {
this.pk_org_v=pk_org_v;
} 
 
/**
* ���� pk_material��Getter����.�����������ϱ���
*  ��������:2018-12-10
* @return java.lang.String
*/
public String getPk_material() {
return this.pk_material;
} 

/**
* ����pk_material��Setter����.�����������ϱ���
* ��������:2018-12-10
* @param newPk_material java.lang.String
*/
public void setPk_material ( String pk_material) {
this.pk_material=pk_material;
} 
 
/**
* ���� nnum��Getter����.������������
*  ��������:2018-12-10
* @return nc.vo.pub.lang.UFDouble
*/
public String getNnum() {
return this.nnum;
} 

/**
* ����nnum��Setter����.������������
* ��������:2018-12-10
* @param newNnum nc.vo.pub.lang.UFDouble
*/
public void setNnum ( String nnum) {
this.nnum=nnum;
} 
 
/**
* ���� nprice��Getter����.������������
*  ��������:2018-12-10
* @return nc.vo.pub.lang.UFDouble
*/
public String getNprice() {
return this.nprice;
} 

/**
* ����nprice��Setter����.������������
* ��������:2018-12-10
* @param newNprice nc.vo.pub.lang.UFDouble
*/
public void setNprice ( String nprice) {
this.nprice=nprice;
} 
 
/**
* ���� nmmy��Getter����.�����������
*  ��������:2018-12-10
* @return nc.vo.pub.lang.UFDouble
*/
public String getNmmy() {
return this.nmmy;
} 

/**
* ����nmmy��Setter����.�����������
* ��������:2018-12-10
* @param newNmmy nc.vo.pub.lang.UFDouble
*/
public void setNmmy ( String nmmy) {
this.nmmy=nmmy;
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
* ���� �����ϲ�������Getter����.���������ϲ�����
*  ��������:2018-12-10
* @return String
*/
public String getPk_quo(){
return this.pk_quo;
}
/**
* ���������ϲ�������Setter����.���������ϲ�����
* ��������:2018-12-10
* @param newPk_quo String
*/
public void setPk_quo(String pk_quo){
this.pk_quo=pk_quo;
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
    return VOMetaFactory.getInstance().getVOMeta("train.QuoBVO");
    }
   }
    