package com.GrowScanner.GrowScanner.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "stocks")
public class Stock {
    
    @Id
    private String id;
    private String isin;
    private String growwContractId;
    private String companyName;
    private String companyShortName;
    private String searchId;
    private int industryCode;
    private int bseScriptCode;
    private String nseScriptCode;
    private double yearlyHighPrice;
    private double yearlyLowPrice;
    private double closePrice;
    private long marketCap;
    private LivePrice livePriceDto;
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Stock(String id, String isin, String growwContractId, String companyName, String companyShortName,
			String searchId, int industryCode, int bseScriptCode, String nseScriptCode, double yearlyHighPrice,
			double yearlyLowPrice, double closePrice, long marketCap, LivePrice livePriceDto) {
		super();
		this.id = id;
		this.isin = isin;
		this.growwContractId = growwContractId;
		this.companyName = companyName;
		this.companyShortName = companyShortName;
		this.searchId = searchId;
		this.industryCode = industryCode;
		this.bseScriptCode = bseScriptCode;
		this.nseScriptCode = nseScriptCode;
		this.yearlyHighPrice = yearlyHighPrice;
		this.yearlyLowPrice = yearlyLowPrice;
		this.closePrice = closePrice;
		this.marketCap = marketCap;
		this.livePriceDto = livePriceDto;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIsin() {
		return isin;
	}
	public void setIsin(String isin) {
		this.isin = isin;
	}
	public String getGrowwContractId() {
		return growwContractId;
	}
	public void setGrowwContractId(String growwContractId) {
		this.growwContractId = growwContractId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyShortName() {
		return companyShortName;
	}
	public void setCompanyShortName(String companyShortName) {
		this.companyShortName = companyShortName;
	}
	public String getSearchId() {
		return searchId;
	}
	public void setSearchId(String searchId) {
		this.searchId = searchId;
	}
	public int getIndustryCode() {
		return industryCode;
	}
	public void setIndustryCode(int industryCode) {
		this.industryCode = industryCode;
	}
	public int getBseScriptCode() {
		return bseScriptCode;
	}
	public void setBseScriptCode(int bseScriptCode) {
		this.bseScriptCode = bseScriptCode;
	}
	public String getNseScriptCode() {
		return nseScriptCode;
	}
	public void setNseScriptCode(String nseScriptCode) {
		this.nseScriptCode = nseScriptCode;
	}
	public double getYearlyHighPrice() {
		return yearlyHighPrice;
	}
	public void setYearlyHighPrice(double yearlyHighPrice) {
		this.yearlyHighPrice = yearlyHighPrice;
	}
	public double getYearlyLowPrice() {
		return yearlyLowPrice;
	}
	public void setYearlyLowPrice(double yearlyLowPrice) {
		this.yearlyLowPrice = yearlyLowPrice;
	}
	public double getClosePrice() {
		return closePrice;
	}
	public void setClosePrice(double closePrice) {
		this.closePrice = closePrice;
	}
	public long getMarketCap() {
		return marketCap;
	}
	public void setMarketCap(long marketCap) {
		this.marketCap = marketCap;
	}
	public LivePrice getLivePriceDto() {
		return livePriceDto;
	}
	public void setLivePriceDto(LivePrice livePriceDto) {
		this.livePriceDto = livePriceDto;
	}
	@Override
	public String toString() {
		return "Stock [id=" + id + ", isin=" + isin + ", growwContractId=" + growwContractId + ", companyName="
				+ companyName + ", companyShortName=" + companyShortName + ", searchId=" + searchId + ", industryCode="
				+ industryCode + ", bseScriptCode=" + bseScriptCode + ", nseScriptCode=" + nseScriptCode
				+ ", yearlyHighPrice=" + yearlyHighPrice + ", yearlyLowPrice=" + yearlyLowPrice + ", closePrice="
				+ closePrice + ", marketCap=" + marketCap + ", livePriceDto=" + livePriceDto + "]";
	}
	

    // Constructors, getters, and setters
}

