package com.longchang.www.entity;

import java.util.ArrayList;
import java.util.List;

public class MinemachineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MinemachineExample() {
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

        public Criteria andMmidIsNull() {
            addCriterion("mmId is null");
            return (Criteria) this;
        }

        public Criteria andMmidIsNotNull() {
            addCriterion("mmId is not null");
            return (Criteria) this;
        }

        public Criteria andMmidEqualTo(Integer value) {
            addCriterion("mmId =", value, "mmid");
            return (Criteria) this;
        }

        public Criteria andMmidNotEqualTo(Integer value) {
            addCriterion("mmId <>", value, "mmid");
            return (Criteria) this;
        }

        public Criteria andMmidGreaterThan(Integer value) {
            addCriterion("mmId >", value, "mmid");
            return (Criteria) this;
        }

        public Criteria andMmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mmId >=", value, "mmid");
            return (Criteria) this;
        }

        public Criteria andMmidLessThan(Integer value) {
            addCriterion("mmId <", value, "mmid");
            return (Criteria) this;
        }

        public Criteria andMmidLessThanOrEqualTo(Integer value) {
            addCriterion("mmId <=", value, "mmid");
            return (Criteria) this;
        }

        public Criteria andMmidIn(List<Integer> values) {
            addCriterion("mmId in", values, "mmid");
            return (Criteria) this;
        }

        public Criteria andMmidNotIn(List<Integer> values) {
            addCriterion("mmId not in", values, "mmid");
            return (Criteria) this;
        }

        public Criteria andMmidBetween(Integer value1, Integer value2) {
            addCriterion("mmId between", value1, value2, "mmid");
            return (Criteria) this;
        }

        public Criteria andMmidNotBetween(Integer value1, Integer value2) {
            addCriterion("mmId not between", value1, value2, "mmid");
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