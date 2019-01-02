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
 
public class CustHVO extends SuperVO {
	
/**
*����
*/
public String pk_cust;
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
*�ͻ�����
*/
public String code;
/**
*�ͻ�����
*/
public String name;
/**
*�ͻ�����
*/
public String pk_supclass;
/**
*������ҵ
*/
public String industry;
/**
*������
*/
public String creator;
/**
*����ʱ��
*/
public UFDate creationtime;
/**
*����޸���
*/
public String modifier;
/**
*����޸�ʱ��
*/
public UFDate modifieditime;
/**
*��ע
*/
public String vmemo;
/**
*ʱ���
*/
public UFDateTime ts;
    
    
/**
* ���� pk_cust��Getter����.������������
*  ��������:2018-12-7
* @return java.lang.String
*/
public String getPk_cust() {
return this.pk_cust;
} 

/**
* ����pk_cust��Setter����.������������
* ��������:2018-12-7
* @param newPk_cust java.lang.String
*/
public void setPk_cust ( String pk_cust) {
this.pk_cust=pk_cust;
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
* ���� code��Getter����.���������ͻ�����
*  ��������:2018-12-7
* @return java.lang.String
*/
public String getCode() {
return this.code;
} 

/**
* ����code��Setter����.���������ͻ�����
* ��������:2018-12-7
* @param newCode java.lang.String
*/
public void setCode ( String code) {
this.code=code;
} 
 
/**
* ���� name��Getter����.���������ͻ�����
*  ��������:2018-12-7
* @return java.lang.String
*/
public String getName() {
return this.name;
} 

/**
* ����name��Setter����.���������ͻ�����
* ��������:2018-12-7
* @param newName java.lang.String
*/
public void setName ( String name) {
this.name=name;
} 
 
/**
* ���� pk_supclass��Getter����.���������ͻ�����
*  ��������:2018-12-7
* @return java.lang.String
*/
public String getPk_supclass() {
return this.pk_supclass;
} 

/**
* ����pk_supclass��Setter����.���������ͻ�����
* ��������:2018-12-7
* @param newPk_supclass java.lang.String
*/
public void setPk_supclass ( String pk_supclass) {
this.pk_supclass=pk_supclass;
} 
 
/**
* ���� industry��Getter����.��������������ҵ
*  ��������:2018-12-7
* @return java.lang.String
*/
public String getIndustry() {
return this.industry;
} 

/**
* ����industry��Setter����.��������������ҵ
* ��������:2018-12-7
* @param newIndustry java.lang.String
*/
public void setIndustry ( String industry) {
this.industry=industry;
} 
 
/**
* ���� creator��Getter����.��������������
*  ��������:2018-12-7
* @return java.lang.String
*/
public String getCreator() {
return this.creator;
} 

/**
* ����creator��Setter����.��������������
* ��������:2018-12-7
* @param newCreator java.lang.String
*/
public void setCreator ( String creator) {
this.creator=creator;
} 
 
/**
* ���� creationtime��Getter����.������������ʱ��
*  ��������:2018-12-7
* @return nc.vo.pub.lang.UFDate
*/
public UFDate getCreationtime() {
return this.creationtime;
} 

/**
* ����creationtime��Setter����.������������ʱ��
* ��������:2018-12-7
* @param newCreationtime nc.vo.pub.lang.UFDate
*/
public void setCreationtime ( UFDate creationtime) {
this.creationtime=creationtime;
} 
 
/**
* ���� modifier��Getter����.������������޸���
*  ��������:2018-12-7
* @return java.lang.String
*/
public String getModifier() {
return this.modifier;
} 

/**
* ����modifier��Setter����.������������޸���
* ��������:2018-12-7
* @param newModifier java.lang.String
*/
public void setModifier ( String modifier) {
this.modifier=modifier;
} 
 
/**
* ���� modifieditime��Getter����.������������޸�ʱ��
*  ��������:2018-12-7
* @return nc.vo.pub.lang.UFDate
*/
public UFDate getModifieditime() {
return this.modifieditime;
} 

/**
* ����modifieditime��Setter����.������������޸�ʱ��
* ��������:2018-12-7
* @param newModifieditime nc.vo.pub.lang.UFDate
*/
public void setModifieditime ( UFDate modifieditime) {
this.modifieditime=modifieditime;
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
    return VOMetaFactory.getInstance().getVOMeta("train.CustHVO");
    }
   }
    