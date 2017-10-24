package com.vote.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andActivityIdIsNull() {
            addCriterion("activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(Integer value) {
            addCriterion("activity_id =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(Integer value) {
            addCriterion("activity_id <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(Integer value) {
            addCriterion("activity_id >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_id >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(Integer value) {
            addCriterion("activity_id <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(Integer value) {
            addCriterion("activity_id <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<Integer> values) {
            addCriterion("activity_id in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<Integer> values) {
            addCriterion("activity_id not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(Integer value1, Integer value2) {
            addCriterion("activity_id between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_id not between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityStartIsNull() {
            addCriterion("activity_start is null");
            return (Criteria) this;
        }

        public Criteria andActivityStartIsNotNull() {
            addCriterion("activity_start is not null");
            return (Criteria) this;
        }

        public Criteria andActivityStartEqualTo(Date value) {
            addCriterionForJDBCDate("activity_start =", value, "activityStart");
            return (Criteria) this;
        }

        public Criteria andActivityStartNotEqualTo(Date value) {
            addCriterionForJDBCDate("activity_start <>", value, "activityStart");
            return (Criteria) this;
        }

        public Criteria andActivityStartGreaterThan(Date value) {
            addCriterionForJDBCDate("activity_start >", value, "activityStart");
            return (Criteria) this;
        }

        public Criteria andActivityStartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("activity_start >=", value, "activityStart");
            return (Criteria) this;
        }

        public Criteria andActivityStartLessThan(Date value) {
            addCriterionForJDBCDate("activity_start <", value, "activityStart");
            return (Criteria) this;
        }

        public Criteria andActivityStartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("activity_start <=", value, "activityStart");
            return (Criteria) this;
        }

        public Criteria andActivityStartIn(List<Date> values) {
            addCriterionForJDBCDate("activity_start in", values, "activityStart");
            return (Criteria) this;
        }

        public Criteria andActivityStartNotIn(List<Date> values) {
            addCriterionForJDBCDate("activity_start not in", values, "activityStart");
            return (Criteria) this;
        }

        public Criteria andActivityStartBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("activity_start between", value1, value2, "activityStart");
            return (Criteria) this;
        }

        public Criteria andActivityStartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("activity_start not between", value1, value2, "activityStart");
            return (Criteria) this;
        }

        public Criteria andActivityEndIsNull() {
            addCriterion("activity_end is null");
            return (Criteria) this;
        }

        public Criteria andActivityEndIsNotNull() {
            addCriterion("activity_end is not null");
            return (Criteria) this;
        }

        public Criteria andActivityEndEqualTo(Date value) {
            addCriterionForJDBCDate("activity_end =", value, "activityEnd");
            return (Criteria) this;
        }

        public Criteria andActivityEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("activity_end <>", value, "activityEnd");
            return (Criteria) this;
        }

        public Criteria andActivityEndGreaterThan(Date value) {
            addCriterionForJDBCDate("activity_end >", value, "activityEnd");
            return (Criteria) this;
        }

        public Criteria andActivityEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("activity_end >=", value, "activityEnd");
            return (Criteria) this;
        }

        public Criteria andActivityEndLessThan(Date value) {
            addCriterionForJDBCDate("activity_end <", value, "activityEnd");
            return (Criteria) this;
        }

        public Criteria andActivityEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("activity_end <=", value, "activityEnd");
            return (Criteria) this;
        }

        public Criteria andActivityEndIn(List<Date> values) {
            addCriterionForJDBCDate("activity_end in", values, "activityEnd");
            return (Criteria) this;
        }

        public Criteria andActivityEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("activity_end not in", values, "activityEnd");
            return (Criteria) this;
        }

        public Criteria andActivityEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("activity_end between", value1, value2, "activityEnd");
            return (Criteria) this;
        }

        public Criteria andActivityEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("activity_end not between", value1, value2, "activityEnd");
            return (Criteria) this;
        }

        public Criteria andActivityNameIsNull() {
            addCriterion("activity_name is null");
            return (Criteria) this;
        }

        public Criteria andActivityNameIsNotNull() {
            addCriterion("activity_name is not null");
            return (Criteria) this;
        }

        public Criteria andActivityNameEqualTo(String value) {
            addCriterion("activity_name =", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotEqualTo(String value) {
            addCriterion("activity_name <>", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThan(String value) {
            addCriterion("activity_name >", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThanOrEqualTo(String value) {
            addCriterion("activity_name >=", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThan(String value) {
            addCriterion("activity_name <", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThanOrEqualTo(String value) {
            addCriterion("activity_name <=", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLike(String value) {
            addCriterion("activity_name like", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotLike(String value) {
            addCriterion("activity_name not like", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameIn(List<String> values) {
            addCriterion("activity_name in", values, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotIn(List<String> values) {
            addCriterion("activity_name not in", values, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameBetween(String value1, String value2) {
            addCriterion("activity_name between", value1, value2, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotBetween(String value1, String value2) {
            addCriterion("activity_name not between", value1, value2, "activityName");
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