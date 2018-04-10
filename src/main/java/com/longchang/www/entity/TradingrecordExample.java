package com.longchang.www.entity;

import java.util.ArrayList;
import java.util.List;

public class TradingrecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TradingrecordExample() {
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

        public Criteria andTransactionidIsNull() {
            addCriterion("transactionId is null");
            return (Criteria) this;
        }

        public Criteria andTransactionidIsNotNull() {
            addCriterion("transactionId is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionidEqualTo(Integer value) {
            addCriterion("transactionId =", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidNotEqualTo(Integer value) {
            addCriterion("transactionId <>", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidGreaterThan(Integer value) {
            addCriterion("transactionId >", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("transactionId >=", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidLessThan(Integer value) {
            addCriterion("transactionId <", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidLessThanOrEqualTo(Integer value) {
            addCriterion("transactionId <=", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidIn(List<Integer> values) {
            addCriterion("transactionId in", values, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidNotIn(List<Integer> values) {
            addCriterion("transactionId not in", values, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidBetween(Integer value1, Integer value2) {
            addCriterion("transactionId between", value1, value2, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidNotBetween(Integer value1, Integer value2) {
            addCriterion("transactionId not between", value1, value2, "transactionid");
            return (Criteria) this;
        }

        public Criteria andMinemachinenameIsNull() {
            addCriterion("mineMachineName is null");
            return (Criteria) this;
        }

        public Criteria andMinemachinenameIsNotNull() {
            addCriterion("mineMachineName is not null");
            return (Criteria) this;
        }

        public Criteria andMinemachinenameEqualTo(String value) {
            addCriterion("mineMachineName =", value, "minemachinename");
            return (Criteria) this;
        }

        public Criteria andMinemachinenameNotEqualTo(String value) {
            addCriterion("mineMachineName <>", value, "minemachinename");
            return (Criteria) this;
        }

        public Criteria andMinemachinenameGreaterThan(String value) {
            addCriterion("mineMachineName >", value, "minemachinename");
            return (Criteria) this;
        }

        public Criteria andMinemachinenameGreaterThanOrEqualTo(String value) {
            addCriterion("mineMachineName >=", value, "minemachinename");
            return (Criteria) this;
        }

        public Criteria andMinemachinenameLessThan(String value) {
            addCriterion("mineMachineName <", value, "minemachinename");
            return (Criteria) this;
        }

        public Criteria andMinemachinenameLessThanOrEqualTo(String value) {
            addCriterion("mineMachineName <=", value, "minemachinename");
            return (Criteria) this;
        }

        public Criteria andMinemachinenameLike(String value) {
            addCriterion("mineMachineName like", value, "minemachinename");
            return (Criteria) this;
        }

        public Criteria andMinemachinenameNotLike(String value) {
            addCriterion("mineMachineName not like", value, "minemachinename");
            return (Criteria) this;
        }

        public Criteria andMinemachinenameIn(List<String> values) {
            addCriterion("mineMachineName in", values, "minemachinename");
            return (Criteria) this;
        }

        public Criteria andMinemachinenameNotIn(List<String> values) {
            addCriterion("mineMachineName not in", values, "minemachinename");
            return (Criteria) this;
        }

        public Criteria andMinemachinenameBetween(String value1, String value2) {
            addCriterion("mineMachineName between", value1, value2, "minemachinename");
            return (Criteria) this;
        }

        public Criteria andMinemachinenameNotBetween(String value1, String value2) {
            addCriterion("mineMachineName not between", value1, value2, "minemachinename");
            return (Criteria) this;
        }

        public Criteria andMinemachinepriceIsNull() {
            addCriterion("mineMachinePrice is null");
            return (Criteria) this;
        }

        public Criteria andMinemachinepriceIsNotNull() {
            addCriterion("mineMachinePrice is not null");
            return (Criteria) this;
        }

        public Criteria andMinemachinepriceEqualTo(Integer value) {
            addCriterion("mineMachinePrice =", value, "minemachineprice");
            return (Criteria) this;
        }

        public Criteria andMinemachinepriceNotEqualTo(Integer value) {
            addCriterion("mineMachinePrice <>", value, "minemachineprice");
            return (Criteria) this;
        }

        public Criteria andMinemachinepriceGreaterThan(Integer value) {
            addCriterion("mineMachinePrice >", value, "minemachineprice");
            return (Criteria) this;
        }

        public Criteria andMinemachinepriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("mineMachinePrice >=", value, "minemachineprice");
            return (Criteria) this;
        }

        public Criteria andMinemachinepriceLessThan(Integer value) {
            addCriterion("mineMachinePrice <", value, "minemachineprice");
            return (Criteria) this;
        }

        public Criteria andMinemachinepriceLessThanOrEqualTo(Integer value) {
            addCriterion("mineMachinePrice <=", value, "minemachineprice");
            return (Criteria) this;
        }

        public Criteria andMinemachinepriceIn(List<Integer> values) {
            addCriterion("mineMachinePrice in", values, "minemachineprice");
            return (Criteria) this;
        }

        public Criteria andMinemachinepriceNotIn(List<Integer> values) {
            addCriterion("mineMachinePrice not in", values, "minemachineprice");
            return (Criteria) this;
        }

        public Criteria andMinemachinepriceBetween(Integer value1, Integer value2) {
            addCriterion("mineMachinePrice between", value1, value2, "minemachineprice");
            return (Criteria) this;
        }

        public Criteria andMinemachinepriceNotBetween(Integer value1, Integer value2) {
            addCriterion("mineMachinePrice not between", value1, value2, "minemachineprice");
            return (Criteria) this;
        }

        public Criteria andMinemachinenoIsNull() {
            addCriterion("mineMachineNo is null");
            return (Criteria) this;
        }

        public Criteria andMinemachinenoIsNotNull() {
            addCriterion("mineMachineNo is not null");
            return (Criteria) this;
        }

        public Criteria andMinemachinenoEqualTo(String value) {
            addCriterion("mineMachineNo =", value, "minemachineno");
            return (Criteria) this;
        }

        public Criteria andMinemachinenoNotEqualTo(String value) {
            addCriterion("mineMachineNo <>", value, "minemachineno");
            return (Criteria) this;
        }

        public Criteria andMinemachinenoGreaterThan(String value) {
            addCriterion("mineMachineNo >", value, "minemachineno");
            return (Criteria) this;
        }

        public Criteria andMinemachinenoGreaterThanOrEqualTo(String value) {
            addCriterion("mineMachineNo >=", value, "minemachineno");
            return (Criteria) this;
        }

        public Criteria andMinemachinenoLessThan(String value) {
            addCriterion("mineMachineNo <", value, "minemachineno");
            return (Criteria) this;
        }

        public Criteria andMinemachinenoLessThanOrEqualTo(String value) {
            addCriterion("mineMachineNo <=", value, "minemachineno");
            return (Criteria) this;
        }

        public Criteria andMinemachinenoLike(String value) {
            addCriterion("mineMachineNo like", value, "minemachineno");
            return (Criteria) this;
        }

        public Criteria andMinemachinenoNotLike(String value) {
            addCriterion("mineMachineNo not like", value, "minemachineno");
            return (Criteria) this;
        }

        public Criteria andMinemachinenoIn(List<String> values) {
            addCriterion("mineMachineNo in", values, "minemachineno");
            return (Criteria) this;
        }

        public Criteria andMinemachinenoNotIn(List<String> values) {
            addCriterion("mineMachineNo not in", values, "minemachineno");
            return (Criteria) this;
        }

        public Criteria andMinemachinenoBetween(String value1, String value2) {
            addCriterion("mineMachineNo between", value1, value2, "minemachineno");
            return (Criteria) this;
        }

        public Criteria andMinemachinenoNotBetween(String value1, String value2) {
            addCriterion("mineMachineNo not between", value1, value2, "minemachineno");
            return (Criteria) this;
        }

        public Criteria andMinemachineownerIsNull() {
            addCriterion("mineMachineOwner is null");
            return (Criteria) this;
        }

        public Criteria andMinemachineownerIsNotNull() {
            addCriterion("mineMachineOwner is not null");
            return (Criteria) this;
        }

        public Criteria andMinemachineownerEqualTo(Integer value) {
            addCriterion("mineMachineOwner =", value, "minemachineowner");
            return (Criteria) this;
        }

        public Criteria andMinemachineownerNotEqualTo(Integer value) {
            addCriterion("mineMachineOwner <>", value, "minemachineowner");
            return (Criteria) this;
        }

        public Criteria andMinemachineownerGreaterThan(Integer value) {
            addCriterion("mineMachineOwner >", value, "minemachineowner");
            return (Criteria) this;
        }

        public Criteria andMinemachineownerGreaterThanOrEqualTo(Integer value) {
            addCriterion("mineMachineOwner >=", value, "minemachineowner");
            return (Criteria) this;
        }

        public Criteria andMinemachineownerLessThan(Integer value) {
            addCriterion("mineMachineOwner <", value, "minemachineowner");
            return (Criteria) this;
        }

        public Criteria andMinemachineownerLessThanOrEqualTo(Integer value) {
            addCriterion("mineMachineOwner <=", value, "minemachineowner");
            return (Criteria) this;
        }

        public Criteria andMinemachineownerIn(List<Integer> values) {
            addCriterion("mineMachineOwner in", values, "minemachineowner");
            return (Criteria) this;
        }

        public Criteria andMinemachineownerNotIn(List<Integer> values) {
            addCriterion("mineMachineOwner not in", values, "minemachineowner");
            return (Criteria) this;
        }

        public Criteria andMinemachineownerBetween(Integer value1, Integer value2) {
            addCriterion("mineMachineOwner between", value1, value2, "minemachineowner");
            return (Criteria) this;
        }

        public Criteria andMinemachineownerNotBetween(Integer value1, Integer value2) {
            addCriterion("mineMachineOwner not between", value1, value2, "minemachineowner");
            return (Criteria) this;
        }

        public Criteria andBuysellstatusIsNull() {
            addCriterion("buySellStatus is null");
            return (Criteria) this;
        }

        public Criteria andBuysellstatusIsNotNull() {
            addCriterion("buySellStatus is not null");
            return (Criteria) this;
        }

        public Criteria andBuysellstatusEqualTo(Integer value) {
            addCriterion("buySellStatus =", value, "buysellstatus");
            return (Criteria) this;
        }

        public Criteria andBuysellstatusNotEqualTo(Integer value) {
            addCriterion("buySellStatus <>", value, "buysellstatus");
            return (Criteria) this;
        }

        public Criteria andBuysellstatusGreaterThan(Integer value) {
            addCriterion("buySellStatus >", value, "buysellstatus");
            return (Criteria) this;
        }

        public Criteria andBuysellstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("buySellStatus >=", value, "buysellstatus");
            return (Criteria) this;
        }

        public Criteria andBuysellstatusLessThan(Integer value) {
            addCriterion("buySellStatus <", value, "buysellstatus");
            return (Criteria) this;
        }

        public Criteria andBuysellstatusLessThanOrEqualTo(Integer value) {
            addCriterion("buySellStatus <=", value, "buysellstatus");
            return (Criteria) this;
        }

        public Criteria andBuysellstatusIn(List<Integer> values) {
            addCriterion("buySellStatus in", values, "buysellstatus");
            return (Criteria) this;
        }

        public Criteria andBuysellstatusNotIn(List<Integer> values) {
            addCriterion("buySellStatus not in", values, "buysellstatus");
            return (Criteria) this;
        }

        public Criteria andBuysellstatusBetween(Integer value1, Integer value2) {
            addCriterion("buySellStatus between", value1, value2, "buysellstatus");
            return (Criteria) this;
        }

        public Criteria andBuysellstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("buySellStatus not between", value1, value2, "buysellstatus");
            return (Criteria) this;
        }

        public Criteria andBargainstatusIsNull() {
            addCriterion("bargainStatus is null");
            return (Criteria) this;
        }

        public Criteria andBargainstatusIsNotNull() {
            addCriterion("bargainStatus is not null");
            return (Criteria) this;
        }

        public Criteria andBargainstatusEqualTo(Integer value) {
            addCriterion("bargainStatus =", value, "bargainstatus");
            return (Criteria) this;
        }

        public Criteria andBargainstatusNotEqualTo(Integer value) {
            addCriterion("bargainStatus <>", value, "bargainstatus");
            return (Criteria) this;
        }

        public Criteria andBargainstatusGreaterThan(Integer value) {
            addCriterion("bargainStatus >", value, "bargainstatus");
            return (Criteria) this;
        }

        public Criteria andBargainstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("bargainStatus >=", value, "bargainstatus");
            return (Criteria) this;
        }

        public Criteria andBargainstatusLessThan(Integer value) {
            addCriterion("bargainStatus <", value, "bargainstatus");
            return (Criteria) this;
        }

        public Criteria andBargainstatusLessThanOrEqualTo(Integer value) {
            addCriterion("bargainStatus <=", value, "bargainstatus");
            return (Criteria) this;
        }

        public Criteria andBargainstatusIn(List<Integer> values) {
            addCriterion("bargainStatus in", values, "bargainstatus");
            return (Criteria) this;
        }

        public Criteria andBargainstatusNotIn(List<Integer> values) {
            addCriterion("bargainStatus not in", values, "bargainstatus");
            return (Criteria) this;
        }

        public Criteria andBargainstatusBetween(Integer value1, Integer value2) {
            addCriterion("bargainStatus between", value1, value2, "bargainstatus");
            return (Criteria) this;
        }

        public Criteria andBargainstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("bargainStatus not between", value1, value2, "bargainstatus");
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