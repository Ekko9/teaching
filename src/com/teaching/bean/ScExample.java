package com.teaching.bean;

import java.util.ArrayList;
import java.util.List;

public class ScExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andWeekidIsNull() {
            addCriterion("weekid is null");
            return (Criteria) this;
        }

        public Criteria andWeekidIsNotNull() {
            addCriterion("weekid is not null");
            return (Criteria) this;
        }

        public Criteria andWeekidEqualTo(Integer value) {
            addCriterion("weekid =", value, "weekid");
            return (Criteria) this;
        }

        public Criteria andWeekidNotEqualTo(Integer value) {
            addCriterion("weekid <>", value, "weekid");
            return (Criteria) this;
        }

        public Criteria andWeekidGreaterThan(Integer value) {
            addCriterion("weekid >", value, "weekid");
            return (Criteria) this;
        }

        public Criteria andWeekidGreaterThanOrEqualTo(Integer value) {
            addCriterion("weekid >=", value, "weekid");
            return (Criteria) this;
        }

        public Criteria andWeekidLessThan(Integer value) {
            addCriterion("weekid <", value, "weekid");
            return (Criteria) this;
        }

        public Criteria andWeekidLessThanOrEqualTo(Integer value) {
            addCriterion("weekid <=", value, "weekid");
            return (Criteria) this;
        }

        public Criteria andWeekidIn(List<Integer> values) {
            addCriterion("weekid in", values, "weekid");
            return (Criteria) this;
        }

        public Criteria andWeekidNotIn(List<Integer> values) {
            addCriterion("weekid not in", values, "weekid");
            return (Criteria) this;
        }

        public Criteria andWeekidBetween(Integer value1, Integer value2) {
            addCriterion("weekid between", value1, value2, "weekid");
            return (Criteria) this;
        }

        public Criteria andWeekidNotBetween(Integer value1, Integer value2) {
            addCriterion("weekid not between", value1, value2, "weekid");
            return (Criteria) this;
        }

        public Criteria andTimeidIsNull() {
            addCriterion("timeid is null");
            return (Criteria) this;
        }

        public Criteria andTimeidIsNotNull() {
            addCriterion("timeid is not null");
            return (Criteria) this;
        }

        public Criteria andTimeidEqualTo(Integer value) {
            addCriterion("timeid =", value, "timeid");
            return (Criteria) this;
        }

        public Criteria andTimeidNotEqualTo(Integer value) {
            addCriterion("timeid <>", value, "timeid");
            return (Criteria) this;
        }

        public Criteria andTimeidGreaterThan(Integer value) {
            addCriterion("timeid >", value, "timeid");
            return (Criteria) this;
        }

        public Criteria andTimeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("timeid >=", value, "timeid");
            return (Criteria) this;
        }

        public Criteria andTimeidLessThan(Integer value) {
            addCriterion("timeid <", value, "timeid");
            return (Criteria) this;
        }

        public Criteria andTimeidLessThanOrEqualTo(Integer value) {
            addCriterion("timeid <=", value, "timeid");
            return (Criteria) this;
        }

        public Criteria andTimeidIn(List<Integer> values) {
            addCriterion("timeid in", values, "timeid");
            return (Criteria) this;
        }

        public Criteria andTimeidNotIn(List<Integer> values) {
            addCriterion("timeid not in", values, "timeid");
            return (Criteria) this;
        }

        public Criteria andTimeidBetween(Integer value1, Integer value2) {
            addCriterion("timeid between", value1, value2, "timeid");
            return (Criteria) this;
        }

        public Criteria andTimeidNotBetween(Integer value1, Integer value2) {
            addCriterion("timeid not between", value1, value2, "timeid");
            return (Criteria) this;
        }

        public Criteria andPre1IsNull() {
            addCriterion("pre1 is null");
            return (Criteria) this;
        }

        public Criteria andPre1IsNotNull() {
            addCriterion("pre1 is not null");
            return (Criteria) this;
        }

        public Criteria andPre1EqualTo(Integer value) {
            addCriterion("pre1 =", value, "pre1");
            return (Criteria) this;
        }

        public Criteria andPre1NotEqualTo(Integer value) {
            addCriterion("pre1 <>", value, "pre1");
            return (Criteria) this;
        }

        public Criteria andPre1GreaterThan(Integer value) {
            addCriterion("pre1 >", value, "pre1");
            return (Criteria) this;
        }

        public Criteria andPre1GreaterThanOrEqualTo(Integer value) {
            addCriterion("pre1 >=", value, "pre1");
            return (Criteria) this;
        }

        public Criteria andPre1LessThan(Integer value) {
            addCriterion("pre1 <", value, "pre1");
            return (Criteria) this;
        }

        public Criteria andPre1LessThanOrEqualTo(Integer value) {
            addCriterion("pre1 <=", value, "pre1");
            return (Criteria) this;
        }

        public Criteria andPre1In(List<Integer> values) {
            addCriterion("pre1 in", values, "pre1");
            return (Criteria) this;
        }

        public Criteria andPre1NotIn(List<Integer> values) {
            addCriterion("pre1 not in", values, "pre1");
            return (Criteria) this;
        }

        public Criteria andPre1Between(Integer value1, Integer value2) {
            addCriterion("pre1 between", value1, value2, "pre1");
            return (Criteria) this;
        }

        public Criteria andPre1NotBetween(Integer value1, Integer value2) {
            addCriterion("pre1 not between", value1, value2, "pre1");
            return (Criteria) this;
        }

        public Criteria andPre2IsNull() {
            addCriterion("pre2 is null");
            return (Criteria) this;
        }

        public Criteria andPre2IsNotNull() {
            addCriterion("pre2 is not null");
            return (Criteria) this;
        }

        public Criteria andPre2EqualTo(String value) {
            addCriterion("pre2 =", value, "pre2");
            return (Criteria) this;
        }

        public Criteria andPre2NotEqualTo(String value) {
            addCriterion("pre2 <>", value, "pre2");
            return (Criteria) this;
        }

        public Criteria andPre2GreaterThan(String value) {
            addCriterion("pre2 >", value, "pre2");
            return (Criteria) this;
        }

        public Criteria andPre2GreaterThanOrEqualTo(String value) {
            addCriterion("pre2 >=", value, "pre2");
            return (Criteria) this;
        }

        public Criteria andPre2LessThan(String value) {
            addCriterion("pre2 <", value, "pre2");
            return (Criteria) this;
        }

        public Criteria andPre2LessThanOrEqualTo(String value) {
            addCriterion("pre2 <=", value, "pre2");
            return (Criteria) this;
        }

        public Criteria andPre2Like(String value) {
            addCriterion("pre2 like", value, "pre2");
            return (Criteria) this;
        }

        public Criteria andPre2NotLike(String value) {
            addCriterion("pre2 not like", value, "pre2");
            return (Criteria) this;
        }

        public Criteria andPre2In(List<String> values) {
            addCriterion("pre2 in", values, "pre2");
            return (Criteria) this;
        }

        public Criteria andPre2NotIn(List<String> values) {
            addCriterion("pre2 not in", values, "pre2");
            return (Criteria) this;
        }

        public Criteria andPre2Between(String value1, String value2) {
            addCriterion("pre2 between", value1, value2, "pre2");
            return (Criteria) this;
        }

        public Criteria andPre2NotBetween(String value1, String value2) {
            addCriterion("pre2 not between", value1, value2, "pre2");
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