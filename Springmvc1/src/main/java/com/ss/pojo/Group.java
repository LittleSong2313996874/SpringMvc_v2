package com.ss.pojo;

import java.util.List;

public class Group {

    Integer groupId;
    String groupName;
    List<Person> groupMember;

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<Person> getGroupMember() {
        return groupMember;
    }

    public void setGroupMember(List<Person> groupMember) {
        this.groupMember = groupMember;
    }
}
