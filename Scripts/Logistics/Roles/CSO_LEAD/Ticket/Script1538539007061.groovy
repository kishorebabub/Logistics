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

'Login Page'
WebUI.takeScreenshot()

WebUI.navigateToUrl('http://uat4.myeg.com.my/logistic/login/')

'Click On Username'
WebUI.setText(findTestObject('Page_MyEG Services  Logistic Report/input_j_username'), 'NISH1931')

WebUI.click(findTestObject('Page_MyEG Services  Logistic Report/input_submit'))

WebUI.takeScreenshot()

'Click On Password'
WebUI.setEncryptedText(findTestObject('Page_MyEG Services  Logistic Report/input_j_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Page_MyEG Services  Logistic Report/input_submit'))

WebUI.takeScreenshot()

'Invalid Username&Password'
WebUI.setText(findTestObject('Page_MyEG Services  Logistic Report/input_j_username'), 'NISH1933')

WebUI.setEncryptedText(findTestObject('Page_MyEG Services  Logistic Report/input_j_password'), 'aeHFOx8jV/A=')

'It should display an error message'
WebUI.click(findTestObject('Page_MyEG Services  Logistic Report/input_submit'))

WebUI.takeScreenshot()

'valid Username&Password'
WebUI.setText(findTestObject('Page_MyEG Services  Logistic Report/input_j_username'), 'NISH1931')

WebUI.setEncryptedText(findTestObject('Page_MyEG Services  Logistic Report/input_j_password'), 'aeHFOx8jV/A=')

'It should display Login Page\r\n'
WebUI.click(findTestObject('Page_MyEG Services  Logistic Report/input_submit'))

WebUI.takeScreenshot()

'Click On Ticket'
WebUI.click(findTestObject('Page_MyEG Services  List of Tickets/a_Ticket'))

WebUI.takeScreenshot()

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

'Click On Reset'
WebUI.click(findTestObject('Page_MyEG Services  List of Tickets/a_reset'))

'All the filled-in data should get erased when clicked on the reset link'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_MyEG Services  List of Tickets/a_current date pending print T'))

WebUI.takeScreenshot()

'Clik On Logout'
WebUI.click(findTestObject('Object Repository/Page_MyEG Services  Insert title he/a_Logout'))

'User should be logged out successfully'
WebUI.takeScreenshot()

WebUI.closeBrowser()

