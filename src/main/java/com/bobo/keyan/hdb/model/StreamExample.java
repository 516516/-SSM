package com.bobo.keyan.hdb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StreamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StreamExample() {
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

        public Criteria andSIdIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(Integer value) {
            addCriterion("s_id =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(Integer value) {
            addCriterion("s_id <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(Integer value) {
            addCriterion("s_id >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_id >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(Integer value) {
            addCriterion("s_id <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(Integer value) {
            addCriterion("s_id <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<Integer> values) {
            addCriterion("s_id in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<Integer> values) {
            addCriterion("s_id not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(Integer value1, Integer value2) {
            addCriterion("s_id between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(Integer value1, Integer value2) {
            addCriterion("s_id not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSProjectidIsNull() {
            addCriterion("s_projectid is null");
            return (Criteria) this;
        }

        public Criteria andSProjectidIsNotNull() {
            addCriterion("s_projectid is not null");
            return (Criteria) this;
        }

        public Criteria andSProjectidEqualTo(Integer value) {
            addCriterion("s_projectid =", value, "sProjectid");
            return (Criteria) this;
        }

        public Criteria andSProjectidNotEqualTo(Integer value) {
            addCriterion("s_projectid <>", value, "sProjectid");
            return (Criteria) this;
        }

        public Criteria andSProjectidGreaterThan(Integer value) {
            addCriterion("s_projectid >", value, "sProjectid");
            return (Criteria) this;
        }

        public Criteria andSProjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_projectid >=", value, "sProjectid");
            return (Criteria) this;
        }

        public Criteria andSProjectidLessThan(Integer value) {
            addCriterion("s_projectid <", value, "sProjectid");
            return (Criteria) this;
        }

        public Criteria andSProjectidLessThanOrEqualTo(Integer value) {
            addCriterion("s_projectid <=", value, "sProjectid");
            return (Criteria) this;
        }

        public Criteria andSProjectidIn(List<Integer> values) {
            addCriterion("s_projectid in", values, "sProjectid");
            return (Criteria) this;
        }

        public Criteria andSProjectidNotIn(List<Integer> values) {
            addCriterion("s_projectid not in", values, "sProjectid");
            return (Criteria) this;
        }

        public Criteria andSProjectidBetween(Integer value1, Integer value2) {
            addCriterion("s_projectid between", value1, value2, "sProjectid");
            return (Criteria) this;
        }

        public Criteria andSProjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("s_projectid not between", value1, value2, "sProjectid");
            return (Criteria) this;
        }

        public Criteria andSUseridIsNull() {
            addCriterion("s_userid is null");
            return (Criteria) this;
        }

        public Criteria andSUseridIsNotNull() {
            addCriterion("s_userid is not null");
            return (Criteria) this;
        }

        public Criteria andSUseridEqualTo(Integer value) {
            addCriterion("s_userid =", value, "sUserid");
            return (Criteria) this;
        }

        public Criteria andSUseridNotEqualTo(Integer value) {
            addCriterion("s_userid <>", value, "sUserid");
            return (Criteria) this;
        }

        public Criteria andSUseridGreaterThan(Integer value) {
            addCriterion("s_userid >", value, "sUserid");
            return (Criteria) this;
        }

        public Criteria andSUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_userid >=", value, "sUserid");
            return (Criteria) this;
        }

        public Criteria andSUseridLessThan(Integer value) {
            addCriterion("s_userid <", value, "sUserid");
            return (Criteria) this;
        }

        public Criteria andSUseridLessThanOrEqualTo(Integer value) {
            addCriterion("s_userid <=", value, "sUserid");
            return (Criteria) this;
        }

        public Criteria andSUseridIn(List<Integer> values) {
            addCriterion("s_userid in", values, "sUserid");
            return (Criteria) this;
        }

        public Criteria andSUseridNotIn(List<Integer> values) {
            addCriterion("s_userid not in", values, "sUserid");
            return (Criteria) this;
        }

        public Criteria andSUseridBetween(Integer value1, Integer value2) {
            addCriterion("s_userid between", value1, value2, "sUserid");
            return (Criteria) this;
        }

        public Criteria andSUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("s_userid not between", value1, value2, "sUserid");
            return (Criteria) this;
        }

        public Criteria andSTypeIsNull() {
            addCriterion("s_type is null");
            return (Criteria) this;
        }

        public Criteria andSTypeIsNotNull() {
            addCriterion("s_type is not null");
            return (Criteria) this;
        }

        public Criteria andSTypeEqualTo(String value) {
            addCriterion("s_type =", value, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeNotEqualTo(String value) {
            addCriterion("s_type <>", value, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeGreaterThan(String value) {
            addCriterion("s_type >", value, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeGreaterThanOrEqualTo(String value) {
            addCriterion("s_type >=", value, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeLessThan(String value) {
            addCriterion("s_type <", value, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeLessThanOrEqualTo(String value) {
            addCriterion("s_type <=", value, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeLike(String value) {
            addCriterion("s_type like", value, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeNotLike(String value) {
            addCriterion("s_type not like", value, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeIn(List<String> values) {
            addCriterion("s_type in", values, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeNotIn(List<String> values) {
            addCriterion("s_type not in", values, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeBetween(String value1, String value2) {
            addCriterion("s_type between", value1, value2, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeNotBetween(String value1, String value2) {
            addCriterion("s_type not between", value1, value2, "sType");
            return (Criteria) this;
        }

        public Criteria andSAmountIsNull() {
            addCriterion("s_amount is null");
            return (Criteria) this;
        }

        public Criteria andSAmountIsNotNull() {
            addCriterion("s_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSAmountEqualTo(Long value) {
            addCriterion("s_amount =", value, "sAmount");
            return (Criteria) this;
        }

        public Criteria andSAmountNotEqualTo(Long value) {
            addCriterion("s_amount <>", value, "sAmount");
            return (Criteria) this;
        }

        public Criteria andSAmountGreaterThan(Long value) {
            addCriterion("s_amount >", value, "sAmount");
            return (Criteria) this;
        }

        public Criteria andSAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("s_amount >=", value, "sAmount");
            return (Criteria) this;
        }

        public Criteria andSAmountLessThan(Long value) {
            addCriterion("s_amount <", value, "sAmount");
            return (Criteria) this;
        }

        public Criteria andSAmountLessThanOrEqualTo(Long value) {
            addCriterion("s_amount <=", value, "sAmount");
            return (Criteria) this;
        }

        public Criteria andSAmountIn(List<Long> values) {
            addCriterion("s_amount in", values, "sAmount");
            return (Criteria) this;
        }

        public Criteria andSAmountNotIn(List<Long> values) {
            addCriterion("s_amount not in", values, "sAmount");
            return (Criteria) this;
        }

        public Criteria andSAmountBetween(Long value1, Long value2) {
            addCriterion("s_amount between", value1, value2, "sAmount");
            return (Criteria) this;
        }

        public Criteria andSAmountNotBetween(Long value1, Long value2) {
            addCriterion("s_amount not between", value1, value2, "sAmount");
            return (Criteria) this;
        }

        public Criteria andSTimeIsNull() {
            addCriterion("s_time is null");
            return (Criteria) this;
        }

        public Criteria andSTimeIsNotNull() {
            addCriterion("s_time is not null");
            return (Criteria) this;
        }

        public Criteria andSTimeEqualTo(Date value) {
            addCriterion("s_time =", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeNotEqualTo(Date value) {
            addCriterion("s_time <>", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeGreaterThan(Date value) {
            addCriterion("s_time >", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("s_time >=", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeLessThan(Date value) {
            addCriterion("s_time <", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeLessThanOrEqualTo(Date value) {
            addCriterion("s_time <=", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeIn(List<Date> values) {
            addCriterion("s_time in", values, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeNotIn(List<Date> values) {
            addCriterion("s_time not in", values, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeBetween(Date value1, Date value2) {
            addCriterion("s_time between", value1, value2, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeNotBetween(Date value1, Date value2) {
            addCriterion("s_time not between", value1, value2, "sTime");
            return (Criteria) this;
        }

        public Criteria andSInvestidIsNull() {
            addCriterion("s_investid is null");
            return (Criteria) this;
        }

        public Criteria andSInvestidIsNotNull() {
            addCriterion("s_investid is not null");
            return (Criteria) this;
        }

        public Criteria andSInvestidEqualTo(Integer value) {
            addCriterion("s_investid =", value, "sInvestid");
            return (Criteria) this;
        }

        public Criteria andSInvestidNotEqualTo(Integer value) {
            addCriterion("s_investid <>", value, "sInvestid");
            return (Criteria) this;
        }

        public Criteria andSInvestidGreaterThan(Integer value) {
            addCriterion("s_investid >", value, "sInvestid");
            return (Criteria) this;
        }

        public Criteria andSInvestidGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_investid >=", value, "sInvestid");
            return (Criteria) this;
        }

        public Criteria andSInvestidLessThan(Integer value) {
            addCriterion("s_investid <", value, "sInvestid");
            return (Criteria) this;
        }

        public Criteria andSInvestidLessThanOrEqualTo(Integer value) {
            addCriterion("s_investid <=", value, "sInvestid");
            return (Criteria) this;
        }

        public Criteria andSInvestidIn(List<Integer> values) {
            addCriterion("s_investid in", values, "sInvestid");
            return (Criteria) this;
        }

        public Criteria andSInvestidNotIn(List<Integer> values) {
            addCriterion("s_investid not in", values, "sInvestid");
            return (Criteria) this;
        }

        public Criteria andSInvestidBetween(Integer value1, Integer value2) {
            addCriterion("s_investid between", value1, value2, "sInvestid");
            return (Criteria) this;
        }

        public Criteria andSInvestidNotBetween(Integer value1, Integer value2) {
            addCriterion("s_investid not between", value1, value2, "sInvestid");
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