import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://uat4.myeg.com.my/logistic/login/')

WebUI.setText(findTestObject('Page_MyEG Services  Logistic Report/input_j_username'), 'AKMA1766')

WebUI.setEncryptedText(findTestObject('Page_MyEG Services  Logistic Report/input_j_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Page_MyEG Services  Logistic Report/input_submit'))

WebUI.click(findTestObject('Page_MyEG Services  List of Tickets/a_Ticket'))

WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  List of Tickets/select_- Select status -     P'), '2', true)

WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  List of Tickets/select_-- Please Select --'), 'LK', true)

WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  List of Tickets/select_-- Please Select --    _1'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  List of Tickets/select_- Select area -    Air'), 'Bandar Pusat', 
    true)

WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  List of Tickets/select_- Select TM Name -    A'), 'MYEG', 
    true)

WebUI.setText(findTestObject('Page_MyEG Services  List of Tickets/input_dojo.filterGenDate'), '02-Oct-2018')

WebUI.setText(findTestObject('Page_MyEG Services  List of Tickets/input_dojo.filterGenDateto'), '02-Oct-2018')

WebUI.click(findTestObject('Page_MyEG Services  List of Tickets/input'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_MyEG Services  List of Tickets/a_reset'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_MyEG Services  List of Tickets/a_current date pending print T'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_MyEG Services  List of Tickets/a_Logout'))

