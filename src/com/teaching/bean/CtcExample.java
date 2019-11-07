package com.teaching.bean;

import java.util.ArrayList;
import java.util.List;

public class CtcExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CtcExample() {
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

        public Criteria andCouidIsNull() {
            addCriterion("couid is null");
            return (Criteria) this;
        }

        public Criteria andCouidIsNotNull() {
            addCriterion("couid is not null");
            return (Criteria) this;
        }

        public Criteria andCouidEqualTo(Integer value) {
            addCriterion("couid =", value, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidNotEqualTo(Integer value) {
            addCriterion("couid <>", value, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidGreaterThan(Integer value) {
            addCriterion("couid >", value, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidGreaterThanOrEqualTo(Integer value) {
            addCriterion("couid >=", value, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidLessThan(Integer value) {
            addCriterion("couid <", value, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidLessThanOrEqualTo(Integer value) {
            addCriterion("couid <=", value, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidIn(List<Integer> values) {
            addCriterion("couid in", values, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidNotIn(List<Integer> values) {
            addCriterion("couid not in", values, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidBetween(Integer value1, Integer value2) {
            addCriterion("couid between", value1, value2, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidNotBetween(Integer value1, Integer value2) {
            addCriterion("couid not between", value1, value2, "couid");
            return (Criteria) this;
        }

        public Criteria andClaidIsNull() {
            addCriterion("claid is null");
            return (Criteria) this;
        }

        public Criteria andClaidIsNotNull() {
            addCriterion("claid is not null");
            return (Criteria) this;
        }

        public Criteria andClaidEqualTo(Integer value) {
            addCriterion("claid =", value, "claid");
            return (Criteria) this;
        }

        public Criteria andClaidNotEqualTo(Integer value) {
            addCriterion("claid <>", value, "claid");
            return (Criteria) this;
        }

        public Criteria andClaidGreaterThan(Integer value) {
            addCriterion("claid >", value, "claid");
            return (Criteria) this;
        }

        public Criteria andClaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("claid >=", value, "claid");
            return (Criteria) this;
        }

        public Criteria andClaidLessThan(Integer value) {
            addCriterion("claid <", value, "claid");
            return (Criteria) this;
        }

        public Criteria andClaidLessThanOrEqualTo(Integer value) {
            addCriterion("claid <=", value, "claid");
            return (Criteria) this;
        }

        public Criteria andClaidIn(List<Integer> values) {
            addCriterion("claid in", values, "claid");
            return (Criteria) this;
        }

        public Criteria andClaidNotIn(List<Integer> values) {
            addCriterion("claid not in", values, "claid");
            return (Criteria) this;
        }

        public Criteria andClaidBetween(Integer value1, Integer value2) {
            addCriterion("claid between", value1, value2, "claid");
            return (Criteria) this;
        }

        public Criteria andClaidNotBetween(Integer value1, Integer value2) {
            addCriterion("claid not between", value1, value2, "claid");
            return (Criteria) this;
        }

        public Criteria andMajidIsNull() {
            addCriterion("majid is null");
            return (Criteria) this;
        }

        public Criteria andMajidIsNotNull() {
            addCriterion("majid is not null");
            return (Criteria) this;
        }

        public Criteria andMajidEqualTo(Integer value) {
            addCriterion("majid =", value, "majid");
            return (Criteria) this;
        }

        public Criteria andMajidNotEqualTo(Integer value) {
            addCriterion("majid <>", value, "majid");
            return (Criteria) this;
        }

        public Criteria andMajidGreaterThan(Integer value) {
            addCriterion("majid >", value, "majid");
            return (Criteria) this;
        }

        public Criteria andMajidGreaterThanOrEqualTo(Integer value) {
            addCriterion("majid >=", value, "majid");
            return (Criteria) this;
        }

        public Criteria andMajidLessThan(Integer value) {
            addCriterion("majid <", value, "majid");
            return (Criteria) this;
        }

        public Criteria andMajidLessThanOrEqualTo(Integer value) {
            addCriterion("majid <=", value, "majid");
            return (Criteria) this;
        }

        public Criteria andMajidIn(List<Integer> values) {
            addCriterion("majid in", values, "majid");
            return (Criteria) this;
        }

        public Criteria andMajidNotIn(List<Integer> values) {
            addCriterion("majid not in", values, "majid");
            return (Criteria) this;
        }

        public Criteria andMajidBetween(Integer value1, Integer value2) {
            addCriterion("majid between", value1, value2, "majid");
            return (Criteria) this;
        }

        public Criteria andMajidNotBetween(Integer value1, Integer value2) {
            addCriterion("majid not between", value1, value2, "majid");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cname not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andTnameIsNull() {
            addCriterion("tname is null");
            return (Criteria) this;
        }

        public Criteria andTnameIsNotNull() {
            addCriterion("tname is not null");
            return (Criteria) this;
        }

        public Criteria andTnameEqualTo(String value) {
            addCriterion("tname =", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotEqualTo(String value) {
            addCriterion("tname <>", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameGreaterThan(String value) {
            addCriterion("tname >", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameGreaterThanOrEqualTo(String value) {
            addCriterion("tname >=", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLessThan(String value) {
            addCriterion("tname <", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLessThanOrEqualTo(String value) {
            addCriterion("tname <=", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLike(String value) {
            addCriterion("tname like", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotLike(String value) {
            addCriterion("tname not like", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameIn(List<String> values) {
            addCriterion("tname in", values, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotIn(List<String> values) {
            addCriterion("tname not in", values, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameBetween(String value1, String value2) {
            addCriterion("tname between", value1, value2, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotBetween(String value1, String value2) {
            addCriterion("tname not between", value1, value2, "tname");
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