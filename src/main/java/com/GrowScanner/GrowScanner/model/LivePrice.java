package com.GrowScanner.GrowScanner.model;

public class LivePrice {

    private String type;
    private String symbol;
    private long tsInMillis;
    private double open;
    private double high;
    private double low;
    private double close;
    private double ltp;
    private double dayChange;
    private double dayChangePerc;
    private double lowPriceRange;
    private double highPriceRange;
    private int volume;
    private double totalBuyQty;
    private double totalSellQty;
    private double oiDayChange;
    private double oiDayChangePerc;
    private int lastTradeQty;
    private long lastTradeTime;
	public LivePrice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LivePrice(String type, String symbol, long tsInMillis, double open, double high, double low, double close,
			double ltp, double dayChange, double dayChangePerc, double lowPriceRange, double highPriceRange, int volume,
			double totalBuyQty, double totalSellQty, double oiDayChange, double oiDayChangePerc, int lastTradeQty,
			long lastTradeTime) {
		super();
		this.type = type;
		this.symbol = symbol;
		this.tsInMillis = tsInMillis;
		this.open = open;
		this.high = high;
		this.low = low;
		this.close = close;
		this.ltp = ltp;
		this.dayChange = dayChange;
		this.dayChangePerc = dayChangePerc;
		this.lowPriceRange = lowPriceRange;
		this.highPriceRange = highPriceRange;
		this.volume = volume;
		this.totalBuyQty = totalBuyQty;
		this.totalSellQty = totalSellQty;
		this.oiDayChange = oiDayChange;
		this.oiDayChangePerc = oiDayChangePerc;
		this.lastTradeQty = lastTradeQty;
		this.lastTradeTime = lastTradeTime;
	}
	@Override
	public String toString() {
		return "LivePrice [type=" + type + ", symbol=" + symbol + ", tsInMillis=" + tsInMillis + ", open=" + open
				+ ", high=" + high + ", low=" + low + ", close=" + close + ", ltp=" + ltp + ", dayChange=" + dayChange
				+ ", dayChangePerc=" + dayChangePerc + ", lowPriceRange=" + lowPriceRange + ", highPriceRange="
				+ highPriceRange + ", volume=" + volume + ", totalBuyQty=" + totalBuyQty + ", totalSellQty="
				+ totalSellQty + ", oiDayChange=" + oiDayChange + ", oiDayChangePerc=" + oiDayChangePerc
				+ ", lastTradeQty=" + lastTradeQty + ", lastTradeTime=" + lastTradeTime + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public long getTsInMillis() {
		return tsInMillis;
	}
	public void setTsInMillis(long tsInMillis) {
		this.tsInMillis = tsInMillis;
	}
	public double getOpen() {
		return open;
	}
	public void setOpen(double open) {
		this.open = open;
	}
	public double getHigh() {
		return high;
	}
	public void setHigh(double high) {
		this.high = high;
	}
	public double getLow() {
		return low;
	}
	public void setLow(double low) {
		this.low = low;
	}
	public double getClose() {
		return close;
	}
	public void setClose(double close) {
		this.close = close;
	}
	public double getLtp() {
		return ltp;
	}
	public void setLtp(double ltp) {
		this.ltp = ltp;
	}
	public double getDayChange() {
		return dayChange;
	}
	public void setDayChange(double dayChange) {
		this.dayChange = dayChange;
	}
	public double getDayChangePerc() {
		return dayChangePerc;
	}
	public void setDayChangePerc(double dayChangePerc) {
		this.dayChangePerc = dayChangePerc;
	}
	public double getLowPriceRange() {
		return lowPriceRange;
	}
	public void setLowPriceRange(double lowPriceRange) {
		this.lowPriceRange = lowPriceRange;
	}
	public double getHighPriceRange() {
		return highPriceRange;
	}
	public void setHighPriceRange(double highPriceRange) {
		this.highPriceRange = highPriceRange;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public double getTotalBuyQty() {
		return totalBuyQty;
	}
	public void setTotalBuyQty(double totalBuyQty) {
		this.totalBuyQty = totalBuyQty;
	}
	public double getTotalSellQty() {
		return totalSellQty;
	}
	public void setTotalSellQty(double totalSellQty) {
		this.totalSellQty = totalSellQty;
	}
	public double getOiDayChange() {
		return oiDayChange;
	}
	public void setOiDayChange(double oiDayChange) {
		this.oiDayChange = oiDayChange;
	}
	public double getOiDayChangePerc() {
		return oiDayChangePerc;
	}
	public void setOiDayChangePerc(double oiDayChangePerc) {
		this.oiDayChangePerc = oiDayChangePerc;
	}
	public int getLastTradeQty() {
		return lastTradeQty;
	}
	public void setLastTradeQty(int lastTradeQty) {
		this.lastTradeQty = lastTradeQty;
	}
	public long getLastTradeTime() {
		return lastTradeTime;
	}
	public void setLastTradeTime(long lastTradeTime) {
		this.lastTradeTime = lastTradeTime;
	}

    // Constructors, getters, and setters
    
    
}

