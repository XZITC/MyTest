package nc.tc.nc.vo.train.quo;
import org.testng.*;
import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;
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
import nc.vo.train.quo.AggQuoHVO;
import nc.bs.framework.common.NCLocator;
import com.yonyou.uat.framework.BaseTestCase;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;
import nc.vo.train.quo.QuoHVO;
public class AggQuoHVOTest extends BaseTestCase {
  AggQuoHVO aggQuoHVO=null;
  DBManage dbManage=null;
  
  @BeforeClass 
  public void BeforeClass(){
    aggQuoHVO=NCLocator.getInstance().lookup(AggQuoHVO.class);
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
  public void getMetaData(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    
    //Invoke tested method
    IBillMeta retObj=null;
    retObj=aggQuoHVO.getMetaData();
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertNotNull(retObj);
    Assert.assertNotNull(retObj.getBusinessAttribute());
    Assert.assertEquals(retObj.getBusinessAttribute().size(),0);
    Assert.assertNotNull(retObj.getChildForeignKeys());
    Assert.assertNotNull(retObj.getChildren());
    Assert.assertNotNull(retObj.getComponentName());
    Assert.assertEquals(retObj.getComponentName(),"expectValue");
    Assert.assertNotNull(retObj.getParent());
    
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
  public void getParentVO(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    
    //Invoke tested method
    QuoHVO retObj=new QuoHVO();
    retObj=aggQuoHVO.getParentVO();
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertNotNull(retObj);
    Assert.assertNotNull(retObj.getCreationtime());
    Assert.assertNotNull(retObj.getCreator());
    Assert.assertEquals(retObj.getCreator(),"expectValue");
    Assert.assertNotNull(retObj.getCtrantypeid());
    Assert.assertEquals(retObj.getCtrantypeid(),"expectValue");
    Assert.assertNotNull(retObj.getDbilldate());
    Assert.assertNotNull(retObj.getMetaData());
    Assert.assertNotNull(retObj.getModifieditime());
    Assert.assertNotNull(retObj.getModifier());
    Assert.assertEquals(retObj.getModifier(),"expectValue");
    Assert.assertNotNull(retObj.getNtoalmny());
    Assert.assertEquals(retObj.getNtoalmny(),"expectValue");
    Assert.assertNotNull(retObj.getNtotalnum());
    Assert.assertEquals(retObj.getNtotalnum(),"expectValue");
    Assert.assertNotNull(retObj.getPk_billtype());
    Assert.assertEquals(retObj.getPk_billtype(),"expectValue");
    Assert.assertNotNull(retObj.getPk_billtypecode());
    Assert.assertEquals(retObj.getPk_billtypecode(),"expectValue");
    Assert.assertNotNull(retObj.getPk_busitype());
    Assert.assertEquals(retObj.getPk_busitype(),"expectValue");
    Assert.assertNotNull(retObj.getPk_cust());
    Assert.assertEquals(retObj.getPk_cust(),"expectValue");
    Assert.assertNotNull(retObj.getPk_custclass());
    Assert.assertEquals(retObj.getPk_custclass(),"expectValue");
    Assert.assertNotNull(retObj.getPk_dept());
    Assert.assertEquals(retObj.getPk_dept(),"expectValue");
    Assert.assertNotNull(retObj.getPk_dept_v());
    Assert.assertEquals(retObj.getPk_dept_v(),"expectValue");
    Assert.assertNotNull(retObj.getPk_group());
    Assert.assertEquals(retObj.getPk_group(),"expectValue");
    Assert.assertNotNull(retObj.getPk_org());
    Assert.assertEquals(retObj.getPk_org(),"expectValue");
    Assert.assertNotNull(retObj.getPk_org_v());
    Assert.assertEquals(retObj.getPk_org_v(),"expectValue");
    Assert.assertNotNull(retObj.getPk_quo());
    Assert.assertEquals(retObj.getPk_quo(),"expectValue");
    Assert.assertNotNull(retObj.getTapprovietime());
    Assert.assertNotNull(retObj.getTs());
    Assert.assertNotNull(retObj.getVapproveid());
    Assert.assertEquals(retObj.getVapproveid(),"expectValue");
    Assert.assertNotNull(retObj.getVapprovename());
    Assert.assertEquals(retObj.getVapprovename(),"expectValue");
    Assert.assertNotNull(retObj.getVbillno());
    Assert.assertEquals(retObj.getVbillno(),"expectValue");
    Assert.assertNotNull(retObj.getVbillstatus());
    Assert.assertEquals(retObj.getVbillstatus(),"expectValue");
    Assert.assertNotNull(retObj.getVmemo());
    Assert.assertEquals(retObj.getVmemo(),"expectValue");
    Assert.assertNotNull(retObj.getVtrantypecode());
    Assert.assertEquals(retObj.getVtrantypecode(),"expectValue");
    
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
}
