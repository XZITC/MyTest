DELETE FROM bd_billtype2 WHERE pk_billtypeid = '0001ZZ100000000026WM';
DELETE FROM bd_fwdbilltype WHERE pk_billtypeid = '0001ZZ100000000026WM';
DELETE FROM pub_function WHERE pk_billtype = 'TR21';
DELETE FROM pub_billaction WHERE pk_billtypeid = '0001ZZ100000000026WM';
DELETE FROM pub_billactiongroup WHERE pk_billtype = 'TR21';
DELETE FROM bd_billtype WHERE pk_billtypeid = '0001ZZ100000000026WM';
delete from temppkts;
DELETE FROM sm_rule_type WHERE pk_rule_type = null;
DELETE FROM sm_permission_res WHERE pk_permission_res = null;
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000026WN';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000026WO';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000026WP';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000026WQ';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000026WR';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000026WS';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000026WT';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000026WU';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000026WV';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000026WW';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000026WX';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000026WY';
