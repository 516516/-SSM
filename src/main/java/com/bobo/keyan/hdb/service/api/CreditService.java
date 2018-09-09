package com.bobo.keyan.hdb.service.api;

import java.util.Map;

public interface CreditService {
	Map<String, Object> insertCreditSelective(Map<String, Object> map) throws Exception;
	Map<String, Object> selectAllCount_svc(Map<String, Object> map) throws Exception;
	Map<String, Object> delectAcount_svc(Map<String, Object> map) throws Exception;
}
