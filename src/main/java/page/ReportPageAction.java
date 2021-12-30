package page;

import Locators.ReportPageLocator;
import common.BasePage;
import readExcel.readExcel;

public class ReportPageAction {

	private ReportPageLocator rpl = new ReportPageLocator();
	private BasePage bp = new BasePage();

	public void checkReportTab() throws Throwable {
		boolean displayElement = bp.displayElement(rpl.getReportsTab());

		if(displayElement == true)
		{
			System.out.println("Report Tab Visible: "+displayElement);
		}
		else
		{
			System.out.println("Report tab not visible");
		}

	}

	public void clickReportTab() throws Throwable {
		bp.clickElement(rpl.getReportsTab());
	}

	public void PatronTab() throws Throwable {
		bp.ActionClass(rpl.getPatronTab()).perform();
	}

	public void AccountReports() throws Throwable {
		bp.ActionClass(rpl.getAccountReport()).perform();
	}
	public void PatronAccountActivity() throws Throwable {
		bp.ActionClass(rpl.getPatronAccountActivity()).click().perform();
	}
	public void clickReportPatron() throws Throwable {

		bp.ActionClass(rpl.getReportPatronTab()).perform();

		bp.clickElement(rpl.getReportPatronTab());

	}

	public void enterfield() throws Throwable {
		readExcel re = new readExcel();
		
		for(int i=1;i<=re.getPatronSheet().getLastRowNum();i++) {
			bp.ClearTextField(rpl.getLastName());
			bp.SendKeys(rpl.getLastName(), re.getPatronSheet().getRow(i).getCell(5).getStringCellValue());
			bp.ClearTextField(rpl.getFirstName());
			bp.SendKeys(rpl.getFirstName(), re.getPatronSheet().getRow(i).getCell(3).getStringCellValue());
			
			bp.clickElement(rpl.getSearchButton());
			bp.clickElement(rpl.getAddAllButton());
		}
		
	}
	
	
	public void enterLastName() throws Throwable {
		bp.SendKeys(rpl.getLastName(), bp.PatronCellValue(1, 5));
	}
	public void enterFirstName() throws Throwable {
		bp.SendKeys(rpl.getFirstName(), bp.PatronCellValue(1, 3));
	}
	public void clickSearchButton() throws Throwable {
		bp.clickElement(rpl.getSearchButton());
	}
	public void clickAddAllButton() throws Throwable {
		bp.clickElement(rpl.getAddAllButton());
	}
}
