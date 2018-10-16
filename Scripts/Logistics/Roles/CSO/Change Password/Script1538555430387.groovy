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

WebUI.setText(findTestObject('Page_MyEG Services  Logistic Report/input_j_username'), 'KISH2008')

WebUI.setEncryptedText(findTestObject('Page_MyEG Services  Logistic Report/input_j_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Page_MyEG Services  Logistic Report/input_submit'))

WebUI.click(findTestObject('Page_MyEG Services  List of Tickets/a_Change Password'))

WebUI.setEncryptedText(findTestObject('Page_MyEG Services  Logistic Report/input_old_password'), 'aeHFOx8jV/A=')

WebUI.setEncryptedText(findTestObject('Page_MyEG Services  Logistic Report/input_new_password'), 'qeJ0sjJnwEs=')

WebUI.setEncryptedText(findTestObject('Page_MyEG Services  Logistic Report/input_renew_password'), 'qeJ0sjJnwEs=')

WebUI.click(findTestObject('Page_MyEG Services  Logistic Report/input_submit'))

WebUI.takeScreenshot()

WebUI.setEncryptedText(findTestObject('Page_MyEG Services  Logistic Report/input_old_password'), 'aeHFOx8jV/A=')

WebUI.setEncryptedText(findTestObject('Page_MyEG Services  Logistic Report/input_new_password'), '1ka0qSGbwju3LdzvQGrSJg==')

WebUI.setEncryptedText(findTestObject('Page_MyEG Services  Logistic Report/input_renew_password'), '1ka0qSGbwju3LdzvQGrSJg==')

WebUI.click(findTestObject('Page_MyEG Services  Logistic Report/input_submit'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_MyEG Services  Logistic Report/a_Logout'))

WebUI.closeBrowser()

