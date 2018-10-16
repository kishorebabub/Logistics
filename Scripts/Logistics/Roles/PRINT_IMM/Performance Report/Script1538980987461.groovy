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

WebUI.setText(findTestObject('Page_MyEG Services  Logistic Report/input_j_username'), 'AJAY1965')

WebUI.click(findTestObject('Page_MyEG Services  Logistic Report/input_submit'))

WebUI.takeScreenshot()

WebUI.setEncryptedText(findTestObject('Page_MyEG Services  Logistic Report/input_j_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Page_MyEG Services  Logistic Report/input_submit'))

WebUI.takeScreenshot()

'Invalid Username&Password'
WebUI.setText(findTestObject('Page_MyEG Services  Logistic Report/input_j_username'), 'AJAY1964')

WebUI.setEncryptedText(findTestObject('Page_MyEG Services  Logistic Report/input_j_password'), 'aeHFOx8jV/A=')

'It should display an error message'
WebUI.click(findTestObject('Page_MyEG Services  Logistic Report/input_submit'))

WebUI.takeScreenshot()

'valid Username&Password'
WebUI.setText(findTestObject('Page_MyEG Services  Logistic Report/input_j_username'), 'AJAY1965')

WebUI.setEncryptedText(findTestObject('Page_MyEG Services  Logistic Report/input_j_password'), 'aeHFOx8jV/A=')

'It should display  Login Page'
WebUI.click(findTestObject('Page_MyEG Services  Logistic Report/input_submit'))

WebUI.takeScreenshot()

'Click on Performance Report'
WebUI.click(findTestObject('Page_MyEG Services  List of Tickets/a_Performance Report'))

WebUI.takeScreenshot()

'Click on LO Performance By Date '
WebUI.click(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/a_LO Performance By Date (1)'))

WebUI.setText(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/input_dojo.from (3)'), '01-Jan-2018')

WebUI.setText(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/input_dojo.to (3)'), '30-Sep-2018')

'Click on \'reset\' option'
WebUI.click(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/a_reset (3)'))

'All the filled-in data should get erased when clicked on the reset link'
WebUI.takeScreenshot()

'without giving any inputs'
WebUI.click(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/input (3)'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/input_dojo.from (3)'), '01-Jan-2018')

WebUI.setText(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/input_dojo.to (3)'), '30-Sep-2018')

'Click on Road Tax  '
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/select_-- Please Select -- (1)'), 
    'LK', true)

WebUI.click(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/input (3)'))

WebUI.takeScreenshot()

'Click on Insolvency'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/select_-- Please Select -- (1)'), 
    'JM', true)

WebUI.click(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/input (3)'))

WebUI.takeScreenshot()

'Click on Immigration'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/select_-- Please Select -- (1)'), 
    'IM', true)

WebUI.click(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/input (3)'))

WebUI.takeScreenshot()

'Click on Immigration Maid'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/select_-- Please Select -- (1)'), 
    'MD', true)

WebUI.click(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/input (3)'))

WebUI.takeScreenshot()

'Click on Immigration FW'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/select_-- Please Select -- (1)'), 
    'FW', true)

WebUI.click(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/input (3)'))

WebUI.takeScreenshot()

'Click on CDL'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/select_-- Please Select -- (1)'), 
    'CL', true)

WebUI.click(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/input (3)'))

WebUI.takeScreenshot()

'Click on 1MID'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/select_-- Please Select -- (1)'), 
    '1M', true)

WebUI.click(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/input (3)'))

WebUI.takeScreenshot()

'Click on Spanco Road Tax'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/select_-- Please Select -- (1)'), 
    'SP', true)

WebUI.click(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/input (3)'))

WebUI.takeScreenshot()

'Click on Legalisation'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/select_-- Please Select -- (1)'), 
    'PT', true)

WebUI.click(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/input (3)'))

WebUI.takeScreenshot()

'Click on Legalisation Delivery'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/select_-- Please Select -- (1)'), 
    'PTD', true)

WebUI.click(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/input (3)'))

WebUI.takeScreenshot()

'Click on Roadtax SS'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/select_-- Please Select -- (1)'), 
    'LKS', true)

WebUI.click(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/input (3)'))

WebUI.takeScreenshot()

'Click on JPJ1M'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/select_-- Please Select -- (1)'), 
    'JPJ1M', true)

WebUI.click(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/input (3)'))

WebUI.takeScreenshot()

'Click on IMI1M'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/select_-- Please Select -- (1)'), 
    'IMI1M', true)

WebUI.click(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/input (3)'))

WebUI.takeScreenshot()

'Click on ETMS\r\n'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/select_-- Please Select -- (1)'), 
    'ET', true)

WebUI.click(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/input (3)'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/a_Performance Report (1)'))

'Click on  LO Performance By Name'
WebUI.click(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/a_LO Performance By Name (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/select_- Select LO Name -    A_1'), 
    '1942', true)

WebUI.setText(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/input_dojo.from (3)'), '01-Jan-2018')

WebUI.setText(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/input_dojo.to (3)'), '30-Sep-2018')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/select_-- Please Select -- (1)'), 
    'LK', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/select_-- Please Select --    _1 (1)'), 
    '1', true)

'Click on \'reset\' option'
WebUI.click(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/a_reset (3)'))

'All the filled-in data should get erased when clicked on the reset link'
WebUI.takeScreenshot()

'without giving any inputs\r\n'
WebUI.click(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/input (3)'))

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/select_- Select LO Name -    A_1'), 
    '1942', true)

WebUI.setText(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/input_dojo.from (3)'), '01-Jan-2018')

WebUI.setText(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/input_dojo.to (3)'), '30-Sep-2018')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/select_-- Please Select --    _1 (1)'), 
    '1', true)

'Click on Road Tax  '
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/select_-- Please Select -- (1)'), 
    'LK', true)

WebUI.click(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/input (3)'))

WebUI.takeScreenshot()

'Click on Insolvency'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/select_-- Please Select -- (1)'), 
    'JM', true)

WebUI.click(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/input (3)'))

WebUI.takeScreenshot()

'Click on Immigration'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/select_-- Please Select -- (1)'), 
    'IM', true)

WebUI.click(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/input (3)'))

WebUI.takeScreenshot()

'Click on Immigration Maid'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/select_-- Please Select -- (1)'), 
    'MD', true)

WebUI.click(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/input (3)'))

WebUI.takeScreenshot()

'Click on Immigration FW'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/select_-- Please Select -- (1)'), 
    'FW', true)

WebUI.click(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/input (3)'))

WebUI.takeScreenshot()

'Click on CDL'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/select_-- Please Select -- (1)'), 
    'CL', true)

WebUI.click(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/input (3)'))

WebUI.takeScreenshot()

'Click on 1MID'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/select_-- Please Select -- (1)'), 
    '1M', true)

WebUI.click(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/input (3)'))

WebUI.takeScreenshot()

'Click on Spanco Road Tax'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/select_-- Please Select -- (1)'), 
    'SP', true)

WebUI.click(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/input (3)'))

WebUI.takeScreenshot()

'Click on Legalisation'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/select_-- Please Select -- (1)'), 
    'PT', true)

WebUI.click(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/input (3)'))

WebUI.takeScreenshot()

'Click on Legalisation Delivery'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/select_-- Please Select -- (1)'), 
    'PTD', true)

WebUI.click(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/input (3)'))

WebUI.takeScreenshot()

'Click on Roadtax SS'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/select_-- Please Select -- (1)'), 
    'LKS', true)

WebUI.click(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/input (3)'))

WebUI.takeScreenshot()

'Click on JPJ1M'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/select_-- Please Select -- (1)'), 
    'JPJ1M', true)

WebUI.click(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/input (3)'))

WebUI.takeScreenshot()

'Click on IMI1M'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/select_-- Please Select -- (1)'), 
    'IMI1M', true)

WebUI.click(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/input (3)'))

WebUI.takeScreenshot()

'Click on ETMS\r\n'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/select_-- Please Select -- (1)'), 
    'ET', true)

WebUI.click(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/input (3)'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_MyEG Services  PERFORMANCE REP/a_Logout (2)'))

WebUI.takeScreenshot()

WebUI.closeBrowser()

