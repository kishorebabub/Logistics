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

'Click On Usename'
WebUI.setText(findTestObject('Object Repository/Page_MyEG Services  Logistic Report/input_j_username (5)'), 'KISH2008')

WebUI.click(findTestObject('Object Repository/Page_MyEG Services  Logistic Report/input_submit (5)'))

WebUI.takeScreenshot()

'Click On Password'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_MyEG Services  Logistic Report/input_j_password (5)'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_MyEG Services  Logistic Report/input_submit (5)'))

WebUI.takeScreenshot()

'Invalid Username&Password\r\n\r\n'
WebUI.setText(findTestObject('Object Repository/Page_MyEG Services  Logistic Report/input_j_username (5)'), 'KISH2009')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_MyEG Services  Logistic Report/input_j_password (5)'), 'aeHFOx8jV/A=')

'It should display an error message'
WebUI.click(findTestObject('Object Repository/Page_MyEG Services  Logistic Report/input_submit (5)'))

WebUI.takeScreenshot()

'valid Username&Password'
WebUI.setText(findTestObject('Object Repository/Page_MyEG Services  Logistic Report/input_j_username (5)'), 'KISH2008')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_MyEG Services  Logistic Report/input_j_password (5)'), 'aeHFOx8jV/A=')

'It should display Login Page'
WebUI.click(findTestObject('Object Repository/Page_MyEG Services  Logistic Report/input_submit (5)'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_MyEG Services  List of Tickets/a_Ticket'))

WebUI.click(findTestObject('Page_MyEG Services  List of Tickets/a_current date pending print T'))

WebUI.click(findTestObject('Page_MyEG Services  List of Tickets/input'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_MyEG Services  List of Tickets/a_reset'))

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  List of Tickets/select_- Select status -     P'), '4', true)

'Click on Road Tax '
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  List of Tickets/select_-- Please Select --'), 'LK', true)

WebUI.click(findTestObject('Page_MyEG Services  List of Tickets/img_dojoComboBox'))

WebUI.click(findTestObject('Page_MyEG Services  List of Tickets/div_ABDUL ASAD ABDUS SAKUR'))

WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  List of Tickets/select_-- Please Select --    _1'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  List of Tickets/select_- Select area -    Air'), 'Bandar Pusat', 
    true)

WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  List of Tickets/select_- Select TM Name -    A'), 'MYEG', 
    true)

WebUI.setText(findTestObject('Page_MyEG Services  List of Tickets/input_dojo.filterGenDate'), '09-Oct-2018')

WebUI.setText(findTestObject('Page_MyEG Services  List of Tickets/input_dojo.filterGenDateto'), '09-Oct-2018')

WebUI.setText(findTestObject('Page_MyEG Services  List of Tickets/input_filterFpostcode'), '46000')

WebUI.setText(findTestObject('Page_MyEG Services  List of Tickets/input_filterTpostcode'), '49000')

WebUI.click(findTestObject('Page_MyEG Services  List of Tickets/input'))

WebUI.takeScreenshot()

'Click on Insolvency'
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  List of Tickets/select_-- Please Select --'), 'JM', true)

WebUI.click(findTestObject('Page_MyEG Services  List of Tickets/input'))

WebUI.takeScreenshot()

'Click on Immigration'
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  List of Tickets/select_-- Please Select --'), 'IM', true)

WebUI.click(findTestObject('Page_MyEG Services  List of Tickets/input'))

WebUI.takeScreenshot()

'Click on Immigration Maid'
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  List of Tickets/select_-- Please Select --'), 'MD', true)

WebUI.click(findTestObject('Page_MyEG Services  List of Tickets/input'))

WebUI.takeScreenshot()

'Click on Immigration FW'
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  List of Tickets/select_-- Please Select --'), 'FW', true)

WebUI.click(findTestObject('Page_MyEG Services  List of Tickets/input'))

WebUI.takeScreenshot()

'Click on CDL'
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  List of Tickets/select_-- Please Select --'), 'CL', true)

WebUI.click(findTestObject('Page_MyEG Services  List of Tickets/input'))

WebUI.takeScreenshot()

'Click on 1MID'
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  List of Tickets/select_-- Please Select --'), '1M', true)

WebUI.click(findTestObject('Page_MyEG Services  List of Tickets/input'))

WebUI.takeScreenshot()

'Click on Spanco Road Tax'
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  List of Tickets/select_-- Please Select --'), 'SP', true)

WebUI.click(findTestObject('Page_MyEG Services  List of Tickets/input'))

WebUI.takeScreenshot()

'Click on Legalisation'
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  List of Tickets/select_-- Please Select --'), 'PT', true)

WebUI.click(findTestObject('Page_MyEG Services  List of Tickets/input'))

WebUI.takeScreenshot()

'Click on Legalisation Delivery'
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  List of Tickets/select_-- Please Select --'), 'PTD', true)

WebUI.click(findTestObject('Page_MyEG Services  List of Tickets/input'))

WebUI.takeScreenshot()

'Click on Roadtax SS'
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  List of Tickets/select_-- Please Select --'), 'LKS', true)

WebUI.click(findTestObject('Page_MyEG Services  List of Tickets/input'))

WebUI.takeScreenshot()

'Click On Pati Letter'
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  List of Tickets/select_-- Please Select --'), 'PTL', true)

WebUI.click(findTestObject('Page_MyEG Services  List of Tickets/input'))

WebUI.takeScreenshot()

'Click on JPJ1M'
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  List of Tickets/select_-- Please Select --'), 'JPJ1M', true)

WebUI.click(findTestObject('Page_MyEG Services  List of Tickets/input'))

WebUI.takeScreenshot()

'Click on IMI1M\r\n'
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  List of Tickets/select_-- Please Select --'), 'IMI1M', true)

WebUI.click(findTestObject('Page_MyEG Services  List of Tickets/input'))

WebUI.takeScreenshot()

'Click on ETMS'
WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  List of Tickets/select_-- Please Select --'), 'ET', true)

WebUI.click(findTestObject('Page_MyEG Services  List of Tickets/input'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Page_MyEG Services  List of Tickets/input_filterFpostcode'), '$%^&&')

WebUI.setText(findTestObject('Page_MyEG Services  List of Tickets/input_filterTpostcode'), '!@#$$')

WebUI.click(findTestObject('Page_MyEG Services  List of Tickets/input'))

WebUI.takeScreenshot()

'Clik On Logout'
WebUI.click(findTestObject('Object Repository/Page_MyEG Services  Insert title he/a_Logout'))

'User should be logged out successfully'
WebUI.takeScreenshot()

WebUI.takeScreenshot()

WebUI.closeBrowser()

