
package com.data_model;

import java.io.Serializable;

/**
 *
 * @author Abdul Jabbar
 */
public class ChallanBean  implements Serializable ,Comparable<ChallanBean> {
    private int challanNo;
    private String name;
    private String f_name;
    private String s_Id;
    private long cnic;
    private long phoneNo;
    private String email;
    private String category;
    private String dept;
    private int batch;
    private String date;
    private int fee;
    private String bank_Name;
    private long bank_Acc;
    private String depositer_Name;
    private long depositer_CNIC;
    private String s_sign;
    public ChallanBean getOb(){
        return new ChallanBean();
    }
    public ChallanBean() {}
    public void setChallanNo(int challanNo){
        this.challanNo=challanNo;
    }
    public void setName(String name){
	this.name=name;
    }
    public void setF_Name(String f_name){
        this.f_name=f_name;
    }
    public void setS_Id(String s_Id){
	this.s_Id=s_Id;
    }
    public void setCnic(long cnic){
	this.cnic=cnic;
    }
    public void setS_Sign(String s_sign){
	this.s_sign=s_sign;
    }
    public void setPhoneNo(long phoneNo){
	this.phoneNo=phoneNo;
    }
    public void setEmail(String email){
	this.email=email;
    }
    public void setCategory(String category){
	this.category=category;
    }
    public void setDept(String dept){
	this.dept=dept;
    }
    public void setBatch(int batch){
	this.batch=batch;
    }
    public void setDate(String date){
	this.date=date;
    }
    public void setFee(int fee){
	this.fee=fee;
    }
    public void setBankName(String bank_Name){
        this.bank_Name=bank_Name;
    }
    public void setBankAcc(long bank_Acc){
	this.bank_Acc=bank_Acc;
    }
    public void setDepositName(String depositer_Name){
	this.depositer_Name=depositer_Name;
    }
    public void setDepositCNIC(long depositer_CNIC){
	this.depositer_CNIC=depositer_CNIC;
    }
    public String getName() {
    	return name;
    }
    public String getFname() {
	return f_name;
    }
    public long getCnic() {
    	return cnic;
    }
    public String getId() {
	return s_Id;
    }
    public long getPhone() {
        return phoneNo;
    }
    public String getEmail() {
        return email;
    }
    public String getCategory() {
    	return category;
    }
    public String getDept() {   
        return dept;
    }
    public int getBatch() {
    	return batch;
    }
    public String getDate() {
    	return date;
    }
    public int getFees() {
    	return fee;
    }
    public String getBankName() {
    	return bank_Name;
    }
    public long getBankAccount() {
    	return bank_Acc;
    }
    public String getDepositerName() {
    	return depositer_Name;
    }
    public long getDepositerCNIC() {
        return depositer_CNIC;
    }
    public String getStudentSign() {
    	return s_sign;
    }
    public int getChanllanNo() {
    	return challanNo;
    }

    @Override
    public int compareTo(ChallanBean o) {
        if(challanNo==o.getChanllanNo())    
            return 0;    
        else if(challanNo>o.getChanllanNo())
            return 1;    
        else    
            return -1;
    }
}