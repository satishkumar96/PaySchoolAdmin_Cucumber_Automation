package Locators;

import common.BasePage;

public class ReportPageLocator {

	private BasePage bp = new BasePage();

	public String getReportsTab() throws Throwable {
		return bp.ViewPatronCellValue(11, 1);
	}

	public String getPatronTab() throws Throwable {
		return bp.ViewPatronCellValue(12, 1);
	}

	public String getAccountReport() throws Throwable {
		return bp.ViewPatronCellValue(13, 1);
	}

	public String getPatronAccountActivity() throws Throwable {
		return bp.ViewPatronCellValue(14, 1);
	}
	public String getReportPatronTab() throws Throwable {
		return bp.ViewPatronCellValue(15, 1);
	}
	public String getPatronID() throws Throwable {
		return bp.ViewPatronCellValue(16, 1);
	}
	public String getLastName() throws Throwable {
		return bp.ViewPatronCellValue(17, 1);
	}
	public String getFirstName() throws Throwable {
		return bp.ViewPatronCellValue(18, 1);
	}
	public String getSearchButton() throws Throwable {
		return bp.ViewPatronCellValue(19, 1);
	}
	public String getAddAllButton() throws Throwable {
		return bp.ViewPatronCellValue(20, 1);
	}
}
