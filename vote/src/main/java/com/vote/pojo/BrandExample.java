package com.vote.pojo;

import java.util.ArrayList;
import java.util.List;

public class BrandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrandExample() {
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

        public Criteria andBrandNameIsNull() {
            addCriterion("brand_name is null");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNotNull() {
            addCriterion("brand_name is not null");
            return (Criteria) this;
        }

        public Criteria andBrandNameEqualTo(String value) {
            addCriterion("brand_name =", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotEqualTo(String value) {
            addCriterion("brand_name <>", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThan(String value) {
            addCriterion("brand_name >", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("brand_name >=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThan(String value) {
            addCriterion("brand_name <", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThanOrEqualTo(String value) {
            addCriterion("brand_name <=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLike(String value) {
            addCriterion("brand_name like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotLike(String value) {
            addCriterion("brand_name not like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameIn(List<String> values) {
            addCriterion("brand_name in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotIn(List<String> values) {
            addCriterion("brand_name not in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameBetween(String value1, String value2) {
            addCriterion("brand_name between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotBetween(String value1, String value2) {
            addCriterion("brand_name not between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandInfoIsNull() {
            addCriterion("brand_info is null");
            return (Criteria) this;
        }

        public Criteria andBrandInfoIsNotNull() {
            addCriterion("brand_info is not null");
            return (Criteria) this;
        }

        public Criteria andBrandInfoEqualTo(String value) {
            addCriterion("brand_info =", value, "brandInfo");
            return (Criteria) this;
        }

        public Criteria andBrandInfoNotEqualTo(String value) {
            addCriterion("brand_info <>", value, "brandInfo");
            return (Criteria) this;
        }

        public Criteria andBrandInfoGreaterThan(String value) {
            addCriterion("brand_info >", value, "brandInfo");
            return (Criteria) this;
        }

        public Criteria andBrandInfoGreaterThanOrEqualTo(String value) {
            addCriterion("brand_info >=", value, "brandInfo");
            return (Criteria) this;
        }

        public Criteria andBrandInfoLessThan(String value) {
            addCriterion("brand_info <", value, "brandInfo");
            return (Criteria) this;
        }

        public Criteria andBrandInfoLessThanOrEqualTo(String value) {
            addCriterion("brand_info <=", value, "brandInfo");
            return (Criteria) this;
        }

        public Criteria andBrandInfoLike(String value) {
            addCriterion("brand_info like", value, "brandInfo");
            return (Criteria) this;
        }

        public Criteria andBrandInfoNotLike(String value) {
            addCriterion("brand_info not like", value, "brandInfo");
            return (Criteria) this;
        }

        public Criteria andBrandInfoIn(List<String> values) {
            addCriterion("brand_info in", values, "brandInfo");
            return (Criteria) this;
        }

        public Criteria andBrandInfoNotIn(List<String> values) {
            addCriterion("brand_info not in", values, "brandInfo");
            return (Criteria) this;
        }

        public Criteria andBrandInfoBetween(String value1, String value2) {
            addCriterion("brand_info between", value1, value2, "brandInfo");
            return (Criteria) this;
        }

        public Criteria andBrandInfoNotBetween(String value1, String value2) {
            addCriterion("brand_info not between", value1, value2, "brandInfo");
            return (Criteria) this;
        }

        public Criteria andBrandPhotoIdIsNull() {
            addCriterion("brand_photo_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandPhotoIdIsNotNull() {
            addCriterion("brand_photo_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandPhotoIdEqualTo(Integer value) {
            addCriterion("brand_photo_id =", value, "brandPhotoId");
            return (Criteria) this;
        }

        public Criteria andBrandPhotoIdNotEqualTo(Integer value) {
            addCriterion("brand_photo_id <>", value, "brandPhotoId");
            return (Criteria) this;
        }

        public Criteria andBrandPhotoIdGreaterThan(Integer value) {
            addCriterion("brand_photo_id >", value, "brandPhotoId");
            return (Criteria) this;
        }

        public Criteria andBrandPhotoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_photo_id >=", value, "brandPhotoId");
            return (Criteria) this;
        }

        public Criteria andBrandPhotoIdLessThan(Integer value) {
            addCriterion("brand_photo_id <", value, "brandPhotoId");
            return (Criteria) this;
        }

        public Criteria andBrandPhotoIdLessThanOrEqualTo(Integer value) {
            addCriterion("brand_photo_id <=", value, "brandPhotoId");
            return (Criteria) this;
        }

        public Criteria andBrandPhotoIdIn(List<Integer> values) {
            addCriterion("brand_photo_id in", values, "brandPhotoId");
            return (Criteria) this;
        }

        public Criteria andBrandPhotoIdNotIn(List<Integer> values) {
            addCriterion("brand_photo_id not in", values, "brandPhotoId");
            return (Criteria) this;
        }

        public Criteria andBrandPhotoIdBetween(Integer value1, Integer value2) {
            addCriterion("brand_photo_id between", value1, value2, "brandPhotoId");
            return (Criteria) this;
        }

        public Criteria andBrandPhotoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_photo_id not between", value1, value2, "brandPhotoId");
            return (Criteria) this;
        }

        public Criteria andBrandVoteCountIsNull() {
            addCriterion("brand_vote_count is null");
            return (Criteria) this;
        }

        public Criteria andBrandVoteCountIsNotNull() {
            addCriterion("brand_vote_count is not null");
            return (Criteria) this;
        }

        public Criteria andBrandVoteCountEqualTo(Integer value) {
            addCriterion("brand_vote_count =", value, "brandVoteCount");
            return (Criteria) this;
        }

        public Criteria andBrandVoteCountNotEqualTo(Integer value) {
            addCriterion("brand_vote_count <>", value, "brandVoteCount");
            return (Criteria) this;
        }

        public Criteria andBrandVoteCountGreaterThan(Integer value) {
            addCriterion("brand_vote_count >", value, "brandVoteCount");
            return (Criteria) this;
        }

        public Criteria andBrandVoteCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_vote_count >=", value, "brandVoteCount");
            return (Criteria) this;
        }

        public Criteria andBrandVoteCountLessThan(Integer value) {
            addCriterion("brand_vote_count <", value, "brandVoteCount");
            return (Criteria) this;
        }

        public Criteria andBrandVoteCountLessThanOrEqualTo(Integer value) {
            addCriterion("brand_vote_count <=", value, "brandVoteCount");
            return (Criteria) this;
        }

        public Criteria andBrandVoteCountIn(List<Integer> values) {
            addCriterion("brand_vote_count in", values, "brandVoteCount");
            return (Criteria) this;
        }

        public Criteria andBrandVoteCountNotIn(List<Integer> values) {
            addCriterion("brand_vote_count not in", values, "brandVoteCount");
            return (Criteria) this;
        }

        public Criteria andBrandVoteCountBetween(Integer value1, Integer value2) {
            addCriterion("brand_vote_count between", value1, value2, "brandVoteCount");
            return (Criteria) this;
        }

        public Criteria andBrandVoteCountNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_vote_count not between", value1, value2, "brandVoteCount");
            return (Criteria) this;
        }

        public Criteria andBrandRankIsNull() {
            addCriterion("brand_rank is null");
            return (Criteria) this;
        }

        public Criteria andBrandRankIsNotNull() {
            addCriterion("brand_rank is not null");
            return (Criteria) this;
        }

        public Criteria andBrandRankEqualTo(Integer value) {
            addCriterion("brand_rank =", value, "brandRank");
            return (Criteria) this;
        }

        public Criteria andBrandRankNotEqualTo(Integer value) {
            addCriterion("brand_rank <>", value, "brandRank");
            return (Criteria) this;
        }

        public Criteria andBrandRankGreaterThan(Integer value) {
            addCriterion("brand_rank >", value, "brandRank");
            return (Criteria) this;
        }

        public Criteria andBrandRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_rank >=", value, "brandRank");
            return (Criteria) this;
        }

        public Criteria andBrandRankLessThan(Integer value) {
            addCriterion("brand_rank <", value, "brandRank");
            return (Criteria) this;
        }

        public Criteria andBrandRankLessThanOrEqualTo(Integer value) {
            addCriterion("brand_rank <=", value, "brandRank");
            return (Criteria) this;
        }

        public Criteria andBrandRankIn(List<Integer> values) {
            addCriterion("brand_rank in", values, "brandRank");
            return (Criteria) this;
        }

        public Criteria andBrandRankNotIn(List<Integer> values) {
            addCriterion("brand_rank not in", values, "brandRank");
            return (Criteria) this;
        }

        public Criteria andBrandRankBetween(Integer value1, Integer value2) {
            addCriterion("brand_rank between", value1, value2, "brandRank");
            return (Criteria) this;
        }

        public Criteria andBrandRankNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_rank not between", value1, value2, "brandRank");
            return (Criteria) this;
        }

        public Criteria andBrandTypeIsNull() {
            addCriterion("brand_type is null");
            return (Criteria) this;
        }

        public Criteria andBrandTypeIsNotNull() {
            addCriterion("brand_type is not null");
            return (Criteria) this;
        }

        public Criteria andBrandTypeEqualTo(String value) {
            addCriterion("brand_type =", value, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeNotEqualTo(String value) {
            addCriterion("brand_type <>", value, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeGreaterThan(String value) {
            addCriterion("brand_type >", value, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeGreaterThanOrEqualTo(String value) {
            addCriterion("brand_type >=", value, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeLessThan(String value) {
            addCriterion("brand_type <", value, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeLessThanOrEqualTo(String value) {
            addCriterion("brand_type <=", value, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeLike(String value) {
            addCriterion("brand_type like", value, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeNotLike(String value) {
            addCriterion("brand_type not like", value, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeIn(List<String> values) {
            addCriterion("brand_type in", values, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeNotIn(List<String> values) {
            addCriterion("brand_type not in", values, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeBetween(String value1, String value2) {
            addCriterion("brand_type between", value1, value2, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeNotBetween(String value1, String value2) {
            addCriterion("brand_type not between", value1, value2, "brandType");
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