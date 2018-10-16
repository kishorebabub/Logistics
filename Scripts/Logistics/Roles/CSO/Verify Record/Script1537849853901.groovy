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

WebUI.navigateToUrl('http://uat4.myeg.com.my/logistic/login/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_MyEG Services  Logistic Report/input_j_username'), 'KISH2008')

WebUI.setEncryptedText(findTestObject('Page_MyEG Services  Logistic Report/input_j_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Page_MyEG Services  Logistic Report/input_submit'))

WebUI.click(findTestObject('Page_MyEG Services  List of Tickets/a_Verify Record'))

WebUI.setText(findTestObject('Page_MyEG Services  Verify Records/input_docId'), 'adfSDF')

WebUI.setText(findTestObject('Page_MyEG Services  Verify Records/input_plateNum'), 'ssgfsgfsrrg')

WebUI.setText(findTestObject('Page_MyEG Services  Verify Records/input_hpNo'), 'asrgargarg')

WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  Verify Records/select_- Select Service -'), 'LK', true)

WebUI.setText(findTestObject('Page_MyEG Services  Verify Records/input_email'), 'efSGSRGSDDV')

WebUI.setText(findTestObject('Page_MyEG Services  Verify Records/input_dojo.fromdt'), '01-Sep-2018')

WebUI.setText(findTestObject('Page_MyEG Services  Verify Records/input_dojo.todt'), '30-Sep-2018')

WebUI.selectOptionByValue(findTestObject('Page_MyEG Services  Verify Records/select_- Select mode -     Man'), 'manual', 
    true)

WebUI.setText(findTestObject('Page_MyEG Services  Verify Records/input_errorDescr'), 'QEFEFe')

WebUI.setText(findTestObject('Page_MyEG Services  Verify Records/input_hardwareId'), 'effASEF')

WebUI.setText(findTestObject('Page_MyEG Services  Verify Records/input_picName'), 'afAEF')

WebUI.click(findTestObject('Page_MyEG Services  Verify Records/input'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_MyEG Services  Verify Records/a_reset'))

WebUI.takeScreenshot()

WebUI.closeBrowser()

