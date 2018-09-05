package com.bobo.keyan.hdb.model;

import java.util.ArrayList;
import java.util.List;

public class CreditExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CreditExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Integer value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Integer value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Integer value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Integer value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Integer> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Integer> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Integer value1, Integer value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_id not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCUseridIsNull() {
            addCriterion("c_userid is null");
            return (Criteria) this;
        }

        public Criteria andCUseridIsNotNull() {
            addCriterion("c_userid is not null");
            return (Criteria) this;
        }

        public Criteria andCUseridEqualTo(Integer value) {
            addCriterion("c_userid =", value, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridNotEqualTo(Integer value) {
            addCriterion("c_userid <>", value, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridGreaterThan(Integer value) {
            addCriterion("c_userid >", value, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_userid >=", value, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridLessThan(Integer value) {
            addCriterion("c_userid <", value, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridLessThanOrEqualTo(Integer value) {
            addCriterion("c_userid <=", value, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridIn(List<Integer> values) {
            addCriterion("c_userid in", values, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridNotIn(List<Integer> values) {
            addCriterion("c_userid not in", values, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridBetween(Integer value1, Integer value2) {
            addCriterion("c_userid between", value1, value2, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("c_userid not between", value1, value2, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCProvinceIsNull() {
            addCriterion("c_province is null");
            return (Criteria) this;
        }

        public Criteria andCProvinceIsNotNull() {
            addCriterion("c_province is not null");
            return (Criteria) this;
        }

        public Criteria andCProvinceEqualTo(String value) {
            addCriterion("c_province =", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceNotEqualTo(String value) {
            addCriterion("c_province <>", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceGreaterThan(String value) {
            addCriterion("c_province >", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("c_province >=", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceLessThan(String value) {
            addCriterion("c_province <", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceLessThanOrEqualTo(String value) {
            addCriterion("c_province <=", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceLike(String value) {
            addCriterion("c_province like", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceNotLike(String value) {
            addCriterion("c_province not like", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceIn(List<String> values) {
            addCriterion("c_province in", values, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceNotIn(List<String> values) {
            addCriterion("c_province not in", values, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceBetween(String value1, String value2) {
            addCriterion("c_province between", value1, value2, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceNotBetween(String value1, String value2) {
            addCriterion("c_province not between", value1, value2, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCBankadressIsNull() {
            addCriterion("c_bankadress is null");
            return (Criteria) this;
        }

        public Criteria andCBankadressIsNotNull() {
            addCriterion("c_bankadress is not null");
            return (Criteria) this;
        }

        public Criteria andCBankadressEqualTo(String value) {
            addCriterion("c_bankadress =", value, "cBankadress");
            return (Criteria) this;
        }

        public Criteria andCBankadressNotEqualTo(String value) {
            addCriterion("c_bankadress <>", value, "cBankadress");
            return (Criteria) this;
        }

        public Criteria andCBankadressGreaterThan(String value) {
            addCriterion("c_bankadress >", value, "cBankadress");
            return (Criteria) this;
        }

        public Criteria andCBankadressGreaterThanOrEqualTo(String value) {
            addCriterion("c_bankadress >=", value, "cBankadress");
            return (Criteria) this;
        }

        public Criteria andCBankadressLessThan(String value) {
            addCriterion("c_bankadress <", value, "cBankadress");
            return (Criteria) this;
        }

        public Criteria andCBankadressLessThanOrEqualTo(String value) {
            addCriterion("c_bankadress <=", value, "cBankadress");
            return (Criteria) this;
        }

        public Criteria andCBankadressLike(String value) {
            addCriterion("c_bankadress like", value, "cBankadress");
            return (Criteria) this;
        }

        public Criteria andCBankadressNotLike(String value) {
            addCriterion("c_bankadress not like", value, "cBankadress");
            return (Criteria) this;
        }

        public Criteria andCBankadressIn(List<String> values) {
            addCriterion("c_bankadress in", values, "cBankadress");
            return (Criteria) this;
        }

        public Criteria andCBankadressNotIn(List<String> values) {
            addCriterion("c_bankadress not in", values, "cBankadress");
            return (Criteria) this;
        }

        public Criteria andCBankadressBetween(String value1, String value2) {
            addCriterion("c_bankadress between", value1, value2, "cBankadress");
            return (Criteria) this;
        }

        public Criteria andCBankadressNotBetween(String value1, String value2) {
            addCriterion("c_bankadress not between", value1, value2, "cBankadress");
            return (Criteria) this;
        }

        public Criteria andCBanknameIsNull() {
            addCriterion("c_bankname is null");
            return (Criteria) this;
        }

        public Criteria andCBanknameIsNotNull() {
            addCriterion("c_bankname is not null");
            return (Criteria) this;
        }

        public Criteria andCBanknameEqualTo(String value) {
            addCriterion("c_bankname =", value, "cBankname");
            return (Criteria) this;
        }

        public Criteria andCBanknameNotEqualTo(String value) {
            addCriterion("c_bankname <>", value, "cBankname");
            return (Criteria) this;
        }

        public Criteria andCBanknameGreaterThan(String value) {
            addCriterion("c_bankname >", value, "cBankname");
            return (Criteria) this;
        }

        public Criteria andCBanknameGreaterThanOrEqualTo(String value) {
            addCriterion("c_bankname >=", value, "cBankname");
            return (Criteria) this;
        }

        public Criteria andCBanknameLessThan(String value) {
            addCriterion("c_bankname <", value, "cBankname");
            return (Criteria) this;
        }

        public Criteria andCBanknameLessThanOrEqualTo(String value) {
            addCriterion("c_bankname <=", value, "cBankname");
            return (Criteria) this;
        }

        public Criteria andCBanknameLike(String value) {
            addCriterion("c_bankname like", value, "cBankname");
            return (Criteria) this;
        }

        public Criteria andCBanknameNotLike(String value) {
            addCriterion("c_bankname not like", value, "cBankname");
            return (Criteria) this;
        }

        public Criteria andCBanknameIn(List<String> values) {
            addCriterion("c_bankname in", values, "cBankname");
            return (Criteria) this;
        }

        public Criteria andCBanknameNotIn(List<String> values) {
            addCriterion("c_bankname not in", values, "cBankname");
            return (Criteria) this;
        }

        public Criteria andCBanknameBetween(String value1, String value2) {
            addCriterion("c_bankname between", value1, value2, "cBankname");
            return (Criteria) this;
        }

        public Criteria andCBanknameNotBetween(String value1, String value2) {
            addCriterion("c_bankname not between", value1, value2, "cBankname");
            return (Criteria) this;
        }

        public Criteria andCCardnumIsNull() {
            addCriterion("c_cardnum is null");
            return (Criteria) this;
        }

        public Criteria andCCardnumIsNotNull() {
            addCriterion("c_cardnum is not null");
            return (Criteria) this;
        }

        public Criteria andCCardnumEqualTo(String value) {
            addCriterion("c_cardnum =", value, "cCardnum");
            return (Criteria) this;
        }

        public Criteria andCCardnumNotEqualTo(String value) {
            addCriterion("c_cardnum <>", value, "cCardnum");
            return (Criteria) this;
        }

        public Criteria andCCardnumGreaterThan(String value) {
            addCriterion("c_cardnum >", value, "cCardnum");
            return (Criteria) this;
        }

        public Criteria andCCardnumGreaterThanOrEqualTo(String value) {
            addCriterion("c_cardnum >=", value, "cCardnum");
            return (Criteria) this;
        }

        public Criteria andCCardnumLessThan(String value) {
            addCriterion("c_cardnum <", value, "cCardnum");
            return (Criteria) this;
        }

        public Criteria andCCardnumLessThanOrEqualTo(String value) {
            addCriterion("c_cardnum <=", value, "cCardnum");
            return (Criteria) this;
        }

        public Criteria andCCardnumLike(String value) {
            addCriterion("c_cardnum like", value, "cCardnum");
            return (Criteria) this;
        }

        public Criteria andCCardnumNotLike(String value) {
            addCriterion("c_cardnum not like", value, "cCardnum");
            return (Criteria) this;
        }

        public Criteria andCCardnumIn(List<String> values) {
            addCriterion("c_cardnum in", values, "cCardnum");
            return (Criteria) this;
        }

        public Criteria andCCardnumNotIn(List<String> values) {
            addCriterion("c_cardnum not in", values, "cCardnum");
            return (Criteria) this;
        }

        public Criteria andCCardnumBetween(String value1, String value2) {
            addCriterion("c_cardnum between", value1, value2, "cCardnum");
            return (Criteria) this;
        }

        public Criteria andCCardnumNotBetween(String value1, String value2) {
            addCriterion("c_cardnum not between", value1, value2, "cCardnum");
            return (Criteria) this;
        }

        public Criteria andCPaypasswordIsNull() {
            addCriterion("c_paypassword is null");
            return (Criteria) this;
        }

        public Criteria andCPaypasswordIsNotNull() {
            addCriterion("c_paypassword is not null");
            return (Criteria) this;
        }

        public Criteria andCPaypasswordEqualTo(String value) {
            addCriterion("c_paypassword =", value, "cPaypassword");
            return (Criteria) this;
        }

        public Criteria andCPaypasswordNotEqualTo(String value) {
            addCriterion("c_paypassword <>", value, "cPaypassword");
            return (Criteria) this;
        }

        public Criteria andCPaypasswordGreaterThan(String value) {
            addCriterion("c_paypassword >", value, "cPaypassword");
            return (Criteria) this;
        }

        public Criteria andCPaypasswordGreaterThanOrEqualTo(String value) {
            addCriterion("c_paypassword >=", value, "cPaypassword");
            return (Criteria) this;
        }

        public Criteria andCPaypasswordLessThan(String value) {
            addCriterion("c_paypassword <", value, "cPaypassword");
            return (Criteria) this;
        }

        public Criteria andCPaypasswordLessThanOrEqualTo(String value) {
            addCriterion("c_paypassword <=", value, "cPaypassword");
            return (Criteria) this;
        }

        public Criteria andCPaypasswordLike(String value) {
            addCriterion("c_paypassword like", value, "cPaypassword");
            return (Criteria) this;
        }

        public Criteria andCPaypasswordNotLike(String value) {
            addCriterion("c_paypassword not like", value, "cPaypassword");
            return (Criteria) this;
        }

        public Criteria andCPaypasswordIn(List<String> values) {
            addCriterion("c_paypassword in", values, "cPaypassword");
            return (Criteria) this;
        }

        public Criteria andCPaypasswordNotIn(List<String> values) {
            addCriterion("c_paypassword not in", values, "cPaypassword");
            return (Criteria) this;
        }

        public Criteria andCPaypasswordBetween(String value1, String value2) {
            addCriterion("c_paypassword between", value1, value2, "cPaypassword");
            return (Criteria) this;
        }

        public Criteria andCPaypasswordNotBetween(String value1, String value2) {
            addCriterion("c_paypassword not between", value1, value2, "cPaypassword");
            return (Criteria) this;
        }

        public Criteria andCPhoneIsNull() {
            addCriterion("c_phone is null");
            return (Criteria) this;
        }

        public Criteria andCPhoneIsNotNull() {
            addCriterion("c_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCPhoneEqualTo(String value) {
            addCriterion("c_phone =", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneNotEqualTo(String value) {
            addCriterion("c_phone <>", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneGreaterThan(String value) {
            addCriterion("c_phone >", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("c_phone >=", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneLessThan(String value) {
            addCriterion("c_phone <", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneLessThanOrEqualTo(String value) {
            addCriterion("c_phone <=", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneLike(String value) {
            addCriterion("c_phone like", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneNotLike(String value) {
            addCriterion("c_phone not like", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneIn(List<String> values) {
            addCriterion("c_phone in", values, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneNotIn(List<String> values) {
            addCriterion("c_phone not in", values, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneBetween(String value1, String value2) {
            addCriterion("c_phone between", value1, value2, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneNotBetween(String value1, String value2) {
            addCriterion("c_phone not between", value1, value2, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCUrealnameIsNull() {
            addCriterion("c_urealname is null");
            return (Criteria) this;
        }

        public Criteria andCUrealnameIsNotNull() {
            addCriterion("c_urealname is not null");
            return (Criteria) this;
        }

        public Criteria andCUrealnameEqualTo(String value) {
            addCriterion("c_urealname =", value, "cUrealname");
            return (Criteria) this;
        }

        public Criteria andCUrealnameNotEqualTo(String value) {
            addCriterion("c_urealname <>", value, "cUrealname");
            return (Criteria) this;
        }

        public Criteria andCUrealnameGreaterThan(String value) {
            addCriterion("c_urealname >", value, "cUrealname");
            return (Criteria) this;
        }

        public Criteria andCUrealnameGreaterThanOrEqualTo(String value) {
            addCriterion("c_urealname >=", value, "cUrealname");
            return (Criteria) this;
        }

        public Criteria andCUrealnameLessThan(String value) {
            addCriterion("c_urealname <", value, "cUrealname");
            return (Criteria) this;
        }

        public Criteria andCUrealnameLessThanOrEqualTo(String value) {
            addCriterion("c_urealname <=", value, "cUrealname");
            return (Criteria) this;
        }

        public Criteria andCUrealnameLike(String value) {
            addCriterion("c_urealname like", value, "cUrealname");
            return (Criteria) this;
        }

        public Criteria andCUrealnameNotLike(String value) {
            addCriterion("c_urealname not like", value, "cUrealname");
            return (Criteria) this;
        }

        public Criteria andCUrealnameIn(List<String> values) {
            addCriterion("c_urealname in", values, "cUrealname");
            return (Criteria) this;
        }

        public Criteria andCUrealnameNotIn(List<String> values) {
            addCriterion("c_urealname not in", values, "cUrealname");
            return (Criteria) this;
        }

        public Criteria andCUrealnameBetween(String value1, String value2) {
            addCriterion("c_urealname between", value1, value2, "cUrealname");
            return (Criteria) this;
        }

        public Criteria andCUrealnameNotBetween(String value1, String value2) {
            addCriterion("c_urealname not between", value1, value2, "cUrealname");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}