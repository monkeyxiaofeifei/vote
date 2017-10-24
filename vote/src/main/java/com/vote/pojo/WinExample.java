package com.vote.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class WinExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WinExample() {
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

        public Criteria andWinIdIsNull() {
            addCriterion("win_id is null");
            return (Criteria) this;
        }

        public Criteria andWinIdIsNotNull() {
            addCriterion("win_id is not null");
            return (Criteria) this;
        }

        public Criteria andWinIdEqualTo(Integer value) {
            addCriterion("win_id =", value, "winId");
            return (Criteria) this;
        }

        public Criteria andWinIdNotEqualTo(Integer value) {
            addCriterion("win_id <>", value, "winId");
            return (Criteria) this;
        }

        public Criteria andWinIdGreaterThan(Integer value) {
            addCriterion("win_id >", value, "winId");
            return (Criteria) this;
        }

        public Criteria andWinIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("win_id >=", value, "winId");
            return (Criteria) this;
        }

        public Criteria andWinIdLessThan(Integer value) {
            addCriterion("win_id <", value, "winId");
            return (Criteria) this;
        }

        public Criteria andWinIdLessThanOrEqualTo(Integer value) {
            addCriterion("win_id <=", value, "winId");
            return (Criteria) this;
        }

        public Criteria andWinIdIn(List<Integer> values) {
            addCriterion("win_id in", values, "winId");
            return (Criteria) this;
        }

        public Criteria andWinIdNotIn(List<Integer> values) {
            addCriterion("win_id not in", values, "winId");
            return (Criteria) this;
        }

        public Criteria andWinIdBetween(Integer value1, Integer value2) {
            addCriterion("win_id between", value1, value2, "winId");
            return (Criteria) this;
        }

        public Criteria andWinIdNotBetween(Integer value1, Integer value2) {
            addCriterion("win_id not between", value1, value2, "winId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserCardIsNull() {
            addCriterion("user_card is null");
            return (Criteria) this;
        }

        public Criteria andUserCardIsNotNull() {
            addCriterion("user_card is not null");
            return (Criteria) this;
        }

        public Criteria andUserCardEqualTo(String value) {
            addCriterion("user_card =", value, "userCard");
            return (Criteria) this;
        }

        public Criteria andUserCardNotEqualTo(String value) {
            addCriterion("user_card <>", value, "userCard");
            return (Criteria) this;
        }

        public Criteria andUserCardGreaterThan(String value) {
            addCriterion("user_card >", value, "userCard");
            return (Criteria) this;
        }

        public Criteria andUserCardGreaterThanOrEqualTo(String value) {
            addCriterion("user_card >=", value, "userCard");
            return (Criteria) this;
        }

        public Criteria andUserCardLessThan(String value) {
            addCriterion("user_card <", value, "userCard");
            return (Criteria) this;
        }

        public Criteria andUserCardLessThanOrEqualTo(String value) {
            addCriterion("user_card <=", value, "userCard");
            return (Criteria) this;
        }

        public Criteria andUserCardLike(String value) {
            addCriterion("user_card like", value, "userCard");
            return (Criteria) this;
        }

        public Criteria andUserCardNotLike(String value) {
            addCriterion("user_card not like", value, "userCard");
            return (Criteria) this;
        }

        public Criteria andUserCardIn(List<String> values) {
            addCriterion("user_card in", values, "userCard");
            return (Criteria) this;
        }

        public Criteria andUserCardNotIn(List<String> values) {
            addCriterion("user_card not in", values, "userCard");
            return (Criteria) this;
        }

        public Criteria andUserCardBetween(String value1, String value2) {
            addCriterion("user_card between", value1, value2, "userCard");
            return (Criteria) this;
        }

        public Criteria andUserCardNotBetween(String value1, String value2) {
            addCriterion("user_card not between", value1, value2, "userCard");
            return (Criteria) this;
        }

        public Criteria andAwardNameIsNull() {
            addCriterion("award_name is null");
            return (Criteria) this;
        }

        public Criteria andAwardNameIsNotNull() {
            addCriterion("award_name is not null");
            return (Criteria) this;
        }

        public Criteria andAwardNameEqualTo(String value) {
            addCriterion("award_name =", value, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameNotEqualTo(String value) {
            addCriterion("award_name <>", value, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameGreaterThan(String value) {
            addCriterion("award_name >", value, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameGreaterThanOrEqualTo(String value) {
            addCriterion("award_name >=", value, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameLessThan(String value) {
            addCriterion("award_name <", value, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameLessThanOrEqualTo(String value) {
            addCriterion("award_name <=", value, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameLike(String value) {
            addCriterion("award_name like", value, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameNotLike(String value) {
            addCriterion("award_name not like", value, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameIn(List<String> values) {
            addCriterion("award_name in", values, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameNotIn(List<String> values) {
            addCriterion("award_name not in", values, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameBetween(String value1, String value2) {
            addCriterion("award_name between", value1, value2, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameNotBetween(String value1, String value2) {
            addCriterion("award_name not between", value1, value2, "awardName");
            return (Criteria) this;
        }

        public Criteria andIsGetIsNull() {
            addCriterion("is_get is null");
            return (Criteria) this;
        }

        public Criteria andIsGetIsNotNull() {
            addCriterion("is_get is not null");
            return (Criteria) this;
        }

        public Criteria andIsGetEqualTo(Integer value) {
            addCriterion("is_get =", value, "isGet");
            return (Criteria) this;
        }

        public Criteria andIsGetNotEqualTo(Integer value) {
            addCriterion("is_get <>", value, "isGet");
            return (Criteria) this;
        }

        public Criteria andIsGetGreaterThan(Integer value) {
            addCriterion("is_get >", value, "isGet");
            return (Criteria) this;
        }

        public Criteria andIsGetGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_get >=", value, "isGet");
            return (Criteria) this;
        }

        public Criteria andIsGetLessThan(Integer value) {
            addCriterion("is_get <", value, "isGet");
            return (Criteria) this;
        }

        public Criteria andIsGetLessThanOrEqualTo(Integer value) {
            addCriterion("is_get <=", value, "isGet");
            return (Criteria) this;
        }

        public Criteria andIsGetIn(List<Integer> values) {
            addCriterion("is_get in", values, "isGet");
            return (Criteria) this;
        }

        public Criteria andIsGetNotIn(List<Integer> values) {
            addCriterion("is_get not in", values, "isGet");
            return (Criteria) this;
        }

        public Criteria andIsGetBetween(Integer value1, Integer value2) {
            addCriterion("is_get between", value1, value2, "isGet");
            return (Criteria) this;
        }

        public Criteria andIsGetNotBetween(Integer value1, Integer value2) {
            addCriterion("is_get not between", value1, value2, "isGet");
            return (Criteria) this;
        }

        public Criteria andWinTimeIsNull() {
            addCriterion("win_time is null");
            return (Criteria) this;
        }

        public Criteria andWinTimeIsNotNull() {
            addCriterion("win_time is not null");
            return (Criteria) this;
        }

        public Criteria andWinTimeEqualTo(Date value) {
            addCriterionForJDBCDate("win_time =", value, "winTime");
            return (Criteria) this;
        }

        public Criteria andWinTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("win_time <>", value, "winTime");
            return (Criteria) this;
        }

        public Criteria andWinTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("win_time >", value, "winTime");
            return (Criteria) this;
        }

        public Criteria andWinTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("win_time >=", value, "winTime");
            return (Criteria) this;
        }

        public Criteria andWinTimeLessThan(Date value) {
            addCriterionForJDBCDate("win_time <", value, "winTime");
            return (Criteria) this;
        }

        public Criteria andWinTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("win_time <=", value, "winTime");
            return (Criteria) this;
        }

        public Criteria andWinTimeIn(List<Date> values) {
            addCriterionForJDBCDate("win_time in", values, "winTime");
            return (Criteria) this;
        }

        public Criteria andWinTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("win_time not in", values, "winTime");
            return (Criteria) this;
        }

        public Criteria andWinTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("win_time between", value1, value2, "winTime");
            return (Criteria) this;
        }

        public Criteria andWinTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("win_time not between", value1, value2, "winTime");
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