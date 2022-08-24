package com.assesment.tabledata.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private int AccountId;

    private int empId;
    @Column(length = 20)
    private String xid;
    @Column(length = 20)
    private String name;

    private int intranetId;
    @Column(length = 20)
    private String team;
    @Column(length = 20)
    private String teamDetails;
    @Column(length = 20)
    private String scrumTeam;
    @Column(length = 20)
    private String ibmLeadName;
    @Column(length = 20)
    private String pm;
    @Column(length = 20)
    private String location;
    @Column(length = 20)
    private String site;
    @Column(length = 20)
    private String status;
    @Column(length = 20)
    private String billCode;
    @Column(length = 20)
    private String billable;
    @Column(length = 20)
    private String typeOfEmp;
    @Column(length = 20)
    private String band;
    @Column(length = 20)
    private String pirLocation;
    @Column(length = 20)
    private String pirCampus;
    @Column(length = 20)
    private String jrss;
    @Column(length = 20)
    private String pruManager;
    @Column(length = 20)
    private String indiaPem;
    @Column(length = 20)
    private String contractRole;
    @Column(length = 20)
    private String uidRole;
    @Column(length = 20)
    private String ghStartDate;
    @Column(length = 20)
    private String startDate;
    @Column(length = 20)
    private String pirStart;
    @Column(length = 20)
    private String billingStartDate;
    @Column(length = 20)
    private String billingEndDate;
    @Column(length = 20)
    private String endDate;
    @Column(length = 20)
    private String rampDown;
    @Column(length = 20)
    private String backFill;
    @Column(length = 20)
    private String nameOfBackfill;
    @Column(length = 20)
    private String remarks;
    @Column(length = 20)
    private String landedDate;
    @Column(length = 20)
    private String offshore;

    private boolean rsaTokenFlag;
    @Column(length = 20)

    private String rsaToken;
    @Column(length = 20)
    private String expirationDate;
    @Column(length = 20)
    private String hardTokenReceivedDate;
    @Column(length = 20)
    private String mobile;
    @Column(length = 20)
    private String emergency1;
    @Column(length = 20)
    private String emergency2;
    @Column(length = 20)
    private String rits;
    @Column(length = 20)
    private String skills;
    @Column(length = 20)
    private String empLnId;
    @Column(length = 20)
    private String prudentialEmailId;
    @Column(length = 20)
    private String totalITExpStartDate;
    @Column(length = 20)
    private String today;
    @Column(length = 20)
    private String itExpInMonths;
    @Column(length = 20)
    private String itExpInYears;
    @Column(length = 20)
    private String vmYears;
    @Column(length = 20)
    private String vmTenure1;
    @Column(length = 20)
    private String vmTenure;
    @Column(length = 20)
    private String itExpTenure;
    @Column(length = 20)
    private String yrsProjectStartDate;
    @Column(length = 20)
    private String overAllProjectStructure;
    @Column(length = 20)
    private String yrsInProject;
    @Column(length = 20)
    private String monthsProjectStartDate;
    @Column(length = 20)
    private String ritsTenureM;
    @Column(length = 20)
    private String ritsTenure;
    @Column(length = 20)
    private String scd;
    @Column(length = 20)
    private String ibmStartDate;
    @Column(length = 20)
    private String ibmYrs;
    @Column(length = 20)
    private String ibmTenureInYears;
    @Column(length = 20)
    private String ibmTenure;
    @Column(length = 20)
    private String bgcStatus;
    @Column(length = 20)
    private String bgcSubmissionDate;
    @Column(length = 20)
    private String getBgcSubmissionDate;
    @Column(length = 20)
    private String bgcCompletionDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAccountId() {
        return AccountId;
    }

    public void setAccountId(int accountId) {
        AccountId = accountId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getXid() {
        return xid;
    }

    public void setXid(String xid) {
        this.xid = xid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIntranetId() {
        return intranetId;
    }

    public void setIntranetId(int intranetId) {
        this.intranetId = intranetId;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getTeamDetails() {
        return teamDetails;
    }

    public void setTeamDetails(String teamDetails) {
        this.teamDetails = teamDetails;
    }

    public String getScrumTeam() {
        return scrumTeam;
    }

    public void setScrumTeam(String scrumTeam) {
        this.scrumTeam = scrumTeam;
    }

    public String getIbmLeadName() {
        return ibmLeadName;
    }

    public void setIbmLeadName(String ibmLeadName) {
        this.ibmLeadName = ibmLeadName;
    }

    public String getPm() {
        return pm;
    }

    public void setPm(String pm) {
        this.pm = pm;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public String getBillable() {
        return billable;
    }

    public void setBillable(String billable) {
        this.billable = billable;
    }

    public String getTypeOfEmp() {
        return typeOfEmp;
    }

    public void setTypeOfEmp(String typeOfEmp) {
        this.typeOfEmp = typeOfEmp;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getPirLocation() {
        return pirLocation;
    }

    public void setPirLocation(String pirLocation) {
        this.pirLocation = pirLocation;
    }

    public String getPirCampus() {
        return pirCampus;
    }

    public void setPirCampus(String pirCampus) {
        this.pirCampus = pirCampus;
    }

    public String getJrss() {
        return jrss;
    }

    public void setJrss(String jrss) {
        this.jrss = jrss;
    }

    public String getPruManager() {
        return pruManager;
    }

    public void setPruManager(String pruManager) {
        this.pruManager = pruManager;
    }

    public String getIndiaPem() {
        return indiaPem;
    }

    public void setIndiaPem(String indiaPem) {
        this.indiaPem = indiaPem;
    }

    public String getContractRole() {
        return contractRole;
    }

    public void setContractRole(String contractRole) {
        this.contractRole = contractRole;
    }

    public String getUidRole() {
        return uidRole;
    }

    public void setUidRole(String uidRole) {
        this.uidRole = uidRole;
    }

    public String getGhStartDate() {
        return ghStartDate;
    }

    public void setGhStartDate(String ghStartDate) {
        this.ghStartDate = ghStartDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getPirStart() {
        return pirStart;
    }

    public void setPirStart(String pirStart) {
        this.pirStart = pirStart;
    }

    public String getBillingStartDate() {
        return billingStartDate;
    }

    public void setBillingStartDate(String billingStartDate) {
        this.billingStartDate = billingStartDate;
    }

    public String getBillingEndDate() {
        return billingEndDate;
    }

    public void setBillingEndDate(String billingEndDate) {
        this.billingEndDate = billingEndDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getRampDown() {
        return rampDown;
    }

    public void setRampDown(String rampDown) {
        this.rampDown = rampDown;
    }

    public String getBackFill() {
        return backFill;
    }

    public void setBackFill(String backFill) {
        this.backFill = backFill;
    }

    public String getNameOfBackfill() {
        return nameOfBackfill;
    }

    public void setNameOfBackfill(String nameOfBackfill) {
        this.nameOfBackfill = nameOfBackfill;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getLandedDate() {
        return landedDate;
    }

    public void setLandedDate(String landedDate) {
        this.landedDate = landedDate;
    }

    public String getOffshore() {
        return offshore;
    }

    public void setOffshore(String offshore) {
        this.offshore = offshore;
    }

    public boolean isRsaTokenFlag() {
        return rsaTokenFlag;
    }

    public void setRsaTokenFlag(boolean rsaTokenFlag) {
        this.rsaTokenFlag = rsaTokenFlag;
    }

    public String getRsaToken() {
        return rsaToken;
    }

    public void setRsaToken(String rsaToken) {
        this.rsaToken = rsaToken;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getHardTokenReceivedDate() {
        return hardTokenReceivedDate;
    }

    public void setHardTokenReceivedDate(String hardTokenReceivedDate) {
        this.hardTokenReceivedDate = hardTokenReceivedDate;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmergency1() {
        return emergency1;
    }

    public void setEmergency1(String emergency1) {
        this.emergency1 = emergency1;
    }

    public String getEmergency2() {
        return emergency2;
    }

    public void setEmergency2(String emergency2) {
        this.emergency2 = emergency2;
    }

    public String getRits() {
        return rits;
    }

    public void setRits(String rits) {
        this.rits = rits;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getEmpLnId() {
        return empLnId;
    }

    public void setEmpLnId(String empLnId) {
        this.empLnId = empLnId;
    }

    public String getPrudentialEmailId() {
        return prudentialEmailId;
    }

    public void setPrudentialEmailId(String prudentialEmailId) {
        this.prudentialEmailId = prudentialEmailId;
    }

    public String getTotalITExpStartDate() {
        return totalITExpStartDate;
    }

    public void setTotalITExpStartDate(String totalITExpStartDate) {
        this.totalITExpStartDate = totalITExpStartDate;
    }

    public String getToday() {
        return today;
    }

    public void setToday(String today) {
        this.today = today;
    }

    public String getItExpInMonths() {
        return itExpInMonths;
    }

    public void setItExpInMonths(String itExpInMonths) {
        this.itExpInMonths = itExpInMonths;
    }

    public String getItExpInYears() {
        return itExpInYears;
    }

    public void setItExpInYears(String itExpInYears) {
        this.itExpInYears = itExpInYears;
    }

    public String getVmYears() {
        return vmYears;
    }

    public void setVmYears(String vmYears) {
        this.vmYears = vmYears;
    }

    public String getVmTenure1() {
        return vmTenure1;
    }

    public void setVmTenure1(String vmTenure1) {
        this.vmTenure1 = vmTenure1;
    }

    public String getVmTenure() {
        return vmTenure;
    }

    public void setVmTenure(String vmTenure) {
        this.vmTenure = vmTenure;
    }

    public String getItExpTenure() {
        return itExpTenure;
    }

    public void setItExpTenure(String itExpTenure) {
        this.itExpTenure = itExpTenure;
    }

    public String getYrsProjectStartDate() {
        return yrsProjectStartDate;
    }

    public void setYrsProjectStartDate(String yrsProjectStartDate) {
        this.yrsProjectStartDate = yrsProjectStartDate;
    }

    public String getOverAllProjectStructure() {
        return overAllProjectStructure;
    }

    public void setOverAllProjectStructure(String overAllProjectStructure) {
        this.overAllProjectStructure = overAllProjectStructure;
    }

    public String getYrsInProject() {
        return yrsInProject;
    }

    public void setYrsInProject(String yrsInProject) {
        this.yrsInProject = yrsInProject;
    }

    public String getMonthsProjectStartDate() {
        return monthsProjectStartDate;
    }

    public void setMonthsProjectStartDate(String monthsProjectStartDate) {
        this.monthsProjectStartDate = monthsProjectStartDate;
    }

    public String getRitsTenureM() {
        return ritsTenureM;
    }

    public void setRitsTenureM(String ritsTenureM) {
        this.ritsTenureM = ritsTenureM;
    }

    public String getRitsTenure() {
        return ritsTenure;
    }

    public void setRitsTenure(String ritsTenure) {
        this.ritsTenure = ritsTenure;
    }

    public String getScd() {
        return scd;
    }

    public void setScd(String scd) {
        this.scd = scd;
    }

    public String getIbmStartDate() {
        return ibmStartDate;
    }

    public void setIbmStartDate(String ibmStartDate) {
        this.ibmStartDate = ibmStartDate;
    }

    public String getIbmYrs() {
        return ibmYrs;
    }

    public void setIbmYrs(String ibmYrs) {
        this.ibmYrs = ibmYrs;
    }

    public String getIbmTenureInYears() {
        return ibmTenureInYears;
    }

    public void setIbmTenureInYears(String ibmTenureInYears) {
        this.ibmTenureInYears = ibmTenureInYears;
    }

    public String getIbmTenure() {
        return ibmTenure;
    }

    public void setIbmTenure(String ibmTenure) {
        this.ibmTenure = ibmTenure;
    }

    public String getBgcStatus() {
        return bgcStatus;
    }

    public void setBgcStatus(String bgcStatus) {
        this.bgcStatus = bgcStatus;
    }

    public String getBgcSubmissionDate() {
        return bgcSubmissionDate;
    }

    public void setBgcSubmissionDate(String bgcSubmissionDate) {
        this.bgcSubmissionDate = bgcSubmissionDate;
    }

    public String getGetBgcSubmissionDate() {
        return getBgcSubmissionDate;
    }

    public void setGetBgcSubmissionDate(String getBgcSubmissionDate) {
        this.getBgcSubmissionDate = getBgcSubmissionDate;
    }

    public String getBgcCompletionDate() {
        return bgcCompletionDate;
    }

    public void setBgcCompletionDate(String bgcCompletionDate) {
        this.bgcCompletionDate = bgcCompletionDate;
    }
}
