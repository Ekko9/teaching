package com.teaching.bean;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNull() {
            addCriterion("usertype is null");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNotNull() {
            addCriterion("usertype is not null");
            return (Criteria) this;
        }

        public Criteria andUsertypeEqualTo(Integer value) {
            addCriterion("usertype =", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotEqualTo(Integer value) {
            addCriterion("usertype <>", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThan(Integer value) {
            addCriterion("usertype >", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("usertype >=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThan(Integer value) {
            addCriterion("usertype <", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThanOrEqualTo(Integer value) {
            addCriterion("usertype <=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeIn(List<Integer> values) {
            addCriterion("usertype in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotIn(List<Integer> values) {
            addCriterion("usertype not in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeBetween(Integer value1, Integer value2) {
            addCriterion("usertype between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotBetween(Integer value1, Integer value2) {
            addCriterion("usertype not between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andLoginnameIsNull() {
            addCriterion("loginname is null");
            return (Criteria) this;
        }

        public Criteria andLoginnameIsNotNull() {
            addCriterion("loginname is not null");
            return (Criteria) this;
        }

        public Criteria andLoginnameEqualTo(String value) {
            addCriterion("loginname =", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotEqualTo(String value) {
            addCriterion("loginname <>", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameGreaterThan(String value) {
            addCriterion("loginname >", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameGreaterThanOrEqualTo(String value) {
            addCriterion("loginname >=", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLessThan(String value) {
            addCriterion("loginname <", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLessThanOrEqualTo(String value) {
            addCriterion("loginname <=", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLike(String value) {
            addCriterion("loginname like", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotLike(String value) {
            addCriterion("loginname not like", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameIn(List<String> values) {
            addCriterion("loginname in", values, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotIn(List<String> values) {
            addCriterion("loginname not in", values, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameBetween(String value1, String value2) {
            addCriterion("loginname between", value1, value2, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotBetween(String value1, String value2) {
            addCriterion("loginname not between", value1, value2, "loginname");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andWorkidIsNull() {
            addCriterion("workId is null");
            return (Criteria) this;
        }

        public Criteria andWorkidIsNotNull() {
            addCriterion("workId is not null");
            return (Criteria) this;
        }

        public Criteria andWorkidEqualTo(String value) {
            addCriterion("workId =", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotEqualTo(String value) {
            addCriterion("workId <>", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidGreaterThan(String value) {
            addCriterion("workId >", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidGreaterThanOrEqualTo(String value) {
            addCriterion("workId >=", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLessThan(String value) {
            addCriterion("workId <", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLessThanOrEqualTo(String value) {
            addCriterion("workId <=", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLike(String value) {
            addCriterion("workId like", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotLike(String value) {
            addCriterion("workId not like", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidIn(List<String> values) {
            addCriterion("workId in", values, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotIn(List<String> values) {
            addCriterion("workId not in", values, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidBetween(String value1, String value2) {
            addCriterion("workId between", value1, value2, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotBetween(String value1, String value2) {
            addCriterion("workId not between", value1, value2, "workid");
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