import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://uat4.myeg.com.my/logistic/login/')

WebUI.setText(findTestObject('Page_MyEG Services  Logistic Report/input_User Name_j_username'), 'AKMA1766')

WebUI.setEncryptedText(findTestObject('Page_MyEG Services  Logistic Report/input_Password_j_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Page_MyEG Services  Logistic Report/input_Password_submit'))

WebUI.click(findTestObject('Page_MyEG Services  List of Tickets/a_Upload Excelsheet'))

WebUI.click(findTestObject('Page_MyEG Services  List of Tickets/Page_MyEG Services  Insert title he/input_Upload your file_myFile'))

WebUI.uploadFile(findTestObject('input_browse'), 'C:\\Users\\Owner\\Pictures\\Saved Pictures\\TEST.jpg')
//WebUICustomKeyword.uploadFile'(findTestObject('input_browse'), 'D:\\Sample\\Test.xlsx')
