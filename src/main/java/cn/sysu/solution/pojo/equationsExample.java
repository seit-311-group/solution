package cn.sysu.solution.pojo;

import java.util.ArrayList;
import java.util.List;

public class equationsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public equationsExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEquationIsNull() {
            addCriterion("equation is null");
            return (Criteria) this;
        }

        public Criteria andEquationIsNotNull() {
            addCriterion("equation is not null");
            return (Criteria) this;
        }

        public Criteria andEquationEqualTo(String value) {
            addCriterion("equation =", value, "equation");
            return (Criteria) this;
        }

        public Criteria andEquationNotEqualTo(String value) {
            addCriterion("equation <>", value, "equation");
            return (Criteria) this;
        }

        public Criteria andEquationGreaterThan(String value) {
            addCriterion("equation >", value, "equation");
            return (Criteria) this;
        }

        public Criteria andEquationGreaterThanOrEqualTo(String value) {
            addCriterion("equation >=", value, "equation");
            return (Criteria) this;
        }

        public Criteria andEquationLessThan(String value) {
            addCriterion("equation <", value, "equation");
            return (Criteria) this;
        }

        public Criteria andEquationLessThanOrEqualTo(String value) {
            addCriterion("equation <=", value, "equation");
            return (Criteria) this;
        }

        public Criteria andEquationLike(String value) {
            addCriterion("equation like", value, "equation");
            return (Criteria) this;
        }

        public Criteria andEquationNotLike(String value) {
            addCriterion("equation not like", value, "equation");
            return (Criteria) this;
        }

        public Criteria andEquationIn(List<String> values) {
            addCriterion("equation in", values, "equation");
            return (Criteria) this;
        }

        public Criteria andEquationNotIn(List<String> values) {
            addCriterion("equation not in", values, "equation");
            return (Criteria) this;
        }

        public Criteria andEquationBetween(String value1, String value2) {
            addCriterion("equation between", value1, value2, "equation");
            return (Criteria) this;
        }

        public Criteria andEquationNotBetween(String value1, String value2) {
            addCriterion("equation not between", value1, value2, "equation");
            return (Criteria) this;
        }

        public Criteria andQuantityidIsNull() {
            addCriterion("quantityID is null");
            return (Criteria) this;
        }

        public Criteria andQuantityidIsNotNull() {
            addCriterion("quantityID is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityidEqualTo(String value) {
            addCriterion("quantityID =", value, "quantityid");
            return (Criteria) this;
        }

        public Criteria andQuantityidNotEqualTo(String value) {
            addCriterion("quantityID <>", value, "quantityid");
            return (Criteria) this;
        }

        public Criteria andQuantityidGreaterThan(String value) {
            addCriterion("quantityID >", value, "quantityid");
            return (Criteria) this;
        }

        public Criteria andQuantityidGreaterThanOrEqualTo(String value) {
            addCriterion("quantityID >=", value, "quantityid");
            return (Criteria) this;
        }

        public Criteria andQuantityidLessThan(String value) {
            addCriterion("quantityID <", value, "quantityid");
            return (Criteria) this;
        }

        public Criteria andQuantityidLessThanOrEqualTo(String value) {
            addCriterion("quantityID <=", value, "quantityid");
            return (Criteria) this;
        }

        public Criteria andQuantityidLike(String value) {
            addCriterion("quantityID like", value, "quantityid");
            return (Criteria) this;
        }

        public Criteria andQuantityidNotLike(String value) {
            addCriterion("quantityID not like", value, "quantityid");
            return (Criteria) this;
        }

        public Criteria andQuantityidIn(List<String> values) {
            addCriterion("quantityID in", values, "quantityid");
            return (Criteria) this;
        }

        public Criteria andQuantityidNotIn(List<String> values) {
            addCriterion("quantityID not in", values, "quantityid");
            return (Criteria) this;
        }

        public Criteria andQuantityidBetween(String value1, String value2) {
            addCriterion("quantityID between", value1, value2, "quantityid");
            return (Criteria) this;
        }

        public Criteria andQuantityidNotBetween(String value1, String value2) {
            addCriterion("quantityID not between", value1, value2, "quantityid");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNull() {
            addCriterion("answer is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNotNull() {
            addCriterion("answer is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerEqualTo(String value) {
            addCriterion("answer =", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotEqualTo(String value) {
            addCriterion("answer <>", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThan(String value) {
            addCriterion("answer >", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("answer >=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThan(String value) {
            addCriterion("answer <", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThanOrEqualTo(String value) {
            addCriterion("answer <=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLike(String value) {
            addCriterion("answer like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotLike(String value) {
            addCriterion("answer not like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerIn(List<String> values) {
            addCriterion("answer in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotIn(List<String> values) {
            addCriterion("answer not in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerBetween(String value1, String value2) {
            addCriterion("answer between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotBetween(String value1, String value2) {
            addCriterion("answer not between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andRealequationIsNull() {
            addCriterion("realEquation is null");
            return (Criteria) this;
        }

        public Criteria andRealequationIsNotNull() {
            addCriterion("realEquation is not null");
            return (Criteria) this;
        }

        public Criteria andRealequationEqualTo(String value) {
            addCriterion("realEquation =", value, "realequation");
            return (Criteria) this;
        }

        public Criteria andRealequationNotEqualTo(String value) {
            addCriterion("realEquation <>", value, "realequation");
            return (Criteria) this;
        }

        public Criteria andRealequationGreaterThan(String value) {
            addCriterion("realEquation >", value, "realequation");
            return (Criteria) this;
        }

        public Criteria andRealequationGreaterThanOrEqualTo(String value) {
            addCriterion("realEquation >=", value, "realequation");
            return (Criteria) this;
        }

        public Criteria andRealequationLessThan(String value) {
            addCriterion("realEquation <", value, "realequation");
            return (Criteria) this;
        }

        public Criteria andRealequationLessThanOrEqualTo(String value) {
            addCriterion("realEquation <=", value, "realequation");
            return (Criteria) this;
        }

        public Criteria andRealequationLike(String value) {
            addCriterion("realEquation like", value, "realequation");
            return (Criteria) this;
        }

        public Criteria andRealequationNotLike(String value) {
            addCriterion("realEquation not like", value, "realequation");
            return (Criteria) this;
        }

        public Criteria andRealequationIn(List<String> values) {
            addCriterion("realEquation in", values, "realequation");
            return (Criteria) this;
        }

        public Criteria andRealequationNotIn(List<String> values) {
            addCriterion("realEquation not in", values, "realequation");
            return (Criteria) this;
        }

        public Criteria andRealequationBetween(String value1, String value2) {
            addCriterion("realEquation between", value1, value2, "realequation");
            return (Criteria) this;
        }

        public Criteria andRealequationNotBetween(String value1, String value2) {
            addCriterion("realEquation not between", value1, value2, "realequation");
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