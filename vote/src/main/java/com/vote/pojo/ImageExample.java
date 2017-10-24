package com.vote.pojo;

import java.util.ArrayList;
import java.util.List;

public class ImageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImageExample() {
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

        public Criteria andImageIdIsNull() {
            addCriterion("image_id is null");
            return (Criteria) this;
        }

        public Criteria andImageIdIsNotNull() {
            addCriterion("image_id is not null");
            return (Criteria) this;
        }

        public Criteria andImageIdEqualTo(Integer value) {
            addCriterion("image_id =", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotEqualTo(Integer value) {
            addCriterion("image_id <>", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdGreaterThan(Integer value) {
            addCriterion("image_id >", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("image_id >=", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdLessThan(Integer value) {
            addCriterion("image_id <", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdLessThanOrEqualTo(Integer value) {
            addCriterion("image_id <=", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdIn(List<Integer> values) {
            addCriterion("image_id in", values, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotIn(List<Integer> values) {
            addCriterion("image_id not in", values, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdBetween(Integer value1, Integer value2) {
            addCriterion("image_id between", value1, value2, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("image_id not between", value1, value2, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageLogoIsNull() {
            addCriterion("image_logo is null");
            return (Criteria) this;
        }

        public Criteria andImageLogoIsNotNull() {
            addCriterion("image_logo is not null");
            return (Criteria) this;
        }

        public Criteria andImageLogoEqualTo(String value) {
            addCriterion("image_logo =", value, "imageLogo");
            return (Criteria) this;
        }

        public Criteria andImageLogoNotEqualTo(String value) {
            addCriterion("image_logo <>", value, "imageLogo");
            return (Criteria) this;
        }

        public Criteria andImageLogoGreaterThan(String value) {
            addCriterion("image_logo >", value, "imageLogo");
            return (Criteria) this;
        }

        public Criteria andImageLogoGreaterThanOrEqualTo(String value) {
            addCriterion("image_logo >=", value, "imageLogo");
            return (Criteria) this;
        }

        public Criteria andImageLogoLessThan(String value) {
            addCriterion("image_logo <", value, "imageLogo");
            return (Criteria) this;
        }

        public Criteria andImageLogoLessThanOrEqualTo(String value) {
            addCriterion("image_logo <=", value, "imageLogo");
            return (Criteria) this;
        }

        public Criteria andImageLogoLike(String value) {
            addCriterion("image_logo like", value, "imageLogo");
            return (Criteria) this;
        }

        public Criteria andImageLogoNotLike(String value) {
            addCriterion("image_logo not like", value, "imageLogo");
            return (Criteria) this;
        }

        public Criteria andImageLogoIn(List<String> values) {
            addCriterion("image_logo in", values, "imageLogo");
            return (Criteria) this;
        }

        public Criteria andImageLogoNotIn(List<String> values) {
            addCriterion("image_logo not in", values, "imageLogo");
            return (Criteria) this;
        }

        public Criteria andImageLogoBetween(String value1, String value2) {
            addCriterion("image_logo between", value1, value2, "imageLogo");
            return (Criteria) this;
        }

        public Criteria andImageLogoNotBetween(String value1, String value2) {
            addCriterion("image_logo not between", value1, value2, "imageLogo");
            return (Criteria) this;
        }

        public Criteria andImageInfo1IsNull() {
            addCriterion("image_info1 is null");
            return (Criteria) this;
        }

        public Criteria andImageInfo1IsNotNull() {
            addCriterion("image_info1 is not null");
            return (Criteria) this;
        }

        public Criteria andImageInfo1EqualTo(String value) {
            addCriterion("image_info1 =", value, "imageInfo1");
            return (Criteria) this;
        }

        public Criteria andImageInfo1NotEqualTo(String value) {
            addCriterion("image_info1 <>", value, "imageInfo1");
            return (Criteria) this;
        }

        public Criteria andImageInfo1GreaterThan(String value) {
            addCriterion("image_info1 >", value, "imageInfo1");
            return (Criteria) this;
        }

        public Criteria andImageInfo1GreaterThanOrEqualTo(String value) {
            addCriterion("image_info1 >=", value, "imageInfo1");
            return (Criteria) this;
        }

        public Criteria andImageInfo1LessThan(String value) {
            addCriterion("image_info1 <", value, "imageInfo1");
            return (Criteria) this;
        }

        public Criteria andImageInfo1LessThanOrEqualTo(String value) {
            addCriterion("image_info1 <=", value, "imageInfo1");
            return (Criteria) this;
        }

        public Criteria andImageInfo1Like(String value) {
            addCriterion("image_info1 like", value, "imageInfo1");
            return (Criteria) this;
        }

        public Criteria andImageInfo1NotLike(String value) {
            addCriterion("image_info1 not like", value, "imageInfo1");
            return (Criteria) this;
        }

        public Criteria andImageInfo1In(List<String> values) {
            addCriterion("image_info1 in", values, "imageInfo1");
            return (Criteria) this;
        }

        public Criteria andImageInfo1NotIn(List<String> values) {
            addCriterion("image_info1 not in", values, "imageInfo1");
            return (Criteria) this;
        }

        public Criteria andImageInfo1Between(String value1, String value2) {
            addCriterion("image_info1 between", value1, value2, "imageInfo1");
            return (Criteria) this;
        }

        public Criteria andImageInfo1NotBetween(String value1, String value2) {
            addCriterion("image_info1 not between", value1, value2, "imageInfo1");
            return (Criteria) this;
        }

        public Criteria andImageInfo2IsNull() {
            addCriterion("image_info2 is null");
            return (Criteria) this;
        }

        public Criteria andImageInfo2IsNotNull() {
            addCriterion("image_info2 is not null");
            return (Criteria) this;
        }

        public Criteria andImageInfo2EqualTo(String value) {
            addCriterion("image_info2 =", value, "imageInfo2");
            return (Criteria) this;
        }

        public Criteria andImageInfo2NotEqualTo(String value) {
            addCriterion("image_info2 <>", value, "imageInfo2");
            return (Criteria) this;
        }

        public Criteria andImageInfo2GreaterThan(String value) {
            addCriterion("image_info2 >", value, "imageInfo2");
            return (Criteria) this;
        }

        public Criteria andImageInfo2GreaterThanOrEqualTo(String value) {
            addCriterion("image_info2 >=", value, "imageInfo2");
            return (Criteria) this;
        }

        public Criteria andImageInfo2LessThan(String value) {
            addCriterion("image_info2 <", value, "imageInfo2");
            return (Criteria) this;
        }

        public Criteria andImageInfo2LessThanOrEqualTo(String value) {
            addCriterion("image_info2 <=", value, "imageInfo2");
            return (Criteria) this;
        }

        public Criteria andImageInfo2Like(String value) {
            addCriterion("image_info2 like", value, "imageInfo2");
            return (Criteria) this;
        }

        public Criteria andImageInfo2NotLike(String value) {
            addCriterion("image_info2 not like", value, "imageInfo2");
            return (Criteria) this;
        }

        public Criteria andImageInfo2In(List<String> values) {
            addCriterion("image_info2 in", values, "imageInfo2");
            return (Criteria) this;
        }

        public Criteria andImageInfo2NotIn(List<String> values) {
            addCriterion("image_info2 not in", values, "imageInfo2");
            return (Criteria) this;
        }

        public Criteria andImageInfo2Between(String value1, String value2) {
            addCriterion("image_info2 between", value1, value2, "imageInfo2");
            return (Criteria) this;
        }

        public Criteria andImageInfo2NotBetween(String value1, String value2) {
            addCriterion("image_info2 not between", value1, value2, "imageInfo2");
            return (Criteria) this;
        }

        public Criteria andImageInfo3IsNull() {
            addCriterion("image_info3 is null");
            return (Criteria) this;
        }

        public Criteria andImageInfo3IsNotNull() {
            addCriterion("image_info3 is not null");
            return (Criteria) this;
        }

        public Criteria andImageInfo3EqualTo(String value) {
            addCriterion("image_info3 =", value, "imageInfo3");
            return (Criteria) this;
        }

        public Criteria andImageInfo3NotEqualTo(String value) {
            addCriterion("image_info3 <>", value, "imageInfo3");
            return (Criteria) this;
        }

        public Criteria andImageInfo3GreaterThan(String value) {
            addCriterion("image_info3 >", value, "imageInfo3");
            return (Criteria) this;
        }

        public Criteria andImageInfo3GreaterThanOrEqualTo(String value) {
            addCriterion("image_info3 >=", value, "imageInfo3");
            return (Criteria) this;
        }

        public Criteria andImageInfo3LessThan(String value) {
            addCriterion("image_info3 <", value, "imageInfo3");
            return (Criteria) this;
        }

        public Criteria andImageInfo3LessThanOrEqualTo(String value) {
            addCriterion("image_info3 <=", value, "imageInfo3");
            return (Criteria) this;
        }

        public Criteria andImageInfo3Like(String value) {
            addCriterion("image_info3 like", value, "imageInfo3");
            return (Criteria) this;
        }

        public Criteria andImageInfo3NotLike(String value) {
            addCriterion("image_info3 not like", value, "imageInfo3");
            return (Criteria) this;
        }

        public Criteria andImageInfo3In(List<String> values) {
            addCriterion("image_info3 in", values, "imageInfo3");
            return (Criteria) this;
        }

        public Criteria andImageInfo3NotIn(List<String> values) {
            addCriterion("image_info3 not in", values, "imageInfo3");
            return (Criteria) this;
        }

        public Criteria andImageInfo3Between(String value1, String value2) {
            addCriterion("image_info3 between", value1, value2, "imageInfo3");
            return (Criteria) this;
        }

        public Criteria andImageInfo3NotBetween(String value1, String value2) {
            addCriterion("image_info3 not between", value1, value2, "imageInfo3");
            return (Criteria) this;
        }

        public Criteria andImageInfo4IsNull() {
            addCriterion("image_info4 is null");
            return (Criteria) this;
        }

        public Criteria andImageInfo4IsNotNull() {
            addCriterion("image_info4 is not null");
            return (Criteria) this;
        }

        public Criteria andImageInfo4EqualTo(String value) {
            addCriterion("image_info4 =", value, "imageInfo4");
            return (Criteria) this;
        }

        public Criteria andImageInfo4NotEqualTo(String value) {
            addCriterion("image_info4 <>", value, "imageInfo4");
            return (Criteria) this;
        }

        public Criteria andImageInfo4GreaterThan(String value) {
            addCriterion("image_info4 >", value, "imageInfo4");
            return (Criteria) this;
        }

        public Criteria andImageInfo4GreaterThanOrEqualTo(String value) {
            addCriterion("image_info4 >=", value, "imageInfo4");
            return (Criteria) this;
        }

        public Criteria andImageInfo4LessThan(String value) {
            addCriterion("image_info4 <", value, "imageInfo4");
            return (Criteria) this;
        }

        public Criteria andImageInfo4LessThanOrEqualTo(String value) {
            addCriterion("image_info4 <=", value, "imageInfo4");
            return (Criteria) this;
        }

        public Criteria andImageInfo4Like(String value) {
            addCriterion("image_info4 like", value, "imageInfo4");
            return (Criteria) this;
        }

        public Criteria andImageInfo4NotLike(String value) {
            addCriterion("image_info4 not like", value, "imageInfo4");
            return (Criteria) this;
        }

        public Criteria andImageInfo4In(List<String> values) {
            addCriterion("image_info4 in", values, "imageInfo4");
            return (Criteria) this;
        }

        public Criteria andImageInfo4NotIn(List<String> values) {
            addCriterion("image_info4 not in", values, "imageInfo4");
            return (Criteria) this;
        }

        public Criteria andImageInfo4Between(String value1, String value2) {
            addCriterion("image_info4 between", value1, value2, "imageInfo4");
            return (Criteria) this;
        }

        public Criteria andImageInfo4NotBetween(String value1, String value2) {
            addCriterion("image_info4 not between", value1, value2, "imageInfo4");
            return (Criteria) this;
        }

        public Criteria andImageInfo5IsNull() {
            addCriterion("image_info5 is null");
            return (Criteria) this;
        }

        public Criteria andImageInfo5IsNotNull() {
            addCriterion("image_info5 is not null");
            return (Criteria) this;
        }

        public Criteria andImageInfo5EqualTo(String value) {
            addCriterion("image_info5 =", value, "imageInfo5");
            return (Criteria) this;
        }

        public Criteria andImageInfo5NotEqualTo(String value) {
            addCriterion("image_info5 <>", value, "imageInfo5");
            return (Criteria) this;
        }

        public Criteria andImageInfo5GreaterThan(String value) {
            addCriterion("image_info5 >", value, "imageInfo5");
            return (Criteria) this;
        }

        public Criteria andImageInfo5GreaterThanOrEqualTo(String value) {
            addCriterion("image_info5 >=", value, "imageInfo5");
            return (Criteria) this;
        }

        public Criteria andImageInfo5LessThan(String value) {
            addCriterion("image_info5 <", value, "imageInfo5");
            return (Criteria) this;
        }

        public Criteria andImageInfo5LessThanOrEqualTo(String value) {
            addCriterion("image_info5 <=", value, "imageInfo5");
            return (Criteria) this;
        }

        public Criteria andImageInfo5Like(String value) {
            addCriterion("image_info5 like", value, "imageInfo5");
            return (Criteria) this;
        }

        public Criteria andImageInfo5NotLike(String value) {
            addCriterion("image_info5 not like", value, "imageInfo5");
            return (Criteria) this;
        }

        public Criteria andImageInfo5In(List<String> values) {
            addCriterion("image_info5 in", values, "imageInfo5");
            return (Criteria) this;
        }

        public Criteria andImageInfo5NotIn(List<String> values) {
            addCriterion("image_info5 not in", values, "imageInfo5");
            return (Criteria) this;
        }

        public Criteria andImageInfo5Between(String value1, String value2) {
            addCriterion("image_info5 between", value1, value2, "imageInfo5");
            return (Criteria) this;
        }

        public Criteria andImageInfo5NotBetween(String value1, String value2) {
            addCriterion("image_info5 not between", value1, value2, "imageInfo5");
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