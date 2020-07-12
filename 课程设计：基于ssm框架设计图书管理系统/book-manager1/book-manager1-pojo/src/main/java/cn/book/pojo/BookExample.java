package cn.book.pojo;

import java.util.ArrayList;
import java.util.List;

public class BookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookExample() {
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

        public Criteria andBidIsNull() {
            addCriterion("bid is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("bid is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(Integer value) {
            addCriterion("bid =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(Integer value) {
            addCriterion("bid <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(Integer value) {
            addCriterion("bid >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bid >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(Integer value) {
            addCriterion("bid <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(Integer value) {
            addCriterion("bid <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<Integer> values) {
            addCriterion("bid in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<Integer> values) {
            addCriterion("bid not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(Integer value1, Integer value2) {
            addCriterion("bid between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(Integer value1, Integer value2) {
            addCriterion("bid not between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBnameIsNull() {
            addCriterion("bname is null");
            return (Criteria) this;
        }

        public Criteria andBnameIsNotNull() {
            addCriterion("bname is not null");
            return (Criteria) this;
        }

        public Criteria andBnameEqualTo(String value) {
            addCriterion("bname =", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotEqualTo(String value) {
            addCriterion("bname <>", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameGreaterThan(String value) {
            addCriterion("bname >", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameGreaterThanOrEqualTo(String value) {
            addCriterion("bname >=", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLessThan(String value) {
            addCriterion("bname <", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLessThanOrEqualTo(String value) {
            addCriterion("bname <=", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLike(String value) {
            addCriterion("bname like", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotLike(String value) {
            addCriterion("bname not like", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameIn(List<String> values) {
            addCriterion("bname in", values, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotIn(List<String> values) {
            addCriterion("bname not in", values, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameBetween(String value1, String value2) {
            addCriterion("bname between", value1, value2, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotBetween(String value1, String value2) {
            addCriterion("bname not between", value1, value2, "bname");
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

        public Criteria andBimgIsNull() {
            addCriterion("bimg is null");
            return (Criteria) this;
        }

        public Criteria andBimgIsNotNull() {
            addCriterion("bimg is not null");
            return (Criteria) this;
        }

        public Criteria andBimgEqualTo(String value) {
            addCriterion("bimg =", value, "bimg");
            return (Criteria) this;
        }

        public Criteria andBimgNotEqualTo(String value) {
            addCriterion("bimg <>", value, "bimg");
            return (Criteria) this;
        }

        public Criteria andBimgGreaterThan(String value) {
            addCriterion("bimg >", value, "bimg");
            return (Criteria) this;
        }

        public Criteria andBimgGreaterThanOrEqualTo(String value) {
            addCriterion("bimg >=", value, "bimg");
            return (Criteria) this;
        }

        public Criteria andBimgLessThan(String value) {
            addCriterion("bimg <", value, "bimg");
            return (Criteria) this;
        }

        public Criteria andBimgLessThanOrEqualTo(String value) {
            addCriterion("bimg <=", value, "bimg");
            return (Criteria) this;
        }

        public Criteria andBimgLike(String value) {
            addCriterion("bimg like", value, "bimg");
            return (Criteria) this;
        }

        public Criteria andBimgNotLike(String value) {
            addCriterion("bimg not like", value, "bimg");
            return (Criteria) this;
        }

        public Criteria andBimgIn(List<String> values) {
            addCriterion("bimg in", values, "bimg");
            return (Criteria) this;
        }

        public Criteria andBimgNotIn(List<String> values) {
            addCriterion("bimg not in", values, "bimg");
            return (Criteria) this;
        }

        public Criteria andBimgBetween(String value1, String value2) {
            addCriterion("bimg between", value1, value2, "bimg");
            return (Criteria) this;
        }

        public Criteria andBimgNotBetween(String value1, String value2) {
            addCriterion("bimg not between", value1, value2, "bimg");
            return (Criteria) this;
        }

        public Criteria andWriterIsNull() {
            addCriterion("writer is null");
            return (Criteria) this;
        }

        public Criteria andWriterIsNotNull() {
            addCriterion("writer is not null");
            return (Criteria) this;
        }

        public Criteria andWriterEqualTo(String value) {
            addCriterion("writer =", value, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterNotEqualTo(String value) {
            addCriterion("writer <>", value, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterGreaterThan(String value) {
            addCriterion("writer >", value, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterGreaterThanOrEqualTo(String value) {
            addCriterion("writer >=", value, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterLessThan(String value) {
            addCriterion("writer <", value, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterLessThanOrEqualTo(String value) {
            addCriterion("writer <=", value, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterLike(String value) {
            addCriterion("writer like", value, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterNotLike(String value) {
            addCriterion("writer not like", value, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterIn(List<String> values) {
            addCriterion("writer in", values, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterNotIn(List<String> values) {
            addCriterion("writer not in", values, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterBetween(String value1, String value2) {
            addCriterion("writer between", value1, value2, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterNotBetween(String value1, String value2) {
            addCriterion("writer not between", value1, value2, "writer");
            return (Criteria) this;
        }

        public Criteria andPublishingIsNull() {
            addCriterion("publishing is null");
            return (Criteria) this;
        }

        public Criteria andPublishingIsNotNull() {
            addCriterion("publishing is not null");
            return (Criteria) this;
        }

        public Criteria andPublishingEqualTo(String value) {
            addCriterion("publishing =", value, "publishing");
            return (Criteria) this;
        }

        public Criteria andPublishingNotEqualTo(String value) {
            addCriterion("publishing <>", value, "publishing");
            return (Criteria) this;
        }

        public Criteria andPublishingGreaterThan(String value) {
            addCriterion("publishing >", value, "publishing");
            return (Criteria) this;
        }

        public Criteria andPublishingGreaterThanOrEqualTo(String value) {
            addCriterion("publishing >=", value, "publishing");
            return (Criteria) this;
        }

        public Criteria andPublishingLessThan(String value) {
            addCriterion("publishing <", value, "publishing");
            return (Criteria) this;
        }

        public Criteria andPublishingLessThanOrEqualTo(String value) {
            addCriterion("publishing <=", value, "publishing");
            return (Criteria) this;
        }

        public Criteria andPublishingLike(String value) {
            addCriterion("publishing like", value, "publishing");
            return (Criteria) this;
        }

        public Criteria andPublishingNotLike(String value) {
            addCriterion("publishing not like", value, "publishing");
            return (Criteria) this;
        }

        public Criteria andPublishingIn(List<String> values) {
            addCriterion("publishing in", values, "publishing");
            return (Criteria) this;
        }

        public Criteria andPublishingNotIn(List<String> values) {
            addCriterion("publishing not in", values, "publishing");
            return (Criteria) this;
        }

        public Criteria andPublishingBetween(String value1, String value2) {
            addCriterion("publishing between", value1, value2, "publishing");
            return (Criteria) this;
        }

        public Criteria andPublishingNotBetween(String value1, String value2) {
            addCriterion("publishing not between", value1, value2, "publishing");
            return (Criteria) this;
        }

        public Criteria andCurrentnumberIsNull() {
            addCriterion("currentnumber is null");
            return (Criteria) this;
        }

        public Criteria andCurrentnumberIsNotNull() {
            addCriterion("currentnumber is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentnumberEqualTo(Integer value) {
            addCriterion("currentnumber =", value, "currentnumber");
            return (Criteria) this;
        }

        public Criteria andCurrentnumberNotEqualTo(Integer value) {
            addCriterion("currentnumber <>", value, "currentnumber");
            return (Criteria) this;
        }

        public Criteria andCurrentnumberGreaterThan(Integer value) {
            addCriterion("currentnumber >", value, "currentnumber");
            return (Criteria) this;
        }

        public Criteria andCurrentnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("currentnumber >=", value, "currentnumber");
            return (Criteria) this;
        }

        public Criteria andCurrentnumberLessThan(Integer value) {
            addCriterion("currentnumber <", value, "currentnumber");
            return (Criteria) this;
        }

        public Criteria andCurrentnumberLessThanOrEqualTo(Integer value) {
            addCriterion("currentnumber <=", value, "currentnumber");
            return (Criteria) this;
        }

        public Criteria andCurrentnumberIn(List<Integer> values) {
            addCriterion("currentnumber in", values, "currentnumber");
            return (Criteria) this;
        }

        public Criteria andCurrentnumberNotIn(List<Integer> values) {
            addCriterion("currentnumber not in", values, "currentnumber");
            return (Criteria) this;
        }

        public Criteria andCurrentnumberBetween(Integer value1, Integer value2) {
            addCriterion("currentnumber between", value1, value2, "currentnumber");
            return (Criteria) this;
        }

        public Criteria andCurrentnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("currentnumber not between", value1, value2, "currentnumber");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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