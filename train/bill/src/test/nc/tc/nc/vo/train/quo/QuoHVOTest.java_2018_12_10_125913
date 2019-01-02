package nc.tc.nc.vo.train.quo;
import org.testng.*;
import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;
import java.util.ArrayList;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import jxl.read.biff.BiffException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.yonyou.uat.util.ExcelDataProvider;
import com.yonyou.uat.util.DBDataProvider;
import com.yonyou.uat.dbmanagement.DBManage;
import com.yonyou.uat.dbmanagement.QueryInfoVO;
import nc.vo.train.quo.QuoHVO;
import nc.bs.framework.common.NCLocator;
import com.yonyou.uat.framework.BaseTestCase;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDate;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDateTime;
import java.lang.String;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDate;
import java.lang.String;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDateTime;
import java.lang.String;
import java.lang.String;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.IVOMeta;
public class QuoHVOTest extends BaseTestCase {
  QuoHVO quoHVO=null;
  DBManage dbManage=null;
  
  @BeforeClass 
  public void BeforeClass(){
    quoHVO=NCLocator.getInstance().lookup(QuoHVO.class);
  }
  
  @AfterClass 
  public void AfterClass(){
  }
  
  @BeforeMethod 
  public void BeforeMethod(){
    List<String> tableList=new ArrayList<String>();
    tableList.add("pub_wfexptlog");
    dbManage=new DBManage();
    dbManage.setTableList(tableList);
    dbManage.tableExport();
  }
  
  @AfterMethod 
  public void AfterMethod(){
    dbManage.tableRollBack();
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void getPk_quo(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    
    //Invoke tested method
    String retObj="";
    retObj=quoHVO.getPk_quo();
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals(retObj,"expectValue");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void setPk_quo(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    String pk_quo=(String)dp.get("pk_quo").get(0);
    
    //Invoke tested method
    quoHVO.setPk_quo(pk_quo);
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals("actual","expected");
    Assert.assertNotNull("actual");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void getPk_group(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    
    //Invoke tested method
    String retObj="";
    retObj=quoHVO.getPk_group();
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals(retObj,"expectValue");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void setPk_group(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    String pk_group=(String)dp.get("pk_group").get(0);
    
    //Invoke tested method
    quoHVO.setPk_group(pk_group);
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals("actual","expected");
    Assert.assertNotNull("actual");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void getPk_org(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    
    //Invoke tested method
    String retObj="";
    retObj=quoHVO.getPk_org();
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals(retObj,"expectValue");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void setPk_org(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    String pk_org=(String)dp.get("pk_org").get(0);
    
    //Invoke tested method
    quoHVO.setPk_org(pk_org);
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals("actual","expected");
    Assert.assertNotNull("actual");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void getPk_org_v(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    
    //Invoke tested method
    String retObj="";
    retObj=quoHVO.getPk_org_v();
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals(retObj,"expectValue");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void setPk_org_v(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    String pk_org_v=(String)dp.get("pk_org_v").get(0);
    
    //Invoke tested method
    quoHVO.setPk_org_v(pk_org_v);
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals("actual","expected");
    Assert.assertNotNull("actual");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void getVbillno(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    
    //Invoke tested method
    String retObj="";
    retObj=quoHVO.getVbillno();
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals(retObj,"expectValue");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void setVbillno(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    String vbillno=(String)dp.get("vbillno").get(0);
    
    //Invoke tested method
    quoHVO.setVbillno(vbillno);
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals("actual","expected");
    Assert.assertNotNull("actual");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void getDbilldate(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    
    //Invoke tested method
    UFDate retObj=null;
    retObj=quoHVO.getDbilldate();
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertNotNull(retObj);
    Assert.assertNotNull(retObj.getDay());
    Assert.assertEquals(retObj.getDay(),0);
    Assert.assertNotNull(retObj.getDaysMonth());
    Assert.assertEquals(retObj.getDaysMonth(),0);
    Assert.assertNotNull(retObj.getEnMonth());
    Assert.assertEquals(retObj.getEnMonth(),"expectValue");
    Assert.assertNotNull(retObj.getEnWeek());
    Assert.assertEquals(retObj.getEnWeek(),"expectValue");
    Assert.assertNotNull(retObj.getLocalDay());
    Assert.assertEquals(retObj.getLocalDay(),0);
    Assert.assertNotNull(retObj.getLocalMonth());
    Assert.assertEquals(retObj.getLocalMonth(),0);
    Assert.assertNotNull(retObj.getLocalYear());
    Assert.assertEquals(retObj.getLocalYear(),0);
    Assert.assertNotNull(retObj.getMillis());
    Assert.assertEquals(retObj.getMillis(),0);
    Assert.assertNotNull(retObj.getMonth());
    Assert.assertEquals(retObj.getMonth(),0);
    Assert.assertNotNull(retObj.getStrDay());
    Assert.assertEquals(retObj.getStrDay(),"expectValue");
    Assert.assertNotNull(retObj.getStrMonth());
    Assert.assertEquals(retObj.getStrMonth(),"expectValue");
    Assert.assertNotNull(retObj.getWeek());
    Assert.assertEquals(retObj.getWeek(),0);
    Assert.assertNotNull(retObj.getWeekOfYear());
    Assert.assertEquals(retObj.getWeekOfYear(),0);
    Assert.assertNotNull(retObj.getYear());
    Assert.assertEquals(retObj.getYear(),0);
    
    //Verify Return or middle Object == expect Object(from object file)
    Object expectedObj=super.getExpectResultObject("caseName");
    if (expectedObj != null) {
      Assert.assertEquals(retObj,expectedObj);
    }
 else {
      super.saveResultObject((Serializable)retObj,"caseName");
    }
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void setDbilldate(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    UFDate dbilldate=(UFDate)super.getSpringObj("ufdate");
    
    //Invoke tested method
    quoHVO.setDbilldate(dbilldate);
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals("actual","expected");
    Assert.assertNotNull("actual");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void getVbillstatus(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    
    //Invoke tested method
    String retObj="";
    retObj=quoHVO.getVbillstatus();
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals(retObj,"expectValue");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void setVbillstatus(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    String vbillstatus=(String)dp.get("vbillstatus").get(0);
    
    //Invoke tested method
    quoHVO.setVbillstatus(vbillstatus);
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals("actual","expected");
    Assert.assertNotNull("actual");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void getPk_billtypecode(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    
    //Invoke tested method
    String retObj="";
    retObj=quoHVO.getPk_billtypecode();
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals(retObj,"expectValue");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void setPk_billtypecode(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    String pk_billtypecode=(String)dp.get("pk_billtypecode").get(0);
    
    //Invoke tested method
    quoHVO.setPk_billtypecode(pk_billtypecode);
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals("actual","expected");
    Assert.assertNotNull("actual");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void getPk_billtype(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    
    //Invoke tested method
    String retObj="";
    retObj=quoHVO.getPk_billtype();
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals(retObj,"expectValue");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void setPk_billtype(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    String pk_billtype=(String)dp.get("pk_billtype").get(0);
    
    //Invoke tested method
    quoHVO.setPk_billtype(pk_billtype);
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals("actual","expected");
    Assert.assertNotNull("actual");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void getPk_busitype(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    
    //Invoke tested method
    String retObj="";
    retObj=quoHVO.getPk_busitype();
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals(retObj,"expectValue");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void setPk_busitype(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    String pk_busitype=(String)dp.get("pk_busitype").get(0);
    
    //Invoke tested method
    quoHVO.setPk_busitype(pk_busitype);
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals("actual","expected");
    Assert.assertNotNull("actual");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void getVtrantypecode(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    
    //Invoke tested method
    String retObj="";
    retObj=quoHVO.getVtrantypecode();
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals(retObj,"expectValue");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void setVtrantypecode(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    String vtrantypecode=(String)dp.get("vtrantypecode").get(0);
    
    //Invoke tested method
    quoHVO.setVtrantypecode(vtrantypecode);
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals("actual","expected");
    Assert.assertNotNull("actual");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void getCtrantypeid(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    
    //Invoke tested method
    String retObj="";
    retObj=quoHVO.getCtrantypeid();
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals(retObj,"expectValue");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void setCtrantypeid(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    String ctrantypeid=(String)dp.get("ctrantypeid").get(0);
    
    //Invoke tested method
    quoHVO.setCtrantypeid(ctrantypeid);
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals("actual","expected");
    Assert.assertNotNull("actual");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void getPk_custclass(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    
    //Invoke tested method
    String retObj="";
    retObj=quoHVO.getPk_custclass();
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals(retObj,"expectValue");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void setPk_custclass(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    String pk_custclass=(String)dp.get("pk_custclass").get(0);
    
    //Invoke tested method
    quoHVO.setPk_custclass(pk_custclass);
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals("actual","expected");
    Assert.assertNotNull("actual");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void getPk_cust(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    
    //Invoke tested method
    String retObj="";
    retObj=quoHVO.getPk_cust();
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals(retObj,"expectValue");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void setPk_cust(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    String pk_cust=(String)dp.get("pk_cust").get(0);
    
    //Invoke tested method
    quoHVO.setPk_cust(pk_cust);
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals("actual","expected");
    Assert.assertNotNull("actual");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void getPk_dept(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    
    //Invoke tested method
    String retObj="";
    retObj=quoHVO.getPk_dept();
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals(retObj,"expectValue");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void setPk_dept(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    String pk_dept=(String)dp.get("pk_dept").get(0);
    
    //Invoke tested method
    quoHVO.setPk_dept(pk_dept);
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals("actual","expected");
    Assert.assertNotNull("actual");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void getPk_dept_v(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    
    //Invoke tested method
    String retObj="";
    retObj=quoHVO.getPk_dept_v();
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals(retObj,"expectValue");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void setPk_dept_v(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    String pk_dept_v=(String)dp.get("pk_dept_v").get(0);
    
    //Invoke tested method
    quoHVO.setPk_dept_v(pk_dept_v);
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals("actual","expected");
    Assert.assertNotNull("actual");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void getNtotalnum(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    
    //Invoke tested method
    String retObj="";
    retObj=quoHVO.getNtotalnum();
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals(retObj,"expectValue");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void setNtotalnum(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    String ntotalnum=(String)dp.get("ntotalnum").get(0);
    
    //Invoke tested method
    quoHVO.setNtotalnum(ntotalnum);
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals("actual","expected");
    Assert.assertNotNull("actual");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void getNtoalmny(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    
    //Invoke tested method
    String retObj="";
    retObj=quoHVO.getNtoalmny();
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals(retObj,"expectValue");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void setNtoalmny(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    String ntoalmny=(String)dp.get("ntoalmny").get(0);
    
    //Invoke tested method
    quoHVO.setNtoalmny(ntoalmny);
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals("actual","expected");
    Assert.assertNotNull("actual");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void getCreator(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    
    //Invoke tested method
    String retObj="";
    retObj=quoHVO.getCreator();
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals(retObj,"expectValue");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void setCreator(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    String creator=(String)dp.get("creator").get(0);
    
    //Invoke tested method
    quoHVO.setCreator(creator);
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals("actual","expected");
    Assert.assertNotNull("actual");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void getCreationtime(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    
    //Invoke tested method
    UFDateTime retObj=null;
    retObj=quoHVO.getCreationtime();
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertNotNull(retObj);
    Assert.assertNotNull(retObj.getBeginDate());
    Assert.assertNotNull(retObj.getDate());
    Assert.assertNotNull(retObj.getDay());
    Assert.assertEquals(retObj.getDay(),0);
    Assert.assertNotNull(retObj.getDaysMonth());
    Assert.assertEquals(retObj.getDaysMonth(),0);
    Assert.assertNotNull(retObj.getEnMonth());
    Assert.assertEquals(retObj.getEnMonth(),"expectValue");
    Assert.assertNotNull(retObj.getEnWeek());
    Assert.assertEquals(retObj.getEnWeek(),"expectValue");
    Assert.assertNotNull(retObj.getEndDate());
    Assert.assertNotNull(retObj.getHour());
    Assert.assertEquals(retObj.getHour(),0);
    Assert.assertNotNull(retObj.getLocalDay());
    Assert.assertEquals(retObj.getLocalDay(),0);
    Assert.assertNotNull(retObj.getLocalHour());
    Assert.assertEquals(retObj.getLocalHour(),0);
    Assert.assertNotNull(retObj.getLocalMinute());
    Assert.assertEquals(retObj.getLocalMinute(),0);
    Assert.assertNotNull(retObj.getLocalMonth());
    Assert.assertEquals(retObj.getLocalMonth(),0);
    Assert.assertNotNull(retObj.getLocalYear());
    Assert.assertEquals(retObj.getLocalYear(),0);
    Assert.assertNotNull(retObj.getMillis());
    Assert.assertEquals(retObj.getMillis(),0);
    Assert.assertNotNull(retObj.getMinute());
    Assert.assertEquals(retObj.getMinute(),0);
    Assert.assertNotNull(retObj.getMonth());
    Assert.assertEquals(retObj.getMonth(),0);
    Assert.assertNotNull(retObj.getSecond());
    Assert.assertEquals(retObj.getSecond(),0);
    Assert.assertNotNull(retObj.getStrDay());
    Assert.assertEquals(retObj.getStrDay(),"expectValue");
    Assert.assertNotNull(retObj.getStrMonth());
    Assert.assertEquals(retObj.getStrMonth(),"expectValue");
    Assert.assertNotNull(retObj.getTime());
    Assert.assertEquals(retObj.getTime(),"expectValue");
    Assert.assertNotNull(retObj.getUFTime());
    Assert.assertNotNull(retObj.getWeek());
    Assert.assertEquals(retObj.getWeek(),0);
    Assert.assertNotNull(retObj.getWeekOfYear());
    Assert.assertEquals(retObj.getWeekOfYear(),0);
    Assert.assertNotNull(retObj.getYear());
    Assert.assertEquals(retObj.getYear(),0);
    
    //Verify Return or middle Object == expect Object(from object file)
    Object expectedObj=super.getExpectResultObject("caseName");
    if (expectedObj != null) {
      Assert.assertEquals(retObj,expectedObj);
    }
 else {
      super.saveResultObject((Serializable)retObj,"caseName");
    }
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void setCreationtime(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    UFDateTime creationtime=(UFDateTime)super.getSpringObj("ufdatetime");
    
    //Invoke tested method
    quoHVO.setCreationtime(creationtime);
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals("actual","expected");
    Assert.assertNotNull("actual");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void getModifier(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    
    //Invoke tested method
    String retObj="";
    retObj=quoHVO.getModifier();
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals(retObj,"expectValue");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void setModifier(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    String modifier=(String)dp.get("modifier").get(0);
    
    //Invoke tested method
    quoHVO.setModifier(modifier);
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals("actual","expected");
    Assert.assertNotNull("actual");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void getModifieditime(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    
    //Invoke tested method
    UFDate retObj=null;
    retObj=quoHVO.getModifieditime();
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertNotNull(retObj);
    Assert.assertNotNull(retObj.getDay());
    Assert.assertEquals(retObj.getDay(),0);
    Assert.assertNotNull(retObj.getDaysMonth());
    Assert.assertEquals(retObj.getDaysMonth(),0);
    Assert.assertNotNull(retObj.getEnMonth());
    Assert.assertEquals(retObj.getEnMonth(),"expectValue");
    Assert.assertNotNull(retObj.getEnWeek());
    Assert.assertEquals(retObj.getEnWeek(),"expectValue");
    Assert.assertNotNull(retObj.getLocalDay());
    Assert.assertEquals(retObj.getLocalDay(),0);
    Assert.assertNotNull(retObj.getLocalMonth());
    Assert.assertEquals(retObj.getLocalMonth(),0);
    Assert.assertNotNull(retObj.getLocalYear());
    Assert.assertEquals(retObj.getLocalYear(),0);
    Assert.assertNotNull(retObj.getMillis());
    Assert.assertEquals(retObj.getMillis(),0);
    Assert.assertNotNull(retObj.getMonth());
    Assert.assertEquals(retObj.getMonth(),0);
    Assert.assertNotNull(retObj.getStrDay());
    Assert.assertEquals(retObj.getStrDay(),"expectValue");
    Assert.assertNotNull(retObj.getStrMonth());
    Assert.assertEquals(retObj.getStrMonth(),"expectValue");
    Assert.assertNotNull(retObj.getWeek());
    Assert.assertEquals(retObj.getWeek(),0);
    Assert.assertNotNull(retObj.getWeekOfYear());
    Assert.assertEquals(retObj.getWeekOfYear(),0);
    Assert.assertNotNull(retObj.getYear());
    Assert.assertEquals(retObj.getYear(),0);
    
    //Verify Return or middle Object == expect Object(from object file)
    Object expectedObj=super.getExpectResultObject("caseName");
    if (expectedObj != null) {
      Assert.assertEquals(retObj,expectedObj);
    }
 else {
      super.saveResultObject((Serializable)retObj,"caseName");
    }
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void setModifieditime(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    UFDate modifieditime=(UFDate)super.getSpringObj("ufdate");
    
    //Invoke tested method
    quoHVO.setModifieditime(modifieditime);
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals("actual","expected");
    Assert.assertNotNull("actual");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void getVapproveid(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    
    //Invoke tested method
    String retObj="";
    retObj=quoHVO.getVapproveid();
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals(retObj,"expectValue");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void setVapproveid(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    String vapproveid=(String)dp.get("vapproveid").get(0);
    
    //Invoke tested method
    quoHVO.setVapproveid(vapproveid);
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals("actual","expected");
    Assert.assertNotNull("actual");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void getTapprovietime(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    
    //Invoke tested method
    UFDateTime retObj=null;
    retObj=quoHVO.getTapprovietime();
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertNotNull(retObj);
    Assert.assertNotNull(retObj.getBeginDate());
    Assert.assertNotNull(retObj.getDate());
    Assert.assertNotNull(retObj.getDay());
    Assert.assertEquals(retObj.getDay(),0);
    Assert.assertNotNull(retObj.getDaysMonth());
    Assert.assertEquals(retObj.getDaysMonth(),0);
    Assert.assertNotNull(retObj.getEnMonth());
    Assert.assertEquals(retObj.getEnMonth(),"expectValue");
    Assert.assertNotNull(retObj.getEnWeek());
    Assert.assertEquals(retObj.getEnWeek(),"expectValue");
    Assert.assertNotNull(retObj.getEndDate());
    Assert.assertNotNull(retObj.getHour());
    Assert.assertEquals(retObj.getHour(),0);
    Assert.assertNotNull(retObj.getLocalDay());
    Assert.assertEquals(retObj.getLocalDay(),0);
    Assert.assertNotNull(retObj.getLocalHour());
    Assert.assertEquals(retObj.getLocalHour(),0);
    Assert.assertNotNull(retObj.getLocalMinute());
    Assert.assertEquals(retObj.getLocalMinute(),0);
    Assert.assertNotNull(retObj.getLocalMonth());
    Assert.assertEquals(retObj.getLocalMonth(),0);
    Assert.assertNotNull(retObj.getLocalYear());
    Assert.assertEquals(retObj.getLocalYear(),0);
    Assert.assertNotNull(retObj.getMillis());
    Assert.assertEquals(retObj.getMillis(),0);
    Assert.assertNotNull(retObj.getMinute());
    Assert.assertEquals(retObj.getMinute(),0);
    Assert.assertNotNull(retObj.getMonth());
    Assert.assertEquals(retObj.getMonth(),0);
    Assert.assertNotNull(retObj.getSecond());
    Assert.assertEquals(retObj.getSecond(),0);
    Assert.assertNotNull(retObj.getStrDay());
    Assert.assertEquals(retObj.getStrDay(),"expectValue");
    Assert.assertNotNull(retObj.getStrMonth());
    Assert.assertEquals(retObj.getStrMonth(),"expectValue");
    Assert.assertNotNull(retObj.getTime());
    Assert.assertEquals(retObj.getTime(),"expectValue");
    Assert.assertNotNull(retObj.getUFTime());
    Assert.assertNotNull(retObj.getWeek());
    Assert.assertEquals(retObj.getWeek(),0);
    Assert.assertNotNull(retObj.getWeekOfYear());
    Assert.assertEquals(retObj.getWeekOfYear(),0);
    Assert.assertNotNull(retObj.getYear());
    Assert.assertEquals(retObj.getYear(),0);
    
    //Verify Return or middle Object == expect Object(from object file)
    Object expectedObj=super.getExpectResultObject("caseName");
    if (expectedObj != null) {
      Assert.assertEquals(retObj,expectedObj);
    }
 else {
      super.saveResultObject((Serializable)retObj,"caseName");
    }
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void setTapprovietime(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    UFDateTime tapprovietime=(UFDateTime)super.getSpringObj("ufdatetime");
    
    //Invoke tested method
    quoHVO.setTapprovietime(tapprovietime);
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals("actual","expected");
    Assert.assertNotNull("actual");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void getVapprovename(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    
    //Invoke tested method
    String retObj="";
    retObj=quoHVO.getVapprovename();
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals(retObj,"expectValue");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void setVapprovename(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    String vapprovename=(String)dp.get("vapprovename").get(0);
    
    //Invoke tested method
    quoHVO.setVapprovename(vapprovename);
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals("actual","expected");
    Assert.assertNotNull("actual");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void getVmemo(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    
    //Invoke tested method
    String retObj="";
    retObj=quoHVO.getVmemo();
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals(retObj,"expectValue");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void setVmemo(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    String vmemo=(String)dp.get("vmemo").get(0);
    
    //Invoke tested method
    quoHVO.setVmemo(vmemo);
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals("actual","expected");
    Assert.assertNotNull("actual");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void getTs(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    
    //Invoke tested method
    UFDateTime retObj=null;
    retObj=quoHVO.getTs();
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertNotNull(retObj);
    Assert.assertNotNull(retObj.getBeginDate());
    Assert.assertNotNull(retObj.getDate());
    Assert.assertNotNull(retObj.getDay());
    Assert.assertEquals(retObj.getDay(),0);
    Assert.assertNotNull(retObj.getDaysMonth());
    Assert.assertEquals(retObj.getDaysMonth(),0);
    Assert.assertNotNull(retObj.getEnMonth());
    Assert.assertEquals(retObj.getEnMonth(),"expectValue");
    Assert.assertNotNull(retObj.getEnWeek());
    Assert.assertEquals(retObj.getEnWeek(),"expectValue");
    Assert.assertNotNull(retObj.getEndDate());
    Assert.assertNotNull(retObj.getHour());
    Assert.assertEquals(retObj.getHour(),0);
    Assert.assertNotNull(retObj.getLocalDay());
    Assert.assertEquals(retObj.getLocalDay(),0);
    Assert.assertNotNull(retObj.getLocalHour());
    Assert.assertEquals(retObj.getLocalHour(),0);
    Assert.assertNotNull(retObj.getLocalMinute());
    Assert.assertEquals(retObj.getLocalMinute(),0);
    Assert.assertNotNull(retObj.getLocalMonth());
    Assert.assertEquals(retObj.getLocalMonth(),0);
    Assert.assertNotNull(retObj.getLocalYear());
    Assert.assertEquals(retObj.getLocalYear(),0);
    Assert.assertNotNull(retObj.getMillis());
    Assert.assertEquals(retObj.getMillis(),0);
    Assert.assertNotNull(retObj.getMinute());
    Assert.assertEquals(retObj.getMinute(),0);
    Assert.assertNotNull(retObj.getMonth());
    Assert.assertEquals(retObj.getMonth(),0);
    Assert.assertNotNull(retObj.getSecond());
    Assert.assertEquals(retObj.getSecond(),0);
    Assert.assertNotNull(retObj.getStrDay());
    Assert.assertEquals(retObj.getStrDay(),"expectValue");
    Assert.assertNotNull(retObj.getStrMonth());
    Assert.assertEquals(retObj.getStrMonth(),"expectValue");
    Assert.assertNotNull(retObj.getTime());
    Assert.assertEquals(retObj.getTime(),"expectValue");
    Assert.assertNotNull(retObj.getUFTime());
    Assert.assertNotNull(retObj.getWeek());
    Assert.assertEquals(retObj.getWeek(),0);
    Assert.assertNotNull(retObj.getWeekOfYear());
    Assert.assertEquals(retObj.getWeekOfYear(),0);
    Assert.assertNotNull(retObj.getYear());
    Assert.assertEquals(retObj.getYear(),0);
    
    //Verify Return or middle Object == expect Object(from object file)
    Object expectedObj=super.getExpectResultObject("caseName");
    if (expectedObj != null) {
      Assert.assertEquals(retObj,expectedObj);
    }
 else {
      super.saveResultObject((Serializable)retObj,"caseName");
    }
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void setTs(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    UFDateTime ts=(UFDateTime)super.getSpringObj("ufdatetime");
    
    //Invoke tested method
    quoHVO.setTs(ts);
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertEquals("actual","expected");
    Assert.assertNotNull("actual");
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void getMetaData(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    
    //Invoke tested method
    IVOMeta retObj=null;
    retObj=quoHVO.getMetaData();
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertNotNull(retObj);
    Assert.assertNotNull(retObj.getAttributes());
    Assert.assertNotNull(retObj.getBusinessAttribute());
    Assert.assertEquals(retObj.getBusinessAttribute().size(),0);
    Assert.assertNotNull(retObj.getEntityName());
    Assert.assertEquals(retObj.getEntityName(),"expectValue");
    Assert.assertNotNull(retObj.getLabel());
    Assert.assertEquals(retObj.getLabel(),"expectValue");
    Assert.assertNotNull(retObj.getPrimaryAttribute());
    Assert.assertNotNull(retObj.getStatisticInfo());
    
    //Verify DB result is ok
    QueryInfoVO queryInfoVerify=new QueryInfoVO();
    queryInfoVerify.setDatasource("datasourceName");
    queryInfoVerify.setTableName("tableName");
    queryInfoVerify.setCondition("where condition");
    List<Object> actualObjects=super.getDBObjectClass(Object.class,queryInfoVerify);
    Object actualObject=(Object)actualObjects.get(0);
    Assert.assertEquals("actualObject.getxxx()",dp.get("colName").get(0));
    
    //Verify whether have exception information in log 
    super.verifyLog("Error key word");
  }
}
