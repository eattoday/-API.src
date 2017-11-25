package com.metarnet.driver.bean;

import com.metarnet.driver.bean.Column;
import com.metarnet.driver.bean.Condition;
import com.metarnet.driver.bean.Sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * DtGrid使用的  Pager
 */
public class Pager {

    /**
     * 默认每页的记录数
     */
    public static int defaultPageSize = 10;
	
	/**
	 * 是否出错
	 */
	private boolean isSuccess;
	
	/**
	 * 每页显示条数
	 */
	private int pageSize;
	
	/**
	 * 开始记录数
	 */
	private int startRecord;
	
	/**
	 * 当前页数
	 */
	private int nowPage;
	
	/**
	 * 记录总数
	 */
	private int recordCount;
	
	/**
	 * 总页数
	 */
	private int pageCount;
	
	/**
	 * 参数列表
	 */
	private Map<String, Object> parameters;
	
	/**
	 * 快速查询参数列表
	 */
	private Map<String, Object> fastQueryParameters;
	
	/**
	 * 高级查询列表
	 */
	private List<Condition> advanceQueryConditions;
	
	/**
	 * 高级排序列表
	 */
	private List<Sort> advanceQuerySorts;
	
	/**
	 * 显示数据集
	 */
	private List exhibitDatas;
	
	/**
	 * 是否导出：1-是，0-否
	 */
	private boolean isExport;
	
	/**
	 * 导出类型，支持excel、pdf、txt、cvs
	 */
	private String exportType;
	
	/**
	 * 导出文件名
	 */
	private String exportFileName;
	
	/**
	 * 导出列
	 */
	private List<Column> exportColumns;
	
	/**
	 * 全部数据导出
	 */
	private boolean exportAllData;
	
	/**
	 * 导出数据是否已被加工
	 */
	private boolean exportDataIsProcessed;

    /**
     * 排序字段
     */
    private String sort;

    /**
     * 排序方式
     */
    private String direction;

    /**
     * 构造方法，只构造空页
     */
    public Pager() {
        this(0, 0, defaultPageSize, new ArrayList());
    }

    /**
     * 默认构造方法
     *
     * @param start     本页数据在数据库中的起始位置
     * @param totalSize 数据库中总记录条数
     * @param pageSize  本页容量
     * @param data      本页包含的数据
     */
    public Pager(int start, int totalSize, int pageSize, List data) {
        this.pageSize = pageSize;
        this.startRecord = start;
        this.recordCount = totalSize;
        this.exhibitDatas = data;
    }

    /**
     * 获取任一页第一条数据的位置，每页条数使用默认值
     */
    protected static int getStartOfPage(int pageNo) {
        return getStartOfPage(pageNo, defaultPageSize);
    }

    /**
     * 获取任一页第一条数据的位置,startIndex从0开始
     */
    public static int getStartOfPage(int pageNo, int pageSize) {
        return (pageNo - 1) * pageSize;
    }
	
	/**
	 * 导出数据
	 */
	private List<Map<String, Object>> exportDatas;
	
	public boolean getIsSuccess() {
		return isSuccess;
	}

	public void setIsSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getStartRecord() {
		return startRecord;
	}

	public void setStartRecord(int startRecord) {
		this.startRecord = startRecord;
	}

	public int getNowPage() {
		return nowPage;
	}

	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}

	public int getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public Map<String, Object> getParameters() {
		return parameters;
	}

	public void setParameters(Map<String, Object> parameters) {
		this.parameters = parameters;
	}

	public Map<String, Object> getFastQueryParameters() {
		return fastQueryParameters;
	}

	public void setFastQueryParameters(Map<String, Object> fastQueryParameters) {
		this.fastQueryParameters = fastQueryParameters;
	}

	public List<Condition> getAdvanceQueryConditions() {
		return advanceQueryConditions;
	}

	public void setAdvanceQueryConditions(List<Condition> advanceQueryConditions) {
		this.advanceQueryConditions = advanceQueryConditions;
	}

	public List<Sort> getAdvanceQuerySorts() {
		return advanceQuerySorts;
	}

	public void setAdvanceQuerySorts(List<Sort> advanceQuerySorts) {
		this.advanceQuerySorts = advanceQuerySorts;
	}

	public List getExhibitDatas() {
		return exhibitDatas;
	}

	public void setExhibitDatas(List exhibitDatas) {
		this.exhibitDatas = exhibitDatas;
	}

	public boolean getIsExport() {
		return isExport;
	}

	public void setIsExport(boolean isExport) {
		this.isExport = isExport;
	}

	public String getExportType() {
		return exportType;
	}

	public void setExportType(String exportType) {
		this.exportType = exportType;
	}

	public String getExportFileName() {
		return exportFileName;
	}

	public void setExportFileName(String exportFileName) {
		this.exportFileName = exportFileName;
	}

	public List<Column> getExportColumns() {
		return exportColumns;
	}

	public void setExportColumns(List<Column> exportColumns) {
		this.exportColumns = exportColumns;
	}

	public boolean getExportAllData() {
		return exportAllData;
	}

	public void setExportAllData(boolean exportAllData) {
		this.exportAllData = exportAllData;
	}

	public boolean getExportDataIsProcessed() {
		return exportDataIsProcessed;
	}

	public void setExportDataIsProcessed(boolean exportDataIsProcessed) {
		this.exportDataIsProcessed = exportDataIsProcessed;
	}

	public List<Map<String, Object>> getExportDatas() {
		return exportDatas;
	}

	public void setExportDatas(List<Map<String, Object>> exportDatas) {
		this.exportDatas = exportDatas;
	}

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
