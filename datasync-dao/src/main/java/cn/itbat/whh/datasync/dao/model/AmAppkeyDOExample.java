package cn.itbat.whh.datasync.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AmAppkeyDOExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public AmAppkeyDOExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    /**
     * am_appkey 2018-04-19
     */
    protected abstract static class GeneratedCriteria implements Serializable {
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

        public Criteria andAppUkidIsNull() {
            addCriterion("app_ukid is null");
            return (Criteria) this;
        }

        public Criteria andAppUkidIsNotNull() {
            addCriterion("app_ukid is not null");
            return (Criteria) this;
        }

        public Criteria andAppUkidEqualTo(Long value) {
            addCriterion("app_ukid =", value, "appUkid");
            return (Criteria) this;
        }

        public Criteria andAppUkidNotEqualTo(Long value) {
            addCriterion("app_ukid <>", value, "appUkid");
            return (Criteria) this;
        }

        public Criteria andAppUkidGreaterThan(Long value) {
            addCriterion("app_ukid >", value, "appUkid");
            return (Criteria) this;
        }

        public Criteria andAppUkidGreaterThanOrEqualTo(Long value) {
            addCriterion("app_ukid >=", value, "appUkid");
            return (Criteria) this;
        }

        public Criteria andAppUkidLessThan(Long value) {
            addCriterion("app_ukid <", value, "appUkid");
            return (Criteria) this;
        }

        public Criteria andAppUkidLessThanOrEqualTo(Long value) {
            addCriterion("app_ukid <=", value, "appUkid");
            return (Criteria) this;
        }

        public Criteria andAppUkidIn(List<Long> values) {
            addCriterion("app_ukid in", values, "appUkid");
            return (Criteria) this;
        }

        public Criteria andAppUkidNotIn(List<Long> values) {
            addCriterion("app_ukid not in", values, "appUkid");
            return (Criteria) this;
        }

        public Criteria andAppUkidBetween(Long value1, Long value2) {
            addCriterion("app_ukid between", value1, value2, "appUkid");
            return (Criteria) this;
        }

        public Criteria andAppUkidNotBetween(Long value1, Long value2) {
            addCriterion("app_ukid not between", value1, value2, "appUkid");
            return (Criteria) this;
        }

        public Criteria andAppNameIsNull() {
            addCriterion("app_name is null");
            return (Criteria) this;
        }

        public Criteria andAppNameIsNotNull() {
            addCriterion("app_name is not null");
            return (Criteria) this;
        }

        public Criteria andAppNameEqualTo(String value) {
            addCriterion("app_name =", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotEqualTo(String value) {
            addCriterion("app_name <>", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThan(String value) {
            addCriterion("app_name >", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThanOrEqualTo(String value) {
            addCriterion("app_name >=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThan(String value) {
            addCriterion("app_name <", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThanOrEqualTo(String value) {
            addCriterion("app_name <=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLike(String value) {
            addCriterion("app_name like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotLike(String value) {
            addCriterion("app_name not like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameIn(List<String> values) {
            addCriterion("app_name in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotIn(List<String> values) {
            addCriterion("app_name not in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameBetween(String value1, String value2) {
            addCriterion("app_name between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotBetween(String value1, String value2) {
            addCriterion("app_name not between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andPlatformIdIsNull() {
            addCriterion("platform_id is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIdIsNotNull() {
            addCriterion("platform_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformIdEqualTo(Long value) {
            addCriterion("platform_id =", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotEqualTo(Long value) {
            addCriterion("platform_id <>", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdGreaterThan(Long value) {
            addCriterion("platform_id >", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdGreaterThanOrEqualTo(Long value) {
            addCriterion("platform_id >=", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdLessThan(Long value) {
            addCriterion("platform_id <", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdLessThanOrEqualTo(Long value) {
            addCriterion("platform_id <=", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdIn(List<Long> values) {
            addCriterion("platform_id in", values, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotIn(List<Long> values) {
            addCriterion("platform_id not in", values, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdBetween(Long value1, Long value2) {
            addCriterion("platform_id between", value1, value2, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotBetween(Long value1, Long value2) {
            addCriterion("platform_id not between", value1, value2, "platformId");
            return (Criteria) this;
        }

        public Criteria andOwnerBuIdIsNull() {
            addCriterion("owner_bu_id is null");
            return (Criteria) this;
        }

        public Criteria andOwnerBuIdIsNotNull() {
            addCriterion("owner_bu_id is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerBuIdEqualTo(Long value) {
            addCriterion("owner_bu_id =", value, "ownerBuId");
            return (Criteria) this;
        }

        public Criteria andOwnerBuIdNotEqualTo(Long value) {
            addCriterion("owner_bu_id <>", value, "ownerBuId");
            return (Criteria) this;
        }

        public Criteria andOwnerBuIdGreaterThan(Long value) {
            addCriterion("owner_bu_id >", value, "ownerBuId");
            return (Criteria) this;
        }

        public Criteria andOwnerBuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("owner_bu_id >=", value, "ownerBuId");
            return (Criteria) this;
        }

        public Criteria andOwnerBuIdLessThan(Long value) {
            addCriterion("owner_bu_id <", value, "ownerBuId");
            return (Criteria) this;
        }

        public Criteria andOwnerBuIdLessThanOrEqualTo(Long value) {
            addCriterion("owner_bu_id <=", value, "ownerBuId");
            return (Criteria) this;
        }

        public Criteria andOwnerBuIdIn(List<Long> values) {
            addCriterion("owner_bu_id in", values, "ownerBuId");
            return (Criteria) this;
        }

        public Criteria andOwnerBuIdNotIn(List<Long> values) {
            addCriterion("owner_bu_id not in", values, "ownerBuId");
            return (Criteria) this;
        }

        public Criteria andOwnerBuIdBetween(Long value1, Long value2) {
            addCriterion("owner_bu_id between", value1, value2, "ownerBuId");
            return (Criteria) this;
        }

        public Criteria andOwnerBuIdNotBetween(Long value1, Long value2) {
            addCriterion("owner_bu_id not between", value1, value2, "ownerBuId");
            return (Criteria) this;
        }

        public Criteria andAppTypeIsNull() {
            addCriterion("app_type is null");
            return (Criteria) this;
        }

        public Criteria andAppTypeIsNotNull() {
            addCriterion("app_type is not null");
            return (Criteria) this;
        }

        public Criteria andAppTypeEqualTo(String value) {
            addCriterion("app_type =", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeNotEqualTo(String value) {
            addCriterion("app_type <>", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeGreaterThan(String value) {
            addCriterion("app_type >", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeGreaterThanOrEqualTo(String value) {
            addCriterion("app_type >=", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeLessThan(String value) {
            addCriterion("app_type <", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeLessThanOrEqualTo(String value) {
            addCriterion("app_type <=", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeLike(String value) {
            addCriterion("app_type like", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeNotLike(String value) {
            addCriterion("app_type not like", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeIn(List<String> values) {
            addCriterion("app_type in", values, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeNotIn(List<String> values) {
            addCriterion("app_type not in", values, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeBetween(String value1, String value2) {
            addCriterion("app_type between", value1, value2, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeNotBetween(String value1, String value2) {
            addCriterion("app_type not between", value1, value2, "appType");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAuthTypeIsNull() {
            addCriterion("auth_type is null");
            return (Criteria) this;
        }

        public Criteria andAuthTypeIsNotNull() {
            addCriterion("auth_type is not null");
            return (Criteria) this;
        }

        public Criteria andAuthTypeEqualTo(String value) {
            addCriterion("auth_type =", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeNotEqualTo(String value) {
            addCriterion("auth_type <>", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeGreaterThan(String value) {
            addCriterion("auth_type >", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeGreaterThanOrEqualTo(String value) {
            addCriterion("auth_type >=", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeLessThan(String value) {
            addCriterion("auth_type <", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeLessThanOrEqualTo(String value) {
            addCriterion("auth_type <=", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeLike(String value) {
            addCriterion("auth_type like", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeNotLike(String value) {
            addCriterion("auth_type not like", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeIn(List<String> values) {
            addCriterion("auth_type in", values, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeNotIn(List<String> values) {
            addCriterion("auth_type not in", values, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeBetween(String value1, String value2) {
            addCriterion("auth_type between", value1, value2, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeNotBetween(String value1, String value2) {
            addCriterion("auth_type not between", value1, value2, "authType");
            return (Criteria) this;
        }

        public Criteria andApiUrlIsNull() {
            addCriterion("api_url is null");
            return (Criteria) this;
        }

        public Criteria andApiUrlIsNotNull() {
            addCriterion("api_url is not null");
            return (Criteria) this;
        }

        public Criteria andApiUrlEqualTo(String value) {
            addCriterion("api_url =", value, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlNotEqualTo(String value) {
            addCriterion("api_url <>", value, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlGreaterThan(String value) {
            addCriterion("api_url >", value, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlGreaterThanOrEqualTo(String value) {
            addCriterion("api_url >=", value, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlLessThan(String value) {
            addCriterion("api_url <", value, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlLessThanOrEqualTo(String value) {
            addCriterion("api_url <=", value, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlLike(String value) {
            addCriterion("api_url like", value, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlNotLike(String value) {
            addCriterion("api_url not like", value, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlIn(List<String> values) {
            addCriterion("api_url in", values, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlNotIn(List<String> values) {
            addCriterion("api_url not in", values, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlBetween(String value1, String value2) {
            addCriterion("api_url between", value1, value2, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlNotBetween(String value1, String value2) {
            addCriterion("api_url not between", value1, value2, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andAppKeyIsNull() {
            addCriterion("app_key is null");
            return (Criteria) this;
        }

        public Criteria andAppKeyIsNotNull() {
            addCriterion("app_key is not null");
            return (Criteria) this;
        }

        public Criteria andAppKeyEqualTo(String value) {
            addCriterion("app_key =", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyNotEqualTo(String value) {
            addCriterion("app_key <>", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyGreaterThan(String value) {
            addCriterion("app_key >", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyGreaterThanOrEqualTo(String value) {
            addCriterion("app_key >=", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyLessThan(String value) {
            addCriterion("app_key <", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyLessThanOrEqualTo(String value) {
            addCriterion("app_key <=", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyLike(String value) {
            addCriterion("app_key like", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyNotLike(String value) {
            addCriterion("app_key not like", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyIn(List<String> values) {
            addCriterion("app_key in", values, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyNotIn(List<String> values) {
            addCriterion("app_key not in", values, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyBetween(String value1, String value2) {
            addCriterion("app_key between", value1, value2, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyNotBetween(String value1, String value2) {
            addCriterion("app_key not between", value1, value2, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppSecretIsNull() {
            addCriterion("app_secret is null");
            return (Criteria) this;
        }

        public Criteria andAppSecretIsNotNull() {
            addCriterion("app_secret is not null");
            return (Criteria) this;
        }

        public Criteria andAppSecretEqualTo(String value) {
            addCriterion("app_secret =", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretNotEqualTo(String value) {
            addCriterion("app_secret <>", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretGreaterThan(String value) {
            addCriterion("app_secret >", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretGreaterThanOrEqualTo(String value) {
            addCriterion("app_secret >=", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretLessThan(String value) {
            addCriterion("app_secret <", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretLessThanOrEqualTo(String value) {
            addCriterion("app_secret <=", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretLike(String value) {
            addCriterion("app_secret like", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretNotLike(String value) {
            addCriterion("app_secret not like", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretIn(List<String> values) {
            addCriterion("app_secret in", values, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretNotIn(List<String> values) {
            addCriterion("app_secret not in", values, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretBetween(String value1, String value2) {
            addCriterion("app_secret between", value1, value2, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretNotBetween(String value1, String value2) {
            addCriterion("app_secret not between", value1, value2, "appSecret");
            return (Criteria) this;
        }

        public Criteria andDataFormatIsNull() {
            addCriterion("data_format is null");
            return (Criteria) this;
        }

        public Criteria andDataFormatIsNotNull() {
            addCriterion("data_format is not null");
            return (Criteria) this;
        }

        public Criteria andDataFormatEqualTo(String value) {
            addCriterion("data_format =", value, "dataFormat");
            return (Criteria) this;
        }

        public Criteria andDataFormatNotEqualTo(String value) {
            addCriterion("data_format <>", value, "dataFormat");
            return (Criteria) this;
        }

        public Criteria andDataFormatGreaterThan(String value) {
            addCriterion("data_format >", value, "dataFormat");
            return (Criteria) this;
        }

        public Criteria andDataFormatGreaterThanOrEqualTo(String value) {
            addCriterion("data_format >=", value, "dataFormat");
            return (Criteria) this;
        }

        public Criteria andDataFormatLessThan(String value) {
            addCriterion("data_format <", value, "dataFormat");
            return (Criteria) this;
        }

        public Criteria andDataFormatLessThanOrEqualTo(String value) {
            addCriterion("data_format <=", value, "dataFormat");
            return (Criteria) this;
        }

        public Criteria andDataFormatLike(String value) {
            addCriterion("data_format like", value, "dataFormat");
            return (Criteria) this;
        }

        public Criteria andDataFormatNotLike(String value) {
            addCriterion("data_format not like", value, "dataFormat");
            return (Criteria) this;
        }

        public Criteria andDataFormatIn(List<String> values) {
            addCriterion("data_format in", values, "dataFormat");
            return (Criteria) this;
        }

        public Criteria andDataFormatNotIn(List<String> values) {
            addCriterion("data_format not in", values, "dataFormat");
            return (Criteria) this;
        }

        public Criteria andDataFormatBetween(String value1, String value2) {
            addCriterion("data_format between", value1, value2, "dataFormat");
            return (Criteria) this;
        }

        public Criteria andDataFormatNotBetween(String value1, String value2) {
            addCriterion("data_format not between", value1, value2, "dataFormat");
            return (Criteria) this;
        }

        public Criteria andCharsetIsNull() {
            addCriterion("charset is null");
            return (Criteria) this;
        }

        public Criteria andCharsetIsNotNull() {
            addCriterion("charset is not null");
            return (Criteria) this;
        }

        public Criteria andCharsetEqualTo(String value) {
            addCriterion("charset =", value, "charset");
            return (Criteria) this;
        }

        public Criteria andCharsetNotEqualTo(String value) {
            addCriterion("charset <>", value, "charset");
            return (Criteria) this;
        }

        public Criteria andCharsetGreaterThan(String value) {
            addCriterion("charset >", value, "charset");
            return (Criteria) this;
        }

        public Criteria andCharsetGreaterThanOrEqualTo(String value) {
            addCriterion("charset >=", value, "charset");
            return (Criteria) this;
        }

        public Criteria andCharsetLessThan(String value) {
            addCriterion("charset <", value, "charset");
            return (Criteria) this;
        }

        public Criteria andCharsetLessThanOrEqualTo(String value) {
            addCriterion("charset <=", value, "charset");
            return (Criteria) this;
        }

        public Criteria andCharsetLike(String value) {
            addCriterion("charset like", value, "charset");
            return (Criteria) this;
        }

        public Criteria andCharsetNotLike(String value) {
            addCriterion("charset not like", value, "charset");
            return (Criteria) this;
        }

        public Criteria andCharsetIn(List<String> values) {
            addCriterion("charset in", values, "charset");
            return (Criteria) this;
        }

        public Criteria andCharsetNotIn(List<String> values) {
            addCriterion("charset not in", values, "charset");
            return (Criteria) this;
        }

        public Criteria andCharsetBetween(String value1, String value2) {
            addCriterion("charset between", value1, value2, "charset");
            return (Criteria) this;
        }

        public Criteria andCharsetNotBetween(String value1, String value2) {
            addCriterion("charset not between", value1, value2, "charset");
            return (Criteria) this;
        }

        public Criteria andSignMethodIsNull() {
            addCriterion("sign_method is null");
            return (Criteria) this;
        }

        public Criteria andSignMethodIsNotNull() {
            addCriterion("sign_method is not null");
            return (Criteria) this;
        }

        public Criteria andSignMethodEqualTo(String value) {
            addCriterion("sign_method =", value, "signMethod");
            return (Criteria) this;
        }

        public Criteria andSignMethodNotEqualTo(String value) {
            addCriterion("sign_method <>", value, "signMethod");
            return (Criteria) this;
        }

        public Criteria andSignMethodGreaterThan(String value) {
            addCriterion("sign_method >", value, "signMethod");
            return (Criteria) this;
        }

        public Criteria andSignMethodGreaterThanOrEqualTo(String value) {
            addCriterion("sign_method >=", value, "signMethod");
            return (Criteria) this;
        }

        public Criteria andSignMethodLessThan(String value) {
            addCriterion("sign_method <", value, "signMethod");
            return (Criteria) this;
        }

        public Criteria andSignMethodLessThanOrEqualTo(String value) {
            addCriterion("sign_method <=", value, "signMethod");
            return (Criteria) this;
        }

        public Criteria andSignMethodLike(String value) {
            addCriterion("sign_method like", value, "signMethod");
            return (Criteria) this;
        }

        public Criteria andSignMethodNotLike(String value) {
            addCriterion("sign_method not like", value, "signMethod");
            return (Criteria) this;
        }

        public Criteria andSignMethodIn(List<String> values) {
            addCriterion("sign_method in", values, "signMethod");
            return (Criteria) this;
        }

        public Criteria andSignMethodNotIn(List<String> values) {
            addCriterion("sign_method not in", values, "signMethod");
            return (Criteria) this;
        }

        public Criteria andSignMethodBetween(String value1, String value2) {
            addCriterion("sign_method between", value1, value2, "signMethod");
            return (Criteria) this;
        }

        public Criteria andSignMethodNotBetween(String value1, String value2) {
            addCriterion("sign_method not between", value1, value2, "signMethod");
            return (Criteria) this;
        }

        public Criteria andDataEncryptIsNull() {
            addCriterion("data_encrypt is null");
            return (Criteria) this;
        }

        public Criteria andDataEncryptIsNotNull() {
            addCriterion("data_encrypt is not null");
            return (Criteria) this;
        }

        public Criteria andDataEncryptEqualTo(Long value) {
            addCriterion("data_encrypt =", value, "dataEncrypt");
            return (Criteria) this;
        }

        public Criteria andDataEncryptNotEqualTo(Long value) {
            addCriterion("data_encrypt <>", value, "dataEncrypt");
            return (Criteria) this;
        }

        public Criteria andDataEncryptGreaterThan(Long value) {
            addCriterion("data_encrypt >", value, "dataEncrypt");
            return (Criteria) this;
        }

        public Criteria andDataEncryptGreaterThanOrEqualTo(Long value) {
            addCriterion("data_encrypt >=", value, "dataEncrypt");
            return (Criteria) this;
        }

        public Criteria andDataEncryptLessThan(Long value) {
            addCriterion("data_encrypt <", value, "dataEncrypt");
            return (Criteria) this;
        }

        public Criteria andDataEncryptLessThanOrEqualTo(Long value) {
            addCriterion("data_encrypt <=", value, "dataEncrypt");
            return (Criteria) this;
        }

        public Criteria andDataEncryptIn(List<Long> values) {
            addCriterion("data_encrypt in", values, "dataEncrypt");
            return (Criteria) this;
        }

        public Criteria andDataEncryptNotIn(List<Long> values) {
            addCriterion("data_encrypt not in", values, "dataEncrypt");
            return (Criteria) this;
        }

        public Criteria andDataEncryptBetween(Long value1, Long value2) {
            addCriterion("data_encrypt between", value1, value2, "dataEncrypt");
            return (Criteria) this;
        }

        public Criteria andDataEncryptNotBetween(Long value1, Long value2) {
            addCriterion("data_encrypt not between", value1, value2, "dataEncrypt");
            return (Criteria) this;
        }

        public Criteria andDataEncryptTypeIsNull() {
            addCriterion("data_encrypt_type is null");
            return (Criteria) this;
        }

        public Criteria andDataEncryptTypeIsNotNull() {
            addCriterion("data_encrypt_type is not null");
            return (Criteria) this;
        }

        public Criteria andDataEncryptTypeEqualTo(String value) {
            addCriterion("data_encrypt_type =", value, "dataEncryptType");
            return (Criteria) this;
        }

        public Criteria andDataEncryptTypeNotEqualTo(String value) {
            addCriterion("data_encrypt_type <>", value, "dataEncryptType");
            return (Criteria) this;
        }

        public Criteria andDataEncryptTypeGreaterThan(String value) {
            addCriterion("data_encrypt_type >", value, "dataEncryptType");
            return (Criteria) this;
        }

        public Criteria andDataEncryptTypeGreaterThanOrEqualTo(String value) {
            addCriterion("data_encrypt_type >=", value, "dataEncryptType");
            return (Criteria) this;
        }

        public Criteria andDataEncryptTypeLessThan(String value) {
            addCriterion("data_encrypt_type <", value, "dataEncryptType");
            return (Criteria) this;
        }

        public Criteria andDataEncryptTypeLessThanOrEqualTo(String value) {
            addCriterion("data_encrypt_type <=", value, "dataEncryptType");
            return (Criteria) this;
        }

        public Criteria andDataEncryptTypeLike(String value) {
            addCriterion("data_encrypt_type like", value, "dataEncryptType");
            return (Criteria) this;
        }

        public Criteria andDataEncryptTypeNotLike(String value) {
            addCriterion("data_encrypt_type not like", value, "dataEncryptType");
            return (Criteria) this;
        }

        public Criteria andDataEncryptTypeIn(List<String> values) {
            addCriterion("data_encrypt_type in", values, "dataEncryptType");
            return (Criteria) this;
        }

        public Criteria andDataEncryptTypeNotIn(List<String> values) {
            addCriterion("data_encrypt_type not in", values, "dataEncryptType");
            return (Criteria) this;
        }

        public Criteria andDataEncryptTypeBetween(String value1, String value2) {
            addCriterion("data_encrypt_type between", value1, value2, "dataEncryptType");
            return (Criteria) this;
        }

        public Criteria andDataEncryptTypeNotBetween(String value1, String value2) {
            addCriterion("data_encrypt_type not between", value1, value2, "dataEncryptType");
            return (Criteria) this;
        }

        public Criteria andAuthFilePathIsNull() {
            addCriterion("auth_file_path is null");
            return (Criteria) this;
        }

        public Criteria andAuthFilePathIsNotNull() {
            addCriterion("auth_file_path is not null");
            return (Criteria) this;
        }

        public Criteria andAuthFilePathEqualTo(String value) {
            addCriterion("auth_file_path =", value, "authFilePath");
            return (Criteria) this;
        }

        public Criteria andAuthFilePathNotEqualTo(String value) {
            addCriterion("auth_file_path <>", value, "authFilePath");
            return (Criteria) this;
        }

        public Criteria andAuthFilePathGreaterThan(String value) {
            addCriterion("auth_file_path >", value, "authFilePath");
            return (Criteria) this;
        }

        public Criteria andAuthFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("auth_file_path >=", value, "authFilePath");
            return (Criteria) this;
        }

        public Criteria andAuthFilePathLessThan(String value) {
            addCriterion("auth_file_path <", value, "authFilePath");
            return (Criteria) this;
        }

        public Criteria andAuthFilePathLessThanOrEqualTo(String value) {
            addCriterion("auth_file_path <=", value, "authFilePath");
            return (Criteria) this;
        }

        public Criteria andAuthFilePathLike(String value) {
            addCriterion("auth_file_path like", value, "authFilePath");
            return (Criteria) this;
        }

        public Criteria andAuthFilePathNotLike(String value) {
            addCriterion("auth_file_path not like", value, "authFilePath");
            return (Criteria) this;
        }

        public Criteria andAuthFilePathIn(List<String> values) {
            addCriterion("auth_file_path in", values, "authFilePath");
            return (Criteria) this;
        }

        public Criteria andAuthFilePathNotIn(List<String> values) {
            addCriterion("auth_file_path not in", values, "authFilePath");
            return (Criteria) this;
        }

        public Criteria andAuthFilePathBetween(String value1, String value2) {
            addCriterion("auth_file_path between", value1, value2, "authFilePath");
            return (Criteria) this;
        }

        public Criteria andAuthFilePathNotBetween(String value1, String value2) {
            addCriterion("auth_file_path not between", value1, value2, "authFilePath");
            return (Criteria) this;
        }

        public Criteria andSysParamFormatIsNull() {
            addCriterion("sys_param_format is null");
            return (Criteria) this;
        }

        public Criteria andSysParamFormatIsNotNull() {
            addCriterion("sys_param_format is not null");
            return (Criteria) this;
        }

        public Criteria andSysParamFormatEqualTo(String value) {
            addCriterion("sys_param_format =", value, "sysParamFormat");
            return (Criteria) this;
        }

        public Criteria andSysParamFormatNotEqualTo(String value) {
            addCriterion("sys_param_format <>", value, "sysParamFormat");
            return (Criteria) this;
        }

        public Criteria andSysParamFormatGreaterThan(String value) {
            addCriterion("sys_param_format >", value, "sysParamFormat");
            return (Criteria) this;
        }

        public Criteria andSysParamFormatGreaterThanOrEqualTo(String value) {
            addCriterion("sys_param_format >=", value, "sysParamFormat");
            return (Criteria) this;
        }

        public Criteria andSysParamFormatLessThan(String value) {
            addCriterion("sys_param_format <", value, "sysParamFormat");
            return (Criteria) this;
        }

        public Criteria andSysParamFormatLessThanOrEqualTo(String value) {
            addCriterion("sys_param_format <=", value, "sysParamFormat");
            return (Criteria) this;
        }

        public Criteria andSysParamFormatLike(String value) {
            addCriterion("sys_param_format like", value, "sysParamFormat");
            return (Criteria) this;
        }

        public Criteria andSysParamFormatNotLike(String value) {
            addCriterion("sys_param_format not like", value, "sysParamFormat");
            return (Criteria) this;
        }

        public Criteria andSysParamFormatIn(List<String> values) {
            addCriterion("sys_param_format in", values, "sysParamFormat");
            return (Criteria) this;
        }

        public Criteria andSysParamFormatNotIn(List<String> values) {
            addCriterion("sys_param_format not in", values, "sysParamFormat");
            return (Criteria) this;
        }

        public Criteria andSysParamFormatBetween(String value1, String value2) {
            addCriterion("sys_param_format between", value1, value2, "sysParamFormat");
            return (Criteria) this;
        }

        public Criteria andSysParamFormatNotBetween(String value1, String value2) {
            addCriterion("sys_param_format not between", value1, value2, "sysParamFormat");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountIdIsNull() {
            addCriterion("platform_account_id is null");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountIdIsNotNull() {
            addCriterion("platform_account_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountIdEqualTo(String value) {
            addCriterion("platform_account_id =", value, "platformAccountId");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountIdNotEqualTo(String value) {
            addCriterion("platform_account_id <>", value, "platformAccountId");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountIdGreaterThan(String value) {
            addCriterion("platform_account_id >", value, "platformAccountId");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountIdGreaterThanOrEqualTo(String value) {
            addCriterion("platform_account_id >=", value, "platformAccountId");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountIdLessThan(String value) {
            addCriterion("platform_account_id <", value, "platformAccountId");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountIdLessThanOrEqualTo(String value) {
            addCriterion("platform_account_id <=", value, "platformAccountId");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountIdLike(String value) {
            addCriterion("platform_account_id like", value, "platformAccountId");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountIdNotLike(String value) {
            addCriterion("platform_account_id not like", value, "platformAccountId");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountIdIn(List<String> values) {
            addCriterion("platform_account_id in", values, "platformAccountId");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountIdNotIn(List<String> values) {
            addCriterion("platform_account_id not in", values, "platformAccountId");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountIdBetween(String value1, String value2) {
            addCriterion("platform_account_id between", value1, value2, "platformAccountId");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountIdNotBetween(String value1, String value2) {
            addCriterion("platform_account_id not between", value1, value2, "platformAccountId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("create_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("create_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(Long value) {
            addCriterion("create_user_id =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(Long value) {
            addCriterion("create_user_id <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(Long value) {
            addCriterion("create_user_id >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("create_user_id >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(Long value) {
            addCriterion("create_user_id <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(Long value) {
            addCriterion("create_user_id <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<Long> values) {
            addCriterion("create_user_id in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<Long> values) {
            addCriterion("create_user_id not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(Long value1, Long value2) {
            addCriterion("create_user_id between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(Long value1, Long value2) {
            addCriterion("create_user_id not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNull() {
            addCriterion("update_user_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNotNull() {
            addCriterion("update_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdEqualTo(Long value) {
            addCriterion("update_user_id =", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotEqualTo(Long value) {
            addCriterion("update_user_id <>", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThan(Long value) {
            addCriterion("update_user_id >", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("update_user_id >=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThan(Long value) {
            addCriterion("update_user_id <", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThanOrEqualTo(Long value) {
            addCriterion("update_user_id <=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIn(List<Long> values) {
            addCriterion("update_user_id in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotIn(List<Long> values) {
            addCriterion("update_user_id not in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdBetween(Long value1, Long value2) {
            addCriterion("update_user_id between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotBetween(Long value1, Long value2) {
            addCriterion("update_user_id not between", value1, value2, "updateUserId");
            return (Criteria) this;
        }
    }

    /**
     * am_appkey
     */
    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    /**
     * am_appkey 2018-04-19
     */
    public static class Criterion implements Serializable {
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