package com.longchang.www.entity;

import java.util.ArrayList;
import java.util.List;

public class ExtractmachineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExtractmachineExample() {
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

        public Criteria andExtractidIsNull() {
            addCriterion("extractId is null");
            return (Criteria) this;
        }

        public Criteria andExtractidIsNotNull() {
            addCriterion("extractId is not null");
            return (Criteria) this;
        }

        public Criteria andExtractidEqualTo(Integer value) {
            addCriterion("extractId =", value, "extractid");
            return (Criteria) this;
        }

        public Criteria andExtractidNotEqualTo(Integer value) {
            addCriterion("extractId <>", value, "extractid");
            return (Criteria) this;
        }

        public Criteria andExtractidGreaterThan(Integer value) {
            addCriterion("extractId >", value, "extractid");
            return (Criteria) this;
        }

        public Criteria andExtractidGreaterThanOrEqualTo(Integer value) {
            addCriterion("extractId >=", value, "extractid");
            return (Criteria) this;
        }

        public Criteria andExtractidLessThan(Integer value) {
            addCriterion("extractId <", value, "extractid");
            return (Criteria) this;
        }

        public Criteria andExtractidLessThanOrEqualTo(Integer value) {
            addCriterion("extractId <=", value, "extractid");
            return (Criteria) this;
        }

        public Criteria andExtractidIn(List<Integer> values) {
            addCriterion("extractId in", values, "extractid");
            return (Criteria) this;
        }

        public Criteria andExtractidNotIn(List<Integer> values) {
            addCriterion("extractId not in", values, "extractid");
            return (Criteria) this;
        }

        public Criteria andExtractidBetween(Integer value1, Integer value2) {
            addCriterion("extractId between", value1, value2, "extractid");
            return (Criteria) this;
        }

        public Criteria andExtractidNotBetween(Integer value1, Integer value2) {
            addCriterion("extractId not between", value1, value2, "extractid");
            return (Criteria) this;
        }

        public Criteria andExtractIsNull() {
            addCriterion("extract is null");
            return (Criteria) this;
        }

        public Criteria andExtractIsNotNull() {
            addCriterion("extract is not null");
            return (Criteria) this;
        }

        public Criteria andExtractEqualTo(Integer value) {
            addCriterion("extract =", value, "extract");
            return (Criteria) this;
        }

        public Criteria andExtractNotEqualTo(Integer value) {
            addCriterion("extract <>", value, "extract");
            return (Criteria) this;
        }

        public Criteria andExtractGreaterThan(Integer value) {
            addCriterion("extract >", value, "extract");
            return (Criteria) this;
        }

        public Criteria andExtractGreaterThanOrEqualTo(Integer value) {
            addCriterion("extract >=", value, "extract");
            return (Criteria) this;
        }

        public Criteria andExtractLessThan(Integer value) {
            addCriterion("extract <", value, "extract");
            return (Criteria) this;
        }

        public Criteria andExtractLessThanOrEqualTo(Integer value) {
            addCriterion("extract <=", value, "extract");
            return (Criteria) this;
        }

        public Criteria andExtractIn(List<Integer> values) {
            addCriterion("extract in", values, "extract");
            return (Criteria) this;
        }

        public Criteria andExtractNotIn(List<Integer> values) {
            addCriterion("extract not in", values, "extract");
            return (Criteria) this;
        }

        public Criteria andExtractBetween(Integer value1, Integer value2) {
            addCriterion("extract between", value1, value2, "extract");
            return (Criteria) this;
        }

        public Criteria andExtractNotBetween(Integer value1, Integer value2) {
            addCriterion("extract not between", value1, value2, "extract");
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