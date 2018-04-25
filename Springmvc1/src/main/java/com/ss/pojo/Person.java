package com.ss.pojo;

public class Person {

	private Integer id;
	private String NAME;
	private String gender;
	private Integer age;
	private String graduation;
	private String senior;
	private Long createTime;
	private Long updateTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String NAME) {
		this.NAME = NAME;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGraduation() {
		return graduation;
	}

	public void setGraduation(String graduation) {
		this.graduation = graduation;
	}

	public String getSenior() {
		return senior;
	}

	public void setSenior(String senior) {
		this.senior = senior;
	}

	public Long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public Long getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}

	@Override
    public String toString() {
        return "(" + id + "," + NAME +","+gender+ "," + age + "," +  graduation+ "," +senior+ ")\n";
        
    }
	
	
}
