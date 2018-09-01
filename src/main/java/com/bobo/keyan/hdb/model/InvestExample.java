package com.bobo.keyan.hdb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InvestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InvestExample() {
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

        public Criteria andIIdIsNull() {
            addCriterion("i_id is null");
            return (Criteria) this;
        }

        public Criteria andIIdIsNotNull() {
            addCriterion("i_id is not null");
            return (Criteria) this;
        }

        public Criteria andIIdEqualTo(Integer value) {
            addCriterion("i_id =", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdNotEqualTo(Integer value) {
            addCriterion("i_id <>", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdGreaterThan(Integer value) {
            addCriterion("i_id >", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_id >=", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdLessThan(Integer value) {
            addCriterion("i_id <", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdLessThanOrEqualTo(Integer value) {
            addCriterion("i_id <=", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdIn(List<Integer> values) {
            addCriterion("i_id in", values, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdNotIn(List<Integer> values) {
            addCriterion("i_id not in", values, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdBetween(Integer value1, Integer value2) {
            addCriterion("i_id between", value1, value2, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdNotBetween(Integer value1, Integer value2) {
            addCriterion("i_id not between", value1, value2, "iId");
            return (Criteria) this;
        }

        public Criteria andIUseridIsNull() {
            addCriterion("i_userid is null");
            return (Criteria) this;
        }

        public Criteria andIUseridIsNotNull() {
            addCriterion("i_userid is not null");
            return (Criteria) this;
        }

        public Criteria andIUseridEqualTo(Integer value) {
            addCriterion("i_userid =", value, "iUserid");
            return (Criteria) this;
        }

        public Criteria andIUseridNotEqualTo(Integer value) {
            addCriterion("i_userid <>", value, "iUserid");
            return (Criteria) this;
        }

        public Criteria andIUseridGreaterThan(Integer value) {
            addCriterion("i_userid >", value, "iUserid");
            return (Criteria) this;
        }

        public Criteria andIUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_userid >=", value, "iUserid");
            return (Criteria) this;
        }

        public Criteria andIUseridLessThan(Integer value) {
            addCriterion("i_userid <", value, "iUserid");
            return (Criteria) this;
        }

        public Criteria andIUseridLessThanOrEqualTo(Integer value) {
            addCriterion("i_userid <=", value, "iUserid");
            return (Criteria) this;
        }

        public Criteria andIUseridIn(List<Integer> values) {
            addCriterion("i_userid in", values, "iUserid");
            return (Criteria) this;
        }

        public Criteria andIUseridNotIn(List<Integer> values) {
            addCriterion("i_userid not in", values, "iUserid");
            return (Criteria) this;
        }

        public Criteria andIUseridBetween(Integer value1, Integer value2) {
            addCriterion("i_userid between", value1, value2, "iUserid");
            return (Criteria) this;
        }

        public Criteria andIUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("i_userid not between", value1, value2, "iUserid");
            return (Criteria) this;
        }

        public Criteria andIProjectidIsNull() {
            addCriterion("i_projectid is null");
            return (Criteria) this;
        }

        public Criteria andIProjectidIsNotNull() {
            addCriterion("i_projectid is not null");
            return (Criteria) this;
        }

        public Criteria andIProjectidEqualTo(Integer value) {
            addCriterion("i_projectid =", value, "iProjectid");
            return (Criteria) this;
        }

        public Criteria andIProjectidNotEqualTo(Integer value) {
            addCriterion("i_projectid <>", value, "iProjectid");
            return (Criteria) this;
        }

        public Criteria andIProjectidGreaterThan(Integer value) {
            addCriterion("i_projectid >", value, "iProjectid");
            return (Criteria) this;
        }

        public Criteria andIProjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_projectid >=", value, "iProjectid");
            return (Criteria) this;
        }

        public Criteria andIProjectidLessThan(Integer value) {
            addCriterion("i_projectid <", value, "iProjectid");
            return (Criteria) this;
        }

        public Criteria andIProjectidLessThanOrEqualTo(Integer value) {
            addCriterion("i_projectid <=", value, "iProjectid");
            return (Criteria) this;
        }

        public Criteria andIProjectidIn(List<Integer> values) {
            addCriterion("i_projectid in", values, "iProjectid");
            return (Criteria) this;
        }

        public Criteria andIProjectidNotIn(List<Integer> values) {
            addCriterion("i_projectid not in", values, "iProjectid");
            return (Criteria) this;
        }

        public Criteria andIProjectidBetween(Integer value1, Integer value2) {
            addCriterion("i_projectid between", value1, value2, "iProjectid");
            return (Criteria) this;
        }

        public Criteria andIProjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("i_projectid not between", value1, value2, "iProjectid");
            return (Criteria) this;
        }

        public Criteria andIDatetimeIsNull() {
            addCriterion("i_datetime is null");
            return (Criteria) this;
        }

        public Criteria andIDatetimeIsNotNull() {
            addCriterion("i_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andIDatetimeEqualTo(Date value) {
            addCriterion("i_datetime =", value, "iDatetime");
            return (Criteria) this;
        }

        public Criteria andIDatetimeNotEqualTo(Date value) {
            addCriterion("i_datetime <>", value, "iDatetime");
            return (Criteria) this;
        }

        public Criteria andIDatetimeGreaterThan(Date value) {
            addCriterion("i_datetime >", value, "iDatetime");
            return (Criteria) this;
        }

        public Criteria andIDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("i_datetime >=", value, "iDatetime");
            return (Criteria) this;
        }

        public Criteria andIDatetimeLessThan(Date value) {
            addCriterion("i_datetime <", value, "iDatetime");
            return (Criteria) this;
        }

        public Criteria andIDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("i_datetime <=", value, "iDatetime");
            return (Criteria) this;
        }

        public Criteria andIDatetimeIn(List<Date> values) {
            addCriterion("i_datetime in", values, "iDatetime");
            return (Criteria) this;
        }

        public Criteria andIDatetimeNotIn(List<Date> values) {
            addCriterion("i_datetime not in", values, "iDatetime");
            return (Criteria) this;
        }

        public Criteria andIDatetimeBetween(Date value1, Date value2) {
            addCriterion("i_datetime between", value1, value2, "iDatetime");
            return (Criteria) this;
        }

        public Criteria andIDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("i_datetime not between", value1, value2, "iDatetime");
            return (Criteria) this;
        }

        public Criteria andIAmountIsNull() {
            addCriterion("i_amount is null");
            return (Criteria) this;
        }

        public Criteria andIAmountIsNotNull() {
            addCriterion("i_amount is not null");
            return (Criteria) this;
        }

        public Criteria andIAmountEqualTo(Long value) {
            addCriterion("i_amount =", value, "iAmount");
            return (Criteria) this;
        }

        public Criteria andIAmountNotEqualTo(Long value) {
            addCriterion("i_amount <>", value, "iAmount");
            return (Criteria) this;
        }

        public Criteria andIAmountGreaterThan(Long value) {
            addCriterion("i_amount >", value, "iAmount");
            return (Criteria) this;
        }

        public Criteria andIAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("i_amount >=", value, "iAmount");
            return (Criteria) this;
        }

        public Criteria andIAmountLessThan(Long value) {
            addCriterion("i_amount <", value, "iAmount");
            return (Criteria) this;
        }

        public Criteria andIAmountLessThanOrEqualTo(Long value) {
            addCriterion("i_amount <=", value, "iAmount");
            return (Criteria) this;
        }

        public Criteria andIAmountIn(List<Long> values) {
            addCriterion("i_amount in", values, "iAmount");
            return (Criteria) this;
        }

        public Criteria andIAmountNotIn(List<Long> values) {
            addCriterion("i_amount not in", values, "iAmount");
            return (Criteria) this;
        }

        public Criteria andIAmountBetween(Long value1, Long value2) {
            addCriterion("i_amount between", value1, value2, "iAmount");
            return (Criteria) this;
        }

        public Criteria andIAmountNotBetween(Long value1, Long value2) {
            addCriterion("i_amount not between", value1, value2, "iAmount");
            return (Criteria) this;
        }

        public Criteria andIStateIsNull() {
            addCriterion("i_state is null");
            return (Criteria) this;
        }

        public Criteria andIStateIsNotNull() {
            addCriterion("i_state is not null");
            return (Criteria) this;
        }

        public Criteria andIStateEqualTo(String value) {
            addCriterion("i_state =", value, "iState");
            return (Criteria) this;
        }

        public Criteria andIStateNotEqualTo(String value) {
            addCriterion("i_state <>", value, "iState");
            return (Criteria) this;
        }

        public Criteria andIStateGreaterThan(String value) {
            addCriterion("i_state >", value, "iState");
            return (Criteria) this;
        }

        public Criteria andIStateGreaterThanOrEqualTo(String value) {
            addCriterion("i_state >=", value, "iState");
            return (Criteria) this;
        }

        public Criteria andIStateLessThan(String value) {
            addCriterion("i_state <", value, "iState");
            return (Criteria) this;
        }

        public Criteria andIStateLessThanOrEqualTo(String value) {
            addCriterion("i_state <=", value, "iState");
            return (Criteria) this;
        }

        public Criteria andIStateLike(String value) {
            addCriterion("i_state like", value, "iState");
            return (Criteria) this;
        }

        public Criteria andIStateNotLike(String value) {
            addCriterion("i_state not like", value, "iState");
            return (Criteria) this;
        }

        public Criteria andIStateIn(List<String> values) {
            addCriterion("i_state in", values, "iState");
            return (Criteria) this;
        }

        public Criteria andIStateNotIn(List<String> values) {
            addCriterion("i_state not in", values, "iState");
            return (Criteria) this;
        }

        public Criteria andIStateBetween(String value1, String value2) {
            addCriterion("i_state between", value1, value2, "iState");
            return (Criteria) this;
        }

        public Criteria andIStateNotBetween(String value1, String value2) {
            addCriterion("i_state not between", value1, value2, "iState");
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