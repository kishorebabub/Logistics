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
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://uat4.myeg.com.my/logistic/login/')

'Click On Username'
WebUI.setText(findTestObject('Page_MyEG Services  Logistic Report/input_j_username'), 'NISH1931')

WebUI.click(findTestObject('Page_MyEG Services  Logistic Report/input_submit'))

WebUI.takeScreenshot()

'Click Password'
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

'Click On Verify Record'
WebUI.click(findTestObject('Page_MyEG Services  List of Tickets/a_Verify Record'))

WebUI.takeScreenshot()

'without giving any inputs'
WebUI.click(findTestObject('Page_MyEG Services  Verify Records/input'))

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  Verify Records/select_- Select Service -'), 'LK', true)

WebUI.setText(findTestObject('Page_MyEG Services  Verify Records/input_dojo.fromdt'), '01-Aug-2018')

WebUI.setText(findTestObject('Page_MyEG Services  Verify Records/input_dojo.todt'), '30-Sep-2018')

WebUI.click(findTestObject('Page_MyEG Services  Verify Records/input'))

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  Verify Records/select_- Select Service -'), 'LKS', true)

WebUI.click(findTestObject('Page_MyEG Services  Verify Records/input'))

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  Verify Records/select_- Select Service -'), 'JM', true)

WebUI.click(findTestObject('Page_MyEG Services  Verify Records/input'))

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  Verify Records/select_- Select Service -'), 'IM', true)

WebUI.click(findTestObject('Page_MyEG Services  Verify Records/input'))

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  Verify Records/select_- Select Service -'), 'MD', true)

WebUI.click(findTestObject('Page_MyEG Services  Verify Records/input'))

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  Verify Records/select_- Select Service -'), 'FW', true)

WebUI.click(findTestObject('Page_MyEG Services  Verify Records/input'))

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  Verify Records/select_- Select Service -'), 'CN', true)

WebUI.click(findTestObject('Page_MyEG Services  Verify Records/input'))

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  Verify Records/select_- Select Service -'), 'CL', true)

WebUI.click(findTestObject('Page_MyEG Services  Verify Records/input'))

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  Verify Records/select_- Select Service -'), '1M', true)

WebUI.click(findTestObject('Page_MyEG Services  Verify Records/input'))

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  Verify Records/select_- Select Service -'), 'SP', true)

WebUI.click(findTestObject('Page_MyEG Services  Verify Records/input'))

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  Verify Records/select_- Select Service -'), 'PK', true)

WebUI.click(findTestObject('Page_MyEG Services  Verify Records/input'))

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  Verify Records/select_- Select Service -'), 'PT', true)

WebUI.click(findTestObject('Page_MyEG Services  Verify Records/input'))

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  Verify Records/select_- Select Service -'), 'PTL', true)

WebUI.click(findTestObject('Page_MyEG Services  Verify Records/input'))

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  Verify Records/select_- Select Service -'), 'JPJ1M', true)

WebUI.click(findTestObject('Page_MyEG Services  Verify Records/input'))

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  Verify Records/select_- Select Service -'), 'IMI1M', true)

WebUI.click(findTestObject('Page_MyEG Services  Verify Records/input'))

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  Verify Records/select_- Select Service -'), 'ET', true)

WebUI.click(findTestObject('Page_MyEG Services  Verify Records/input'))

WebUI.takeScreenshot()

'Click on \'reset\' option\r\n\r\n\r\n'
WebUI.click(findTestObject('Page_MyEG Services  Verify Records/a_reset'))

'All the filled-in data should get erased when clicked on the reset link'
WebUI.takeScreenshot()

'Clik On Logout'
WebUI.click(findTestObject('Object Repository/Page_MyEG Services  Insert title he/a_Logout'))

'User should be logged out successfully'
WebUI.takeScreenshot()

WebUI.closeBrowser()

