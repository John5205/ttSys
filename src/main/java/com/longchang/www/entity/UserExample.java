package com.longchang.www.entity;

import java.util.ArrayList;
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

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPhonenoIsNull() {
            addCriterion("phoneNo is null");
            return (Criteria) this;
        }

        public Criteria andPhonenoIsNotNull() {
            addCriterion("phoneNo is not null");
            return (Criteria) this;
        }

        public Criteria andPhonenoEqualTo(Integer value) {
            addCriterion("phoneNo =", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoNotEqualTo(Integer value) {
            addCriterion("phoneNo <>", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoGreaterThan(Integer value) {
            addCriterion("phoneNo >", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoGreaterThanOrEqualTo(Integer value) {
            addCriterion("phoneNo >=", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoLessThan(Integer value) {
            addCriterion("phoneNo <", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoLessThanOrEqualTo(Integer value) {
            addCriterion("phoneNo <=", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoIn(List<Integer> values) {
            addCriterion("phoneNo in", values, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoNotIn(List<Integer> values) {
            addCriterion("phoneNo not in", values, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoBetween(Integer value1, Integer value2) {
            addCriterion("phoneNo between", value1, value2, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoNotBetween(Integer value1, Integer value2) {
            addCriterion("phoneNo not between", value1, value2, "phoneno");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andIdentitynoIsNull() {
            addCriterion("identityNo is null");
            return (Criteria) this;
        }

        public Criteria andIdentitynoIsNotNull() {
            addCriterion("identityNo is not null");
            return (Criteria) this;
        }

        public Criteria andIdentitynoEqualTo(String value) {
            addCriterion("identityNo =", value, "identityno");
            return (Criteria) this;
        }

        public Criteria andIdentitynoNotEqualTo(String value) {
            addCriterion("identityNo <>", value, "identityno");
            return (Criteria) this;
        }

        public Criteria andIdentitynoGreaterThan(String value) {
            addCriterion("identityNo >", value, "identityno");
            return (Criteria) this;
        }

        public Criteria andIdentitynoGreaterThanOrEqualTo(String value) {
            addCriterion("identityNo >=", value, "identityno");
            return (Criteria) this;
        }

        public Criteria andIdentitynoLessThan(String value) {
            addCriterion("identityNo <", value, "identityno");
            return (Criteria) this;
        }

        public Criteria andIdentitynoLessThanOrEqualTo(String value) {
            addCriterion("identityNo <=", value, "identityno");
            return (Criteria) this;
        }

        public Criteria andIdentitynoLike(String value) {
            addCriterion("identityNo like", value, "identityno");
            return (Criteria) this;
        }

        public Criteria andIdentitynoNotLike(String value) {
            addCriterion("identityNo not like", value, "identityno");
            return (Criteria) this;
        }

        public Criteria andIdentitynoIn(List<String> values) {
            addCriterion("identityNo in", values, "identityno");
            return (Criteria) this;
        }

        public Criteria andIdentitynoNotIn(List<String> values) {
            addCriterion("identityNo not in", values, "identityno");
            return (Criteria) this;
        }

        public Criteria andIdentitynoBetween(String value1, String value2) {
            addCriterion("identityNo between", value1, value2, "identityno");
            return (Criteria) this;
        }

        public Criteria andIdentitynoNotBetween(String value1, String value2) {
            addCriterion("identityNo not between", value1, value2, "identityno");
            return (Criteria) this;
        }

        public Criteria andAccountbalanceIsNull() {
            addCriterion("accountBalance is null");
            return (Criteria) this;
        }

        public Criteria andAccountbalanceIsNotNull() {
            addCriterion("accountBalance is not null");
            return (Criteria) this;
        }

        public Criteria andAccountbalanceEqualTo(Integer value) {
            addCriterion("accountBalance =", value, "accountbalance");
            return (Criteria) this;
        }

        public Criteria andAccountbalanceNotEqualTo(Integer value) {
            addCriterion("accountBalance <>", value, "accountbalance");
            return (Criteria) this;
        }

        public Criteria andAccountbalanceGreaterThan(Integer value) {
            addCriterion("accountBalance >", value, "accountbalance");
            return (Criteria) this;
        }

        public Criteria andAccountbalanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("accountBalance >=", value, "accountbalance");
            return (Criteria) this;
        }

        public Criteria andAccountbalanceLessThan(Integer value) {
            addCriterion("accountBalance <", value, "accountbalance");
            return (Criteria) this;
        }

        public Criteria andAccountbalanceLessThanOrEqualTo(Integer value) {
            addCriterion("accountBalance <=", value, "accountbalance");
            return (Criteria) this;
        }

        public Criteria andAccountbalanceIn(List<Integer> values) {
            addCriterion("accountBalance in", values, "accountbalance");
            return (Criteria) this;
        }

        public Criteria andAccountbalanceNotIn(List<Integer> values) {
            addCriterion("accountBalance not in", values, "accountbalance");
            return (Criteria) this;
        }

        public Criteria andAccountbalanceBetween(Integer value1, Integer value2) {
            addCriterion("accountBalance between", value1, value2, "accountbalance");
            return (Criteria) this;
        }

        public Criteria andAccountbalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("accountBalance not between", value1, value2, "accountbalance");
            return (Criteria) this;
        }

        public Criteria andHavemachinenoIsNull() {
            addCriterion("haveMachineNo is null");
            return (Criteria) this;
        }

        public Criteria andHavemachinenoIsNotNull() {
            addCriterion("haveMachineNo is not null");
            return (Criteria) this;
        }

        public Criteria andHavemachinenoEqualTo(Integer value) {
            addCriterion("haveMachineNo =", value, "havemachineno");
            return (Criteria) this;
        }

        public Criteria andHavemachinenoNotEqualTo(Integer value) {
            addCriterion("haveMachineNo <>", value, "havemachineno");
            return (Criteria) this;
        }

        public Criteria andHavemachinenoGreaterThan(Integer value) {
            addCriterion("haveMachineNo >", value, "havemachineno");
            return (Criteria) this;
        }

        public Criteria andHavemachinenoGreaterThanOrEqualTo(Integer value) {
            addCriterion("haveMachineNo >=", value, "havemachineno");
            return (Criteria) this;
        }

        public Criteria andHavemachinenoLessThan(Integer value) {
            addCriterion("haveMachineNo <", value, "havemachineno");
            return (Criteria) this;
        }

        public Criteria andHavemachinenoLessThanOrEqualTo(Integer value) {
            addCriterion("haveMachineNo <=", value, "havemachineno");
            return (Criteria) this;
        }

        public Criteria andHavemachinenoIn(List<Integer> values) {
            addCriterion("haveMachineNo in", values, "havemachineno");
            return (Criteria) this;
        }

        public Criteria andHavemachinenoNotIn(List<Integer> values) {
            addCriterion("haveMachineNo not in", values, "havemachineno");
            return (Criteria) this;
        }

        public Criteria andHavemachinenoBetween(Integer value1, Integer value2) {
            addCriterion("haveMachineNo between", value1, value2, "havemachineno");
            return (Criteria) this;
        }

        public Criteria andHavemachinenoNotBetween(Integer value1, Integer value2) {
            addCriterion("haveMachineNo not between", value1, value2, "havemachineno");
            return (Criteria) this;
        }

        public Criteria andMarkoneIsNull() {
            addCriterion("markOne is null");
            return (Criteria) this;
        }

        public Criteria andMarkoneIsNotNull() {
            addCriterion("markOne is not null");
            return (Criteria) this;
        }

        public Criteria andMarkoneEqualTo(String value) {
            addCriterion("markOne =", value, "markone");
            return (Criteria) this;
        }

        public Criteria andMarkoneNotEqualTo(String value) {
            addCriterion("markOne <>", value, "markone");
            return (Criteria) this;
        }

        public Criteria andMarkoneGreaterThan(String value) {
            addCriterion("markOne >", value, "markone");
            return (Criteria) this;
        }

        public Criteria andMarkoneGreaterThanOrEqualTo(String value) {
            addCriterion("markOne >=", value, "markone");
            return (Criteria) this;
        }

        public Criteria andMarkoneLessThan(String value) {
            addCriterion("markOne <", value, "markone");
            return (Criteria) this;
        }

        public Criteria andMarkoneLessThanOrEqualTo(String value) {
            addCriterion("markOne <=", value, "markone");
            return (Criteria) this;
        }

        public Criteria andMarkoneLike(String value) {
            addCriterion("markOne like", value, "markone");
            return (Criteria) this;
        }

        public Criteria andMarkoneNotLike(String value) {
            addCriterion("markOne not like", value, "markone");
            return (Criteria) this;
        }

        public Criteria andMarkoneIn(List<String> values) {
            addCriterion("markOne in", values, "markone");
            return (Criteria) this;
        }

        public Criteria andMarkoneNotIn(List<String> values) {
            addCriterion("markOne not in", values, "markone");
            return (Criteria) this;
        }

        public Criteria andMarkoneBetween(String value1, String value2) {
            addCriterion("markOne between", value1, value2, "markone");
            return (Criteria) this;
        }

        public Criteria andMarkoneNotBetween(String value1, String value2) {
            addCriterion("markOne not between", value1, value2, "markone");
            return (Criteria) this;
        }

        public Criteria andMarktwoIsNull() {
            addCriterion("markTwo is null");
            return (Criteria) this;
        }

        public Criteria andMarktwoIsNotNull() {
            addCriterion("markTwo is not null");
            return (Criteria) this;
        }

        public Criteria andMarktwoEqualTo(String value) {
            addCriterion("markTwo =", value, "marktwo");
            return (Criteria) this;
        }

        public Criteria andMarktwoNotEqualTo(String value) {
            addCriterion("markTwo <>", value, "marktwo");
            return (Criteria) this;
        }

        public Criteria andMarktwoGreaterThan(String value) {
            addCriterion("markTwo >", value, "marktwo");
            return (Criteria) this;
        }

        public Criteria andMarktwoGreaterThanOrEqualTo(String value) {
            addCriterion("markTwo >=", value, "marktwo");
            return (Criteria) this;
        }

        public Criteria andMarktwoLessThan(String value) {
            addCriterion("markTwo <", value, "marktwo");
            return (Criteria) this;
        }

        public Criteria andMarktwoLessThanOrEqualTo(String value) {
            addCriterion("markTwo <=", value, "marktwo");
            return (Criteria) this;
        }

        public Criteria andMarktwoLike(String value) {
            addCriterion("markTwo like", value, "marktwo");
            return (Criteria) this;
        }

        public Criteria andMarktwoNotLike(String value) {
            addCriterion("markTwo not like", value, "marktwo");
            return (Criteria) this;
        }

        public Criteria andMarktwoIn(List<String> values) {
            addCriterion("markTwo in", values, "marktwo");
            return (Criteria) this;
        }

        public Criteria andMarktwoNotIn(List<String> values) {
            addCriterion("markTwo not in", values, "marktwo");
            return (Criteria) this;
        }

        public Criteria andMarktwoBetween(String value1, String value2) {
            addCriterion("markTwo between", value1, value2, "marktwo");
            return (Criteria) this;
        }

        public Criteria andMarktwoNotBetween(String value1, String value2) {
            addCriterion("markTwo not between", value1, value2, "marktwo");
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