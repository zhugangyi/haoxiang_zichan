package com.gongxiao.zichan.model;

import java.util.ArrayList;
import java.util.List;

public class AssetsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssetsExample() {
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

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAssettypeIsNull() {
            addCriterion("assettype is null");
            return (Criteria) this;
        }

        public Criteria andAssettypeIsNotNull() {
            addCriterion("assettype is not null");
            return (Criteria) this;
        }

        public Criteria andAssettypeEqualTo(String value) {
            addCriterion("assettype =", value, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeNotEqualTo(String value) {
            addCriterion("assettype <>", value, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeGreaterThan(String value) {
            addCriterion("assettype >", value, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeGreaterThanOrEqualTo(String value) {
            addCriterion("assettype >=", value, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeLessThan(String value) {
            addCriterion("assettype <", value, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeLessThanOrEqualTo(String value) {
            addCriterion("assettype <=", value, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeLike(String value) {
            addCriterion("assettype like", value, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeNotLike(String value) {
            addCriterion("assettype not like", value, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeIn(List<String> values) {
            addCriterion("assettype in", values, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeNotIn(List<String> values) {
            addCriterion("assettype not in", values, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeBetween(String value1, String value2) {
            addCriterion("assettype between", value1, value2, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeNotBetween(String value1, String value2) {
            addCriterion("assettype not between", value1, value2, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssetlevelIsNull() {
            addCriterion("assetlevel is null");
            return (Criteria) this;
        }

        public Criteria andAssetlevelIsNotNull() {
            addCriterion("assetlevel is not null");
            return (Criteria) this;
        }

        public Criteria andAssetlevelEqualTo(Integer value) {
            addCriterion("assetlevel =", value, "assetlevel");
            return (Criteria) this;
        }

        public Criteria andAssetlevelNotEqualTo(Integer value) {
            addCriterion("assetlevel <>", value, "assetlevel");
            return (Criteria) this;
        }

        public Criteria andAssetlevelGreaterThan(Integer value) {
            addCriterion("assetlevel >", value, "assetlevel");
            return (Criteria) this;
        }

        public Criteria andAssetlevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("assetlevel >=", value, "assetlevel");
            return (Criteria) this;
        }

        public Criteria andAssetlevelLessThan(Integer value) {
            addCriterion("assetlevel <", value, "assetlevel");
            return (Criteria) this;
        }

        public Criteria andAssetlevelLessThanOrEqualTo(Integer value) {
            addCriterion("assetlevel <=", value, "assetlevel");
            return (Criteria) this;
        }

        public Criteria andAssetlevelIn(List<Integer> values) {
            addCriterion("assetlevel in", values, "assetlevel");
            return (Criteria) this;
        }

        public Criteria andAssetlevelNotIn(List<Integer> values) {
            addCriterion("assetlevel not in", values, "assetlevel");
            return (Criteria) this;
        }

        public Criteria andAssetlevelBetween(Integer value1, Integer value2) {
            addCriterion("assetlevel between", value1, value2, "assetlevel");
            return (Criteria) this;
        }

        public Criteria andAssetlevelNotBetween(Integer value1, Integer value2) {
            addCriterion("assetlevel not between", value1, value2, "assetlevel");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCoordinateIsNull() {
            addCriterion("coordinate is null");
            return (Criteria) this;
        }

        public Criteria andCoordinateIsNotNull() {
            addCriterion("coordinate is not null");
            return (Criteria) this;
        }

        public Criteria andCoordinateEqualTo(String value) {
            addCriterion("coordinate =", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateNotEqualTo(String value) {
            addCriterion("coordinate <>", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateGreaterThan(String value) {
            addCriterion("coordinate >", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateGreaterThanOrEqualTo(String value) {
            addCriterion("coordinate >=", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateLessThan(String value) {
            addCriterion("coordinate <", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateLessThanOrEqualTo(String value) {
            addCriterion("coordinate <=", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateLike(String value) {
            addCriterion("coordinate like", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateNotLike(String value) {
            addCriterion("coordinate not like", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateIn(List<String> values) {
            addCriterion("coordinate in", values, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateNotIn(List<String> values) {
            addCriterion("coordinate not in", values, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateBetween(String value1, String value2) {
            addCriterion("coordinate between", value1, value2, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateNotBetween(String value1, String value2) {
            addCriterion("coordinate not between", value1, value2, "coordinate");
            return (Criteria) this;
        }

        public Criteria andTipnameIsNull() {
            addCriterion("tipname is null");
            return (Criteria) this;
        }

        public Criteria andTipnameIsNotNull() {
            addCriterion("tipname is not null");
            return (Criteria) this;
        }

        public Criteria andTipnameEqualTo(String value) {
            addCriterion("tipname =", value, "tipname");
            return (Criteria) this;
        }

        public Criteria andTipnameNotEqualTo(String value) {
            addCriterion("tipname <>", value, "tipname");
            return (Criteria) this;
        }

        public Criteria andTipnameGreaterThan(String value) {
            addCriterion("tipname >", value, "tipname");
            return (Criteria) this;
        }

        public Criteria andTipnameGreaterThanOrEqualTo(String value) {
            addCriterion("tipname >=", value, "tipname");
            return (Criteria) this;
        }

        public Criteria andTipnameLessThan(String value) {
            addCriterion("tipname <", value, "tipname");
            return (Criteria) this;
        }

        public Criteria andTipnameLessThanOrEqualTo(String value) {
            addCriterion("tipname <=", value, "tipname");
            return (Criteria) this;
        }

        public Criteria andTipnameLike(String value) {
            addCriterion("tipname like", value, "tipname");
            return (Criteria) this;
        }

        public Criteria andTipnameNotLike(String value) {
            addCriterion("tipname not like", value, "tipname");
            return (Criteria) this;
        }

        public Criteria andTipnameIn(List<String> values) {
            addCriterion("tipname in", values, "tipname");
            return (Criteria) this;
        }

        public Criteria andTipnameNotIn(List<String> values) {
            addCriterion("tipname not in", values, "tipname");
            return (Criteria) this;
        }

        public Criteria andTipnameBetween(String value1, String value2) {
            addCriterion("tipname between", value1, value2, "tipname");
            return (Criteria) this;
        }

        public Criteria andTipnameNotBetween(String value1, String value2) {
            addCriterion("tipname not between", value1, value2, "tipname");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Long value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Long value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Long value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Long value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Long value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Long> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Long> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Long value1, Long value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Long value1, Long value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andProportionIsNull() {
            addCriterion("proportion is null");
            return (Criteria) this;
        }

        public Criteria andProportionIsNotNull() {
            addCriterion("proportion is not null");
            return (Criteria) this;
        }

        public Criteria andProportionEqualTo(Long value) {
            addCriterion("proportion =", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionNotEqualTo(Long value) {
            addCriterion("proportion <>", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionGreaterThan(Long value) {
            addCriterion("proportion >", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionGreaterThanOrEqualTo(Long value) {
            addCriterion("proportion >=", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionLessThan(Long value) {
            addCriterion("proportion <", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionLessThanOrEqualTo(Long value) {
            addCriterion("proportion <=", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionIn(List<Long> values) {
            addCriterion("proportion in", values, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionNotIn(List<Long> values) {
            addCriterion("proportion not in", values, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionBetween(Long value1, Long value2) {
            addCriterion("proportion between", value1, value2, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionNotBetween(Long value1, Long value2) {
            addCriterion("proportion not between", value1, value2, "proportion");
            return (Criteria) this;
        }

        public Criteria andAssetstatusIsNull() {
            addCriterion("assetstatus is null");
            return (Criteria) this;
        }

        public Criteria andAssetstatusIsNotNull() {
            addCriterion("assetstatus is not null");
            return (Criteria) this;
        }

        public Criteria andAssetstatusEqualTo(String value) {
            addCriterion("assetstatus =", value, "assetstatus");
            return (Criteria) this;
        }

        public Criteria andAssetstatusNotEqualTo(String value) {
            addCriterion("assetstatus <>", value, "assetstatus");
            return (Criteria) this;
        }

        public Criteria andAssetstatusGreaterThan(String value) {
            addCriterion("assetstatus >", value, "assetstatus");
            return (Criteria) this;
        }

        public Criteria andAssetstatusGreaterThanOrEqualTo(String value) {
            addCriterion("assetstatus >=", value, "assetstatus");
            return (Criteria) this;
        }

        public Criteria andAssetstatusLessThan(String value) {
            addCriterion("assetstatus <", value, "assetstatus");
            return (Criteria) this;
        }

        public Criteria andAssetstatusLessThanOrEqualTo(String value) {
            addCriterion("assetstatus <=", value, "assetstatus");
            return (Criteria) this;
        }

        public Criteria andAssetstatusLike(String value) {
            addCriterion("assetstatus like", value, "assetstatus");
            return (Criteria) this;
        }

        public Criteria andAssetstatusNotLike(String value) {
            addCriterion("assetstatus not like", value, "assetstatus");
            return (Criteria) this;
        }

        public Criteria andAssetstatusIn(List<String> values) {
            addCriterion("assetstatus in", values, "assetstatus");
            return (Criteria) this;
        }

        public Criteria andAssetstatusNotIn(List<String> values) {
            addCriterion("assetstatus not in", values, "assetstatus");
            return (Criteria) this;
        }

        public Criteria andAssetstatusBetween(String value1, String value2) {
            addCriterion("assetstatus between", value1, value2, "assetstatus");
            return (Criteria) this;
        }

        public Criteria andAssetstatusNotBetween(String value1, String value2) {
            addCriterion("assetstatus not between", value1, value2, "assetstatus");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("parentId is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentId is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Integer value) {
            addCriterion("parentId =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Integer value) {
            addCriterion("parentId <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Integer value) {
            addCriterion("parentId >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("parentId >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Integer value) {
            addCriterion("parentId <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Integer value) {
            addCriterion("parentId <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Integer> values) {
            addCriterion("parentId in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Integer> values) {
            addCriterion("parentId not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Integer value1, Integer value2) {
            addCriterion("parentId between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("parentId not between", value1, value2, "parentid");
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