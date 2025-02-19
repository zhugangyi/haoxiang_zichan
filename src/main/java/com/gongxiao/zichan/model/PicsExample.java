package com.gongxiao.zichan.model;

import java.util.ArrayList;
import java.util.List;

public class PicsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PicsExample() {
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

        public Criteria andBelongtotableIsNull() {
            addCriterion("belongtotable is null");
            return (Criteria) this;
        }

        public Criteria andBelongtotableIsNotNull() {
            addCriterion("belongtotable is not null");
            return (Criteria) this;
        }

        public Criteria andBelongtotableEqualTo(String value) {
            addCriterion("belongtotable =", value, "belongtotable");
            return (Criteria) this;
        }

        public Criteria andBelongtotableNotEqualTo(String value) {
            addCriterion("belongtotable <>", value, "belongtotable");
            return (Criteria) this;
        }

        public Criteria andBelongtotableGreaterThan(String value) {
            addCriterion("belongtotable >", value, "belongtotable");
            return (Criteria) this;
        }

        public Criteria andBelongtotableGreaterThanOrEqualTo(String value) {
            addCriterion("belongtotable >=", value, "belongtotable");
            return (Criteria) this;
        }

        public Criteria andBelongtotableLessThan(String value) {
            addCriterion("belongtotable <", value, "belongtotable");
            return (Criteria) this;
        }

        public Criteria andBelongtotableLessThanOrEqualTo(String value) {
            addCriterion("belongtotable <=", value, "belongtotable");
            return (Criteria) this;
        }

        public Criteria andBelongtotableLike(String value) {
            addCriterion("belongtotable like", value, "belongtotable");
            return (Criteria) this;
        }

        public Criteria andBelongtotableNotLike(String value) {
            addCriterion("belongtotable not like", value, "belongtotable");
            return (Criteria) this;
        }

        public Criteria andBelongtotableIn(List<String> values) {
            addCriterion("belongtotable in", values, "belongtotable");
            return (Criteria) this;
        }

        public Criteria andBelongtotableNotIn(List<String> values) {
            addCriterion("belongtotable not in", values, "belongtotable");
            return (Criteria) this;
        }

        public Criteria andBelongtotableBetween(String value1, String value2) {
            addCriterion("belongtotable between", value1, value2, "belongtotable");
            return (Criteria) this;
        }

        public Criteria andBelongtotableNotBetween(String value1, String value2) {
            addCriterion("belongtotable not between", value1, value2, "belongtotable");
            return (Criteria) this;
        }

        public Criteria andBelongtoidIsNull() {
            addCriterion("belongtoid is null");
            return (Criteria) this;
        }

        public Criteria andBelongtoidIsNotNull() {
            addCriterion("belongtoid is not null");
            return (Criteria) this;
        }

        public Criteria andBelongtoidEqualTo(String value) {
            addCriterion("belongtoid =", value, "belongtoid");
            return (Criteria) this;
        }

        public Criteria andBelongtoidNotEqualTo(String value) {
            addCriterion("belongtoid <>", value, "belongtoid");
            return (Criteria) this;
        }

        public Criteria andBelongtoidGreaterThan(String value) {
            addCriterion("belongtoid >", value, "belongtoid");
            return (Criteria) this;
        }

        public Criteria andBelongtoidGreaterThanOrEqualTo(String value) {
            addCriterion("belongtoid >=", value, "belongtoid");
            return (Criteria) this;
        }

        public Criteria andBelongtoidLessThan(String value) {
            addCriterion("belongtoid <", value, "belongtoid");
            return (Criteria) this;
        }

        public Criteria andBelongtoidLessThanOrEqualTo(String value) {
            addCriterion("belongtoid <=", value, "belongtoid");
            return (Criteria) this;
        }

        public Criteria andBelongtoidLike(String value) {
            addCriterion("belongtoid like", value, "belongtoid");
            return (Criteria) this;
        }

        public Criteria andBelongtoidNotLike(String value) {
            addCriterion("belongtoid not like", value, "belongtoid");
            return (Criteria) this;
        }

        public Criteria andBelongtoidIn(List<String> values) {
            addCriterion("belongtoid in", values, "belongtoid");
            return (Criteria) this;
        }

        public Criteria andBelongtoidNotIn(List<String> values) {
            addCriterion("belongtoid not in", values, "belongtoid");
            return (Criteria) this;
        }

        public Criteria andBelongtoidBetween(String value1, String value2) {
            addCriterion("belongtoid between", value1, value2, "belongtoid");
            return (Criteria) this;
        }

        public Criteria andBelongtoidNotBetween(String value1, String value2) {
            addCriterion("belongtoid not between", value1, value2, "belongtoid");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNull() {
            addCriterion("imgurl is null");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNotNull() {
            addCriterion("imgurl is not null");
            return (Criteria) this;
        }

        public Criteria andImgurlEqualTo(String value) {
            addCriterion("imgurl =", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotEqualTo(String value) {
            addCriterion("imgurl <>", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThan(String value) {
            addCriterion("imgurl >", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("imgurl >=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThan(String value) {
            addCriterion("imgurl <", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThanOrEqualTo(String value) {
            addCriterion("imgurl <=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLike(String value) {
            addCriterion("imgurl like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotLike(String value) {
            addCriterion("imgurl not like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlIn(List<String> values) {
            addCriterion("imgurl in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotIn(List<String> values) {
            addCriterion("imgurl not in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlBetween(String value1, String value2) {
            addCriterion("imgurl between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotBetween(String value1, String value2) {
            addCriterion("imgurl not between", value1, value2, "imgurl");
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