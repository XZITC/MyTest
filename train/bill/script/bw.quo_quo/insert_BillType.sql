INSERT INTO bd_billtype (ts, iseditableproperty, pk_billtypecode, ncbrcode, parentbilltype, canextendtransaction, istransaction, isbizflowbill, datafinderclz, referclassname, isaccount, pk_org, isroot, billtypename, component, emendenumclass, billcoderule, dr, nodecode, isenablebutton, pk_billtypeid, systemcode, classname, checkclassname, accountclass, islock, forwardbilltype, billtypename2, billtypename3, transtype_class, billtypename4, billtypename5, pk_group, billtypename6, webnodecode, billstyle, def3, isapprovebill, isenabletranstypebcr, def2, def1, wherestring ) VALUES ('2018-12-10 13:07:31', null, 'TR21', '~', '~', 'Y', 'N', null, null, null, null, 'GLOBLE00000000000000', null, '销售报价单', 'quo', null, '~', null, 'TR102010', null, '0001ZZ100000000026WM', 'train', null, null, null, null, null, null, null, null, null, null, '~', null, '~', null, null, 'Y', null, null, null, null );
INSERT INTO pub_billaction (ts, pushflag, actionstyleremark, pk_billtypeid, controlflag, finishflag, pk_billaction, actionnote6, actiontype, actionnote4, actionnote, actionnote5, actionnote2, actionnote3, action_type, constrictflag, actionstyle, showhint, pk_billtype, dr ) VALUES ('2018-12-10 13:07:34', null, null, '0001ZZ100000000026WM', 'N', 'N', '0001ZZ100000000026WN', null, 'SAVE', null, '送审', null, null, null, 10, 'N', '1', null, 'TR21', null );
INSERT INTO pub_billaction (ts, pushflag, actionstyleremark, pk_billtypeid, controlflag, finishflag, pk_billaction, actionnote6, actiontype, actionnote4, actionnote, actionnote5, actionnote2, actionnote3, action_type, constrictflag, actionstyle, showhint, pk_billtype, dr ) VALUES ('2018-12-10 13:07:34', null, null, '0001ZZ100000000026WM', 'N', 'N', '0001ZZ100000000026WO', null, 'APPROVE', null, '审核', null, null, null, 11, 'N', '2', null, 'TR21', null );
INSERT INTO pub_billaction (ts, pushflag, actionstyleremark, pk_billtypeid, controlflag, finishflag, pk_billaction, actionnote6, actiontype, actionnote4, actionnote, actionnote5, actionnote2, actionnote3, action_type, constrictflag, actionstyle, showhint, pk_billtype, dr ) VALUES ('2018-12-10 13:07:34', null, null, '0001ZZ100000000026WM', 'Y', 'Y', '0001ZZ100000000026WP', null, 'UNSAVEBILL', null, '收回', null, null, null, 13, 'N', '3', null, 'TR21', null );
INSERT INTO pub_billaction (ts, pushflag, actionstyleremark, pk_billtypeid, controlflag, finishflag, pk_billaction, actionnote6, actiontype, actionnote4, actionnote, actionnote5, actionnote2, actionnote3, action_type, constrictflag, actionstyle, showhint, pk_billtype, dr ) VALUES ('2018-12-10 13:07:34', null, null, '0001ZZ100000000026WM', 'N', 'Y', '0001ZZ100000000026WQ', null, 'UNAPPROVE', null, '弃审', null, null, null, 12, 'N', '3', null, 'TR21', null );
INSERT INTO pub_billaction (ts, pushflag, actionstyleremark, pk_billtypeid, controlflag, finishflag, pk_billaction, actionnote6, actiontype, actionnote4, actionnote, actionnote5, actionnote2, actionnote3, action_type, constrictflag, actionstyle, showhint, pk_billtype, dr ) VALUES ('2018-12-10 13:07:34', null, null, '0001ZZ100000000026WM', 'N', 'N', '0001ZZ100000000026WR', null, 'DELETE', null, '删除', null, null, null, 30, 'N', '3', null, 'TR21', null );
INSERT INTO pub_billaction (ts, pushflag, actionstyleremark, pk_billtypeid, controlflag, finishflag, pk_billaction, actionnote6, actiontype, actionnote4, actionnote, actionnote5, actionnote2, actionnote3, action_type, constrictflag, actionstyle, showhint, pk_billtype, dr ) VALUES ('2018-12-10 13:07:34', null, null, '0001ZZ100000000026WM', 'N', 'N', '0001ZZ100000000026WS', null, 'SAVEBASE', null, '保存', null, null, null, 31, 'Y', '1', null, 'TR21', null );
INSERT INTO pub_busiclass (ts, pk_billtypeid, pk_businesstype, classname, isbefore, actiontype, pk_group, dr, pk_billtype, pk_busiclass ) VALUES ('2018-12-10 13:07:34', '0001ZZ100000000026WM', '~', 'N_TR21_SAVE', 'N', 'SAVE', '~', 0, 'TR21', '0001ZZ100000000026WT' );
INSERT INTO pub_busiclass (ts, pk_billtypeid, pk_businesstype, classname, isbefore, actiontype, pk_group, dr, pk_billtype, pk_busiclass ) VALUES ('2018-12-10 13:07:34', '0001ZZ100000000026WM', '~', 'N_TR21_APPROVE', 'N', 'APPROVE', '~', 0, 'TR21', '0001ZZ100000000026WU' );
INSERT INTO pub_busiclass (ts, pk_billtypeid, pk_businesstype, classname, isbefore, actiontype, pk_group, dr, pk_billtype, pk_busiclass ) VALUES ('2018-12-10 13:07:34', '0001ZZ100000000026WM', '~', 'N_TR21_UNSAVEBILL', 'N', 'UNSAVEBILL', '~', 0, 'TR21', '0001ZZ100000000026WV' );
INSERT INTO pub_busiclass (ts, pk_billtypeid, pk_businesstype, classname, isbefore, actiontype, pk_group, dr, pk_billtype, pk_busiclass ) VALUES ('2018-12-10 13:07:34', '0001ZZ100000000026WM', '~', 'N_TR21_UNAPPROVE', 'N', 'UNAPPROVE', '~', 0, 'TR21', '0001ZZ100000000026WW' );
INSERT INTO pub_busiclass (ts, pk_billtypeid, pk_businesstype, classname, isbefore, actiontype, pk_group, dr, pk_billtype, pk_busiclass ) VALUES ('2018-12-10 13:07:34', '0001ZZ100000000026WM', '~', 'N_TR21_DELETE', 'N', 'DELETE', '~', 0, 'TR21', '0001ZZ100000000026WX' );
INSERT INTO pub_busiclass (ts, pk_billtypeid, pk_businesstype, classname, isbefore, actiontype, pk_group, dr, pk_billtype, pk_busiclass ) VALUES ('2018-12-10 13:07:34', '0001ZZ100000000026WM', '~', 'N_TR21_SAVEBASE', 'N', 'SAVEBASE', '~', 0, 'TR21', '0001ZZ100000000026WY' );