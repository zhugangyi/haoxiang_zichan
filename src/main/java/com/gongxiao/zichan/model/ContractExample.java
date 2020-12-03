package com.gongxiao.zichan.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ContractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContractExample() {
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

        public Criteria andCustomIsNull() {
            addCriterion("custom is null");
            return (Criteria) this;
        }

        public Criteria andCustomIsNotNull() {
            addCriterion("custom is not null");
            return (Criteria) this;
        }

        public Criteria andCustomEqualTo(String value) {
            addCriterion("custom =", value, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomNotEqualTo(String value) {
            addCriterion("custom <>", value, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomGreaterThan(String value) {
            addCriterion("custom >", value, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomGreaterThanOrEqualTo(String value) {
            addCriterion("custom >=", value, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomLessThan(String value) {
            addCriterion("custom <", value, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomLessThanOrEqualTo(String value) {
            addCriterion("custom <=", value, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomLike(String value) {
            addCriterion("custom like", value, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomNotLike(String value) {
            addCriterion("custom not like", value, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomIn(List<String> values) {
            addCriterion("custom in", values, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomNotIn(List<String> values) {
            addCriterion("custom not in", values, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomBetween(String value1, String value2) {
            addCriterion("custom between", value1, value2, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomNotBetween(String value1, String value2) {
            addCriterion("custom not between", value1, value2, "custom");
            return (Criteria) this;
        }

        public Criteria andBeginningIsNull() {
            addCriterion("beginning is null");
            return (Criteria) this;
        }

        public Criteria andBeginningIsNotNull() {
            addCriterion("beginning is not null");
            return (Criteria) this;
        }

        public Criteria andBeginningEqualTo(Date value) {
            addCriterionForJDBCDate("beginning =", value, "beginning");
            return (Criteria) this;
        }

        public Criteria andBeginningNotEqualTo(Date value) {
            addCriterionForJDBCDate("beginning <>", value, "beginning");
            return (Criteria) this;
        }

        public Criteria andBeginningGreaterThan(Date value) {
            addCriterionForJDBCDate("beginning >", value, "beginning");
            return (Criteria) this;
        }

        public Criteria andBeginningGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("beginning >=", value, "beginning");
            return (Criteria) this;
        }

        public Criteria andBeginningLessThan(Date value) {
            addCriterionForJDBCDate("beginning <", value, "beginning");
            return (Criteria) this;
        }

        public Criteria andBeginningLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("beginning <=", value, "beginning");
            return (Criteria) this;
        }

        public Criteria andBeginningIn(List<Date> values) {
            addCriterionForJDBCDate("beginning in", values, "beginning");
            return (Criteria) this;
        }

        public Criteria andBeginningNotIn(List<Date> values) {
            addCriterionForJDBCDate("beginning not in", values, "beginning");
            return (Criteria) this;
        }

        public Criteria andBeginningBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("beginning between", value1, value2, "beginning");
            return (Criteria) this;
        }

        public Criteria andBeginningNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("beginning not between", value1, value2, "beginning");
            return (Criteria) this;
        }

        public Criteria andEnddingIsNull() {
            addCriterion("endding is null");
            return (Criteria) this;
        }

        public Criteria andEnddingIsNotNull() {
            addCriterion("endding is not null");
            return (Criteria) this;
        }

        public Criteria andEnddingEqualTo(Date value) {
            addCriterionForJDBCDate("endding =", value, "endding");
            return (Criteria) this;
        }

        public Criteria andEnddingNotEqualTo(Date value) {
            addCriterionForJDBCDate("endding <>", value, "endding");
            return (Criteria) this;
        }

        public Criteria andEnddingGreaterThan(Date value) {
            addCriterionForJDBCDate("endding >", value, "endding");
            return (Criteria) this;
        }

        public Criteria andEnddingGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endding >=", value, "endding");
            return (Criteria) this;
        }

        public Criteria andEnddingLessThan(Date value) {
            addCriterionForJDBCDate("endding <", value, "endding");
            return (Criteria) this;
        }

        public Criteria andEnddingLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endding <=", value, "endding");
            return (Criteria) this;
        }

        public Criteria andEnddingIn(List<Date> values) {
            addCriterionForJDBCDate("endding in", values, "endding");
            return (Criteria) this;
        }

        public Criteria andEnddingNotIn(List<Date> values) {
            addCriterionForJDBCDate("endding not in", values, "endding");
            return (Criteria) this;
        }

        public Criteria andEnddingBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endding between", value1, value2, "endding");
            return (Criteria) this;
        }

        public Criteria andEnddingNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endding not between", value1, value2, "endding");
            return (Criteria) this;
        }

        public Criteria andAssetIsNull() {
            addCriterion("asset is null");
            return (Criteria) this;
        }

        public Criteria andAssetIsNotNull() {
            addCriterion("asset is not null");
            return (Criteria) this;
        }

        public Criteria andAssetEqualTo(String value) {
            addCriterion("asset =", value, "asset");
            return (Criteria) this;
        }

        public Criteria andAssetNotEqualTo(String value) {
            addCriterion("asset <>", value, "asset");
            return (Criteria) this;
        }

        public Criteria andAssetGreaterThan(String value) {
            addCriterion("asset >", value, "asset");
            return (Criteria) this;
        }

        public Criteria andAssetGreaterThanOrEqualTo(String value) {
            addCriterion("asset >=", value, "asset");
            return (Criteria) this;
        }

        public Criteria andAssetLessThan(String value) {
            addCriterion("asset <", value, "asset");
            return (Criteria) this;
        }

        public Criteria andAssetLessThanOrEqualTo(String value) {
            addCriterion("asset <=", value, "asset");
            return (Criteria) this;
        }

        public Criteria andAssetLike(String value) {
            addCriterion("asset like", value, "asset");
            return (Criteria) this;
        }

        public Criteria andAssetNotLike(String value) {
            addCriterion("asset not like", value, "asset");
            return (Criteria) this;
        }

        public Criteria andAssetIn(List<String> values) {
            addCriterion("asset in", values, "asset");
            return (Criteria) this;
        }

        public Criteria andAssetNotIn(List<String> values) {
            addCriterion("asset not in", values, "asset");
            return (Criteria) this;
        }

        public Criteria andAssetBetween(String value1, String value2) {
            addCriterion("asset between", value1, value2, "asset");
            return (Criteria) this;
        }

        public Criteria andAssetNotBetween(String value1, String value2) {
            addCriterion("asset not between", value1, value2, "asset");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Integer value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Integer value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Integer value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Integer value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Integer value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Integer> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Integer> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Integer value1, Integer value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAssetnameIsNull() {
            addCriterion("assetname is null");
            return (Criteria) this;
        }

        public Criteria andAssetnameIsNotNull() {
            addCriterion("assetname is not null");
            return (Criteria) this;
        }

        public Criteria andAssetnameEqualTo(String value) {
            addCriterion("assetname =", value, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameNotEqualTo(String value) {
            addCriterion("assetname <>", value, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameGreaterThan(String value) {
            addCriterion("assetname >", value, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameGreaterThanOrEqualTo(String value) {
            addCriterion("assetname >=", value, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameLessThan(String value) {
            addCriterion("assetname <", value, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameLessThanOrEqualTo(String value) {
            addCriterion("assetname <=", value, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameLike(String value) {
            addCriterion("assetname like", value, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameNotLike(String value) {
            addCriterion("assetname not like", value, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameIn(List<String> values) {
            addCriterion("assetname in", values, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameNotIn(List<String> values) {
            addCriterion("assetname not in", values, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameBetween(String value1, String value2) {
            addCriterion("assetname between", value1, value2, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameNotBetween(String value1, String value2) {
            addCriterion("assetname not between", value1, value2, "assetname");
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