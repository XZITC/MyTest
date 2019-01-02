DELETE FROM bd_billtype2 WHERE pk_billtypeid = '0001ZZ10000000001YFC';
DELETE FROM bd_fwdbilltype WHERE pk_billtypeid = '0001ZZ10000000001YFC';
DELETE FROM pub_function WHERE pk_billtype = 'TR13';
DELETE FROM pub_billaction WHERE pk_billtypeid = '0001ZZ10000000001YFC';
DELETE FROM pub_billactiongroup WHERE pk_billtype = 'TR13';
DELETE FROM bd_billtype WHERE pk_billtypeid = '0001ZZ10000000001YFC';
delete from temppkts;
DELETE FROM sm_rule_type WHERE pk_rule_type = null;
DELETE FROM sm_permission_res WHERE pk_permission_res = null;
