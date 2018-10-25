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

'Click On Username'
WebUI.setText(findTestObject('Page_MyEG Services  Logistic Report/input_j_username'), 'AGENT')

WebUI.click(findTestObject('Page_MyEG Services  Logistic Report/input_submit'))

WebUI.takeScreenshot()

'Click On Password'
WebUI.setEncryptedText(findTestObject('Page_MyEG Services  Logistic Report/input_j_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Page_MyEG Services  Logistic Report/input_submit'))

WebUI.takeScreenshot()

'Invalid Username&Password\r\n'
WebUI.setText(findTestObject('Page_MyEG Services  Logistic Report/input_j_username'), 'AGENT1234')

WebUI.setEncryptedText(findTestObject('Page_MyEG Services  Logistic Report/input_j_password'), 'aeHFOx8jV/A=')

'It should display an error message'
WebUI.click(findTestObject('Page_MyEG Services  Logistic Report/input_submit'))

WebUI.takeScreenshot()

'valid Username&Password\r\n'
WebUI.setText(findTestObject('Page_MyEG Services  Logistic Report/input_j_username'), 'AGENT')

WebUI.setEncryptedText(findTestObject('Page_MyEG Services  Logistic Report/input_j_password'), 'aeHFOx8jV/A=')

'It should display login page'
WebUI.click(findTestObject('Page_MyEG Services  Logistic Report/input_submit'))

WebUI.takeScreenshot()

'Click on Immigration Report'
WebUI.click(findTestObject('Page_MyEG Services  List of Tickets/a_Immigration Report'))

WebUI.takeScreenshot()

'Click on Immigration Printing Assign Report  '
WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/a_Immigration Printing Assign'))

WebUI.takeScreenshot()

'Click on \'reset\' option\r\n\r\n'
WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/a_reset'))

'All the filled-in data should get erased when clicked on the reset link'
WebUI.takeScreenshot()

'without giving any inputs'
WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

'Enter only \'Postcodes\' '
WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_pcstart'), '46000')

WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_pcend'), '47000')

'Should display an error message'
WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_dojo.from'), '30-Sep-2018')

WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_pcstart'), '46000')

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_pcend'), '47000')

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_pcstart'), '##$$%')

WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_pcend'), '&**&^')

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_pcstart'), '46000')

WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_pcend'), '47000')

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

'Click on Immigration Report'
WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/a_Immigration Report'))

'Click on Immigration Delivery performance Report_FW  '
WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/a_Immigration Delivery perform'))

WebUI.takeScreenshot()

'Click on \'reset\' option\r\n'
WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/a_reset'))

'All the filled-in data should get erased when clicked on the reset link'
WebUI.takeScreenshot()

'without giving any inputs'
WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

'Enter only \'Postcodes\' '
WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_pcstart'), '46000')

WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_pcend'), '47000')

'Should display an error message'
WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

'date range more than one month '
WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_dojo.from'), '01-Aug-2018')

WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_dojo.to'), '30-Sep-2018')

WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_pcstart'), '46000')

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.acceptAlert()

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_dojo.from'), '01-Aug-2018')

WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_dojo.to'), '30-Aug-2018')

WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_pcstart'), '46000')

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_pcend'), '49000')

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_pcstart'), '46000')

WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_pcend'), '49000')

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_pcstart'), '#$%^&')

WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_pcend'), '@##$%')

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

'Click on Immigration Report'
WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/a_Immigration Report'))

'Click on Immigration Delivery performance Report_MD       '
WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/a_Immigration Delivery perform_1'))

WebUI.takeScreenshot()

'Click on \'reset\' option'
WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/a_reset'))

'All the filled-in data should get erased when clicked on the reset link'
WebUI.takeScreenshot()

'without giving any inputs'
WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

'Enter only \'Postcodes\' '
WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_pcstart'), '46000')

WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_pcend'), '47000')

'Should display an error message'
WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

'date range more than one month '
WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_dojo.from'), '01-Aug-2018')

WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_dojo.to'), '30-Sep-2018')

WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_pcstart'), '46000')

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.acceptAlert()

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_dojo.from'), '01-Sep-2018')

WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_dojo.to'), '30-Sep-2018')

WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_pcstart'), '46000')

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_pcend'), '49000')

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_pcstart'), '46000')

WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_pcend'), '49000')

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_pcstart'), '%^^%%')

WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_pcend'), '$%^&&')

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

'Clik On Logout'
WebUI.click(findTestObject('Object Repository/Page_MyEG Services  Insert title he/a_Logout'))

'User should be logged out successfully'
WebUI.takeScreenshot()

WebUI.closeBrowser()

