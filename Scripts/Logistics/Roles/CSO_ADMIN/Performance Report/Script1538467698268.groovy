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
WebUI.setText(findTestObject('Page_MyEG Services  Logistic Report/input_j_username'), 'AKMA1766')

WebUI.click(findTestObject('Page_MyEG Services  Logistic Report/input_submit'))

WebUI.takeScreenshot()

'Click On Password'
WebUI.setEncryptedText(findTestObject('Page_MyEG Services  Logistic Report/input_j_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Page_MyEG Services  Logistic Report/input_submit'))

WebUI.takeScreenshot()

'Invalid Username&Password'
WebUI.setText(findTestObject('Page_MyEG Services  Logistic Report/input_j_username'), 'AKMA1767')

WebUI.setEncryptedText(findTestObject('Page_MyEG Services  Logistic Report/input_j_password'), 'aeHFOx8jV/A=')

'It should display an error message'
WebUI.click(findTestObject('Page_MyEG Services  Logistic Report/input_submit'))

WebUI.takeScreenshot()

'valid Username&Password'
WebUI.setText(findTestObject('Page_MyEG Services  Logistic Report/input_j_username'), 'AKMA1766')

WebUI.setEncryptedText(findTestObject('Page_MyEG Services  Logistic Report/input_j_password'), 'aeHFOx8jV/A=')

'It should display  Login Page'
WebUI.click(findTestObject('Page_MyEG Services  Logistic Report/input_submit'))

WebUI.takeScreenshot()

'Click on Performance Report'
WebUI.click(findTestObject('Page_MyEG Services  List of Tickets/a_Performance Report'))

WebUI.takeScreenshot()

'Click on LO Performance By Date '
WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/a_LO Performance By Date'))

WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_dojo.from'), '01-Jan-2018')

WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_dojo.to'), '30-Sep-2018')

'Click on \'reset\' option'
WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/a_reset'))

'All the filled-in data should get erased when clicked on the reset link'
WebUI.takeScreenshot()

'without giving any inputs'
WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_dojo.from'), '01-Jan-2018')

WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_dojo.to'), '30-Sep-2018')

'Click on Road Tax  '
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  PERFORMANCE REP/select_-- Please Select --'), 'LK', true)

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

'Click on Insolvency'
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  PERFORMANCE REP/select_-- Please Select --'), 'JM', true)

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

'Click on Immigration'
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  PERFORMANCE REP/select_-- Please Select --'), 'IM', true)

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

'Click on Immigration Maid'
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  PERFORMANCE REP/select_-- Please Select --'), 'MD', true)

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

'Click on Immigration FW'
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  PERFORMANCE REP/select_-- Please Select --'), 'FW', true)

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

'Click on CDL'
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  PERFORMANCE REP/select_-- Please Select --'), 'CL', true)

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

'Click on 1MID'
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  PERFORMANCE REP/select_-- Please Select --'), '1M', true)

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

'Click on Spanco Road Tax'
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  PERFORMANCE REP/select_-- Please Select --'), 'SP', true)

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

'Click on Legalisation'
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  PERFORMANCE REP/select_-- Please Select --'), 'PT', true)

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

'Click on Legalisation Delivery'
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  PERFORMANCE REP/select_-- Please Select --'), 'PTD', true)

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

'Click on Roadtax SS'
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  PERFORMANCE REP/select_-- Please Select --'), 'LKS', true)

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

'Click on JPJ1M'
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  PERFORMANCE REP/select_-- Please Select --'), 'JPJ1M', true)

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

'Click on IMI1M'
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  PERFORMANCE REP/select_-- Please Select --'), 'IMI1M', true)

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

'Click on ETMS\r\n'
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  PERFORMANCE REP/select_-- Please Select --'), 'ET', true)

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/a_Performance Report'))

'Click on  LO Performance By Name'
WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/a_LO Performance By Name'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/select_- Select LO Name -    A_1'), 
    '1942', true)

WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_dojo.from'), '01-Jan-2018')

WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_dojo.to'), '30-Sep-2018')

WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  PERFORMANCE REP/select_-- Please Select --'), 'LK', true)

WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  PERFORMANCE REP/select_-- Please Select --    _1'), '1', true)

'Click on \'reset\' option'
WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/a_reset'))

'All the filled-in data should get erased when clicked on the reset link'
WebUI.takeScreenshot()

'without giving any inputs\r\n'
WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/select_- Select LO Name -    A_1'), 
    '1942', true)

WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_dojo.from'), '01-Jan-2018')

WebUI.setText(findTestObject('Page_MyEG Services  PERFORMANCE REP/input_dojo.to'), '30-Sep-2018')

WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  PERFORMANCE REP/select_-- Please Select --    _1'), '1', true)

'Click on Road Tax  '
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  PERFORMANCE REP/select_-- Please Select --'), 'LK', true)

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

'Click on Insolvency'
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  PERFORMANCE REP/select_-- Please Select --'), 'JM', true)

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

'Click on Immigration'
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  PERFORMANCE REP/select_-- Please Select --'), 'IM', true)

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

'Click on Immigration Maid'
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  PERFORMANCE REP/select_-- Please Select --'), 'MD', true)

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

'Click on Immigration FW'
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  PERFORMANCE REP/select_-- Please Select --'), 'FW', true)

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

'Click on CDL'
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  PERFORMANCE REP/select_-- Please Select --'), 'CL', true)

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

'Click on 1MID'
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  PERFORMANCE REP/select_-- Please Select --'), '1M', true)

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

'Click on Spanco Road Tax'
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  PERFORMANCE REP/select_-- Please Select --'), 'SP', true)

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

'Click on Legalisation'
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  PERFORMANCE REP/select_-- Please Select --'), 'PT', true)

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

'Click on Legalisation Delivery'
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  PERFORMANCE REP/select_-- Please Select --'), 'PTD', true)

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

'Click on Roadtax SS'
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  PERFORMANCE REP/select_-- Please Select --'), 'LKS', true)

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

'Click on JPJ1M'
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  PERFORMANCE REP/select_-- Please Select --'), 'JPJ1M', true)

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

'Click on IMI1M'
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  PERFORMANCE REP/select_-- Please Select --'), 'IMI1M', true)

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

'Click on ETMS\r\n'
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  PERFORMANCE REP/select_-- Please Select --'), 'ET', true)

WebUI.click(findTestObject('Page_MyEG Services  PERFORMANCE REP/input'))

WebUI.takeScreenshot()

'Clik On Logout'
WebUI.click(findTestObject('Object Repository/Page_MyEG Services  Insert title he/a_Logout'))

'User should be logged out successfully'
WebUI.takeScreenshot()

WebUI.closeBrowser()

