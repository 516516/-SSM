package com.bobo.keyan.hdb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
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

        public Criteria andAtcIdIsNull() {
            addCriterion("atc_id is null");
            return (Criteria) this;
        }

        public Criteria andAtcIdIsNotNull() {
            addCriterion("atc_id is not null");
            return (Criteria) this;
        }

        public Criteria andAtcIdEqualTo(Integer value) {
            addCriterion("atc_id =", value, "atcId");
            return (Criteria) this;
        }

        public Criteria andAtcIdNotEqualTo(Integer value) {
            addCriterion("atc_id <>", value, "atcId");
            return (Criteria) this;
        }

        public Criteria andAtcIdGreaterThan(Integer value) {
            addCriterion("atc_id >", value, "atcId");
            return (Criteria) this;
        }

        public Criteria andAtcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("atc_id >=", value, "atcId");
            return (Criteria) this;
        }

        public Criteria andAtcIdLessThan(Integer value) {
            addCriterion("atc_id <", value, "atcId");
            return (Criteria) this;
        }

        public Criteria andAtcIdLessThanOrEqualTo(Integer value) {
            addCriterion("atc_id <=", value, "atcId");
            return (Criteria) this;
        }

        public Criteria andAtcIdIn(List<Integer> values) {
            addCriterion("atc_id in", values, "atcId");
            return (Criteria) this;
        }

        public Criteria andAtcIdNotIn(List<Integer> values) {
            addCriterion("atc_id not in", values, "atcId");
            return (Criteria) this;
        }

        public Criteria andAtcIdBetween(Integer value1, Integer value2) {
            addCriterion("atc_id between", value1, value2, "atcId");
            return (Criteria) this;
        }

        public Criteria andAtcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("atc_id not between", value1, value2, "atcId");
            return (Criteria) this;
        }

        public Criteria andAtcTypeIsNull() {
            addCriterion("atc_type is null");
            return (Criteria) this;
        }

        public Criteria andAtcTypeIsNotNull() {
            addCriterion("atc_type is not null");
            return (Criteria) this;
        }

        public Criteria andAtcTypeEqualTo(String value) {
            addCriterion("atc_type =", value, "atcType");
            return (Criteria) this;
        }

        public Criteria andAtcTypeNotEqualTo(String value) {
            addCriterion("atc_type <>", value, "atcType");
            return (Criteria) this;
        }

        public Criteria andAtcTypeGreaterThan(String value) {
            addCriterion("atc_type >", value, "atcType");
            return (Criteria) this;
        }

        public Criteria andAtcTypeGreaterThanOrEqualTo(String value) {
            addCriterion("atc_type >=", value, "atcType");
            return (Criteria) this;
        }

        public Criteria andAtcTypeLessThan(String value) {
            addCriterion("atc_type <", value, "atcType");
            return (Criteria) this;
        }

        public Criteria andAtcTypeLessThanOrEqualTo(String value) {
            addCriterion("atc_type <=", value, "atcType");
            return (Criteria) this;
        }

        public Criteria andAtcTypeLike(String value) {
            addCriterion("atc_type like", value, "atcType");
            return (Criteria) this;
        }

        public Criteria andAtcTypeNotLike(String value) {
            addCriterion("atc_type not like", value, "atcType");
            return (Criteria) this;
        }

        public Criteria andAtcTypeIn(List<String> values) {
            addCriterion("atc_type in", values, "atcType");
            return (Criteria) this;
        }

        public Criteria andAtcTypeNotIn(List<String> values) {
            addCriterion("atc_type not in", values, "atcType");
            return (Criteria) this;
        }

        public Criteria andAtcTypeBetween(String value1, String value2) {
            addCriterion("atc_type between", value1, value2, "atcType");
            return (Criteria) this;
        }

        public Criteria andAtcTypeNotBetween(String value1, String value2) {
            addCriterion("atc_type not between", value1, value2, "atcType");
            return (Criteria) this;
        }

        public Criteria andAtcNum1IsNull() {
            addCriterion("atc_num1 is null");
            return (Criteria) this;
        }

        public Criteria andAtcNum1IsNotNull() {
            addCriterion("atc_num1 is not null");
            return (Criteria) this;
        }

        public Criteria andAtcNum1EqualTo(Integer value) {
            addCriterion("atc_num1 =", value, "atcNum1");
            return (Criteria) this;
        }

        public Criteria andAtcNum1NotEqualTo(Integer value) {
            addCriterion("atc_num1 <>", value, "atcNum1");
            return (Criteria) this;
        }

        public Criteria andAtcNum1GreaterThan(Integer value) {
            addCriterion("atc_num1 >", value, "atcNum1");
            return (Criteria) this;
        }

        public Criteria andAtcNum1GreaterThanOrEqualTo(Integer value) {
            addCriterion("atc_num1 >=", value, "atcNum1");
            return (Criteria) this;
        }

        public Criteria andAtcNum1LessThan(Integer value) {
            addCriterion("atc_num1 <", value, "atcNum1");
            return (Criteria) this;
        }

        public Criteria andAtcNum1LessThanOrEqualTo(Integer value) {
            addCriterion("atc_num1 <=", value, "atcNum1");
            return (Criteria) this;
        }

        public Criteria andAtcNum1In(List<Integer> values) {
            addCriterion("atc_num1 in", values, "atcNum1");
            return (Criteria) this;
        }

        public Criteria andAtcNum1NotIn(List<Integer> values) {
            addCriterion("atc_num1 not in", values, "atcNum1");
            return (Criteria) this;
        }

        public Criteria andAtcNum1Between(Integer value1, Integer value2) {
            addCriterion("atc_num1 between", value1, value2, "atcNum1");
            return (Criteria) this;
        }

        public Criteria andAtcNum1NotBetween(Integer value1, Integer value2) {
            addCriterion("atc_num1 not between", value1, value2, "atcNum1");
            return (Criteria) this;
        }

        public Criteria andAtcNum2IsNull() {
            addCriterion("atc_num2 is null");
            return (Criteria) this;
        }

        public Criteria andAtcNum2IsNotNull() {
            addCriterion("atc_num2 is not null");
            return (Criteria) this;
        }

        public Criteria andAtcNum2EqualTo(Integer value) {
            addCriterion("atc_num2 =", value, "atcNum2");
            return (Criteria) this;
        }

        public Criteria andAtcNum2NotEqualTo(Integer value) {
            addCriterion("atc_num2 <>", value, "atcNum2");
            return (Criteria) this;
        }

        public Criteria andAtcNum2GreaterThan(Integer value) {
            addCriterion("atc_num2 >", value, "atcNum2");
            return (Criteria) this;
        }

        public Criteria andAtcNum2GreaterThanOrEqualTo(Integer value) {
            addCriterion("atc_num2 >=", value, "atcNum2");
            return (Criteria) this;
        }

        public Criteria andAtcNum2LessThan(Integer value) {
            addCriterion("atc_num2 <", value, "atcNum2");
            return (Criteria) this;
        }

        public Criteria andAtcNum2LessThanOrEqualTo(Integer value) {
            addCriterion("atc_num2 <=", value, "atcNum2");
            return (Criteria) this;
        }

        public Criteria andAtcNum2In(List<Integer> values) {
            addCriterion("atc_num2 in", values, "atcNum2");
            return (Criteria) this;
        }

        public Criteria andAtcNum2NotIn(List<Integer> values) {
            addCriterion("atc_num2 not in", values, "atcNum2");
            return (Criteria) this;
        }

        public Criteria andAtcNum2Between(Integer value1, Integer value2) {
            addCriterion("atc_num2 between", value1, value2, "atcNum2");
            return (Criteria) this;
        }

        public Criteria andAtcNum2NotBetween(Integer value1, Integer value2) {
            addCriterion("atc_num2 not between", value1, value2, "atcNum2");
            return (Criteria) this;
        }

        public Criteria andAtcPublishtimeIsNull() {
            addCriterion("atc_publishtime is null");
            return (Criteria) this;
        }

        public Criteria andAtcPublishtimeIsNotNull() {
            addCriterion("atc_publishtime is not null");
            return (Criteria) this;
        }

        public Criteria andAtcPublishtimeEqualTo(Date value) {
            addCriterion("atc_publishtime =", value, "atcPublishtime");
            return (Criteria) this;
        }

        public Criteria andAtcPublishtimeNotEqualTo(Date value) {
            addCriterion("atc_publishtime <>", value, "atcPublishtime");
            return (Criteria) this;
        }

        public Criteria andAtcPublishtimeGreaterThan(Date value) {
            addCriterion("atc_publishtime >", value, "atcPublishtime");
            return (Criteria) this;
        }

        public Criteria andAtcPublishtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("atc_publishtime >=", value, "atcPublishtime");
            return (Criteria) this;
        }

        public Criteria andAtcPublishtimeLessThan(Date value) {
            addCriterion("atc_publishtime <", value, "atcPublishtime");
            return (Criteria) this;
        }

        public Criteria andAtcPublishtimeLessThanOrEqualTo(Date value) {
            addCriterion("atc_publishtime <=", value, "atcPublishtime");
            return (Criteria) this;
        }

        public Criteria andAtcPublishtimeIn(List<Date> values) {
            addCriterion("atc_publishtime in", values, "atcPublishtime");
            return (Criteria) this;
        }

        public Criteria andAtcPublishtimeNotIn(List<Date> values) {
            addCriterion("atc_publishtime not in", values, "atcPublishtime");
            return (Criteria) this;
        }

        public Criteria andAtcPublishtimeBetween(Date value1, Date value2) {
            addCriterion("atc_publishtime between", value1, value2, "atcPublishtime");
            return (Criteria) this;
        }

        public Criteria andAtcPublishtimeNotBetween(Date value1, Date value2) {
            addCriterion("atc_publishtime not between", value1, value2, "atcPublishtime");
            return (Criteria) this;
        }

        public Criteria andAtcNameIsNull() {
            addCriterion("atc_name is null");
            return (Criteria) this;
        }

        public Criteria andAtcNameIsNotNull() {
            addCriterion("atc_name is not null");
            return (Criteria) this;
        }

        public Criteria andAtcNameEqualTo(String value) {
            addCriterion("atc_name =", value, "atcName");
            return (Criteria) this;
        }

        public Criteria andAtcNameNotEqualTo(String value) {
            addCriterion("atc_name <>", value, "atcName");
            return (Criteria) this;
        }

        public Criteria andAtcNameGreaterThan(String value) {
            addCriterion("atc_name >", value, "atcName");
            return (Criteria) this;
        }

        public Criteria andAtcNameGreaterThanOrEqualTo(String value) {
            addCriterion("atc_name >=", value, "atcName");
            return (Criteria) this;
        }

        public Criteria andAtcNameLessThan(String value) {
            addCriterion("atc_name <", value, "atcName");
            return (Criteria) this;
        }

        public Criteria andAtcNameLessThanOrEqualTo(String value) {
            addCriterion("atc_name <=", value, "atcName");
            return (Criteria) this;
        }

        public Criteria andAtcNameLike(String value) {
            addCriterion("atc_name like", value, "atcName");
            return (Criteria) this;
        }

        public Criteria andAtcNameNotLike(String value) {
            addCriterion("atc_name not like", value, "atcName");
            return (Criteria) this;
        }

        public Criteria andAtcNameIn(List<String> values) {
            addCriterion("atc_name in", values, "atcName");
            return (Criteria) this;
        }

        public Criteria andAtcNameNotIn(List<String> values) {
            addCriterion("atc_name not in", values, "atcName");
            return (Criteria) this;
        }

        public Criteria andAtcNameBetween(String value1, String value2) {
            addCriterion("atc_name between", value1, value2, "atcName");
            return (Criteria) this;
        }

        public Criteria andAtcNameNotBetween(String value1, String value2) {
            addCriterion("atc_name not between", value1, value2, "atcName");
            return (Criteria) this;
        }

        public Criteria andAtcAuthoridIsNull() {
            addCriterion("atc_authorid is null");
            return (Criteria) this;
        }

        public Criteria andAtcAuthoridIsNotNull() {
            addCriterion("atc_authorid is not null");
            return (Criteria) this;
        }

        public Criteria andAtcAuthoridEqualTo(Integer value) {
            addCriterion("atc_authorid =", value, "atcAuthorid");
            return (Criteria) this;
        }

        public Criteria andAtcAuthoridNotEqualTo(Integer value) {
            addCriterion("atc_authorid <>", value, "atcAuthorid");
            return (Criteria) this;
        }

        public Criteria andAtcAuthoridGreaterThan(Integer value) {
            addCriterion("atc_authorid >", value, "atcAuthorid");
            return (Criteria) this;
        }

        public Criteria andAtcAuthoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("atc_authorid >=", value, "atcAuthorid");
            return (Criteria) this;
        }

        public Criteria andAtcAuthoridLessThan(Integer value) {
            addCriterion("atc_authorid <", value, "atcAuthorid");
            return (Criteria) this;
        }

        public Criteria andAtcAuthoridLessThanOrEqualTo(Integer value) {
            addCriterion("atc_authorid <=", value, "atcAuthorid");
            return (Criteria) this;
        }

        public Criteria andAtcAuthoridIn(List<Integer> values) {
            addCriterion("atc_authorid in", values, "atcAuthorid");
            return (Criteria) this;
        }

        public Criteria andAtcAuthoridNotIn(List<Integer> values) {
            addCriterion("atc_authorid not in", values, "atcAuthorid");
            return (Criteria) this;
        }

        public Criteria andAtcAuthoridBetween(Integer value1, Integer value2) {
            addCriterion("atc_authorid between", value1, value2, "atcAuthorid");
            return (Criteria) this;
        }

        public Criteria andAtcAuthoridNotBetween(Integer value1, Integer value2) {
            addCriterion("atc_authorid not between", value1, value2, "atcAuthorid");
            return (Criteria) this;
        }

        public Criteria andAtcScrutidIsNull() {
            addCriterion("atc_scrutid is null");
            return (Criteria) this;
        }

        public Criteria andAtcScrutidIsNotNull() {
            addCriterion("atc_scrutid is not null");
            return (Criteria) this;
        }

        public Criteria andAtcScrutidEqualTo(Integer value) {
            addCriterion("atc_scrutid =", value, "atcScrutid");
            return (Criteria) this;
        }

        public Criteria andAtcScrutidNotEqualTo(Integer value) {
            addCriterion("atc_scrutid <>", value, "atcScrutid");
            return (Criteria) this;
        }

        public Criteria andAtcScrutidGreaterThan(Integer value) {
            addCriterion("atc_scrutid >", value, "atcScrutid");
            return (Criteria) this;
        }

        public Criteria andAtcScrutidGreaterThanOrEqualTo(Integer value) {
            addCriterion("atc_scrutid >=", value, "atcScrutid");
            return (Criteria) this;
        }

        public Criteria andAtcScrutidLessThan(Integer value) {
            addCriterion("atc_scrutid <", value, "atcScrutid");
            return (Criteria) this;
        }

        public Criteria andAtcScrutidLessThanOrEqualTo(Integer value) {
            addCriterion("atc_scrutid <=", value, "atcScrutid");
            return (Criteria) this;
        }

        public Criteria andAtcScrutidIn(List<Integer> values) {
            addCriterion("atc_scrutid in", values, "atcScrutid");
            return (Criteria) this;
        }

        public Criteria andAtcScrutidNotIn(List<Integer> values) {
            addCriterion("atc_scrutid not in", values, "atcScrutid");
            return (Criteria) this;
        }

        public Criteria andAtcScrutidBetween(Integer value1, Integer value2) {
            addCriterion("atc_scrutid between", value1, value2, "atcScrutid");
            return (Criteria) this;
        }

        public Criteria andAtcScrutidNotBetween(Integer value1, Integer value2) {
            addCriterion("atc_scrutid not between", value1, value2, "atcScrutid");
            return (Criteria) this;
        }

        public Criteria andAtcStateIsNull() {
            addCriterion("atc_state is null");
            return (Criteria) this;
        }

        public Criteria andAtcStateIsNotNull() {
            addCriterion("atc_state is not null");
            return (Criteria) this;
        }

        public Criteria andAtcStateEqualTo(String value) {
            addCriterion("atc_state =", value, "atcState");
            return (Criteria) this;
        }

        public Criteria andAtcStateNotEqualTo(String value) {
            addCriterion("atc_state <>", value, "atcState");
            return (Criteria) this;
        }

        public Criteria andAtcStateGreaterThan(String value) {
            addCriterion("atc_state >", value, "atcState");
            return (Criteria) this;
        }

        public Criteria andAtcStateGreaterThanOrEqualTo(String value) {
            addCriterion("atc_state >=", value, "atcState");
            return (Criteria) this;
        }

        public Criteria andAtcStateLessThan(String value) {
            addCriterion("atc_state <", value, "atcState");
            return (Criteria) this;
        }

        public Criteria andAtcStateLessThanOrEqualTo(String value) {
            addCriterion("atc_state <=", value, "atcState");
            return (Criteria) this;
        }

        public Criteria andAtcStateLike(String value) {
            addCriterion("atc_state like", value, "atcState");
            return (Criteria) this;
        }

        public Criteria andAtcStateNotLike(String value) {
            addCriterion("atc_state not like", value, "atcState");
            return (Criteria) this;
        }

        public Criteria andAtcStateIn(List<String> values) {
            addCriterion("atc_state in", values, "atcState");
            return (Criteria) this;
        }

        public Criteria andAtcStateNotIn(List<String> values) {
            addCriterion("atc_state not in", values, "atcState");
            return (Criteria) this;
        }

        public Criteria andAtcStateBetween(String value1, String value2) {
            addCriterion("atc_state between", value1, value2, "atcState");
            return (Criteria) this;
        }

        public Criteria andAtcStateNotBetween(String value1, String value2) {
            addCriterion("atc_state not between", value1, value2, "atcState");
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