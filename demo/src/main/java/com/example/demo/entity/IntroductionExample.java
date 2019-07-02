package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class IntroductionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IntroductionExample() {
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

        public Criteria andWareTitleIsNull() {
            addCriterion("ware_title is null");
            return (Criteria) this;
        }

        public Criteria andWareTitleIsNotNull() {
            addCriterion("ware_title is not null");
            return (Criteria) this;
        }

        public Criteria andWareTitleEqualTo(String value) {
            addCriterion("ware_title =", value, "wareTitle");
            return (Criteria) this;
        }

        public Criteria andWareTitleNotEqualTo(String value) {
            addCriterion("ware_title <>", value, "wareTitle");
            return (Criteria) this;
        }

        public Criteria andWareTitleGreaterThan(String value) {
            addCriterion("ware_title >", value, "wareTitle");
            return (Criteria) this;
        }

        public Criteria andWareTitleGreaterThanOrEqualTo(String value) {
            addCriterion("ware_title >=", value, "wareTitle");
            return (Criteria) this;
        }

        public Criteria andWareTitleLessThan(String value) {
            addCriterion("ware_title <", value, "wareTitle");
            return (Criteria) this;
        }

        public Criteria andWareTitleLessThanOrEqualTo(String value) {
            addCriterion("ware_title <=", value, "wareTitle");
            return (Criteria) this;
        }

        public Criteria andWareTitleLike(String value) {
            addCriterion("ware_title like", value, "wareTitle");
            return (Criteria) this;
        }

        public Criteria andWareTitleNotLike(String value) {
            addCriterion("ware_title not like", value, "wareTitle");
            return (Criteria) this;
        }

        public Criteria andWareTitleIn(List<String> values) {
            addCriterion("ware_title in", values, "wareTitle");
            return (Criteria) this;
        }

        public Criteria andWareTitleNotIn(List<String> values) {
            addCriterion("ware_title not in", values, "wareTitle");
            return (Criteria) this;
        }

        public Criteria andWareTitleBetween(String value1, String value2) {
            addCriterion("ware_title between", value1, value2, "wareTitle");
            return (Criteria) this;
        }

        public Criteria andWareTitleNotBetween(String value1, String value2) {
            addCriterion("ware_title not between", value1, value2, "wareTitle");
            return (Criteria) this;
        }

        public Criteria andNewPriceIsNull() {
            addCriterion("new_price is null");
            return (Criteria) this;
        }

        public Criteria andNewPriceIsNotNull() {
            addCriterion("new_price is not null");
            return (Criteria) this;
        }

        public Criteria andNewPriceEqualTo(String value) {
            addCriterion("new_price =", value, "newPrice");
            return (Criteria) this;
        }

        public Criteria andNewPriceNotEqualTo(String value) {
            addCriterion("new_price <>", value, "newPrice");
            return (Criteria) this;
        }

        public Criteria andNewPriceGreaterThan(String value) {
            addCriterion("new_price >", value, "newPrice");
            return (Criteria) this;
        }

        public Criteria andNewPriceGreaterThanOrEqualTo(String value) {
            addCriterion("new_price >=", value, "newPrice");
            return (Criteria) this;
        }

        public Criteria andNewPriceLessThan(String value) {
            addCriterion("new_price <", value, "newPrice");
            return (Criteria) this;
        }

        public Criteria andNewPriceLessThanOrEqualTo(String value) {
            addCriterion("new_price <=", value, "newPrice");
            return (Criteria) this;
        }

        public Criteria andNewPriceLike(String value) {
            addCriterion("new_price like", value, "newPrice");
            return (Criteria) this;
        }

        public Criteria andNewPriceNotLike(String value) {
            addCriterion("new_price not like", value, "newPrice");
            return (Criteria) this;
        }

        public Criteria andNewPriceIn(List<String> values) {
            addCriterion("new_price in", values, "newPrice");
            return (Criteria) this;
        }

        public Criteria andNewPriceNotIn(List<String> values) {
            addCriterion("new_price not in", values, "newPrice");
            return (Criteria) this;
        }

        public Criteria andNewPriceBetween(String value1, String value2) {
            addCriterion("new_price between", value1, value2, "newPrice");
            return (Criteria) this;
        }

        public Criteria andNewPriceNotBetween(String value1, String value2) {
            addCriterion("new_price not between", value1, value2, "newPrice");
            return (Criteria) this;
        }

        public Criteria andOldPriceIsNull() {
            addCriterion("old_price is null");
            return (Criteria) this;
        }

        public Criteria andOldPriceIsNotNull() {
            addCriterion("old_price is not null");
            return (Criteria) this;
        }

        public Criteria andOldPriceEqualTo(String value) {
            addCriterion("old_price =", value, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andOldPriceNotEqualTo(String value) {
            addCriterion("old_price <>", value, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andOldPriceGreaterThan(String value) {
            addCriterion("old_price >", value, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andOldPriceGreaterThanOrEqualTo(String value) {
            addCriterion("old_price >=", value, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andOldPriceLessThan(String value) {
            addCriterion("old_price <", value, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andOldPriceLessThanOrEqualTo(String value) {
            addCriterion("old_price <=", value, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andOldPriceLike(String value) {
            addCriterion("old_price like", value, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andOldPriceNotLike(String value) {
            addCriterion("old_price not like", value, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andOldPriceIn(List<String> values) {
            addCriterion("old_price in", values, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andOldPriceNotIn(List<String> values) {
            addCriterion("old_price not in", values, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andOldPriceBetween(String value1, String value2) {
            addCriterion("old_price between", value1, value2, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andOldPriceNotBetween(String value1, String value2) {
            addCriterion("old_price not between", value1, value2, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIsNull() {
            addCriterion("delivery_address is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIsNotNull() {
            addCriterion("delivery_address is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressEqualTo(String value) {
            addCriterion("delivery_address =", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressNotEqualTo(String value) {
            addCriterion("delivery_address <>", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressGreaterThan(String value) {
            addCriterion("delivery_address >", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_address >=", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressLessThan(String value) {
            addCriterion("delivery_address <", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressLessThanOrEqualTo(String value) {
            addCriterion("delivery_address <=", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressLike(String value) {
            addCriterion("delivery_address like", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressNotLike(String value) {
            addCriterion("delivery_address not like", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIn(List<String> values) {
            addCriterion("delivery_address in", values, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressNotIn(List<String> values) {
            addCriterion("delivery_address not in", values, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressBetween(String value1, String value2) {
            addCriterion("delivery_address between", value1, value2, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressNotBetween(String value1, String value2) {
            addCriterion("delivery_address not between", value1, value2, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andMsalesVolumeIsNull() {
            addCriterion("msales_volume is null");
            return (Criteria) this;
        }

        public Criteria andMsalesVolumeIsNotNull() {
            addCriterion("msales_volume is not null");
            return (Criteria) this;
        }

        public Criteria andMsalesVolumeEqualTo(Integer value) {
            addCriterion("msales_volume =", value, "msalesVolume");
            return (Criteria) this;
        }

        public Criteria andMsalesVolumeNotEqualTo(Integer value) {
            addCriterion("msales_volume <>", value, "msalesVolume");
            return (Criteria) this;
        }

        public Criteria andMsalesVolumeGreaterThan(Integer value) {
            addCriterion("msales_volume >", value, "msalesVolume");
            return (Criteria) this;
        }

        public Criteria andMsalesVolumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("msales_volume >=", value, "msalesVolume");
            return (Criteria) this;
        }

        public Criteria andMsalesVolumeLessThan(Integer value) {
            addCriterion("msales_volume <", value, "msalesVolume");
            return (Criteria) this;
        }

        public Criteria andMsalesVolumeLessThanOrEqualTo(Integer value) {
            addCriterion("msales_volume <=", value, "msalesVolume");
            return (Criteria) this;
        }

        public Criteria andMsalesVolumeIn(List<Integer> values) {
            addCriterion("msales_volume in", values, "msalesVolume");
            return (Criteria) this;
        }

        public Criteria andMsalesVolumeNotIn(List<Integer> values) {
            addCriterion("msales_volume not in", values, "msalesVolume");
            return (Criteria) this;
        }

        public Criteria andMsalesVolumeBetween(Integer value1, Integer value2) {
            addCriterion("msales_volume between", value1, value2, "msalesVolume");
            return (Criteria) this;
        }

        public Criteria andMsalesVolumeNotBetween(Integer value1, Integer value2) {
            addCriterion("msales_volume not between", value1, value2, "msalesVolume");
            return (Criteria) this;
        }

        public Criteria andSsalesVolumeIsNull() {
            addCriterion("ssales_volume is null");
            return (Criteria) this;
        }

        public Criteria andSsalesVolumeIsNotNull() {
            addCriterion("ssales_volume is not null");
            return (Criteria) this;
        }

        public Criteria andSsalesVolumeEqualTo(Integer value) {
            addCriterion("ssales_volume =", value, "ssalesVolume");
            return (Criteria) this;
        }

        public Criteria andSsalesVolumeNotEqualTo(Integer value) {
            addCriterion("ssales_volume <>", value, "ssalesVolume");
            return (Criteria) this;
        }

        public Criteria andSsalesVolumeGreaterThan(Integer value) {
            addCriterion("ssales_volume >", value, "ssalesVolume");
            return (Criteria) this;
        }

        public Criteria andSsalesVolumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ssales_volume >=", value, "ssalesVolume");
            return (Criteria) this;
        }

        public Criteria andSsalesVolumeLessThan(Integer value) {
            addCriterion("ssales_volume <", value, "ssalesVolume");
            return (Criteria) this;
        }

        public Criteria andSsalesVolumeLessThanOrEqualTo(Integer value) {
            addCriterion("ssales_volume <=", value, "ssalesVolume");
            return (Criteria) this;
        }

        public Criteria andSsalesVolumeIn(List<Integer> values) {
            addCriterion("ssales_volume in", values, "ssalesVolume");
            return (Criteria) this;
        }

        public Criteria andSsalesVolumeNotIn(List<Integer> values) {
            addCriterion("ssales_volume not in", values, "ssalesVolume");
            return (Criteria) this;
        }

        public Criteria andSsalesVolumeBetween(Integer value1, Integer value2) {
            addCriterion("ssales_volume between", value1, value2, "ssalesVolume");
            return (Criteria) this;
        }

        public Criteria andSsalesVolumeNotBetween(Integer value1, Integer value2) {
            addCriterion("ssales_volume not between", value1, value2, "ssalesVolume");
            return (Criteria) this;
        }

        public Criteria andTasteIsNull() {
            addCriterion("taste is null");
            return (Criteria) this;
        }

        public Criteria andTasteIsNotNull() {
            addCriterion("taste is not null");
            return (Criteria) this;
        }

        public Criteria andTasteEqualTo(String value) {
            addCriterion("taste =", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteNotEqualTo(String value) {
            addCriterion("taste <>", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteGreaterThan(String value) {
            addCriterion("taste >", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteGreaterThanOrEqualTo(String value) {
            addCriterion("taste >=", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteLessThan(String value) {
            addCriterion("taste <", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteLessThanOrEqualTo(String value) {
            addCriterion("taste <=", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteLike(String value) {
            addCriterion("taste like", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteNotLike(String value) {
            addCriterion("taste not like", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteIn(List<String> values) {
            addCriterion("taste in", values, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteNotIn(List<String> values) {
            addCriterion("taste not in", values, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteBetween(String value1, String value2) {
            addCriterion("taste between", value1, value2, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteNotBetween(String value1, String value2) {
            addCriterion("taste not between", value1, value2, "taste");
            return (Criteria) this;
        }

        public Criteria andPackIsNull() {
            addCriterion("pack is null");
            return (Criteria) this;
        }

        public Criteria andPackIsNotNull() {
            addCriterion("pack is not null");
            return (Criteria) this;
        }

        public Criteria andPackEqualTo(String value) {
            addCriterion("pack =", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackNotEqualTo(String value) {
            addCriterion("pack <>", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackGreaterThan(String value) {
            addCriterion("pack >", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackGreaterThanOrEqualTo(String value) {
            addCriterion("pack >=", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackLessThan(String value) {
            addCriterion("pack <", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackLessThanOrEqualTo(String value) {
            addCriterion("pack <=", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackLike(String value) {
            addCriterion("pack like", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackNotLike(String value) {
            addCriterion("pack not like", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackIn(List<String> values) {
            addCriterion("pack in", values, "pack");
            return (Criteria) this;
        }

        public Criteria andPackNotIn(List<String> values) {
            addCriterion("pack not in", values, "pack");
            return (Criteria) this;
        }

        public Criteria andPackBetween(String value1, String value2) {
            addCriterion("pack between", value1, value2, "pack");
            return (Criteria) this;
        }

        public Criteria andPackNotBetween(String value1, String value2) {
            addCriterion("pack not between", value1, value2, "pack");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
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