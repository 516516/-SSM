package com.bobo.keyan.hdb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectExample() {
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

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(Integer value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(Integer value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(Integer value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(Integer value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(Integer value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<Integer> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<Integer> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(Integer value1, Integer value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(Integer value1, Integer value2) {
            addCriterion("p_id not between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPNameIsNull() {
            addCriterion("p_name is null");
            return (Criteria) this;
        }

        public Criteria andPNameIsNotNull() {
            addCriterion("p_name is not null");
            return (Criteria) this;
        }

        public Criteria andPNameEqualTo(String value) {
            addCriterion("p_name =", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotEqualTo(String value) {
            addCriterion("p_name <>", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThan(String value) {
            addCriterion("p_name >", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThanOrEqualTo(String value) {
            addCriterion("p_name >=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThan(String value) {
            addCriterion("p_name <", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThanOrEqualTo(String value) {
            addCriterion("p_name <=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLike(String value) {
            addCriterion("p_name like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotLike(String value) {
            addCriterion("p_name not like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameIn(List<String> values) {
            addCriterion("p_name in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotIn(List<String> values) {
            addCriterion("p_name not in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameBetween(String value1, String value2) {
            addCriterion("p_name between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotBetween(String value1, String value2) {
            addCriterion("p_name not between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPTypeIsNull() {
            addCriterion("p_type is null");
            return (Criteria) this;
        }

        public Criteria andPTypeIsNotNull() {
            addCriterion("p_type is not null");
            return (Criteria) this;
        }

        public Criteria andPTypeEqualTo(String value) {
            addCriterion("p_type =", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeNotEqualTo(String value) {
            addCriterion("p_type <>", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeGreaterThan(String value) {
            addCriterion("p_type >", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeGreaterThanOrEqualTo(String value) {
            addCriterion("p_type >=", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeLessThan(String value) {
            addCriterion("p_type <", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeLessThanOrEqualTo(String value) {
            addCriterion("p_type <=", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeLike(String value) {
            addCriterion("p_type like", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeNotLike(String value) {
            addCriterion("p_type not like", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeIn(List<String> values) {
            addCriterion("p_type in", values, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeNotIn(List<String> values) {
            addCriterion("p_type not in", values, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeBetween(String value1, String value2) {
            addCriterion("p_type between", value1, value2, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeNotBetween(String value1, String value2) {
            addCriterion("p_type not between", value1, value2, "pType");
            return (Criteria) this;
        }

        public Criteria andPAmountIsNull() {
            addCriterion("p_amount is null");
            return (Criteria) this;
        }

        public Criteria andPAmountIsNotNull() {
            addCriterion("p_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPAmountEqualTo(BigDecimal value) {
            addCriterion("p_amount =", value, "pAmount");
            return (Criteria) this;
        }

        public Criteria andPAmountNotEqualTo(BigDecimal value) {
            addCriterion("p_amount <>", value, "pAmount");
            return (Criteria) this;
        }

        public Criteria andPAmountGreaterThan(BigDecimal value) {
            addCriterion("p_amount >", value, "pAmount");
            return (Criteria) this;
        }

        public Criteria andPAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("p_amount >=", value, "pAmount");
            return (Criteria) this;
        }

        public Criteria andPAmountLessThan(BigDecimal value) {
            addCriterion("p_amount <", value, "pAmount");
            return (Criteria) this;
        }

        public Criteria andPAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("p_amount <=", value, "pAmount");
            return (Criteria) this;
        }

        public Criteria andPAmountIn(List<BigDecimal> values) {
            addCriterion("p_amount in", values, "pAmount");
            return (Criteria) this;
        }

        public Criteria andPAmountNotIn(List<BigDecimal> values) {
            addCriterion("p_amount not in", values, "pAmount");
            return (Criteria) this;
        }

        public Criteria andPAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("p_amount between", value1, value2, "pAmount");
            return (Criteria) this;
        }

        public Criteria andPAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("p_amount not between", value1, value2, "pAmount");
            return (Criteria) this;
        }

        public Criteria andPInvestAmountIsNull() {
            addCriterion("p_invest_amount is null");
            return (Criteria) this;
        }

        public Criteria andPInvestAmountIsNotNull() {
            addCriterion("p_invest_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPInvestAmountEqualTo(BigDecimal value) {
            addCriterion("p_invest_amount =", value, "pInvestAmount");
            return (Criteria) this;
        }

        public Criteria andPInvestAmountNotEqualTo(BigDecimal value) {
            addCriterion("p_invest_amount <>", value, "pInvestAmount");
            return (Criteria) this;
        }

        public Criteria andPInvestAmountGreaterThan(BigDecimal value) {
            addCriterion("p_invest_amount >", value, "pInvestAmount");
            return (Criteria) this;
        }

        public Criteria andPInvestAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("p_invest_amount >=", value, "pInvestAmount");
            return (Criteria) this;
        }

        public Criteria andPInvestAmountLessThan(BigDecimal value) {
            addCriterion("p_invest_amount <", value, "pInvestAmount");
            return (Criteria) this;
        }

        public Criteria andPInvestAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("p_invest_amount <=", value, "pInvestAmount");
            return (Criteria) this;
        }

        public Criteria andPInvestAmountIn(List<BigDecimal> values) {
            addCriterion("p_invest_amount in", values, "pInvestAmount");
            return (Criteria) this;
        }

        public Criteria andPInvestAmountNotIn(List<BigDecimal> values) {
            addCriterion("p_invest_amount not in", values, "pInvestAmount");
            return (Criteria) this;
        }

        public Criteria andPInvestAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("p_invest_amount between", value1, value2, "pInvestAmount");
            return (Criteria) this;
        }

        public Criteria andPInvestAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("p_invest_amount not between", value1, value2, "pInvestAmount");
            return (Criteria) this;
        }

        public Criteria andPIntroductionIsNull() {
            addCriterion("p_introduction is null");
            return (Criteria) this;
        }

        public Criteria andPIntroductionIsNotNull() {
            addCriterion("p_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andPIntroductionEqualTo(String value) {
            addCriterion("p_introduction =", value, "pIntroduction");
            return (Criteria) this;
        }

        public Criteria andPIntroductionNotEqualTo(String value) {
            addCriterion("p_introduction <>", value, "pIntroduction");
            return (Criteria) this;
        }

        public Criteria andPIntroductionGreaterThan(String value) {
            addCriterion("p_introduction >", value, "pIntroduction");
            return (Criteria) this;
        }

        public Criteria andPIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("p_introduction >=", value, "pIntroduction");
            return (Criteria) this;
        }

        public Criteria andPIntroductionLessThan(String value) {
            addCriterion("p_introduction <", value, "pIntroduction");
            return (Criteria) this;
        }

        public Criteria andPIntroductionLessThanOrEqualTo(String value) {
            addCriterion("p_introduction <=", value, "pIntroduction");
            return (Criteria) this;
        }

        public Criteria andPIntroductionLike(String value) {
            addCriterion("p_introduction like", value, "pIntroduction");
            return (Criteria) this;
        }

        public Criteria andPIntroductionNotLike(String value) {
            addCriterion("p_introduction not like", value, "pIntroduction");
            return (Criteria) this;
        }

        public Criteria andPIntroductionIn(List<String> values) {
            addCriterion("p_introduction in", values, "pIntroduction");
            return (Criteria) this;
        }

        public Criteria andPIntroductionNotIn(List<String> values) {
            addCriterion("p_introduction not in", values, "pIntroduction");
            return (Criteria) this;
        }

        public Criteria andPIntroductionBetween(String value1, String value2) {
            addCriterion("p_introduction between", value1, value2, "pIntroduction");
            return (Criteria) this;
        }

        public Criteria andPIntroductionNotBetween(String value1, String value2) {
            addCriterion("p_introduction not between", value1, value2, "pIntroduction");
            return (Criteria) this;
        }

        public Criteria andPDateInvestfirstIsNull() {
            addCriterion("p_date_investfirst is null");
            return (Criteria) this;
        }

        public Criteria andPDateInvestfirstIsNotNull() {
            addCriterion("p_date_investfirst is not null");
            return (Criteria) this;
        }

        public Criteria andPDateInvestfirstEqualTo(Date value) {
            addCriterion("p_date_investfirst =", value, "pDateInvestfirst");
            return (Criteria) this;
        }

        public Criteria andPDateInvestfirstNotEqualTo(Date value) {
            addCriterion("p_date_investfirst <>", value, "pDateInvestfirst");
            return (Criteria) this;
        }

        public Criteria andPDateInvestfirstGreaterThan(Date value) {
            addCriterion("p_date_investfirst >", value, "pDateInvestfirst");
            return (Criteria) this;
        }

        public Criteria andPDateInvestfirstGreaterThanOrEqualTo(Date value) {
            addCriterion("p_date_investfirst >=", value, "pDateInvestfirst");
            return (Criteria) this;
        }

        public Criteria andPDateInvestfirstLessThan(Date value) {
            addCriterion("p_date_investfirst <", value, "pDateInvestfirst");
            return (Criteria) this;
        }

        public Criteria andPDateInvestfirstLessThanOrEqualTo(Date value) {
            addCriterion("p_date_investfirst <=", value, "pDateInvestfirst");
            return (Criteria) this;
        }

        public Criteria andPDateInvestfirstIn(List<Date> values) {
            addCriterion("p_date_investfirst in", values, "pDateInvestfirst");
            return (Criteria) this;
        }

        public Criteria andPDateInvestfirstNotIn(List<Date> values) {
            addCriterion("p_date_investfirst not in", values, "pDateInvestfirst");
            return (Criteria) this;
        }

        public Criteria andPDateInvestfirstBetween(Date value1, Date value2) {
            addCriterion("p_date_investfirst between", value1, value2, "pDateInvestfirst");
            return (Criteria) this;
        }

        public Criteria andPDateInvestfirstNotBetween(Date value1, Date value2) {
            addCriterion("p_date_investfirst not between", value1, value2, "pDateInvestfirst");
            return (Criteria) this;
        }

        public Criteria andPStateIsNull() {
            addCriterion("p_state is null");
            return (Criteria) this;
        }

        public Criteria andPStateIsNotNull() {
            addCriterion("p_state is not null");
            return (Criteria) this;
        }

        public Criteria andPStateEqualTo(String value) {
            addCriterion("p_state =", value, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateNotEqualTo(String value) {
            addCriterion("p_state <>", value, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateGreaterThan(String value) {
            addCriterion("p_state >", value, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateGreaterThanOrEqualTo(String value) {
            addCriterion("p_state >=", value, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateLessThan(String value) {
            addCriterion("p_state <", value, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateLessThanOrEqualTo(String value) {
            addCriterion("p_state <=", value, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateLike(String value) {
            addCriterion("p_state like", value, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateNotLike(String value) {
            addCriterion("p_state not like", value, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateIn(List<String> values) {
            addCriterion("p_state in", values, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateNotIn(List<String> values) {
            addCriterion("p_state not in", values, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateBetween(String value1, String value2) {
            addCriterion("p_state between", value1, value2, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateNotBetween(String value1, String value2) {
            addCriterion("p_state not between", value1, value2, "pState");
            return (Criteria) this;
        }

        public Criteria andPDateInvestendIsNull() {
            addCriterion("p_date_investend is null");
            return (Criteria) this;
        }

        public Criteria andPDateInvestendIsNotNull() {
            addCriterion("p_date_investend is not null");
            return (Criteria) this;
        }

        public Criteria andPDateInvestendEqualTo(Date value) {
            addCriterion("p_date_investend =", value, "pDateInvestend");
            return (Criteria) this;
        }

        public Criteria andPDateInvestendNotEqualTo(Date value) {
            addCriterion("p_date_investend <>", value, "pDateInvestend");
            return (Criteria) this;
        }

        public Criteria andPDateInvestendGreaterThan(Date value) {
            addCriterion("p_date_investend >", value, "pDateInvestend");
            return (Criteria) this;
        }

        public Criteria andPDateInvestendGreaterThanOrEqualTo(Date value) {
            addCriterion("p_date_investend >=", value, "pDateInvestend");
            return (Criteria) this;
        }

        public Criteria andPDateInvestendLessThan(Date value) {
            addCriterion("p_date_investend <", value, "pDateInvestend");
            return (Criteria) this;
        }

        public Criteria andPDateInvestendLessThanOrEqualTo(Date value) {
            addCriterion("p_date_investend <=", value, "pDateInvestend");
            return (Criteria) this;
        }

        public Criteria andPDateInvestendIn(List<Date> values) {
            addCriterion("p_date_investend in", values, "pDateInvestend");
            return (Criteria) this;
        }

        public Criteria andPDateInvestendNotIn(List<Date> values) {
            addCriterion("p_date_investend not in", values, "pDateInvestend");
            return (Criteria) this;
        }

        public Criteria andPDateInvestendBetween(Date value1, Date value2) {
            addCriterion("p_date_investend between", value1, value2, "pDateInvestend");
            return (Criteria) this;
        }

        public Criteria andPDateInvestendNotBetween(Date value1, Date value2) {
            addCriterion("p_date_investend not between", value1, value2, "pDateInvestend");
            return (Criteria) this;
        }

        public Criteria andPDatelineIsNull() {
            addCriterion("p_dateline is null");
            return (Criteria) this;
        }

        public Criteria andPDatelineIsNotNull() {
            addCriterion("p_dateline is not null");
            return (Criteria) this;
        }

        public Criteria andPDatelineEqualTo(Date value) {
            addCriterion("p_dateline =", value, "pDateline");
            return (Criteria) this;
        }

        public Criteria andPDatelineNotEqualTo(Date value) {
            addCriterion("p_dateline <>", value, "pDateline");
            return (Criteria) this;
        }

        public Criteria andPDatelineGreaterThan(Date value) {
            addCriterion("p_dateline >", value, "pDateline");
            return (Criteria) this;
        }

        public Criteria andPDatelineGreaterThanOrEqualTo(Date value) {
            addCriterion("p_dateline >=", value, "pDateline");
            return (Criteria) this;
        }

        public Criteria andPDatelineLessThan(Date value) {
            addCriterion("p_dateline <", value, "pDateline");
            return (Criteria) this;
        }

        public Criteria andPDatelineLessThanOrEqualTo(Date value) {
            addCriterion("p_dateline <=", value, "pDateline");
            return (Criteria) this;
        }

        public Criteria andPDatelineIn(List<Date> values) {
            addCriterion("p_dateline in", values, "pDateline");
            return (Criteria) this;
        }

        public Criteria andPDatelineNotIn(List<Date> values) {
            addCriterion("p_dateline not in", values, "pDateline");
            return (Criteria) this;
        }

        public Criteria andPDatelineBetween(Date value1, Date value2) {
            addCriterion("p_dateline between", value1, value2, "pDateline");
            return (Criteria) this;
        }

        public Criteria andPDatelineNotBetween(Date value1, Date value2) {
            addCriterion("p_dateline not between", value1, value2, "pDateline");
            return (Criteria) this;
        }

        public Criteria andPBorrowerIdIsNull() {
            addCriterion("p_borrower_id is null");
            return (Criteria) this;
        }

        public Criteria andPBorrowerIdIsNotNull() {
            addCriterion("p_borrower_id is not null");
            return (Criteria) this;
        }

        public Criteria andPBorrowerIdEqualTo(Integer value) {
            addCriterion("p_borrower_id =", value, "pBorrowerId");
            return (Criteria) this;
        }

        public Criteria andPBorrowerIdNotEqualTo(Integer value) {
            addCriterion("p_borrower_id <>", value, "pBorrowerId");
            return (Criteria) this;
        }

        public Criteria andPBorrowerIdGreaterThan(Integer value) {
            addCriterion("p_borrower_id >", value, "pBorrowerId");
            return (Criteria) this;
        }

        public Criteria andPBorrowerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_borrower_id >=", value, "pBorrowerId");
            return (Criteria) this;
        }

        public Criteria andPBorrowerIdLessThan(Integer value) {
            addCriterion("p_borrower_id <", value, "pBorrowerId");
            return (Criteria) this;
        }

        public Criteria andPBorrowerIdLessThanOrEqualTo(Integer value) {
            addCriterion("p_borrower_id <=", value, "pBorrowerId");
            return (Criteria) this;
        }

        public Criteria andPBorrowerIdIn(List<Integer> values) {
            addCriterion("p_borrower_id in", values, "pBorrowerId");
            return (Criteria) this;
        }

        public Criteria andPBorrowerIdNotIn(List<Integer> values) {
            addCriterion("p_borrower_id not in", values, "pBorrowerId");
            return (Criteria) this;
        }

        public Criteria andPBorrowerIdBetween(Integer value1, Integer value2) {
            addCriterion("p_borrower_id between", value1, value2, "pBorrowerId");
            return (Criteria) this;
        }

        public Criteria andPBorrowerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("p_borrower_id not between", value1, value2, "pBorrowerId");
            return (Criteria) this;
        }

        public Criteria andPRateIsNull() {
            addCriterion("p_rate is null");
            return (Criteria) this;
        }

        public Criteria andPRateIsNotNull() {
            addCriterion("p_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPRateEqualTo(String value) {
            addCriterion("p_rate =", value, "pRate");
            return (Criteria) this;
        }

        public Criteria andPRateNotEqualTo(String value) {
            addCriterion("p_rate <>", value, "pRate");
            return (Criteria) this;
        }

        public Criteria andPRateGreaterThan(String value) {
            addCriterion("p_rate >", value, "pRate");
            return (Criteria) this;
        }

        public Criteria andPRateGreaterThanOrEqualTo(String value) {
            addCriterion("p_rate >=", value, "pRate");
            return (Criteria) this;
        }

        public Criteria andPRateLessThan(String value) {
            addCriterion("p_rate <", value, "pRate");
            return (Criteria) this;
        }

        public Criteria andPRateLessThanOrEqualTo(String value) {
            addCriterion("p_rate <=", value, "pRate");
            return (Criteria) this;
        }

        public Criteria andPRateLike(String value) {
            addCriterion("p_rate like", value, "pRate");
            return (Criteria) this;
        }

        public Criteria andPRateNotLike(String value) {
            addCriterion("p_rate not like", value, "pRate");
            return (Criteria) this;
        }

        public Criteria andPRateIn(List<String> values) {
            addCriterion("p_rate in", values, "pRate");
            return (Criteria) this;
        }

        public Criteria andPRateNotIn(List<String> values) {
            addCriterion("p_rate not in", values, "pRate");
            return (Criteria) this;
        }

        public Criteria andPRateBetween(String value1, String value2) {
            addCriterion("p_rate between", value1, value2, "pRate");
            return (Criteria) this;
        }

        public Criteria andPRateNotBetween(String value1, String value2) {
            addCriterion("p_rate not between", value1, value2, "pRate");
            return (Criteria) this;
        }

        public Criteria andPAuditorIdIsNull() {
            addCriterion("p_auditor_id is null");
            return (Criteria) this;
        }

        public Criteria andPAuditorIdIsNotNull() {
            addCriterion("p_auditor_id is not null");
            return (Criteria) this;
        }

        public Criteria andPAuditorIdEqualTo(Integer value) {
            addCriterion("p_auditor_id =", value, "pAuditorId");
            return (Criteria) this;
        }

        public Criteria andPAuditorIdNotEqualTo(Integer value) {
            addCriterion("p_auditor_id <>", value, "pAuditorId");
            return (Criteria) this;
        }

        public Criteria andPAuditorIdGreaterThan(Integer value) {
            addCriterion("p_auditor_id >", value, "pAuditorId");
            return (Criteria) this;
        }

        public Criteria andPAuditorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_auditor_id >=", value, "pAuditorId");
            return (Criteria) this;
        }

        public Criteria andPAuditorIdLessThan(Integer value) {
            addCriterion("p_auditor_id <", value, "pAuditorId");
            return (Criteria) this;
        }

        public Criteria andPAuditorIdLessThanOrEqualTo(Integer value) {
            addCriterion("p_auditor_id <=", value, "pAuditorId");
            return (Criteria) this;
        }

        public Criteria andPAuditorIdIn(List<Integer> values) {
            addCriterion("p_auditor_id in", values, "pAuditorId");
            return (Criteria) this;
        }

        public Criteria andPAuditorIdNotIn(List<Integer> values) {
            addCriterion("p_auditor_id not in", values, "pAuditorId");
            return (Criteria) this;
        }

        public Criteria andPAuditorIdBetween(Integer value1, Integer value2) {
            addCriterion("p_auditor_id between", value1, value2, "pAuditorId");
            return (Criteria) this;
        }

        public Criteria andPAuditorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("p_auditor_id not between", value1, value2, "pAuditorId");
            return (Criteria) this;
        }

        public Criteria andPCreatorIdIsNull() {
            addCriterion("p_creator_id is null");
            return (Criteria) this;
        }

        public Criteria andPCreatorIdIsNotNull() {
            addCriterion("p_creator_id is not null");
            return (Criteria) this;
        }

        public Criteria andPCreatorIdEqualTo(Integer value) {
            addCriterion("p_creator_id =", value, "pCreatorId");
            return (Criteria) this;
        }

        public Criteria andPCreatorIdNotEqualTo(Integer value) {
            addCriterion("p_creator_id <>", value, "pCreatorId");
            return (Criteria) this;
        }

        public Criteria andPCreatorIdGreaterThan(Integer value) {
            addCriterion("p_creator_id >", value, "pCreatorId");
            return (Criteria) this;
        }

        public Criteria andPCreatorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_creator_id >=", value, "pCreatorId");
            return (Criteria) this;
        }

        public Criteria andPCreatorIdLessThan(Integer value) {
            addCriterion("p_creator_id <", value, "pCreatorId");
            return (Criteria) this;
        }

        public Criteria andPCreatorIdLessThanOrEqualTo(Integer value) {
            addCriterion("p_creator_id <=", value, "pCreatorId");
            return (Criteria) this;
        }

        public Criteria andPCreatorIdIn(List<Integer> values) {
            addCriterion("p_creator_id in", values, "pCreatorId");
            return (Criteria) this;
        }

        public Criteria andPCreatorIdNotIn(List<Integer> values) {
            addCriterion("p_creator_id not in", values, "pCreatorId");
            return (Criteria) this;
        }

        public Criteria andPCreatorIdBetween(Integer value1, Integer value2) {
            addCriterion("p_creator_id between", value1, value2, "pCreatorId");
            return (Criteria) this;
        }

        public Criteria andPCreatorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("p_creator_id not between", value1, value2, "pCreatorId");
            return (Criteria) this;
        }

        public Criteria andPExamineContentIsNull() {
            addCriterion("p_examine_content is null");
            return (Criteria) this;
        }

        public Criteria andPExamineContentIsNotNull() {
            addCriterion("p_examine_content is not null");
            return (Criteria) this;
        }

        public Criteria andPExamineContentEqualTo(String value) {
            addCriterion("p_examine_content =", value, "pExamineContent");
            return (Criteria) this;
        }

        public Criteria andPExamineContentNotEqualTo(String value) {
            addCriterion("p_examine_content <>", value, "pExamineContent");
            return (Criteria) this;
        }

        public Criteria andPExamineContentGreaterThan(String value) {
            addCriterion("p_examine_content >", value, "pExamineContent");
            return (Criteria) this;
        }

        public Criteria andPExamineContentGreaterThanOrEqualTo(String value) {
            addCriterion("p_examine_content >=", value, "pExamineContent");
            return (Criteria) this;
        }

        public Criteria andPExamineContentLessThan(String value) {
            addCriterion("p_examine_content <", value, "pExamineContent");
            return (Criteria) this;
        }

        public Criteria andPExamineContentLessThanOrEqualTo(String value) {
            addCriterion("p_examine_content <=", value, "pExamineContent");
            return (Criteria) this;
        }

        public Criteria andPExamineContentLike(String value) {
            addCriterion("p_examine_content like", value, "pExamineContent");
            return (Criteria) this;
        }

        public Criteria andPExamineContentNotLike(String value) {
            addCriterion("p_examine_content not like", value, "pExamineContent");
            return (Criteria) this;
        }

        public Criteria andPExamineContentIn(List<String> values) {
            addCriterion("p_examine_content in", values, "pExamineContent");
            return (Criteria) this;
        }

        public Criteria andPExamineContentNotIn(List<String> values) {
            addCriterion("p_examine_content not in", values, "pExamineContent");
            return (Criteria) this;
        }

        public Criteria andPExamineContentBetween(String value1, String value2) {
            addCriterion("p_examine_content between", value1, value2, "pExamineContent");
            return (Criteria) this;
        }

        public Criteria andPExamineContentNotBetween(String value1, String value2) {
            addCriterion("p_examine_content not between", value1, value2, "pExamineContent");
            return (Criteria) this;
        }

        public Criteria andPContentIsNull() {
            addCriterion("p_content is null");
            return (Criteria) this;
        }

        public Criteria andPContentIsNotNull() {
            addCriterion("p_content is not null");
            return (Criteria) this;
        }

        public Criteria andPContentEqualTo(String value) {
            addCriterion("p_content =", value, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentNotEqualTo(String value) {
            addCriterion("p_content <>", value, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentGreaterThan(String value) {
            addCriterion("p_content >", value, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentGreaterThanOrEqualTo(String value) {
            addCriterion("p_content >=", value, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentLessThan(String value) {
            addCriterion("p_content <", value, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentLessThanOrEqualTo(String value) {
            addCriterion("p_content <=", value, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentLike(String value) {
            addCriterion("p_content like", value, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentNotLike(String value) {
            addCriterion("p_content not like", value, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentIn(List<String> values) {
            addCriterion("p_content in", values, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentNotIn(List<String> values) {
            addCriterion("p_content not in", values, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentBetween(String value1, String value2) {
            addCriterion("p_content between", value1, value2, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentNotBetween(String value1, String value2) {
            addCriterion("p_content not between", value1, value2, "pContent");
            return (Criteria) this;
        }

        public Criteria andPExamineDateIsNull() {
            addCriterion("p_examine_date is null");
            return (Criteria) this;
        }

        public Criteria andPExamineDateIsNotNull() {
            addCriterion("p_examine_date is not null");
            return (Criteria) this;
        }

        public Criteria andPExamineDateEqualTo(Date value) {
            addCriterion("p_examine_date =", value, "pExamineDate");
            return (Criteria) this;
        }

        public Criteria andPExamineDateNotEqualTo(Date value) {
            addCriterion("p_examine_date <>", value, "pExamineDate");
            return (Criteria) this;
        }

        public Criteria andPExamineDateGreaterThan(Date value) {
            addCriterion("p_examine_date >", value, "pExamineDate");
            return (Criteria) this;
        }

        public Criteria andPExamineDateGreaterThanOrEqualTo(Date value) {
            addCriterion("p_examine_date >=", value, "pExamineDate");
            return (Criteria) this;
        }

        public Criteria andPExamineDateLessThan(Date value) {
            addCriterion("p_examine_date <", value, "pExamineDate");
            return (Criteria) this;
        }

        public Criteria andPExamineDateLessThanOrEqualTo(Date value) {
            addCriterion("p_examine_date <=", value, "pExamineDate");
            return (Criteria) this;
        }

        public Criteria andPExamineDateIn(List<Date> values) {
            addCriterion("p_examine_date in", values, "pExamineDate");
            return (Criteria) this;
        }

        public Criteria andPExamineDateNotIn(List<Date> values) {
            addCriterion("p_examine_date not in", values, "pExamineDate");
            return (Criteria) this;
        }

        public Criteria andPExamineDateBetween(Date value1, Date value2) {
            addCriterion("p_examine_date between", value1, value2, "pExamineDate");
            return (Criteria) this;
        }

        public Criteria andPExamineDateNotBetween(Date value1, Date value2) {
            addCriterion("p_examine_date not between", value1, value2, "pExamineDate");
            return (Criteria) this;
        }

        public Criteria andPAddtimeIsNull() {
            addCriterion("p_addtime is null");
            return (Criteria) this;
        }

        public Criteria andPAddtimeIsNotNull() {
            addCriterion("p_addtime is not null");
            return (Criteria) this;
        }

        public Criteria andPAddtimeEqualTo(Date value) {
            addCriterion("p_addtime =", value, "pAddtime");
            return (Criteria) this;
        }

        public Criteria andPAddtimeNotEqualTo(Date value) {
            addCriterion("p_addtime <>", value, "pAddtime");
            return (Criteria) this;
        }

        public Criteria andPAddtimeGreaterThan(Date value) {
            addCriterion("p_addtime >", value, "pAddtime");
            return (Criteria) this;
        }

        public Criteria andPAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("p_addtime >=", value, "pAddtime");
            return (Criteria) this;
        }

        public Criteria andPAddtimeLessThan(Date value) {
            addCriterion("p_addtime <", value, "pAddtime");
            return (Criteria) this;
        }

        public Criteria andPAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("p_addtime <=", value, "pAddtime");
            return (Criteria) this;
        }

        public Criteria andPAddtimeIn(List<Date> values) {
            addCriterion("p_addtime in", values, "pAddtime");
            return (Criteria) this;
        }

        public Criteria andPAddtimeNotIn(List<Date> values) {
            addCriterion("p_addtime not in", values, "pAddtime");
            return (Criteria) this;
        }

        public Criteria andPAddtimeBetween(Date value1, Date value2) {
            addCriterion("p_addtime between", value1, value2, "pAddtime");
            return (Criteria) this;
        }

        public Criteria andPAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("p_addtime not between", value1, value2, "pAddtime");
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