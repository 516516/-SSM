package com.bobo.keyan.hdb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuditeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuditeExample() {
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

        public Criteria andAIdIsNull() {
            addCriterion("a_id is null");
            return (Criteria) this;
        }

        public Criteria andAIdIsNotNull() {
            addCriterion("a_id is not null");
            return (Criteria) this;
        }

        public Criteria andAIdEqualTo(Integer value) {
            addCriterion("a_id =", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotEqualTo(Integer value) {
            addCriterion("a_id <>", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThan(Integer value) {
            addCriterion("a_id >", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_id >=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThan(Integer value) {
            addCriterion("a_id <", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThanOrEqualTo(Integer value) {
            addCriterion("a_id <=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdIn(List<Integer> values) {
            addCriterion("a_id in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotIn(List<Integer> values) {
            addCriterion("a_id not in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdBetween(Integer value1, Integer value2) {
            addCriterion("a_id between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotBetween(Integer value1, Integer value2) {
            addCriterion("a_id not between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAUseridIsNull() {
            addCriterion("a_userid is null");
            return (Criteria) this;
        }

        public Criteria andAUseridIsNotNull() {
            addCriterion("a_userid is not null");
            return (Criteria) this;
        }

        public Criteria andAUseridEqualTo(Integer value) {
            addCriterion("a_userid =", value, "aUserid");
            return (Criteria) this;
        }

        public Criteria andAUseridNotEqualTo(Integer value) {
            addCriterion("a_userid <>", value, "aUserid");
            return (Criteria) this;
        }

        public Criteria andAUseridGreaterThan(Integer value) {
            addCriterion("a_userid >", value, "aUserid");
            return (Criteria) this;
        }

        public Criteria andAUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_userid >=", value, "aUserid");
            return (Criteria) this;
        }

        public Criteria andAUseridLessThan(Integer value) {
            addCriterion("a_userid <", value, "aUserid");
            return (Criteria) this;
        }

        public Criteria andAUseridLessThanOrEqualTo(Integer value) {
            addCriterion("a_userid <=", value, "aUserid");
            return (Criteria) this;
        }

        public Criteria andAUseridIn(List<Integer> values) {
            addCriterion("a_userid in", values, "aUserid");
            return (Criteria) this;
        }

        public Criteria andAUseridNotIn(List<Integer> values) {
            addCriterion("a_userid not in", values, "aUserid");
            return (Criteria) this;
        }

        public Criteria andAUseridBetween(Integer value1, Integer value2) {
            addCriterion("a_userid between", value1, value2, "aUserid");
            return (Criteria) this;
        }

        public Criteria andAUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("a_userid not between", value1, value2, "aUserid");
            return (Criteria) this;
        }

        public Criteria andAAmountIsNull() {
            addCriterion("a_amount is null");
            return (Criteria) this;
        }

        public Criteria andAAmountIsNotNull() {
            addCriterion("a_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAAmountEqualTo(Long value) {
            addCriterion("a_amount =", value, "aAmount");
            return (Criteria) this;
        }

        public Criteria andAAmountNotEqualTo(Long value) {
            addCriterion("a_amount <>", value, "aAmount");
            return (Criteria) this;
        }

        public Criteria andAAmountGreaterThan(Long value) {
            addCriterion("a_amount >", value, "aAmount");
            return (Criteria) this;
        }

        public Criteria andAAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("a_amount >=", value, "aAmount");
            return (Criteria) this;
        }

        public Criteria andAAmountLessThan(Long value) {
            addCriterion("a_amount <", value, "aAmount");
            return (Criteria) this;
        }

        public Criteria andAAmountLessThanOrEqualTo(Long value) {
            addCriterion("a_amount <=", value, "aAmount");
            return (Criteria) this;
        }

        public Criteria andAAmountIn(List<Long> values) {
            addCriterion("a_amount in", values, "aAmount");
            return (Criteria) this;
        }

        public Criteria andAAmountNotIn(List<Long> values) {
            addCriterion("a_amount not in", values, "aAmount");
            return (Criteria) this;
        }

        public Criteria andAAmountBetween(Long value1, Long value2) {
            addCriterion("a_amount between", value1, value2, "aAmount");
            return (Criteria) this;
        }

        public Criteria andAAmountNotBetween(Long value1, Long value2) {
            addCriterion("a_amount not between", value1, value2, "aAmount");
            return (Criteria) this;
        }

        public Criteria andADatelineIsNull() {
            addCriterion("a_dateline is null");
            return (Criteria) this;
        }

        public Criteria andADatelineIsNotNull() {
            addCriterion("a_dateline is not null");
            return (Criteria) this;
        }

        public Criteria andADatelineEqualTo(Date value) {
            addCriterion("a_dateline =", value, "aDateline");
            return (Criteria) this;
        }

        public Criteria andADatelineNotEqualTo(Date value) {
            addCriterion("a_dateline <>", value, "aDateline");
            return (Criteria) this;
        }

        public Criteria andADatelineGreaterThan(Date value) {
            addCriterion("a_dateline >", value, "aDateline");
            return (Criteria) this;
        }

        public Criteria andADatelineGreaterThanOrEqualTo(Date value) {
            addCriterion("a_dateline >=", value, "aDateline");
            return (Criteria) this;
        }

        public Criteria andADatelineLessThan(Date value) {
            addCriterion("a_dateline <", value, "aDateline");
            return (Criteria) this;
        }

        public Criteria andADatelineLessThanOrEqualTo(Date value) {
            addCriterion("a_dateline <=", value, "aDateline");
            return (Criteria) this;
        }

        public Criteria andADatelineIn(List<Date> values) {
            addCriterion("a_dateline in", values, "aDateline");
            return (Criteria) this;
        }

        public Criteria andADatelineNotIn(List<Date> values) {
            addCriterion("a_dateline not in", values, "aDateline");
            return (Criteria) this;
        }

        public Criteria andADatelineBetween(Date value1, Date value2) {
            addCriterion("a_dateline between", value1, value2, "aDateline");
            return (Criteria) this;
        }

        public Criteria andADatelineNotBetween(Date value1, Date value2) {
            addCriterion("a_dateline not between", value1, value2, "aDateline");
            return (Criteria) this;
        }

        public Criteria andAInterestIsNull() {
            addCriterion("a_interest is null");
            return (Criteria) this;
        }

        public Criteria andAInterestIsNotNull() {
            addCriterion("a_interest is not null");
            return (Criteria) this;
        }

        public Criteria andAInterestEqualTo(Long value) {
            addCriterion("a_interest =", value, "aInterest");
            return (Criteria) this;
        }

        public Criteria andAInterestNotEqualTo(Long value) {
            addCriterion("a_interest <>", value, "aInterest");
            return (Criteria) this;
        }

        public Criteria andAInterestGreaterThan(Long value) {
            addCriterion("a_interest >", value, "aInterest");
            return (Criteria) this;
        }

        public Criteria andAInterestGreaterThanOrEqualTo(Long value) {
            addCriterion("a_interest >=", value, "aInterest");
            return (Criteria) this;
        }

        public Criteria andAInterestLessThan(Long value) {
            addCriterion("a_interest <", value, "aInterest");
            return (Criteria) this;
        }

        public Criteria andAInterestLessThanOrEqualTo(Long value) {
            addCriterion("a_interest <=", value, "aInterest");
            return (Criteria) this;
        }

        public Criteria andAInterestIn(List<Long> values) {
            addCriterion("a_interest in", values, "aInterest");
            return (Criteria) this;
        }

        public Criteria andAInterestNotIn(List<Long> values) {
            addCriterion("a_interest not in", values, "aInterest");
            return (Criteria) this;
        }

        public Criteria andAInterestBetween(Long value1, Long value2) {
            addCriterion("a_interest between", value1, value2, "aInterest");
            return (Criteria) this;
        }

        public Criteria andAInterestNotBetween(Long value1, Long value2) {
            addCriterion("a_interest not between", value1, value2, "aInterest");
            return (Criteria) this;
        }

        public Criteria andAApplytimeIsNull() {
            addCriterion("a_applytime is null");
            return (Criteria) this;
        }

        public Criteria andAApplytimeIsNotNull() {
            addCriterion("a_applytime is not null");
            return (Criteria) this;
        }

        public Criteria andAApplytimeEqualTo(Date value) {
            addCriterion("a_applytime =", value, "aApplytime");
            return (Criteria) this;
        }

        public Criteria andAApplytimeNotEqualTo(Date value) {
            addCriterion("a_applytime <>", value, "aApplytime");
            return (Criteria) this;
        }

        public Criteria andAApplytimeGreaterThan(Date value) {
            addCriterion("a_applytime >", value, "aApplytime");
            return (Criteria) this;
        }

        public Criteria andAApplytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("a_applytime >=", value, "aApplytime");
            return (Criteria) this;
        }

        public Criteria andAApplytimeLessThan(Date value) {
            addCriterion("a_applytime <", value, "aApplytime");
            return (Criteria) this;
        }

        public Criteria andAApplytimeLessThanOrEqualTo(Date value) {
            addCriterion("a_applytime <=", value, "aApplytime");
            return (Criteria) this;
        }

        public Criteria andAApplytimeIn(List<Date> values) {
            addCriterion("a_applytime in", values, "aApplytime");
            return (Criteria) this;
        }

        public Criteria andAApplytimeNotIn(List<Date> values) {
            addCriterion("a_applytime not in", values, "aApplytime");
            return (Criteria) this;
        }

        public Criteria andAApplytimeBetween(Date value1, Date value2) {
            addCriterion("a_applytime between", value1, value2, "aApplytime");
            return (Criteria) this;
        }

        public Criteria andAApplytimeNotBetween(Date value1, Date value2) {
            addCriterion("a_applytime not between", value1, value2, "aApplytime");
            return (Criteria) this;
        }

        public Criteria andAStateIsNull() {
            addCriterion("a_state is null");
            return (Criteria) this;
        }

        public Criteria andAStateIsNotNull() {
            addCriterion("a_state is not null");
            return (Criteria) this;
        }

        public Criteria andAStateEqualTo(String value) {
            addCriterion("a_state =", value, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateNotEqualTo(String value) {
            addCriterion("a_state <>", value, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateGreaterThan(String value) {
            addCriterion("a_state >", value, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateGreaterThanOrEqualTo(String value) {
            addCriterion("a_state >=", value, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateLessThan(String value) {
            addCriterion("a_state <", value, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateLessThanOrEqualTo(String value) {
            addCriterion("a_state <=", value, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateLike(String value) {
            addCriterion("a_state like", value, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateNotLike(String value) {
            addCriterion("a_state not like", value, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateIn(List<String> values) {
            addCriterion("a_state in", values, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateNotIn(List<String> values) {
            addCriterion("a_state not in", values, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateBetween(String value1, String value2) {
            addCriterion("a_state between", value1, value2, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateNotBetween(String value1, String value2) {
            addCriterion("a_state not between", value1, value2, "aState");
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