package com.bobo.keyan.hdb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUNameIsNull() {
            addCriterion("u_name is null");
            return (Criteria) this;
        }

        public Criteria andUNameIsNotNull() {
            addCriterion("u_name is not null");
            return (Criteria) this;
        }

        public Criteria andUNameEqualTo(String value) {
            addCriterion("u_name =", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotEqualTo(String value) {
            addCriterion("u_name <>", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThan(String value) {
            addCriterion("u_name >", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThanOrEqualTo(String value) {
            addCriterion("u_name >=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThan(String value) {
            addCriterion("u_name <", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThanOrEqualTo(String value) {
            addCriterion("u_name <=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLike(String value) {
            addCriterion("u_name like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotLike(String value) {
            addCriterion("u_name not like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameIn(List<String> values) {
            addCriterion("u_name in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotIn(List<String> values) {
            addCriterion("u_name not in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameBetween(String value1, String value2) {
            addCriterion("u_name between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotBetween(String value1, String value2) {
            addCriterion("u_name not between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andULoginpasswordIsNull() {
            addCriterion("u_loginpassword is null");
            return (Criteria) this;
        }

        public Criteria andULoginpasswordIsNotNull() {
            addCriterion("u_loginpassword is not null");
            return (Criteria) this;
        }

        public Criteria andULoginpasswordEqualTo(String value) {
            addCriterion("u_loginpassword =", value, "uLoginpassword");
            return (Criteria) this;
        }

        public Criteria andULoginpasswordNotEqualTo(String value) {
            addCriterion("u_loginpassword <>", value, "uLoginpassword");
            return (Criteria) this;
        }

        public Criteria andULoginpasswordGreaterThan(String value) {
            addCriterion("u_loginpassword >", value, "uLoginpassword");
            return (Criteria) this;
        }

        public Criteria andULoginpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("u_loginpassword >=", value, "uLoginpassword");
            return (Criteria) this;
        }

        public Criteria andULoginpasswordLessThan(String value) {
            addCriterion("u_loginpassword <", value, "uLoginpassword");
            return (Criteria) this;
        }

        public Criteria andULoginpasswordLessThanOrEqualTo(String value) {
            addCriterion("u_loginpassword <=", value, "uLoginpassword");
            return (Criteria) this;
        }

        public Criteria andULoginpasswordLike(String value) {
            addCriterion("u_loginpassword like", value, "uLoginpassword");
            return (Criteria) this;
        }

        public Criteria andULoginpasswordNotLike(String value) {
            addCriterion("u_loginpassword not like", value, "uLoginpassword");
            return (Criteria) this;
        }

        public Criteria andULoginpasswordIn(List<String> values) {
            addCriterion("u_loginpassword in", values, "uLoginpassword");
            return (Criteria) this;
        }

        public Criteria andULoginpasswordNotIn(List<String> values) {
            addCriterion("u_loginpassword not in", values, "uLoginpassword");
            return (Criteria) this;
        }

        public Criteria andULoginpasswordBetween(String value1, String value2) {
            addCriterion("u_loginpassword between", value1, value2, "uLoginpassword");
            return (Criteria) this;
        }

        public Criteria andULoginpasswordNotBetween(String value1, String value2) {
            addCriterion("u_loginpassword not between", value1, value2, "uLoginpassword");
            return (Criteria) this;
        }

        public Criteria andUNicknameIsNull() {
            addCriterion("u_nickname is null");
            return (Criteria) this;
        }

        public Criteria andUNicknameIsNotNull() {
            addCriterion("u_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andUNicknameEqualTo(String value) {
            addCriterion("u_nickname =", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameNotEqualTo(String value) {
            addCriterion("u_nickname <>", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameGreaterThan(String value) {
            addCriterion("u_nickname >", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("u_nickname >=", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameLessThan(String value) {
            addCriterion("u_nickname <", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameLessThanOrEqualTo(String value) {
            addCriterion("u_nickname <=", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameLike(String value) {
            addCriterion("u_nickname like", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameNotLike(String value) {
            addCriterion("u_nickname not like", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameIn(List<String> values) {
            addCriterion("u_nickname in", values, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameNotIn(List<String> values) {
            addCriterion("u_nickname not in", values, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameBetween(String value1, String value2) {
            addCriterion("u_nickname between", value1, value2, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameNotBetween(String value1, String value2) {
            addCriterion("u_nickname not between", value1, value2, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUPhoneIsNull() {
            addCriterion("u_phone is null");
            return (Criteria) this;
        }

        public Criteria andUPhoneIsNotNull() {
            addCriterion("u_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUPhoneEqualTo(String value) {
            addCriterion("u_phone =", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotEqualTo(String value) {
            addCriterion("u_phone <>", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneGreaterThan(String value) {
            addCriterion("u_phone >", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("u_phone >=", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLessThan(String value) {
            addCriterion("u_phone <", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLessThanOrEqualTo(String value) {
            addCriterion("u_phone <=", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLike(String value) {
            addCriterion("u_phone like", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotLike(String value) {
            addCriterion("u_phone not like", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneIn(List<String> values) {
            addCriterion("u_phone in", values, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotIn(List<String> values) {
            addCriterion("u_phone not in", values, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneBetween(String value1, String value2) {
            addCriterion("u_phone between", value1, value2, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotBetween(String value1, String value2) {
            addCriterion("u_phone not between", value1, value2, "uPhone");
            return (Criteria) this;
        }

        public Criteria andULastlogintimeIsNull() {
            addCriterion("u_lastlogintime is null");
            return (Criteria) this;
        }

        public Criteria andULastlogintimeIsNotNull() {
            addCriterion("u_lastlogintime is not null");
            return (Criteria) this;
        }

        public Criteria andULastlogintimeEqualTo(Date value) {
            addCriterion("u_lastlogintime =", value, "uLastlogintime");
            return (Criteria) this;
        }

        public Criteria andULastlogintimeNotEqualTo(Date value) {
            addCriterion("u_lastlogintime <>", value, "uLastlogintime");
            return (Criteria) this;
        }

        public Criteria andULastlogintimeGreaterThan(Date value) {
            addCriterion("u_lastlogintime >", value, "uLastlogintime");
            return (Criteria) this;
        }

        public Criteria andULastlogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("u_lastlogintime >=", value, "uLastlogintime");
            return (Criteria) this;
        }

        public Criteria andULastlogintimeLessThan(Date value) {
            addCriterion("u_lastlogintime <", value, "uLastlogintime");
            return (Criteria) this;
        }

        public Criteria andULastlogintimeLessThanOrEqualTo(Date value) {
            addCriterion("u_lastlogintime <=", value, "uLastlogintime");
            return (Criteria) this;
        }

        public Criteria andULastlogintimeIn(List<Date> values) {
            addCriterion("u_lastlogintime in", values, "uLastlogintime");
            return (Criteria) this;
        }

        public Criteria andULastlogintimeNotIn(List<Date> values) {
            addCriterion("u_lastlogintime not in", values, "uLastlogintime");
            return (Criteria) this;
        }

        public Criteria andULastlogintimeBetween(Date value1, Date value2) {
            addCriterion("u_lastlogintime between", value1, value2, "uLastlogintime");
            return (Criteria) this;
        }

        public Criteria andULastlogintimeNotBetween(Date value1, Date value2) {
            addCriterion("u_lastlogintime not between", value1, value2, "uLastlogintime");
            return (Criteria) this;
        }

        public Criteria andURegistimeIsNull() {
            addCriterion("u_registime is null");
            return (Criteria) this;
        }

        public Criteria andURegistimeIsNotNull() {
            addCriterion("u_registime is not null");
            return (Criteria) this;
        }

        public Criteria andURegistimeEqualTo(Date value) {
            addCriterion("u_registime =", value, "uRegistime");
            return (Criteria) this;
        }

        public Criteria andURegistimeNotEqualTo(Date value) {
            addCriterion("u_registime <>", value, "uRegistime");
            return (Criteria) this;
        }

        public Criteria andURegistimeGreaterThan(Date value) {
            addCriterion("u_registime >", value, "uRegistime");
            return (Criteria) this;
        }

        public Criteria andURegistimeGreaterThanOrEqualTo(Date value) {
            addCriterion("u_registime >=", value, "uRegistime");
            return (Criteria) this;
        }

        public Criteria andURegistimeLessThan(Date value) {
            addCriterion("u_registime <", value, "uRegistime");
            return (Criteria) this;
        }

        public Criteria andURegistimeLessThanOrEqualTo(Date value) {
            addCriterion("u_registime <=", value, "uRegistime");
            return (Criteria) this;
        }

        public Criteria andURegistimeIn(List<Date> values) {
            addCriterion("u_registime in", values, "uRegistime");
            return (Criteria) this;
        }

        public Criteria andURegistimeNotIn(List<Date> values) {
            addCriterion("u_registime not in", values, "uRegistime");
            return (Criteria) this;
        }

        public Criteria andURegistimeBetween(Date value1, Date value2) {
            addCriterion("u_registime between", value1, value2, "uRegistime");
            return (Criteria) this;
        }

        public Criteria andURegistimeNotBetween(Date value1, Date value2) {
            addCriterion("u_registime not between", value1, value2, "uRegistime");
            return (Criteria) this;
        }

        public Criteria andUStateIsNull() {
            addCriterion("u_state is null");
            return (Criteria) this;
        }

        public Criteria andUStateIsNotNull() {
            addCriterion("u_state is not null");
            return (Criteria) this;
        }

        public Criteria andUStateEqualTo(String value) {
            addCriterion("u_state =", value, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateNotEqualTo(String value) {
            addCriterion("u_state <>", value, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateGreaterThan(String value) {
            addCriterion("u_state >", value, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateGreaterThanOrEqualTo(String value) {
            addCriterion("u_state >=", value, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateLessThan(String value) {
            addCriterion("u_state <", value, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateLessThanOrEqualTo(String value) {
            addCriterion("u_state <=", value, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateLike(String value) {
            addCriterion("u_state like", value, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateNotLike(String value) {
            addCriterion("u_state not like", value, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateIn(List<String> values) {
            addCriterion("u_state in", values, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateNotIn(List<String> values) {
            addCriterion("u_state not in", values, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateBetween(String value1, String value2) {
            addCriterion("u_state between", value1, value2, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateNotBetween(String value1, String value2) {
            addCriterion("u_state not between", value1, value2, "uState");
            return (Criteria) this;
        }

        public Criteria andUBalanceIsNull() {
            addCriterion("u_balance is null");
            return (Criteria) this;
        }

        public Criteria andUBalanceIsNotNull() {
            addCriterion("u_balance is not null");
            return (Criteria) this;
        }

        public Criteria andUBalanceEqualTo(BigDecimal value) {
            addCriterion("u_balance =", value, "uBalance");
            return (Criteria) this;
        }

        public Criteria andUBalanceNotEqualTo(BigDecimal value) {
            addCriterion("u_balance <>", value, "uBalance");
            return (Criteria) this;
        }

        public Criteria andUBalanceGreaterThan(BigDecimal value) {
            addCriterion("u_balance >", value, "uBalance");
            return (Criteria) this;
        }

        public Criteria andUBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("u_balance >=", value, "uBalance");
            return (Criteria) this;
        }

        public Criteria andUBalanceLessThan(BigDecimal value) {
            addCriterion("u_balance <", value, "uBalance");
            return (Criteria) this;
        }

        public Criteria andUBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("u_balance <=", value, "uBalance");
            return (Criteria) this;
        }

        public Criteria andUBalanceIn(List<BigDecimal> values) {
            addCriterion("u_balance in", values, "uBalance");
            return (Criteria) this;
        }

        public Criteria andUBalanceNotIn(List<BigDecimal> values) {
            addCriterion("u_balance not in", values, "uBalance");
            return (Criteria) this;
        }

        public Criteria andUBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("u_balance between", value1, value2, "uBalance");
            return (Criteria) this;
        }

        public Criteria andUBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("u_balance not between", value1, value2, "uBalance");
            return (Criteria) this;
        }

        public Criteria andUPrincipalIsNull() {
            addCriterion("u_principal is null");
            return (Criteria) this;
        }

        public Criteria andUPrincipalIsNotNull() {
            addCriterion("u_principal is not null");
            return (Criteria) this;
        }

        public Criteria andUPrincipalEqualTo(BigDecimal value) {
            addCriterion("u_principal =", value, "uPrincipal");
            return (Criteria) this;
        }

        public Criteria andUPrincipalNotEqualTo(BigDecimal value) {
            addCriterion("u_principal <>", value, "uPrincipal");
            return (Criteria) this;
        }

        public Criteria andUPrincipalGreaterThan(BigDecimal value) {
            addCriterion("u_principal >", value, "uPrincipal");
            return (Criteria) this;
        }

        public Criteria andUPrincipalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("u_principal >=", value, "uPrincipal");
            return (Criteria) this;
        }

        public Criteria andUPrincipalLessThan(BigDecimal value) {
            addCriterion("u_principal <", value, "uPrincipal");
            return (Criteria) this;
        }

        public Criteria andUPrincipalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("u_principal <=", value, "uPrincipal");
            return (Criteria) this;
        }

        public Criteria andUPrincipalIn(List<BigDecimal> values) {
            addCriterion("u_principal in", values, "uPrincipal");
            return (Criteria) this;
        }

        public Criteria andUPrincipalNotIn(List<BigDecimal> values) {
            addCriterion("u_principal not in", values, "uPrincipal");
            return (Criteria) this;
        }

        public Criteria andUPrincipalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("u_principal between", value1, value2, "uPrincipal");
            return (Criteria) this;
        }

        public Criteria andUPrincipalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("u_principal not between", value1, value2, "uPrincipal");
            return (Criteria) this;
        }

        public Criteria andUInterestIsNull() {
            addCriterion("u_interest is null");
            return (Criteria) this;
        }

        public Criteria andUInterestIsNotNull() {
            addCriterion("u_interest is not null");
            return (Criteria) this;
        }

        public Criteria andUInterestEqualTo(BigDecimal value) {
            addCriterion("u_interest =", value, "uInterest");
            return (Criteria) this;
        }

        public Criteria andUInterestNotEqualTo(BigDecimal value) {
            addCriterion("u_interest <>", value, "uInterest");
            return (Criteria) this;
        }

        public Criteria andUInterestGreaterThan(BigDecimal value) {
            addCriterion("u_interest >", value, "uInterest");
            return (Criteria) this;
        }

        public Criteria andUInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("u_interest >=", value, "uInterest");
            return (Criteria) this;
        }

        public Criteria andUInterestLessThan(BigDecimal value) {
            addCriterion("u_interest <", value, "uInterest");
            return (Criteria) this;
        }

        public Criteria andUInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("u_interest <=", value, "uInterest");
            return (Criteria) this;
        }

        public Criteria andUInterestIn(List<BigDecimal> values) {
            addCriterion("u_interest in", values, "uInterest");
            return (Criteria) this;
        }

        public Criteria andUInterestNotIn(List<BigDecimal> values) {
            addCriterion("u_interest not in", values, "uInterest");
            return (Criteria) this;
        }

        public Criteria andUInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("u_interest between", value1, value2, "uInterest");
            return (Criteria) this;
        }

        public Criteria andUInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("u_interest not between", value1, value2, "uInterest");
            return (Criteria) this;
        }

        public Criteria andUAddressIsNull() {
            addCriterion("u_address is null");
            return (Criteria) this;
        }

        public Criteria andUAddressIsNotNull() {
            addCriterion("u_address is not null");
            return (Criteria) this;
        }

        public Criteria andUAddressEqualTo(String value) {
            addCriterion("u_address =", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressNotEqualTo(String value) {
            addCriterion("u_address <>", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressGreaterThan(String value) {
            addCriterion("u_address >", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressGreaterThanOrEqualTo(String value) {
            addCriterion("u_address >=", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressLessThan(String value) {
            addCriterion("u_address <", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressLessThanOrEqualTo(String value) {
            addCriterion("u_address <=", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressLike(String value) {
            addCriterion("u_address like", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressNotLike(String value) {
            addCriterion("u_address not like", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressIn(List<String> values) {
            addCriterion("u_address in", values, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressNotIn(List<String> values) {
            addCriterion("u_address not in", values, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressBetween(String value1, String value2) {
            addCriterion("u_address between", value1, value2, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressNotBetween(String value1, String value2) {
            addCriterion("u_address not between", value1, value2, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUIdcardIsNull() {
            addCriterion("u_idcard is null");
            return (Criteria) this;
        }

        public Criteria andUIdcardIsNotNull() {
            addCriterion("u_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andUIdcardEqualTo(String value) {
            addCriterion("u_idcard =", value, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardNotEqualTo(String value) {
            addCriterion("u_idcard <>", value, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardGreaterThan(String value) {
            addCriterion("u_idcard >", value, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("u_idcard >=", value, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardLessThan(String value) {
            addCriterion("u_idcard <", value, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardLessThanOrEqualTo(String value) {
            addCriterion("u_idcard <=", value, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardLike(String value) {
            addCriterion("u_idcard like", value, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardNotLike(String value) {
            addCriterion("u_idcard not like", value, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardIn(List<String> values) {
            addCriterion("u_idcard in", values, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardNotIn(List<String> values) {
            addCriterion("u_idcard not in", values, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardBetween(String value1, String value2) {
            addCriterion("u_idcard between", value1, value2, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardNotBetween(String value1, String value2) {
            addCriterion("u_idcard not between", value1, value2, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUPaypasswordIsNull() {
            addCriterion("u_paypassword is null");
            return (Criteria) this;
        }

        public Criteria andUPaypasswordIsNotNull() {
            addCriterion("u_paypassword is not null");
            return (Criteria) this;
        }

        public Criteria andUPaypasswordEqualTo(String value) {
            addCriterion("u_paypassword =", value, "uPaypassword");
            return (Criteria) this;
        }

        public Criteria andUPaypasswordNotEqualTo(String value) {
            addCriterion("u_paypassword <>", value, "uPaypassword");
            return (Criteria) this;
        }

        public Criteria andUPaypasswordGreaterThan(String value) {
            addCriterion("u_paypassword >", value, "uPaypassword");
            return (Criteria) this;
        }

        public Criteria andUPaypasswordGreaterThanOrEqualTo(String value) {
            addCriterion("u_paypassword >=", value, "uPaypassword");
            return (Criteria) this;
        }

        public Criteria andUPaypasswordLessThan(String value) {
            addCriterion("u_paypassword <", value, "uPaypassword");
            return (Criteria) this;
        }

        public Criteria andUPaypasswordLessThanOrEqualTo(String value) {
            addCriterion("u_paypassword <=", value, "uPaypassword");
            return (Criteria) this;
        }

        public Criteria andUPaypasswordLike(String value) {
            addCriterion("u_paypassword like", value, "uPaypassword");
            return (Criteria) this;
        }

        public Criteria andUPaypasswordNotLike(String value) {
            addCriterion("u_paypassword not like", value, "uPaypassword");
            return (Criteria) this;
        }

        public Criteria andUPaypasswordIn(List<String> values) {
            addCriterion("u_paypassword in", values, "uPaypassword");
            return (Criteria) this;
        }

        public Criteria andUPaypasswordNotIn(List<String> values) {
            addCriterion("u_paypassword not in", values, "uPaypassword");
            return (Criteria) this;
        }

        public Criteria andUPaypasswordBetween(String value1, String value2) {
            addCriterion("u_paypassword between", value1, value2, "uPaypassword");
            return (Criteria) this;
        }

        public Criteria andUPaypasswordNotBetween(String value1, String value2) {
            addCriterion("u_paypassword not between", value1, value2, "uPaypassword");
            return (Criteria) this;
        }

        public Criteria andUCreditworthIsNull() {
            addCriterion("u_creditworth is null");
            return (Criteria) this;
        }

        public Criteria andUCreditworthIsNotNull() {
            addCriterion("u_creditworth is not null");
            return (Criteria) this;
        }

        public Criteria andUCreditworthEqualTo(Integer value) {
            addCriterion("u_creditworth =", value, "uCreditworth");
            return (Criteria) this;
        }

        public Criteria andUCreditworthNotEqualTo(Integer value) {
            addCriterion("u_creditworth <>", value, "uCreditworth");
            return (Criteria) this;
        }

        public Criteria andUCreditworthGreaterThan(Integer value) {
            addCriterion("u_creditworth >", value, "uCreditworth");
            return (Criteria) this;
        }

        public Criteria andUCreditworthGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_creditworth >=", value, "uCreditworth");
            return (Criteria) this;
        }

        public Criteria andUCreditworthLessThan(Integer value) {
            addCriterion("u_creditworth <", value, "uCreditworth");
            return (Criteria) this;
        }

        public Criteria andUCreditworthLessThanOrEqualTo(Integer value) {
            addCriterion("u_creditworth <=", value, "uCreditworth");
            return (Criteria) this;
        }

        public Criteria andUCreditworthIn(List<Integer> values) {
            addCriterion("u_creditworth in", values, "uCreditworth");
            return (Criteria) this;
        }

        public Criteria andUCreditworthNotIn(List<Integer> values) {
            addCriterion("u_creditworth not in", values, "uCreditworth");
            return (Criteria) this;
        }

        public Criteria andUCreditworthBetween(Integer value1, Integer value2) {
            addCriterion("u_creditworth between", value1, value2, "uCreditworth");
            return (Criteria) this;
        }

        public Criteria andUCreditworthNotBetween(Integer value1, Integer value2) {
            addCriterion("u_creditworth not between", value1, value2, "uCreditworth");
            return (Criteria) this;
        }

        public Criteria andURealnameIsNull() {
            addCriterion("u_realname is null");
            return (Criteria) this;
        }

        public Criteria andURealnameIsNotNull() {
            addCriterion("u_realname is not null");
            return (Criteria) this;
        }

        public Criteria andURealnameEqualTo(String value) {
            addCriterion("u_realname =", value, "uRealname");
            return (Criteria) this;
        }

        public Criteria andURealnameNotEqualTo(String value) {
            addCriterion("u_realname <>", value, "uRealname");
            return (Criteria) this;
        }

        public Criteria andURealnameGreaterThan(String value) {
            addCriterion("u_realname >", value, "uRealname");
            return (Criteria) this;
        }

        public Criteria andURealnameGreaterThanOrEqualTo(String value) {
            addCriterion("u_realname >=", value, "uRealname");
            return (Criteria) this;
        }

        public Criteria andURealnameLessThan(String value) {
            addCriterion("u_realname <", value, "uRealname");
            return (Criteria) this;
        }

        public Criteria andURealnameLessThanOrEqualTo(String value) {
            addCriterion("u_realname <=", value, "uRealname");
            return (Criteria) this;
        }

        public Criteria andURealnameLike(String value) {
            addCriterion("u_realname like", value, "uRealname");
            return (Criteria) this;
        }

        public Criteria andURealnameNotLike(String value) {
            addCriterion("u_realname not like", value, "uRealname");
            return (Criteria) this;
        }

        public Criteria andURealnameIn(List<String> values) {
            addCriterion("u_realname in", values, "uRealname");
            return (Criteria) this;
        }

        public Criteria andURealnameNotIn(List<String> values) {
            addCriterion("u_realname not in", values, "uRealname");
            return (Criteria) this;
        }

        public Criteria andURealnameBetween(String value1, String value2) {
            addCriterion("u_realname between", value1, value2, "uRealname");
            return (Criteria) this;
        }

        public Criteria andURealnameNotBetween(String value1, String value2) {
            addCriterion("u_realname not between", value1, value2, "uRealname");
            return (Criteria) this;
        }

        public Criteria andUSexIsNull() {
            addCriterion("u_sex is null");
            return (Criteria) this;
        }

        public Criteria andUSexIsNotNull() {
            addCriterion("u_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUSexEqualTo(String value) {
            addCriterion("u_sex =", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotEqualTo(String value) {
            addCriterion("u_sex <>", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexGreaterThan(String value) {
            addCriterion("u_sex >", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexGreaterThanOrEqualTo(String value) {
            addCriterion("u_sex >=", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLessThan(String value) {
            addCriterion("u_sex <", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLessThanOrEqualTo(String value) {
            addCriterion("u_sex <=", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLike(String value) {
            addCriterion("u_sex like", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotLike(String value) {
            addCriterion("u_sex not like", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexIn(List<String> values) {
            addCriterion("u_sex in", values, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotIn(List<String> values) {
            addCriterion("u_sex not in", values, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexBetween(String value1, String value2) {
            addCriterion("u_sex between", value1, value2, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotBetween(String value1, String value2) {
            addCriterion("u_sex not between", value1, value2, "uSex");
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