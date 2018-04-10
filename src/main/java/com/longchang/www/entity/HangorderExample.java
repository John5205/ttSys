package com.longchang.www.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HangorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HangorderExample() {
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

        public Criteria andHangidIsNull() {
            addCriterion("hangId is null");
            return (Criteria) this;
        }

        public Criteria andHangidIsNotNull() {
            addCriterion("hangId is not null");
            return (Criteria) this;
        }

        public Criteria andHangidEqualTo(Integer value) {
            addCriterion("hangId =", value, "hangid");
            return (Criteria) this;
        }

        public Criteria andHangidNotEqualTo(Integer value) {
            addCriterion("hangId <>", value, "hangid");
            return (Criteria) this;
        }

        public Criteria andHangidGreaterThan(Integer value) {
            addCriterion("hangId >", value, "hangid");
            return (Criteria) this;
        }

        public Criteria andHangidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hangId >=", value, "hangid");
            return (Criteria) this;
        }

        public Criteria andHangidLessThan(Integer value) {
            addCriterion("hangId <", value, "hangid");
            return (Criteria) this;
        }

        public Criteria andHangidLessThanOrEqualTo(Integer value) {
            addCriterion("hangId <=", value, "hangid");
            return (Criteria) this;
        }

        public Criteria andHangidIn(List<Integer> values) {
            addCriterion("hangId in", values, "hangid");
            return (Criteria) this;
        }

        public Criteria andHangidNotIn(List<Integer> values) {
            addCriterion("hangId not in", values, "hangid");
            return (Criteria) this;
        }

        public Criteria andHangidBetween(Integer value1, Integer value2) {
            addCriterion("hangId between", value1, value2, "hangid");
            return (Criteria) this;
        }

        public Criteria andHangidNotBetween(Integer value1, Integer value2) {
            addCriterion("hangId not between", value1, value2, "hangid");
            return (Criteria) this;
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

        public Criteria andHangorderdateIsNull() {
            addCriterion("hangOrderDate is null");
            return (Criteria) this;
        }

        public Criteria andHangorderdateIsNotNull() {
            addCriterion("hangOrderDate is not null");
            return (Criteria) this;
        }

        public Criteria andHangorderdateEqualTo(Date value) {
            addCriterion("hangOrderDate =", value, "hangorderdate");
            return (Criteria) this;
        }

        public Criteria andHangorderdateNotEqualTo(Date value) {
            addCriterion("hangOrderDate <>", value, "hangorderdate");
            return (Criteria) this;
        }

        public Criteria andHangorderdateGreaterThan(Date value) {
            addCriterion("hangOrderDate >", value, "hangorderdate");
            return (Criteria) this;
        }

        public Criteria andHangorderdateGreaterThanOrEqualTo(Date value) {
            addCriterion("hangOrderDate >=", value, "hangorderdate");
            return (Criteria) this;
        }

        public Criteria andHangorderdateLessThan(Date value) {
            addCriterion("hangOrderDate <", value, "hangorderdate");
            return (Criteria) this;
        }

        public Criteria andHangorderdateLessThanOrEqualTo(Date value) {
            addCriterion("hangOrderDate <=", value, "hangorderdate");
            return (Criteria) this;
        }

        public Criteria andHangorderdateIn(List<Date> values) {
            addCriterion("hangOrderDate in", values, "hangorderdate");
            return (Criteria) this;
        }

        public Criteria andHangorderdateNotIn(List<Date> values) {
            addCriterion("hangOrderDate not in", values, "hangorderdate");
            return (Criteria) this;
        }

        public Criteria andHangorderdateBetween(Date value1, Date value2) {
            addCriterion("hangOrderDate between", value1, value2, "hangorderdate");
            return (Criteria) this;
        }

        public Criteria andHangorderdateNotBetween(Date value1, Date value2) {
            addCriterion("hangOrderDate not between", value1, value2, "hangorderdate");
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

        public Criteria andBuyselldirectionIsNull() {
            addCriterion("buySellDirection is null");
            return (Criteria) this;
        }

        public Criteria andBuyselldirectionIsNotNull() {
            addCriterion("buySellDirection is not null");
            return (Criteria) this;
        }

        public Criteria andBuyselldirectionEqualTo(Integer value) {
            addCriterion("buySellDirection =", value, "buyselldirection");
            return (Criteria) this;
        }

        public Criteria andBuyselldirectionNotEqualTo(Integer value) {
            addCriterion("buySellDirection <>", value, "buyselldirection");
            return (Criteria) this;
        }

        public Criteria andBuyselldirectionGreaterThan(Integer value) {
            addCriterion("buySellDirection >", value, "buyselldirection");
            return (Criteria) this;
        }

        public Criteria andBuyselldirectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("buySellDirection >=", value, "buyselldirection");
            return (Criteria) this;
        }

        public Criteria andBuyselldirectionLessThan(Integer value) {
            addCriterion("buySellDirection <", value, "buyselldirection");
            return (Criteria) this;
        }

        public Criteria andBuyselldirectionLessThanOrEqualTo(Integer value) {
            addCriterion("buySellDirection <=", value, "buyselldirection");
            return (Criteria) this;
        }

        public Criteria andBuyselldirectionIn(List<Integer> values) {
            addCriterion("buySellDirection in", values, "buyselldirection");
            return (Criteria) this;
        }

        public Criteria andBuyselldirectionNotIn(List<Integer> values) {
            addCriterion("buySellDirection not in", values, "buyselldirection");
            return (Criteria) this;
        }

        public Criteria andBuyselldirectionBetween(Integer value1, Integer value2) {
            addCriterion("buySellDirection between", value1, value2, "buyselldirection");
            return (Criteria) this;
        }

        public Criteria andBuyselldirectionNotBetween(Integer value1, Integer value2) {
            addCriterion("buySellDirection not between", value1, value2, "buyselldirection");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("price not between", value1, value2, "price");
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