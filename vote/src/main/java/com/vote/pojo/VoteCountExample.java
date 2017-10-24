package com.vote.pojo;

import java.util.ArrayList;
import java.util.List;

public class VoteCountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VoteCountExample() {
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

        public Criteria andVoteCountIdIsNull() {
            addCriterion("vote_count_id is null");
            return (Criteria) this;
        }

        public Criteria andVoteCountIdIsNotNull() {
            addCriterion("vote_count_id is not null");
            return (Criteria) this;
        }

        public Criteria andVoteCountIdEqualTo(Integer value) {
            addCriterion("vote_count_id =", value, "voteCountId");
            return (Criteria) this;
        }

        public Criteria andVoteCountIdNotEqualTo(Integer value) {
            addCriterion("vote_count_id <>", value, "voteCountId");
            return (Criteria) this;
        }

        public Criteria andVoteCountIdGreaterThan(Integer value) {
            addCriterion("vote_count_id >", value, "voteCountId");
            return (Criteria) this;
        }

        public Criteria andVoteCountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vote_count_id >=", value, "voteCountId");
            return (Criteria) this;
        }

        public Criteria andVoteCountIdLessThan(Integer value) {
            addCriterion("vote_count_id <", value, "voteCountId");
            return (Criteria) this;
        }

        public Criteria andVoteCountIdLessThanOrEqualTo(Integer value) {
            addCriterion("vote_count_id <=", value, "voteCountId");
            return (Criteria) this;
        }

        public Criteria andVoteCountIdIn(List<Integer> values) {
            addCriterion("vote_count_id in", values, "voteCountId");
            return (Criteria) this;
        }

        public Criteria andVoteCountIdNotIn(List<Integer> values) {
            addCriterion("vote_count_id not in", values, "voteCountId");
            return (Criteria) this;
        }

        public Criteria andVoteCountIdBetween(Integer value1, Integer value2) {
            addCriterion("vote_count_id between", value1, value2, "voteCountId");
            return (Criteria) this;
        }

        public Criteria andVoteCountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vote_count_id not between", value1, value2, "voteCountId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Integer value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Integer value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Integer value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Integer value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Integer value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Integer> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Integer> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Integer value1, Integer value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandCountIsNull() {
            addCriterion("brand_count is null");
            return (Criteria) this;
        }

        public Criteria andBrandCountIsNotNull() {
            addCriterion("brand_count is not null");
            return (Criteria) this;
        }

        public Criteria andBrandCountEqualTo(Integer value) {
            addCriterion("brand_count =", value, "brandCount");
            return (Criteria) this;
        }

        public Criteria andBrandCountNotEqualTo(Integer value) {
            addCriterion("brand_count <>", value, "brandCount");
            return (Criteria) this;
        }

        public Criteria andBrandCountGreaterThan(Integer value) {
            addCriterion("brand_count >", value, "brandCount");
            return (Criteria) this;
        }

        public Criteria andBrandCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_count >=", value, "brandCount");
            return (Criteria) this;
        }

        public Criteria andBrandCountLessThan(Integer value) {
            addCriterion("brand_count <", value, "brandCount");
            return (Criteria) this;
        }

        public Criteria andBrandCountLessThanOrEqualTo(Integer value) {
            addCriterion("brand_count <=", value, "brandCount");
            return (Criteria) this;
        }

        public Criteria andBrandCountIn(List<Integer> values) {
            addCriterion("brand_count in", values, "brandCount");
            return (Criteria) this;
        }

        public Criteria andBrandCountNotIn(List<Integer> values) {
            addCriterion("brand_count not in", values, "brandCount");
            return (Criteria) this;
        }

        public Criteria andBrandCountBetween(Integer value1, Integer value2) {
            addCriterion("brand_count between", value1, value2, "brandCount");
            return (Criteria) this;
        }

        public Criteria andBrandCountNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_count not between", value1, value2, "brandCount");
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