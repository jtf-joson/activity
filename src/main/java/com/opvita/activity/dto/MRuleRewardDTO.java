package com.opvita.activity.dto;

import java.util.Date;

public class MRuleRewardDTO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_RULE_REWARD.ID
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_RULE_REWARD.RULE_ID
     *
     * @mbggenerated
     */
    private String ruleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_RULE_REWARD.REWARD_VALUE
     *
     * @mbggenerated
     */
    private Long rewardValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_RULE_REWARD.REWARD_PRODUCT
     *
     * @mbggenerated
     */
    private String rewardProduct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_RULE_REWARD.REWARD_TYPE
     *
     * @mbggenerated
     */
    private String rewardType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_RULE_REWARD.CREATE_USER
     *
     * @mbggenerated
     */
    private String createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_RULE_REWARD.CREATE_TIMESTAMP
     *
     * @mbggenerated
     */
    private Date createTimestamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_RULE_REWARD.UPDATE_USER
     *
     * @mbggenerated
     */
    private String updateUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_RULE_REWARD.UPDATE_TIMESTAMP
     *
     * @mbggenerated
     */
    private Date updateTimestamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_RULE_REWARD.MAX_REWARDS
     *
     * @mbggenerated
     */
    private Long maxRewards;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_RULE_REWARD.CURRENT_REWARDS
     *
     * @mbggenerated
     */
    private Long currentRewards;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_RULE_REWARD.REWARDS_PER_PERSON
     *
     * @mbggenerated
     */
    private Short rewardsPerPerson;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_RULE_REWARD.ID
     *
     * @return the value of M_RULE_REWARD.ID
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_RULE_REWARD.ID
     *
     * @param id the value for M_RULE_REWARD.ID
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_RULE_REWARD.RULE_ID
     *
     * @return the value of M_RULE_REWARD.RULE_ID
     *
     * @mbggenerated
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_RULE_REWARD.RULE_ID
     *
     * @param ruleId the value for M_RULE_REWARD.RULE_ID
     *
     * @mbggenerated
     */
    public void setRuleId(String ruleId) {
        this.ruleId = ruleId == null ? null : ruleId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_RULE_REWARD.REWARD_VALUE
     *
     * @return the value of M_RULE_REWARD.REWARD_VALUE
     *
     * @mbggenerated
     */
    public Long getRewardValue() {
        return rewardValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_RULE_REWARD.REWARD_VALUE
     *
     * @param rewardValue the value for M_RULE_REWARD.REWARD_VALUE
     *
     * @mbggenerated
     */
    public void setRewardValue(Long rewardValue) {
        this.rewardValue = rewardValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_RULE_REWARD.REWARD_PRODUCT
     *
     * @return the value of M_RULE_REWARD.REWARD_PRODUCT
     *
     * @mbggenerated
     */
    public String getRewardProduct() {
        return rewardProduct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_RULE_REWARD.REWARD_PRODUCT
     *
     * @param rewardProduct the value for M_RULE_REWARD.REWARD_PRODUCT
     *
     * @mbggenerated
     */
    public void setRewardProduct(String rewardProduct) {
        this.rewardProduct = rewardProduct == null ? null : rewardProduct.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_RULE_REWARD.REWARD_TYPE
     *
     * @return the value of M_RULE_REWARD.REWARD_TYPE
     *
     * @mbggenerated
     */
    public String getRewardType() {
        return rewardType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_RULE_REWARD.REWARD_TYPE
     *
     * @param rewardType the value for M_RULE_REWARD.REWARD_TYPE
     *
     * @mbggenerated
     */
    public void setRewardType(String rewardType) {
        this.rewardType = rewardType == null ? null : rewardType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_RULE_REWARD.CREATE_USER
     *
     * @return the value of M_RULE_REWARD.CREATE_USER
     *
     * @mbggenerated
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_RULE_REWARD.CREATE_USER
     *
     * @param createUser the value for M_RULE_REWARD.CREATE_USER
     *
     * @mbggenerated
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_RULE_REWARD.CREATE_TIMESTAMP
     *
     * @return the value of M_RULE_REWARD.CREATE_TIMESTAMP
     *
     * @mbggenerated
     */
    public Date getCreateTimestamp() {
        return createTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_RULE_REWARD.CREATE_TIMESTAMP
     *
     * @param createTimestamp the value for M_RULE_REWARD.CREATE_TIMESTAMP
     *
     * @mbggenerated
     */
    public void setCreateTimestamp(Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_RULE_REWARD.UPDATE_USER
     *
     * @return the value of M_RULE_REWARD.UPDATE_USER
     *
     * @mbggenerated
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_RULE_REWARD.UPDATE_USER
     *
     * @param updateUser the value for M_RULE_REWARD.UPDATE_USER
     *
     * @mbggenerated
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_RULE_REWARD.UPDATE_TIMESTAMP
     *
     * @return the value of M_RULE_REWARD.UPDATE_TIMESTAMP
     *
     * @mbggenerated
     */
    public Date getUpdateTimestamp() {
        return updateTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_RULE_REWARD.UPDATE_TIMESTAMP
     *
     * @param updateTimestamp the value for M_RULE_REWARD.UPDATE_TIMESTAMP
     *
     * @mbggenerated
     */
    public void setUpdateTimestamp(Date updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_RULE_REWARD.MAX_REWARDS
     *
     * @return the value of M_RULE_REWARD.MAX_REWARDS
     *
     * @mbggenerated
     */
    public Long getMaxRewards() {
        return maxRewards;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_RULE_REWARD.MAX_REWARDS
     *
     * @param maxRewards the value for M_RULE_REWARD.MAX_REWARDS
     *
     * @mbggenerated
     */
    public void setMaxRewards(Long maxRewards) {
        this.maxRewards = maxRewards;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_RULE_REWARD.CURRENT_REWARDS
     *
     * @return the value of M_RULE_REWARD.CURRENT_REWARDS
     *
     * @mbggenerated
     */
    public Long getCurrentRewards() {
        return currentRewards;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_RULE_REWARD.CURRENT_REWARDS
     *
     * @param currentRewards the value for M_RULE_REWARD.CURRENT_REWARDS
     *
     * @mbggenerated
     */
    public void setCurrentRewards(Long currentRewards) {
        this.currentRewards = currentRewards;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_RULE_REWARD.REWARDS_PER_PERSON
     *
     * @return the value of M_RULE_REWARD.REWARDS_PER_PERSON
     *
     * @mbggenerated
     */
    public Short getRewardsPerPerson() {
        return rewardsPerPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_RULE_REWARD.REWARDS_PER_PERSON
     *
     * @param rewardsPerPerson the value for M_RULE_REWARD.REWARDS_PER_PERSON
     *
     * @mbggenerated
     */
    public void setRewardsPerPerson(Short rewardsPerPerson) {
        this.rewardsPerPerson = rewardsPerPerson;
    }
}