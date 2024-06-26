package com.tencent.qcloud.tuikit.tuisearch.bean;

import com.tencent.imsdk.group.GroupMemberInfo;
import com.tencent.imsdk.v2.V2TIMConversation;
import com.tencent.imsdk.v2.V2TIMGroupInfoResult;
import com.tencent.imsdk.v2.V2TIMManager;
import com.tencent.imsdk.v2.V2TIMMessage;

import java.util.ArrayList;
import java.util.List;

public class GroupInfo extends ChatInfo {
    private String groupType;
    private int memberCount;
    private String groupName;
    private String notice;
    private List<GroupMemberInfo> memberDetails = new ArrayList<>();
    private int joinType;
    private String owner;
    private boolean messageReceiveOption;
    private String faceUrl;

    public GroupInfo() {
        setType(V2TIMConversation.V2TIM_GROUP);
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * Get group announcements
     *
     * @return
     */
    public String getNotice() {
        return notice;
    }

    /**
     * Set group announcements
     *
     * @param signature
     */
    public void setNotice(String signature) {
        this.notice = signature;
    }

    /**
     * Get the group verification method
     *
     * @return
     */
    public int getJoinType() {
        return joinType;
    }

    /**
     * Set the group verification method
     *
     * @param joinType
     */
    public void setJoinType(int joinType) {
        this.joinType = joinType;
    }

    /**
     * Get the group type, Public/Private/ChatRoom
     *
     * @return
     */
    public String getGroupType() {
        return groupType;
    }

    /**
     * Set the group type
     *
     * @param groupType
     */
    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    /**
     * Get member details
     *
     * @return
     */
    public List<GroupMemberInfo> getMemberDetails() {
        return memberDetails;
    }

    /**
     * Set member details
     *
     * @param memberDetails
     */
    public void setMemberDetails(List<GroupMemberInfo> memberDetails) {
        this.memberDetails = memberDetails;
    }

    /**
     * Get the number of members that have joined the group
     *
     * @return
     */
    public int getMemberCount() {
        if (memberDetails != null) {
            return memberDetails.size();
        }
        return memberCount;
    }

    /**
     * Set the number of members that have joined the group
     *
     * @param memberCount
     */
    public void setMemberCount(int memberCount) {
        this.memberCount = memberCount;
    }

    /**
     * Returns whether it is the owner of the group
     *
     * @return
     */
    public boolean isOwner() {
        return V2TIMManager.getInstance().getLoginUser().equals(owner);
    }

    /**
     * Set whether it is the owner of the group
     *
     * @param owner
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * Get the current user's message receiving option in the group. To modify the group message receiving option, please call the setReceiveMessageOpt API.
     *
     * @return
     */
    public boolean getMessageReceiveOption() {
        return messageReceiveOption;
    }

    /**
     * Set the current user's message receiving option in the group.
     * @param messageReceiveOption, true,no message will be received； false，messages will be received.
     */
    public void setMessageReceiveOption(boolean messageReceiveOption) {
        this.messageReceiveOption = messageReceiveOption;
    }

    public String getFaceUrl() {
        return faceUrl;
    }

    public void setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;
    }
}
