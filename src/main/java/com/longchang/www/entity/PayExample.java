package com.longchang.www.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayExample() {
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

        public Criteria andPayidIsNull() {
            addCriterion("payId is null");
            return (Criteria) this;
        }

        public Criteria andPayidIsNotNull() {
            addCriterion("payId is not null");
            return (Criteria) this;
        }

        public Criteria andPayidEqualTo(Integer value) {
            addCriterion("payId =", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotEqualTo(Integer value) {
            addCriterion("payId <>", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidGreaterThan(Integer value) {
            addCriterion("payId >", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidGreaterThanOrEqualTo(Integer value) {
            addCriterion("payId >=", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidLessThan(Integer value) {
            addCriterion("payId <", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidLessThanOrEqualTo(Integer value) {
            addCriterion("payId <=", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidIn(List<Integer> values) {
            addCriterion("payId in", values, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotIn(List<Integer> values) {
            addCriterion("payId not in", values, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidBetween(Integer value1, Integer value2) {
            addCriterion("payId between", value1, value2, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotBetween(Integer value1, Integer value2) {
            addCriterion("payId not between", value1, value2, "payid");
            return (Criteria) this;
        }

        public Criteria andPaydateIsNull() {
            addCriterion("payDate is null");
            return (Criteria) this;
        }

        public Criteria andPaydateIsNotNull() {
            addCriterion("payDate is not null");
            return (Criteria) this;
        }

        public Criteria andPaydateEqualTo(Date value) {
            addCriterion("payDate =", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotEqualTo(Date value) {
            addCriterion("payDate <>", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateGreaterThan(Date value) {
            addCriterion("payDate >", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateGreaterThanOrEqualTo(Date value) {
            addCriterion("payDate >=", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateLessThan(Date value) {
            addCriterion("payDate <", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateLessThanOrEqualTo(Date value) {
            addCriterion("payDate <=", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateIn(List<Date> values) {
            addCriterion("payDate in", values, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotIn(List<Date> values) {
            addCriterion("payDate not in", values, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateBetween(Date value1, Date value2) {
            addCriterion("payDate between", value1, value2, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotBetween(Date value1, Date value2) {
            addCriterion("payDate not between", value1, value2, "paydate");
            return (Criteria) this;
        }

        public Criteria andPayorbackIsNull() {
            addCriterion("payOrBack is null");
            return (Criteria) this;
        }

        public Criteria andPayorbackIsNotNull() {
            addCriterion("payOrBack is not null");
            return (Criteria) this;
        }

        public Criteria andPayorbackEqualTo(Integer value) {
            addCriterion("payOrBack =", value, "payorback");
            return (Criteria) this;
        }

        public Criteria andPayorbackNotEqualTo(Integer value) {
            addCriterion("payOrBack <>", value, "payorback");
            return (Criteria) this;
        }

        public Criteria andPayorbackGreaterThan(Integer value) {
            addCriterion("payOrBack >", value, "payorback");
            return (Criteria) this;
        }

        public Criteria andPayorbackGreaterThanOrEqualTo(Integer value) {
            addCriterion("payOrBack >=", value, "payorback");
            return (Criteria) this;
        }

        public Criteria andPayorbackLessThan(Integer value) {
            addCriterion("payOrBack <", value, "payorback");
            return (Criteria) this;
        }

        public Criteria andPayorbackLessThanOrEqualTo(Integer value) {
            addCriterion("payOrBack <=", value, "payorback");
            return (Criteria) this;
        }

        public Criteria andPayorbackIn(List<Integer> values) {
            addCriterion("payOrBack in", values, "payorback");
            return (Criteria) this;
        }

        public Criteria andPayorbackNotIn(List<Integer> values) {
            addCriterion("payOrBack not in", values, "payorback");
            return (Criteria) this;
        }

        public Criteria andPayorbackBetween(Integer value1, Integer value2) {
            addCriterion("payOrBack between", value1, value2, "payorback");
            return (Criteria) this;
        }

        public Criteria andPayorbackNotBetween(Integer value1, Integer value2) {
            addCriterion("payOrBack not between", value1, value2, "payorback");
            return (Criteria) this;
        }

        public Criteria andPaymonenyIsNull() {
            addCriterion("payMoneny is null");
            return (Criteria) this;
        }

        public Criteria andPaymonenyIsNotNull() {
            addCriterion("payMoneny is not null");
            return (Criteria) this;
        }

        public Criteria andPaymonenyEqualTo(Integer value) {
            addCriterion("payMoneny =", value, "paymoneny");
            return (Criteria) this;
        }

        public Criteria andPaymonenyNotEqualTo(Integer value) {
            addCriterion("payMoneny <>", value, "paymoneny");
            return (Criteria) this;
        }

        public Criteria andPaymonenyGreaterThan(Integer value) {
            addCriterion("payMoneny >", value, "paymoneny");
            return (Criteria) this;
        }

        public Criteria andPaymonenyGreaterThanOrEqualTo(Integer value) {
            addCriterion("payMoneny >=", value, "paymoneny");
            return (Criteria) this;
        }

        public Criteria andPaymonenyLessThan(Integer value) {
            addCriterion("payMoneny <", value, "paymoneny");
            return (Criteria) this;
        }

        public Criteria andPaymonenyLessThanOrEqualTo(Integer value) {
            addCriterion("payMoneny <=", value, "paymoneny");
            return (Criteria) this;
        }

        public Criteria andPaymonenyIn(List<Integer> values) {
            addCriterion("payMoneny in", values, "paymoneny");
            return (Criteria) this;
        }

        public Criteria andPaymonenyNotIn(List<Integer> values) {
            addCriterion("payMoneny not in", values, "paymoneny");
            return (Criteria) this;
        }

        public Criteria andPaymonenyBetween(Integer value1, Integer value2) {
            addCriterion("payMoneny between", value1, value2, "paymoneny");
            return (Criteria) this;
        }

        public Criteria andPaymonenyNotBetween(Integer value1, Integer value2) {
            addCriterion("payMoneny not between", value1, value2, "paymoneny");
            return (Criteria) this;
        }

        public Criteria andPaystatusIsNull() {
            addCriterion("payStatus is null");
            return (Criteria) this;
        }

        public Criteria andPaystatusIsNotNull() {
            addCriterion("payStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPaystatusEqualTo(Integer value) {
            addCriterion("payStatus =", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotEqualTo(Integer value) {
            addCriterion("payStatus <>", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusGreaterThan(Integer value) {
            addCriterion("payStatus >", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("payStatus >=", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusLessThan(Integer value) {
            addCriterion("payStatus <", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusLessThanOrEqualTo(Integer value) {
            addCriterion("payStatus <=", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusIn(List<Integer> values) {
            addCriterion("payStatus in", values, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotIn(List<Integer> values) {
            addCriterion("payStatus not in", values, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusBetween(Integer value1, Integer value2) {
            addCriterion("payStatus between", value1, value2, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotBetween(Integer value1, Integer value2) {
            addCriterion("payStatus not between", value1, value2, "paystatus");
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