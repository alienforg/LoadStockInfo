package com.alienforg.models.impl.stockInfo;

import com.alienforg.models.stockinfo.StockInfo;
/**
 * Stock Information Implement Model Class
 * @author alien
 *
 */
public class StockInfoImpl extends StockInfo {
	/**
	 * Market Type  : SZ / SH
	 */
	private String MarketType;
	
	/**
	 * Stock date
	 */
	private String stockDate;
	/**
	 * 今日 开盘价
	 * 
	 */
	private String todayOpeningPrice;
	/**
	 * 今日 收盘价
	 */
	private String todayClosingPrice;
	/**
	 * 昨日 收盘价
	 */
	private String yesterdayClosingPrice;
	/**
	 * 当前价格
	 */
	private String currentPrice;
	/**
	 * 今日 最高价
	 */
	private String todayHighestPrice;
	/**
	 * 今日 最低价
	 */
	private String todayLowestPrice;
	/**
	 * 今日成交量
	 */
	private String todayTurnover;
	/**
	 * 涨跌额
	 */
	private String change;
	/**
	 *  涨跌幅度
	 */
	private String chg;
	/**
	 * 5日均价
	 */
	private String ma5;
	/**
	 * 10日均价
	 */
	private String ma10;
	/**
	 * 20日均价
	 */
	private String ma20;
	/**
	 * 5日平均交易额
	 */
	private String vma5;
	/**
	 * 10日平均交易额
	 */
	private String vma10;
	/**
	 * 20日平均交易额
	 */
	private String vma20;
	/**
	 * 换手率
	 */
	private String turnoverRate;

	public String getMarketType() {
		return MarketType;
	}

	public void setMarketType(String marketType) {
		MarketType = marketType;
	}

	public String getStockDate() {
		return stockDate;
	}

	public void setStockDate(String stockDate) {
		this.stockDate = stockDate;
	}

	public String getTodayOpeningPrice() {
		return todayOpeningPrice;
	}

	public void setTodayOpeningPrice(String todayOpeningPrice) {
		this.todayOpeningPrice = todayOpeningPrice;
	}

	public String getTodayClosingPrice() {
		return todayClosingPrice;
	}

	public void setTodayClosingPrice(String todayClosingPrice) {
		this.todayClosingPrice = todayClosingPrice;
	}

	public String getYesterdayClosingPrice() {
		return yesterdayClosingPrice;
	}

	public void setYesterdayClosingPrice(String yesterdayClosingPrice) {
		this.yesterdayClosingPrice = yesterdayClosingPrice;
	}

	public String getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(String currentPrice) {
		this.currentPrice = currentPrice;
	}

	public String getTodayHighestPrice() {
		return todayHighestPrice;
	}

	public void setTodayHighestPrice(String todayHighestPrice) {
		this.todayHighestPrice = todayHighestPrice;
	}

	public String getTodayLowestPrice() {
		return todayLowestPrice;
	}

	public void setTodayLowestPrice(String todayLowestPrice) {
		this.todayLowestPrice = todayLowestPrice;
	}

	public String getTodayTurnover() {
		return todayTurnover;
	}

	public void setTodayTurnover(String todayTurnover) {
		this.todayTurnover = todayTurnover;
	}

	public String getChange() {
		return change;
	}

	public void setChange(String change) {
		this.change = change;
	}

	public String getChg() {
		return chg;
	}

	public void setChg(String chg) {
		this.chg = chg;
	}

	public String getMa5() {
		return ma5;
	}

	public void setMa5(String ma5) {
		this.ma5 = ma5;
	}

	public String getMa10() {
		return ma10;
	}

	public void setMa10(String ma10) {
		this.ma10 = ma10;
	}

	public String getMa20() {
		return ma20;
	}

	public void setMa20(String ma20) {
		this.ma20 = ma20;
	}

	public String getVma5() {
		return vma5;
	}

	public void setVma5(String vma5) {
		this.vma5 = vma5;
	}

	public String getVma10() {
		return vma10;
	}

	public void setVma10(String vma10) {
		this.vma10 = vma10;
	}

	public String getVma20() {
		return vma20;
	}

	public void setVma20(String vma20) {
		this.vma20 = vma20;
	}

	public String getTurnoverRate() {
		return turnoverRate;
	}

	public void setTurnoverRate(String turnoverRate) {
		this.turnoverRate = turnoverRate;
	}
	
}
